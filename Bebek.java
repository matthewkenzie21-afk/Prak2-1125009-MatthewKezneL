public class Bebek extends HewanUdara {

    public Bebek(String name, int age, String food, double wingSpan) {
        super(name, age, food, wingSpan);
    }

    @Override
    public String printSound() {
        return "Kwek Kwek";
    }
}
