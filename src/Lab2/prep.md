# Lab 2 Defence Preparation

Let me walk you through each problem so you truly understand what's going on, not just what the code does.

---

## 🧠 Core Concepts You Must Know First

Before anything, make sure you can define these confidently:

**Abstraction** — hiding implementation details, showing only what's necessary. An abstract class cannot be instantiated — it's a "blueprint."

**Inheritance** — a child class gets all fields and methods of the parent. Use `extends`.

**Polymorphism** — one interface, many forms. You can write `Shape3D s = new Cylinder(...)` and call `s.volume()` — Java figures out at runtime which version to run. This is called **dynamic dispatch**.

**Abstract method** — declared but not implemented in the parent. Every subclass *must* implement it or be abstract itself.

---

## Problem 1a — 3D Shapes

### What it does
`Shape3D` is an abstract class with two abstract methods: `volume()` and `surfaceArea()`. Three classes extend it: `Cylinder`, `Sphere`, `Cube` — each implementing their own math.

### Key formulas to know
| Shape | Volume | Surface Area |
|---|---|---|
| Cylinder | π·r²·h | 2π·r·(r+h) |
| Sphere | (4/3)·π·r³ | 4·π·r² |
| Cube | s³ | 6·s² |

### Why abstract class and not interface?
Because an abstract class can have **fields and constructors**, while an interface (before Java 8) cannot. Here all shapes might share common data in the future.

### Likely questions
- *"Why is Shape3D abstract?"* — Because a "generic 3D shape" has no meaningful volume formula on its own. It only makes sense for specific shapes.
- *"Can you instantiate Shape3D?"* — No. `new Shape3D()` gives a compile error.
- *"What is `@Override`?"* — It tells the compiler "I'm intentionally overriding a parent method." It catches typos — if you write `voume()` by mistake, the compiler warns you.

---

## Problem 1b — Library System

### What it does
`LibraryItem` is abstract with common fields: `title`, `author`, `publicationYear`. `Book` extends it and adds `numberOfPages` and `isbn`. The abstract method `getItemType()` forces each subclass to identify itself.

### Why is `getItemType()` abstract?
Because every library item type knows its own name — a Book says "Book", a DVD says "DVD". The parent can't know this in advance.

### Constructor chaining — `super()`
```java
public Book(String title, String author, int year, int pages, String isbn) {
    super(title, author, year); // calls LibraryItem's constructor
    this.numberOfPages = pages;
}
```
The `super()` call **must be the first line** in the subclass constructor. It initializes the parent's private fields which `Book` can't access directly.

### Likely questions
- *"Why are the fields in LibraryItem private and not protected?"* — Encapsulation. Even subclasses shouldn't directly touch them — they use getters.
- *"What's the difference between private and protected?"* — `private` = only this class. `protected` = this class + subclasses + same package.
- *"Why use `super()` in the constructor?"* — The parent class has private fields. The only way to initialize them is through the parent's constructor.

---

## Problem 1c — equals() and hashCode()

### What it does
`Vehicle` (brand, year) is the parent. `Car` extends it and adds `licensePlate`. Both override `equals()` and `hashCode()`. A `HashSet` is used to prove duplicates are rejected.

### Why override both — never just one?
This is a **contract** in Java:
- If two objects are **equal**, they **must** have the same hash code.
- A `HashSet` first checks `hashCode()` to find the bucket, then calls `equals()` to confirm. If you override only `equals()`, the HashSet won't work correctly.

### How equals() works step by step
```java
if (this == o) return true;          // same reference? definitely equal
if (!(o instanceof Vehicle)) return false;  // wrong type? not equal
Vehicle v = (Vehicle) o;             // safe cast
return year == v.year && Objects.equals(brand, v.brand); // compare fields
```

### Why `Objects.hash()` and `Objects.equals()`?
They handle `null` safely. `"Toyota".equals(null)` throws an exception. `Objects.equals("Toyota", null)` returns false safely.

### Likely questions
- *"What happens if you only override equals but not hashCode?"* — Two equal objects might end up in different buckets in a HashSet, so duplicates won't be detected.
- *"Why check `this == o` first?"* — Performance shortcut. An object is always equal to itself.
- *"What is `instanceof`?"* — Checks if an object is an instance of a given class or its subclasses.

