package io.intercom.android.sdk.conversation;

import android.webkit.WebView;
import androidx.annotation.l1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public class JavascriptRunner {
    private final Collection<Runnable> actionsAfterLoad;
    private boolean hasLoaded;
    private final WebView webView;

    public JavascriptRunner(WebView webView) {
        this(webView, new ArrayList());
    }

    public synchronized void clearPendingScripts() {
        try {
            this.actionsAfterLoad.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void reset() {
        try {
            this.hasLoaded = false;
            clearPendingScripts();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void run(final String str) {
        try {
            Runnable runnable = new Runnable() { // from class: io.intercom.android.sdk.conversation.JavascriptRunner.1
                @Override // java.lang.Runnable
                public void run() {
                    JavascriptRunner.this.webView.loadUrl("javascript:" + str);
                }
            };
            if (this.hasLoaded) {
                this.webView.post(runnable);
            } else {
                this.actionsAfterLoad.add(runnable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void runPendingScripts() {
        try {
            this.hasLoaded = true;
            Iterator<Runnable> it = this.actionsAfterLoad.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            clearPendingScripts();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @l1
    JavascriptRunner(WebView webView, Collection<Runnable> collection) {
        this.hasLoaded = false;
        this.webView = webView;
        this.actionsAfterLoad = collection;
    }
}
