package two.i18n;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * <li>1. ResourceBundle.java</li>
 * <li>2. Messages.properties</li>
 *    key=value
 *
 * i18n -> koji jezik
 * l10n -> lokalizacija
 */
public class I18nDemo{
    public static void main(String[] args) {
        System.out.println("Unesi kod svog jezika:");
        String language = new Scanner(System.in).nextLine();
        System.out.println("Unesi kod svoje države");
        String country = new Scanner(System.in).nextLine();
        Locale locale = new Locale(language, country);
        ResourceBundle translatedMessages = ResourceBundle.getBundle("Messages",locale);
        System.out.println(translatedMessages.getString("greetings"));
        System.out.println(translatedMessages.getString("inquiry"));
        System.out.println(translatedMessages.getString("farewell"));
    }
}
