package c06_loops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class loops {
    public static void main(String[] args) {

        //System.out.println("Hola Mundo");

        // - for contralado por contador
        // Inicio - Condición - Incremento
        for (int index = 1; index < 5; index++) {
            System.out.println("Hola Java!");
        }

        String[] names = {"Jonathan", "Ruiz", "Jony-English22"};
        for (int index = 2; index >= 0; index--) {
            System.out.println(names[index ]);
        }

        System.out.println();
        // for-each

        for (String n: names) {
            System.out.println(names);
        }

        HashSet<String> name = new HashSet<>();
        var numbers = new HashSet<Integer>();
        name.add("Jonathan");
        name.add("Ruiz");
        name.add("Jony-English22");
        name.add("jonyrp22@gmail.com");

        for(String nombres: name) {
            System.out.println(nombres);
        }

        HashMap<String, String> emails = new HashMap<>();
        emails.put("Jonathan", "jonathan@gmail.com");
        emails.put("Ruiz", "ruiz@gmail.com");
        emails.put("Jony", "jony_english22@gmail.com");

        for(Map.Entry<String, String> email: emails.entrySet()) {
            System.out.println(email.getKey());
            System.out.println(email.getValue());
        }

        // - while

        int index = 0;
        while (index < names.length) {
            System.out.println(names[index]);
            index++; // Contador
        }

        index = 0;
        boolean find = false;
        while (!find) {
            System.out.println(names[index]);
            if (names[index].equals("Jonathan")) {
                find = true;
            }
            index++;
        }

        // do while
        index = 5;
        do {
            // Codigo a repetir
            System.out.println("Hola, Java!");
            index++;
        } while (index < 3);

        // Control de bucles

        // - break

        for (String nam: names) {
            if (nam.equals("Jonathan")) {
                break;
            }
            System.out.println(nam);
        }

        // - continue

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }



    }
}
