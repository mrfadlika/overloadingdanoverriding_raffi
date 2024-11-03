class kelasCalculatorKu {
    protected int x1, x2;
    protected double y1, y2;

    public kelasCalculatorKu(int x1, int x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public int ambilkiHasilIntegernya() {
        return 0;
    }

    public double ambilkiHasilDoublenya() {
        return 0.0;
    }
}

class Penjumlahan extends kelasCalculatorKu {

    public Penjumlahan(int x1, int x2) {
        super(x1, x2, 0, 0);
    }

    public Penjumlahan(double y1, double y2, boolean isDouble) {
        super(0, 0, y1, y2);
    }

    @Override
    public int ambilkiHasilIntegernya() {
        return x1 + x2;
    }

    @Override
    public double ambilkiHasilDoublenya() {
        return y1 + y2;
    }
}

class Pengurangan extends kelasCalculatorKu {

    public Pengurangan(int x1, int x2) {
        super(x1, x2, 0, 0);
    }

    public Pengurangan(double y1, double y2, boolean isDouble) {
        super(0, 0, y1, y2);
    }

    @Override
    public int ambilkiHasilIntegernya() {
        return x1 - x2;
    }

    @Override
    public double ambilkiHasilDoublenya() {
        return y1 - y2;
    }
}

class Perkalian extends kelasCalculatorKu {

    public Perkalian(int x1, int x2) {
        super(x1, x2, 0, 0);
    }

    public Perkalian(double y1, double y2, boolean isDouble) {
        super(0, 0, y1, y2);
    }

    @Override
    public int ambilkiHasilIntegernya() {
        return x1 * x2;
    }

    @Override
    public double ambilkiHasilDoublenya() {
        return y1 * y2;
    }
}

class Pembagian extends kelasCalculatorKu {

    public Pembagian(int x1, int x2) {
        super(x1, x2, 0, 0);
    }

    public Pembagian(double y1, double y2, boolean isDouble) {
        super(0, 0, y1, y2);
    }

    @Override
    public int ambilkiHasilIntegernya() {
        if(x2 != 0) {
            return x1 / x2;
        } else {
            return 0;
        }
    }

    @Override
    public double ambilkiHasilDoublenya() {
        if (y2 != 0) {
            return y1 / y2;
        } else {
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Penjumlahan addInt = new Penjumlahan(10, 5);
        System.out.println("Hasil Penjumlahan Integer: " + addInt.ambilkiHasilIntegernya());

        Penjumlahan addDouble = new Penjumlahan(2.5, 3.5, true);
        System.out.println("Hasil Penjumlahan Double: " + addDouble.ambilkiHasilDoublenya());

        Pengurangan subsInt = new Pengurangan(10, 5);
        System.out.println("\nHasil Pengurangan Integer: " + subsInt.ambilkiHasilIntegernya());

        Pengurangan subsDouble = new Pengurangan(10.1, 5.6, true);
        System.out.println("Hasil Pengurangan Double: " + subsDouble.ambilkiHasilDoublenya());

        Perkalian mulInt = new Perkalian(10, 5);
        System.out.println("\nHasil Perkalian Integer: " + mulInt.ambilkiHasilIntegernya());

        Perkalian mulDouble = new Perkalian(17.1, 1.9, true);
        System.out.println("Hasil Perkalian Double: " + mulDouble.ambilkiHasilDoublenya());

        Pembagian devInt = new Pembagian(10, 5);
        System.out.println("\nHasil Pembagian Integer: " + devInt.ambilkiHasilIntegernya());

        Pembagian devDouble = new Pembagian(4.2, 1.6, true);
        System.out.println("Hasil Pembagian Double: " + devDouble.ambilkiHasilDoublenya());
    }
}
