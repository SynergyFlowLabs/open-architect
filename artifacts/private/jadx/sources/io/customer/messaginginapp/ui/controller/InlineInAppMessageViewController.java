package io.customer.messaginginapp.ui.controller;

import androidx.annotation.k1;
import androidx.annotation.l1;
import io.customer.messaginginapp.gist.data.model.Message;
import io.customer.messaginginapp.gist.utilities.ElapsedTimer;
import io.customer.messaginginapp.state.InAppMessagingAction;
import io.customer.messaginginapp.state.InAppMessagingState;
import io.customer.messaginginapp.state.InlineMessageState;
import io.customer.messaginginapp.ui.bridge.EngineWebViewDelegate;
import io.customer.messaginginapp.ui.bridge.InAppHostViewDelegate;
import io.customer.messaginginapp.ui.bridge.InAppPlatformDelegate;
import io.customer.messaginginapp.ui.bridge.InlineInAppMessageViewCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.v0;
import kotlin.k0;
import kotlin.reflect.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class InlineInAppMessageViewController extends InAppMessageViewController<InlineInAppMessageViewCallback> {
    static final /* synthetic */ o<Object>[] $$delegatedProperties = {j1.k(new v0(InlineInAppMessageViewController.class, "elementId", "getElementId$messaginginapp_release()Ljava/lang/String;", 0)), j1.k(new v0(InlineInAppMessageViewController.class, "contentWidthInDp", "getContentWidthInDp$messaginginapp_release()Ljava/lang/Double;", 0)), j1.k(new v0(InlineInAppMessageViewController.class, "contentHeightInDp", "getContentHeightInDp$messaginginapp_release()Ljava/lang/Double;", 0))};

    @NotNull
    private final kotlin.properties.f contentHeightInDp$delegate;

    @NotNull
    private final kotlin.properties.f contentWidthInDp$delegate;

    @NotNull
    private final ElapsedTimer elapsedTimer;

    @NotNull
    private final kotlin.properties.f elementId$delegate;

    static {
        int i10 = 2 >> 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @l1(otherwise = 2)
    public InlineInAppMessageViewController(@NotNull InAppHostViewDelegate viewDelegate, @NotNull InAppPlatformDelegate platformDelegate, @NotNull ElapsedTimer elapsedTimer) {
        super("Inline", platformDelegate, viewDelegate);
        Intrinsics.checkNotNullParameter(viewDelegate, "viewDelegate");
        Intrinsics.checkNotNullParameter(platformDelegate, "platformDelegate");
        Intrinsics.checkNotNullParameter(elapsedTimer, "elapsedTimer");
        this.elapsedTimer = elapsedTimer;
        this.elementId$delegate = ThreadSafeController.threadSafeWithNotification$default(this, null, new Function2() { // from class: io.customer.messaginginapp.ui.controller.f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return InlineInAppMessageViewController.elementId_delegate$lambda$0(this.f288374a, (String) obj, (String) obj2);
            }
        }, 1, null);
        this.contentWidthInDp$delegate = ThreadSafeController.threadSafe$default(this, null, 1, null);
        this.contentHeightInDp$delegate = ThreadSafeController.threadSafe$default(this, null, 1, null);
        viewDelegate.setVisible(false);
        subscribeToStore();
    }

    @k1
    private final void detachAndCleanupEngineWebView() {
        logViewEvent("Detaching and cleaning up EngineWebView");
        EngineWebViewDelegate engineWebViewDelegate = getEngineWebViewDelegate();
        detachEngineWebView$messaginginapp_release();
        if (engineWebViewDelegate != null) {
            engineWebViewDelegate.releaseResources();
        }
    }

    @k1
    private final void dismissMessage(Message message, final Function0<Unit> function0) {
        logViewEvent("Dismissing inline message: " + message.getMessageId());
        stopEngineWebViewLoading();
        getViewDelegate().post(new Function0() { // from class: io.customer.messaginginapp.ui.controller.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InlineInAppMessageViewController.dismissMessage$lambda$8(this.f288371a, function0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dismissMessage$lambda$8(final InlineInAppMessageViewController inlineInAppMessageViewController, final Function0 function0) {
        InAppPlatformDelegate.DefaultImpls.animateViewSize$default(inlineInAppMessageViewController.getPlatformDelegate(), null, Double.valueOf(0.0d), null, null, new Function0() { // from class: io.customer.messaginginapp.ui.controller.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InlineInAppMessageViewController.dismissMessage$lambda$8$lambda$7(this.f288369a, function0);
            }
        }, 13, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dismissMessage$lambda$8$lambda$7(InlineInAppMessageViewController inlineInAppMessageViewController, Function0 function0) {
        inlineInAppMessageViewController.setCurrentMessage(null);
        inlineInAppMessageViewController.getViewDelegate().setVisible(false);
        inlineInAppMessageViewController.setContentWidthInDp$messaginginapp_release(null);
        inlineInAppMessageViewController.setContentHeightInDp$messaginginapp_release(null);
        inlineInAppMessageViewController.setShouldDispatchDisplayEvent(true);
        inlineInAppMessageViewController.detachAndCleanupEngineWebView();
        InlineInAppMessageViewCallback viewCallback = inlineInAppMessageViewController.getViewCallback();
        if (viewCallback != null) {
            viewCallback.onNoMessageToDisplay();
        }
        function0.invoke();
        return Unit.f312394a;
    }

    @k1
    private final void displayMessage(Message message) {
        this.elapsedTimer.start("Displaying inline message: " + message.getMessageId());
        InlineInAppMessageViewCallback viewCallback = getViewCallback();
        if (viewCallback != null) {
            viewCallback.onLoadingStarted();
        }
        attachEngineWebView$messaginginapp_release();
        getViewDelegate().setVisible(true);
        loadMessage$messaginginapp_release(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit elementId_delegate$lambda$0(InlineInAppMessageViewController inlineInAppMessageViewController, String str, String str2) {
        if (!Intrinsics.areEqual(str, str2)) {
            inlineInAppMessageViewController.logViewEvent("Element ID changed from " + str + " to " + str2);
            inlineInAppMessageViewController.onElementIdChanged();
        }
        return Unit.f312394a;
    }

    @k1
    private final void embedMessage(final Message message) {
        logViewEvent("Loading inline message: " + message.getMessageId());
        Message currentMessage = getCurrentMessage();
        if (currentMessage == null) {
            displayMessage(message);
        } else {
            dismissMessage(currentMessage, new Function0() { // from class: io.customer.messaginginapp.ui.controller.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InlineInAppMessageViewController.embedMessage$lambda$6(this.f288379a, message);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit embedMessage$lambda$6(InlineInAppMessageViewController inlineInAppMessageViewController, Message message) {
        inlineInAppMessageViewController.displayMessage(message);
        return Unit.f312394a;
    }

    public static /* synthetic */ void getContentHeightInDp$messaginginapp_release$annotations() {
    }

    public static /* synthetic */ void getContentWidthInDp$messaginginapp_release$annotations() {
    }

    public static /* synthetic */ void getElementId$messaginginapp_release$annotations() {
    }

    private final void onElementIdChanged() {
        final InAppMessagingState currentState = getInAppMessagingManager().getCurrentState();
        getViewDelegate().post(new Function0() { // from class: io.customer.messaginginapp.ui.controller.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InlineInAppMessageViewController.onElementIdChanged$lambda$4(this.f288375a, currentState);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onElementIdChanged$lambda$4(InlineInAppMessageViewController inlineInAppMessageViewController, InAppMessagingState inAppMessagingState) {
        inlineInAppMessageViewController.refreshViewState(inAppMessagingState);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWebViewSizeUpdated$lambda$11(final InlineInAppMessageViewController inlineInAppMessageViewController, double d10, double d11) {
        inlineInAppMessageViewController.getPlatformDelegate().animateViewSize(Double.valueOf(d10), Double.valueOf(d11), null, new Function0() { // from class: io.customer.messaginginapp.ui.controller.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InlineInAppMessageViewController.onWebViewSizeUpdated$lambda$11$lambda$10(this.f288373a);
            }
        }, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWebViewSizeUpdated$lambda$11$lambda$10(InlineInAppMessageViewController inlineInAppMessageViewController) {
        EngineWebViewDelegate engineWebViewDelegate = inlineInAppMessageViewController.getEngineWebViewDelegate();
        if (engineWebViewDelegate != null) {
            engineWebViewDelegate.setAlpha(1.0f);
            engineWebViewDelegate.bringToFront();
        }
        InlineInAppMessageViewCallback viewCallback = inlineInAppMessageViewController.getViewCallback();
        if (viewCallback != null) {
            viewCallback.onLoadingFinished();
        }
        return Unit.f312394a;
    }

    @k1
    private final void refreshViewState(InAppMessagingState inAppMessagingState) {
        InlineMessageState message;
        String elementId$messaginginapp_release = getElementId$messaginginapp_release();
        if (elementId$messaginginapp_release == null || (message = inAppMessagingState.getQueuedInlineMessagesState().getMessage(elementId$messaginginapp_release)) == null) {
            return;
        }
        if (message instanceof InlineMessageState.ReadyToEmbed) {
            embedMessage(((InlineMessageState.ReadyToEmbed) message).getMessage());
            return;
        }
        if (message instanceof InlineMessageState.Dismissed) {
            dismissMessage(((InlineMessageState.Dismissed) message).getMessage(), new Function0() { // from class: io.customer.messaginginapp.ui.controller.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.f312394a;
                }
            });
            return;
        }
        if (!(message instanceof InlineMessageState.Embedded)) {
            throw new k0();
        }
        if (getCurrentMessage() == null) {
            InlineMessageState.Embedded embedded = (InlineMessageState.Embedded) message;
            logViewEvent("View recreated, embedding inline message again: " + embedded.getMessage().getMessageId());
            embedMessage(embedded.getMessage());
        }
    }

    private final void subscribeToStore() {
        getInAppMessagingManager().subscribeToState(new Function2() { // from class: io.customer.messaginginapp.ui.controller.h
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(InlineInAppMessageViewController.subscribeToStore$lambda$1(this.f288377a, (InAppMessagingState) obj, (InAppMessagingState) obj2));
            }
        }, new Function1() { // from class: io.customer.messaginginapp.ui.controller.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InlineInAppMessageViewController.subscribeToStore$lambda$3(this.f288378a, (InAppMessagingState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean subscribeToStore$lambda$1(InlineInAppMessageViewController inlineInAppMessageViewController, InAppMessagingState oldState, InAppMessagingState newState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        Intrinsics.checkNotNullParameter(newState, "newState");
        String elementId$messaginginapp_release = inlineInAppMessageViewController.getElementId$messaginginapp_release();
        if (elementId$messaginginapp_release == null) {
            return true;
        }
        return Intrinsics.areEqual(oldState.getQueuedInlineMessagesState().getMessage(elementId$messaginginapp_release), newState.getQueuedInlineMessagesState().getMessage(elementId$messaginginapp_release));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToStore$lambda$3(final InlineInAppMessageViewController inlineInAppMessageViewController, final InAppMessagingState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        inlineInAppMessageViewController.getViewDelegate().post(new Function0() { // from class: io.customer.messaginginapp.ui.controller.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InlineInAppMessageViewController.subscribeToStore$lambda$3$lambda$2(this.f288367a, state);
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToStore$lambda$3$lambda$2(InlineInAppMessageViewController inlineInAppMessageViewController, InAppMessagingState inAppMessagingState) {
        inlineInAppMessageViewController.refreshViewState(inAppMessagingState);
        return Unit.f312394a;
    }

    @Nullable
    public final Double getContentHeightInDp$messaginginapp_release() {
        return (Double) this.contentHeightInDp$delegate.getValue(this, $$delegatedProperties[2]);
    }

    @Nullable
    public final Double getContentWidthInDp$messaginginapp_release() {
        return (Double) this.contentWidthInDp$delegate.getValue(this, $$delegatedProperties[1]);
    }

    @Nullable
    public final String getElementId$messaginginapp_release() {
        return (String) this.elementId$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final void onDetachedFromWindow$messaginginapp_release() {
        Message currentMessage = getCurrentMessage();
        if (currentMessage == null) {
            return;
        }
        String elementId$messaginginapp_release = getElementId$messaginginapp_release();
        if (!getPlatformDelegate().shouldDestroyViewOnDetach()) {
            logViewEvent("Skipping destroy for inline message view for " + elementId$messaginginapp_release + " — likely config change or temporary detach");
            return;
        }
        logViewEvent("View detached from window, dismissing inline message view for " + elementId$messaginginapp_release + " ");
        boolean z10 = true & false;
        getInAppMessagingManager().dispatch(new InAppMessagingAction.DismissMessage(currentMessage, false, false));
    }

    @Override // io.customer.messaginginapp.ui.controller.InAppMessageViewController
    protected void onWebViewSizeUpdated(final double d10, final double d11) {
        super.onWebViewSizeUpdated(d10, d11);
        getViewDelegate().post(new Function0() { // from class: io.customer.messaginginapp.ui.controller.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InlineInAppMessageViewController.onWebViewSizeUpdated$lambda$11(this.f288381a, d10, d11);
            }
        });
    }

    public final void setContentHeightInDp$messaginginapp_release(@Nullable Double d10) {
        this.contentHeightInDp$delegate.setValue(this, $$delegatedProperties[2], d10);
    }

    public final void setContentWidthInDp$messaginginapp_release(@Nullable Double d10) {
        this.contentWidthInDp$delegate.setValue(this, $$delegatedProperties[1], d10);
    }

    public final void setElementId$messaginginapp_release(@Nullable String str) {
        this.elementId$delegate.setValue(this, $$delegatedProperties[0], str);
    }

    @Override // io.customer.messaginginapp.ui.controller.InAppMessageViewController, io.customer.messaginginapp.gist.presentation.engine.EngineWebViewListener
    public void sizeChanged(double d10, double d11) {
        if (getCurrentMessage() != null && (!Intrinsics.areEqual(getContentWidthInDp$messaginginapp_release(), d10) || !Intrinsics.areEqual(getContentHeightInDp$messaginginapp_release(), d11))) {
            setContentWidthInDp$messaginginapp_release(Double.valueOf(d10));
            setContentHeightInDp$messaginginapp_release(Double.valueOf(d11));
            super.sizeChanged(d10, d11);
            this.elapsedTimer.end();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InlineInAppMessageViewController(@NotNull InAppHostViewDelegate viewDelegate, @NotNull InAppPlatformDelegate platformDelegate) {
        this(viewDelegate, platformDelegate, new ElapsedTimer());
        Intrinsics.checkNotNullParameter(viewDelegate, "viewDelegate");
        Intrinsics.checkNotNullParameter(platformDelegate, "platformDelegate");
    }
}
