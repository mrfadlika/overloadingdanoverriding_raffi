class Calculator {
    int calculate(int a, int b) {
        return a + b;
    }

    int calculate(int a, int b, int c) {
        return a + b + c;
    }

    double calculate(double a, double b) {
        return a * b;
    }
    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan");
            return 0;
        }
        return a / b;
    }
}

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of two integers: " + calc.calculate(5, 10));
        System.out.println("Sum of three integers: " + calc.calculate(5, 10, 15));
        System.out.println("Multiplication of two doubles: " + calc.calculate(5.5, 4.5));

        //anak baru dipisah dlu, mau di ospek wkwkwk
        System.out.println("Division of two doubles: " + calc.divide(10.0, 2.0));
    }
}