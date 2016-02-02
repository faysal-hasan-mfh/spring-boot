package mfh.spring.boot.controller;

import java.math.BigInteger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mfh.boot.model.Greetings;

@RestController
public class BootController {

	private static BigInteger nextID;
	private static Map<BigInteger, Greetings> greetingMap;
	
	private static Greetings save(Greetings greeting){
		
		if(greetingMap == null)
		{
			greetingMap=new HashMap<BigInteger, Greetings>();
			nextID = BigInteger.ONE;
			
		}
		
		greeting.setId(nextID);
		nextID=nextID.add(BigInteger.ONE);
		greetingMap.put(greeting.getId(),greeting);
		
		return greeting;
		
	}
	
	static{
		Greetings g1=new Greetings();
		g1.setText("Hello World...........");
		save(g1);
		
		Greetings g2=new Greetings();
		g2.setText("Hello World...........FUCK YOU>>>>>> MFH");
		save(g2);
		
	}
	
	@RequestMapping(value="/api/greetings", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON)
	
	public ResponseEntity<Collection<Greetings>> getGreetings()
	{
		Collection<Greetings> greeting= greetingMap.values();
		return new ResponseEntity<Collection<Greetings>>(greeting,HttpStatus.OK);
		
	}
	
	
	
}
