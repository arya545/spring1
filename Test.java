/**
 * 
 */
package com.spring.samples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author SURYA
 *
 */
public class Test {

	/**
	 * 
	 */
	public Test() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		//AutoA a=(AutoA) context.getBean("autoa");
		AutoA a=context.getBean("autoa", AutoA.class);
		a.display();
	}

}
