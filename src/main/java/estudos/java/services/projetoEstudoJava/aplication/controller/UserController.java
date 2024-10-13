package estudos.java.services.projetoEstudoJava.aplication.controller;

import estudos.java.services.projetoEstudoJava.domain.entity.User;
import estudos.java.services.projetoEstudoJava.domain.services.UserService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Void> createUser(@RequestBody User user) throws Exception {
        service.createUser(user);
        return ResponseEntity.status(HttpStatusCode.valueOf(201)).build();
    }
}