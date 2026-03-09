package com.example.map;

import java.util.HashMap;
import java.util.Map;

public class MarkerStyleFactory {

    private final Map<String, MarkerStyle> styleCache = new HashMap<>();

    public MarkerStyle get(String shapeType, String colorType, int sizeValue, boolean isFilled) {

        String cacheKey = shapeType + "|" + colorType + "|" + sizeValue + "|" + (isFilled ? "F" : "O");

        MarkerStyle cachedStyle = styleCache.get(cacheKey);

        if (cachedStyle == null) {
            cachedStyle = new MarkerStyle(shapeType, colorType, sizeValue, isFilled);
            styleCache.put(cacheKey, cachedStyle);
        }

        return cachedStyle;
    }

    public int cacheSize() {
        return styleCache.size();
    }
}