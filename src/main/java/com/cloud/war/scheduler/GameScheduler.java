package com.cloud.war.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class GameScheduler {

    @Scheduled(fixedRate = 1000)
    public void GameStart() {
        updateLoc();
        collision();
    }

    private void updateLoc() {
        log.debug("update unit location");
    }

    private void collision() {
        log.debug("update unit collision");
    }
}
