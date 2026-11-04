package io.customer.messaginginapp.gist.presentation.engine;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ih.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes13.dex */
public final class EngineWebView$setup$1$2 extends WebViewClient {
    final /* synthetic */ String $jsonString;
    final /* synthetic */ EngineWebView this$0;

    EngineWebView$setup$1$2(String str, EngineWebView engineWebView) {
        this.$jsonString = str;
        this.this$0 = engineWebView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPageFinished$lambda$0(EngineWebView engineWebView, String str) {
        e.a.a(engineWebView.logger, "JavaScript execution result: " + str, null, 2, null);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        String string = StringsKt.E5("\n                        // Post the JSON message to the current frame's listeners\n                        // Ensures internal JavaScript communication via window.addEventListener('message') remains functional\n                        window.postMessage(" + this.$jsonString + ", '*');\n                        \n                        // Override window.parent.postMessage to route messages to the native Android interface\n                        // This is necessary only for legacy message because WebView can only attach one native interface \n                        // and we have already added it as appInterface.\n                        window.parent.postMessage = function(message) {\n                            window.appInterface.postMessage(JSON.stringify(message));\n                        }\n                    ").toString();
        final EngineWebView engineWebView = this.this$0;
        view.evaluateJavascript(string, new ValueCallback() { // from class: io.customer.messaginginapp.gist.presentation.engine.a
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                EngineWebView$setup$1$2.onPageFinished$lambda$0(engineWebView, (String) obj);
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String description, String str) {
        Intrinsics.checkNotNullParameter(description, "description");
        EngineWebViewListener listener = this.this$0.getListener();
        if (listener != null) {
            listener.error();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        EngineWebViewListener listener = this.this$0.getListener();
        if (listener != null) {
            listener.error();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        EngineWebViewListener listener = this.this$0.getListener();
        if (listener != null) {
            listener.error();
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        int i10 = 4 ^ 0;
        return !StringsKt.u2(url, "https://code.gist.build", false, 2, null);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        EngineWebViewListener listener = this.this$0.getListener();
        if (listener != null) {
            listener.error();
        }
    }
}
