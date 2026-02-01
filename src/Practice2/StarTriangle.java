package Practice2;

public class StarTriangle {
    private final int width;

    public StarTriangle(int width) {
        this.width = width;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int y = 1; y <= width; y++){
            for(int x = 1; x <= y; x++){
                sb.append("[*]");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        StarTriangle s = new StarTriangle(5);
        System.out.println(s.toString());
    }
}
