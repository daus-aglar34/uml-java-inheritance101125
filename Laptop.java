public class Laptop extends Gadget {
    boolean isGaming;

    public Laptop(String merk, int harga, boolean isGaming) {
        super(merk, harga);
        this.isGaming = isGaming;
    }

    public void print() {
        super.print();
        System.out.println("Laptop Gaming: " + (isGaming ? "Ya" : "Tidak"));
    }
}
