package com.spring.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.spring.basics.configuration.AppConfig;

// spring boot bu yöntemle tüm package'leri dolaşır.
// @SpringBootApplication

// Bu yöntem ile sadece configuration class'ları tanımasını sağlıyoruz.
@SpringBootApplication(scanBasePackages = {
		"com.spring.basics.configuration"
})

@EnableAutoConfiguration

// xml tabanlı konfigürasyonlar ImportResource ile eklenmelidir!
@ImportResource("applicationContext.xml")

// Bende bir Spring Confugiration sınıfı var. Bunu Spring Boot uygulamasında kullanıyorum.
@Import(AppConfig.class)

public class Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
		
	}
}
