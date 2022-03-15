import java.sql.SQLOutput;

public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private boolean adopted;

    public Animal (String name, int age, boolean vaccinated) {
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        adopted = false;
    }

    public void adopt() {
        if (!adopted) {
            System.out.println(name + " has been adopted!");
            adopted = true;
        }
        else {
            System.out.println("Someone has already adopted " + name + ".");
        }
    }

    public void feed() {
        System.out.println(name + " has been fed.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }
}
