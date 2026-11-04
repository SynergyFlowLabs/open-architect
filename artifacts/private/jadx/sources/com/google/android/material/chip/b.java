package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.f;
import androidx.annotation.f1;
import androidx.annotation.g1;
import androidx.annotation.l;
import androidx.annotation.n;
import androidx.annotation.n1;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.r;
import androidx.annotation.t0;
import androidx.annotation.v;
import androidx.core.graphics.drawable.c;
import androidx.core.graphics.drawable.i;
import androidx.core.graphics.h;
import com.google.android.material.color.u;
import com.google.android.material.internal.d0;
import com.google.android.material.internal.g0;
import com.google.android.material.resources.d;
import com.google.android.material.shape.k;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class b extends k implements i, Drawable.Callback, d0.b {

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    private static final boolean f111879u4 = false;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    private static final String f111881w4 = "http://schemas.android.com/apk/res-auto";

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    private static final int f111882x4 = 24;

    @p0
    private ColorStateList A3;
    private float B3;

    @p0
    private CharSequence C3;
    private boolean D3;
    private boolean E3;

    @p0
    private Drawable F3;

    @p0
    private ColorStateList G3;

    @p0
    private com.google.android.material.animation.i H3;

    @p0
    private com.google.android.material.animation.i I3;
    private float J3;
    private float K3;
    private float L3;
    private float M3;
    private float N3;
    private float O3;
    private float P3;
    private float Q3;

    @NonNull
    private final Context R3;
    private final Paint S3;

    @p0
    private final Paint T3;
    private final Paint.FontMetrics U3;
    private final RectF V3;
    private final PointF W3;
    private final Path X3;

    @NonNull
    private final d0 Y3;

    @l
    private int Z3;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    @l
    private int f111884a4;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    @l
    private int f111885b4;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    @l
    private int f111886c4;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    @l
    private int f111887d4;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    @l
    private int f111888e4;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private boolean f111889f4;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    @l
    private int f111890g4;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private int f111891h4;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    @p0
    private ColorFilter f111892i4;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    @p0
    private PorterDuffColorFilter f111893j4;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @p0
    private ColorStateList f111894k3;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    @p0
    private ColorStateList f111895k4;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @p0
    private ColorStateList f111896l3;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    @p0
    private PorterDuff.Mode f111897l4;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private float f111898m3;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private int[] f111899m4;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private float f111900n3;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    private boolean f111901n4;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @p0
    private ColorStateList f111902o3;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    @p0
    private ColorStateList f111903o4;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private float f111904p3;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    @NonNull
    private WeakReference<a> f111905p4;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @p0
    private ColorStateList f111906q3;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    private TextUtils.TruncateAt f111907q4;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @p0
    private CharSequence f111908r3;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    private boolean f111909r4;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private boolean f111910s3;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    private int f111911s4;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @p0
    private Drawable f111912t3;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    private boolean f111913t4;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @p0
    private ColorStateList f111914u3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private float f111915v3;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private boolean f111916w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private boolean f111917x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    @p0
    private Drawable f111918y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    @p0
    private Drawable f111919z3;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    private static final int[] f111880v4 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    private static final ShapeDrawable f111883y4 = new ShapeDrawable(new OvalShape());

    public interface a {
        void a();
    }

    private b(@NonNull Context context, AttributeSet attributeSet, @f int i10, @g1 int i11) {
        super(context, attributeSet, i10, i11);
        this.f111900n3 = -1.0f;
        this.S3 = new Paint(1);
        this.U3 = new Paint.FontMetrics();
        this.V3 = new RectF();
        this.W3 = new PointF();
        this.X3 = new Path();
        this.f111891h4 = 255;
        this.f111897l4 = PorterDuff.Mode.SRC_IN;
        this.f111905p4 = new WeakReference<>(null);
        a0(context);
        this.R3 = context;
        d0 d0Var = new d0(this);
        this.Y3 = d0Var;
        this.f111908r3 = "";
        d0Var.g().density = context.getResources().getDisplayMetrics().density;
        this.T3 = null;
        int[] iArr = f111880v4;
        setState(iArr);
        g3(iArr);
        this.f111909r4 = true;
        if (com.google.android.material.ripple.b.f113330a) {
            f111883y4.setTint(-1);
        }
    }

    private float H1() {
        Drawable drawable = this.f111889f4 ? this.F3 : this.f111912t3;
        float f10 = this.f111915v3;
        if (f10 > 0.0f || drawable == null) {
            return f10;
        }
        float fCeil = (float) Math.ceil(com.google.android.material.internal.p0.i(this.R3, 24));
        return ((float) drawable.getIntrinsicHeight()) <= fCeil ? drawable.getIntrinsicHeight() : fCeil;
    }

    private float I1() {
        Drawable drawable = this.f111889f4 ? this.F3 : this.f111912t3;
        float f10 = this.f111915v3;
        return (f10 > 0.0f || drawable == null) ? f10 : drawable.getIntrinsicWidth();
    }

    private boolean M3() {
        return this.E3 && this.F3 != null && this.f111889f4;
    }

    private boolean N3() {
        return this.f111910s3 && this.f111912t3 != null;
    }

    private boolean O3() {
        return this.f111917x3 && this.f111918y3 != null;
    }

    private void P3(@p0 Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void Q0(@p0 Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        c.m(drawable, c.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f111918y3) {
            if (drawable.isStateful()) {
                drawable.setState(E1());
            }
            c.o(drawable, this.A3);
            return;
        }
        Drawable drawable2 = this.f111912t3;
        if (drawable == drawable2 && this.f111916w3) {
            c.o(drawable2, this.f111914u3);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void Q3() {
        this.f111903o4 = this.f111901n4 ? com.google.android.material.ripple.b.e(this.f111906q3) : null;
    }

    private void R0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (N3() || M3()) {
            float f10 = this.J3 + this.K3;
            float fI1 = I1();
            if (c.f(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + fI1;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - fI1;
            }
            float fH1 = H1();
            float fExactCenterY = rect.exactCenterY() - (fH1 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fH1;
        }
    }

    @e.b(21)
    private void R3() {
        this.f111919z3 = new RippleDrawable(com.google.android.material.ripple.b.e(O1()), this.f111918y3, f111883y4);
    }

    private void T0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.set(rect);
        if (O3()) {
            float f10 = this.Q3 + this.P3 + this.B3 + this.O3 + this.N3;
            if (c.f(this) == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    private void U0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (O3()) {
            float f10 = this.Q3 + this.P3;
            if (c.f(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.B3;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.B3;
            }
            float fExactCenterY = rect.exactCenterY();
            float f13 = this.B3;
            float f14 = fExactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    @p0
    private ColorFilter U1() {
        ColorFilter colorFilter = this.f111892i4;
        return colorFilter != null ? colorFilter : this.f111893j4;
    }

    private void U2(@p0 ColorStateList colorStateList) {
        if (this.f111894k3 != colorStateList) {
            this.f111894k3 = colorStateList;
            onStateChange(getState());
        }
    }

    private void V0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (O3()) {
            float f10 = this.Q3 + this.P3 + this.B3 + this.O3 + this.N3;
            if (c.f(this) == 0) {
                float f11 = rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = i10;
                rectF.right = i10 + f10;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean W1(@p0 int[] iArr, @f int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void X0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (this.f111908r3 != null) {
            float fS0 = this.J3 + S0() + this.M3;
            float fW0 = this.Q3 + W0() + this.N3;
            if (c.f(this) == 0) {
                rectF.left = rect.left + fS0;
                rectF.right = rect.right - fW0;
            } else {
                rectF.left = rect.left + fW0;
                rectF.right = rect.right - fS0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private float Y0() {
        this.Y3.g().getFontMetrics(this.U3);
        Paint.FontMetrics fontMetrics = this.U3;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private boolean a1() {
        return this.E3 && this.F3 != null && this.D3;
    }

    @NonNull
    public static b b1(@NonNull Context context, @p0 AttributeSet attributeSet, @f int i10, @g1 int i11) {
        b bVar = new b(context, attributeSet, i10, i11);
        bVar.j2(attributeSet, i10, i11);
        return bVar;
    }

    @NonNull
    public static b c1(@NonNull Context context, @n1 int i10) {
        AttributeSet attributeSetK = com.google.android.material.drawable.a.k(context, i10, "chip");
        int styleAttribute = attributeSetK.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = r6.a.n.Yi;
        }
        return b1(context, attributeSetK, r6.a.c.E2, styleAttribute);
    }

    private void d1(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (M3()) {
            R0(rect, this.V3);
            RectF rectF = this.V3;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.F3.setBounds(0, 0, (int) this.V3.width(), (int) this.V3.height());
            this.F3.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void e1(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.f111913t4) {
            return;
        }
        this.S3.setColor(this.f111884a4);
        this.S3.setStyle(Paint.Style.FILL);
        this.S3.setColorFilter(U1());
        this.V3.set(rect);
        canvas.drawRoundRect(this.V3, p1(), p1(), this.S3);
    }

    private void f1(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (N3()) {
            R0(rect, this.V3);
            RectF rectF = this.V3;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f111912t3.setBounds(0, 0, (int) this.V3.width(), (int) this.V3.height());
            this.f111912t3.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void g1(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.f111904p3 <= 0.0f || this.f111913t4) {
            return;
        }
        this.S3.setColor(this.f111886c4);
        this.S3.setStyle(Paint.Style.STROKE);
        if (!this.f111913t4) {
            this.S3.setColorFilter(U1());
        }
        RectF rectF = this.V3;
        float f10 = rect.left;
        float f11 = this.f111904p3;
        rectF.set(f10 + (f11 / 2.0f), rect.top + (f11 / 2.0f), rect.right - (f11 / 2.0f), rect.bottom - (f11 / 2.0f));
        float f12 = this.f111900n3 - (this.f111904p3 / 2.0f);
        canvas.drawRoundRect(this.V3, f12, f12, this.S3);
    }

    private static boolean g2(@p0 ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private void h1(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.f111913t4) {
            return;
        }
        this.S3.setColor(this.Z3);
        this.S3.setStyle(Paint.Style.FILL);
        this.V3.set(rect);
        canvas.drawRoundRect(this.V3, p1(), p1(), this.S3);
    }

    private static boolean h2(@p0 Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private void i1(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (O3()) {
            U0(rect, this.V3);
            RectF rectF = this.V3;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f111918y3.setBounds(0, 0, (int) this.V3.width(), (int) this.V3.height());
            if (com.google.android.material.ripple.b.f113330a) {
                this.f111919z3.setBounds(this.f111918y3.getBounds());
                this.f111919z3.jumpToCurrentState();
                this.f111919z3.draw(canvas);
            } else {
                this.f111918y3.draw(canvas);
            }
            canvas.translate(-f10, -f11);
        }
    }

    private static boolean i2(@p0 d dVar) {
        return (dVar == null || dVar.i() == null || !dVar.i().isStateful()) ? false : true;
    }

    private void j1(@NonNull Canvas canvas, @NonNull Rect rect) {
        this.S3.setColor(this.f111887d4);
        this.S3.setStyle(Paint.Style.FILL);
        this.V3.set(rect);
        if (!this.f111913t4) {
            canvas.drawRoundRect(this.V3, p1(), p1(), this.S3);
        } else {
            h(new RectF(rect), this.X3);
            super.r(canvas, this.S3, this.X3, w());
        }
    }

    private void j2(@p0 AttributeSet attributeSet, @f int i10, @g1 int i11) {
        TypedArray typedArrayK = g0.k(this.R3, attributeSet, r6.a.o.f362040s6, i10, i11, new int[0]);
        this.f111913t4 = typedArrayK.hasValue(r6.a.o.f361704e7);
        U2(com.google.android.material.resources.c.a(this.R3, typedArrayK, r6.a.o.R6));
        w2(com.google.android.material.resources.c.a(this.R3, typedArrayK, r6.a.o.E6));
        M2(typedArrayK.getDimension(r6.a.o.M6, 0.0f));
        if (typedArrayK.hasValue(r6.a.o.F6)) {
            y2(typedArrayK.getDimension(r6.a.o.F6, 0.0f));
        }
        Q2(com.google.android.material.resources.c.a(this.R3, typedArrayK, r6.a.o.P6));
        S2(typedArrayK.getDimension(r6.a.o.Q6, 0.0f));
        u3(com.google.android.material.resources.c.a(this.R3, typedArrayK, r6.a.o.f361680d7));
        z3(typedArrayK.getText(r6.a.o.f362184y6));
        d dVarH = com.google.android.material.resources.c.h(this.R3, typedArrayK, r6.a.o.f362064t6);
        dVarH.l(typedArrayK.getDimension(r6.a.o.f362088u6, dVarH.j()));
        A3(dVarH);
        int i12 = typedArrayK.getInt(r6.a.o.f362136w6, 0);
        if (i12 == 1) {
            m3(TextUtils.TruncateAt.START);
        } else if (i12 == 2) {
            m3(TextUtils.TruncateAt.MIDDLE);
        } else if (i12 == 3) {
            m3(TextUtils.TruncateAt.END);
        }
        L2(typedArrayK.getBoolean(r6.a.o.L6, false));
        if (attributeSet != null && attributeSet.getAttributeValue(f111881w4, "chipIconEnabled") != null && attributeSet.getAttributeValue(f111881w4, "chipIconVisible") == null) {
            L2(typedArrayK.getBoolean(r6.a.o.I6, false));
        }
        C2(com.google.android.material.resources.c.e(this.R3, typedArrayK, r6.a.o.H6));
        if (typedArrayK.hasValue(r6.a.o.K6)) {
            I2(com.google.android.material.resources.c.a(this.R3, typedArrayK, r6.a.o.K6));
        }
        G2(typedArrayK.getDimension(r6.a.o.J6, -1.0f));
        k3(typedArrayK.getBoolean(r6.a.o.Y6, false));
        if (attributeSet != null && attributeSet.getAttributeValue(f111881w4, "closeIconEnabled") != null && attributeSet.getAttributeValue(f111881w4, "closeIconVisible") == null) {
            k3(typedArrayK.getBoolean(r6.a.o.T6, false));
        }
        V2(com.google.android.material.resources.c.e(this.R3, typedArrayK, r6.a.o.S6));
        h3(com.google.android.material.resources.c.a(this.R3, typedArrayK, r6.a.o.X6));
        c3(typedArrayK.getDimension(r6.a.o.V6, 0.0f));
        m2(typedArrayK.getBoolean(r6.a.o.f362208z6, false));
        v2(typedArrayK.getBoolean(r6.a.o.D6, false));
        if (attributeSet != null && attributeSet.getAttributeValue(f111881w4, "checkedIconEnabled") != null && attributeSet.getAttributeValue(f111881w4, "checkedIconVisible") == null) {
            v2(typedArrayK.getBoolean(r6.a.o.B6, false));
        }
        o2(com.google.android.material.resources.c.e(this.R3, typedArrayK, r6.a.o.A6));
        if (typedArrayK.hasValue(r6.a.o.C6)) {
            s2(com.google.android.material.resources.c.a(this.R3, typedArrayK, r6.a.o.C6));
        }
        x3(com.google.android.material.animation.i.c(this.R3, typedArrayK, r6.a.o.f361752g7));
        n3(com.google.android.material.animation.i.c(this.R3, typedArrayK, r6.a.o.f361605a7));
        O2(typedArrayK.getDimension(r6.a.o.O6, 0.0f));
        r3(typedArrayK.getDimension(r6.a.o.f361655c7, 0.0f));
        p3(typedArrayK.getDimension(r6.a.o.f361630b7, 0.0f));
        I3(typedArrayK.getDimension(r6.a.o.f361800i7, 0.0f));
        E3(typedArrayK.getDimension(r6.a.o.f361776h7, 0.0f));
        e3(typedArrayK.getDimension(r6.a.o.W6, 0.0f));
        Z2(typedArrayK.getDimension(r6.a.o.U6, 0.0f));
        A2(typedArrayK.getDimension(r6.a.o.G6, 0.0f));
        t3(typedArrayK.getDimensionPixelSize(r6.a.o.f362160x6, Integer.MAX_VALUE));
        typedArrayK.recycle();
    }

    private void k1(@NonNull Canvas canvas, @NonNull Rect rect) {
        Canvas canvas2;
        Paint paint = this.T3;
        if (paint != null) {
            paint.setColor(h.D(-16777216, 127));
            canvas.drawRect(rect, this.T3);
            if (N3() || M3()) {
                R0(rect, this.V3);
                canvas.drawRect(this.V3, this.T3);
            }
            if (this.f111908r3 != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.T3);
            } else {
                canvas2 = canvas;
            }
            if (O3()) {
                U0(rect, this.V3);
                canvas2.drawRect(this.V3, this.T3);
            }
            this.T3.setColor(h.D(l1.a.f316127c, 127));
            T0(rect, this.V3);
            canvas2.drawRect(this.V3, this.T3);
            this.T3.setColor(h.D(-16711936, 127));
            V0(rect, this.V3);
            canvas2.drawRect(this.V3, this.T3);
        }
    }

    private void l1(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.f111908r3 != null) {
            Paint.Align alignZ0 = Z0(rect, this.W3);
            X0(rect, this.V3);
            if (this.Y3.e() != null) {
                this.Y3.g().drawableState = getState();
                this.Y3.o(this.R3);
            }
            this.Y3.g().setTextAlign(alignZ0);
            int iSave = 0;
            boolean z10 = Math.round(this.Y3.h(Q1().toString())) > Math.round(this.V3.width());
            if (z10) {
                iSave = canvas.save();
                canvas.clipRect(this.V3);
            }
            CharSequence charSequenceEllipsize = this.f111908r3;
            if (z10 && this.f111907q4 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.Y3.g(), this.V3.width(), this.f111907q4);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.W3;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.Y3.g());
            if (z10) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private boolean l2(@NonNull int[] iArr, @NonNull int[] iArr2) {
        boolean z10;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f111894k3;
        int iL = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.Z3) : 0);
        boolean state = true;
        if (this.Z3 != iL) {
            this.Z3 = iL;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.f111896l3;
        int iL2 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f111884a4) : 0);
        if (this.f111884a4 != iL2) {
            this.f111884a4 = iL2;
            zOnStateChange = true;
        }
        int iS = u.s(iL, iL2);
        if ((this.f111885b4 != iS) | (z() == null)) {
            this.f111885b4 = iS;
            p0(ColorStateList.valueOf(iS));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f111902o3;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f111886c4) : 0;
        if (this.f111886c4 != colorForState) {
            this.f111886c4 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f111903o4 == null || !com.google.android.material.ripple.b.f(iArr)) ? 0 : this.f111903o4.getColorForState(iArr, this.f111887d4);
        if (this.f111887d4 != colorForState2) {
            this.f111887d4 = colorForState2;
            if (this.f111901n4) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.Y3.e() == null || this.Y3.e().i() == null) ? 0 : this.Y3.e().i().getColorForState(iArr, this.f111888e4);
        if (this.f111888e4 != colorForState3) {
            this.f111888e4 = colorForState3;
            zOnStateChange = true;
        }
        boolean z11 = W1(getState(), R.attr.state_checked) && this.D3;
        if (this.f111889f4 == z11 || this.F3 == null) {
            z10 = false;
        } else {
            float fS0 = S0();
            this.f111889f4 = z11;
            if (fS0 != S0()) {
                zOnStateChange = true;
                z10 = true;
            } else {
                z10 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f111895k4;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f111890g4) : 0;
        if (this.f111890g4 != colorForState4) {
            this.f111890g4 = colorForState4;
            this.f111893j4 = com.google.android.material.drawable.a.o(this, this.f111895k4, this.f111897l4);
        } else {
            state = zOnStateChange;
        }
        if (h2(this.f111912t3)) {
            state |= this.f111912t3.setState(iArr);
        }
        if (h2(this.F3)) {
            state |= this.F3.setState(iArr);
        }
        if (h2(this.f111918y3)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f111918y3.setState(iArr3);
        }
        if (com.google.android.material.ripple.b.f113330a && h2(this.f111919z3)) {
            state |= this.f111919z3.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z10) {
            k2();
        }
        return state;
    }

    @p0
    public CharSequence A1() {
        return this.C3;
    }

    public void A2(float f10) {
        if (this.Q3 != f10) {
            this.Q3 = f10;
            invalidateSelf();
            k2();
        }
    }

    public void A3(@p0 d dVar) {
        this.Y3.l(dVar, this.R3);
    }

    public float B1() {
        return this.P3;
    }

    public void B2(@q int i10) {
        A2(this.R3.getResources().getDimension(i10));
    }

    public void B3(@g1 int i10) {
        A3(new d(this.R3, i10));
    }

    public float C1() {
        return this.B3;
    }

    public void C2(@p0 Drawable drawable) {
        Drawable drawableR1 = r1();
        if (drawableR1 != drawable) {
            float fS0 = S0();
            this.f111912t3 = drawable != null ? c.r(drawable).mutate() : null;
            float fS1 = S0();
            P3(drawableR1);
            if (N3()) {
                Q0(this.f111912t3);
            }
            invalidateSelf();
            if (fS0 != fS1) {
                k2();
            }
        }
    }

    public void C3(@l int i10) {
        D3(ColorStateList.valueOf(i10));
    }

    public float D1() {
        return this.O3;
    }

    @Deprecated
    public void D2(boolean z10) {
        L2(z10);
    }

    public void D3(@p0 ColorStateList colorStateList) {
        d dVarR1 = R1();
        if (dVarR1 != null) {
            dVarR1.k(colorStateList);
            invalidateSelf();
        }
    }

    @NonNull
    public int[] E1() {
        return this.f111899m4;
    }

    @Deprecated
    public void E2(@androidx.annotation.h int i10) {
        K2(i10);
    }

    public void E3(float f10) {
        if (this.N3 != f10) {
            this.N3 = f10;
            invalidateSelf();
            k2();
        }
    }

    @p0
    public ColorStateList F1() {
        return this.A3;
    }

    public void F2(@v int i10) {
        C2(j.a.b(this.R3, i10));
    }

    public void F3(@q int i10) {
        E3(this.R3.getResources().getDimension(i10));
    }

    public void G1(@NonNull RectF rectF) {
        V0(getBounds(), rectF);
    }

    public void G2(float f10) {
        if (this.f111915v3 != f10) {
            float fS0 = S0();
            this.f111915v3 = f10;
            float fS1 = S0();
            invalidateSelf();
            if (fS0 != fS1) {
                k2();
            }
        }
    }

    public void G3(@f1 int i10) {
        z3(this.R3.getResources().getString(i10));
    }

    public void H2(@q int i10) {
        G2(this.R3.getResources().getDimension(i10));
    }

    public void H3(@r float f10) {
        d dVarR1 = R1();
        if (dVarR1 != null) {
            dVarR1.l(f10);
            this.Y3.g().setTextSize(f10);
            a();
        }
    }

    public void I2(@p0 ColorStateList colorStateList) {
        this.f111916w3 = true;
        if (this.f111914u3 != colorStateList) {
            this.f111914u3 = colorStateList;
            if (N3()) {
                c.o(this.f111912t3, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void I3(float f10) {
        if (this.M3 != f10) {
            this.M3 = f10;
            invalidateSelf();
            k2();
        }
    }

    public TextUtils.TruncateAt J1() {
        return this.f111907q4;
    }

    public void J2(@n int i10) {
        I2(j.a.a(this.R3, i10));
    }

    public void J3(@q int i10) {
        I3(this.R3.getResources().getDimension(i10));
    }

    @p0
    public com.google.android.material.animation.i K1() {
        return this.I3;
    }

    public void K2(@androidx.annotation.h int i10) {
        L2(this.R3.getResources().getBoolean(i10));
    }

    public void K3(boolean z10) {
        if (this.f111901n4 != z10) {
            this.f111901n4 = z10;
            Q3();
            onStateChange(getState());
        }
    }

    public float L1() {
        return this.L3;
    }

    public void L2(boolean z10) {
        if (this.f111910s3 != z10) {
            boolean zN3 = N3();
            this.f111910s3 = z10;
            boolean zN4 = N3();
            if (zN3 != zN4) {
                if (zN4) {
                    Q0(this.f111912t3);
                } else {
                    P3(this.f111912t3);
                }
                invalidateSelf();
                k2();
            }
        }
    }

    boolean L3() {
        return this.f111909r4;
    }

    public float M1() {
        return this.K3;
    }

    public void M2(float f10) {
        if (this.f111898m3 != f10) {
            this.f111898m3 = f10;
            invalidateSelf();
            k2();
        }
    }

    @t0
    public int N1() {
        return this.f111911s4;
    }

    public void N2(@q int i10) {
        M2(this.R3.getResources().getDimension(i10));
    }

    @p0
    public ColorStateList O1() {
        return this.f111906q3;
    }

    public void O2(float f10) {
        if (this.J3 != f10) {
            this.J3 = f10;
            invalidateSelf();
            k2();
        }
    }

    @p0
    public com.google.android.material.animation.i P1() {
        return this.H3;
    }

    public void P2(@q int i10) {
        O2(this.R3.getResources().getDimension(i10));
    }

    @p0
    public CharSequence Q1() {
        return this.f111908r3;
    }

    public void Q2(@p0 ColorStateList colorStateList) {
        if (this.f111902o3 != colorStateList) {
            this.f111902o3 = colorStateList;
            if (this.f111913t4) {
                G0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @p0
    public d R1() {
        return this.Y3.e();
    }

    public void R2(@n int i10) {
        Q2(j.a.a(this.R3, i10));
    }

    float S0() {
        if (N3() || M3()) {
            return this.K3 + I1() + this.L3;
        }
        return 0.0f;
    }

    public float S1() {
        return this.N3;
    }

    public void S2(float f10) {
        if (this.f111904p3 != f10) {
            this.f111904p3 = f10;
            this.S3.setStrokeWidth(f10);
            if (this.f111913t4) {
                super.J0(f10);
            }
            invalidateSelf();
        }
    }

    public float T1() {
        return this.M3;
    }

    public void T2(@q int i10) {
        S2(this.R3.getResources().getDimension(i10));
    }

    public boolean V1() {
        return this.f111901n4;
    }

    public void V2(@p0 Drawable drawable) {
        Drawable drawableZ1 = z1();
        if (drawableZ1 != drawable) {
            float fW0 = W0();
            this.f111918y3 = drawable != null ? c.r(drawable).mutate() : null;
            if (com.google.android.material.ripple.b.f113330a) {
                R3();
            }
            float fW1 = W0();
            P3(drawableZ1);
            if (O3()) {
                Q0(this.f111918y3);
            }
            invalidateSelf();
            if (fW0 != fW1) {
                k2();
            }
        }
    }

    float W0() {
        if (O3()) {
            return this.O3 + this.B3 + this.P3;
        }
        return 0.0f;
    }

    public void W2(@p0 CharSequence charSequence) {
        if (this.C3 != charSequence) {
            this.C3 = androidx.core.text.a.c().m(charSequence);
            invalidateSelf();
        }
    }

    public boolean X1() {
        return this.D3;
    }

    @Deprecated
    public void X2(boolean z10) {
        k3(z10);
    }

    @Deprecated
    public boolean Y1() {
        return Z1();
    }

    @Deprecated
    public void Y2(@androidx.annotation.h int i10) {
        j3(i10);
    }

    @NonNull
    Paint.Align Z0(@NonNull Rect rect, @NonNull PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f111908r3 != null) {
            float fS0 = this.J3 + S0() + this.M3;
            if (c.f(this) == 0) {
                pointF.x = rect.left + fS0;
            } else {
                pointF.x = rect.right - fS0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - Y0();
        }
        return align;
    }

    public boolean Z1() {
        return this.E3;
    }

    public void Z2(float f10) {
        if (this.P3 != f10) {
            this.P3 = f10;
            invalidateSelf();
            if (O3()) {
                k2();
            }
        }
    }

    @Override // com.google.android.material.internal.d0.b
    public void a() {
        k2();
        invalidateSelf();
    }

    @Deprecated
    public boolean a2() {
        return b2();
    }

    public void a3(@q int i10) {
        Z2(this.R3.getResources().getDimension(i10));
    }

    public boolean b2() {
        return this.f111910s3;
    }

    public void b3(@v int i10) {
        V2(j.a.b(this.R3, i10));
    }

    @Deprecated
    public boolean c2() {
        return e2();
    }

    public void c3(float f10) {
        if (this.B3 != f10) {
            this.B3 = f10;
            invalidateSelf();
            if (O3()) {
                k2();
            }
        }
    }

    public boolean d2() {
        return h2(this.f111918y3);
    }

    public void d3(@q int i10) {
        c3(this.R3.getResources().getDimension(i10));
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Canvas canvas2;
        int iA;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i10 = this.f111891h4;
            if (i10 < 255) {
                canvas2 = canvas;
                iA = s6.a.a(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i10);
            } else {
                canvas2 = canvas;
                iA = 0;
            }
            h1(canvas2, bounds);
            e1(canvas2, bounds);
            if (this.f111913t4) {
                super.draw(canvas2);
            }
            g1(canvas2, bounds);
            j1(canvas2, bounds);
            f1(canvas2, bounds);
            d1(canvas2, bounds);
            if (this.f111909r4) {
                l1(canvas2, bounds);
            }
            i1(canvas2, bounds);
            k1(canvas2, bounds);
            if (this.f111891h4 < 255) {
                canvas2.restoreToCount(iA);
            }
        }
    }

    public boolean e2() {
        return this.f111917x3;
    }

    public void e3(float f10) {
        if (this.O3 != f10) {
            this.O3 = f10;
            invalidateSelf();
            if (O3()) {
                k2();
            }
        }
    }

    boolean f2() {
        return this.f111913t4;
    }

    public void f3(@q int i10) {
        e3(this.R3.getResources().getDimension(i10));
    }

    public boolean g3(@NonNull int[] iArr) {
        if (!Arrays.equals(this.f111899m4, iArr)) {
            this.f111899m4 = iArr;
            if (O3()) {
                return l2(getState(), iArr);
            }
        }
        return false;
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f111891h4;
    }

    @Override // android.graphics.drawable.Drawable
    @p0
    public ColorFilter getColorFilter() {
        return this.f111892i4;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f111898m3;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.J3 + S0() + this.M3 + this.Y3.h(Q1().toString()) + this.N3 + W0() + this.Q3), this.f111911s4);
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    @e.b(21)
    public void getOutline(@NonNull Outline outline) {
        Outline outline2;
        if (this.f111913t4) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f111900n3);
        } else {
            outline.setRoundRect(bounds, this.f111900n3);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    public void h3(@p0 ColorStateList colorStateList) {
        if (this.A3 != colorStateList) {
            this.A3 = colorStateList;
            if (O3()) {
                c.o(this.f111918y3, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void i3(@n int i10) {
        h3(j.a.a(this.R3, i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (g2(this.f111894k3) || g2(this.f111896l3) || g2(this.f111902o3)) {
            return true;
        }
        return (this.f111901n4 && g2(this.f111903o4)) || i2(this.Y3.e()) || a1() || h2(this.f111912t3) || h2(this.F3) || g2(this.f111895k4);
    }

    public void j3(@androidx.annotation.h int i10) {
        k3(this.R3.getResources().getBoolean(i10));
    }

    protected void k2() {
        a aVar = this.f111905p4.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void k3(boolean z10) {
        if (this.f111917x3 != z10) {
            boolean zO3 = O3();
            this.f111917x3 = z10;
            boolean zO4 = O3();
            if (zO3 != zO4) {
                if (zO4) {
                    Q0(this.f111918y3);
                } else {
                    P3(this.f111918y3);
                }
                invalidateSelf();
                k2();
            }
        }
    }

    public void l3(@p0 a aVar) {
        this.f111905p4 = new WeakReference<>(aVar);
    }

    @p0
    public Drawable m1() {
        return this.F3;
    }

    public void m2(boolean z10) {
        if (this.D3 != z10) {
            this.D3 = z10;
            float fS0 = S0();
            if (!z10 && this.f111889f4) {
                this.f111889f4 = false;
            }
            float fS1 = S0();
            invalidateSelf();
            if (fS0 != fS1) {
                k2();
            }
        }
    }

    public void m3(@p0 TextUtils.TruncateAt truncateAt) {
        this.f111907q4 = truncateAt;
    }

    @p0
    public ColorStateList n1() {
        return this.G3;
    }

    public void n2(@androidx.annotation.h int i10) {
        m2(this.R3.getResources().getBoolean(i10));
    }

    public void n3(@p0 com.google.android.material.animation.i iVar) {
        this.I3 = iVar;
    }

    @p0
    public ColorStateList o1() {
        return this.f111896l3;
    }

    public void o2(@p0 Drawable drawable) {
        if (this.F3 != drawable) {
            float fS0 = S0();
            this.F3 = drawable;
            float fS1 = S0();
            P3(this.F3);
            Q0(this.F3);
            invalidateSelf();
            if (fS0 != fS1) {
                k2();
            }
        }
    }

    public void o3(@androidx.annotation.b int i10) {
        n3(com.google.android.material.animation.i.d(this.R3, i10));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (N3()) {
            zOnLayoutDirectionChanged |= c.m(this.f111912t3, i10);
        }
        if (M3()) {
            zOnLayoutDirectionChanged |= c.m(this.F3, i10);
        }
        if (O3()) {
            zOnLayoutDirectionChanged |= c.m(this.f111918y3, i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (N3()) {
            zOnLevelChange |= this.f111912t3.setLevel(i10);
        }
        if (M3()) {
            zOnLevelChange |= this.F3.setLevel(i10);
        }
        if (O3()) {
            zOnLevelChange |= this.f111918y3.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable, com.google.android.material.internal.d0.b
    public boolean onStateChange(@NonNull int[] iArr) {
        if (this.f111913t4) {
            super.onStateChange(iArr);
        }
        return l2(iArr, E1());
    }

    public float p1() {
        return this.f111913t4 ? T() : this.f111900n3;
    }

    @Deprecated
    public void p2(boolean z10) {
        v2(z10);
    }

    public void p3(float f10) {
        if (this.L3 != f10) {
            float fS0 = S0();
            this.L3 = f10;
            float fS1 = S0();
            invalidateSelf();
            if (fS0 != fS1) {
                k2();
            }
        }
    }

    public float q1() {
        return this.Q3;
    }

    @Deprecated
    public void q2(@androidx.annotation.h int i10) {
        v2(this.R3.getResources().getBoolean(i10));
    }

    public void q3(@q int i10) {
        p3(this.R3.getResources().getDimension(i10));
    }

    @p0
    public Drawable r1() {
        Drawable drawable = this.f111912t3;
        if (drawable != null) {
            return c.q(drawable);
        }
        return null;
    }

    public void r2(@v int i10) {
        o2(j.a.b(this.R3, i10));
    }

    public void r3(float f10) {
        if (this.K3 != f10) {
            float fS0 = S0();
            this.K3 = f10;
            float fS1 = S0();
            invalidateSelf();
            if (fS0 != fS1) {
                k2();
            }
        }
    }

    public float s1() {
        return this.f111915v3;
    }

    public void s2(@p0 ColorStateList colorStateList) {
        if (this.G3 != colorStateList) {
            this.G3 = colorStateList;
            if (a1()) {
                c.o(this.F3, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void s3(@q int i10) {
        r3(this.R3.getResources().getDimension(i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f111891h4 != i10) {
            this.f111891h4 = i10;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    public void setColorFilter(@p0 ColorFilter colorFilter) {
        if (this.f111892i4 != colorFilter) {
            this.f111892i4 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.i
    public void setTintList(@p0 ColorStateList colorStateList) {
        if (this.f111895k4 != colorStateList) {
            this.f111895k4 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.i
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f111897l4 != mode) {
            this.f111897l4 = mode;
            this.f111893j4 = com.google.android.material.drawable.a.o(this, this.f111895k4, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (N3()) {
            visible |= this.f111912t3.setVisible(z10, z11);
        }
        if (M3()) {
            visible |= this.F3.setVisible(z10, z11);
        }
        if (O3()) {
            visible |= this.f111918y3.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @p0
    public ColorStateList t1() {
        return this.f111914u3;
    }

    public void t2(@n int i10) {
        s2(j.a.a(this.R3, i10));
    }

    public void t3(@t0 int i10) {
        this.f111911s4 = i10;
    }

    public float u1() {
        return this.f111898m3;
    }

    public void u2(@androidx.annotation.h int i10) {
        v2(this.R3.getResources().getBoolean(i10));
    }

    public void u3(@p0 ColorStateList colorStateList) {
        if (this.f111906q3 != colorStateList) {
            this.f111906q3 = colorStateList;
            Q3();
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public float v1() {
        return this.J3;
    }

    public void v2(boolean z10) {
        if (this.E3 != z10) {
            boolean zM3 = M3();
            this.E3 = z10;
            boolean zM4 = M3();
            if (zM3 != zM4) {
                if (zM4) {
                    Q0(this.F3);
                } else {
                    P3(this.F3);
                }
                invalidateSelf();
                k2();
            }
        }
    }

    public void v3(@n int i10) {
        u3(j.a.a(this.R3, i10));
    }

    @p0
    public ColorStateList w1() {
        return this.f111902o3;
    }

    public void w2(@p0 ColorStateList colorStateList) {
        if (this.f111896l3 != colorStateList) {
            this.f111896l3 = colorStateList;
            onStateChange(getState());
        }
    }

    void w3(boolean z10) {
        this.f111909r4 = z10;
    }

    public float x1() {
        return this.f111904p3;
    }

    public void x2(@n int i10) {
        w2(j.a.a(this.R3, i10));
    }

    public void x3(@p0 com.google.android.material.animation.i iVar) {
        this.H3 = iVar;
    }

    public void y1(@NonNull RectF rectF) {
        T0(getBounds(), rectF);
    }

    @Deprecated
    public void y2(float f10) {
        if (this.f111900n3 != f10) {
            this.f111900n3 = f10;
            setShapeAppearanceModel(getShapeAppearanceModel().w(f10));
        }
    }

    public void y3(@androidx.annotation.b int i10) {
        x3(com.google.android.material.animation.i.d(this.R3, i10));
    }

    @p0
    public Drawable z1() {
        Drawable drawable = this.f111918y3;
        if (drawable != null) {
            return c.q(drawable);
        }
        return null;
    }

    @Deprecated
    public void z2(@q int i10) {
        y2(this.R3.getResources().getDimension(i10));
    }

    public void z3(@p0 CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f111908r3, charSequence)) {
            this.f111908r3 = charSequence;
            this.Y3.n(true);
            invalidateSelf();
            k2();
        }
    }
}
