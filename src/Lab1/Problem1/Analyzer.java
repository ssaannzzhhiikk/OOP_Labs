package Lab1.Problem1;


import java.util.Scanner;
public class Analyzer {
    public static void main(String[] args) {


        Data data = new Data();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number, enter Q to exit");
            String input = sc.nextLine();

            if(input.equals("Q")){
                System.out.println("The average: "+data.getAverage());
                System.out.println("The max: "+data.getMax());
                sc.close();
                break;
            }

            double san=Double.parseDouble(input);
            data.addValue(san);

        }
    }

}
