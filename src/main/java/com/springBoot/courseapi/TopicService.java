package com.springBoot.courseapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

//    private List<Topic> topics = new ArrayList<>(Arrays.asList(
//                new Topic("spring", "Spring Farmework", "Spring FrameWork"),
//                new Topic("java", "Core Java", "Core Java description"),
//                new Topic("javascript", "JavaScript", "JavaScript description")
//        ));

    public List <Topic> getAllTopics(){
        //return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id){
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        Topic t = topicRepository.findById(id).get();
        return t;
    }

    public void addTopic(Topic topic) {
        //topics.add(topic);
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
//        for(int i =0; i<topics.size(); i++){
//            Topic t = topics.get(i);
//            if(t.getId().equals(id)){
//                topics.set(i,topic);
//                return;
//            }
//        }
    }

    public void deleteTopic(String id) {
        //topics.removeIf(t -> t.getId().equals(id));
        topicRepository.deleteById(id);
    }
}

