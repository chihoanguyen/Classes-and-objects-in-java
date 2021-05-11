import java.util.Scanner;
public class PTbac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = sc.nextDouble();
        System.out.println("Enter b:");
        double b = sc.nextDouble();
        System.out.println("Enter c:");
        double c = sc.nextDouble();
        QuadraticEquation z = new QuadraticEquation(a,b,c);
        if (z.getDiscriminant()<0){
            System.out.println( "The equation has no roots");
        }else if (z.getDiscriminant()==0){
            System.out.println("The equation has one root:" + z.getRoot1());
        }else {
            System.out.println("The equation has two roots:");
            System.out.println("Root1: " + z.getRoot1());
            System.out.println("Root2: " + z.getRoot2());
        }
    }

    public static class QuadraticEquation {
        double a, b, c;
        public QuadraticEquation() {
        }
        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }

        public double getDiscriminant() {
            return b * b - 4 * a * c;
        }

        public double getRoot1() {
            return ((-b + Math.sqrt(this.getDiscriminant())) / (2 * a));
        }

        public double getRoot2() {
            return ((-b - Math.sqrt(this.getDiscriminant())) / (2 * a));
        }
    }
}
