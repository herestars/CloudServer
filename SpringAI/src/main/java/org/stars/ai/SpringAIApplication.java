package org.stars.ai;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * CloudAI-Orchestrator.SpringAIApplication
 *
 * @author HanZiXin
 * @version 2024/7/18 15:08
 * @apiNote
 **/
@SpringBootApplication
@EnableDubbo
public class SpringAIApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringAIApplication.class, args);
    }
}
