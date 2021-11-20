package com.blazej.sfgdi;

import com.blazej.sfgdi.controllers.ConstructorInjectedController;
import com.blazej.sfgdi.controllers.MyController;
import com.blazej.sfgdi.controllers.PropertyInjectedController;
import com.blazej.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		System.out.println("-------Primary Bean");
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.sayHallo());

		System.out.println("-------Property");

		PropertyInjectedController property = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(property.sayGreeting());

		System.out.println("-------Setter");

		SetterInjectedController setter = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setter.sayGreeting());
		System.out.println("-------Constructor");

		ConstructorInjectedController constructor = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructor.sayGreeting());

	}

}
