public class Main {
    public static void main(String[] args) {
        Animal anAnimal = new Animal("Jerald", 3, true);
        anAnimal.adopt();
        anAnimal.adopt();
        anAnimal.feed();
        System.out.println();

        Cat aCat = new Cat("name", 8, false);
        aCat.play();
        aCat.play();
        aCat.adopt();
        aCat.adopt();
        aCat.feed();
        System.out.println();

        Dog aDog = new Dog("coolerName", 12, true);
        aDog.walk();
        aDog.walk();
        aDog.adopt();
        aDog.adopt();
        aDog.feed();
        System.out.println();
    }
}
