package com.cloud.war.model.biology;

import com.cloud.war.model.GameUnit;

/**
 * 可以移动的生物单位
 */
public class Biology extends GameUnit {

    public Biology(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void update() {
    }
}
