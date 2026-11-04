
public abstract class HewanUdara extends Hewan {

    private double wingSpan;

    public HewanUdara(String name, int age, String food, double wingSpan) {
        super(name, age, food);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public String printData() {
        return super.printData() +
               "\nBentang Sayap : " + wingSpan + " meter";
    }
}
