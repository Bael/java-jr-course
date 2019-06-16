package io.github.bael.javaclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class TrainingCenterConfiguration {

    @Bean
    public TrainingCenter trainingCenter() {
        return new BarbarianTrainingCenter();
    }

    // demo of lyfecycle
    @Bean(initMethod = "onInited", destroyMethod = "onDestroy")
    public TrainingCenter trainingCenterLifeCycle() {
        return new KnightTrainingCenter();
    }
}
