package three.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CustomStyleReadingFile {
    public static void main(String[] args) {
        String fileName = "src/main/resources/destinacijaLinija.txt";
        Path path = Paths.get(fileName);
        try {
            Files.copy(path, System.out);
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
