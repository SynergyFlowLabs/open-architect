package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.k;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.core.graphics.drawable.c;
import androidx.core.view.u1;
import com.google.android.material.color.u;
import com.google.android.material.shape.p;
import com.google.android.material.shape.t;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
class b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @k(api = 21)
    private static final boolean f111651u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final boolean f111652v = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaterialButton f111653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private p f111654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f111655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f111656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f111657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f111658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f111659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f111660h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private PorterDuff.Mode f111661i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private ColorStateList f111662j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private ColorStateList f111663k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private ColorStateList f111664l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private Drawable f111665m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f111669q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private LayerDrawable f111671s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f111672t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f111666n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f111667o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f111668p = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f111670r = true;

    b(MaterialButton materialButton, @NonNull p pVar) {
        this.f111653a = materialButton;
        this.f111654b = pVar;
    }

    private void G(@r int i10, @r int i11) {
        int iN0 = u1.n0(this.f111653a);
        int paddingTop = this.f111653a.getPaddingTop();
        int iM0 = u1.m0(this.f111653a);
        int paddingBottom = this.f111653a.getPaddingBottom();
        int i12 = this.f111657e;
        int i13 = this.f111658f;
        this.f111658f = i11;
        this.f111657e = i10;
        if (!this.f111667o) {
            H();
        }
        u1.m2(this.f111653a, iN0, (paddingTop + i10) - i12, iM0, (paddingBottom + i11) - i13);
    }

    private void H() {
        this.f111653a.setInternalBackground(a());
        com.google.android.material.shape.k kVarF = f();
        if (kVarF != null) {
            kVarF.o0(this.f111672t);
            kVarF.setState(this.f111653a.getDrawableState());
        }
    }

    private void I(@NonNull p pVar) {
        if (f111652v && !this.f111667o) {
            int iN0 = u1.n0(this.f111653a);
            int paddingTop = this.f111653a.getPaddingTop();
            int iM0 = u1.m0(this.f111653a);
            int paddingBottom = this.f111653a.getPaddingBottom();
            H();
            u1.m2(this.f111653a, iN0, paddingTop, iM0, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(pVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(pVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(pVar);
        }
    }

    private void K() {
        com.google.android.material.shape.k kVarF = f();
        com.google.android.material.shape.k kVarN = n();
        if (kVarF != null) {
            kVarF.F0(this.f111660h, this.f111663k);
            if (kVarN != null) {
                kVarN.E0(this.f111660h, this.f111666n ? u.d(this.f111653a, r6.a.c.f359214e4) : 0);
            }
        }
    }

    @NonNull
    private InsetDrawable L(Drawable drawable) {
        return new InsetDrawable(drawable, this.f111655c, this.f111657e, this.f111656d, this.f111658f);
    }

    private Drawable a() {
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(this.f111654b);
        kVar.a0(this.f111653a.getContext());
        c.o(kVar, this.f111662j);
        PorterDuff.Mode mode = this.f111661i;
        if (mode != null) {
            c.p(kVar, mode);
        }
        kVar.F0(this.f111660h, this.f111663k);
        com.google.android.material.shape.k kVar2 = new com.google.android.material.shape.k(this.f111654b);
        int i10 = 5 | 0;
        kVar2.setTint(0);
        kVar2.E0(this.f111660h, this.f111666n ? u.d(this.f111653a, r6.a.c.f359214e4) : 0);
        if (f111651u) {
            com.google.android.material.shape.k kVar3 = new com.google.android.material.shape.k(this.f111654b);
            this.f111665m = kVar3;
            c.n(kVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(com.google.android.material.ripple.b.e(this.f111664l), L(new LayerDrawable(new Drawable[]{kVar2, kVar})), this.f111665m);
            this.f111671s = rippleDrawable;
            return rippleDrawable;
        }
        com.google.android.material.ripple.a aVar = new com.google.android.material.ripple.a(this.f111654b);
        this.f111665m = aVar;
        c.o(aVar, com.google.android.material.ripple.b.e(this.f111664l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{kVar2, kVar, this.f111665m});
        this.f111671s = layerDrawable;
        return L(layerDrawable);
    }

    @p0
    private com.google.android.material.shape.k g(boolean z10) {
        LayerDrawable layerDrawable = this.f111671s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f111651u ? (com.google.android.material.shape.k) ((LayerDrawable) ((InsetDrawable) this.f111671s.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0) : (com.google.android.material.shape.k) this.f111671s.getDrawable(!z10 ? 1 : 0);
    }

    @p0
    private com.google.android.material.shape.k n() {
        return g(true);
    }

    void A(boolean z10) {
        this.f111666n = z10;
        K();
    }

    void B(@p0 ColorStateList colorStateList) {
        if (this.f111663k != colorStateList) {
            this.f111663k = colorStateList;
            K();
        }
    }

    void C(int i10) {
        if (this.f111660h != i10) {
            this.f111660h = i10;
            K();
        }
    }

    void D(@p0 ColorStateList colorStateList) {
        if (this.f111662j != colorStateList) {
            this.f111662j = colorStateList;
            if (f() != null) {
                c.o(f(), this.f111662j);
            }
        }
    }

    void E(@p0 PorterDuff.Mode mode) {
        if (this.f111661i != mode) {
            this.f111661i = mode;
            if (f() == null || this.f111661i == null) {
                return;
            }
            c.p(f(), this.f111661i);
        }
    }

    void F(boolean z10) {
        this.f111670r = z10;
    }

    void J(int i10, int i11) {
        Drawable drawable = this.f111665m;
        if (drawable != null) {
            drawable.setBounds(this.f111655c, this.f111657e, i11 - this.f111656d, i10 - this.f111658f);
        }
    }

    int b() {
        return this.f111659g;
    }

    public int c() {
        return this.f111658f;
    }

    public int d() {
        return this.f111657e;
    }

    @p0
    public t e() {
        LayerDrawable layerDrawable = this.f111671s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        int i10 = 1 | 2;
        return this.f111671s.getNumberOfLayers() > 2 ? (t) this.f111671s.getDrawable(2) : (t) this.f111671s.getDrawable(1);
    }

    @p0
    com.google.android.material.shape.k f() {
        return g(false);
    }

    @p0
    ColorStateList h() {
        return this.f111664l;
    }

    @NonNull
    p i() {
        return this.f111654b;
    }

    @p0
    ColorStateList j() {
        return this.f111663k;
    }

    int k() {
        return this.f111660h;
    }

    ColorStateList l() {
        return this.f111662j;
    }

    PorterDuff.Mode m() {
        return this.f111661i;
    }

    boolean o() {
        return this.f111667o;
    }

    boolean p() {
        return this.f111669q;
    }

    boolean q() {
        return this.f111670r;
    }

    void r(@NonNull TypedArray typedArray) {
        this.f111655c = typedArray.getDimensionPixelOffset(r6.a.o.f361814im, 0);
        this.f111656d = typedArray.getDimensionPixelOffset(r6.a.o.f361839jm, 0);
        this.f111657e = typedArray.getDimensionPixelOffset(r6.a.o.f361863km, 0);
        this.f111658f = typedArray.getDimensionPixelOffset(r6.a.o.f361887lm, 0);
        if (typedArray.hasValue(r6.a.o.f361983pm)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(r6.a.o.f361983pm, -1);
            this.f111659g = dimensionPixelSize;
            z(this.f111654b.w(dimensionPixelSize));
            this.f111668p = true;
        }
        this.f111660h = typedArray.getDimensionPixelSize(r6.a.o.Bm, 0);
        this.f111661i = com.google.android.material.internal.p0.t(typedArray.getInt(r6.a.o.f361959om, -1), PorterDuff.Mode.SRC_IN);
        this.f111662j = com.google.android.material.resources.c.a(this.f111653a.getContext(), typedArray, r6.a.o.f361935nm);
        this.f111663k = com.google.android.material.resources.c.a(this.f111653a.getContext(), typedArray, r6.a.o.Am);
        this.f111664l = com.google.android.material.resources.c.a(this.f111653a.getContext(), typedArray, r6.a.o.f362176xm);
        this.f111669q = typedArray.getBoolean(r6.a.o.f361911mm, false);
        this.f111672t = typedArray.getDimensionPixelSize(r6.a.o.f362007qm, 0);
        this.f111670r = typedArray.getBoolean(r6.a.o.Cm, true);
        int iN0 = u1.n0(this.f111653a);
        int paddingTop = this.f111653a.getPaddingTop();
        int iM0 = u1.m0(this.f111653a);
        int paddingBottom = this.f111653a.getPaddingBottom();
        if (typedArray.hasValue(r6.a.o.f361791hm)) {
            t();
        } else {
            H();
        }
        u1.m2(this.f111653a, iN0 + this.f111655c, paddingTop + this.f111657e, iM0 + this.f111656d, paddingBottom + this.f111658f);
    }

    void s(int i10) {
        if (f() != null) {
            f().setTint(i10);
        }
    }

    void t() {
        this.f111667o = true;
        this.f111653a.setSupportBackgroundTintList(this.f111662j);
        this.f111653a.setSupportBackgroundTintMode(this.f111661i);
    }

    void u(boolean z10) {
        this.f111669q = z10;
    }

    void v(int i10) {
        if (this.f111668p && this.f111659g == i10) {
            return;
        }
        this.f111659g = i10;
        this.f111668p = true;
        z(this.f111654b.w(i10));
    }

    public void w(@r int i10) {
        G(this.f111657e, i10);
    }

    public void x(@r int i10) {
        G(i10, this.f111658f);
    }

    void y(@p0 ColorStateList colorStateList) {
        if (this.f111664l != colorStateList) {
            this.f111664l = colorStateList;
            boolean z10 = f111651u;
            if (z10 && (this.f111653a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f111653a.getBackground()).setColor(com.google.android.material.ripple.b.e(colorStateList));
            } else {
                if (z10 || !(this.f111653a.getBackground() instanceof com.google.android.material.ripple.a)) {
                    return;
                }
                ((com.google.android.material.ripple.a) this.f111653a.getBackground()).setTintList(com.google.android.material.ripple.b.e(colorStateList));
            }
        }
    }

    void z(@NonNull p pVar) {
        this.f111654b = pVar;
        I(pVar);
    }
}
