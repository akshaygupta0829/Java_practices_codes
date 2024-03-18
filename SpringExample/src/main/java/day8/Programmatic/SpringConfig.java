package day8.Programmatic;

import org.springframework.context.annotation.Scope;

import day7.GreetingService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import day7.HelloService;
import day7.WelcomeService;
import day8.UserGreetingService;
import day8.UserService;

@Configuration
@ComponentScan
public class SpringConfig {
@Bean
	public GreetingService helloBean() {
			GreetingService service = new HelloService();
			return service;
	}
@Bean
	public GreetingService welcomeBean() {
		GreetingService service = new WelcomeService();
		return service;
	}
@Bean("myUserBean")
	public GreetingService userBean() {
		GreetingService service = new UserService();
		return service;
	}
@Bean("greetBean")
@Scope("prototype")
@Lazy
public GreetingService userGreetingBean() {
	GreetingService service = new UserGreetingService("Welcome", 45, "Jack");
	return service;
}
}
