package com.planner5d.library.widget.slider;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.widget.c1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDashedProgressSlideIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DashedProgressSlideIndicator.kt\ncom/planner5d/library/widget/slider/DashedProgressSlideIndicator\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,163:1\n51#2,9:164\n85#3,18:173\n*S KotlinDebug\n*F\n+ 1 DashedProgressSlideIndicator.kt\ncom/planner5d/library/widget/slider/DashedProgressSlideIndicator\n*L\n61#1:164,9\n135#1:173,18\n*E\n"})
public final class DashedProgressSlideIndicator extends View {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f258715t = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f258716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f258717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private ValueAnimator f258718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f258719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f258720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f258721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Canvas f258722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f258723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f258724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f258725j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f258726k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private DashPathEffect f258727l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final Path f258728m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final Path f258729n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final Paint f258730o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final Paint f258731s;

    @SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 DashedProgressSlideIndicator.kt\ncom/planner5d/library/widget/slider/DashedProgressSlideIndicator\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 5 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,99:1\n89#2:100\n135#3:101\n88#4:102\n87#5:103\n*E\n"})
    public static final class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f258732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f258733b;

        public a(Function1 function1, int i10) {
            this.f258732a = function1;
            this.f258733b = i10;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f258732a.invoke(Integer.valueOf(this.f258733b));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashedProgressSlideIndicator(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f258716a = true;
        this.f258720e = 2.0f;
        this.f258721f = 8.0f;
        this.f258723h = -1;
        this.f258724i = -16777216;
        this.f258725j = 4;
        this.f258728m = new Path();
        this.f258729n = new Path();
        this.f258730o = new Paint();
        this.f258731s = new Paint();
        b(context, null);
    }

    private final void b(Context context, AttributeSet attributeSet) {
        this.f258723h = context.getColor(c1.e.Yf);
        this.f258724i = context.getColor(c1.e.f250335ag);
        this.f258721f = TypedValue.applyDimension(1, this.f258720e, getResources().getDisplayMetrics());
        if (attributeSet != null) {
            int[] DashedProgressSlideIndicator = c1.s.f253742ig;
            Intrinsics.checkNotNullExpressionValue(DashedProgressSlideIndicator, "DashedProgressSlideIndicator");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DashedProgressSlideIndicator, 0, 0);
            this.f258723h = typedArrayObtainStyledAttributes.getColor(c1.s.f253767jg, this.f258723h);
            this.f258724i = typedArrayObtainStyledAttributes.getColor(c1.s.f253791kg, this.f258724i);
            typedArrayObtainStyledAttributes.recycle();
        }
        e(this.f258730o, this.f258723h);
        e(this.f258731s, this.f258724i);
    }

    private final void e(Paint paint, int i10) {
        paint.setColor(i10);
        paint.setStrokeWidth(this.f258721f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
    }

    private final void f() {
        ValueAnimator valueAnimator = this.f258718c;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = this.f258718c;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
        }
        ValueAnimator valueAnimator3 = this.f258718c;
        if (valueAnimator3 != null) {
            valueAnimator3.end();
        }
        this.f258718c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(DashedProgressSlideIndicator dashedProgressSlideIndicator, int i10, i1.f fVar, Function1 function1, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        dashedProgressSlideIndicator.f258719d = it.getAnimatedFraction();
        dashedProgressSlideIndicator.invalidate();
        int i11 = (int) (i10 * dashedProgressSlideIndicator.f258719d);
        if (fVar.f312749a != i11) {
            fVar.f312749a = i11;
            function1.invoke(Integer.valueOf(i11));
        }
    }

    private final void setProgress(float f10) {
        this.f258719d = f10;
        invalidate();
    }

    public final void c() {
        f();
    }

    public final void d() {
        f();
    }

    public final void g(int i10, final int i11, int i12, @NotNull final Function1<? super Integer, Unit> onPageChange) {
        Intrinsics.checkNotNullParameter(onPageChange, "onPageChange");
        f();
        this.f258725j = i11;
        if (!this.f258716a) {
            setProgress((i10 + 1) / i11);
            requestLayout();
            return;
        }
        final i1.f fVar = new i1.f();
        fVar.f312749a = i10;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(((long) i11) * ((long) i12));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setCurrentFraction(i10 / i11);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.planner5d.library.widget.slider.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DashedProgressSlideIndicator.h(this.f258734a, i11, fVar, onPageChange, valueAnimator);
            }
        });
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new a(onPageChange, i11));
        valueAnimatorOfFloat.start();
        this.f258718c = valueAnimatorOfFloat;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f258722g = canvas;
        super.onDraw(canvas);
        this.f258728m.reset();
        this.f258728m.moveTo(this.f258717b, getHeight() / 2.0f);
        this.f258728m.lineTo(getWidth() - this.f258717b, getHeight() / 2.0f);
        canvas.drawPath(this.f258728m, this.f258731s);
        float f10 = this.f258719d;
        if (f10 > 0.0f) {
            float width = f10 * getWidth();
            this.f258729n.reset();
            this.f258729n.moveTo(this.f258717b, getHeight() / 2.0f);
            this.f258729n.lineTo(width - this.f258717b, getHeight() / 2.0f);
            canvas.drawPath(this.f258729n, this.f258730o);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float width = getWidth();
        int i14 = this.f258725j;
        float f10 = width / i14;
        this.f258717b = (0.1f / i14) * f10;
        if (this.f258726k != f10 || this.f258727l == null) {
            this.f258726k = f10;
            int i15 = 1 >> 1;
            this.f258727l = new DashPathEffect(new float[]{0.9f * f10, f10 * 0.1f}, 0.0f);
        }
        this.f258731s.setPathEffect(this.f258727l);
        this.f258730o.setPathEffect(this.f258727l);
    }

    public final void setAnimated(boolean z10) {
        this.f258716a = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashedProgressSlideIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f258716a = true;
        this.f258720e = 2.0f;
        this.f258721f = 8.0f;
        this.f258723h = -1;
        this.f258724i = -16777216;
        this.f258725j = 4;
        this.f258728m = new Path();
        this.f258729n = new Path();
        this.f258730o = new Paint();
        this.f258731s = new Paint();
        b(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashedProgressSlideIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f258716a = true;
        this.f258720e = 2.0f;
        this.f258721f = 8.0f;
        this.f258723h = -1;
        this.f258724i = -16777216;
        this.f258725j = 4;
        this.f258728m = new Path();
        this.f258729n = new Path();
        this.f258730o = new Paint();
        this.f258731s = new Paint();
        b(context, attributeSet);
    }
}
