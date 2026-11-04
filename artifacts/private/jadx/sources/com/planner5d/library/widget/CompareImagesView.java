package com.planner5d.library.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class CompareImagesView extends ConstraintLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f249436c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final te.o f249437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f249438b;

    public static final class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            CompareImagesView.this.setImageWidth(i10);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public CompareImagesView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void B(TypedArray typedArray, int i10, ImageView imageView) {
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId != 0) {
            imageView.setImageDrawable(j.a.b(getContext(), resourceId));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ValueAnimator C(final CompareImagesView compareImagesView) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.5f);
        valueAnimatorOfFloat.setDuration(compareImagesView.getResources().getInteger(c1.j.f252073f));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.planner5d.library.widget.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CompareImagesView.D(this.f258405a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(CompareImagesView compareImagesView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        compareImagesView.setProgress(((Float) animatedValue).floatValue());
    }

    private final ValueAnimator getValueAnimator() {
        Object value = this.f249438b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ValueAnimator) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setImageWidth(int i10) {
        if (i10 > 0) {
            ViewGroup.LayoutParams layoutParams = this.f249437a.f380977g.getLayoutParams();
            Intrinsics.checkNotNullExpressionValue(layoutParams, "getLayoutParams(...)");
            layoutParams.width = i10;
            this.f249437a.f380977g.setLayoutParams(layoutParams);
        }
    }

    public static void y(te.o oVar) {
        oVar.f380974d.getLayoutParams().height = oVar.f380975e.getHeight();
        oVar.f380974d.getLayoutParams().width = oVar.f380975e.getWidth();
        oVar.f380976f.setMax(oVar.f380975e.getWidth());
        oVar.f380973c.getLayoutParams().height = oVar.f380975e.getHeight();
        SeekBar seekBar = oVar.f380976f;
        seekBar.setProgress(seekBar.getMax() / 2);
    }

    public final void A() {
        getValueAnimator().start();
    }

    public final void setProgress(float f10) {
        this.f249437a.f380976f.setProgress((int) (f10 * getWidth()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public CompareImagesView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CompareImagesView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public CompareImagesView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        final te.o oVarB = te.o.b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(oVarB, "inflate(...)");
        this.f249437a = oVarB;
        this.f249438b = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.widget.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CompareImagesView.C(this.f258421a);
            }
        });
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c1.s.f254096x8);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            int i11 = c1.s.f254144z8;
            ImageView rightImage = oVarB.f380975e;
            Intrinsics.checkNotNullExpressionValue(rightImage, "rightImage");
            B(typedArrayObtainStyledAttributes, i11, rightImage);
            int i12 = c1.s.f254120y8;
            ImageView leftImage = oVarB.f380974d;
            Intrinsics.checkNotNullExpressionValue(leftImage, "leftImage");
            B(typedArrayObtainStyledAttributes, i12, leftImage);
            int i13 = c1.s.A8;
            ImageButton thumb = oVarB.f380978h;
            Intrinsics.checkNotNullExpressionValue(thumb, "thumb");
            B(typedArrayObtainStyledAttributes, i13, thumb);
            typedArrayObtainStyledAttributes.recycle();
            oVarB.f380976f.setOnSeekBarChangeListener(new a());
            oVarB.f380975e.post(new Runnable() { // from class: com.planner5d.library.widget.p
                @Override // java.lang.Runnable
                public final void run() {
                    CompareImagesView.y(oVarB);
                }
            });
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
