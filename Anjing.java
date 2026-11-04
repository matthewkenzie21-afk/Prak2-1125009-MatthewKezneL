public class Anjing extends HewanDarat {

    public Anjing(String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }

    @Override
    public String printSound() {
        return "Guk Guk";
    }
}
