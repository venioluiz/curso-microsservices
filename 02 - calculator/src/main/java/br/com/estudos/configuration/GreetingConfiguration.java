package br.com.estudos.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties("greeting-service")
public class GreetingConfiguration {
	
	private String greeting;
	private String defaultValue;
		
	
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}


	public String getDefaultValue() {
		return this.defaultValue;
	}


	public String getGreeting() {
		return greeting;
	}


	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	
	
	
}
