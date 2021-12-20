package com.cloud.war.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LocationTest {

    @Test
    public void isCollisionTest() {
        final Location loc = new Location(100, 100, 100, 100);

        final Location upLoc = new Location(100, 90, 1, 1);
        Assertions.assertFalse(loc.isCollision(upLoc));

        final Location bottomLoc = new Location(100, 201, 100, 100);
        Assertions.assertFalse(loc.isCollision(bottomLoc));

        final Location leftLoc = new Location(90, 100, 1, 1);
        Assertions.assertFalse(loc.isCollision(leftLoc));

        final Location rightLoc = new Location(100, 201, 1, 1);
        Assertions.assertFalse(loc.isCollision(rightLoc));

        final Location collisionLoc = new Location(101, 101, 100, 100);
        Assertions.assertTrue(loc.isCollision(collisionLoc));
    }
}
