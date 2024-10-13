package estudos.java.services.projetoEstudoJava.resources.config;

import estudos.java.services.projetoEstudoJava.domain.services.UserService;
import estudos.java.services.projetoEstudoJava.resources.database.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfig {

    @Bean
    public UserService UserService(UsersRepository usersRepository) {

        return new UserService(usersRepository);
    }
}
