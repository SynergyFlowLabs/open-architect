package io.intercom.android.sdk.articles;

/* JADX INFO: loaded from: classes13.dex */
public interface ArticleWebViewListener {
    void articleNotFound();

    void onArticleFinishedLoading();

    void onArticleLoadingError();

    void onArticleStartedLoading();

    void scrollArticleViewTo(int i10);
}
