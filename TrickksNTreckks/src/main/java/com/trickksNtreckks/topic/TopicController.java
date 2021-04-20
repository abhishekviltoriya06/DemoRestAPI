package com.trickksNtreckks.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopic() {
		
		return Arrays.asList(
				new Topic("spring1","Spring Framework1", "An Application description1"),
				new Topic("spring2","Spring Framework2", "An Application description2"),
				new Topic("spring3","Spring Framework3", "An Application description3")
				);
	}
}
