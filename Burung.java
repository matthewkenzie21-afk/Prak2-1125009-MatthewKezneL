public class Burung extends HewanUdara {

    public Burung(String name, int age, String food, double wingSpan) {
        super(name, age, food, wingSpan);
    }

    @Override
    public String printSound() {
        return "Cuit Cuit";
    }
}
