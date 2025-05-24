public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck(2, "Female", "Yellow");
        Fish fish = new Fish(1, "Male", 3, true);
        Zebra zebra = new Zebra(4, "Female", true);

        System.out.println("Duck:");
        duck.swim();
        duck.quack();
        duck.mate();
        System.out.println("Is mammal? " + duck.isMammal());

        System.out.println("\nFish:");
        fish.testSwim();
        fish.mate();
        System.out.println("Is mammal? " + fish.isMammal());

        System.out.println("\nZebra:");
        zebra.run();
        zebra.mate();
        System.out.println("Is mammal? " + zebra.isMammal());
    }
}

class Animal {
    int age;
    String gender;

    public Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public boolean isMammal() {
        return false;  
    }

    public void mate() {
        System.out.println("Animal is mating.");
    }
}


class Duck extends Animal {
    String beakColor;

    public Duck(int age, String gender, String beakColor) {
        super(age, gender);
        this.beakColor = beakColor;
    }

    public void swim() {
        System.out.println("Duck is swimming.");
    }

    public void quack() {
        System.out.println("Duck says quack!");
    }
}

class Fish extends Animal {
    int sizeInFt;
    boolean canEat;

    public Fish(int age, String gender, int sizeInFt, boolean canEat) {
        super(age, gender);
        this.sizeInFt = sizeInFt;
        this.canEat = canEat;
    }

    private void swim() {
        System.out.println("Fish is swimming.");
    }

    public void testSwim() {
        swim();  
    }
}

class Zebra extends Animal {
    boolean is_wild;

    public Zebra(int age, String gender, boolean is_wild) {
        super(age, gender);
        this.is_wild = is_wild;
    }

    public void run() {
        System.out.println("Zebra is running.");
    }
}


