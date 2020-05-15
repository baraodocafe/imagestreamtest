package br.com.yahoo.renato_de_melo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping("/")
	public String index() {
		return "Greetings from S2I and IS test.";
	}
	@RequestMapping("/page1")
	public String page1() {
		return "Greetings from Page1";
	}

}
