package com.cloud.war.scheduler;

import com.cloud.war.controll.UnitContainer;
import com.cloud.war.model.biology.Biology;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class GameScheduler {

    @Scheduled(fixedRate = 3000)
    public void GameStart() {
        updateLoc();
        collision();
    }

    private void updateLoc() {
        log.debug("update unit location");
        UnitContainer.getInstance().flush();
    }

    private void collision() {
        log.debug("update unit collision");
        UnitContainer.getInstance().collision();
    }

    @Scheduled(fixedRate = 10000)
    public void createEnemy() {
        log.debug("rand create game unit");
        UnitContainer.getInstance().addGameUnits(new Biology(100, 100, 10, 10));
    }
}
