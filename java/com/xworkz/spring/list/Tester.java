package com.xworkz.spring.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		String metainfo = "fw/Spring.xml";
            ApplicationContext context = new ClassPathXmlApplicationContext(metainfo);
            Countries countries = context.getBean(Countries.class);
            ArrayList<String> countryList = countries.getCountryList();
            ListIterator<String> lIterator = countryList.listIterator();
            System.out.println("Array list usage.");
            System.out.println("******************");
            while(lIterator.hasNext()){
                  System.out.println(lIterator.next());
            }
            System.out.println("*******************************************************");
            
	}

}
