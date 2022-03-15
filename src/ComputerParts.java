public class ComputerParts {
    private String name;
    private int cost;
    private int manufactureYear;
    private boolean isInstalled;

    public ComputerParts (String name, int cost, int manufactureYear) {
        this.name = name;
        this.cost = cost;
        this.manufactureYear = manufactureYear;
        isInstalled = false;
    }

    public boolean install() {
        if (!isInstalled) {
            System.out.println(name + " has been installed.");
            isInstalled = true;
            return true;
        }
        else {
            System.out.println(name + " is already installed!");
            return false;
        }
    }

    public boolean uninstall() {
        if (isInstalled) {
            System.out.println(name + " has been uninstalled.");
            isInstalled = false;
            return true;
        }
        else {
            System.out.println(name + " is already uninstalled and available.");
            return false;
        }
    }

    public void judgment() {
        if (cost > 600) {
            System.out.println("Did you really pay " + cost + " for a(n) " + name + "? \nYou best hope that part was worth it, or you just got clowned on by scalpers.");
        }
        else {
            System.out.println("Cool " + name + ".");
        }
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public boolean isInstalled() {
        return isInstalled;
    }
}
