class Animal{
    void sound() {
        System.out.println("BINATANG bersuara");
    }
}

class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Gugugugugug");
    }
}

class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("Meow Meow");
    }
}

public class MainAnimal {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();

        System.out.print("Pemanggilan dari method sound() dari kelas Animal: ");
        a.sound();

        System.out.print("\nPemanggilan dari method sound() dari kelas Dog: ");
        d.sound();

        System.out.print("\nPemanggilan dari method sound() dari cat: ");
        c.sound();
    }
}
