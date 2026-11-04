package io.intercom.android.sdk.helpcenter.webview;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.facebook.internal.w0;
import com.google.gson.f;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.helpcenter.utils.ConstantsKt;
import io.intercom.android.sdk.helpcenter.webview.HelpCenterWebViewInterface;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class HelpCenterWebViewInterface {
    public static final String METRIC_EVENT = "METRIC_EVENT";
    public static final String TRACK_REACTION = "TRACK_REACTION";
    private final Api api;
    private final f gson;
    private final boolean isFromSearchBrowse;
    private final MetricTracker metricTracker;
    private final WebView webView;

    public HelpCenterWebViewInterface(WebView webView, f fVar, MetricTracker metricTracker, Api api, boolean z10) {
        this.webView = webView;
        this.gson = fVar;
        this.metricTracker = metricTracker;
        this.api = api;
        this.isFromSearchBrowse = z10;
    }

    public static /* synthetic */ void a(HelpCenterWebViewInterface helpCenterWebViewInterface, Map map) {
        helpCenterWebViewInterface.getClass();
        Double d10 = (Double) map.get("article_id");
        Double d11 = (Double) map.get("article_content_id");
        Double d12 = (Double) map.get("reaction_index");
        if (d10 != null && d11 != null && d12 != null) {
            helpCenterWebViewInterface.api.reactToLink(String.valueOf(d10.intValue()), String.valueOf(d11.intValue()), d12.intValue(), true);
        }
    }

    public static /* synthetic */ void b(HelpCenterWebViewInterface helpCenterWebViewInterface, Map map) {
        helpCenterWebViewInterface.getClass();
        String str = (String) map.get(w0.f100156c1);
        String str2 = (String) map.get("object");
        String str3 = (String) map.get("place");
        HashMap map2 = new HashMap();
        if (map.get("metadata") instanceof Map) {
            map2.putAll((Map) map.get("metadata"));
        }
        if (helpCenterWebViewInterface.isFromSearchBrowse) {
            map2.put(ConstantsKt.KEY_ARTICLE_SOURCE, "search_browse");
        }
        helpCenterWebViewInterface.metricTracker.educateWebviewMetric(str, str2, str3, map2, MetricTracker.Context.FROM_HELP_CENTER_WEBVIEW);
    }

    @JavascriptInterface
    public void handleAction(String str) {
        HelpCenterWebViewAction helpCenterWebViewAction = (HelpCenterWebViewAction) this.gson.r(str, HelpCenterWebViewAction.class);
        String type = helpCenterWebViewAction.getType();
        final Map<String, Object> value = helpCenterWebViewAction.getValue();
        if (type == null || value == null) {
            return;
        }
        if (type.equals(TRACK_REACTION)) {
            this.webView.post(new Runnable() { // from class: wh.b
                @Override // java.lang.Runnable
                public final void run() {
                    HelpCenterWebViewInterface.a(this.f390587a, value);
                }
            });
        } else if (type.equals(METRIC_EVENT)) {
            this.webView.post(new Runnable() { // from class: wh.a
                @Override // java.lang.Runnable
                public final void run() {
                    HelpCenterWebViewInterface.b(this.f390585a, value);
                }
            });
        }
    }
}
