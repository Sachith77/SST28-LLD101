package com.example.map;

public class MarkerStyle {

    private final String shapeType;
    private final String colorType;
    private final int sizeValue;
    private final boolean isFilled;

    public MarkerStyle(String shapeType, String colorType, int sizeValue, boolean isFilled) {
        this.shapeType = shapeType;
        this.colorType = colorType;
        this.sizeValue = sizeValue;
        this.isFilled = isFilled;
    }

    public String getShape() { return shapeType; }
    public String getColor() { return colorType; }
    public int getSize() { return sizeValue; }
    public boolean isFilled() { return isFilled; }

    @Override
    public String toString() {
        return shapeType + "|" + colorType + "|" + sizeValue + "|" + (isFilled ? "F" : "O");
    }
}