public class Dog extends Animal{
    private boolean hasBeenWalked;

    public Dog (String name, int age, boolean vaccinated) {
        super(name, age, vaccinated);
        hasBeenWalked = false;
    }

    public void walk() {
        if (!hasBeenWalked) {
            System.out.println(getName() + " has been walked! woof.");
            hasBeenWalked = true;
        }
        else {
            System.out.println(getName() + " has already went for a walk today.");
        }
    }
}
