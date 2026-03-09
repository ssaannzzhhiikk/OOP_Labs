package Lab2.problem5;

public class PhDStudent extends Person {
    private String major;
    private String researchTopic;

    public PhDStudent(String name, int age, String major, String researchTopic) {
        super(name, age);
        this.major = major;
        this.researchTopic = researchTopic;
    }

    @Override
    public void assignPet(Animal pet) {
        if (pet instanceof Dog) {
            System.out.println("PhD students cannot have dogs — too busy with research!");
            return;
        }
        super.assignPet(pet);
    }

    public String getMajor() { return major; }
    public String getResearchTopic() { return researchTopic; }

    @Override
    public String getOccupation() {
        return "PhD Student (" + major + ", research: " + researchTopic + ")";
    }
}
