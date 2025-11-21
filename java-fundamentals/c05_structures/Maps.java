package c05_structures;

import java.util.HashMap;

public class Maps {

    public static void main(String[] args) {

        // Declaración y creación
        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        // Tamaño

        System.out.println(names.size());

        // Añadir elementos

        names.put("Jonathan", "jonathan@gmail.com");
        names.put("Ruiz", "ruiz@gmail.com");
        names.put("Jony", "jony_english22@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        // Acceder a los elementos

        System.out.println(names.get("Jony"));
        System.out.println(names.get("Dev"));

        // Verificar elementos

        System.out.println(names.containsKey("Jony"));
        System.out.println(names.containsKey("Dev"));

        System.out.println(names.containsValue("ruiz@gmail.com"));

        // Eliminar elementos

        System.out.println(names.remove("Ruiz"));
        System.out.println(names.remove("Jony"));
        System.out.println(names);

        // Limpiar

        names.clear();
        System.out.println(names);

        // Modificación
        names.put("Jonathan", "jonathan@gmail.com");
        System.out.println(names);

        names.put("Jonathan", "jonathanruiz@gmail.com");
        System.out.println(names);

        names.replace("Ruiz", "ruiz@gmail.com"); // Reemplaza el valor si existe
        System.out.println(names);

        names.putIfAbsent("Ruiz", "ruiz@gmail.com"); //Solo añade si no existe
        System.out.println(names);

        // Otras operaciones

        System.out.println(names.isEmpty());
        var values = names.values();
        System.out.println(values);
    }
}
