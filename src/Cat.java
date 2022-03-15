public class Cat extends Animal{
    private boolean hasPlayedWith;

    public Cat (String name, int age, boolean vaccinated) {
        super(name, age, vaccinated);
        hasPlayedWith = false;
    }

    public void play() {
        if (!hasPlayedWith) {
            System.out.println(getName() + " was played with.");
            hasPlayedWith = true;
        }
        else {
            System.out.println("Someone already played with " + getName() + " today.");
        }
    }
}
