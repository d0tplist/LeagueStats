package com.lolstats.http;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lolstats.engine.RiotApi;
import com.lolstats.pojo.GameStats;
import com.lolstats.pojo.Item;
import com.lolstats.pojo.PlayerScore;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class RiotClient implements RiotApi {

    private static final String SERVER = "https://127.0.0.1:2999/";

    private final Gson gson = new Gson();
    private String summoner;

    public RiotClient() {
    }

    @Override
    public GameStats getGameStats() {
        return get("liveclientdata/gamestats", GameStats.class);
    }

    @Nullable
    @Override
    public String getSummonerName() {
        return plain("liveclientdata/activeplayername");
    }

    public List<Item> getItems() {
        return getList("liveclientdata/playeritems?summonerName=" + escapeSummonerName(), Item.class);
    }

    @Override
    public PlayerScore getPlayerScore() {
        return get("liveclientdata/playerscores?summonerName=" + escapeSummonerName(), PlayerScore.class);
    }

    private String escapeSummonerName() {
        return URLEncoder.encode(summoner, StandardCharsets.UTF_8);
    }

    @Nullable
    private String plain(String url) {
        return get(url, String.class);
    }

    @Nullable
    private <T> T get(String url, Class<T> type) {
        return mapping(get(url), type);
    }

    @Nullable
    private <T> List<T> getList(String url, Class<T> type) {
        return mappingList(get(url), type);
    }

    @Nullable
    @SuppressWarnings("unchecked")
    private <T> T mapping(@Nullable ResponseBody response, Class<T> type) {

        if (response != null) {

            if (type == String.class) {
                return (T) response.toString();
            }

            gson.fromJson(response.toString(), type);
        }

        return null;
    }

    @Nullable
    @SuppressWarnings("unused")
    private <T> List<T> mappingList(@Nullable ResponseBody response, Class<T> type) {

        Type listOfMyClassObject = new TypeToken<ArrayList<T>>() {
        }.getType();

        if (response != null) {
            gson.fromJson(response.toString(), listOfMyClassObject);
        }

        return null;
    }

    private @Nullable ResponseBody get(String url) {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(SERVER + url)
                .build();


        try (Response response = client.newCall(request).execute()) {
            return response.body();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
