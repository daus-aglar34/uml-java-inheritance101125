public class Spesifikasi extends Laptop {
    String processor;
    int ram;

    public Spesifikasi(String merk, int harga, boolean isGaming, String processor, int ram) {
        super(merk, harga, isGaming);
        this.processor = processor;
        this.ram = ram;
    }

    public void print() {
        super.print();
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
    }
}
