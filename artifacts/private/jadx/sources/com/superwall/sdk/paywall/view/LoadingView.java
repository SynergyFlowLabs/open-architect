package com.superwall.sdk.paywall.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class LoadingView extends FrameLayout implements PaywallPurchaseLoadingView {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String TAG = "LoadingView";

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public LoadingView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = 3 ^ 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // com.superwall.sdk.paywall.view.PaywallPurchaseLoadingView
    public void hideLoading() {
        setVisibility(8);
    }

    @Override // com.superwall.sdk.paywall.view.PaywallPurchaseLoadingView
    public void showLoading() {
        setVisibility(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public LoadingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public LoadingView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ LoadingView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public LoadingView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context.getApplicationContext());
        Intrinsics.checkNotNullParameter(context, "context");
        setTag(TAG);
        setBackgroundColor(0);
        ProgressBar progressBar = new ProgressBar(context.getApplicationContext());
        progressBar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(progressBar);
        setOnTouchListener(new View.OnTouchListener() { // from class: com.superwall.sdk.paywall.view.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return LoadingView._init_$lambda$1(view, motionEvent);
            }
        });
    }
}
