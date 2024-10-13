package estudos.java.services.projetoEstudoJava.domain.services;

import estudos.java.services.projetoEstudoJava.domain.entity.User;
import estudos.java.services.projetoEstudoJava.resources.database.repository.UsersRepository;
import estudos.java.services.projetoEstudoJava.resources.database.table.UserTable;

public class UserService {
    private final UsersRepository repository;

    public UserService(UsersRepository repository) {
        this.repository = repository;
    }

    public void createUser(User user) throws Exception {
        repository.save(new UserTable(
                user.getName(),
                user.getCpf(),
                user.getEmail()
        ));
    }
}