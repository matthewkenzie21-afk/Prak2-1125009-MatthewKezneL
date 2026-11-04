public class Ikan extends HewanLaut {

    public Ikan(String name, int age, String food, double depth) {
        super(name, age, food, depth);
    }

    @Override
    public String printSound() {
        return "Blub Blub";
    }
}
