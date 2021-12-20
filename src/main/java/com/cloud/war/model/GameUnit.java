package com.cloud.war.model;

import lombok.Data;

import java.util.List;

/**
 * 基础游戏单位
 */
@Data
public abstract class GameUnit {

    protected Location location;

    /**
     * 血量
     */
    protected int bleed;

    /**
     * 每次攻击造成的伤害
     */
    protected int damage;

    public GameUnit(final int x, final int y, final int width, final int height) {
        this.location =  new Location(x, y, width, height);;
    }

    /**
     * 行动函数
     */
    protected void update() {};

    /**
     * 攻击函数
     * @param otherGameUnits other game units
     */
    protected int attack(final List<GameUnit> otherGameUnits) {
        return damage;
    }
}
