package four;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Postavka zadatka:
 * 1. List<String> names = Arrays.asList();
 * "Sead", "Nedim", "Ismar", "Kerima", "Ajla", "Neila", "Tarik"
 * "Berin", "Adnan"
 * 2. "Ismar" "Berin" "Adnan"
 * 2.1 u konzolu ispišete sve element osim ova 3 uljeza
 * 2.2 je da kreirate novu kolekciju bez ova tri uljeza
 */
public class Zadatak2 {
    public static void main(String[] args) {

//        names.add("Sead");
//        names.add("Nedim");
//        names.add("Ismar");
//        names.add("Kerima");
//        names.add("Ajla");
//        names.add("Neila");
//        names.add("Tarik");
//        names.add("Berin");
//        names.add("Adna");
        //Martin Fownler
//        List<String> novaLista = names.stream()
//                .filter(it->!it.equals("Ismar"))
//                .filter(name -> !name.equals("Berina"))
//                .filter(n -> !n.equals("Adnan"))
//                .collect(Collectors.toList());

//                Arrays.asList("Sead", "Nedim", "Ismar", "Kerima",
//                "Ajla", "Neila", "Tarik", "Berin", "Adnan");
        //AHMED proposal
//        List<String> names = new ArrayList<>();
        List<String> names = Arrays.asList("Seada", "Nedima","Ismar", "Berin", "Adnan");

        //1. java.util.ArrayList
        //2. java.util.Arrays$ArrayList

        names.remove("Ismar");
        names.remove("Berin");
        names.remove("Adnan");
        for(String name : names){
            System.out.println(name);
        }

    }
}
