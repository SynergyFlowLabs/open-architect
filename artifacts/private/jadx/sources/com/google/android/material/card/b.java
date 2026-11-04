package com.google.android.material.card;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g1;
import androidx.annotation.l;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.annotation.w0;
import androidx.annotation.x;
import androidx.core.view.d0;
import androidx.core.view.u1;
import com.google.android.material.color.u;
import com.google.android.material.motion.j;
import com.google.android.material.resources.c;
import com.google.android.material.shape.f;
import com.google.android.material.shape.g;
import com.google.android.material.shape.k;
import com.google.android.material.shape.o;
import com.google.android.material.shape.p;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
class b {
    private static final float B = 1.5f;
    private static final int C = 2;
    public static final int E = 300;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f111688z = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final MaterialCardView f111689a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final k f111691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final k f111692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @r
    private int f111693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @r
    private int f111694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f111695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @r
    private int f111696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private Drawable f111697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private Drawable f111698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private ColorStateList f111699k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private ColorStateList f111700l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private p f111701m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private ColorStateList f111702n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private Drawable f111703o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private LayerDrawable f111704p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    private k f111705q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private k f111706r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f111708t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @p0
    private ValueAnimator f111709u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final TimeInterpolator f111710v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f111711w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f111712x;
    private static final double A = Math.cos(Math.toRadians(45.0d));
    private static final Drawable D = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final Rect f111690b = new Rect();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f111707s = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f111713y = 0.0f;

    class a extends InsetDrawable {
        a(Drawable drawable, int i10, int i11, int i12, int i13) {
            super(drawable, i10, i11, i12, i13);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public b(@NonNull MaterialCardView materialCardView, AttributeSet attributeSet, int i10, @g1 int i11) {
        this.f111689a = materialCardView;
        k kVar = new k(materialCardView.getContext(), attributeSet, i10, i11);
        this.f111691c = kVar;
        kVar.a0(materialCardView.getContext());
        kVar.w0(-12303292);
        p.b bVarV = kVar.getShapeAppearanceModel().v();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, r6.a.o.N5, i10, r6.a.n.B4);
        if (typedArrayObtainStyledAttributes.hasValue(r6.a.o.R5)) {
            bVarV.o(typedArrayObtainStyledAttributes.getDimension(r6.a.o.R5, 0.0f));
        }
        this.f111692d = new k();
        Y(bVarV.m());
        this.f111710v = j.g(materialCardView.getContext(), r6.a.c.Xd, com.google.android.material.animation.b.f111043a);
        this.f111711w = j.f(materialCardView.getContext(), r6.a.c.Nd, 300);
        this.f111712x = j.f(materialCardView.getContext(), r6.a.c.Md, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    @NonNull
    private Drawable D(Drawable drawable) {
        int iCeil;
        int iCeil2;
        if (this.f111689a.getUseCompatPadding()) {
            iCeil2 = (int) Math.ceil(f());
            iCeil = (int) Math.ceil(e());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new a(drawable, iCeil, iCeil2, iCeil, iCeil2);
    }

    private boolean G() {
        return (this.f111695g & 80) == 80;
    }

    private boolean H() {
        return (this.f111695g & d0.f48644c) == 8388613;
    }

    public static /* synthetic */ void a(b bVar, ValueAnimator valueAnimator) {
        bVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bVar.f111698j.setAlpha((int) (255.0f * fFloatValue));
        bVar.f111713y = fFloatValue;
    }

    private float c() {
        return Math.max(Math.max(d(this.f111701m.q(), this.f111691c.T()), d(this.f111701m.s(), this.f111691c.U())), Math.max(d(this.f111701m.k(), this.f111691c.v()), d(this.f111701m.i(), this.f111691c.u())));
    }

    private boolean c0() {
        return this.f111689a.getPreventCornerOverlap() && !g();
    }

    private float d(f fVar, float f10) {
        if (fVar instanceof o) {
            return (float) ((1.0d - A) * ((double) f10));
        }
        if (fVar instanceof g) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    private boolean d0() {
        return this.f111689a.getPreventCornerOverlap() && g() && this.f111689a.getUseCompatPadding();
    }

    private float e() {
        return this.f111689a.getMaxCardElevation() + (d0() ? c() : 0.0f);
    }

    private boolean e0() {
        if (this.f111689a.isClickable()) {
            return true;
        }
        View view = this.f111689a;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    private float f() {
        return (this.f111689a.getMaxCardElevation() * B) + (d0() ? c() : 0.0f);
    }

    private boolean g() {
        return this.f111691c.f0();
    }

    @NonNull
    private Drawable h() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        k kVarJ = j();
        this.f111705q = kVarJ;
        kVarJ.p0(this.f111699k);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.f111705q);
        return stateListDrawable;
    }

    @NonNull
    private Drawable i() {
        if (!com.google.android.material.ripple.b.f113330a) {
            return h();
        }
        this.f111706r = j();
        return new RippleDrawable(this.f111699k, null, this.f111706r);
    }

    private void i0(Drawable drawable) {
        if (this.f111689a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f111689a.getForeground()).setDrawable(drawable);
        } else {
            this.f111689a.setForeground(D(drawable));
        }
    }

    @NonNull
    private k j() {
        return new k(this.f111701m);
    }

    private void k0() {
        Drawable drawable;
        if (com.google.android.material.ripple.b.f113330a && (drawable = this.f111703o) != null) {
            ((RippleDrawable) drawable).setColor(this.f111699k);
            return;
        }
        k kVar = this.f111705q;
        if (kVar != null) {
            kVar.p0(this.f111699k);
        }
    }

    @NonNull
    private Drawable t() {
        if (this.f111703o == null) {
            this.f111703o = i();
        }
        if (this.f111704p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f111703o, this.f111692d, this.f111698j});
            this.f111704p = layerDrawable;
            layerDrawable.setId(2, r6.a.h.f360739p3);
        }
        return this.f111704p;
    }

