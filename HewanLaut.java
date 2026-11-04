
public abstract class HewanLaut extends Hewan {

    private double depth;

    public HewanLaut(String name, int age, String food, double depth) {
        super(name, age, food);
        this.depth = depth;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public String printData() {
        return super.printData() +
               "\nKedalaman   : " + depth + " meter";
    }
}
