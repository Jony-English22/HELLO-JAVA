public class Tests {
    public static void main (String[] args){
        /*
          ================================================
                 T A B L A  D E  P U N T A C I Ó N
          ================================================
          1. Carlos
          2. Valeria
         */

        /*
         * Ejercicio 1.1 (8 puntos)
         * Declara e inicializar las siguientes variables con los tipos de datos apropiados:
         *   - El precio de un producto: 1599.99
         *   - La cantidad de producto en inventario: 500
         *   - La inicial del nombre de una empresa: T
         *   - Si un producto está disponible
         *   - El código de barras de un producto: 7501234567890 (número muy grande)
         *   - La temperatura precisa de un servidor: 45.678
         *   - El descuento aplicado en formato decimal: 0.15f
         */

        double prec = 299.99;
        int precioEnteo = (int) prec;
        System.out.println(precioEnteo);
        float price = 1599.99f;
        int stock = 500;
        char letter = 'T';
        boolean disponibility = true;
        long codigo = 7501234567890L;
        double temperatura = 45.678;
        float descuento = 0.15f;

        /*
         * Crea las siguientes constantes siguiendo las convenciones de Java:
         * 1. IVA con valor 0.16
         * 2. PI con valor 3.14159265359
         * 3. VELOCIDAD_LUZ con valor 299792458 (metros
         *
         * yareli 5 pts
         */

        final float IVA = 0.16f;
        final double PI = 3.14159265359;
        final int VELOCIDAD_LUZ = 299792458;

        int iva;


        /*
         * Ejercicio 1.3 (10 puntos)
         * Declara variables que demuestren conversión de tipos (casting):
         * Completa el código siguiente:
         */
        double precio = 299.99;
        int precioEntero = (int)precio;
        // Convierte precio a int

        long numeroGrande = 5000000000L;
        int numeroMedio = (int) numeroGrande;

        int edad = 25;
        double edadDouble = edad;
        // Convierte edad a double (cast implícito)

        char letra = 'A';
        int codigoAscii = (int) letra; // Obtén el código ASCII de la letra

        // Ejercicio 2.1 - Operadores Aritméticos (10 puntos)

        /*
         * Dadas las siguientes variables, calcula y almacena los resultados:
         *
         * int a = 45;
         * int b = 7;
         * double x = 12.5;
         * double y = 3.2;
         *
         * Calcula y guarda en variables apropiadas:
         *    - La suma de a y b
         *    - La división de a entre b (resultado decimal)
         *    - El residuo de a entre b
         *    - El promedio de x & y
         *    - El resultado de: (a + b) * x / y
         */



    }
}
