import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SpaghettiService spaghettiService = new SpaghettiService();
        RefactoredService refactoredService = new RefactoredService();
        SpaghettiDiscount spaghettiDiscount = new SpaghettiDiscount();
        RefactoredDiscount refactoredDiscount = new RefactoredDiscount();

        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Ejecutar código espagueti (Usuarios)");
            System.out.println("2. Ejecutar código refactorizado (Usuarios)");
            System.out.println("3. Ejecutar código espagueti (Descuentos)");
            System.out.println("4. Ejecutar código refactorizado (Descuentos)");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    spaghettiService.processUsers();
                    break;
                case 2:
                    refactoredService.printUsers();
                    break;
                case 3:
                    spaghettiDiscount.calculateDiscount();
                    break;
                case 4:
                    refactoredDiscount.showFormCalculateDiscount();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }
}