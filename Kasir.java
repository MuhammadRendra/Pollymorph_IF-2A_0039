public class Kasir{
    private String namaKasir;

    public Kasir(String namaKasir){
        this.namaKasir = namaKasir;
    }

    public void tampilkanIdentitas(){
        System.out.println("====TOKO GARUDA====");
        System.out.println("Nama Kasir = " + namaKasir);
    }
}