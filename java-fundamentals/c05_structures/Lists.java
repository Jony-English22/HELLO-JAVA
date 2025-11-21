package c05_structures;

import java.util.ArrayList;

public class Lists {

    public static void main(String[] args) {

        // Declaración y creación
        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        // Tamaño

        System.out.println(names.size());

        // Inserción

        names.add("Jonathan");
        names.add("Ruiz");
        names.add("Jony-English22");
        System.out.println(names.size());

        // Acceso

        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());

        // Modificación

        names.set(2, "jonyrp@gmail.com");
        System.out.println(names.getLast());

        // Eliminación

        names.remove(2);
        // System.out.println(names.get(2)); // Error
        System.out.println(names.size());

        // Búsqueda

        System.out.println(names.contains("Jonathan"));
        System.out.println(names.contains("jonyrp@gmail.com"));

        // Limpieza

        names.add("Jonathan");
        System.out.println(names);
        names.clear();
        System.out.println(names.size());

    }
}
