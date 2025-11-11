public class GadgetTest {
    public static void main(String[] args) {
        System.out.println("=== Data Laptop ===");
        Spesifikasi laptop1 = new Spesifikasi("ASUS ROG", 25000000, true, "Intel i7", 16);
        laptop1.print();

        System.out.println("\n=== Data HP ===");
        Handphone hp1 = new Handphone("Samsung", 8000000, 108);
        hp1.print();

        System.out.println("\n=== Data Gadget Umum ===");
        Gadget gadget1 = new Gadget("Logitech", 500000);
        gadget1.print();
    }
}
