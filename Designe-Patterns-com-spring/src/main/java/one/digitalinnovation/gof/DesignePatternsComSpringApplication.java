package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 * 
 * @author joao_rocha61
 */

@EnableFeignClients
@SpringBootApplication
public class DesignePatternsComSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignePatternsComSpringApplication.class, args);
	}

}
