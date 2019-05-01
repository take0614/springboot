package hello;

import org.springframework.web.bind.annotation.RequestMapping;

public class HelloController {
	@RequestMapping("/")
	public String index() {
		return "Greeting from Spring Boot!";
	}

}
