package com.superwall.sdk.paywall.view.webview.messaging;

import android.webkit.JavascriptInterface;
import android.webkit.WebViewClient;
import com.devtodev.analytics.internal.storage.sqlite.EventEntry;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.paywall.view.webview.PaywallMessage;
import com.superwall.sdk.paywall.view.webview.PaywallMessageKt;
import com.superwall.sdk.paywall.view.webview.WrappedPaywallMessages;
import java.util.Iterator;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nRawWebMessageHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawWebMessageHandler.kt\ncom/superwall/sdk/paywall/view/webview/messaging/RawWebMessageHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1863#2,2:62\n*S KotlinDebug\n*F\n+ 1 RawWebMessageHandler.kt\ncom/superwall/sdk/paywall/view/webview/messaging/RawWebMessageHandler\n*L\n54#1:62,2\n*E\n"})
public final class RawWebMessageHandler extends WebViewClient {

    @NotNull
    private final WebEventDelegate delegate;

    public RawWebMessageHandler(@NotNull WebEventDelegate delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @JavascriptInterface
    public final void postMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Logger logger = Logger.INSTANCE;
        LogLevel logLevel = LogLevel.debug;
        LogScope logScope = LogScope.paywallView;
        Logger.debug$default(logger, logLevel, logScope, "Did Receive Message", MapsKt.hashMapOf(TuplesKt.to("message", message)), null, 16, null);
        byte[] bytes = message.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        try {
            WrappedPaywallMessages wrappedPaywallMessages = PaywallMessageKt.parseWrappedPaywallMessages(StringsKt.F1(bytes));
            Logger.debug$default(logger, logLevel, logScope, "Body Converted", MapsKt.hashMapOf(TuplesKt.to("message", message), TuplesKt.to(EventEntry.tableName, wrappedPaywallMessages)), null, 16, null);
            Iterator<T> it = wrappedPaywallMessages.getPayload().getMessages().iterator();
            while (it.hasNext()) {
                k.f(t0.a(l1.e()), null, null, new RawWebMessageHandler$postMessage$1$1(this, (PaywallMessage) it.next(), null), 3, null);
            }
        } catch (Throwable unused) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.warn, LogScope.paywallView, "Invalid WrappedPaywallEvent", MapsKt.hashMapOf(TuplesKt.to("message", message)), null, 16, null);
        }
    }
}
