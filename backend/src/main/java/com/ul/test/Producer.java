package com.ul.test;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

import com.ul.test.Message.Priority;

public final class Producer {
	public static BlockingQueue<Message> queue;
	static  {
		queue = new LinkedBlockingQueue<>(1000);		
	}

	public static void generateMessages(int totalMessages) {
		for (int count = 0; count < totalMessages; count++) {        	
    		try {
				queue.put(new Message("Message to user", generatePriority(), new Date(generateTimestamp())));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }  
	}

	private static long generateTimestamp() {
		return ThreadLocalRandom.current().nextInt() * 1000L;
	}
	
	private static Priority generatePriority () {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(3);
		Priority priority = null;
		
		switch (randomInt) {
		case 0:
			priority = Priority.LOW;
			break;
		case 1:	
			priority = Priority.NORMAL;
			break;
		case 2:
			priority = Priority.HIGH;
			break;
		}
		return priority;
	}
	
}
