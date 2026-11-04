package com.planner5d.library.widget.preloader.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.widget.c1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nShimmerTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShimmerTextView.kt\ncom/planner5d/library/widget/preloader/shimmer/ShimmerTextView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,104:1\n51#2,9:105\n*S KotlinDebug\n*F\n+ 1 ShimmerTextView.kt\ncom/planner5d/library/widget/preloader/shimmer/ShimmerTextView\n*L\n32#1:105,9\n*E\n"})
public final class ShimmerTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f258571g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f258572h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f258573i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f258574j = 0.8f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f258575k = 1200;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private ValueAnimator f258576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private LinearGradient f258577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Matrix f258578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f258579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f258580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f258581f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public ShimmerTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void j() {
        ValueAnimator valueAnimator = this.f258576a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (getWidth() == 0) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, getWidth() * 2.0f);
        valueAnimatorOfFloat.setDuration(this.f258581f);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.planner5d.library.widget.preloader.shimmer.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ShimmerTextView.k(this.f258606a, valueAnimator2);
            }
        });
        valueAnimatorOfFloat.start();
        this.f258576a = valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(ShimmerTextView shimmerTextView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        shimmerTextView.f258578c.setTranslate(((Float) animatedValue).floatValue() - shimmerTextView.getWidth(), 0.0f);
        LinearGradient linearGradient = shimmerTextView.f258577b;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(shimmerTextView.f258578c);
        }
        shimmerTextView.invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f258576a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == 0) {
            return;
        }
        int currentTextColor = getCurrentTextColor();
        float f10 = i10;
        this.f258577b = new LinearGradient(-f10, 0.0f, f10, 0.0f, new int[]{currentTextColor, Color.argb((int) (255 * this.f258580e), Color.red(this.f258579d), Color.green(this.f258579d), Color.blue(this.f258579d)), currentTextColor}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        getPaint().setShader(this.f258577b);
        j();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public ShimmerTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ShimmerTextView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public ShimmerTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f258578c = new Matrix();
        this.f258579d = -1;
        this.f258580e = 0.8f;
        this.f258581f = f258575k;
        setLayerType(1, null);
        if (attributeSet != null) {
            int[] ShimmerTextView = c1.s.Sx;
            Intrinsics.checkNotNullExpressionValue(ShimmerTextView, "ShimmerTextView");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ShimmerTextView, 0, 0);
            this.f258579d = typedArrayObtainStyledAttributes.getColor(c1.s.Ux, this.f258579d);
            this.f258580e = typedArrayObtainStyledAttributes.getFloat(c1.s.Tx, this.f258580e);
            this.f258581f = typedArrayObtainStyledAttributes.getInt(c1.s.Vx, (int) this.f258581f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