---

## Problem 2 — Chess Pieces

### What it does
`Piece` is abstract with a `Position` field and abstract method `isLegalMove(Position b)`. Six subclasses implement their movement rules.

### Movement rules to memorize

**Rook** — same row OR same column:
```java
return position.getRow() == b.getRow() || position.getCol() == b.getCol();
```

**Bishop** — diagonal means row difference equals column difference:
```java
int rowDiff = Math.abs(b.getRow() - position.getRow());
int colDiff = Math.abs(b.getCol() - position.getCol());
return rowDiff == colDiff && rowDiff != 0;
```

**Queen** — Rook + Bishop combined (straight or diagonal).

**King** — at most 1 step in any direction:
```java
return rowDiff <= 1 && colDiff <= 1 && (rowDiff + colDiff > 0);
```
The last condition prevents staying in place (0,0 move).

**Knight** — L-shape: one side 2, other side 1:
```java
return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);
```

**Pawn** — most complex: direction depends on color, initial double move, diagonal capture.

### Why is `Position` a separate class?
Good OOP design. A position is a real concept with its own data (row, col). Passing two ints everywhere is messy and error-prone.

### Likely questions
- *"Why is `isLegalMove` abstract?"* — Every piece moves differently. There's no general rule for all pieces.
- *"Why does Pawn need to know its color (`isWhite`)?"* — White pawns move upward (row+1), black pawns move downward (row-1). Direction depends on color.
- *"What does `Math.abs()` do here?"* — Gets the absolute difference, so we don't care about direction when checking diagonals.

---

## Problem 3 — Bank Account System

### What it does
`Account` is the base class with `deposit()`, `withdraw()`, `transfer()`. `SavingsAccount` adds interest. `CheckingAccount` counts transactions and deducts a fee after 3 free ones. `Bank` holds a `Vector` of accounts and processes them with `update()`.

### Why `Vector` and not `ArrayList`?
The lab specifically says `Vector`. Both work similarly, but `Vector` is **synchronized** (thread-safe) — all its methods are `synchronized`, meaning only one thread can access it at a time. `ArrayList` is not thread-safe but faster in single-threaded apps.

### The `final` method — `print()`
```java
public final void print() {
    System.out.println(toString()); // calls overridden toString()
}
```
`final` means **no subclass can override this method**. The professor designed it so subclasses customize `toString()` instead. This is a good design pattern — one entry point for printing.

### Polymorphism in `Bank.update()`
```java
if (account instanceof SavingsAccount) {
    ((SavingsAccount) account).addInterest();
} else if (account instanceof CheckingAccount) {
    ((CheckingAccount) account).deductFee();
}
```
The `Vector<Account>` holds mixed types. At runtime, `instanceof` checks the real type and we cast down to call the specific method.

### Likely questions
- *"Why override `toString()` instead of making a new print method?"* — Because `toString()` is already called automatically in many places (like `System.out.println(account)`). It's a well-known Java convention.
- *"What is downcasting?"* — Casting a parent reference to a child type: `(SavingsAccount) account`. You need `instanceof` check first or you risk a `ClassCastException`.
- *"What if someone withdraws more than their balance?"* — Our `withdraw()` checks `sum <= balance` and prints an error message instead of allowing negative balance.

---

## Problem 4 — Electrical Circuit System

### What it does
`Circuit` is abstract with `getResistance()`, `getPotentialDiff()`, `applyPotentialDiff()`. Three subclasses: `Resistor` (single component), `Series` (two circuits in series), `Parallel` (two circuits in parallel). This is a **Composite design pattern** — circuits can be nested inside other circuits.

### Physics to know
- **Ohm's Law**: `I = V / R` (Current = Voltage / Resistance)
- **Power**: `P = V² / R`
- **Series resistance**: `R_total = R1 + R2`
- **Parallel resistance**: `1/R_total = 1/R1 + 1/R2`

