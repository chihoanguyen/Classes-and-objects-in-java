import java.util.Scanner;
public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a);
    }

    public class RootsEquation {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a: ");
            double a = sc.nextDouble();
            System.out.print("Enter b: ");
            double b = sc.nextDouble();
            System.out.print("Enter c: ");
            double c = sc.nextDouble();
            QuadraticEquation equation = new QuadraticEquation(a, b, c);
            double delta = equation.getDiscriminant();
            if (delta > 0) {
                System.out.println("Equation has 2 roots");
                System.out.println("Root 1 is: " + equation.getRoot1());
                System.out.println("Root 2 is: " + equation.getRoot2());
            } else if (delta == 0) {
                System.out.println("Equation has 1 root: " + equation.getRoot1());
            } else System.out.println("The equation has no root");
        }
    }
}
