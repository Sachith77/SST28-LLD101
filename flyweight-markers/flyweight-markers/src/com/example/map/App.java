package com.example.map;

import java.util.List;

public class App {

    public static void main(String[] args) {
        int markerCount = 30_000;

        MapDataSource dataSource = new MapDataSource();
        List<MapMarker> mapMarkers = dataSource.loadMarkers(markerCount);

        new MapRenderer().render(mapMarkers);

        System.out.println();
        System.out.println("Run QuickCheck to verify Flyweight sharing:");
        System.out.println("  java com.example.map.QuickCheck");
    }
}
