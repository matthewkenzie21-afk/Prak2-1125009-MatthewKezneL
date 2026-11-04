public class Kucing extends HewanDarat {

    public Kucing(String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }

    @Override
    public String printSound() {
        return "Meow Meow";
    }
}
