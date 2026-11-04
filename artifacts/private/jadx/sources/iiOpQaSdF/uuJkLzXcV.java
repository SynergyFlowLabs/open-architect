package iiOpQaSdF;

import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes14.dex */
public final class uuJkLzXcV extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if ((consoleMessage != null ? consoleMessage.message() : "").contains("OMID")) {
            ooIkJuHyG.f287240uuJkLzXcV.vvBnMaSd(new nnMbVcXsZ());
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        ((WebView.WebViewTransport) message.obj).setWebView(webView);
        message.sendToTarget();
        return true;
    }
}
