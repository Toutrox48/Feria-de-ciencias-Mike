import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Inventores inventor1 = new Inventores("Manolo", 19, 0, "Volcan de Bicarbonato", "Quimica", "Presentacion en powerpoint");
        Inventores inventor2 = new Inventores("Maria", 22, 0, "Sistema web de sifrado Cesár", "Software", "Demostrracion virtual");
        Inventores inventor3 = new Inventores("Luis", 25, 0, "Robot de limpieza", "Mecanica", "Demostración en vivo");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bienvenido a la Feria de Ciencias!");
        System.out.print("---Opciones---");
        System.out.print("1. Ver participantes");
        System.out.print("2. Crear Participante");
        System.out.print("3. iniciar Competencia ");
        System.out.print("4. Salir");
        System.out.print("Seleccione una opción:");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ver participantes");
                break;
            case 2:
                System.out.println("Crear Participante");
                break;
            case 3:
                System.out.println("Iniciar Competencia");
                break;
            case 4:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Opción no válida");
        }

        scanner.close();
    }
}