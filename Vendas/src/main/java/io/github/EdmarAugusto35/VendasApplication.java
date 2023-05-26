package io.github.EdmarAugusto35;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {
    @GetMapping("/Hello")
    public String helloWord(){
        return "hello Word";
    }



    public static void main(String[] args) {
        //inicializar a aplicação
        SpringApplication.run(VendasApplication.class,args);
    }
}
