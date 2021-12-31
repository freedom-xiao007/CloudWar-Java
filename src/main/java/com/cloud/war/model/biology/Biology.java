package com.cloud.war.model.biology;

import com.cloud.war.model.GameUnit;
import lombok.extern.slf4j.Slf4j;

/**
 * 可以移动的生物单位
 */
@Slf4j
public class Biology extends GameUnit {

    public Biology(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void update() {
        log.debug("{} origin loc: {}", this.getClass().getName(), this.location);
        this.moveUp(10);
        log.debug("{} move to: {}", this.getClass().getName(), this.location);
    }
}
