public class Paus extends HewanLaut {

    public Paus(String name, int age, String food, double depth) {
        super(name, age, food, depth);
    }

    @Override
    public String printSound() {
        return "Echolocation Click / Whistle";
    }
}
