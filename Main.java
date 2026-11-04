
public class Main {

    public static void main(String[] args) {

        Hewan[] daftarHewan = new Hewan[] {

            new Anjing("Doggy", 3, "Tulang", 4),
            new Kucing("Milo", 2, "Ikan", 4),
            new Tikus("Jerry", 1, "Keju", 4),

            new Ikan("Nemo", 1, "Plankton", 15.0),
            new Hiu("Megalo", 10, "Daging", 500.0),
            new Paus("Bluey", 20, "Krill", 1000.0),

            new Burung("Pipit", 1, "Biji-bijian", 0.2),
            new Elang("Garuda", 5, "Daging", 2.1),
            new Bebek("Donald", 2, "Dedak", 0.8)
        };

        for (Hewan h : daftarHewan) {

            System.out.println("Jenis Hewan : " +
                    h.getClass().getSimpleName());

            System.out.println(h.printData());

            System.out.println("Suara       : " +
                    h.printSound());

            System.out.println("----------------------------------------");
        }
    }
}
