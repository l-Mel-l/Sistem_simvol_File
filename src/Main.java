import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\79623\\OneDrive\\Рабочий стол\\24_demo.txt");
        String content = null;
        try {
            content = Files.readString(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int max = 0;
        int currentPos = 0;
        for (int i = 0; i < content.length(); i++) {
            if (content.charAt(i) == 'X') {
                currentPos++;
                if (currentPos > max) {
                    max = currentPos;
                }
            } else {
                currentPos = 0;
            }
        }
        System.out.println("длинна наибольшей последовательности X = " + max);
    }
}