package com.cloud.war.model.build;

import com.cloud.war.model.CenterPos;
import com.cloud.war.model.GameUnit;
import com.cloud.war.model.Location;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 弓箭塔
 * 远程攻击建筑单位；空 地 两用
 */
@Slf4j
public class ArcherTower extends GameUnit {

    /**
     * 攻击范围
     */
    private int range = 25;

    public ArcherTower(final int x, final int y, final int width, final int height) {
        super(x, y, width, height);
    }

    public void updateRange(final int updateValue) {
        range += updateValue;
    }

    @Override
    protected int attack(final List<GameUnit> otherGameUnits) {
        final Location attackRange = getAttackRange(this.location, range);
        log.debug(attackRange.toString());
        for (GameUnit otherGameUnit : otherGameUnits) {
            if (otherGameUnit.getLocation().isCollision(attackRange)) {
                shoot(otherGameUnit);
                return 1;
            }
        }
        return 0;
    }

    private Location getAttackRange(final Location location, final int range) {
        final CenterPos centerPos = new CenterPos(location);
        log.debug("center: x - {} ; y - {}", centerPos.getX(), centerPos.getY());
        final int attackX = centerPos.getX() - range;
        final int attackY = centerPos.getY() - range;
        return new Location(attackX, attackY, range * 2, range * 2);
    }

    private void shoot(final GameUnit gameUnit) {
        log.debug("shoot");
    }
}
