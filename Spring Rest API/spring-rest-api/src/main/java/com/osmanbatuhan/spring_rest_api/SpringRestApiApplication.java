package com.osmanbatuhan.spring_rest_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// Bunu ise BİZİM IDE'miz olan 'IntelliJ' otomatik olarak arka planda yönetimini sağladığı için gerek duymuyorum yazmaya fakat,
// Diğer IDE'lerde Lazım olabileceği için buraya koyalım ve öğrenelim.
// Bu bizim oluşturuduğumuz, 'Model, Repository, Service, Controller' gibi @anatasyonların kalıttığı içerisinde @Component anatasonu bulunmakta.
//bu @component anatasyonu miras almış veya kullanılmış her sınıfın @bean'ı oluşmakta ve 'springcontexte' bulunmakta.
//IDE 'nin bunların varlığından haberi olabilmesi için bu "@ComponentScan(basePackages={"En gelenden alacak şekilde"})" en dıştan tüm dosyaları ve classları
//okutacak şekilde yazamamız gerekmekte. Çalıştığı zaman en dıştan hepsini tarayıp hafızaya alıp öyle doğru bir şekilde işlem yapabilmesi için.

@ComponentScan(basePackages = {"com.osmanbatuhan"})
@SpringBootApplication
public class SpringRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiApplication.class, args);
	}

}
