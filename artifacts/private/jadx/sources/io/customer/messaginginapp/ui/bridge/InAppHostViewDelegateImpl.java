package io.customer.messaginginapp.ui.bridge;

import android.content.Context;
import android.view.ViewGroup;
import io.customer.messaginginapp.gist.presentation.engine.EngineWebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nInAppHostViewDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppHostViewDelegate.kt\nio/customer/messaginginapp/ui/bridge/InAppHostViewDelegateImpl\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,51:1\n254#2:52\n256#2,2:53\n*S KotlinDebug\n*F\n+ 1 InAppHostViewDelegate.kt\nio/customer/messaginginapp/ui/bridge/InAppHostViewDelegateImpl\n*L\n30#1:52\n32#1:53,2\n*E\n"})
public final class InAppHostViewDelegateImpl implements InAppHostViewDelegate {

    @NotNull
    private final ViewGroup view;

    public InAppHostViewDelegateImpl(@NotNull ViewGroup view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    @Override // io.customer.messaginginapp.ui.bridge.InAppHostViewDelegate
    public void addView(@NotNull EngineWebViewDelegate delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.view.addView(delegate.getView());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.customer.messaginginapp.ui.bridge.InAppHostViewDelegate
    @NotNull
    public EngineWebViewDelegate createEngineWebViewInstance() {
        Context context = this.view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new EngineWebView(context, null, 2, 0 == true ? 1 : 0);
    }

    @Override // io.customer.messaginginapp.ui.bridge.InAppHostViewDelegate
    public boolean isVisible() {
        return this.view.getVisibility() == 0;
    }

    @Override // io.customer.messaginginapp.ui.bridge.InAppHostViewDelegate
    public void post(@NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.view.post(new Runnable() { // from class: io.customer.messaginginapp.ui.bridge.a
            @Override // java.lang.Runnable
            public final void run() {
                action.invoke();
            }
        });
    }

    @Override // io.customer.messaginginapp.ui.bridge.InAppHostViewDelegate
    public void removeView(@NotNull EngineWebViewDelegate delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.view.removeView(delegate.getView());
    }

    @Override // io.customer.messaginginapp.ui.bridge.InAppHostViewDelegate
    public void setVisible(boolean z10) {
        this.view.setVisibility(z10 ? 0 : 8);
    }
}
