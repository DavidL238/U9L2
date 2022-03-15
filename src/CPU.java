public class CPU extends ComputerParts{
    private int temperature;
    private int benchmarkScore;

    public CPU (String name, int cost, int manufactureYear) {
        super(name, cost, manufactureYear);
        temperature = 56;
    }

    public int benchmark() {
        benchmarkScore = (int)(Math.random() * 80000 - ((2022 - getManufactureYear())) * 1988);
        if (benchmarkScore < 0) {
            System.out.println("Yikes");
            benchmarkScore = 0;
        }
        System.out.println("Your " + getName() + " cpu has gotten a score of " + benchmarkScore + ".");
        temperature = (int)(56 + Math.random() * 45);
        System.out.println("Your current cpu temperature is at " + temperature + "C.");
        judgement();
        return benchmarkScore;
    }
}
