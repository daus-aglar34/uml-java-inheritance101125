public class Gadget {
    String merk;
    int harga;

    public Gadget(String merk, int harga) {
        this.merk = merk;
        this.harga = harga;
    }

    public void print() {
        System.out.println("Merk: " + merk);
        System.out.println("Harga: Rp " + harga);
    }
}

