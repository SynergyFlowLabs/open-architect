package io.customer.messaginginapp.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.f;
import androidx.annotation.g1;
import androidx.annotation.k1;
import io.customer.messaginginapp.gist.data.model.Message;
import io.customer.messaginginapp.ui.bridge.AndroidInAppPlatformDelegate;
import io.customer.messaginginapp.ui.bridge.InAppHostViewDelegateImpl;
import io.customer.messaginginapp.ui.bridge.ModalInAppMessageViewCallback;
import io.customer.messaginginapp.ui.controller.ModalInAppMessageViewController;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class ModalInAppMessageView extends FrameLayout {

    @NotNull
    private final ModalInAppMessageViewController controller;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public ModalInAppMessageView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = (5 | 0) << 0;
    }

    public final void setViewCallback$messaginginapp_release(@NotNull ModalInAppMessageViewCallback viewCallback) {
        Intrinsics.checkNotNullParameter(viewCallback, "viewCallback");
        this.controller.setViewCallback(viewCallback);
    }

    @k1
    public final void setup$messaginginapp_release(@NotNull Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.controller.loadMessage$messaginginapp_release(message);
    }

    @k1
    public final void stopLoading$messaginginapp_release() {
        this.controller.stopLoading$messaginginapp_release();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public ModalInAppMessageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = 2 | 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public ModalInAppMessageView(@NotNull Context context, @Nullable AttributeSet attributeSet, @f int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModalInAppMessageView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public ModalInAppMessageView(@NotNull Context context, @Nullable AttributeSet attributeSet, @f int i10, @g1 int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.controller = new ModalInAppMessageViewController(new InAppHostViewDelegateImpl(this), new AndroidInAppPlatformDelegate(this));
    }
}
