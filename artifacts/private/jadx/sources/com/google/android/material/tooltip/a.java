package com.google.android.material.tooltip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.f;
import androidx.annotation.f1;
import androidx.annotation.g1;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.x;
import com.google.android.material.animation.b;
import com.google.android.material.color.u;
import com.google.android.material.internal.d0;
import com.google.android.material.internal.g0;
import com.google.android.material.resources.c;
import com.google.android.material.resources.d;
import com.google.android.material.shape.h;
import com.google.android.material.shape.j;
import com.google.android.material.shape.k;
import com.google.android.material.shape.m;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class a extends k implements d0.b {

    @g1
    private static final int C3 = r6.a.n.Hk;

    @f
    private static final int D3 = r6.a.c.f359413mk;
    private float A3;
    private float B3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @p0
    private CharSequence f114422k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NonNull
    private final Context f114423l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @p0
    private final Paint.FontMetrics f114424m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NonNull
    private final d0 f114425n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NonNull
    private final View.OnLayoutChangeListener f114426o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NonNull
    private final Rect f114427p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private int f114428q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private int f114429r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private int f114430s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private int f114431t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private boolean f114432u3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private int f114433v3;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private int f114434w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private float f114435x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private float f114436y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private final float f114437z3;

    /* JADX INFO: renamed from: com.google.android.material.tooltip.a$a, reason: collision with other inner class name */
    class ViewOnLayoutChangeListenerC0997a implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC0997a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            a.this.s1(view);
        }
    }

    private a(@NonNull Context context, AttributeSet attributeSet, @f int i10, @g1 int i11) {
        super(context, attributeSet, i10, i11);
        this.f114424m3 = new Paint.FontMetrics();
        d0 d0Var = new d0(this);
        this.f114425n3 = d0Var;
        this.f114426o3 = new ViewOnLayoutChangeListenerC0997a();
        this.f114427p3 = new Rect();
        this.f114435x3 = 1.0f;
        this.f114436y3 = 1.0f;
        this.f114437z3 = 0.5f;
        this.A3 = 0.5f;
        this.B3 = 1.0f;
        this.f114423l3 = context;
        d0Var.g().density = context.getResources().getDisplayMetrics().density;
        d0Var.g().setTextAlign(Paint.Align.CENTER);
    }

    private float R0() {
        int i10;
        if (((this.f114427p3.right - getBounds().right) - this.f114434w3) - this.f114431t3 < 0) {
            i10 = ((this.f114427p3.right - getBounds().right) - this.f114434w3) - this.f114431t3;
        } else {
            if (((this.f114427p3.left - getBounds().left) - this.f114434w3) + this.f114431t3 <= 0) {
                return 0.0f;
            }
            i10 = ((this.f114427p3.left - getBounds().left) - this.f114434w3) + this.f114431t3;
        }
        return i10;
    }

    private float S0() {
        this.f114425n3.g().getFontMetrics(this.f114424m3);
        Paint.FontMetrics fontMetrics = this.f114424m3;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private float T0(@NonNull Rect rect) {
        return rect.centerY() - S0();
    }

    @NonNull
    public static a U0(@NonNull Context context) {
        return W0(context, null, D3, C3);
    }

    @NonNull
    public static a V0(@NonNull Context context, @p0 AttributeSet attributeSet) {
        return W0(context, attributeSet, D3, C3);
    }

    @NonNull
    public static a W0(@NonNull Context context, @p0 AttributeSet attributeSet, @f int i10, @g1 int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.h1(attributeSet, i10, i11);
        return aVar;
    }

    private h X0() {
        float f10 = -R0();
        float fWidth = ((float) (((double) getBounds().width()) - (((double) this.f114433v3) * Math.sqrt(2.0d)))) / 2.0f;
        return new m(new j(this.f114433v3), Math.min(Math.max(f10, -fWidth), fWidth));
    }

    private void Z0(@NonNull Canvas canvas) {
        if (this.f114422k3 == null) {
            return;
        }
        Rect bounds = getBounds();
        int iT0 = (int) T0(bounds);
        if (this.f114425n3.e() != null) {
            this.f114425n3.g().drawableState = getState();
            this.f114425n3.o(this.f114423l3);
            this.f114425n3.g().setAlpha((int) (this.B3 * 255.0f));
        }
        CharSequence charSequence = this.f114422k3;
        canvas.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), iT0, this.f114425n3.g());
    }

    private float g1() {
        CharSequence charSequence = this.f114422k3;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f114425n3.h(charSequence.toString());
    }

    private void h1(@p0 AttributeSet attributeSet, @f int i10, @g1 int i11) {
        TypedArray typedArrayK = g0.k(this.f114423l3, attributeSet, r6.a.o.Cy, i10, i11, new int[0]);
        this.f114433v3 = this.f114423l3.getResources().getDimensionPixelSize(r6.a.f.Ud);
        boolean z10 = typedArrayK.getBoolean(r6.a.o.Ly, true);
        this.f114432u3 = z10;
        if (z10) {
            setShapeAppearanceModel(getShapeAppearanceModel().v().t(X0()).m());
        } else {
            this.f114433v3 = 0;
        }
        n1(typedArrayK.getText(r6.a.o.Jy));
        d dVarH = c.h(this.f114423l3, typedArrayK, r6.a.o.Dy);
        if (dVarH != null && typedArrayK.hasValue(r6.a.o.Ey)) {
            dVarH.k(c.a(this.f114423l3, typedArrayK, r6.a.o.Ey));
        }
        o1(dVarH);
        p0(ColorStateList.valueOf(typedArrayK.getColor(r6.a.o.Ky, u.s(androidx.core.graphics.h.D(u.c(this.f114423l3, R.attr.colorBackground, a.class.getCanonicalName()), 229), androidx.core.graphics.h.D(u.c(this.f114423l3, r6.a.c.f359577u3, a.class.getCanonicalName()), 153)))));
        G0(ColorStateList.valueOf(u.c(this.f114423l3, r6.a.c.f359214e4, a.class.getCanonicalName())));
        this.f114428q3 = typedArrayK.getDimensionPixelSize(r6.a.o.Fy, 0);
        this.f114429r3 = typedArrayK.getDimensionPixelSize(r6.a.o.Hy, 0);
        this.f114430s3 = typedArrayK.getDimensionPixelSize(r6.a.o.Iy, 0);
        this.f114431t3 = typedArrayK.getDimensionPixelSize(r6.a.o.Gy, 0);
        typedArrayK.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s1(@NonNull View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f114434w3 = iArr[0];
        view.getWindowVisibleDisplayFrame(this.f114427p3);
    }

    public void Y0(@p0 View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.f114426o3);
    }

    @Override // com.google.android.material.internal.d0.b
    public void a() {
        invalidateSelf();
    }

    public int a1() {
        return this.f114431t3;
    }

    public int b1() {
        return this.f114430s3;
    }

    public int c1() {
        return this.f114429r3;
    }

    @p0
    public CharSequence d1() {
        return this.f114422k3;
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        canvas.save();
        float fR0 = R0();
        float f10 = (float) (-((((double) this.f114433v3) * Math.sqrt(2.0d)) - ((double) this.f114433v3)));
        canvas.scale(this.f114435x3, this.f114436y3, getBounds().left + (getBounds().width() * 0.5f), getBounds().top + (getBounds().height() * this.A3));
        canvas.translate(fR0, f10);
        super.draw(canvas);
        Z0(canvas);
        canvas.restore();
    }

    @p0
    public d e1() {
        return this.f114425n3.e();
    }

    public int f1() {
        return this.f114428q3;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.f114425n3.g().getTextSize(), this.f114430s3);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.f114428q3 * 2) + g1(), this.f114429r3);
    }

    public void i1(@t0 int i10) {
        this.f114431t3 = i10;
        invalidateSelf();
    }

    public void j1(@t0 int i10) {
        this.f114430s3 = i10;
        invalidateSelf();
    }

    public void k1(@t0 int i10) {
        this.f114429r3 = i10;
        invalidateSelf();
    }

    public void l1(@p0 View view) {
        if (view == null) {
            return;
        }
        s1(view);
        view.addOnLayoutChangeListener(this.f114426o3);
    }

    public void m1(@x(from = 0.0d, to = 1.0d) float f10) {
        this.A3 = 1.2f;
        this.f114435x3 = f10;
        this.f114436y3 = f10;
        this.B3 = b.b(0.0f, 1.0f, 0.19f, 1.0f, f10);
        invalidateSelf();
    }

    public void n1(@p0 CharSequence charSequence) {
        if (TextUtils.equals(this.f114422k3, charSequence)) {
            return;
        }
        this.f114422k3 = charSequence;
        this.f114425n3.n(true);
        invalidateSelf();
    }

    public void o1(@p0 d dVar) {
        this.f114425n3.l(dVar, this.f114423l3);
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f114432u3) {
            setShapeAppearanceModel(getShapeAppearanceModel().v().t(X0()).m());
        }
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable, com.google.android.material.internal.d0.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void p1(@g1 int i10) {
        o1(new d(this.f114423l3, i10));
    }

    public void q1(@t0 int i10) {
        this.f114428q3 = i10;
        invalidateSelf();
    }

    public void r1(@f1 int i10) {
        n1(this.f114423l3.getResources().getString(i10));
    }
}
