package three.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * ZADAĆA:
 *
 * <p>
 *     Izbrojati koliko je bilo potrebno iteracija da se pročitaju sva slova
 *     iz fajla.
 * </p>
 *
 * karaktere -> tretira Unicode konvenciji
 * č -> 16bizni
 *
 * 2 na 16 -> 65 000
 *
 * 2x16 ->
 */
public class CopyChars {
    public static void main(String[] args) {
        //FileReader, FileWriter
        try(FileReader reader = new FileReader("src/main/resources/izvorKaraktera.txt");
            FileWriter writer = new FileWriter("src/main/resources/destinationKaraktera.txt")){
            int karakterProcitani;
            while((karakterProcitani = reader.read())!=-1){
                writer.write(karakterProcitani);
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