    private float v() {
        if (this.f111689a.getPreventCornerOverlap() && this.f111689a.getUseCompatPadding()) {
            return (float) ((1.0d - A) * ((double) this.f111689a.getCardViewRadius()));
        }
        return 0.0f;
    }

    @p0
    ColorStateList A() {
        return this.f111702n;
    }

    @r
    int B() {
        return this.f111696h;
    }

    @NonNull
    Rect C() {
        return this.f111690b;
    }

    boolean E() {
        return this.f111707s;
    }

    boolean F() {
        return this.f111708t;
    }

    void I(@NonNull TypedArray typedArray) {
        ColorStateList colorStateListA = c.a(this.f111689a.getContext(), typedArray, r6.a.o.rn);
        this.f111702n = colorStateListA;
        if (colorStateListA == null) {
            this.f111702n = ColorStateList.valueOf(-1);
        }
        this.f111696h = typedArray.getDimensionPixelSize(r6.a.o.sn, 0);
        boolean z10 = typedArray.getBoolean(r6.a.o.gn, false);
        this.f111708t = z10;
        this.f111689a.setLongClickable(z10);
        this.f111700l = c.a(this.f111689a.getContext(), typedArray, r6.a.o.mn);
        Q(c.e(this.f111689a.getContext(), typedArray, r6.a.o.in));
        T(typedArray.getDimensionPixelSize(r6.a.o.ln, 0));
        S(typedArray.getDimensionPixelSize(r6.a.o.kn, 0));
        this.f111695g = typedArray.getInteger(r6.a.o.jn, 8388661);
        ColorStateList colorStateListA2 = c.a(this.f111689a.getContext(), typedArray, r6.a.o.nn);
        this.f111699k = colorStateListA2;
        if (colorStateListA2 == null) {
            this.f111699k = ColorStateList.valueOf(u.d(this.f111689a, r6.a.c.f359488q3));
        }
        M(c.a(this.f111689a.getContext(), typedArray, r6.a.o.hn));
        k0();
        h0();
        l0();
        this.f111689a.setBackgroundInternal(D(this.f111691c));
        Drawable drawableT = e0() ? t() : this.f111692d;
        this.f111697i = drawableT;
        this.f111689a.setForeground(D(drawableT));
    }

    void J(int i10, int i11) {
        int iCeil;
        int iCeil2;
        int i12;
        int i13;
        if (this.f111704p != null) {
            if (this.f111689a.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(f() * 2.0f);
                iCeil2 = (int) Math.ceil(e() * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i14 = H() ? ((i10 - this.f111693e) - this.f111694f) - iCeil2 : this.f111693e;
            int i15 = G() ? this.f111693e : ((i11 - this.f111693e) - this.f111694f) - iCeil;
            int i16 = H() ? this.f111693e : ((i10 - this.f111693e) - this.f111694f) - iCeil2;
            int i17 = G() ? ((i11 - this.f111693e) - this.f111694f) - iCeil : this.f111693e;
            if (u1.c0(this.f111689a) == 1) {
                i13 = i16;
                i12 = i14;
            } else {
                i12 = i16;
                i13 = i14;
            }
            this.f111704p.setLayerInset(2, i13, i17, i12, i15);
        }
    }

    void K(boolean z10) {
        this.f111707s = z10;
    }

    void L(ColorStateList colorStateList) {
        this.f111691c.p0(colorStateList);
    }

    void M(@p0 ColorStateList colorStateList) {
        k kVar = this.f111692d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        kVar.p0(colorStateList);
    }

    void N(boolean z10) {
        this.f111708t = z10;
    }

    public void O(boolean z10) {
        P(z10, false);
    }

    public void P(boolean z10, boolean z11) {
        Drawable drawable = this.f111698j;
        if (drawable != null) {
            if (z11) {
                b(z10);
            } else {
                drawable.setAlpha(z10 ? 255 : 0);
                this.f111713y = z10 ? 1.0f : 0.0f;
            }
        }
    }

    void Q(@p0 Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = androidx.core.graphics.drawable.c.r(drawable).mutate();
            this.f111698j = drawableMutate;
            androidx.core.graphics.drawable.c.o(drawableMutate, this.f111700l);
            O(this.f111689a.isChecked());
        } else {
            this.f111698j = D;
        }
        LayerDrawable layerDrawable = this.f111704p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(r6.a.h.f360739p3, this.f111698j);
        }
    }

