package com.hadarui.customview.bean;

/**
 * Created by jly on 2017/7/26.
 */

public class PieData {
    private int color;
    private float angle; //角度
    private int value;
    private float percentage; //百分比

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public PieData(float angle, int value, float percentage) {
        this.angle = angle;
        this.value = value;
        this.percentage = percentage;
    }
}
