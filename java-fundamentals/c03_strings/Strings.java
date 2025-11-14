package c03_strings;

public class Strings {

    public static void main(String[] args) {

        // Cadenas de texto

        String name = "Jonathan";
        var surname = new String("Ruiz");

        // Operaciones básicas

        // Concatenación
        System.out.println(name + " " + surname);

        // Longitud
        System.out.println(name.length());

        // Obtener caracter
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(name.length()-1));

        // Subcadena
        System.out.println(name.substring(2));
        System.out.println(name.substring(2, 5));


        // Mayúsculas y minúsculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        name = name.toLowerCase();

        System.out.println(name);


        // Comprobar si contiene
        System.out.println("Hola, Java".contains("Jona"));
        System.out.println("Hola, Java".toUpperCase().contains("AVA"));


        // Comparación
        System.out.println(name.equals("Jonathan"));
        System.out.println(name.equals("jonathan"));
        System.out.println(name.equalsIgnoreCase("jonathAn"));

        // == vs .equals

        var a = "Jonathan";
        var b = "Jonathan";
        var c = new String("Jonathan");

        System.out.println(a == b);
        System.out.println(a == c);

        // Trim
        System.out.println("  Hola, me llamo Jonathan ".trim());

        // Replace
        System.out.println(" Hola, me llamo Jonathan ".replace(" ", ""));

        // Format
        var age = 28;

        System.out.println("Hola soy " + name + ". Tengo " + age + ".");
        System.out.println(String.format("Hola soy %s. Tengo %d.", name, age));
        System.out.printf("Hola soy %s. Tengo %d.\n", name, age);

        String formato = String.format(
                "================================\n"
                +"Caja\n"
                + "================================="
        );

        System.out.println(formato);
    }
}
