package com.superwall.sdk.paywall.view.webview;

import android.webkit.WebView;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSWWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SWWebView.kt\ncom/superwall/sdk/paywall/view/webview/SWWebViewKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,391:1\n1#2:392\n*E\n"})
public final class SWWebViewKt {
    public static final boolean webViewExists() {
        boolean z10 = false;
        try {
            if (WebView.getCurrentWebViewPackage() != null) {
                z10 = true;
            }
        } catch (Throwable unused) {
        }
        return z10;
    }
}
