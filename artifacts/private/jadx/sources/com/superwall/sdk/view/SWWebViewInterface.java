package com.superwall.sdk.view;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.superwall.sdk.deprecated.PaywallMessage;
import com.superwall.sdk.deprecated.PaywallMessagesKt;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class SWWebViewInterface {

    @NotNull
    private final Context context;

    @NotNull
    private final PaywallMessageDelegate delegate;

    public SWWebViewInterface(@NotNull PaywallMessageDelegate delegate, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.delegate = delegate;
    }

    @JavascriptInterface
    public final void postMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.superwallCore, "SWWebViewInterface: " + message, null, null, 24, null);
        try {
            for (PaywallMessage paywallMessage : PaywallMessagesKt.parseWrappedPaywallMessages(message).getPayload().getMessages()) {
                Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.superwallCore, "SWWebViewInterface:" + paywallMessage.getClass().getSimpleName(), null, null, 24, null);
                this.delegate.didReceiveMessage(paywallMessage);
            }
        } catch (Throwable th2) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.superwallCore, "SWWebViewInterface: Error parsing message" + th2, null, null, 24, null);
        }
    }
}
