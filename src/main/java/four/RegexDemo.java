package four;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Pattern pattern-> compile regularnog izraza   "nedim"
//Matcher -> pattern -> da li neki tekst zadovoljava prethodno kreirani regularni izraz
// Kreirati program preko kog ćemo uraditi sljedeće:
// 1. korisnik će unijeti regularni izraz .. "   "
// 1.1 Pattern pattern = Pattern.compile(regex);
//2. korisnika da unese TEKST
//2.1 Da li naš TEKST zadovoljava REGEX Matcher
//try-catch-finnaly
//try-with-resource-catch
public class RegexDemo {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in);) {
            while (true) {
                System.out.println("Unesi REGEX:");
                String regex = scanner.nextLine();
                Pattern pattern = Pattern.compile(regex);
                System.out.println("Unesi TEKST koji želiš staviti na test regularnog izraza:");
                String text = scanner.nextLine();
                Matcher matcher = pattern.matcher(text);
                boolean found = false;
                while (matcher.find()) {
                    found = true;
                    System.out.format("Pronašao sam tekst '%s' " +
                            "na poziciji startnoj na indeksu '%d' " +
                            "koja završava na end position '%d'%n", matcher.group(), matcher.start(), matcher.end());
                }
                if (!found) {
                    System.out.format("Nema ničega u tekstu što odgovara napisanom regularnom izrazu%n");
                }
            }
        }

    }
}
