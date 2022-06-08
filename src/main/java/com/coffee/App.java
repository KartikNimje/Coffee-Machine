package com.coffee;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac=new  ClassPathXmlApplicationContext("spring.xml");
    	
    	Cafacinoo cafacinoo=ac.getBean(Cafacinoo.class);
    	cafacinoo.typeOfCoffee();
    	cafacinoo.rateOfCoffee();
    	System.out.println(cafacinoo.getCream());
    	
    	/*
    	Xpreso xpreso=ac.getBean(Xpreso.class);
    	xpreso.displayCream();
    	*/
    }
}
