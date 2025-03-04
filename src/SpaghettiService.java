import java.util.ArrayList;
import java.util.List;

public class SpaghettiService {
    public void processUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Juan", 25));
        users.add(new User("Ana", 30));
        users.add(new User("Carlos", 28));

        String result = "";
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getAge() >= 18) {
                result += "Nombre: " + users.get(i).getName() + " - Edad: " + users.get(i).getAge() + "\n";
            }
        }
        System.out.println(result);
    }
}
/*
 * &iquest;Por qu&eacute; es c&oacute;digo espagueti?
 * No reutiliza m&eacute;todos, todo est&aacute; en un solo m&eacute;todo.
 * Usa concatenaciones ineficientes de cadenas (result +=).
 * No separa responsabilidades.
 */