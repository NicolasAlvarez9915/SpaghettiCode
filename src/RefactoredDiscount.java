import java.util.Scanner;

public class RefactoredDiscount {
    public double getDiscount(boolean isVIP, double amount, boolean isStudent, boolean isBirthday) {
        double discount = 0.0;

        if (isVIP) discount += 20;
        if (amount > 100) discount += 10;
        if (isStudent) discount += 5;
        if (isBirthday) discount += 5;

        return discount;
    }

    public void showFormCalculateDiscount() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Es VIP? (true/false): ");
        boolean isVIP = scanner.nextBoolean();

        System.out.print("Monto de compra: ");
        double amount = scanner.nextDouble();

        System.out.print("¿Es estudiante? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.print("¿Es su cumpleaños? (true/false): ");
        boolean isBirthday = scanner.nextBoolean();

        double discount = getDiscount(isVIP, amount, isStudent, isBirthday);
        System.out.println("Descuento aplicado: " + discount + "%");
    }
}
/*
* ¿Por qué es mejor?
* Condiciones separadas claramente, sin anidamientos.
* Código más fácil de entender y modificar.
* Método getDiscount() reutilizable para calcular descuentos sin mezclarlo con la entrada de usuario.
*/