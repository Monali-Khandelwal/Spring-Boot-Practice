package com.springBoot.courseapi;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
                new Topic("Spring", "Spring Farmework", "Spring FrameWork"),
                new Topic("java", "Core Java", "Core Java description"),
                new Topic("javascript", "JavaScript", "JavaScript description")
        );
    public List <Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
}

