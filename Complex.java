import java.util.*;

class Complex {
    double real;
    double imaginary;

    Complex() {
        real = 0.0;
        imaginary = 0.0;
    }

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void add(Complex c1, Complex c2) {
        System.out.println((c1.real + c2.real) + " " + (c1.imaginary + c2.imaginary) + "i");
    }

    void sub(Complex c1, Complex c2) {
        System.out.println((c1.real - c2.real) + " " + (c1.imaginary - c2.imaginary) + "i");
    }

    void mul(Complex c1, Complex c2) {
        System.out.println(((c1.real * c2.real) - (c1.imaginary * c2.imaginary)) + "+" + ((c1.real * c2.imaginary) + (c1.imaginary * c2.real)) + "i");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real and imaginary part of 1st complex no.");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        Complex c1 = new Complex(a, b);
        System.out.println("Enter real and imaginary part of 2nd complex no.");
        a = sc.nextDouble();
        b = sc.nextDouble();
        Complex c2 = new Complex(a, b);

        Complex calc = new Complex();

        calc.add(c1, c2);
        calc.sub(c1, c2);
        calc.mul(c1, c2);
    }
}
