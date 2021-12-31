package com.cloud.war.model.item;

import com.cloud.war.model.CenterPos;
import com.cloud.war.model.GameUnit;
import com.cloud.war.model.Location;
import lombok.extern.slf4j.Slf4j;

/**
 * 箭
 */
@Slf4j
public class Arrow extends GameUnit {

    private final GameUnit target;
    private int speed = 3;

    public Arrow(final int x, final int y, final GameUnit target) {
        super(x, y, 2, 8);
        this.target = target;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void update() {
        final CenterPos selfCenter = new CenterPos(location);
        final CenterPos targetCenter = new CenterPos(target.getLocation());
        log.debug("self center: {}, target center: {}", selfCenter, targetCenter);
        final Location preLoc = this.getLocation();
        final int nextX = selfCenter.getX() < targetCenter.getX() ?preLoc.getLeft() + speed : preLoc.getLeft() - speed;
        final int nextY = selfCenter.getY() < targetCenter.getY() ? preLoc.getTop() + speed : preLoc.getTop() - speed;
        this.location = new Location(nextX, nextY, this.getLocation().getWidth(), this.getLocation().getHeight());
        log.info("arrow move: {} -> {}", preLoc, this.location);
    }
}
