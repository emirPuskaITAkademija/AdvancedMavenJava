package two.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//1.7 Try_WIth-Resource

/**
 * try{
 *
 * }
 *
 * try(){
 *
 * }
 */
public class CopyBytes {
    public static void main(String[] args) {
        //IOException
        //FileInputStream
        //FileOutputStream
        //try-with-resource
        try(FileInputStream in = new FileInputStream("C:\\Users\\Grupa1.PREDAVACKI-04\\IdeaProjects\\AdvancedMavenJava\\src\\main\\resources\\source.txt");
            FileOutputStream out = new FileOutputStream("C:\\Users\\Grupa1.PREDAVACKI-04\\IdeaProjects\\AdvancedMavenJava\\src\\main\\resources\\novi.txt");
            Citac citac = new Citac()) {

            int byteChar;
            while ((byteChar = in.read()) !=-1){
                out.write(byteChar);
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
