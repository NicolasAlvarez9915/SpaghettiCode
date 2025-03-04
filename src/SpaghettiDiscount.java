import java.util.Scanner;

public class SpaghettiDiscount {
    public void calculateDiscount() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Es VIP? (true/false): ");
        boolean isVIP = scanner.nextBoolean();

        System.out.print("Monto de compra: ");
        double amount = scanner.nextDouble();

        System.out.print("¿Es estudiante? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.print("¿Es su cumpleaños? (true/false): ");
        boolean isBirthday = scanner.nextBoolean();

        double discount = 0.0;

        if (isVIP) {
            discount += 20;
            if (amount > 100) {
                discount += 10;
                if (isStudent) {
                    discount += 5;
                }
                if (isBirthday) {
                    discount += 5;
                }
            } else {
                if (isStudent) {
                    discount += 5;
                }
                if (isBirthday) {
                    discount += 5;
                }
            }
        } else {
            if (amount > 100) {
                discount += 10;
                if (isStudent) {
                    discount += 5;
                }
                if (isBirthday) {
                    discount += 5;
                }
            } else {
                if (isStudent) {
                    discount += 5;
                } else if (isBirthday) {
                    discount += 5;
                }
            }
        }

        System.out.println("Descuento aplicado: " + discount + "%");
    }
}
/* ¿Por qué es código espagueti?
* Muchas condicionales anidadas, lo que hace que el flujo sea difícil de seguir.
* Difícil de modificar, ya que cambiar una regla podría romper el código.
* Repetición innecesaria de condiciones, lo que lo hace poco eficiente.
*/