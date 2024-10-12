package estudos.java.services.projetoEstudoJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ProjetoEstudoJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoEstudoJavaApplication.class, args);
	}
}
