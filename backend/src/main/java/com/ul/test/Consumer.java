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

    public List<List<Message>> getMessages(int size) {    	    	
    	List<List<Message>> list = new ArrayList<List<Message>>();
    	int count = 0;
    	
    	 while(true) {    		
    		try {
    			if (count % size == 0) {    				
    				list.add(new ArrayList<Message>());    							
    		    }
    			list.get(list.size() - 1).add(queue.take());    			
    			count++;
    			
    			if (queue.isEmpty()) {
    				break;
                }    			
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    	 }
    	 
    	 sortList(list);
    	 
    	 
    	 return list;
    }

	private void sortList(List<List<Message>> lista) {
		IntStream.range(0, lista.size())
    	  .forEach(idx ->    	  
    	      lista.set(idx, sort(lista.get(idx)))    	    
    	  );
	}

	private List<Message> sort(List<Message> messages) {
		List<Message> collect = messages.stream().sorted(new Comparator<Message>() {
			@Override
			public int compare(Message o1, Message o2) {
				return o2.getPriority().getValue() - o1.getPriority().getValue();
			}
		}).collect(Collectors.toList());
		return collect;
	}  
}
