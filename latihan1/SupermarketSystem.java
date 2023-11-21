class PurchaseException extends Exception {
    public PurchaseException(String message) {
        super(message);
    }
}

// testing

public class SupermarketSystem {
    public int kodeBarang, hargaBeli, hargaJual;
    public String namaBarang, gudang;

    public void processPurchase(int beli, int jual) throws PurchaseException {
        if (jual <= 0 && beli < 1) {
            throw new PurchaseException(
                    "Terjadi Kesalahan: Harga jual harus lebih dari 0 dan jumlah pembelian minimal 1");
        }
        System.out.println("Pembelian berhasil diproses.");
    }

    public static void main(String[] args) {
        SupermarketSystem supermarket = new SupermarketSystem();

        try {
            supermarket.processPurchase(3, 5);
        } catch (PurchaseException e) {
            System.out.println(e.getMessage());
        }
    }
}
