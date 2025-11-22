package c05_structures;

import java.util.HashSet;

public class Sets {

    public static void main(String[] args) {

        // Declaración y creación
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        // Tamaño

        System.out.println(names.size());

        // Añadir elementos

        names.add("Jonathan");
        names.add("Ruiz");
        names.add("Jony-English22");
        names.add("jonyrp22@gmail.com");
        names.add("jonathan");
        System.out.println(names.size());
        System.out.println(names);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println();
        // Eliminar elementos

        names.remove("Jonathan");
        System.out.println(names.size());

        // Buscar elementos

        System.out.println(names.contains("Jonathan"));
        System.out.println(names.contains("jony22@gmail.com"));

        System.out.println(names);
        names.add("Jonathan");
        names.add("Jonathan");
        names.add("Jonathan");
        System.out.println(names);

        // Conjunto

        // names.addAll(numbers); Error

        var countries = new HashSet<String>();
        countries.add("México");
        countries.add("Guatemala");
        countries.add("Brazil");
        countries.add("Jonathan");

        names.addAll(countries); // Combinar Sets

        System.out.println(names);

        names.removeAll(countries);

        System.out.println(names);

        names.retainAll(countries); // Datos comunes

        System.out.println(names);


    }

}
