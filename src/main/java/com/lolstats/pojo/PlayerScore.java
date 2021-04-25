package com.lolstats.pojo;

public class PlayerScore {

    private long assists;
    private long creepScore;
    private long deaths;
    private long kills;
    private double wardScore;

    public long getAssists() {
        return assists;
    }

    public void setAssists(long value) {
        this.assists = value;
    }

    public long getCreepScore() {
        return creepScore;
    }

    public void setCreepScore(long value) {
        this.creepScore = value;
    }

    public long getDeaths() {
        return deaths;
    }

    public void setDeaths(long value) {
        this.deaths = value;
    }

    public long getKills() {
        return kills;
    }

    public void setKills(long value) {
        this.kills = value;
    }

    public double getWardScore() {
        return wardScore;
    }

    public void setWardScore(double value) {
        this.wardScore = value;
    }
}
