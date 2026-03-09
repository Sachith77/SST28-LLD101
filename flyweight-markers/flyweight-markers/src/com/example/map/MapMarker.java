package com.example.map;

public class MapMarker {

    private final double latitude;
    private final double longitude;
    private final String markerLabel;

    private final MarkerStyle markerStyle;

    public MapMarker(double latitude, double longitude, String markerLabel, MarkerStyle markerStyle) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.markerLabel = markerLabel;
        this.markerStyle = markerStyle;
    }

    public double getLat() { return latitude; }
    public double getLng() { return longitude; }
    public String getLabel() { return markerLabel; }
    public MarkerStyle getStyle() { return markerStyle; }
}