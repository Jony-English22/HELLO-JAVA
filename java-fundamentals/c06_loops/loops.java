package c06_loops;

import java.util.ArrayList;
import java.util.Scanner;

public class loops {

    ArrayList<Integer> listaMatriculas = new ArrayList<>();
    ArrayList<Integer> calParcial1 = new ArrayList<>();
    ArrayList<Integer> calParcial2 = new ArrayList<>();
    ArrayList<Integer> calParcial3 = new ArrayList<>();
    ArrayList<Integer> listaPromedios = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        loops app = new loops();

        int opcion = 0;

        while (opcion != 5) {

            System.out.println("\n--- GESTIÓN DE MATRICULAS ---");
            System.out.println("1. Agregar nueva matricula");
            System.out.println("2. Ver toda la lista de calificaciones y matriculas");
            System.out.println("3. Calcular la calificacion final de una matricula");
            System.out.println("4. Eliminar matricula");
            System.out.println("5. Salir del programa");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        app.agregarMatricula();
                        break;

                    case 2:
                        app.verLista();
                        break;

                    case 3:
                        app.calcularCalificaciones();
                        break;

                    case 4:
                        app.eliminarMatricula();
                        break;

                    case 5:
                        System.out.println("¡Hasta pronto!");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Ingrese solo números.");
                scanner.nextLine();
                opcion = 0;
            }
        }

        scanner.close();
    }

    // AGREGAR MATRICULA
    private void agregarMatricula() {

        System.out.print("Matricula: ");
        int matri = scanner.nextInt();

        System.out.print("Parcial 1: ");
        int c1 = scanner.nextInt();

        System.out.print("Parcial 2: ");
        int c2 = scanner.nextInt();

        System.out.print("Parcial 3: ");
        int c3 = scanner.nextInt();

        listaMatriculas.add(matri);
        calParcial1.add(c1);
        calParcial2.add(c2);
        calParcial3.add(c3);
        int promedio = (c1 + c2 + c3) / 3;
        listaPromedios.add(promedio);

        System.out.println("ÉXITO: La matrícula " + matri + " ha sido agregada.");
    }

    // VER LISTA
    private void verLista() {
        if (listaMatriculas.isEmpty()) {
            System.out.println("No hay matrículas registradas.");
            return;
        }

        System.out.println("\n--- LISTA COMPLETA ---");
        for (int i = 0; i < listaMatriculas.size(); i++) {
            System.out.println((i + 1) + ". Matrícula: " + listaMatriculas.get(i)
                    + " | P1: " + calParcial1.get(i)
                    + " | P2: " + calParcial2.get(i)
                    + " | P3: " + calParcial3.get(i)
                    + " | Promedio: " + listaPromedios.get(i));
        }

    }

    // CALCULAR CALIFICACIÓN
    private void calcularCalificaciones() {

        System.out.print("Ingrese matrícula: ");
        int matri = scanner.nextInt();

        int indice = listaMatriculas.indexOf(matri);

        if (indice == -1) {
            System.out.println("No existe la matrícula.");
            return;
        }

        int promedio = (calParcial1.get(indice)
                + calParcial2.get(indice)
                + calParcial3.get(indice)) / 3;

        System.out.println("Promedio final de " + matri + ": " + promedio);
    }

    // ELIMINAR MATRÍCULA
    private void eliminarMatricula() {

        System.out.print("Ingrese la matrícula a eliminar: ");
        int matri = scanner.nextInt();

        int indice = listaMatriculas.indexOf(matri);

        if (indice == -1) {
            System.out.println("No existe la matrícula.");
            return;
        }

        listaMatriculas.remove(indice);
        calParcial1.remove(indice);
        calParcial2.remove(indice);
        calParcial3.remove(indice);

        System.out.println("Matrícula eliminada correctamente.");
    }
}
