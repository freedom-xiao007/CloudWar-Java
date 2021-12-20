package com.cloud.war.model;

/**
 * 中心坐标
 */
public class CenterPos {

    private final int x;
    private final int y;

    public CenterPos(Location location) {
        this.x = location.getLeft() + location.getWidth() / 2;
        this.y = location.getTop() + location.getHeight() / 2;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "CenterPos{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