    void R(int i10) {
        this.f111695g = i10;
        J(this.f111689a.getMeasuredWidth(), this.f111689a.getMeasuredHeight());
    }

    void S(@r int i10) {
        this.f111693e = i10;
    }

    void T(@r int i10) {
        this.f111694f = i10;
    }

    void U(@p0 ColorStateList colorStateList) {
        this.f111700l = colorStateList;
        Drawable drawable = this.f111698j;
        if (drawable != null) {
            androidx.core.graphics.drawable.c.o(drawable, colorStateList);
        }
    }

    void V(float f10) {
        Y(this.f111701m.w(f10));
        this.f111697i.invalidateSelf();
        if (d0() || c0()) {
            g0();
        }
        if (d0()) {
            j0();
        }
    }

    void W(@x(from = 0.0d, to = 1.0d) float f10) {
        this.f111691c.q0(f10);
        k kVar = this.f111692d;
        if (kVar != null) {
            kVar.q0(f10);
        }
        k kVar2 = this.f111706r;
        if (kVar2 != null) {
            kVar2.q0(f10);
        }
    }

    void X(@p0 ColorStateList colorStateList) {
        this.f111699k = colorStateList;
        k0();
    }

    void Y(@NonNull p pVar) {
        this.f111701m = pVar;
        this.f111691c.setShapeAppearanceModel(pVar);
        k kVar = this.f111691c;
        kVar.v0(!kVar.f0());
        k kVar2 = this.f111692d;
        if (kVar2 != null) {
            kVar2.setShapeAppearanceModel(pVar);
        }
        k kVar3 = this.f111706r;
        if (kVar3 != null) {
            kVar3.setShapeAppearanceModel(pVar);
        }
        k kVar4 = this.f111705q;
        if (kVar4 != null) {
            kVar4.setShapeAppearanceModel(pVar);
        }
    }

    void Z(ColorStateList colorStateList) {
        if (this.f111702n == colorStateList) {
            return;
        }
        this.f111702n = colorStateList;
        l0();
    }

    void a0(@r int i10) {
        if (i10 == this.f111696h) {
            return;
        }
        this.f111696h = i10;
        l0();
    }

    public void b(boolean z10) {
        float f10 = z10 ? 1.0f : 0.0f;
        float f11 = z10 ? 1.0f - this.f111713y : this.f111713y;
        ValueAnimator valueAnimator = this.f111709u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f111709u = null;
        }
        int i10 = 0 << 1;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f111713y, f10);
        this.f111709u = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.card.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                b.a(this.f111687a, valueAnimator2);
            }
        });
        this.f111709u.setInterpolator(this.f111710v);
        this.f111709u.setDuration((long) ((z10 ? this.f111711w : this.f111712x) * f11));
        this.f111709u.start();
    }

    void b0(int i10, int i11, int i12, int i13) {
        this.f111690b.set(i10, i11, i12, i13);
        g0();
    }

    void f0() {
        Drawable drawable = this.f111697i;
        Drawable drawableT = e0() ? t() : this.f111692d;
        this.f111697i = drawableT;
        if (drawable != drawableT) {
            i0(drawableT);
        }
    }

    void g0() {
        int iC = (int) (((c0() || d0()) ? c() : 0.0f) - v());
        MaterialCardView materialCardView = this.f111689a;
        Rect rect = this.f111690b;
        materialCardView.m(rect.left + iC, rect.top + iC, rect.right + iC, rect.bottom + iC);
    }

    void h0() {
        this.f111691c.o0(this.f111689a.getCardElevation());
    }

    void j0() {
        if (!E()) {
            this.f111689a.setBackgroundInternal(D(this.f111691c));
        }
        this.f111689a.setForeground(D(this.f111697i));
    }

    @w0(api = 23)
    void k() {
        Drawable drawable = this.f111703o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i10 = bounds.bottom;
            this.f111703o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
            this.f111703o.setBounds(bounds.left, bounds.top, bounds.right, i10);
        }
    }

    @NonNull
    k l() {
        return this.f111691c;
    }

    void l0() {
        this.f111692d.F0(this.f111696h, this.f111702n);
    }

    ColorStateList m() {
        return this.f111691c.z();
    }

    ColorStateList n() {
        return this.f111692d.z();
    }

    @p0
    Drawable o() {
        return this.f111698j;
    }

    int p() {
        return this.f111695g;
    }

    @r
    int q() {
        return this.f111693e;
    }

    @r
    int r() {
        return this.f111694f;
    }

    @p0
    ColorStateList s() {
        return this.f111700l;
    }

    float u() {
        return this.f111691c.T();
    }

    @x(from = 0.0d, to = 1.0d)
    float w() {
        return this.f111691c.A();
    }

    @p0
    ColorStateList x() {
        return this.f111699k;
    }

    p y() {
        return this.f111701m;
    }

    @l
    int z() {
        ColorStateList colorStateList = this.f111702n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }
}
