
package com.trouvere;

import static springfox.documentation.builders.PathSelectors.regex;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class TrApplication {
	// Инициализация логера сделаю потом
	private static final Logger log = Logger.getLogger(TrApplication.class);

	public static void main(String[] args) throws Exception {
		log.info("Это информационное сообщение!");
		SpringApplication.run(TrApplication.class, args);
	}

	@Bean
	public Docket newsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("greetings")
				// .apiInfo(apiInfo())
				.select().paths(regex("/greeting.*")).build();
	}

}
