package latihan3;

class fileException extends Exception {
    public fileException(String pesan) {
        super(pesan);
    }
}

public class Sistem2 {
    public static String bacaFile(String[] namaFile, String cariFile) {
        try {
            for (String file : namaFile) {
                if (file.equals(cariFile)) {
                    return file;
                }
            }
            throw new fileException("File Tidak Ditemukan");
        } catch (fileException e) {
            System.out.println("Error : " + e.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Diluar Batas");
            return null;
        }
    }

    public static void main(String[] args) {
        String[] namaFile = { "docx", "pdf", "ppt" };

        String fileCari = "docx";
        String hasil = bacaFile(namaFile, fileCari);

        if (hasil != null) {
            System.out.println("File Ditemukan : " + hasil);
        }
    }
}
