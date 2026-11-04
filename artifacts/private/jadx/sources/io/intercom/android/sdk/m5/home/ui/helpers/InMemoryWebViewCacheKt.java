package io.intercom.android.sdk.m5.home.ui.helpers;

import android.view.ViewGroup;
import android.view.ViewParent;
import io.intercom.android.sdk.blocks.messengercard.CardWebView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class InMemoryWebViewCacheKt {

    @NotNull
    private static Map<String, CardWebView> webViewCache = new LinkedHashMap();

    public static final void cacheWebView(@NotNull String url, @NotNull CardWebView webView) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(webView, "webView");
        String idFromURL = getIdFromURL(url);
        ViewParent parent = webView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webViewCache.put(idFromURL, webView);
    }

    public static final void clearWebViewCache() {
        webViewCache.clear();
    }

    @Nullable
    public static final CardWebView getCachedWebView(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        CardWebView cardWebView = webViewCache.get(getIdFromURL(url));
        if (cardWebView != null) {
            ViewParent parent = cardWebView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(cardWebView);
            }
        }
        return cardWebView;
    }

    private static final String getFromURL(String str, String str2, String str3) {
        int i10 = 4 >> 2;
        return StringsKt.x5(StringsKt.n5(str, str2 + '=', str3), "&", null, 2, null);
    }

    static /* synthetic */ String getFromURL$default(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = str;
        }
        return getFromURL(str, str2, str3);
    }

    private static final String getIdFromURL(String str) {
        return getFromURL$default(str, "card_id", null, 4, null) + '#' + getFromURL(str, "theme", "");
    }
}
