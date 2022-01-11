package three.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//BYTE PO BYTE

/**
 *
 * ZADAĆA 1: Izbrojati koliko je potrebno bilo iteracija da se pročita kompletan
 * sadržaj fajla.
 * Uporediti s brojem karaktera u fajlu navedeni rezultat.
 * izbjegavati..
 */
public class CopyBytes {
    public static void main(String[] args){

        //TRY-WITH-RESOURCE >=1.7
        try(FileInputStream in = new FileInputStream("C:\\Users\\Grupa1.PREDAVACKI-04\\IdeaProjects\\AdvancedMavenJava\\src\\main\\resources\\izvor.txt");
            FileOutputStream out = new FileOutputStream("C:\\Users\\Grupa1.PREDAVACKI-04\\IdeaProjects\\AdvancedMavenJava\\src\\main\\resources\\destination.txt");){
            int bytePodatka;
            while((bytePodatka = in.read())!=-1){
                out.write(bytePodatka);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
