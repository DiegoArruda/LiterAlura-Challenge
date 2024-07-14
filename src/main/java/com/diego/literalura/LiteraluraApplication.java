package com.diego.literalura;

import com.diego.literalura.service.ConsumoAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception{
		var consumoAPI = new ConsumoAPI();
		var json = consumoAPI.obterDados("https://gutendex.com/books/?languages=pt");
		System.out.println(json);
	}

}
