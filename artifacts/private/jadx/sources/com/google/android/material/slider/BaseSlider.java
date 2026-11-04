package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import androidx.annotation.l;
import androidx.annotation.l1;
import androidx.annotation.n;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.r;
import androidx.annotation.t0;
import androidx.annotation.v;
import androidx.core.view.accessibility.j;
import androidx.core.view.u1;
import com.google.android.material.internal.g0;
import com.google.android.material.internal.n0;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.a;
import com.google.android.material.slider.b;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends com.google.android.material.slider.a<S>, T extends com.google.android.material.slider.b<S>> extends View {

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private static final String f113759c4 = "BaseSlider";

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private static final String f113760d4 = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private static final String f113761e4 = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private static final String f113762f4 = "valueFrom(%s) must be smaller than valueTo(%s)";

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private static final String f113763g4 = "valueTo(%s) must be greater than valueFrom(%s)";

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private static final String f113764h4 = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    private static final String f113765i4 = "minSeparation(%s) must be greater or equal to 0";

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    private static final String f113766j4 = "minSeparation(%s) cannot be set as a dimension when using stepSize(%s)";

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    private static final String f113767k4 = "minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)";

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    private static final String f113768l4 = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.";

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private static final int f113769m4 = 200;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    private static final int f113770n4 = 63;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    private static final double f113771o4 = 1.0E-4d;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    private static final float f113772p4 = 0.5f;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    static final int f113774r4 = 1;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    static final int f113775s4 = 0;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    private static final int f113776t4 = 83;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    private static final int f113777u4 = 117;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    @r(unit = 0)
    private static final int f113782z4 = 48;
    private float A3;
    private float B3;
    private ArrayList<Float> C3;
    private int D3;
    private int E3;
    private float F3;
    private float[] G3;
    private int H1;
    private boolean H3;
    private int I3;
    private int J3;
    private int K3;
    private boolean L3;
    private boolean M3;
    private boolean N3;

    @NonNull
    private ColorStateList O3;

    @NonNull
    private ColorStateList P3;

    @NonNull
    private ColorStateList Q3;

    @NonNull
    private ColorStateList R3;

    @NonNull
    private ColorStateList S3;

    @NonNull
    private final Path T3;

    @NonNull
    private final RectF U3;

    @NonNull
    private final RectF V3;

    @NonNull
    private final k W3;

    @p0
    private Drawable X3;

    @NonNull
    private List<Drawable> Y3;
    private float Z3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Paint f113783a;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private int f113784a4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final Paint f113785b;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    @NonNull
    private final ViewTreeObserver.OnScrollChangedListener f113786b4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final Paint f113787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final Paint f113788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final Paint f113789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    private final Paint f113790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private final Paint f113791g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private int f113792g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    private final e f113793h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @t0
    private int f113794h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AccessibilityManager f113795i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private int f113796i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private BaseSlider<S, L, T>.d f113797j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private int f113798j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f113799k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private int f113800k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    private final List<com.google.android.material.tooltip.a> f113801l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private int f113802l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    private final List<L> f113803m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private int f113804m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    private final List<T> f113805n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private int f113806n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f113807o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private int f113808o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f113809p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f113810p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private int f113811p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private int f113812p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private int f113813q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private int f113814r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ValueAnimator f113815s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private int f113816s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ValueAnimator f113817t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private int f113818t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private int f113819u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f113820v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private int f113821v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f113822w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private float f113823w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private MotionEvent f113824x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private com.google.android.material.slider.e f113825y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private boolean f113826z3;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    static final int f113773q4 = r6.a.n.Zj;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    private static final int f113778v4 = r6.a.c.Ld;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    private static final int f113779w4 = r6.a.c.Od;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    private static final int f113780x4 = r6.a.c.Vd;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    private static final int f113781y4 = r6.a.c.Td;

    static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f113827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f113828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ArrayList<Float> f113829c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f113830d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f113831e;

        class a implements Parcelable.Creator<SliderState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SliderState createFromParcel(@NonNull Parcel parcel) {
                return new SliderState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SliderState[] newArray(int i10) {
                return new SliderState[i10];
            }
        }

        /* synthetic */ SliderState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeFloat(this.f113827a);
            parcel.writeFloat(this.f113828b);
            parcel.writeList(this.f113829c);
            parcel.writeFloat(this.f113830d);
            parcel.writeBooleanArray(new boolean[]{this.f113831e});
        }

        SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        private SliderState(@NonNull Parcel parcel) {
            super(parcel);
            this.f113827a = parcel.readFloat();
            this.f113828b = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f113829c = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f113830d = parcel.readFloat();
            this.f113831e = parcel.createBooleanArray()[0];
        }
    }

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            Iterator it = BaseSlider.this.f113801l.iterator();
            while (it.hasNext()) {
                ((com.google.android.material.tooltip.a) it.next()).m1(fFloatValue);
            }
            u1.s1(BaseSlider.this);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            n0 n0VarM = com.google.android.material.internal.p0.m(BaseSlider.this);
            Iterator it = BaseSlider.this.f113801l.iterator();
            while (it.hasNext()) {
                n0VarM.a((com.google.android.material.tooltip.a) it.next());
            }
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f113834a;

        static {
            int[] iArr = new int[f.values().length];
            f113834a = iArr;
            try {
                iArr[f.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f113834a[f.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f113834a[f.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f113834a[f.BOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static class e extends androidx.customview.widget.a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final BaseSlider<?, ?, ?> f113837q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final Rect f113838r;

        e(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f113838r = new Rect();
            this.f113837q = baseSlider;
        }

        @NonNull
        private String P(int i10) {
            if (i10 == this.f113837q.getValues().size() - 1) {
                return this.f113837q.getContext().getString(r6.a.m.D0);
            }
            return i10 == 0 ? this.f113837q.getContext().getString(r6.a.m.E0) : "";
        }

        @Override // androidx.customview.widget.a
        protected boolean C(int i10, int i11, Bundle bundle) {
            if (!this.f113837q.isEnabled()) {
                return false;
            }
            if (i11 != 4096 && i11 != 8192) {
                if (i11 == 16908349 && bundle != null && bundle.containsKey(j.f48496e0)) {
                    if (this.f113837q.x0(i10, bundle.getFloat(j.f48496e0))) {
                        this.f113837q.A0();
                        this.f113837q.postInvalidate();
                        v(i10);
                        return true;
                    }
                }
                return false;
            }
            float fN = this.f113837q.n(20);
            if (i11 == 8192) {
                fN = -fN;
            }
            if (this.f113837q.V()) {
                fN = -fN;
            }
            if (!this.f113837q.x0(i10, n1.a.d(this.f113837q.getValues().get(i10).floatValue() + fN, this.f113837q.getValueFrom(), this.f113837q.getValueTo()))) {
                return false;
            }
            this.f113837q.A0();
            this.f113837q.postInvalidate();
            v(i10);
            return true;
        }

        @Override // androidx.customview.widget.a
        protected void G(int i10, j jVar) {
            jVar.b(j.a.M);
            List<Float> values = this.f113837q.getValues();
            float fFloatValue = values.get(i10).floatValue();
            float valueFrom = this.f113837q.getValueFrom();
            float valueTo = this.f113837q.getValueTo();
            if (this.f113837q.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    jVar.a(8192);
                }
                if (fFloatValue < valueTo) {
                    jVar.a(4096);
                }
            }
            jVar.T1(j.h.e(1, valueFrom, valueTo, fFloatValue));
            jVar.j1(SeekBar.class.getName());
            StringBuilder sb2 = new StringBuilder();
            if (this.f113837q.getContentDescription() != null) {
                sb2.append(this.f113837q.getContentDescription());
                sb2.append(",");
            }
            String strF = this.f113837q.F(fFloatValue);
            String string = this.f113837q.getContext().getString(r6.a.m.F0);
            if (values.size() > 1) {
                string = P(i10);
            }
            sb2.append(String.format(Locale.US, "%s, %s", string, strF));
            jVar.o1(sb2.toString());
            this.f113837q.z0(i10, this.f113838r);
            jVar.d1(this.f113838r);
        }

        @Override // androidx.customview.widget.a
        protected int r(float f10, float f11) {
            for (int i10 = 0; i10 < this.f113837q.getValues().size(); i10++) {
                this.f113837q.z0(i10, this.f113838r);
                if (this.f113838r.contains((int) f10, (int) f11)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // androidx.customview.widget.a
        protected void s(List<Integer> list) {
            for (int i10 = 0; i10 < this.f113837q.getValues().size(); i10++) {
                list.add(Integer.valueOf(i10));
            }
        }
    }

    private enum f {
        BOTH,
        LEFT,
        RIGHT,
        NONE
    }

    public BaseSlider(@NonNull Context context) {
        this(context, null);
    }

    private void A(@NonNull Canvas canvas, int i10, int i11) {
        BaseSlider<S, L, T> baseSlider;
        Canvas canvas2;
        int i12;
        int i13;
        int i14 = 0;
        while (i14 < this.C3.size()) {
            float fFloatValue = this.C3.get(i14).floatValue();
            Drawable drawable = this.X3;
            if (drawable != null) {
                baseSlider = this;
                canvas2 = canvas;
                i12 = i10;
                i13 = i11;
                baseSlider.z(canvas2, i12, i13, fFloatValue, drawable);
            } else {
                baseSlider = this;
                canvas2 = canvas;
                i12 = i10;
                i13 = i11;
                if (i14 < baseSlider.Y3.size()) {
                    baseSlider.z(canvas2, i12, i13, fFloatValue, baseSlider.Y3.get(i14));
                } else {
                    if (!baseSlider.isEnabled()) {
                        canvas2.drawCircle(baseSlider.f113804m3 + (baseSlider.h0(fFloatValue) * i12), i13, baseSlider.getThumbRadius(), baseSlider.f113787c);
                    }
                    baseSlider.z(canvas2, i12, i13, fFloatValue, baseSlider.W3);
                }
            }
            i14++;
            this = baseSlider;
            canvas = canvas2;
            i10 = i12;
            i11 = i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0() {
        if (u0() || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int iH0 = (int) ((h0(this.C3.get(this.E3).floatValue()) * this.K3) + this.f113804m3);
            int iO = o();
            int i10 = this.f113812p3;
            androidx.core.graphics.drawable.c.l(background, iH0 - i10, iO - i10, iH0 + i10, iO + i10);
        }
    }

    private void B() {
        if (!this.f113807o) {
            this.f113807o = true;
            ValueAnimator valueAnimatorR = r(true);
            this.f113815s = valueAnimatorR;
            this.f113817t = null;
            valueAnimatorR.start();
        }
        Iterator<com.google.android.material.tooltip.a> it = this.f113801l.iterator();
        for (int i10 = 0; i10 < this.C3.size() && it.hasNext(); i10++) {
            if (i10 != this.E3) {
                r0(it.next(), this.C3.get(i10).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.f113801l.size()), Integer.valueOf(this.C3.size())));
        }
        r0(it.next(), this.C3.get(this.E3).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0() {
        int i10 = this.f113800k3;
        if (i10 == 0 || i10 == 1) {
            if (this.D3 == -1 || !isEnabled()) {
                C();
                return;
            } else {
                B();
                return;
            }
        }
        if (i10 == 2) {
            C();
            return;
        }
        if (i10 != 3) {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.f113800k3);
        }
        if (isEnabled() && W()) {
            B();
        } else {
            C();
        }
    }

    private void C() {
        if (this.f113807o) {
            this.f113807o = false;
            ValueAnimator valueAnimatorR = r(false);
            this.f113817t = valueAnimatorR;
            this.f113815s = null;
            valueAnimatorR.addListener(new b());
            this.f113817t.start();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004a  */
    /* JADX WARN: Code duplicated, block: B:15:0x005b  */
    /* JADX WARN: Code duplicated, block: B:17:0x007d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0080  */
    /* JADX WARN: Code duplicated, block: B:20:0x0098  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a8  */
    private void C0(Canvas canvas, Paint paint, RectF rectF, f fVar) {
        int i10;
        float fMax;
        int i11;
        int i12 = this.f113802l3;
        float f10 = i12 / 2.0f;
        float f11 = i12 / 2.0f;
        int[] iArr = c.f113834a;
        int i13 = iArr[fVar.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                i10 = this.f113819u3;
            } else if (i13 == 3) {
                f10 = this.f113819u3;
            }
            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setAntiAlias(true);
            this.T3.reset();
            if (rectF.width() >= f10 + f11) {
                this.T3.addRoundRect(rectF, K(f10, f11), Path.Direction.CW);
                canvas.drawPath(this.T3, paint);
                return;
            }
            float fMin = Math.min(f10, f11);
            fMax = Math.max(f10, f11);
            canvas.save();
            this.T3.addRoundRect(rectF, fMin, fMin, Path.Direction.CW);
            canvas.clipPath(this.T3);
            i11 = iArr[fVar.ordinal()];
            if (i11 != 2) {
                RectF rectF2 = this.V3;
                float f12 = rectF.left;
                rectF2.set(f12, rectF.top, (2.0f * fMax) + f12, rectF.bottom);
            } else if (i11 != 3) {
                this.V3.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
            } else {
                RectF rectF3 = this.V3;
                float f13 = rectF.right;
                rectF3.set(f13 - (2.0f * fMax), rectF.top, f13, rectF.bottom);
            }
            canvas.drawRoundRect(this.V3, fMax, fMax, paint);
            canvas.restore();
        }
        i10 = this.f113819u3;
        f10 = i10;
        f11 = i10;
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        this.T3.reset();
        if (rectF.width() >= f10 + f11) {
            this.T3.addRoundRect(rectF, K(f10, f11), Path.Direction.CW);
            canvas.drawPath(this.T3, paint);
            return;
        }
        float fMin2 = Math.min(f10, f11);
        fMax = Math.max(f10, f11);
        canvas.save();
        this.T3.addRoundRect(rectF, fMin2, fMin2, Path.Direction.CW);
        canvas.clipPath(this.T3);
        i11 = iArr[fVar.ordinal()];
        if (i11 != 2) {
            RectF rectF4 = this.V3;
            float f14 = rectF.left;
            rectF4.set(f14, rectF.top, (2.0f * fMax) + f14, rectF.bottom);
        } else if (i11 != 3) {
            this.V3.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
        } else {
            RectF rectF5 = this.V3;
            float f15 = rectF.right;
            rectF5.set(f15 - (2.0f * fMax), rectF.top, f15, rectF.bottom);
        }
        canvas.drawRoundRect(this.V3, fMax, fMax, paint);
        canvas.restore();
    }

    private void D(int i10) {
        if (i10 == 1) {
            f0(Integer.MAX_VALUE);
            return;
        }
        if (i10 == 2) {
            f0(Integer.MIN_VALUE);
        } else if (i10 == 17) {
            g0(Integer.MAX_VALUE);
        } else {
            if (i10 != 66) {
                return;
            }
            g0(Integer.MIN_VALUE);
        }
    }

    private void D0(int i10) {
        this.K3 = Math.max(i10 - (this.f113804m3 * 2), 0);
        Z();
    }

    private void E0() {
        boolean zE0 = e0();
        boolean zD0 = d0();
        if (zE0) {
            requestLayout();
        } else if (zD0) {
            postInvalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String F(float f10) {
        if (O()) {
            return this.f113825y3.a(f10);
        }
        return String.format(((float) ((int) f10)) == f10 ? "%.0f" : "%.2f", Float.valueOf(f10));
    }

    private void F0() {
        if (this.N3) {
            I0();
            J0();
            H0();
            K0();
            G0();
            N0();
            this.N3 = false;
        }
    }

    private float[] G() {
        float fFloatValue = this.C3.get(0).floatValue();
        ArrayList<Float> arrayList = this.C3;
        float fFloatValue2 = arrayList.get(arrayList.size() - 1).floatValue();
        if (this.C3.size() == 1) {
            fFloatValue = this.A3;
        }
        float fH0 = h0(fFloatValue);
        float fH1 = h0(fFloatValue2);
        return V() ? new float[]{fH1, fH0} : new float[]{fH0, fH1};
    }

    private void G0() {
        float minSeparation = getMinSeparation();
        if (minSeparation < 0.0f) {
            throw new IllegalStateException(String.format(f113765i4, Float.valueOf(minSeparation)));
        }
        float f10 = this.F3;
        if (f10 <= 0.0f || minSeparation <= 0.0f) {
            return;
        }
        if (this.f113784a4 != 1) {
            throw new IllegalStateException(String.format(f113766j4, Float.valueOf(minSeparation), Float.valueOf(this.F3)));
        }
        if (minSeparation < f10 || !T(minSeparation)) {
            throw new IllegalStateException(String.format(f113767k4, Float.valueOf(minSeparation), Float.valueOf(this.F3), Float.valueOf(this.F3)));
        }
    }

    private static float H(ValueAnimator valueAnimator, float f10) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f10;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return fFloatValue;
    }

    private void H0() {
        if (this.F3 > 0.0f && !L0(this.B3)) {
            throw new IllegalStateException(String.format(f113764h4, Float.valueOf(this.F3), Float.valueOf(this.A3), Float.valueOf(this.B3)));
        }
    }

    private float I(int i10, float f10) {
        float minSeparation = getMinSeparation();
        if (this.f113784a4 == 0) {
            minSeparation = u(minSeparation);
        }
        if (V()) {
            minSeparation = -minSeparation;
        }
        int i11 = i10 + 1;
        int i12 = i10 - 1;
        return n1.a.d(f10, i12 < 0 ? this.A3 : this.C3.get(i12).floatValue() + minSeparation, i11 >= this.C3.size() ? this.B3 : this.C3.get(i11).floatValue() - minSeparation);
    }

    private void I0() {
        if (this.A3 >= this.B3) {
            throw new IllegalStateException(String.format(f113762f4, Float.valueOf(this.A3), Float.valueOf(this.B3)));
        }
    }

    @l
    private int J(@NonNull ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    private void J0() {
        if (this.B3 <= this.A3) {
            throw new IllegalStateException(String.format(f113763g4, Float.valueOf(this.B3), Float.valueOf(this.A3)));
        }
    }

    private float[] K(float f10, float f11) {
        int i10 = 5 ^ 3;
        return new float[]{f10, f10, f11, f11, f11, f11, f10, f10};
    }

    private void K0() {
        for (Float f10 : this.C3) {
            if (f10.floatValue() < this.A3 || f10.floatValue() > this.B3) {
                throw new IllegalStateException(String.format(f113760d4, f10, Float.valueOf(this.A3), Float.valueOf(this.B3)));
            }
            if (this.F3 > 0.0f && !L0(f10.floatValue())) {
                throw new IllegalStateException(String.format(f113761e4, f10, Float.valueOf(this.A3), Float.valueOf(this.F3), Float.valueOf(this.F3)));
            }
        }
    }

    private float L() {
        double dW0 = w0(this.Z3);
        if (V()) {
            dW0 = 1.0d - dW0;
        }
        float f10 = this.B3;
        float f11 = this.A3;
        return (float) ((dW0 * ((double) (f10 - f11))) + ((double) f11));
    }

    private boolean L0(float f10) {
        return T(new BigDecimal(Float.toString(f10)).subtract(new BigDecimal(Float.toString(this.A3)), MathContext.DECIMAL64).doubleValue());
    }

    private float M() {
        float f10 = this.Z3;
        if (V()) {
            f10 = 1.0f - f10;
        }
        float f11 = this.B3;
        float f12 = this.A3;
        return (f10 * (f11 - f12)) + f12;
    }

    private float M0(float f10) {
        return (h0(f10) * this.K3) + this.f113804m3;
    }

    private boolean N() {
        return this.f113813q3 > 0;
    }

    private void N0() {
        float f10 = this.F3;
        if (f10 == 0.0f) {
            return;
        }
        if (((int) f10) != f10) {
            String.format(f113768l4, "stepSize", Float.valueOf(f10));
        }
        float f11 = this.A3;
        if (((int) f11) != f11) {
            String.format(f113768l4, "valueFrom", Float.valueOf(f11));
        }
        float f12 = this.B3;
        if (((int) f12) != f12) {
            String.format(f113768l4, "valueTo", Float.valueOf(f12));
        }
    }

    private Drawable P(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        j(drawableNewDrawable);
        return drawableNewDrawable;
    }

    private void Q() {
        this.f113783a.setStrokeWidth(this.f113802l3);
        this.f113785b.setStrokeWidth(this.f113802l3);
    }

    private boolean R() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private static boolean S(MotionEvent motionEvent) {
        return motionEvent.getToolType(0) == 3;
    }

    private boolean T(double d10) {
        double dDoubleValue = new BigDecimal(Double.toString(d10)).divide(new BigDecimal(Float.toString(this.F3)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < f113771o4;
    }

    private boolean U(MotionEvent motionEvent) {
        return !S(motionEvent) && R();
    }

    private boolean W() {
        Rect rect = new Rect();
        com.google.android.material.internal.p0.l(this).getHitRect(rect);
        return getLocalVisibleRect(rect);
    }

    private void Y(@NonNull Resources resources) {
        this.f113796i3 = resources.getDimensionPixelSize(r6.a.f.f360480xd);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(r6.a.f.f360464wd);
        this.f113822w = dimensionPixelOffset;
        this.f113804m3 = dimensionPixelOffset;
        this.f113809p0 = resources.getDimensionPixelSize(r6.a.f.f360400sd);
        this.f113810p1 = resources.getDimensionPixelSize(r6.a.f.f360448vd);
        this.H1 = resources.getDimensionPixelSize(r6.a.f.f360432ud);
        this.f113811p2 = resources.getDimensionPixelSize(r6.a.f.f360432ud);
        this.f113792g3 = resources.getDimensionPixelSize(r6.a.f.f360416td);
        this.f113821v3 = resources.getDimensionPixelSize(r6.a.f.f360336od);
    }

    private void Z() {
        if (this.F3 <= 0.0f) {
            return;
        }
        F0();
        int iMin = Math.min((int) (((this.B3 - this.A3) / this.F3) + 1.0f), (this.K3 / this.f113792g3) + 1);
        float[] fArr = this.G3;
        if (fArr == null || fArr.length != iMin * 2) {
            this.G3 = new float[iMin * 2];
        }
        float f10 = this.K3 / (iMin - 1);
        for (int i10 = 0; i10 < iMin * 2; i10 += 2) {
            float[] fArr2 = this.G3;
            fArr2[i10] = this.f113804m3 + ((i10 / 2.0f) * f10);
            fArr2[i10 + 1] = o();
        }
    }

    private void a0(@NonNull Canvas canvas, int i10, int i11) {
        if (u0()) {
            canvas.drawCircle((int) (this.f113804m3 + (h0(this.C3.get(this.E3).floatValue()) * i10)), i11, this.f113812p3, this.f113788d);
        }
    }

    private void b0(@NonNull Canvas canvas, int i10) {
        if (this.f113818t3 <= 0) {
            return;
        }
        if (this.C3.size() >= 1) {
            ArrayList<Float> arrayList = this.C3;
            float fFloatValue = arrayList.get(arrayList.size() - 1).floatValue();
            float f10 = this.B3;
            if (fFloatValue < f10) {
                canvas.drawPoint(M0(f10), i10, this.f113791g);
            }
        }
        if (this.C3.size() > 1) {
            float fFloatValue2 = this.C3.get(0).floatValue();
            float f11 = this.A3;
            if (fFloatValue2 > f11) {
                canvas.drawPoint(M0(f11), i10, this.f113791g);
            }
        }
    }

    private void c0(@NonNull Canvas canvas) {
        if (!this.H3 || this.F3 <= 0.0f) {
            return;
        }
        float[] fArrG = G();
        int iCeil = (int) Math.ceil(fArrG[0] * ((this.G3.length / 2.0f) - 1.0f));
        int iFloor = (int) Math.floor(fArrG[1] * ((this.G3.length / 2.0f) - 1.0f));
        if (iCeil > 0) {
            canvas.drawPoints(this.G3, 0, iCeil * 2, this.f113789e);
        }
        if (iCeil <= iFloor) {
            canvas.drawPoints(this.G3, iCeil * 2, ((iFloor - iCeil) + 1) * 2, this.f113790f);
        }
        int i10 = (iFloor + 1) * 2;
        float[] fArr = this.G3;
        if (i10 < fArr.length) {
            canvas.drawPoints(fArr, i10, fArr.length - i10, this.f113789e);
        }
    }

    private boolean d0() {
        int iMax = this.f113822w + Math.max(Math.max(Math.max((this.f113806n3 / 2) - this.f113809p0, 0), Math.max((this.f113802l3 - this.f113810p1) / 2, 0)), Math.max(Math.max(this.I3 - this.H1, 0), Math.max(this.J3 - this.f113811p2, 0)));
        if (this.f113804m3 == iMax) {
            return false;
        }
        this.f113804m3 = iMax;
        if (!u1.Y0(this)) {
            return true;
        }
        D0(getWidth());
        return true;
    }

    private boolean e0() {
        int iMax = Math.max(this.f113796i3, Math.max(this.f113802l3 + getPaddingTop() + getPaddingBottom(), this.f113808o3 + getPaddingTop() + getPaddingBottom()));
        if (iMax == this.f113798j3) {
            return false;
        }
        this.f113798j3 = iMax;
        return true;
    }

    private boolean f0(int i10) {
        int i11 = this.E3;
        int iF = (int) n1.a.f(((long) i11) + ((long) i10), 0L, this.C3.size() - 1);
        this.E3 = iF;
        if (iF == i11) {
            return false;
        }
        if (this.D3 != -1) {
            this.D3 = iF;
        }
        A0();
        postInvalidate();
        return true;
    }

    private boolean g0(int i10) {
        if (V()) {
            i10 = i10 == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i10;
        }
        return f0(i10);
    }

    private float h0(float f10) {
        float f11 = this.A3;
        float f12 = (f10 - f11) / (this.B3 - f11);
        return V() ? 1.0f - f12 : f12;
    }

    @p0
    private Boolean i0(int i10, @NonNull KeyEvent keyEvent) {
        if (i10 == 61) {
            if (keyEvent.hasNoModifiers()) {
                return Boolean.valueOf(f0(1));
            }
            return keyEvent.isShiftPressed() ? Boolean.valueOf(f0(-1)) : Boolean.FALSE;
        }
        if (i10 != 66) {
            if (i10 != 81) {
                if (i10 == 69) {
                    f0(-1);
                    return Boolean.TRUE;
                }
                if (i10 != 70) {
                    switch (i10) {
                        case 21:
                            g0(-1);
                            return Boolean.TRUE;
                        case 22:
                            g0(1);
                            return Boolean.TRUE;
                        case 23:
                            break;
                        default:
                            return null;
                    }
                }
            }
            f0(1);
            return Boolean.TRUE;
        }
        this.D3 = this.E3;
        postInvalidate();
        return Boolean.TRUE;
    }

    private void j(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.f113806n3, this.f113808o3);
        } else {
            float fMax = Math.max(this.f113806n3, this.f113808o3) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    private void j0() {
        Iterator<T> it = this.f113805n.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void k(com.google.android.material.tooltip.a aVar) {
        aVar.l1(com.google.android.material.internal.p0.l(this));
    }

    private void k0() {
        Iterator<T> it = this.f113805n.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    @p0
    private Float l(int i10) {
        float fN = this.M3 ? n(20) : m();
        if (i10 == 21) {
            if (!V()) {
                fN = -fN;
            }
            return Float.valueOf(fN);
        }
        if (i10 == 22) {
            if (V()) {
                fN = -fN;
            }
            return Float.valueOf(fN);
        }
        if (i10 == 69) {
            return Float.valueOf(-fN);
        }
        if (i10 == 70 || i10 == 81) {
            return Float.valueOf(fN);
        }
        return null;
    }

    private float m() {
        float f10 = this.F3;
        if (f10 == 0.0f) {
            return 1.0f;
        }
        return f10;
    }

    private void m0(com.google.android.material.tooltip.a aVar, float f10) {
        int iH0 = (this.f113804m3 + ((int) (h0(f10) * this.K3))) - (aVar.getIntrinsicWidth() / 2);
        int iO = o() - (this.f113821v3 + (this.f113808o3 / 2));
        aVar.setBounds(iH0, iO - aVar.getIntrinsicHeight(), aVar.getIntrinsicWidth() + iH0, iO);
        Rect rect = new Rect(aVar.getBounds());
        com.google.android.material.internal.d.c(com.google.android.material.internal.p0.l(this), this, rect);
        aVar.setBounds(rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n(int i10) {
        float fM = m();
        float f10 = (this.B3 - this.A3) / fM;
        float f11 = i10;
        return f10 <= f11 ? fM : Math.round(f10 / f11) * fM;
    }

    private void n0(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayK = g0.k(context, attributeSet, r6.a.o.Rt, i10, f113773q4, new int[0]);
        this.f113799k = typedArrayK.getResourceId(r6.a.o.au, r6.a.n.Hk);
        boolean z10 = true & false;
        this.A3 = typedArrayK.getFloat(r6.a.o.Vt, 0.0f);
        this.B3 = typedArrayK.getFloat(r6.a.o.Wt, 1.0f);
        setValues(Float.valueOf(this.A3));
        this.F3 = typedArrayK.getFloat(r6.a.o.Ut, 0.0f);
        this.f113794h3 = (int) Math.ceil(typedArrayK.getDimension(r6.a.o.bu, (float) Math.ceil(com.google.android.material.internal.p0.i(getContext(), 48))));
        boolean zHasValue = typedArrayK.hasValue(r6.a.o.qu);
        int i11 = zHasValue ? r6.a.o.qu : r6.a.o.su;
        int i12 = zHasValue ? r6.a.o.qu : r6.a.o.ru;
        ColorStateList colorStateListA = com.google.android.material.resources.c.a(context, typedArrayK, i11);
        if (colorStateListA == null) {
            colorStateListA = j.a.a(context, r6.a.e.f359886lc);
        }
        setTrackInactiveTintList(colorStateListA);
        ColorStateList colorStateListA2 = com.google.android.material.resources.c.a(context, typedArrayK, i12);
        if (colorStateListA2 == null) {
            colorStateListA2 = j.a.a(context, r6.a.e.f359841ic);
        }
        setTrackActiveTintList(colorStateListA2);
        this.W3.p0(com.google.android.material.resources.c.a(context, typedArrayK, r6.a.o.cu));
        if (typedArrayK.hasValue(r6.a.o.gu)) {
            setThumbStrokeColor(com.google.android.material.resources.c.a(context, typedArrayK, r6.a.o.gu));
        }
        setThumbStrokeWidth(typedArrayK.getDimension(r6.a.o.hu, 0.0f));
        ColorStateList colorStateListA3 = com.google.android.material.resources.c.a(context, typedArrayK, r6.a.o.Xt);
        if (colorStateListA3 == null) {
            colorStateListA3 = j.a.a(context, r6.a.e.f359856jc);
        }
        setHaloTintList(colorStateListA3);
        this.H3 = typedArrayK.getBoolean(r6.a.o.pu, true);
        boolean zHasValue2 = typedArrayK.hasValue(r6.a.o.ku);
        int i13 = zHasValue2 ? r6.a.o.ku : r6.a.o.mu;
        int i14 = zHasValue2 ? r6.a.o.ku : r6.a.o.lu;
        ColorStateList colorStateListA4 = com.google.android.material.resources.c.a(context, typedArrayK, i13);
        if (colorStateListA4 == null) {
            colorStateListA4 = j.a.a(context, r6.a.e.f359871kc);
        }
        setTickInactiveTintList(colorStateListA4);
        ColorStateList colorStateListA5 = com.google.android.material.resources.c.a(context, typedArrayK, i14);
        if (colorStateListA5 == null) {
            colorStateListA5 = j.a.a(context, r6.a.e.f359826hc);
        }
        setTickActiveTintList(colorStateListA5);
        setThumbTrackGapSize(typedArrayK.getDimensionPixelSize(r6.a.o.iu, 0));
        setTrackStopIndicatorSize(typedArrayK.getDimensionPixelSize(r6.a.o.vu, 0));
        setTrackInsideCornerSize(typedArrayK.getDimensionPixelSize(r6.a.o.uu, 0));
        int dimensionPixelSize = typedArrayK.getDimensionPixelSize(r6.a.o.fu, 0) * 2;
        int dimensionPixelSize2 = typedArrayK.getDimensionPixelSize(r6.a.o.ju, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayK.getDimensionPixelSize(r6.a.o.eu, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayK.getDimensionPixelSize(r6.a.o.Yt, 0));
        setThumbElevation(typedArrayK.getDimension(r6.a.o.du, 0.0f));
        setTrackHeight(typedArrayK.getDimensionPixelSize(r6.a.o.tu, 0));
        setTickActiveRadius(typedArrayK.getDimensionPixelSize(r6.a.o.nu, this.f113818t3 / 2));
        setTickInactiveRadius(typedArrayK.getDimensionPixelSize(r6.a.o.ou, this.f113818t3 / 2));
        setLabelBehavior(typedArrayK.getInt(r6.a.o.Zt, 0));
        if (!typedArrayK.getBoolean(r6.a.o.St, true)) {
            setEnabled(false);
        }
        typedArrayK.recycle();
    }

    private int o() {
        return (this.f113798j3 / 2) + ((this.f113800k3 == 1 || t0()) ? this.f113801l.get(0).getIntrinsicHeight() : 0);
    }

    private void q0(int i10) {
        BaseSlider<S, L, T>.d dVar = this.f113797j;
        if (dVar == null) {
            this.f113797j = new d(this, null);
        } else {
            removeCallbacks(dVar);
        }
        this.f113797j.a(i10);
        postDelayed(this.f113797j, 200L);
    }

    private ValueAnimator r(boolean z10) {
        int iF;
        TimeInterpolator timeInterpolatorG;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(H(z10 ? this.f113817t : this.f113815s, z10 ? 0.0f : 1.0f), z10 ? 1.0f : 0.0f);
        if (z10) {
            iF = com.google.android.material.motion.j.f(getContext(), f113778v4, 83);
            timeInterpolatorG = com.google.android.material.motion.j.g(getContext(), f113780x4, com.google.android.material.animation.b.f111047e);
        } else {
            iF = com.google.android.material.motion.j.f(getContext(), f113779w4, 117);
            timeInterpolatorG = com.google.android.material.motion.j.g(getContext(), f113781y4, com.google.android.material.animation.b.f111045c);
        }
        valueAnimatorOfFloat.setDuration(iF);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorG);
        valueAnimatorOfFloat.addUpdateListener(new a());
        return valueAnimatorOfFloat;
    }

    private void r0(com.google.android.material.tooltip.a aVar, float f10) {
        aVar.n1(F(f10));
        m0(aVar, f10);
        com.google.android.material.internal.p0.m(this).b(aVar);
    }

    private void s() {
        if (this.f113801l.size() > this.C3.size()) {
            List<com.google.android.material.tooltip.a> listSubList = this.f113801l.subList(this.C3.size(), this.f113801l.size());
            for (com.google.android.material.tooltip.a aVar : listSubList) {
                if (u1.R0(this)) {
                    t(aVar);
                }
            }
            listSubList.clear();
        }
        while (true) {
            if (this.f113801l.size() >= this.C3.size()) {
                break;
            }
            com.google.android.material.tooltip.a aVarW0 = com.google.android.material.tooltip.a.W0(getContext(), null, 0, this.f113799k);
            this.f113801l.add(aVarW0);
            if (u1.R0(this)) {
                k(aVarW0);
            }
        }
        int i10 = this.f113801l.size() != 1 ? 1 : 0;
        Iterator<com.google.android.material.tooltip.a> it = this.f113801l.iterator();
        while (it.hasNext()) {
            it.next().J0(i10);
        }
    }

    private void s0(@NonNull ArrayList<Float> arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.C3.size() == arrayList.size() && this.C3.equals(arrayList)) {
            return;
        }
        this.C3 = arrayList;
        this.N3 = true;
        this.E3 = 0;
        A0();
        s();
        w();
        postInvalidate();
    }

    private void t(com.google.android.material.tooltip.a aVar) {
        n0 n0VarM = com.google.android.material.internal.p0.m(this);
        if (n0VarM != null) {
            n0VarM.a(aVar);
            aVar.Y0(com.google.android.material.internal.p0.l(this));
        }
    }

    private boolean t0() {
        if (this.f113800k3 != 3) {
            return false;
        }
        int i10 = 5 << 1;
        return true;
    }

    private float u(float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        float f11 = (f10 - this.f113804m3) / this.K3;
        float f12 = this.A3;
        return (f11 * (f12 - this.B3)) + f12;
    }

    private boolean u0() {
        return this.L3 || !(getBackground() instanceof RippleDrawable);
    }

    private void v(int i10) {
        Iterator<L> it = this.f113803m.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.C3.get(i10).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f113795i;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        q0(i10);
    }

    private boolean v0(float f10) {
        return x0(this.D3, f10);
    }

    private void w() {
        for (L l10 : this.f113803m) {
            Iterator<Float> it = this.C3.iterator();
            while (it.hasNext()) {
                l10.a(this, it.next().floatValue(), false);
            }
        }
    }

    private double w0(float f10) {
        float f11 = this.F3;
        if (f11 <= 0.0f) {
            return f10;
        }
        int i10 = (int) ((this.B3 - this.A3) / f11);
        return ((double) Math.round(f10 * i10)) / ((double) i10);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d5 A[SYNTHETIC] */
    private void x(@NonNull Canvas canvas, int i10, int i11) {
        int i12;
        float[] fArrG = G();
        int i13 = this.f113804m3;
        float f10 = i10;
        float f11 = i13 + (fArrG[1] * f10);
        int i14 = 0 << 0;
        float fM0 = i13 + (fArrG[0] * f10);
        if (!N()) {
            this.f113785b.setStyle(Paint.Style.STROKE);
            this.f113785b.setStrokeCap(Paint.Cap.ROUND);
            float f12 = i11;
            canvas.drawLine(fM0, f12, f11, f12, this.f113785b);
            return;
        }
        f fVar = f.NONE;
        if (this.C3.size() == 1) {
            fVar = V() ? f.RIGHT : f.LEFT;
        }
        for (int i15 = 0; i15 < this.C3.size(); i15++) {
            if (this.C3.size() > 1) {
                if (i15 > 0) {
                    fM0 = M0(this.C3.get(i15 - 1).floatValue());
                }
                float fM1 = M0(this.C3.get(i15).floatValue());
                if (V()) {
                    f11 = fM0;
                    fM0 = fM1;
                } else {
                    f11 = fM1;
                }
            }
            int i16 = c.f113834a[fVar.ordinal()];
            if (i16 != 1) {
                if (i16 == 2) {
                    fM0 -= this.f113802l3 / 2.0f;
                    i12 = this.f113813q3;
                } else if (i16 == 3) {
                    fM0 += this.f113813q3;
                    f11 += this.f113802l3 / 2.0f;
                }
                if (fM0 >= f11) {
                    RectF rectF = this.U3;
                    float f13 = i11;
                    int i17 = this.f113802l3;
                    rectF.set(fM0, f13 - (i17 / 2.0f), f11, f13 + (i17 / 2.0f));
                    C0(canvas, this.f113785b, this.U3, fVar);
                }
            } else {
                i12 = this.f113813q3;
                fM0 += i12;
            }
            f11 -= i12;
            if (fM0 >= f11) {
                RectF rectF2 = this.U3;
                float f14 = i11;
                int i18 = this.f113802l3;
                rectF2.set(fM0, f14 - (i18 / 2.0f), f11, f14 + (i18 / 2.0f));
                C0(canvas, this.f113785b, this.U3, fVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean x0(int i10, float f10) {
        this.E3 = i10;
        if (Math.abs(f10 - this.C3.get(i10).floatValue()) < f113771o4) {
            return false;
        }
        this.C3.set(i10, Float.valueOf(I(i10, f10)));
        v(i10);
        return true;
    }

    private void y(@NonNull Canvas canvas, int i10, int i11) {
        float[] fArrG = G();
        int i12 = this.f113804m3;
        float f10 = i10;
        float f11 = i12 + (fArrG[1] * f10);
        if (f11 < i12 + i10) {
            if (N()) {
                RectF rectF = this.U3;
                float f12 = f11 + this.f113813q3;
                float f13 = i11;
                int i13 = this.f113802l3;
                rectF.set(f12, f13 - (i13 / 2.0f), this.f113804m3 + i10 + (i13 / 2.0f), f13 + (i13 / 2.0f));
                C0(canvas, this.f113783a, this.U3, f.RIGHT);
            } else {
                this.f113783a.setStyle(Paint.Style.STROKE);
                this.f113783a.setStrokeCap(Paint.Cap.ROUND);
                float f14 = i11;
                canvas.drawLine(f11, f14, this.f113804m3 + i10, f14, this.f113783a);
            }
        }
        int i14 = this.f113804m3;
        float f15 = i14 + (fArrG[0] * f10);
        if (f15 > i14) {
            if (!N()) {
                this.f113783a.setStyle(Paint.Style.STROKE);
                this.f113783a.setStrokeCap(Paint.Cap.ROUND);
                float f16 = i11;
                canvas.drawLine(this.f113804m3, f16, f15, f16, this.f113783a);
                return;
            }
            RectF rectF2 = this.U3;
            float f17 = this.f113804m3;
            int i15 = this.f113802l3;
            float f18 = i11;
            rectF2.set(f17 - (i15 / 2.0f), f18 - (i15 / 2.0f), f15 - this.f113813q3, f18 + (i15 / 2.0f));
            C0(canvas, this.f113783a, this.U3, f.LEFT);
        }
    }

    private boolean y0() {
        return v0(L());
    }

    private void z(@NonNull Canvas canvas, int i10, int i11, float f10, @NonNull Drawable drawable) {
        canvas.save();
        canvas.translate((this.f113804m3 + ((int) (h0(f10) * i10))) - (drawable.getBounds().width() / 2.0f), i11 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    @l1
    void E(boolean z10) {
        this.L3 = z10;
    }

    public boolean O() {
        return this.f113825y3 != null;
    }

    final boolean V() {
        return u1.c0(this) == 1;
    }

    public boolean X() {
        return this.H3;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return this.f113793h.k(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f113783a.setColor(J(this.S3));
        this.f113785b.setColor(J(this.R3));
        this.f113789e.setColor(J(this.Q3));
        this.f113790f.setColor(J(this.P3));
        this.f113791g.setColor(J(this.R3));
        for (com.google.android.material.tooltip.a aVar : this.f113801l) {
            if (aVar.isStateful()) {
                aVar.setState(getDrawableState());
            }
        }
        if (this.W3.isStateful()) {
            this.W3.setState(getDrawableState());
        }
        this.f113788d.setColor(J(this.O3));
        this.f113788d.setAlpha(63);
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @l1
    final int getAccessibilityFocusedVirtualViewId() {
        return this.f113793h.m();
    }

    public int getActiveThumbIndex() {
        return this.D3;
    }

    public int getFocusedThumbIndex() {
        return this.E3;
    }

    @t0
    public int getHaloRadius() {
        return this.f113812p3;
    }

    @NonNull
    public ColorStateList getHaloTintList() {
        return this.O3;
    }

    public int getLabelBehavior() {
        return this.f113800k3;
    }

    protected float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.F3;
    }

    public float getThumbElevation() {
        return this.W3.y();
    }

    @t0
    public int getThumbHeight() {
        return this.f113808o3;
    }

    @t0
    public int getThumbRadius() {
        return this.f113806n3 / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.W3.O();
    }

    public float getThumbStrokeWidth() {
        return this.W3.R();
    }

    @NonNull
    public ColorStateList getThumbTintList() {
        return this.W3.z();
    }

    public int getThumbTrackGapSize() {
        return this.f113813q3;
    }

    @t0
    public int getThumbWidth() {
        return this.f113806n3;
    }

    @t0
    public int getTickActiveRadius() {
        return this.I3;
    }

    @NonNull
    public ColorStateList getTickActiveTintList() {
        return this.P3;
    }

    @t0
    public int getTickInactiveRadius() {
        return this.J3;
    }

    @NonNull
    public ColorStateList getTickInactiveTintList() {
        return this.Q3;
    }

    @NonNull
    public ColorStateList getTickTintList() {
        if (this.Q3.equals(this.P3)) {
            return this.P3;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    @NonNull
    public ColorStateList getTrackActiveTintList() {
        return this.R3;
    }

    @t0
    public int getTrackHeight() {
        return this.f113802l3;
    }

    @NonNull
    public ColorStateList getTrackInactiveTintList() {
        return this.S3;
    }

    public int getTrackInsideCornerSize() {
        return this.f113819u3;
    }

    @t0
    public int getTrackSidePadding() {
        return this.f113804m3;
    }

    public int getTrackStopIndicatorSize() {
        return this.f113818t3;
    }

    @NonNull
    public ColorStateList getTrackTintList() {
        if (this.S3.equals(this.R3)) {
            return this.R3;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @t0
    public int getTrackWidth() {
        return this.K3;
    }

    public float getValueFrom() {
        return this.A3;
    }

    public float getValueTo() {
        return this.B3;
    }

    @NonNull
    List<Float> getValues() {
        return new ArrayList(this.C3);
    }

    public void h(@NonNull L l10) {
        this.f113803m.add(l10);
    }

    public void i(@NonNull T t10) {
        this.f113805n.add(t10);
    }

    protected boolean l0() {
        if (this.D3 != -1) {
            return true;
        }
        float fM = M();
        float fM0 = M0(fM);
        this.D3 = 0;
        float fAbs = Math.abs(this.C3.get(0).floatValue() - fM);
        for (int i10 = 1; i10 < this.C3.size(); i10++) {
            float fAbs2 = Math.abs(this.C3.get(i10).floatValue() - fM);
            float fM1 = M0(this.C3.get(i10).floatValue());
            if (Float.compare(fAbs2, fAbs) > 0) {
                break;
            }
            boolean z10 = !V() ? fM1 - fM0 >= 0.0f : fM1 - fM0 <= 0.0f;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.D3 = i10;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fM1 - fM0) < this.f113820v) {
                        this.D3 = -1;
                        return false;
                    }
                    if (z10) {
                        this.D3 = i10;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.D3 != -1;
    }

    public void o0(@NonNull L l10) {
        this.f113803m.remove(l10);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.f113786b4);
        Iterator<com.google.android.material.tooltip.a> it = this.f113801l.iterator();
        while (it.hasNext()) {
            k(it.next());
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        BaseSlider<S, L, T>.d dVar = this.f113797j;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.f113807o = false;
        Iterator<com.google.android.material.tooltip.a> it = this.f113801l.iterator();
        while (it.hasNext()) {
            t(it.next());
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.f113786b4);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(@NonNull Canvas canvas) {
        if (this.N3) {
            F0();
            Z();
        }
        super.onDraw(canvas);
        int iO = o();
        float fFloatValue = this.C3.get(0).floatValue();
        ArrayList<Float> arrayList = this.C3;
        float fFloatValue2 = arrayList.get(arrayList.size() - 1).floatValue();
        if (fFloatValue2 < this.B3 || (this.C3.size() > 1 && fFloatValue > this.A3)) {
            y(canvas, this.K3, iO);
        }
        if (fFloatValue2 > this.A3) {
            x(canvas, this.K3, iO);
        }
        c0(canvas);
        b0(canvas, iO);
        if ((this.f113826z3 || isFocused()) && isEnabled()) {
            a0(canvas, this.K3, iO);
        }
        B0();
        A(canvas, this.K3, iO);
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, @p0 Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (z10) {
            D(i10);
            this.f113793h.M(this.E3);
        } else {
            this.D3 = -1;
            this.f113793h.d(this.E3);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, @NonNull KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (this.C3.size() == 1) {
            this.D3 = 0;
        }
        if (this.D3 == -1) {
            Boolean boolI0 = i0(i10, keyEvent);
            return boolI0 != null ? boolI0.booleanValue() : super.onKeyDown(i10, keyEvent);
        }
        this.M3 |= keyEvent.isLongPress();
        Float fL = l(i10);
        if (fL != null) {
            if (v0(this.C3.get(this.D3).floatValue() + fL.floatValue())) {
                A0();
                postInvalidate();
            }
            return true;
        }
        if (i10 != 23) {
            if (i10 == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return f0(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return f0(-1);
                }
                return false;
            }
            if (i10 != 66) {
                return super.onKeyDown(i10, keyEvent);
            }
        }
        this.D3 = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, @NonNull KeyEvent keyEvent) {
        this.M3 = false;
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f113798j3 + ((this.f113800k3 == 1 || t0()) ? this.f113801l.get(0).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.A3 = sliderState.f113827a;
        this.B3 = sliderState.f113828b;
        s0(sliderState.f113829c);
        this.F3 = sliderState.f113830d;
        if (sliderState.f113831e) {
            requestFocus();
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f113827a = this.A3;
        sliderState.f113828b = this.B3;
        sliderState.f113829c = new ArrayList<>(this.C3);
        sliderState.f113830d = this.F3;
        sliderState.f113831e = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        D0(i10);
        A0();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0085  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        int i10;
        if (!isEnabled()) {
            return false;
        }
        float x10 = motionEvent.getX();
        float f10 = (x10 - this.f113804m3) / this.K3;
        this.Z3 = f10;
        float fMax = Math.max(0.0f, f10);
        this.Z3 = fMax;
        this.Z3 = Math.min(1.0f, fMax);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f113823w3 = x10;
            if (!U(motionEvent)) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (l0()) {
                    requestFocus();
                    this.f113826z3 = true;
                    y0();
                    A0();
                    if (N()) {
                        int i11 = this.f113806n3;
                        this.f113814r3 = i11;
                        this.f113816s3 = this.f113813q3;
                        int iRound = Math.round(i11 * 0.5f);
                        int i12 = this.f113806n3 - iRound;
                        setThumbWidth(iRound);
                        setThumbTrackGapSize(this.f113813q3 - (i12 / 2));
                    }
                    invalidate();
                    j0();
                }
            }
        } else if (actionMasked == 1) {
            this.f113826z3 = false;
            motionEvent2 = this.f113824x3;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.f113824x3.getX() - motionEvent.getX()) <= this.f113820v && Math.abs(this.f113824x3.getY() - motionEvent.getY()) <= this.f113820v && l0()) {
                j0();
            }
            if (this.D3 != -1) {
                y0();
                A0();
                if (N() && (i10 = this.f113814r3) != -1 && this.f113816s3 != -1) {
                    setThumbWidth(i10);
                    setThumbTrackGapSize(this.f113816s3);
                }
                this.D3 = -1;
                k0();
            }
            invalidate();
        } else if (actionMasked == 2) {
            if (!this.f113826z3) {
                if (U(motionEvent) && Math.abs(x10 - this.f113823w3) < this.f113820v) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                j0();
            }
            if (l0()) {
                this.f113826z3 = true;
                y0();
                A0();
                invalidate();
            }
        } else if (actionMasked == 3) {
            this.f113826z3 = false;
            motionEvent2 = this.f113824x3;
            if (motionEvent2 != null) {
                j0();
            }
            if (this.D3 != -1) {
                y0();
                A0();
                if (N()) {
                    setThumbWidth(i10);
                    setThumbTrackGapSize(this.f113816s3);
                }
                this.D3 = -1;
                k0();
            }
            invalidate();
        }
        setPressed(this.f113826z3);
        this.f113824x3 = MotionEvent.obtain(motionEvent);
        return true;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i10) {
        n0 n0VarM;
        super.onVisibilityChanged(view, i10);
        if (i10 == 0 || (n0VarM = com.google.android.material.internal.p0.m(this)) == null) {
            return;
        }
        Iterator<com.google.android.material.tooltip.a> it = this.f113801l.iterator();
        while (it.hasNext()) {
            n0VarM.a(it.next());
        }
    }

    public void p() {
        this.f113803m.clear();
    }

    public void p0(@NonNull T t10) {
        this.f113805n.remove(t10);
    }

    public void q() {
        this.f113805n.clear();
    }

    protected void setActiveThumbIndex(int i10) {
        this.D3 = i10;
    }

    void setCustomThumbDrawable(@v int i10) {
        setCustomThumbDrawable(getResources().getDrawable(i10));
    }

    void setCustomThumbDrawablesForValues(@NonNull @v int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            drawableArr[i10] = getResources().getDrawable(iArr[i10]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        setLayerType(z10 ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i10) {
        if (i10 < 0 || i10 >= this.C3.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.E3 = i10;
        this.f113793h.M(i10);
        postInvalidate();
    }

    public void setHaloRadius(@androidx.annotation.g0(from = 0) @t0 int i10) {
        if (i10 == this.f113812p3) {
            return;
        }
        this.f113812p3 = i10;
        Drawable background = getBackground();
        if (u0() || !(background instanceof RippleDrawable)) {
            postInvalidate();
        } else {
            com.google.android.material.drawable.a.m((RippleDrawable) background, this.f113812p3);
        }
    }

    public void setHaloRadiusResource(@q int i10) {
        setHaloRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setHaloTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.O3)) {
            return;
        }
        this.O3 = colorStateList;
        Drawable background = getBackground();
        if (!u0() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.f113788d.setColor(J(colorStateList));
        this.f113788d.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i10) {
        if (this.f113800k3 != i10) {
            this.f113800k3 = i10;
            requestLayout();
        }
    }

    public void setLabelFormatter(@p0 com.google.android.material.slider.e eVar) {
        this.f113825y3 = eVar;
    }

    protected void setSeparationUnit(int i10) {
        this.f113784a4 = i10;
        this.N3 = true;
        postInvalidate();
    }

    public void setStepSize(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException(String.format(f113764h4, Float.valueOf(f10), Float.valueOf(this.A3), Float.valueOf(this.B3)));
        }
        if (this.F3 != f10) {
            this.F3 = f10;
            this.N3 = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f10) {
        this.W3.o0(f10);
    }

    public void setThumbElevationResource(@q int i10) {
        setThumbElevation(getResources().getDimension(i10));
    }

    public void setThumbHeight(@androidx.annotation.g0(from = 0) @t0 int i10) {
        if (i10 == this.f113808o3) {
            return;
        }
        this.f113808o3 = i10;
        this.W3.setBounds(0, 0, this.f113806n3, i10);
        Drawable drawable = this.X3;
        if (drawable != null) {
            j(drawable);
        }
        Iterator<Drawable> it = this.Y3.iterator();
        while (it.hasNext()) {
            j(it.next());
        }
        E0();
    }

    public void setThumbHeightResource(@q int i10) {
        setThumbHeight(getResources().getDimensionPixelSize(i10));
    }

    public void setThumbRadius(@androidx.annotation.g0(from = 0) @t0 int i10) {
        int i11 = i10 * 2;
        setThumbWidth(i11);
        setThumbHeight(i11);
    }

    public void setThumbRadiusResource(@q int i10) {
        setThumbRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setThumbStrokeColor(@p0 ColorStateList colorStateList) {
        this.W3.G0(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(@n int i10) {
        if (i10 != 0) {
            setThumbStrokeColor(j.a.a(getContext(), i10));
        }
    }

    public void setThumbStrokeWidth(float f10) {
        this.W3.J0(f10);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(@q int i10) {
        if (i10 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i10));
        }
    }

    public void setThumbTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.W3.z())) {
            return;
        }
        this.W3.p0(colorStateList);
        invalidate();
    }

    public void setThumbTrackGapSize(@t0 int i10) {
        if (this.f113813q3 == i10) {
            return;
        }
        this.f113813q3 = i10;
        invalidate();
    }

    public void setThumbWidth(@androidx.annotation.g0(from = 0) @t0 int i10) {
        if (i10 == this.f113806n3) {
            return;
        }
        this.f113806n3 = i10;
        this.W3.setShapeAppearanceModel(p.a().q(0, this.f113806n3 / 2.0f).m());
        this.W3.setBounds(0, 0, this.f113806n3, this.f113808o3);
        Drawable drawable = this.X3;
        if (drawable != null) {
            j(drawable);
        }
        Iterator<Drawable> it = this.Y3.iterator();
        while (it.hasNext()) {
            j(it.next());
        }
        E0();
    }

    public void setThumbWidthResource(@q int i10) {
        setThumbWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setTickActiveRadius(@androidx.annotation.g0(from = 0) @t0 int i10) {
        if (this.I3 != i10) {
            this.I3 = i10;
            this.f113790f.setStrokeWidth(i10 * 2);
            E0();
        }
    }

    public void setTickActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.P3)) {
            return;
        }
        this.P3 = colorStateList;
        this.f113790f.setColor(J(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(@androidx.annotation.g0(from = 0) @t0 int i10) {
        if (this.J3 != i10) {
            this.J3 = i10;
            this.f113789e.setStrokeWidth(i10 * 2);
            E0();
        }
    }

    public void setTickInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.Q3)) {
            return;
        }
        this.Q3 = colorStateList;
        this.f113789e.setColor(J(colorStateList));
        invalidate();
    }

    public void setTickTintList(@NonNull ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z10) {
        if (this.H3 != z10) {
            this.H3 = z10;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.R3)) {
            return;
        }
        this.R3 = colorStateList;
        this.f113785b.setColor(J(colorStateList));
        this.f113791g.setColor(J(this.R3));
        invalidate();
    }

    public void setTrackHeight(@androidx.annotation.g0(from = 0) @t0 int i10) {
        if (this.f113802l3 != i10) {
            this.f113802l3 = i10;
            Q();
            E0();
        }
    }

    public void setTrackInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.S3)) {
            return;
        }
        this.S3 = colorStateList;
        this.f113783a.setColor(J(colorStateList));
        invalidate();
    }

    public void setTrackInsideCornerSize(@t0 int i10) {
        if (this.f113819u3 == i10) {
            return;
        }
        this.f113819u3 = i10;
        invalidate();
    }

    public void setTrackStopIndicatorSize(@t0 int i10) {
        if (this.f113818t3 == i10) {
            return;
        }
        this.f113818t3 = i10;
        this.f113791g.setStrokeWidth(i10);
        invalidate();
    }

    public void setTrackTintList(@NonNull ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f10) {
        this.A3 = f10;
        this.N3 = true;
        postInvalidate();
    }

    public void setValueTo(float f10) {
        this.B3 = f10;
        this.N3 = true;
        postInvalidate();
    }

    void setValues(@NonNull Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        s0(arrayList);
    }

    void z0(int i10, Rect rect) {
        int iH0 = this.f113804m3 + ((int) (h0(getValues().get(i10).floatValue()) * this.K3));
        int iO = o();
        int iMax = Math.max(this.f113806n3 / 2, this.f113794h3 / 2);
        int iMax2 = Math.max(this.f113808o3 / 2, this.f113794h3 / 2);
        rect.set(iH0 - iMax, iO - iMax2, iH0 + iMax, iO + iMax2);
    }

    private class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f113835a;

        private d() {
            this.f113835a = -1;
        }

        void a(int i10) {
            this.f113835a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.f113793h.N(this.f113835a, 4);
        }

        /* synthetic */ d(BaseSlider baseSlider, a aVar) {
            this();
        }
    }

    public BaseSlider(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.Hg);
    }

    void setCustomThumbDrawable(@NonNull Drawable drawable) {
        this.X3 = P(drawable);
        this.Y3.clear();
        postInvalidate();
    }

    public BaseSlider(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        super(a7.a.c(context, attributeSet, i10, f113773q4), attributeSet, i10);
        this.f113801l = new ArrayList();
        this.f113803m = new ArrayList();
        this.f113805n = new ArrayList();
        this.f113807o = false;
        int i11 = 6 | (-1);
        this.f113814r3 = -1;
        this.f113816s3 = -1;
        this.f113826z3 = false;
        this.C3 = new ArrayList<>();
        this.D3 = -1;
        this.E3 = -1;
        this.F3 = 0.0f;
        this.H3 = true;
        this.M3 = false;
        this.T3 = new Path();
        this.U3 = new RectF();
        this.V3 = new RectF();
        k kVar = new k();
        this.W3 = kVar;
        this.Y3 = Collections.EMPTY_LIST;
        this.f113784a4 = 0;
        this.f113786b4 = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.material.slider.c
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f113846a.B0();
            }
        };
        Context context2 = getContext();
        this.f113783a = new Paint();
        this.f113785b = new Paint();
        Paint paint = new Paint(1);
        this.f113787c = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.f113788d = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f113789e = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f113790f = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.f113791g = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Y(context2.getResources());
        n0(context2, attributeSet, i10);
        setFocusable(true);
        setClickable(true);
        kVar.y0(2);
        this.f113820v = ViewConfiguration.get(context2).getScaledTouchSlop();
        e eVar = new e(this);
        this.f113793h = eVar;
        u1.G1(this, eVar);
        this.f113795i = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    void setValues(@NonNull List<Float> list) {
        s0(new ArrayList<>(list));
    }

    void setCustomThumbDrawablesForValues(@NonNull Drawable... drawableArr) {
        this.X3 = null;
        this.Y3 = new ArrayList();
        int i10 = 3 >> 0;
        for (Drawable drawable : drawableArr) {
            this.Y3.add(P(drawable));
        }
        postInvalidate();
    }
}
