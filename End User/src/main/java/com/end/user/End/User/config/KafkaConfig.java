package com.end.user.End.User.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {
    
    @KafkaListener(topics = AppConstants.LOCTION_UPDATE_TOPIC, groupId = AppConstants.LOCTION_UPDATE_GROUP_ID)
    public void updatedLocation(String value){
        System.out.println("myValue: "+value);
    }

}
