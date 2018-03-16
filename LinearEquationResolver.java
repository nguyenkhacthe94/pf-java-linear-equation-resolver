import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        System.out.print("a: ");
        double a = input.nextDouble();
        System.out.print("b: ");
        double b = input.nextDouble();

        if (a == 0) {
            if (b == 0) System.out.println("Equation has countless solutions.");
            else System.out.println("Equation has no solution.");
        } else {
            double x = -b / a;
            System.out.println("Equation has one solution: " + x);
        }
    }
}
