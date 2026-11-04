package io.customer.messaginginapp.ui.controller;

import android.content.ActivityNotFoundException;
import androidx.annotation.k1;
import androidx.annotation.l1;
import io.customer.messaginginapp.di.DIGraphMessagingInAppKt;
import io.customer.messaginginapp.gist.data.model.Message;
import io.customer.messaginginapp.gist.data.model.engine.EngineWebConfiguration;
import io.customer.messaginginapp.gist.presentation.engine.EngineWebViewListener;
import io.customer.messaginginapp.state.InAppMessagingAction;
import io.customer.messaginginapp.state.InAppMessagingManager;
import io.customer.messaginginapp.state.InAppMessagingState;
import io.customer.messaginginapp.type.InAppMessage;
import io.customer.messaginginapp.type.InlineMessageActionListener;
import io.customer.messaginginapp.ui.bridge.EngineWebViewDelegate;
import io.customer.messaginginapp.ui.bridge.InAppHostViewDelegate;
import io.customer.messaginginapp.ui.bridge.InAppMessageViewCallback;
import io.customer.messaginginapp.ui.bridge.InAppPlatformDelegate;
import io.customer.messaginginapp.ui.bridge.UrlQuerySanitizerWrapper;
import java.net.URI;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.v0;
import kotlin.reflect.o;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class InAppMessageViewController<ViewCallback extends InAppMessageViewCallback> extends ThreadSafeController implements EngineWebViewListener {
    static final /* synthetic */ o<Object>[] $$delegatedProperties = {j1.k(new v0(InAppMessageViewController.class, "engineWebViewDelegate", "getEngineWebViewDelegate()Lio/customer/messaginginapp/ui/bridge/EngineWebViewDelegate;", 0)), j1.k(new v0(InAppMessageViewController.class, "currentMessage", "getCurrentMessage()Lio/customer/messaginginapp/gist/data/model/Message;", 0)), j1.k(new v0(InAppMessageViewController.class, "currentRoute", "getCurrentRoute()Ljava/lang/String;", 0)), j1.k(new v0(InAppMessageViewController.class, "viewCallback", "getViewCallback()Lio/customer/messaginginapp/ui/bridge/InAppMessageViewCallback;", 0))};

    @Nullable
    private InlineMessageActionListener actionListener;

    @NotNull
    private final kotlin.properties.f currentMessage$delegate;

    @NotNull
    private final kotlin.properties.f currentRoute$delegate;

    @NotNull
    private final kotlin.properties.f engineWebViewDelegate$delegate;

    @NotNull
    private final InAppMessagingManager inAppMessagingManager;

    @NotNull
    private final ih.e logger;

    @NotNull
    private final InAppPlatformDelegate platformDelegate;
    private boolean shouldDispatchDisplayEvent;

    @NotNull
    private final String type;

    @NotNull
    private final kotlin.properties.f viewCallback$delegate;

    @NotNull
    private final InAppHostViewDelegate viewDelegate;

    public InAppMessageViewController(@NotNull String type, @NotNull InAppPlatformDelegate platformDelegate, @NotNull InAppHostViewDelegate viewDelegate) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(platformDelegate, "platformDelegate");
        Intrinsics.checkNotNullParameter(viewDelegate, "viewDelegate");
        this.type = type;
        this.platformDelegate = platformDelegate;
        this.viewDelegate = viewDelegate;
        eh.d dVar = eh.d.f274883c;
        this.logger = dVar.w();
        this.inAppMessagingManager = DIGraphMessagingInAppKt.getInAppMessagingManager(dVar);
        this.shouldDispatchDisplayEvent = true;
        this.engineWebViewDelegate$delegate = ThreadSafeController.threadSafe$default(this, null, 1, null);
        this.currentMessage$delegate = ThreadSafeController.threadSafe$default(this, null, 1, null);
        this.currentRoute$delegate = ThreadSafeController.threadSafe$default(this, null, 1, null);
        this.viewCallback$delegate = ThreadSafeController.threadSafe$default(this, null, 1, null);
    }

    @l1(otherwise = 4)
    public static /* synthetic */ void getCurrentMessage$annotations() {
    }

    public static /* synthetic */ void getCurrentRoute$annotations() {
    }

    @l1(otherwise = 4)
    public static /* synthetic */ void getEngineWebViewDelegate$annotations() {
    }

    private final void handleTap(String str, String str2, boolean z10) {
        String currentRoute;
        Message currentMessage = getCurrentMessage();
        if (currentMessage == null || (currentRoute = getCurrentRoute()) == null) {
            return;
        }
        this.inAppMessagingManager.dispatch(new InAppMessagingAction.EngineAction.Tap(currentMessage, currentRoute, str, str2));
        InlineMessageActionListener inlineMessageActionListener = this.actionListener;
        if (inlineMessageActionListener != null) {
            InAppMessage fromGistMessage$messaginginapp_release = InAppMessage.Companion.getFromGistMessage$messaginginapp_release(currentMessage);
            logViewEvent("Listener handling action: " + str2 + ", name: " + str);
            inlineMessageActionListener.onActionClick(fromGistMessage$messaginginapp_release, str2, str);
        }
        if (StringsKt.u2(str2, "gist://", false, 2, null)) {
            URI javaURI = this.platformDelegate.parseJavaURI(str2);
            UrlQuerySanitizerWrapper urlQuerySanitizerWrapperSanitizeUrlQuery = this.platformDelegate.sanitizeUrlQuery(str2);
            String host = javaURI.getHost();
            if (host != null) {
                int iHashCode = host.hashCode();
                if (iHashCode != 94756344) {
                    if (iHashCode != 1343084106) {
                        if (iHashCode == 1845475477 && host.equals("loadPage")) {
                            String value = urlQuerySanitizerWrapperSanitizeUrlQuery.getValue("url");
                            logViewEvent("Opening URL: " + value);
                            this.platformDelegate.openUrl(value, false);
                        }
                    } else if (host.equals("showMessage")) {
                        this.inAppMessagingManager.dispatch(new InAppMessagingAction.DismissMessage(currentMessage, false, false, 4, null));
                        String value2 = urlQuerySanitizerWrapperSanitizeUrlQuery.getValue("messageId");
                        Map<String, Object> propertiesFromJson = this.platformDelegate.parsePropertiesFromJson(urlQuerySanitizerWrapperSanitizeUrlQuery.getValue("properties"));
                        logViewEvent("Showing message: " + value2);
                        this.inAppMessagingManager.dispatch(new InAppMessagingAction.LoadMessage(new Message(value2, null, null, propertiesFromJson, 6, null), null, 2, null));
                    }
                } else if (host.equals("close")) {
                    logViewEvent("Dismissing from action: " + str2);
                    this.inAppMessagingManager.dispatch(new InAppMessagingAction.DismissMessage(currentMessage, false, true, 2, null));
                    return;
                }
            }
            logViewEvent("Action unhandled: " + str2);
            return;
        }
        if (z10) {
            try {
                logViewEvent("Dismissing from system action: " + str2);
                this.platformDelegate.openUrl(str2, true);
                this.inAppMessagingManager.dispatch(new InAppMessagingAction.DismissMessage(currentMessage, false, false, 4, null));
                return;
            } catch (ActivityNotFoundException unused) {
                logViewEvent("System action not handled: " + str2);
                return;
            }
        }
        logViewEvent("Action selected: " + str2);
    }

    @k1
    @l1(otherwise = 4)
    public boolean attachEngineWebView$messaginginapp_release() {
        logViewEvent("Attaching EngineWebView");
        if (getEngineWebViewDelegate() != null) {
            logViewEvent("EngineWebView already attached, skipping");
            return false;
        }
        EngineWebViewDelegate engineWebViewDelegateCreateEngineWebViewInstance = this.viewDelegate.createEngineWebViewInstance();
        engineWebViewDelegateCreateEngineWebViewInstance.setAlpha(0.0f);
        engineWebViewDelegateCreateEngineWebViewInstance.setListener(this);
        this.viewDelegate.addView(engineWebViewDelegateCreateEngineWebViewInstance);
        setEngineWebViewDelegate(engineWebViewDelegateCreateEngineWebViewInstance);
        return true;
    }

    @Override // io.customer.messaginginapp.gist.presentation.engine.EngineWebViewListener
    public void bootstrapped() {
        logViewEvent("Engine bootstrapped");
    }

    @k1
    @l1(otherwise = 4)
    public boolean detachEngineWebView$messaginginapp_release() {
        logViewEvent("Detaching EngineWebView");
        EngineWebViewDelegate engineWebViewDelegate = getEngineWebViewDelegate();
        if (engineWebViewDelegate == null) {
            logViewEvent("EngineWebView already detached, skipping");
            return false;
        }
        setEngineWebViewDelegate(null);
        engineWebViewDelegate.setListener(null);
        this.viewDelegate.removeView(engineWebViewDelegate);
        return true;
    }

    @Override // io.customer.messaginginapp.gist.presentation.engine.EngineWebViewListener
    public void error() {
        Message currentMessage = getCurrentMessage();
        String messageId = currentMessage != null ? currentMessage.getMessageId() : null;
        logViewEvent("Error loading engine for message: " + messageId + " on route: " + getCurrentRoute());
        Message currentMessage2 = getCurrentMessage();
        if (currentMessage2 != null) {
            this.inAppMessagingManager.dispatch(new InAppMessagingAction.EngineAction.MessageLoadingFailed(currentMessage2));
        }
    }

    @Nullable
    public final InlineMessageActionListener getActionListener() {
        return this.actionListener;
    }

    @Nullable
    public final Message getCurrentMessage() {
        return (Message) this.currentMessage$delegate.getValue(this, $$delegatedProperties[1]);
    }

    @Nullable
    public final String getCurrentRoute() {
        return (String) this.currentRoute$delegate.getValue(this, $$delegatedProperties[2]);
    }

    @Nullable
    public final EngineWebViewDelegate getEngineWebViewDelegate() {
        return (EngineWebViewDelegate) this.engineWebViewDelegate$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @NotNull
    protected final InAppMessagingManager getInAppMessagingManager() {
        return this.inAppMessagingManager;
    }

    @NotNull
    protected final InAppPlatformDelegate getPlatformDelegate() {
        return this.platformDelegate;
    }

    protected final boolean getShouldDispatchDisplayEvent() {
        return this.shouldDispatchDisplayEvent;
    }

    @NotNull
    protected final String getType() {
        return this.type;
    }

    @Nullable
    public final ViewCallback getViewCallback() {
        return (ViewCallback) this.viewCallback$delegate.getValue(this, $$delegatedProperties[3]);
    }

    @NotNull
    public final InAppHostViewDelegate getViewDelegate() {
        return this.viewDelegate;
    }

    @k1
    public final void loadMessage$messaginginapp_release(@NotNull Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        InAppMessagingState currentState = this.inAppMessagingManager.getCurrentState();
        EngineWebConfiguration engineWebConfiguration = new EngineWebConfiguration(currentState.getSiteId(), currentState.getDataCenter(), message.getMessageId(), message.getInstanceId(), currentState.getEnvironment().getEngineApiUrl(), false, message.getProperties(), 32, null);
        setCurrentMessage(message);
        EngineWebViewDelegate engineWebViewDelegate = getEngineWebViewDelegate();
        if (engineWebViewDelegate != null) {
            engineWebViewDelegate.setup(engineWebConfiguration);
        }
    }

    protected final void logViewEvent(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ih.e.a.a(this.logger, "[InApp][" + this.type + "] " + message, null, 2, null);
    }

    @androidx.annotation.i
    protected void onRouteLoaded(@NotNull Message message, @NotNull String route) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(route, "route");
        this.inAppMessagingManager.dispatch(new InAppMessagingAction.DisplayMessage(message));
    }

    protected void onWebViewSizeUpdated(double d10, double d11) {
        int iDpToPx = this.platformDelegate.dpToPx(d10);
        int iDpToPx2 = this.platformDelegate.dpToPx(d11);
        InAppMessageViewCallback viewCallback = getViewCallback();
        if (viewCallback != null) {
            viewCallback.onViewSizeChanged(iDpToPx, iDpToPx2);
        }
    }

    @Override // io.customer.messaginginapp.gist.presentation.engine.EngineWebViewListener
    public void routeChanged(@NotNull String newRoute) {
        Intrinsics.checkNotNullParameter(newRoute, "newRoute");
        logViewEvent("Route changed: " + newRoute);
    }

    @Override // io.customer.messaginginapp.gist.presentation.engine.EngineWebViewListener
    public void routeError(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        logViewEvent("Route error: " + route);
        Message currentMessage = getCurrentMessage();
        if (currentMessage != null) {
            this.inAppMessagingManager.dispatch(new InAppMessagingAction.EngineAction.MessageLoadingFailed(currentMessage));
        }
    }

    @Override // io.customer.messaginginapp.gist.presentation.engine.EngineWebViewListener
    public final void routeLoaded(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        logViewEvent("Route loaded: " + route);
        setCurrentRoute(route);
        Message currentMessage = getCurrentMessage();
        if (currentMessage != null && this.shouldDispatchDisplayEvent) {
            this.shouldDispatchDisplayEvent = false;
            onRouteLoaded(currentMessage, route);
        }
    }

    public final void setActionListener(@Nullable InlineMessageActionListener inlineMessageActionListener) {
        this.actionListener = inlineMessageActionListener;
    }

    public final void setCurrentMessage(@Nullable Message message) {
        this.currentMessage$delegate.setValue(this, $$delegatedProperties[1], message);
    }

    public final void setCurrentRoute(@Nullable String str) {
        this.currentRoute$delegate.setValue(this, $$delegatedProperties[2], str);
    }

    public final void setEngineWebViewDelegate(@Nullable EngineWebViewDelegate engineWebViewDelegate) {
        this.engineWebViewDelegate$delegate.setValue(this, $$delegatedProperties[0], engineWebViewDelegate);
    }

    protected final void setShouldDispatchDisplayEvent(boolean z10) {
        this.shouldDispatchDisplayEvent = z10;
    }

    public final void setViewCallback(@Nullable ViewCallback viewcallback) {
        this.viewCallback$delegate.setValue(this, $$delegatedProperties[3], viewcallback);
    }

    @Override // io.customer.messaginginapp.gist.presentation.engine.EngineWebViewListener
    public void sizeChanged(double d10, double d11) {
        logViewEvent("Size changed: " + d10 + " x " + d11);
        onWebViewSizeUpdated(d10, d11);
    }

    protected final void stopEngineWebViewLoading() {
        EngineWebViewDelegate engineWebViewDelegate = getEngineWebViewDelegate();
        if (engineWebViewDelegate != null) {
            engineWebViewDelegate.stopLoading();
        }
    }

    @k1
    public final void stopLoading$messaginginapp_release() {
        logViewEvent("Stopping EngineWebView loading");
        stopEngineWebViewLoading();
    }

    @Override // io.customer.messaginginapp.gist.presentation.engine.EngineWebViewListener
    public void tap(@NotNull String name, @NotNull String action, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(action, "action");
        try {
            handleTap(name, action, z10);
        } catch (Exception e10) {
            logViewEvent("Error handling tap: " + e10.getMessage());
        }
    }
}
