package com.codehub.spring.SpringCoreCodeExamples;

import com.codehub.spring.core.services.GreetingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class SpringCoreCodeExamplesApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testSpanishProfile() {

		System.setProperty("spring.profiles.active", "es");

		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");

		GreetingService greetingService = ctx.getBean("greetingService", GreetingService.class);
		assertEquals("Hola Code.Hub!", greetingService.sayGreeting());
	}

	@Test
	public void testFrenchProfile() {

		System.setProperty("spring.profiles.active", "fr");

		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");

		GreetingService greetingService = ctx.getBean("greetingService", GreetingService.class);
		assertEquals("Allo Code.Hub!", greetingService.sayGreeting());
	}

}
