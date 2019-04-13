package com.wipro.service;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MessageServiceTest {
	@Test(timeout=(long) 0.001)
	public void messageServiceTest() {
		MessageService ms = new MessageService();
		String message = ms.getMessage();
		String expected= "HelloWorld!"; 
		Assertions.assertThat(message).isEqualTo(expected); 
	}

}
