package br.com.yahoo.renato_de_melo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

/**
 * The entrypoint class for the application.
 * @author renato de melo
 *
 */
@SpringBootApplication
@ComponentScan("br.com.yahoo.renato_de_melo")
public class App {

    public static void main(String[] args) {
        new SpringApplicationBuilder(App.class).run(args);
    }
}