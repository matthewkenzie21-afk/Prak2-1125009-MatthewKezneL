public class Tikus extends HewanDarat {

    public Tikus(String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }

    @Override
    public String printSound() {
        return "Cit Cit";
    }
}
