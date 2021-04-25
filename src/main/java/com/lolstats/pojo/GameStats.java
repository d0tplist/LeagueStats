package com.lolstats.pojo;

public class GameStats {
    private String gameMode;
    private double gameTime;
    private String mapName;
    private long mapNumber;
    private String mapTerrain;

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String value) {
        this.gameMode = value;
    }

    public double getGameTime() {
        return gameTime;
    }

    public void setGameTime(double value) {
        this.gameTime = value;
    }

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String value) {
        this.mapName = value;
    }

    public long getMapNumber() {
        return mapNumber;
    }

    public void setMapNumber(long value) {
        this.mapNumber = value;
    }

    public String getMapTerrain() {
        return mapTerrain;
    }

    public void setMapTerrain(String value) {
        this.mapTerrain = value;
    }
}
