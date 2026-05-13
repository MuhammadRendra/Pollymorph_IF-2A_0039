public class Main{
    public static void main(String[] args) {
        Produk p1 = new Elektronik("Samsung", 10000, 5, 2);
        Produk p2 = new Makanan("Bakso", 1000, 100, 3);
        Kasir kasir = new Kasir("MAMAN");
        
        p1.tampilkanInfo();
        kasir.tampilkanIdentitas();
        kasir.prosesBelanja(p1, 3);
    }
}