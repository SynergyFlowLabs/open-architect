package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final CompoundButton f11390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f11391b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f11392c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f11393d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11394e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f11395f;

    m(@NonNull CompoundButton compoundButton) {
        this.f11390a = compoundButton;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.d.a(this.f11390a);
        if (drawableA != null) {
            if (this.f11393d || this.f11394e) {
                Drawable drawableMutate = androidx.core.graphics.drawable.c.r(drawableA).mutate();
                if (this.f11393d) {
                    androidx.core.graphics.drawable.c.o(drawableMutate, this.f11391b);
                }
                if (this.f11394e) {
                    androidx.core.graphics.drawable.c.p(drawableMutate, this.f11392c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f11390a.getDrawableState());
                }
                this.f11390a.setButtonDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f11391b;
    }

    PorterDuff.Mode c() {
        return this.f11392c;
    }

    void d(@androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        int iU;
        int iU2;
        j1 j1VarG = j1.G(this.f11390a.getContext(), attributeSet, i.a.m.f286677x3, i10, 0);
        CompoundButton compoundButton = this.f11390a;
        androidx.core.view.u1.E1(compoundButton, compoundButton.getContext(), i.a.m.f286677x3, attributeSet, j1VarG.B(), i10, 0);
        try {
            if (j1VarG.C(i.a.m.f286693z3) && (iU2 = j1VarG.u(i.a.m.f286693z3, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f11390a;
                    compoundButton2.setButtonDrawable(j.a.b(compoundButton2.getContext(), iU2));
                } catch (Resources.NotFoundException unused) {
                    if (j1VarG.C(i.a.m.f286685y3)) {
                        CompoundButton compoundButton3 = this.f11390a;
                        compoundButton3.setButtonDrawable(j.a.b(compoundButton3.getContext(), iU));
                    }
                }
            } else if (j1VarG.C(i.a.m.f286685y3) && (iU = j1VarG.u(i.a.m.f286685y3, 0)) != 0) {
                CompoundButton compoundButton4 = this.f11390a;
                compoundButton4.setButtonDrawable(j.a.b(compoundButton4.getContext(), iU));
            }
            if (j1VarG.C(i.a.m.A3)) {
                androidx.core.widget.d.d(this.f11390a, j1VarG.d(i.a.m.A3));
            }
            if (j1VarG.C(i.a.m.B3)) {
                int i11 = 7 & (-1);
                androidx.core.widget.d.e(this.f11390a, m0.e(j1VarG.o(i.a.m.B3, -1), null));
            }
        } finally {
            j1VarG.I();
        }
    }

    void e() {
        if (this.f11395f) {
            this.f11395f = false;
        } else {
            this.f11395f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f11391b = colorStateList;
        this.f11393d = true;
        a();
    }

    void g(@androidx.annotation.p0 PorterDuff.Mode mode) {
        this.f11392c = mode;
        this.f11394e = true;
        a();
    }
}
