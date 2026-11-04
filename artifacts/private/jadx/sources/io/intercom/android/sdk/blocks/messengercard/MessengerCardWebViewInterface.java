package io.intercom.android.sdk.blocks.messengercard;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.l;
import androidx.appcompat.app.c;
import com.facebook.internal.w0;
import com.google.gson.f;
import io.intercom.android.sdk.activities.IntercomSheetActivity;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityLauncher;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
class MessengerCardWebViewInterface {
    private static final String HEIGHT_CHANGE_EVENT = "HEIGHT_CHANGE_EVENT";
    private static final String INPUT_TEXT = "INPUT_TEXT";
    private static final Double MESSENGER_APP_ID_ARTICLE_SEARCH = Double.valueOf(27.0d);
    private static final String METRIC_EVENT = "METRIC_EVENT";
    private static final String OPEN_SHEET = "OPEN_SHEET";
    private static final String OPEN_URL = "OPEN_URL";
    private final Context context;
    private final String conversationId;
    private final f gson;
    private final Boolean isHomescreen;
    private final View loadingView;
    private final MetricTracker metricTracker;
    private final int primaryColor;
    private final WebView webView;

    MessengerCardWebViewInterface(WebView webView, View view, f fVar, @l int i10, MetricTracker metricTracker, String str, boolean z10, Context context) {
        this.webView = webView;
        this.loadingView = view;
        this.gson = fVar;
        this.primaryColor = i10;
        this.metricTracker = metricTracker;
        this.conversationId = str;
        this.isHomescreen = Boolean.valueOf(z10);
        this.context = context;
    }

    private void displayArticle(String str, Context context) {
        context.startActivity(IntercomArticleActivity.buildIntent(context, new IntercomArticleActivity.ArticleActivityArguments(str, this.isHomescreen.booleanValue() ? MetricTracker.Place.MESSENGER_HOME_APP : "conversation", false, !this.isHomescreen.booleanValue())));
    }

    private String getStringFromMap(Map<String, Object> map, String str) {
        return map.containsKey(str) ? String.valueOf(map.get(str)) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openSheet(Map<String, Object> map, Context context) {
        String str = (String) map.get("url");
        Map<String, Object> map2 = map.containsKey("params") ? (Map) map.get("params") : new HashMap<>();
        String stringFromMap = getStringFromMap(map2, "uri");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(stringFromMap)) {
            if ("article-link".equals(getStringFromMap(map2, "action_id")) && map2.containsKey("values")) {
                String stringFromMap2 = getStringFromMap((Map) map2.get("values"), "article_id");
                if (!TextUtils.isEmpty(stringFromMap2)) {
                    displayArticle(stringFromMap2, context);
                    return;
                }
            }
            context.startActivity(IntercomSheetActivity.buildIntent(context, str, map2, stringFromMap, this.conversationId));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openUrl(Map<String, Object> map, Context context) {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) map.get("url"))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showTextInputDialog(Map<String, Object> map, Context context) {
        c cVarCreate = new MessengerCardAlertDialogBuilder(context, map, this.primaryColor, this.webView).create();
        cVarCreate.show();
        cVarCreate.getWindow().setSoftInputMode(5);
        cVarCreate.m(-2).setTextColor(this.primaryColor);
        cVarCreate.m(-1).setTextColor(this.primaryColor);
    }

    @JavascriptInterface
    public void handleAction(String str) {
        final MessengerCardWebViewAction messengerCardWebViewAction = (MessengerCardWebViewAction) this.gson.r(str, MessengerCardWebViewAction.class);
        final Map<String, Object> payload = messengerCardWebViewAction.getPayload();
        String type = messengerCardWebViewAction.getType();
        if (type != null && payload != null) {
            switch (type) {
                case "OPEN_URL":
                    this.webView.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewInterface.1
                        @Override // java.lang.Runnable
                        public void run() {
                            MessengerCardWebViewInterface messengerCardWebViewInterface = MessengerCardWebViewInterface.this;
                            messengerCardWebViewInterface.openUrl(payload, messengerCardWebViewInterface.context);
                        }
                    });
                    break;
                case "HEIGHT_CHANGE_EVENT":
                    if (this.loadingView.getVisibility() == 0) {
                        this.webView.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewInterface.4
                            @Override // java.lang.Runnable
                            public void run() {
                                MessengerCardWebViewInterface.this.loadingView.setVisibility(8);
                                MessengerCardWebViewInterface.this.webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                            }
                        });
                        return;
                    }
                    break;
                case "METRIC_EVENT":
                    this.webView.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewInterface.5
                        @Override // java.lang.Runnable
                        public void run() {
                            Map<String, Object> payload2 = messengerCardWebViewAction.getPayload();
                            MessengerCardWebViewInterface.this.metricTracker.messengerCardWebViewEvent((String) payload2.get(w0.f100156c1), (String) payload2.get("object"), (String) payload2.get("place"), payload2.get("metadata") instanceof Map ? (Map) payload2.get("metadata") : null, MessengerCardWebViewInterface.this.isHomescreen.booleanValue());
                        }
                    });
                    return;
                case "INPUT_TEXT":
                    this.webView.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewInterface.3
                        @Override // java.lang.Runnable
                        public void run() {
                            if (MessengerCardWebViewInterface.MESSENGER_APP_ID_ARTICLE_SEARCH.equals((Double) payload.get("messengerAppId"))) {
                                IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollections(MessengerCardWebViewInterface.this.webView.getContext(), Collections.EMPTY_LIST, MetricTracker.Place.LEGACY_ARTICLE_SEARCH_APP);
                            } else {
                                MessengerCardWebViewInterface messengerCardWebViewInterface = MessengerCardWebViewInterface.this;
                                messengerCardWebViewInterface.showTextInputDialog(payload, messengerCardWebViewInterface.context);
                            }
                        }
                    });
                    return;
                case "OPEN_SHEET":
                    this.webView.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewInterface.2
                        @Override // java.lang.Runnable
                        public void run() {
                            MessengerCardWebViewInterface messengerCardWebViewInterface = MessengerCardWebViewInterface.this;
                            messengerCardWebViewInterface.openSheet(payload, messengerCardWebViewInterface.context);
                        }
                    });
                    return;
            }
        }
    }
}
