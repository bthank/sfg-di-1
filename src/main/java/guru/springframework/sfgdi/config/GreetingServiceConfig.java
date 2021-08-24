package guru.springframework.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import guru.springframework.sfgdi.services.I18nEnglishGreetingService;
import guru.springframework.sfgdi.services.PrimaryGreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import guru.springframework.sfgdi.services.SetterInjectedGreetingService;

@Configuration
public class GreetingServiceConfig {

	@Profile("EN")
	@Bean
	I18nEnglishGreetingService i18nService() {
		return new I18nEnglishGreetingService();
	}
	
	
	@Bean
	@Primary
	PrimaryGreetingService primaryGreetingService() {
		return new PrimaryGreetingService();
	};
	
	
	// note that Spring context uses the method name as the Bean name
	@Bean
	ConstructorGreetingService constructorGreetingService() {
		return new ConstructorGreetingService();
	}
	
	@Bean
	PropertyInjectedGreetingService propertyInjectedGreetingService() {
		return new PropertyInjectedGreetingService();
	}
	
	@Bean
	SetterInjectedGreetingService setterInjectedGreetingService() {
		return new SetterInjectedGreetingService();
	}
	
}
