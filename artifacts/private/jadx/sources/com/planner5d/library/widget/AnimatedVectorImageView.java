package com.planner5d.library.widget;

import android.content.Context;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class AnimatedVectorImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f249417c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f249418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f249419b;

    public static final class a extends Animatable2.AnimationCallback {
        a() {
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @oj.j
    public AnimatedVectorImageView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void d() {
        if (this.f249418a) {
            return;
        }
        Drawable drawable = getDrawable();
        AnimatedVectorDrawable animatedVectorDrawable = drawable instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) drawable : null;
        if (animatedVectorDrawable != null) {
            this.f249418a = true;
            animatedVectorDrawable.registerAnimationCallback(this.f249419b);
            animatedVectorDrawable.start();
        }
    }

    public final void e() {
        if (this.f249418a) {
            Drawable drawable = getDrawable();
            AnimatedVectorDrawable animatedVectorDrawable = drawable instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) drawable : null;
            if (animatedVectorDrawable != null) {
                this.f249418a = false;
                animatedVectorDrawable.unregisterAnimationCallback(this.f249419b);
                animatedVectorDrawable.stop();
            }
        }
    }

    public /* synthetic */ AnimatedVectorImageView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public AnimatedVectorImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f249419b = new a();
    }
}
