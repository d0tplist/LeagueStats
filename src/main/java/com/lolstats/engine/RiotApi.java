package com.lolstats.engine;

import com.lolstats.pojo.GameStats;
import com.lolstats.pojo.PlayerScore;

public interface RiotApi {

    String getSummonerName();

    PlayerScore getPlayerScore();

    GameStats getGameStats();
}
