public class Commando extends Soldier {
    private double vocationAllowance;

    public Commando(String name, double baseAllowance, double vocationAllowance) {
        super(name, baseAllowance);
        this.vocationAllowance = vocationAllowance;
    }

    public double getGrossAllowance() {
        return getBaseAllowance() + vocationAllowance;
    }

    public String toString() {
        return "Commando{name='" + getName() + "', baseAllowance=" + getBaseAllowance() + ", vocationAllowance=" + vocationAllowance + "}" ;
    }
}
