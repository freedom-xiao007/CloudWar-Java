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
    public void update() {}

    /**
     * 攻击函数
     * @param otherGameUnits other game units
     */
    public int attack(final List<GameUnit> otherGameUnits) {
        return damage;
    }

    protected void moveUp(final int distance) {
        final int top = this.location.getTop();
        final int bottom = this.location.getBottom();
        this.location.setTop(top - distance);
        this.location.setBottom(bottom - distance);
    }

    protected void moveDown(final int distance) {
        final int top = this.location.getTop();
        final int bottom = this.location.getBottom();
        this.location.setTop(top + distance);
        this.location.setBottom(bottom + distance);
    }

    protected void moveLeft(final int distance) {
        final int left = this.location.getLeft();
        final int right = this.location.getRight();
        this.location.setLeft(left - distance);
        this.location.setRight(right - distance);
    }

    protected void moveRight(final int distance) {
        final int left = this.location.getLeft();
        final int right = this.location.getRight();
        this.location.setLeft(left + distance);
        this.location.setRight(right + distance);
    }
}
