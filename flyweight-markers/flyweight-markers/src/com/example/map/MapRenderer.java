package com.example.map;

import java.util.List;

public class MapRenderer {

    public void render(List<MapMarker> markerList) {
        System.out.println("Rendering " + markerList.size() + " markers...");
        int displayedCount = 0;

        for (MapMarker marker : markerList) {
            // Simulate some "rendering" work
            if (displayedCount < 8) {
                System.out.println(formatMarker(marker));
                displayedCount++;
            }
        }

        if (markerList.size() > displayedCount) {
            System.out.println("... (" + (markerList.size() - displayedCount) + " more not shown)");
        }
    }

    private String formatMarker(MapMarker marker) {
        return String.format("%s @ (%.4f, %.4f) style=%s",
                marker.getLabel(), marker.getLat(), marker.getLng(), marker.getStyle());
    }
}
