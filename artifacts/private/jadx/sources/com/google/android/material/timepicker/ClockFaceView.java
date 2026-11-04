package com.google.android.material.timepicker;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.f1;
import androidx.annotation.p0;
import androidx.annotation.x;
import androidx.core.view.u1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
class ClockFaceView extends g implements ClockHandView.c {

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final int f114277g3 = 12;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final String f114278h3 = "";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final float f114279p2 = 0.001f;
    private final ColorStateList H1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ClockHandView f114280h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Rect f114281i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final RectF f114282j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Rect f114283k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final SparseArray<TextView> f114284l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final androidx.core.view.a f114285m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int[] f114286n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final float[] f114287o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private String[] f114288p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private float f114289p1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f114290s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f114291t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f114292v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f114293w;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.A(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f114280h.j()) - ClockFaceView.this.f114290s);
            return true;
        }
    }

    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull androidx.core.view.accessibility.j jVar) {
            super.onInitializeAccessibilityNodeInfo(view, jVar);
            int iIntValue = ((Integer) view.getTag(r6.a.h.U2)).intValue();
            if (iIntValue > 0) {
                jVar.j2((View) ClockFaceView.this.f114284l.get(iIntValue - 1));
            }
            jVar.m1(androidx.core.view.accessibility.j.g.j(0, 1, iIntValue, 1, false, view.isSelected()));
            jVar.k1(true);
            jVar.b(androidx.core.view.accessibility.j.a.f48547j);
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (i10 != 16) {
                return super.performAccessibilityAction(view, i10, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.f114281i);
            float fCenterX = ClockFaceView.this.f114281i.centerX();
            float fCenterY = ClockFaceView.this.f114281i.centerY();
            ClockFaceView.this.f114280h.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            ClockFaceView.this.f114280h.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    public ClockFaceView(@NonNull Context context) {
        this(context, null);
    }

    private void I() {
        RectF rectFF = this.f114280h.f();
        TextView textViewL = L(rectFF);
        for (int i10 = 0; i10 < this.f114284l.size(); i10++) {
            TextView textView = this.f114284l.get(i10);
            if (textView != null) {
                textView.setSelected(textView == textViewL);
                textView.getPaint().setShader(K(rectFF, textView));
                textView.invalidate();
            }
        }
    }

    @p0
    private RadialGradient K(RectF rectF, TextView textView) {
        textView.getHitRect(this.f114281i);
        this.f114282j.set(this.f114281i);
        textView.getLineBounds(0, this.f114283k);
        RectF rectF2 = this.f114282j;
        Rect rect = this.f114283k;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.f114282j)) {
            return new RadialGradient(rectF.centerX() - this.f114282j.left, rectF.centerY() - this.f114282j.top, rectF.width() * 0.5f, this.f114286n, this.f114287o, Shader.TileMode.CLAMP);
        }
        return null;
    }

    @p0
    private TextView L(RectF rectF) {
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i10 = 0; i10 < this.f114284l.size(); i10++) {
            TextView textView2 = this.f114284l.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(this.f114281i);
                this.f114282j.set(this.f114281i);
                this.f114282j.union(rectF);
                float fWidth = this.f114282j.width() * this.f114282j.height();
                if (fWidth < f10) {
                    textView = textView2;
                    f10 = fWidth;
                }
            }
        }
        return textView;
    }

    private static float M(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    private void O(@f1 int i10) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.f114284l.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < Math.max(this.f114288p0.length, size); i11++) {
            TextView textView = this.f114284l.get(i11);
            if (i11 >= this.f114288p0.length) {
                removeView(textView);
                this.f114284l.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(r6.a.k.f360895e0, (ViewGroup) this, false);
                    this.f114284l.put(i11, textView);
                    addView(textView);
                }
                textView.setText(this.f114288p0[i11]);
                textView.setTag(r6.a.h.U2, Integer.valueOf(i11));
                int i12 = (i11 / 12) + 1;
                textView.setTag(r6.a.h.F2, Integer.valueOf(i12));
                if (i12 > 1) {
                    z10 = true;
                }
                u1.G1(textView, this.f114285m);
                textView.setTextColor(this.H1);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, this.f114288p0[i11]));
                }
            }
        }
        this.f114280h.s(z10);
    }

    @Override // com.google.android.material.timepicker.g
    public void A(int i10) {
        if (i10 != z()) {
            super.A(i10);
            this.f114280h.n(z());
        }
    }

    @Override // com.google.android.material.timepicker.g
    protected void C() {
        super.C();
        for (int i10 = 0; i10 < this.f114284l.size(); i10++) {
            this.f114284l.get(i10).setVisibility(0);
        }
    }

    int J() {
        return this.f114280h.e();
    }

    void N(int i10) {
        this.f114280h.o(i10);
    }

    public void e(String[] strArr, @f1 int i10) {
        this.f114288p0 = strArr;
        O(i10);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void g(float f10, boolean z10) {
        if (Math.abs(this.f114289p1 - f10) > f114279p2) {
            this.f114289p1 = f10;
            I();
        }
    }

    public void h(@x(from = 0.0d, to = 360.0d) float f10) {
        this.f114280h.p(f10);
        I();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        androidx.core.view.accessibility.j.r2(accessibilityNodeInfo).l1(androidx.core.view.accessibility.j.f.h(1, this.f114288p0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        I();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iM = (int) (this.f114293w / M(this.f114291t / displayMetrics.heightPixels, this.f114292v / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iM, 1073741824);
        setMeasuredDimension(iM, iM);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public ClockFaceView(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.Ic);
    }

    @e.a({"ClickableViewAccessibility"})
    public ClockFaceView(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f114281i = new Rect();
        this.f114282j = new RectF();
        this.f114283k = new Rect();
        this.f114284l = new SparseArray<>();
        this.f114287o = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r6.a.o.f362113v7, i10, r6.a.n.f361508vk);
        Resources resources = getResources();
        ColorStateList colorStateListA = com.google.android.material.resources.c.a(context, typedArrayObtainStyledAttributes, r6.a.o.f362161x7);
        this.H1 = colorStateListA;
        LayoutInflater.from(context).inflate(r6.a.k.f360897f0, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(r6.a.h.E2);
        this.f114280h = clockHandView;
        this.f114290s = resources.getDimensionPixelSize(r6.a.f.G9);
        int colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.f114286n = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = j.a.a(context, r6.a.e.f359961qc).getDefaultColor();
        ColorStateList colorStateListA2 = com.google.android.material.resources.c.a(context, typedArrayObtainStyledAttributes, r6.a.o.f362137w7);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f114285m = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        e(strArr, 0);
        this.f114291t = resources.getDimensionPixelSize(r6.a.f.f360237ia);
        this.f114292v = resources.getDimensionPixelSize(r6.a.f.f360253ja);
        this.f114293w = resources.getDimensionPixelSize(r6.a.f.N9);
    }
}
