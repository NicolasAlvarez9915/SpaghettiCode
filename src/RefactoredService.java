import java.util.List;
import java.util.stream.Collectors;

public class RefactoredService {
    private final List<User> users = List.of(
            new User("Juan", 25),
            new User("Ana", 30),
            new User("Carlos", 28)
    );

    public List<User> getAdultUsers() {
        return users.stream()
                .filter(user -> user.getAge() >= 18)
                .collect(Collectors.toList());
    }

    public void printUsers() {
        getAdultUsers().forEach(user ->
                System.out.println("Nombre: " + user.getName() + " - Edad: " + user.getAge())
        );
    }
}
/*
* Mejoras:
* Separa la lógica de filtrado y de impresión.
* Usa stream().filter() para mayor claridad.
* Evita concatenaciones innecesarias.
* */