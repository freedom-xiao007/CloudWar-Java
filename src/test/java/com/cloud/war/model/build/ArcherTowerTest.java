package com.cloud.war.model.build;

import com.cloud.war.model.GameUnit;
import com.cloud.war.model.biology.Biology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ArcherTowerTest {

    final ArcherTower archerTower = new ArcherTower(0, 0, 10, 10);

    @Test
    public void attackTest() {
        final List<GameUnit> gameUnits = List.of(new Biology(20, 20, 10, 10));
        Assertions.assertEquals(1, archerTower.attack(gameUnits));

    }

    @Test
    public void unAttackTest() {
        final List<GameUnit> canAttackGameUnits = List.of(new Biology(31, 31, 5, 5));
        Assertions.assertEquals(0, archerTower.attack(canAttackGameUnits));
    }
}
