package com.example.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MapDataSource {

    private static final String[] MARKER_SHAPES = {"PIN", "CIRCLE", "SQUARE"};
    private static final String[] MARKER_COLORS = {"RED", "BLUE", "GREEN", "ORANGE"};
    private static final int[] MARKER_SIZES = {10, 12, 14, 16};

    private final MarkerStyleFactory styleFactory = new MarkerStyleFactory();

    public List<MapMarker> loadMarkers(int totalCount) {

        Random randomGen = new Random(7);
        List<MapMarker> markerList = new ArrayList<>(totalCount);

        for (int idx = 0; idx < totalCount; idx++) {

            double latitude = 12.9000 + randomGen.nextDouble() * 0.2000;
            double longitude = 77.5000 + randomGen.nextDouble() * 0.2000;
            String markerLabel = "M-" + idx;

            String shapeType = MARKER_SHAPES[randomGen.nextInt(MARKER_SHAPES.length)];
            String colorType = MARKER_COLORS[randomGen.nextInt(MARKER_COLORS.length)];
            int sizeValue = MARKER_SIZES[randomGen.nextInt(MARKER_SIZES.length)];
            boolean isFilled = randomGen.nextBoolean();

            MarkerStyle markerStyle = styleFactory.get(shapeType, colorType, sizeValue, isFilled);

            markerList.add(new MapMarker(latitude, longitude, markerLabel, markerStyle));
        }

        return markerList;
    }
}