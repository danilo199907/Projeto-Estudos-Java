package estudos.java.services.projetoEstudoJava.resources.database.repository;

import estudos.java.services.projetoEstudoJava.resources.database.table.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<User, Long> {
}
