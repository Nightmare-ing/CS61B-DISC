package disc04;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
        this.noise = "Meow!";
    }

    public static void main(String[] args) {
        Cat catOld = new Cat("Kiddy", 10);
        catOld.greet();
        Cat catYoung = new Cat("Young Kiddy", 3);
        catYoung.greet();
    }
}
