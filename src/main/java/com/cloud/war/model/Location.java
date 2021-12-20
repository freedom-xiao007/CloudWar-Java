package com.cloud.war.model;

import lombok.Data;

/**
 * 游戏单位坐标位置
 */
@Data
public class Location {

    /**
     * 左上角坐标点，宽，高
     */
    private int left;
    private int top;
    private int right;
    private int bottom;

    public Location(final int x, final int y, final int width, final int height) {
        this.left = x;
        this.top = y;
        this.right = x + width;
        this.bottom = y + height;
    }

    public boolean isCollision(final Location loc) {
        if (this.getLeft() > loc.getRight()) {
            return false;
        }
        if (this.getRight() < loc.getLeft()) {
            return false;
        }
        if (this.getTop() > loc.getBottom()) {
            return false;
        }
        return !(this.getBottom() < loc.getTop());
    }

    public String toString() {
        return String.format("top: %d, left: %d, right: %d, bottom: %d", top, left, right, bottom);
    }
}
