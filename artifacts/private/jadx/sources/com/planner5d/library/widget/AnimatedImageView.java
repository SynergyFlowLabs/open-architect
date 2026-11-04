package com.planner5d.library.widget;

import android.content.Context;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class AnimatedImageView extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f249413d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f249414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ImageView f249415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private AnimatedImageDrawable f249416c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public AnimatedImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int a(int i10) {
        return (i10 == -1 || i10 >= 0) ? -1 : -2;
    }

    public final void b(@androidx.annotation.v int i10) {
        Drawable drawableDecodeDrawable = this.f249416c;
        if (this.f249414a != i10 || drawableDecodeDrawable == null) {
            try {
                drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(getResources(), i10));
                this.f249414a = i10;
                this.f249416c = drawableDecodeDrawable instanceof AnimatedImageDrawable ? (AnimatedImageDrawable) drawableDecodeDrawable : null;
            } catch (IOException unused) {
                return;
            }
        }
        Intrinsics.checkNotNull(drawableDecodeDrawable);
        this.f249415b.setImageDrawable(drawableDecodeDrawable);
        AnimatedImageDrawable animatedImageDrawable = drawableDecodeDrawable instanceof AnimatedImageDrawable ? (AnimatedImageDrawable) drawableDecodeDrawable : null;
        if (animatedImageDrawable != null) {
            animatedImageDrawable.start();
        }
    }

    public final void c() {
        AnimatedImageDrawable animatedImageDrawable = this.f249416c;
        if (animatedImageDrawable != null) {
            animatedImageDrawable.stop();
        }
    }

    @Override // android.view.View
    public void setLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams == null) {
            return;
        }
        this.f249415b.setLayoutParams(new FrameLayout.LayoutParams(a(layoutParams.width), a(layoutParams.height)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public AnimatedImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AnimatedImageView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public AnimatedImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = new ImageView(context);
        imageView.setAdjustViewBounds(true);
        this.f249415b = imageView;
        addView(imageView);
    }
}
