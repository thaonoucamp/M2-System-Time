import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a : ");
        double a = sc.nextDouble();

        System.out.println("b : ");
        double b = sc.nextDouble();

        System.out.println("c : ");
        double c = sc.nextDouble();

        if (a != 0) {
            double solution = -b / a;
            System.out.printf("The solution is : %f ", solution);
        } else {
            if (b == 0) {
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution");
            }
        }


    }
}
