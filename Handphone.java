public class Handphone extends Gadget {
    int kameraMp;

    public Handphone(String merk, int harga, int kameraMp) {
        super(merk, harga);
        this.kameraMp = kameraMp;
    }

    public void print() {
        super.print();
        System.out.println("Kamera: " + kameraMp + " MP");
    }
}
