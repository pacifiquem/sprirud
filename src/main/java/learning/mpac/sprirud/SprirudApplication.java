package learning.mpac.sprirud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import learning.mpac.sprirud.*;
@SpringBootApplication
@RestController
public class SprirudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprirudApplication.class, args);
	}

	@GetMapping("/")
	public String welcome() {
		return "Welcome to sprirud";
	}

}