### How voltage distributes
- **Parallel**: Both branches get the *same* voltage as the whole circuit.
- **Series**: Voltage splits proportionally — each resistor gets `V = I × R` where I is the shared current.

### The example circuit — know this!
```
a(3Ω) + b(3Ω) = f: Series → 6Ω
c(6Ω) || d(3Ω) = g: Parallel → 2Ω
g(2Ω) + e(2Ω) = h: Series → 4Ω
h(4Ω) || f(6Ω) = circuit: Parallel → 2.4Ω
```

### Why is this the Composite Pattern?
`Series` and `Parallel` hold references to `Circuit` objects — which could themselves be `Series` or `Parallel`. You can nest them infinitely. The client code treats a complex nested circuit exactly like a single resistor.

### Likely questions
- *"Why make `getPower()` and `getCurrent()` non-abstract in the parent?"* — Because they use `getResistance()` and `getPotentialDiff()` which subclasses implement. So the formula works for all types without repeating code.
- *"What's the resistance of two 6Ω resistors in parallel?"* — `1/(1/6 + 1/6) = 1/(2/6) = 3Ω`.
- *"Why call `applyPotentialDiff()` recursively?"* — Because nested components need to know their voltage to compute current and power correctly.

---

## Problem 5 — Pet Management System

### What it does
The biggest problem. `Person` (abstract) → `Employee`, `Student`, `PhDStudent`. `Animal` (abstract) → `Cat`, `Dog`, `Bird`, `Fish`. `PersonRegistry` manages a list. Key logic: vacation transfer of pets, and PhDStudent cannot have a Dog.

### The PhD restriction — two layers
Layer 1 — `PhDStudent.assignPet()` rejects Dogs:
```java
@Override
public void assignPet(Animal pet) {
    if (pet instanceof Dog) {
        System.out.println("PhD students cannot have dogs!");
        return;
    }
    super.assignPet(pet); // only reaches here for Cat, Bird, Fish
}
```
Layer 2 — `Person.leavePetWith()` also checks:
```java
if (other instanceof PhDStudent && pet instanceof Dog) {
    System.out.println("Cannot leave a Dog with a PhD student!");
    return;
}
```
Both layers are needed. The first blocks direct assignment. The second blocks transfer during vacation.

### Vacation logic flow
```
john.leavePetWith(alice)
  → checks john has a pet ✓
  → checks alice is not PhDStudent with a Dog ✓
  → checks alice doesn't already have a pet ✓
  → alice.assignPet(john's pet)
  → john.removePet()

john.retrievePetFrom(alice)
  → checks alice has a pet ✓
  → john.assignPet(alice's pet)
  → alice.removePet()
```

### equals() and hashCode() in Person
Two people are equal if they have the same name AND age. This means you can safely add Person objects to a `HashSet` without duplicates.

### Likely questions
- *"Why is `getOccupation()` abstract?"* — Every person type has a different occupation description. The parent can't know what it is.
- *"Why does PhDStudent override `assignPet()` instead of putting the check in Person?"* — Because the restriction is specific to PhDStudent. Other Person types have no such restriction. Putting it in `Person` would violate the principle of not giving every class a rule that only applies to one.
- *"What if Alice already has a pet when John tries to leave his?"* — The system prints a message and does nothing. We check `other.hasPet()` before the transfer.
- *"What design principle does this system follow?"* — **Single Responsibility** (each class has one job), **Open/Closed** (open to extend with new animal types, closed for modification).

---

## 🎯 Golden Rules for Your Defence

1. **Always explain WHY**, not just what. Don't say "this method returns the resistance" — say "this is abstract because every circuit type computes resistance differently."

2. **Know your terminology**: abstract class, override, polymorphism, encapsulation, inheritance, casting, instanceof.

3. **Be ready to trace through examples** — the professor may point at a line and ask what happens.

4. **If you don't know something**, say "I'd need to think about that" rather than guessing wrong. Professors respect honesty.

5. **The most likely trick question**: *"What's the difference between an abstract class and an interface?"*
    - Abstract class: can have fields, constructors, concrete methods, only one inheritance allowed
    - Interface: no fields (only constants), no constructors, a class can implement many interfaces

Good luck with your defence! 🚀