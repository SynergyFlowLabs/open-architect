package io.customer.messaginginapp.ui.controller;

import io.customer.messaginginapp.gist.data.model.Message;
import io.customer.messaginginapp.ui.bridge.EngineWebViewDelegate;
import io.customer.messaginginapp.ui.bridge.InAppHostViewDelegate;
import io.customer.messaginginapp.ui.bridge.InAppPlatformDelegate;
import io.customer.messaginginapp.ui.bridge.ModalInAppMessageViewCallback;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ModalInAppMessageViewController extends InAppMessageViewController<ModalInAppMessageViewCallback> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalInAppMessageViewController(@NotNull InAppHostViewDelegate viewDelegate, @NotNull InAppPlatformDelegate platformDelegate) {
        super("Modal", platformDelegate, viewDelegate);
        Intrinsics.checkNotNullParameter(viewDelegate, "viewDelegate");
        Intrinsics.checkNotNullParameter(platformDelegate, "platformDelegate");
        attachEngineWebView$messaginginapp_release();
    }

    private final void clearResourcesIfMessageIdEmpty() {
        Message currentMessage = getCurrentMessage();
        if (currentMessage != null && StringsKt.w3(currentMessage.getMessageId())) {
            logViewEvent("Clearing resources for empty messageId");
            detachEngineWebView$messaginginapp_release();
            setCurrentMessage(null);
        }
    }

    @Override // io.customer.messaginginapp.ui.controller.InAppMessageViewController, io.customer.messaginginapp.gist.presentation.engine.EngineWebViewListener
    public void bootstrapped() {
        super.bootstrapped();
        clearResourcesIfMessageIdEmpty();
    }

    @Override // io.customer.messaginginapp.ui.controller.InAppMessageViewController
    public boolean detachEngineWebView$messaginginapp_release() {
        boolean zDetachEngineWebView$messaginginapp_release = super.detachEngineWebView$messaginginapp_release();
        if (zDetachEngineWebView$messaginginapp_release) {
            setViewCallback(null);
        }
        return zDetachEngineWebView$messaginginapp_release;
    }

    @Override // io.customer.messaginginapp.ui.controller.InAppMessageViewController
    protected void onRouteLoaded(@NotNull Message message, @NotNull String route) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(route, "route");
        EngineWebViewDelegate engineWebViewDelegate = getEngineWebViewDelegate();
        if (engineWebViewDelegate != null) {
            engineWebViewDelegate.setAlpha(1.0f);
        }
        super.onRouteLoaded(message, route);
    }
}
