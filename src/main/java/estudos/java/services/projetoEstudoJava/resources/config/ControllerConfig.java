package estudos.java.services.projetoEstudoJava.resources.config;

import estudos.java.services.projetoEstudoJava.aplication.controller.UserController;
import estudos.java.services.projetoEstudoJava.domain.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfig {

    @Bean
    public UserController userController(UserService userService) {
        return new UserController(userService);
    }
}
