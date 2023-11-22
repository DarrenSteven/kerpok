import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sistem {

    public static String bacaFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            StringBuilder content = new StringBuilder();
            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine()).append("\n");
            }

            scanner.close();
            return content.toString();

        } catch (FileNotFoundException e) {
            System.out.println("Terjadi Kesalahan: File tidak ditemukan - " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        String fileName = "latihan.txt";
        String fileContent = bacaFile(fileName);

        if (fileContent != null) {
            System.out.println("Isi File:");
            System.out.println(fileContent);
        }
    }
}
