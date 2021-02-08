package com.xworkz.spring;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class springTester {

	public static void main(String[] args) {
		String metainfo = "fw/Spring.xml"; 
		ApplicationContext spring = new ClassPathXmlApplicationContext(metainfo);
		
		System.out.println(spring.getBeanDefinitionCount());
		String[] beanNames = spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));
		
		Projector projector = spring.getBean(Projector.class);
		System.out.println(projector);
		
		Ball ball = spring.getBean(Ball.class);
		System.out.println(ball);
		
		Country country = spring.getBean(Country.class);
		System.out.println(country);
	}

}


/* output : 
3
[projector, ball, country]
Projector [life=20, hd=true, maxDistance=10.0, cost=2000.0]
Ball [type=Leather, weight=0.0, usedFor=Cricket]
Country [Country_name=India, primeMinister=Narendra Modi, president=Ram Nath Kovind, capital=Delhi, population=1380004385, noOfStates=29]
*/