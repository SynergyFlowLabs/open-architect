package io.customer.messaginginapp.ui.core;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.f;
import androidx.annotation.g1;
import io.customer.messaginginapp.ui.bridge.WrapperPlatformDelegate;
import io.customer.messaginginapp.ui.bridge.WrapperStateEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@rg.a
public abstract class WrapperInlineView<T extends WrapperPlatformDelegate> extends BaseInlineInAppMessageView<T> {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public WrapperInlineView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    protected final void initializeView() {
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        configureView();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        onViewDetached();
    }

    @Override // io.customer.messaginginapp.ui.bridge.InlineInAppMessageViewCallback
    public void onLoadingFinished() {
        getPlatformDelegate().sendLoadingStateEvent(WrapperStateEvent.LoadingFinished);
    }

    @Override // io.customer.messaginginapp.ui.bridge.InlineInAppMessageViewCallback
    public void onLoadingStarted() {
        getPlatformDelegate().sendLoadingStateEvent(WrapperStateEvent.LoadingStarted);
    }

    @Override // io.customer.messaginginapp.ui.bridge.InlineInAppMessageViewCallback
    public void onNoMessageToDisplay() {
        getPlatformDelegate().sendLoadingStateEvent(WrapperStateEvent.NoMessageToDisplay);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public WrapperInlineView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public WrapperInlineView(@NotNull Context context, @Nullable AttributeSet attributeSet, @f int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ WrapperInlineView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public WrapperInlineView(@NotNull Context context, @Nullable AttributeSet attributeSet, @f int i10, @g1 int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
