class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    int multiply(int a, int b) {
        return a * b;
    }
}

public class MainCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int hasil1 = calc.add(5, 3);
        System.out.println("Hasil dari 5 + 3 adalah " + hasil1);

        int hasil2 = calc.add(5, 3, 2);
        System.out.println("Hasil dari 5 + 3 + 2 adalah " + hasil2);

        int hasil3 = calc.multiply(5, 3);
        System.out.println("Hasil dari 5 * 3 adalah " + hasil3);
    }
}
