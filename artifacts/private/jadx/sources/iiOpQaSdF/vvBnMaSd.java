package iiOpQaSdF;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes14.dex */
public final class vvBnMaSd extends WebViewClient {
    public vvBnMaSd(ppLkMjNhB pplkmjnhb) {
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        webResourceRequest.getMethod();
        if ("1".equals(webResourceRequest.getRequestHeaders().get("X-WebEngine-Intercepted"))) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        if (string.contains("impression") || string.contains("viewability")) {
            ooIkJuHyG.f287240uuJkLzXcV.vvBnMaSd(new mmNhBgVfR());
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return false;
    }
}
