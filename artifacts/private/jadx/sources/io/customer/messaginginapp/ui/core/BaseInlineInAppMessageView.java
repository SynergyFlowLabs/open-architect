package io.customer.messaginginapp.ui.core;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.f;
import androidx.annotation.g1;
import io.customer.messaginginapp.type.InlineMessageActionListener;
import io.customer.messaginginapp.ui.bridge.InAppHostViewDelegateImpl;
import io.customer.messaginginapp.ui.bridge.InAppPlatformDelegate;
import io.customer.messaginginapp.ui.bridge.InlineInAppMessageViewCallback;
import io.customer.messaginginapp.ui.controller.InlineInAppMessageViewController;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseInlineInAppMessageView<P extends InAppPlatformDelegate> extends FrameLayout implements InlineInAppMessageViewCallback {

    @NotNull
    private final f0 controller$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    @rg.a
    public BaseInlineInAppMessageView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InlineInAppMessageViewController controller_delegate$lambda$0(BaseInlineInAppMessageView baseInlineInAppMessageView) {
        return new InlineInAppMessageViewController(new InAppHostViewDelegateImpl(baseInlineInAppMessageView), baseInlineInAppMessageView.getPlatformDelegate());
    }

    @rg.a
    protected final void configureView() {
        getController$messaginginapp_release().setViewCallback(this);
    }

    @NotNull
    public final InlineInAppMessageViewController getController$messaginginapp_release() {
        return (InlineInAppMessageViewController) this.controller$delegate.getValue();
    }

    @Nullable
    public final String getElementId() {
        return getController$messaginginapp_release().getElementId$messaginginapp_release();
    }

    @NotNull
    protected abstract P getPlatformDelegate();

    @rg.a
    protected final void onViewDetached() {
        getController$messaginginapp_release().onDetachedFromWindow$messaginginapp_release();
    }

    @Override // io.customer.messaginginapp.ui.bridge.InAppMessageViewCallback
    public void onViewSizeChanged(int i10, int i11) {
        InlineInAppMessageViewCallback.DefaultImpls.onViewSizeChanged(this, i10, i11);
    }

    public final void setActionListener(@NotNull InlineMessageActionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getController$messaginginapp_release().setActionListener(listener);
    }

    public final void setElementId(@Nullable String str) {
        getController$messaginginapp_release().setElementId$messaginginapp_release(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    @rg.a
    public BaseInlineInAppMessageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    @rg.a
    public BaseInlineInAppMessageView(@NotNull Context context, @Nullable AttributeSet attributeSet, @f int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BaseInlineInAppMessageView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    @rg.a
    public BaseInlineInAppMessageView(@NotNull Context context, @Nullable AttributeSet attributeSet, @f int i10, @g1 int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.controller$delegate = g0.c(new Function0() { // from class: io.customer.messaginginapp.ui.core.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseInlineInAppMessageView.controller_delegate$lambda$0(this.f288384a);
            }
        });
    }
}
