package io.amen.springboot.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	    
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
    		   new Topic("001", "Amen", "Nanterre", "1988", 0632),
    		   new Topic("002", "Zied", "Antony", "1990", 0742),
    		   new Topic("003", "Imed", "La Pleine", "1992", 0621),
    		   new Topic("004", "Bassem", "Bagneux", "1991", 0765),
    		   new Topic("005", "Khaled", "Houilles", "1994", 0722)
    			      ));
 
	 public List<Topic> getAllTopics(){
		 return topics;
	 }
	 public Topic getTopic(String id) {
			return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	 }
	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}
	public void updateTopic(String id, Topic topic) {
		
          for(int i = 0; i < topics.size(); i++ ) {
        	  Topic t = topics.get(i);
        	  if (t.getId().equals(id)) {
        		  topics.set(i, topic);
        		  return;
        	  }
          } 
	}
	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
		
	}
	
	
}
