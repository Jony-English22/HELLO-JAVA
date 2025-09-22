public class VariableAndConstants {

    public static void main(String[] args) {

        // Variables

        String name = "Jonathan";
        System.out.println(name);


        name = "Jony";
        System.out.println(name);

        // name = 22; Error (no podemos cambiar el tipo de dato)

        int age =  22;
        System.out.println(age);

        var email = "jonathanrp200322@gmail.com";
        System.out.println(email);

        var year = 2025;
        System.out.println(year);

        // Constantes

        final String EMAIL = "jonathanrp200322@gmail.com";
        // Email = "jonyrp220603@gmail.com"; Error  (no podemos cambiar el valor de una constante)
        System.out.println(EMAIL);
    }
}
