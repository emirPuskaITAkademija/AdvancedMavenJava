package three.io;

import two.io.decorator.Beverage;
//import two.io.decorator.Esspreso;
import two.io.decorator.MilkDecorator;

import java.io.*;

//BufferedReader, PrintWriter
public class CopyLines {
    public static void main(String[] args) {
        //BufferedReader -> FileReader  ->   r = new BufferedReader(new FileReader());
        //MilkDecorator              -> Esspreso  -> b = new MilkDecorator(new Espresso())
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/izvorLinija.txt"));
              PrintWriter writer = new PrintWriter(new FileWriter("src/main/resources/destinacijaLinija.txt"))) {
            String linija;
            while((linija = reader.readLine())!=null){
                writer.println(linija);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
