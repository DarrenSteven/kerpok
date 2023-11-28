package latihan2;

class fileException extends Exception {
    public fileException(String pesan) {
        super(pesan);
    }
}

public class Sistem {
    public static void main(String[] args) {
        String[] namaFile = { "docx", "pdf", "pptx" };

        try {
            String hasilCari = bacaFile(namaFile, "Excel");
            if (hasilCari != null) {
                System.out.println("File ditemukan: " + hasilCari);
            } else {
                System.out.println("File tidak ditemukan");
            }
        } catch (fileException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static String bacaFile(String[] namaFile, String cariFile) throws fileException {
        for (String file : namaFile) {
            if (file.equals(cariFile)) {
                return file;
            }
        }
        throw new fileException("Nama tidak ditemukan : " + cariFile);
    }
}