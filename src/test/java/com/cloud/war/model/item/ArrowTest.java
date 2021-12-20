package com.cloud.war.model.item;

import com.cloud.war.model.CenterPos;
import com.cloud.war.model.GameUnit;
import com.cloud.war.model.biology.Biology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrowTest {

    @Test
    public void shootNegativeLocTest() {
        final GameUnit target = new Biology(50, 50, 10, 10);
        final Arrow arrow = new Arrow(100, 100, target);
        final CenterPos arrowCenter = new CenterPos(arrow.getLocation());
        final CenterPos targetCenter = new CenterPos(target.getLocation());
        final int steps = Math.abs(Math.max(arrowCenter.getX(), arrowCenter.getY()) - Math.min(targetCenter.getX(), targetCenter.getY())) / arrow.getSpeed();
        for (int i = 0; i < steps + 1; i++) {
            arrow.update();
        }
        Assertions.assertTrue(arrow.getLocation().isCollision(target.getLocation()));
    }

    @Test
    public void shootPositiveLocTest() {
        final GameUnit target = new Biology(150, 150, 10, 10);
        final Arrow arrow = new Arrow(100, 100, target);
        final CenterPos arrowCenter = new CenterPos(arrow.getLocation());
        final CenterPos targetCenter = new CenterPos(target.getLocation());
        final int steps = Math.abs(Math.max(arrowCenter.getX(), arrowCenter.getY()) - Math.min(targetCenter.getX(), targetCenter.getY())) / arrow.getSpeed();
        for (int i = 0; i < steps + 1; i++) {
            arrow.update();
        }
        Assertions.assertTrue(arrow.getLocation().isCollision(target.getLocation()));
    }
}
