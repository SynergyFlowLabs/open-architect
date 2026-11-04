package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.f1;
import androidx.annotation.g1;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.j1;
import androidx.core.view.d0;
import androidx.core.view.j0;
import androidx.core.view.u1;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.f0;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
@e.a({"ViewConstructor"})
class r extends LinearLayout {
    private final TextWatcher H1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TextInputLayout f114177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final FrameLayout f114178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final CheckableImageButton f114179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorStateList f114180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private PorterDuff.Mode f114181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View.OnLongClickListener f114182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private final CheckableImageButton f114183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f114184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f114185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final LinkedHashSet<TextInputLayout.i> f114186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f114187k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PorterDuff.Mode f114188l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f114189m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    private ImageView.ScaleType f114190n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View.OnLongClickListener f114191o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @p0
    private final AccessibilityManager f114192p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @p0
    private androidx.core.view.accessibility.c.e f114193p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private final TextInputLayout.h f114194p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private CharSequence f114195s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    private final TextView f114196t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f114197v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private EditText f114198w;

    class a extends f0 {
        a() {
        }

        @Override // com.google.android.material.internal.f0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            r.this.o().a(editable);
        }

        @Override // com.google.android.material.internal.f0, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            r.this.o().b(charSequence, i10, i11, i12);
        }
    }

    class b implements TextInputLayout.h {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.h
        public void a(@NonNull TextInputLayout textInputLayout) {
            if (r.this.f114198w == textInputLayout.getEditText()) {
                return;
            }
            if (r.this.f114198w != null) {
                r.this.f114198w.removeTextChangedListener(r.this.H1);
                if (r.this.f114198w.getOnFocusChangeListener() == r.this.o().e()) {
                    r.this.f114198w.setOnFocusChangeListener(null);
                }
            }
            r.this.f114198w = textInputLayout.getEditText();
            if (r.this.f114198w != null) {
                r.this.f114198w.addTextChangedListener(r.this.H1);
            }
            r.this.o().n(r.this.f114198w);
            r rVar = r.this;
            rVar.m0(rVar.o());
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            r.this.h();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            r.this.R();
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray<s> f114202a = new SparseArray<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final r f114203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f114204c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f114205d;

        d(r rVar, j1 j1Var) {
            this.f114203b = rVar;
            this.f114204c = j1Var.u(r6.a.o.Yw, 0);
            this.f114205d = j1Var.u(r6.a.o.wx, 0);
        }

        private s b(int i10) {
            if (i10 == -1) {
                return new g(this.f114203b);
            }
            if (i10 == 0) {
                return new w(this.f114203b);
            }
            if (i10 == 1) {
                return new y(this.f114203b, this.f114205d);
            }
            if (i10 == 2) {
                return new f(this.f114203b);
            }
            if (i10 == 3) {
                return new p(this.f114203b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i10);
        }

        s c(int i10) {
            s sVarB = this.f114202a.get(i10);
            if (sVarB == null) {
                sVarB = b(i10);
                this.f114202a.append(i10, sVarB);
            }
            return sVarB;
        }
    }

    r(TextInputLayout textInputLayout, j1 j1Var) {
        super(textInputLayout.getContext());
        this.f114185i = 0;
        this.f114186j = new LinkedHashSet<>();
        this.H1 = new a();
        b bVar = new b();
        this.f114194p2 = bVar;
        this.f114192p0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f114177a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        int i10 = 5 & (-2);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, d0.f48644c));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f114178b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonK = k(this, layoutInflaterFrom, r6.a.h.X5);
        this.f114179c = checkableImageButtonK;
        CheckableImageButton checkableImageButtonK2 = k(frameLayout, layoutInflaterFrom, r6.a.h.W5);
        this.f114183g = checkableImageButtonK2;
        this.f114184h = new d(this, j1Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f114196t = appCompatTextView;
        E(j1Var);
        D(j1Var);
        F(j1Var);
        frameLayout.addView(checkableImageButtonK2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonK);
        textInputLayout.i(bVar);
        addOnAttachStateChangeListener(new c());
    }

    private void B0() {
        this.f114178b.setVisibility((this.f114183g.getVisibility() != 0 || J()) ? 8 : 0);
        setVisibility((I() || J() || ((this.f114195s == null || this.f114197v) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    private void C0() {
        this.f114179c.setVisibility(u() != null && this.f114177a.T() && this.f114177a.v0() ? 0 : 8);
        B0();
        D0();
        if (C()) {
            return;
        }
        this.f114177a.G0();
    }

    private void D(j1 j1Var) {
        if (!j1Var.C(r6.a.o.xx)) {
            if (j1Var.C(r6.a.o.cx)) {
                this.f114187k = com.google.android.material.resources.c.b(getContext(), j1Var, r6.a.o.cx);
            }
            if (j1Var.C(r6.a.o.dx)) {
                this.f114188l = com.google.android.material.internal.p0.t(j1Var.o(r6.a.o.dx, -1), null);
            }
        }
        if (j1Var.C(r6.a.o.ax)) {
            Z(j1Var.o(r6.a.o.ax, 0));
            if (j1Var.C(r6.a.o.Xw)) {
                V(j1Var.x(r6.a.o.Xw));
            }
            T(j1Var.a(r6.a.o.Ww, true));
        } else if (j1Var.C(r6.a.o.xx)) {
            if (j1Var.C(r6.a.o.yx)) {
                this.f114187k = com.google.android.material.resources.c.b(getContext(), j1Var, r6.a.o.yx);
            }
            if (j1Var.C(r6.a.o.zx)) {
                this.f114188l = com.google.android.material.internal.p0.t(j1Var.o(r6.a.o.zx, -1), null);
            }
            Z(j1Var.a(r6.a.o.xx, false) ? 1 : 0);
            V(j1Var.x(r6.a.o.vx));
        }
        Y(j1Var.g(r6.a.o.Zw, getResources().getDimensionPixelSize(r6.a.f.Ec)));
        if (j1Var.C(r6.a.o.bx)) {
            c0(t.b(j1Var.o(r6.a.o.bx, -1)));
        }
    }

    private void E(j1 j1Var) {
        if (j1Var.C(r6.a.o.ix)) {
            this.f114180d = com.google.android.material.resources.c.b(getContext(), j1Var, r6.a.o.ix);
        }
        if (j1Var.C(r6.a.o.jx)) {
            this.f114181e = com.google.android.material.internal.p0.t(j1Var.o(r6.a.o.jx, -1), null);
        }
        if (j1Var.C(r6.a.o.hx)) {
            h0(j1Var.h(r6.a.o.hx));
        }
        this.f114179c.setContentDescription(getResources().getText(r6.a.m.U));
        u1.Y1(this.f114179c, 2);
        this.f114179c.setClickable(false);
        this.f114179c.setPressable(false);
        this.f114179c.setFocusable(false);
    }

    private void E0() {
        int visibility = this.f114196t.getVisibility();
        int i10 = 6 ^ 0;
        int i11 = (this.f114195s == null || this.f114197v) ? 8 : 0;
        if (visibility != i11) {
            o().q(i11 == 0);
        }
        B0();
        this.f114196t.setVisibility(i11);
        this.f114177a.G0();
    }

    private void F(j1 j1Var) {
        this.f114196t.setVisibility(8);
        this.f114196t.setId(r6.a.h.f360654e6);
        this.f114196t.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        u1.I1(this.f114196t, 1);
        v0(j1Var.u(r6.a.o.Qx, 0));
        if (j1Var.C(r6.a.o.Rx)) {
            w0(j1Var.d(r6.a.o.Rx));
        }
        u0(j1Var.x(r6.a.o.Px));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        AccessibilityManager accessibilityManager;
        androidx.core.view.accessibility.c.e eVar = this.f114193p1;
        if (eVar != null && (accessibilityManager = this.f114192p0) != null) {
            androidx.core.view.accessibility.c.h(accessibilityManager, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f114193p1 == null || this.f114192p0 == null || !u1.R0(this)) {
            return;
        }
        androidx.core.view.accessibility.c.b(this.f114192p0, this.f114193p1);
    }

    private CheckableImageButton k(ViewGroup viewGroup, LayoutInflater layoutInflater, @androidx.annotation.d0 int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(r6.a.k.Q, viewGroup, false);
        checkableImageButton.setId(i10);
        t.e(checkableImageButton);
        if (com.google.android.material.resources.c.j(getContext())) {
            j0.h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void l(int i10) {
        Iterator<TextInputLayout.i> it = this.f114186j.iterator();
        while (it.hasNext()) {
            it.next().a(this.f114177a, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(s sVar) {
        if (this.f114198w == null) {
            return;
        }
        if (sVar.e() != null) {
            this.f114198w.setOnFocusChangeListener(sVar.e());
        }
        if (sVar.g() != null) {
            this.f114183g.setOnFocusChangeListener(sVar.g());
        }
    }

    private int v(s sVar) {
        int i10 = this.f114184h.f114204c;
        return i10 == 0 ? sVar.d() : i10;
    }

    private void x0(@NonNull s sVar) {
        sVar.s();
        this.f114193p1 = sVar.h();
        h();
    }

    private void y0(@NonNull s sVar) {
        R();
        this.f114193p1 = null;
        sVar.u();
    }

    private void z0(boolean z10) {
        if (!z10 || p() == null) {
            t.a(this.f114177a, this.f114183g, this.f114187k, this.f114188l);
            return;
        }
        Drawable drawableMutate = androidx.core.graphics.drawable.c.r(p()).mutate();
        androidx.core.graphics.drawable.c.n(drawableMutate, this.f114177a.getErrorCurrentTextColors());
        this.f114183g.setImageDrawable(drawableMutate);
    }

    int A() {
        return u1.m0(this) + u1.m0(this.f114196t) + ((I() || J()) ? this.f114183g.getMeasuredWidth() + j0.c((ViewGroup.MarginLayoutParams) this.f114183g.getLayoutParams()) : 0);
    }

    void A0(boolean z10) {
        if (this.f114185i == 1) {
            this.f114183g.performClick();
            if (z10) {
                this.f114183g.jumpDrawablesToCurrentState();
            }
        }
    }

    TextView B() {
        return this.f114196t;
    }

    boolean C() {
        return this.f114185i != 0;
    }

    void D0() {
        if (this.f114177a.f114076d == null) {
            return;
        }
        u1.m2(this.f114196t, getContext().getResources().getDimensionPixelSize(r6.a.f.f360173ea), this.f114177a.f114076d.getPaddingTop(), (I() || J()) ? 0 : u1.m0(this.f114177a.f114076d), this.f114177a.f114076d.getPaddingBottom());
    }

    boolean G() {
        return this.f114183g.a();
    }

    boolean H() {
        return C() && this.f114183g.isChecked();
    }

    boolean I() {
        return this.f114178b.getVisibility() == 0 && this.f114183g.getVisibility() == 0;
    }

    boolean J() {
        return this.f114179c.getVisibility() == 0;
    }

    boolean K() {
        return this.f114185i == 1;
    }

    void L(boolean z10) {
        this.f114197v = z10;
        E0();
    }

    void M() {
        C0();
        O();
        N();
        if (o().t()) {
            z0(this.f114177a.v0());
        }
    }

    void N() {
        t.d(this.f114177a, this.f114183g, this.f114187k);
    }

    void O() {
        t.d(this.f114177a, this.f114179c, this.f114180d);
    }

    void P(boolean z10) {
        boolean z11;
        boolean zIsActivated;
        boolean zIsChecked;
        s sVarO = o();
        boolean z12 = true;
        if (!sVarO.l() || (zIsChecked = this.f114183g.isChecked()) == sVarO.m()) {
            z11 = false;
        } else {
            this.f114183g.setChecked(!zIsChecked);
            z11 = true;
        }
        if (!sVarO.j() || (zIsActivated = this.f114183g.isActivated()) == sVarO.k()) {
            z12 = z11;
        } else {
            S(!zIsActivated);
        }
        if (z10 || z12) {
            N();
        }
    }

    void Q(@NonNull TextInputLayout.i iVar) {
        this.f114186j.remove(iVar);
    }

    void S(boolean z10) {
        this.f114183g.setActivated(z10);
    }

    void T(boolean z10) {
        this.f114183g.setCheckable(z10);
    }

    void U(@f1 int i10) {
        V(i10 != 0 ? getResources().getText(i10) : null);
    }

    void V(@p0 CharSequence charSequence) {
        if (n() != charSequence) {
            this.f114183g.setContentDescription(charSequence);
        }
    }

    void W(@androidx.annotation.v int i10) {
        X(i10 != 0 ? j.a.b(getContext(), i10) : null);
    }

    void X(@p0 Drawable drawable) {
        this.f114183g.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f114177a, this.f114183g, this.f114187k, this.f114188l);
            N();
        }
    }

    void Y(@t0 int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != this.f114189m) {
            this.f114189m = i10;
            t.g(this.f114183g, i10);
            t.g(this.f114179c, i10);
        }
    }

    void Z(int i10) {
        if (this.f114185i == i10) {
            return;
        }
        y0(o());
        int i11 = this.f114185i;
        this.f114185i = i10;
        l(i11);
        f0(i10 != 0);
        s sVarO = o();
        W(v(sVarO));
        U(sVarO.c());
        T(sVarO.l());
        if (!sVarO.i(this.f114177a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f114177a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        x0(sVarO);
        a0(sVarO.f());
        EditText editText = this.f114198w;
        if (editText != null) {
            sVarO.n(editText);
            m0(sVarO);
        }
        t.a(this.f114177a, this.f114183g, this.f114187k, this.f114188l);
        P(true);
    }

    void a0(@p0 View.OnClickListener onClickListener) {
        t.h(this.f114183g, onClickListener, this.f114191o);
    }

    void b0(@p0 View.OnLongClickListener onLongClickListener) {
        this.f114191o = onLongClickListener;
        t.i(this.f114183g, onLongClickListener);
    }

    void c0(@NonNull ImageView.ScaleType scaleType) {
        this.f114190n = scaleType;
        t.j(this.f114183g, scaleType);
        t.j(this.f114179c, scaleType);
    }

    void d0(@p0 ColorStateList colorStateList) {
        if (this.f114187k != colorStateList) {
            this.f114187k = colorStateList;
            t.a(this.f114177a, this.f114183g, colorStateList, this.f114188l);
        }
    }

    void e0(@p0 PorterDuff.Mode mode) {
        if (this.f114188l != mode) {
            this.f114188l = mode;
            t.a(this.f114177a, this.f114183g, this.f114187k, mode);
        }
    }

    void f0(boolean z10) {
        if (I() != z10) {
            this.f114183g.setVisibility(z10 ? 0 : 8);
            B0();
            D0();
            this.f114177a.G0();
        }
    }

    void g(@NonNull TextInputLayout.i iVar) {
        this.f114186j.add(iVar);
    }

    void g0(@androidx.annotation.v int i10) {
        h0(i10 != 0 ? j.a.b(getContext(), i10) : null);
        O();
    }

    void h0(@p0 Drawable drawable) {
        this.f114179c.setImageDrawable(drawable);
        C0();
        t.a(this.f114177a, this.f114179c, this.f114180d, this.f114181e);
    }

    void i() {
        this.f114183g.performClick();
        this.f114183g.jumpDrawablesToCurrentState();
    }

    void i0(@p0 View.OnClickListener onClickListener) {
        t.h(this.f114179c, onClickListener, this.f114182f);
    }

    void j() {
        this.f114186j.clear();
    }

    void j0(@p0 View.OnLongClickListener onLongClickListener) {
        this.f114182f = onLongClickListener;
        t.i(this.f114179c, onLongClickListener);
    }

    void k0(@p0 ColorStateList colorStateList) {
        if (this.f114180d != colorStateList) {
            this.f114180d = colorStateList;
            t.a(this.f114177a, this.f114179c, colorStateList, this.f114181e);
        }
    }

    void l0(@p0 PorterDuff.Mode mode) {
        if (this.f114181e != mode) {
            this.f114181e = mode;
            t.a(this.f114177a, this.f114179c, this.f114180d, mode);
        }
    }

    @p0
    CheckableImageButton m() {
        if (J()) {
            return this.f114179c;
        }
        if (C() && I()) {
            return this.f114183g;
        }
        return null;
    }

    @p0
    CharSequence n() {
        return this.f114183g.getContentDescription();
    }

    void n0(@f1 int i10) {
        o0(i10 != 0 ? getResources().getText(i10) : null);
    }

    s o() {
        return this.f114184h.c(this.f114185i);
    }

    void o0(@p0 CharSequence charSequence) {
        this.f114183g.setContentDescription(charSequence);
    }

    @p0
    Drawable p() {
        return this.f114183g.getDrawable();
    }

    void p0(@androidx.annotation.v int i10) {
        q0(i10 != 0 ? j.a.b(getContext(), i10) : null);
    }

    int q() {
        return this.f114189m;
    }

    void q0(@p0 Drawable drawable) {
        this.f114183g.setImageDrawable(drawable);
    }

    int r() {
        return this.f114185i;
    }

    void r0(boolean z10) {
        if (z10 && this.f114185i != 1) {
            Z(1);
        } else {
            if (z10) {
                return;
            }
            Z(0);
        }
    }

    @NonNull
    ImageView.ScaleType s() {
        return this.f114190n;
    }

    void s0(@p0 ColorStateList colorStateList) {
        this.f114187k = colorStateList;
        t.a(this.f114177a, this.f114183g, colorStateList, this.f114188l);
    }

    CheckableImageButton t() {
        return this.f114183g;
    }

    void t0(@p0 PorterDuff.Mode mode) {
        this.f114188l = mode;
        t.a(this.f114177a, this.f114183g, this.f114187k, mode);
    }

    Drawable u() {
        return this.f114179c.getDrawable();
    }

    void u0(@p0 CharSequence charSequence) {
        this.f114195s = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f114196t.setText(charSequence);
        E0();
    }

    void v0(@g1 int i10) {
        androidx.core.widget.r.D(this.f114196t, i10);
    }

    @p0
    CharSequence w() {
        return this.f114183g.getContentDescription();
    }

    void w0(@NonNull ColorStateList colorStateList) {
        this.f114196t.setTextColor(colorStateList);
    }

    @p0
    Drawable x() {
        return this.f114183g.getDrawable();
    }

    @p0
    CharSequence y() {
        return this.f114195s;
    }

    @p0
    ColorStateList z() {
        return this.f114196t.getTextColors();
    }
}
