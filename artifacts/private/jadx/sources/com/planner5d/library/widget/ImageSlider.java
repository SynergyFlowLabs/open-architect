package com.planner5d.library.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nImageSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageSlider.kt\ncom/planner5d/library/widget/ImageSlider\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n+ 7 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,169:1\n29#2:170\n85#2,18:171\n13409#3,2:189\n228#4:191\n1#5:192\n1#5:193\n278#6,2:194\n278#6,2:196\n27#7:198\n*S KotlinDebug\n*F\n+ 1 ImageSlider.kt\ncom/planner5d/library/widget/ImageSlider\n*L\n73#1:170\n73#1:171,18\n124#1:189,2\n127#1:191\n127#1:192\n148#1:194,2\n153#1:196,2\n166#1:198\n*E\n"})
public final class ImageSlider extends RelativeLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f249466g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Function2<? super Integer, ? super Integer, Unit> f249467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f249468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final te.t f249469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final ImageView[] f249470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f249471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.preloader.t f249472f;

    public static final class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            ImageSlider.this.l();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            seekBar.animate().alpha(0.0f).setDuration(200L);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            seekBar.animate().alpha(1.0f).setDuration(200L);
        }
    }

    private static final class b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f249474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f249475b;

        public b(int i10, int i11) {
            this.f249474a = i10;
            this.f249475b = i11;
        }

        public final int a() {
            return this.f249475b;
        }

        public final int b() {
            return this.f249474a;
        }

        public final void c(int i10) {
            this.f249475b = i10;
        }

        public final void d(int i10) {
            this.f249474a = i10;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(@NotNull View view, @NotNull Outline outline) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            outline.setRect(0, 0, this.f249474a, this.f249475b);
        }
    }

    @SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 ImageSlider.kt\ncom/planner5d/library/widget/ImageSlider\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 5 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,99:1\n89#2:100\n74#3,2:101\n88#4:103\n87#5:104\n*E\n"})
    public static final class c implements Animator.AnimatorListener {
        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ImageSlider.this.f249469c.f381001i.animate().alpha(1.0f).setDuration(200L);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public ImageSlider(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ClipDrawable d(Bitmap bitmap) {
        BitmapDrawable bitmapDrawable;
        if (bitmap != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            bitmapDrawable = new BitmapDrawable(resources, bitmap);
        } else {
            bitmapDrawable = null;
        }
        return new ClipDrawable(bitmapDrawable, 3, 1);
    }

    private final boolean e() {
        TextView textView = this.f249469c.f380997e;
        CharSequence text = textView.getText();
        boolean z10 = text == null || text.length() == 0;
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(z10 ? 4 : 0);
        return z10;
    }

    private final boolean f() {
        TextView textView = this.f249469c.f381000h;
        CharSequence text = textView.getText();
        boolean z10 = text == null || text.length() == 0;
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(z10 ? 4 : 0);
        return z10;
    }

    private final void g(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c1.s.Ni, i10, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f249469c.f380994b.setCornerRadius(typedArrayObtainStyledAttributes.getDimension(c1.s.Pi, getResources().getDimension(c1.f.Oc)));
        this.f249469c.f380998f.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(c1.s.Oi, getContext().getColor(c1.e.Rf)));
        this.f249469c.f380997e.setText(typedArrayObtainStyledAttributes.getString(c1.s.Qi));
        this.f249469c.f381000h.setText(typedArrayObtainStyledAttributes.getString(c1.s.Ri));
        e();
        f();
        AppCompatSeekBar appCompatSeekBar = this.f249469c.f381001i;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(c1.s.Si);
        if (drawable == null) {
            drawable = com.planner5d.library.widget.drawable.c.f254258a.a(getContext(), c1.g.V7, null);
        }
        appCompatSeekBar.setThumb(drawable);
        Unit unit = Unit.f312394a;
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(ImageSlider imageSlider, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AppCompatSeekBar appCompatSeekBar = imageSlider.f249469c.f381001i;
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        appCompatSeekBar.setProgress(((Integer) animatedValue).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        float progress = (this.f249468b / 10000.0f) * this.f249469c.f381001i.getProgress();
        Drawable drawable = this.f249469c.f380995c.getDrawable();
        ClipDrawable clipDrawable = drawable instanceof ClipDrawable ? (ClipDrawable) drawable : null;
        if (clipDrawable != null) {
            clipDrawable.setLevel(this.f249469c.f381001i.getProgress());
        }
        this.f249469c.f380998f.setX(progress - this.f249471e);
    }

    @Nullable
    public final Function2<Integer, Integer, Unit> getSizesChangedCallback() {
        return this.f249467a;
    }

    public final void h() {
        this.f249469c.f381001i.setAlpha(0.0f);
        ValueAnimator duration = ValueAnimator.ofInt(0, this.f249469c.f381001i.getMax() / 2).setDuration(1000L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.planner5d.library.widget.e0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ImageSlider.i(this.f254292a, valueAnimator);
            }
        });
        Intrinsics.checkNotNull(duration);
        duration.addListener(new c());
        duration.start();
    }

    public final void j() {
        for (ImageView imageView : this.f249470d) {
            imageView.setImageBitmap(null);
        }
    }

    public final void k(@NotNull Bitmap left, @NotNull Bitmap right) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(right, "right");
        this.f249469c.f380995c.setImageDrawable(d(left));
        this.f249469c.f380996d.setImageBitmap(right);
        l();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        Function2<? super Integer, ? super Integer, Unit> function2 = this.f249467a;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(i10), Integer.valueOf(i11));
        }
        this.f249468b = i10;
        setOutlineProvider(new b(i10, i11));
    }

    public final void setLeftSlideImage(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            this.f249469c.f380995c.setImageBitmap(null);
        } else {
            this.f249469c.f380995c.setImageDrawable(d(bitmap));
            l();
        }
    }

    public final void setLoading(boolean z10) {
        com.planner5d.library.widget.preloader.h0 h0VarA = this.f249472f.a();
        if (h0VarA != null) {
            if (z10) {
                h0VarA.a(c1.q.f252895zd, false);
            } else {
                h0VarA.b();
            }
        }
        int i10 = z10 ? 4 : 0;
        this.f249469c.f381001i.setVisibility(i10);
        this.f249469c.f380998f.setVisibility(i10);
        this.f249469c.f380994b.setVisibility(i10);
        if (!e()) {
            this.f249469c.f380997e.setVisibility(i10);
        }
        if (!f()) {
            this.f249469c.f381000h.setVisibility(i10);
        }
    }

    public final void setRightSlideImage(@Nullable Bitmap bitmap) {
        this.f249469c.f380996d.setImageBitmap(bitmap);
    }

    public final void setSizesChangedCallback(@Nullable Function2<? super Integer, ? super Integer, Unit> function2) {
        this.f249467a = function2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public ImageSlider(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ImageSlider(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public ImageSlider(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        te.t tVarA = te.t.a(LayoutInflater.from(context).inflate(c1.l.f252174k2, this));
        Intrinsics.checkNotNullExpressionValue(tVarA, "bind(...)");
        this.f249469c = tVarA;
        this.f249470d = new ImageView[]{tVarA.f380995c, tVarA.f380996d};
        this.f249471e = getResources().getDimensionPixelSize(c1.f.Kd) / 2.0f;
        this.f249472f = new com.planner5d.library.widget.preloader.t(tVarA.f380999g);
        g(attributeSet, i10);
        tVarA.f381001i.setAlpha(0.0f);
        tVarA.f381001i.setOnSeekBarChangeListener(new a());
    }
}
