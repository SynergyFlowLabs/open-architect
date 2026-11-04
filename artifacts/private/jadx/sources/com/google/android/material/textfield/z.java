package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.g1;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.j1;
import androidx.core.view.d0;
import androidx.core.view.j0;
import androidx.core.view.u1;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes4.dex */
@e.a({"ViewConstructor"})
class z extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextInputLayout f114260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextView f114261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private CharSequence f114262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CheckableImageButton f114263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ColorStateList f114264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PorterDuff.Mode f114265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f114266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    private ImageView.ScaleType f114267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private View.OnLongClickListener f114268i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f114269j;

    z(TextInputLayout textInputLayout, j1 j1Var) {
        super(textInputLayout.getContext());
        this.f114260a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, d0.f48643b));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(r6.a.k.R, (ViewGroup) this, false);
        this.f114263d = checkableImageButton;
        t.e(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f114261b = appCompatTextView;
        j(j1Var);
        i(j1Var);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void D() {
        int i10 = (this.f114262c == null || this.f114269j) ? 8 : 0;
        setVisibility((this.f114263d.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.f114261b.setVisibility(i10);
        this.f114260a.G0();
    }

    private void i(j1 j1Var) {
        this.f114261b.setVisibility(8);
        this.f114261b.setId(r6.a.h.f360646d6);
        this.f114261b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        u1.I1(this.f114261b, 1);
        p(j1Var.u(r6.a.o.Ex, 0));
        if (j1Var.C(r6.a.o.Fx)) {
            q(j1Var.d(r6.a.o.Fx));
        }
        o(j1Var.x(r6.a.o.Dx));
    }

    private void j(j1 j1Var) {
        if (com.google.android.material.resources.c.j(getContext())) {
            j0.g((ViewGroup.MarginLayoutParams) this.f114263d.getLayoutParams(), 0);
        }
        v(null);
        w(null);
        if (j1Var.C(r6.a.o.Nx)) {
            this.f114264e = com.google.android.material.resources.c.b(getContext(), j1Var, r6.a.o.Nx);
        }
        if (j1Var.C(r6.a.o.Ox)) {
            this.f114265f = com.google.android.material.internal.p0.t(j1Var.o(r6.a.o.Ox, -1), null);
        }
        if (j1Var.C(r6.a.o.Kx)) {
            t(j1Var.h(r6.a.o.Kx));
            if (j1Var.C(r6.a.o.Jx)) {
                s(j1Var.x(r6.a.o.Jx));
            }
            r(j1Var.a(r6.a.o.Ix, true));
        }
        u(j1Var.g(r6.a.o.Lx, getResources().getDimensionPixelSize(r6.a.f.Ec)));
        if (j1Var.C(r6.a.o.Mx)) {
            x(t.b(j1Var.o(r6.a.o.Mx, -1)));
        }
    }

    void A(boolean z10) {
        if (l() != z10) {
            this.f114263d.setVisibility(z10 ? 0 : 8);
            C();
            D();
        }
    }

    void B(@NonNull androidx.core.view.accessibility.j jVar) {
        if (this.f114261b.getVisibility() != 0) {
            jVar.j2(this.f114263d);
        } else {
            jVar.D1(this.f114261b);
            jVar.j2(this.f114261b);
        }
    }

    void C() {
        EditText editText = this.f114260a.f114076d;
        if (editText == null) {
            return;
        }
        u1.m2(this.f114261b, l() ? 0 : u1.n0(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(r6.a.f.f360173ea), editText.getCompoundPaddingBottom());
    }

    @p0
    CharSequence a() {
        return this.f114262c;
    }

    @p0
    ColorStateList b() {
        return this.f114261b.getTextColors();
    }

    int c() {
        return u1.n0(this) + u1.n0(this.f114261b) + (l() ? this.f114263d.getMeasuredWidth() + j0.b((ViewGroup.MarginLayoutParams) this.f114263d.getLayoutParams()) : 0);
    }

    @NonNull
    TextView d() {
        return this.f114261b;
    }

    @p0
    CharSequence e() {
        return this.f114263d.getContentDescription();
    }

    @p0
    Drawable f() {
        return this.f114263d.getDrawable();
    }

    int g() {
        return this.f114266g;
    }

    @NonNull
    ImageView.ScaleType h() {
        return this.f114267h;
    }

    boolean k() {
        return this.f114263d.a();
    }

    boolean l() {
        return this.f114263d.getVisibility() == 0;
    }

    void m(boolean z10) {
        this.f114269j = z10;
        D();
    }

    void n() {
        t.d(this.f114260a, this.f114263d, this.f114264e);
    }

    void o(@p0 CharSequence charSequence) {
        this.f114262c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f114261b.setText(charSequence);
        D();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        C();
    }

    void p(@g1 int i10) {
        androidx.core.widget.r.D(this.f114261b, i10);
    }

    void q(@NonNull ColorStateList colorStateList) {
        this.f114261b.setTextColor(colorStateList);
    }

    void r(boolean z10) {
        this.f114263d.setCheckable(z10);
    }

    void s(@p0 CharSequence charSequence) {
        if (e() != charSequence) {
            this.f114263d.setContentDescription(charSequence);
        }
    }

    void t(@p0 Drawable drawable) {
        this.f114263d.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f114260a, this.f114263d, this.f114264e, this.f114265f);
            int i10 = 7 ^ 1;
            A(true);
            n();
            return;
        }
        A(false);
        v(null);
        w(null);
        s(null);
    }

    void u(@t0 int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i10 != this.f114266g) {
            this.f114266g = i10;
            t.g(this.f114263d, i10);
        }
    }

    void v(@p0 View.OnClickListener onClickListener) {
        t.h(this.f114263d, onClickListener, this.f114268i);
    }

    void w(@p0 View.OnLongClickListener onLongClickListener) {
        this.f114268i = onLongClickListener;
        t.i(this.f114263d, onLongClickListener);
    }

    void x(@NonNull ImageView.ScaleType scaleType) {
        this.f114267h = scaleType;
        t.j(this.f114263d, scaleType);
    }

    void y(@p0 ColorStateList colorStateList) {
        if (this.f114264e != colorStateList) {
            this.f114264e = colorStateList;
            t.a(this.f114260a, this.f114263d, colorStateList, this.f114265f);
        }
    }

    void z(@p0 PorterDuff.Mode mode) {
        if (this.f114265f != mode) {
            this.f114265f = mode;
            t.a(this.f114260a, this.f114263d, this.f114264e, mode);
        }
    }
}
