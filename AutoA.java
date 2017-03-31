/**
 * 
 */
package com.spring.samples;

/**
 * @author SURYA
 *
 */
public class AutoA {
	 AutoB b;

	/**
	 * 
	 */
	public AutoA() {
		// TODO Auto-generated constructor stub
		System.out.println("AutoA is created");
	}

	public AutoB getB() {
		return b;
	}

	public void setB(AutoB b) {
		this.b = b;
	}
	
	public void print()
	{
		System.out.println("Hello A");
	}
	public void display() {
		print();
		b.print();
		
	}

}
