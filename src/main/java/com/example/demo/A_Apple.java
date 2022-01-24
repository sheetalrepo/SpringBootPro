package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Component:
 * This tag make sure Spring will create Object/Bean of this class
 * and will be available in complete project 
 * 
 * @Autowired:
 * This tag make sure Market class's object get initialized
 * 
 * 
 * @author Sheetal_Singh
 */

@Component
public class A_Apple {
	
	@Autowired
	A_Market market;
	
	public void testApple() {
		System.out.println("Test Apple Method...");
		
		market.isOpen();
	}

}
