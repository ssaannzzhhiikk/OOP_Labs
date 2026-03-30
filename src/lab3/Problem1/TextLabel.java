package lab3.Problem1;

public class TextLabel implements Drawable {
    private String text;

    public TextLabel(String text) {
        this.text = text;
    }

    @Override
    public void draw() {
        System.out.println("Rendering label: \"" + text + "\"");
    }
}
