package io.customer.messaginginapp.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.f;
import androidx.annotation.g1;
import androidx.annotation.l;
import androidx.core.graphics.drawable.c;
import io.customer.messaginginapp.ui.bridge.AndroidInAppPlatformDelegate;
import io.customer.messaginginapp.ui.bridge.InAppPlatformDelegate;
import io.customer.messaginginapp.ui.bridge.InlineInAppMessageViewCallback;
import io.customer.messaginginapp.ui.core.BaseInlineInAppMessageView;
import io.customer.messaginginapp.ui.extensions.InAppMessageViewExtensionsKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class InlineInAppMessageView extends BaseInlineInAppMessageView<AndroidInAppPlatformDelegate> implements InlineInAppMessageViewCallback {

    @NotNull
    private final AndroidInAppPlatformDelegate platformDelegate;

    @NotNull
    private final ProgressBar progressIndicator;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public InlineInAppMessageView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLoadingStarted$lambda$4(InlineInAppMessageView inlineInAppMessageView) {
        inlineInAppMessageView.progressIndicator.setVisibility(0);
        inlineInAppMessageView.progressIndicator.bringToFront();
        return Unit.f312394a;
    }

    private final void setupProgressIndicator(@l int i10) {
        Unit unit;
        Drawable drawableMutate;
        this.progressIndicator.setIndeterminate(true);
        this.progressIndicator.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        try {
            Result.a aVar = Result.Companion;
            Drawable indeterminateDrawable = this.progressIndicator.getIndeterminateDrawable();
            if (indeterminateDrawable == null || (drawableMutate = indeterminateDrawable.mutate()) == null) {
                unit = null;
            } else {
                c.n(c.r(drawableMutate), i10);
                unit = Unit.f312394a;
            }
            Result.m785constructorimpl(unit);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
        this.progressIndicator.setVisibility(8);
        addView(this.progressIndicator);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        onViewDetached();
    }

    @Override // io.customer.messaginginapp.ui.bridge.InlineInAppMessageViewCallback
    public void onLoadingFinished() {
        this.progressIndicator.setVisibility(8);
    }

    @Override // io.customer.messaginginapp.ui.bridge.InlineInAppMessageViewCallback
    public void onLoadingStarted() {
        int i10 = 2 & 0;
        InAppPlatformDelegate.DefaultImpls.animateViewSize$default(getPlatformDelegate(), null, Double.valueOf(48.0d), 100L, new Function0() { // from class: io.customer.messaginginapp.ui.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InlineInAppMessageView.onLoadingStarted$lambda$4(this.f288364a);
            }
        }, null, 17, null);
    }

    @Override // io.customer.messaginginapp.ui.bridge.InlineInAppMessageViewCallback
    public void onNoMessageToDisplay() {
        this.progressIndicator.setVisibility(8);
    }

    public final void setProgressTint(@l int i10) {
        Unit unit;
        Drawable drawableMutate;
        try {
            Result.a aVar = Result.Companion;
            Drawable indeterminateDrawable = this.progressIndicator.getIndeterminateDrawable();
            if (indeterminateDrawable == null || (drawableMutate = indeterminateDrawable.mutate()) == null) {
                unit = null;
            } else {
                c.n(c.r(drawableMutate), i10);
                unit = Unit.f312394a;
            }
            Result.m785constructorimpl(unit);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public InlineInAppMessageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.customer.messaginginapp.ui.core.BaseInlineInAppMessageView
    @NotNull
    public AndroidInAppPlatformDelegate getPlatformDelegate() {
        return this.platformDelegate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public InlineInAppMessageView(@NotNull Context context, @Nullable AttributeSet attributeSet, @f int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ InlineInAppMessageView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public InlineInAppMessageView(@NotNull Context context, @Nullable AttributeSet attributeSet, @f int i10, @g1 int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.platformDelegate = new AndroidInAppPlatformDelegate(this);
        this.progressIndicator = new ProgressBar(context);
        int iResolveThemeColor = InAppMessageViewExtensionsKt.resolveThemeColor(this, R.attr.colorControlActivated, -7829368);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, io.customer.messaginginapp.R.styleable.InlineInAppMessageView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            getController$messaginginapp_release().setElementId$messaginginapp_release(typedArrayObtainStyledAttributes.getString(io.customer.messaginginapp.R.styleable.InlineInAppMessageView_elementId));
            iResolveThemeColor = typedArrayObtainStyledAttributes.hasValue(io.customer.messaginginapp.R.styleable.InlineInAppMessageView_progressTint) ? typedArrayObtainStyledAttributes.getColor(io.customer.messaginginapp.R.styleable.InlineInAppMessageView_progressTint, iResolveThemeColor) : iResolveThemeColor;
            typedArrayObtainStyledAttributes.recycle();
            setupProgressIndicator(iResolveThemeColor);
            configureView();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
