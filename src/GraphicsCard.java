public class GraphicsCard extends ComputerParts{
    private boolean hasRaytracing;
    private int benchmarkScore;

    public GraphicsCard (String name, double cost, int manufactureYear, boolean hasRaytracing) {
        super(name, cost, manufactureYear);
        this.hasRaytracing = hasRaytracing;
    }

    public int benchmark(boolean rtxOn) {
        benchmarkScore = (int)(Math.random()*100000 - ((2022 - getManufactureYear()) * 1366));
        if (rtxOn && hasRaytracing) {
            benchmarkScore /= 3;
        }
        if (benchmarkScore < 0) {
            System.out.println("Yikes.");
            benchmarkScore = 0;
        }
        System.out.println("Your " + getName() + " gpu has gotten a score of " + benchmarkScore + ".");
        judgment();
        return benchmarkScore;
    }

    public void mineCryto() {
        double a = Math.random() * 3;
        a = Math.round(a * 100);
        a /= 100;
        setCost(getCost() - a);
        System.out.println("You mined $" + a + ". The cost of your gpu is now $" + getCost() + ".");
    }
}
