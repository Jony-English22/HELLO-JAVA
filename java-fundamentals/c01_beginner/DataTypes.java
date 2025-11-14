package c01_beginner;

public class DataTypes {

    public static void main(String[] args) {

        // Tipos de datos primitivos

        int myInt = 22;
        System.out.println(myInt);

        float myFloat = 1.82f;
        System.out.println(myFloat);

        double myDouble = 1.82;
        System.out.println(myDouble);

        // long, byte, short

        char myChar = 'a';
        System.out.println(myChar);

        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        String myString = "Hola Java";
        System.out.println(myString);

        // Tipo de dato (clase) en tiempo de ejecución

        System.out.println(myString.getClass().getSimpleName());
        // getClass().getSimpleName() devuelve el nombre de la clase (tipo de dato) del objeto en tiempo de ejecución.
    }
}
