package android.example.newsie;

import android.example.newsie.Models.Articles;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse> {
    void onFetchData(List<Articles> list, String message);
    void onError(String message);
}
