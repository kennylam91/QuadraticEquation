public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * a);
    }

    public String getRoot() {
        if (this.getDiscriminant() == 0) return "1 root is " + this.getRoot1();
        else if (this.getDiscriminant() > 0) return "2 roots are " + this.getRoot1() + "and " + this.getRoot2();
        else return "No root";

    }
}
