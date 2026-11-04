package io.intercom.android.sdk.blocks.messengercard;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import androidx.annotation.l;
import com.google.gson.f;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public class MessengerCardWebViewPresenter {
    private final File cache;
    private final Context context;
    private final String conversationId;
    private final String fallbackUrl;
    private final f gson;
    private final boolean isHomeScreen;
    private final View loadingView;
    private final MetricTracker metricTracker;

    @l
    private final int primaryColor;
    private final CardWebView webView;

    public MessengerCardWebViewPresenter(CardWebView cardWebView, View view, String str, @l int i10, f fVar, MetricTracker metricTracker, File file, String str2, boolean z10, Context context) {
        this.webView = cardWebView;
        this.loadingView = view;
        this.fallbackUrl = str;
        this.primaryColor = i10;
        this.gson = fVar;
        this.metricTracker = metricTracker;
        this.conversationId = str2;
        this.cache = file;
        this.isHomeScreen = z10;
        this.context = context;
    }

    public static CardWebView createCardWebView(Context context) {
        CardWebView cardWebView;
        try {
            cardWebView = new CardWebView(context);
        } catch (Resources.NotFoundException unused) {
            cardWebView = new CardWebView(Injector.get().getApplication());
        }
        cardWebView.setAlpha(0.0f);
        cardWebView.setId(R.id.intercom_messenger_card_webview);
        cardWebView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        return cardWebView;
    }

    @e.a({"SetJavaScriptEnabled"})
    public void setUpWebView() {
        this.webView.setUp();
        this.webView.setBackgroundColor(0);
        this.webView.setWebViewClient(new MessengerCardWebViewClient(Uri.parse(this.fallbackUrl).getHost()));
        WebSettings settings = this.webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setCacheMode(-1);
        settings.setMixedContentMode(0);
        this.webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        this.webView.setVerticalScrollBarEnabled(false);
        this.webView.setHorizontalScrollBarEnabled(false);
        this.webView.addJavascriptInterface(new MessengerCardWebViewInterface(this.webView, this.loadingView, this.gson, this.primaryColor, this.metricTracker, this.conversationId, this.isHomeScreen, this.context), "AndroidHost");
    }
}
