package com.ul.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class  Consumer {
    private BlockingQueue<Message> queue;
    
    public Consumer(BlockingQueue<Message> queue) {
        this.queue = queue; 
    }

    public List<String> getMessages() {    	    	
    	List<String> list = new ArrayList<String>();   	
    	
    	try {
    		
    	 while(true) {    		
    			Message message = queue.take();	
    			list.add(message.toString());
    			
    			if(queue.size() == 0) {
    				break;
    			}
    	 }
    	 
    	} catch (InterruptedException e) {
    		e.printStackTrace();
    	}
    	 
    	 return list;
    }
	
}
