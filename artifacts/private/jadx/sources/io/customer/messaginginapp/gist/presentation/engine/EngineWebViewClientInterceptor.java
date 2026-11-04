package io.customer.messaginginapp.gist.presentation.engine;

import android.webkit.WebView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface EngineWebViewClientInterceptor {
    void onPageFinished(@NotNull WebView webView, @Nullable String str);
}
