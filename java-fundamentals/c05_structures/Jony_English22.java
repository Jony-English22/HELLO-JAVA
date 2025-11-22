package c05_structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Jony_English22 {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        String [] countries = {"Brazil", "México", "Italia", "Guatemala", "Dinamarca"};

        System.out.println(countries.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.

        System.out.println(countries[3]);
        countries [3] = "Republica Dominicana";
        System.out.println(countries[3]);

        // 3. Crea un ArrayList vacío.

        ArrayList<String> names =  new ArrayList<>();

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.

        names.add("Juan");
        names.add("Jonathan");
        names.add("Jesús");
        names.add("Mateo");

        // 5. Crea un HashSet con 2 valores diferentes.

        var regions = new HashSet<String>();

        regions.add("Norte");
        regions.add("Sur");
        System.out.println(regions);
        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.

        regions.add("Norte");
        regions.add("Sur");
        System.out.println(regions);

        // 7. Elimina uno de los elementos del HashSet.

        regions.remove("Norte");
        System.out.println(regions);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.

        var contacts = new HashMap<String, String>();

        contacts.put("Vicky",  "9934428862");
        contacts.put("Edgar", "9933081858");
        contacts.put("Josue", "9932626921");
        // 9. Modifica uno de los contactos y elimina otro.

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.

    }
}
