package io.intercom.android.sdk.helpcenter.articles;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import io.intercom.android.sdk.articles.ArticleWebViewListener;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomArticleActivity$onCreate$1$1$3$1$1$1$1 implements ArticleWebViewListener {
    final /* synthetic */ WebView $this_apply;
    final /* synthetic */ IntercomArticleActivity this$0;

    IntercomArticleActivity$onCreate$1$1$3$1$1$1$1(IntercomArticleActivity intercomArticleActivity, WebView webView) {
        this.this$0 = intercomArticleActivity;
        this.$this_apply = webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onArticleFinishedLoading$lambda$0(IntercomArticleActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ArticleViewModel viewModel = this$0.getViewModel();
        Intrinsics.checkNotNull(str);
        viewModel.articleContentIdFetched(StringsKt.m4(str, "\""));
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void articleNotFound() {
        this.this$0.getViewModel().articleNotFound();
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void onArticleFinishedLoading() {
        this.this$0.getViewModel().onArticleFinishedLoading();
        WebView webView = this.$this_apply;
        final IntercomArticleActivity intercomArticleActivity = this.this$0;
        webView.evaluateJavascript("window.alexandriaArticleContentId", new ValueCallback() { // from class: io.intercom.android.sdk.helpcenter.articles.t
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                IntercomArticleActivity$onCreate$1$1$3$1$1$1$1.onArticleFinishedLoading$lambda$0(intercomArticleActivity, (String) obj);
            }
        });
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void onArticleLoadingError() {
        this.this$0.getViewModel().onArticleLoadingError();
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void onArticleStartedLoading() {
        this.this$0.getViewModel().onArticleStartedLoading();
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void scrollArticleViewTo(int i10) {
        this.this$0.getViewModel().scrollArticleViewTo(i10);
    }
}
