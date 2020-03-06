package com.ul.test;

import java.util.List;
import java.util.concurrent.BlockingQueue;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ul")
public class TestService {
	
	private BlockingQueue<Message> queue;
	
	@PostConstruct
	public void init() {		
		queue = Producer.queue;		
	}
	
 @RequestMapping(value = "/messages", method = RequestMethod.GET, produces="application/json")
 public List<String> getMessages() {
	 return new Consumer(queue).getMessages();
 }
 
 @RequestMapping(value = "/messages", method = RequestMethod.POST, produces="application/json")
 public String generateMessages(@RequestBody Params generator) {	
	 Producer.generateMessages(generator.getTotal());
	 return "success";
 }

}
