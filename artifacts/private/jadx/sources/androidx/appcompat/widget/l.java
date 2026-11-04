package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final CheckedTextView f11383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f11384b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f11385c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f11386d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11387e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f11388f;

    l(@NonNull CheckedTextView checkedTextView) {
        this.f11383a = checkedTextView;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.c.a(this.f11383a);
        if (drawableA != null) {
            if (this.f11386d || this.f11387e) {
                Drawable drawableMutate = androidx.core.graphics.drawable.c.r(drawableA).mutate();
                if (this.f11386d) {
                    androidx.core.graphics.drawable.c.o(drawableMutate, this.f11384b);
                }
                if (this.f11387e) {
                    androidx.core.graphics.drawable.c.p(drawableMutate, this.f11385c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f11383a.getDrawableState());
                }
                this.f11383a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f11384b;
    }

    PorterDuff.Mode c() {
        return this.f11385c;
    }

    void d(@androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        int iU;
        int iU2;
        j1 j1VarG = j1.G(this.f11383a.getContext(), attributeSet, i.a.m.f286637s3, i10, 0);
        CheckedTextView checkedTextView = this.f11383a;
        androidx.core.view.u1.E1(checkedTextView, checkedTextView.getContext(), i.a.m.f286637s3, attributeSet, j1VarG.B(), i10, 0);
        try {
            if (j1VarG.C(i.a.m.f286653u3) && (iU2 = j1VarG.u(i.a.m.f286653u3, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.f11383a;
                    checkedTextView2.setCheckMarkDrawable(j.a.b(checkedTextView2.getContext(), iU2));
                } catch (Resources.NotFoundException unused) {
                    if (j1VarG.C(i.a.m.f286645t3)) {
                        CheckedTextView checkedTextView3 = this.f11383a;
                        checkedTextView3.setCheckMarkDrawable(j.a.b(checkedTextView3.getContext(), iU));
                    }
                }
            } else if (j1VarG.C(i.a.m.f286645t3) && (iU = j1VarG.u(i.a.m.f286645t3, 0)) != 0) {
                CheckedTextView checkedTextView4 = this.f11383a;
                checkedTextView4.setCheckMarkDrawable(j.a.b(checkedTextView4.getContext(), iU));
            }
            if (j1VarG.C(i.a.m.f286661v3)) {
                androidx.core.widget.c.d(this.f11383a, j1VarG.d(i.a.m.f286661v3));
            }
            if (j1VarG.C(i.a.m.f286669w3)) {
                androidx.core.widget.c.e(this.f11383a, m0.e(j1VarG.o(i.a.m.f286669w3, -1), null));
            }
        } finally {
            j1VarG.I();
        }
    }

    void e() {
        if (this.f11388f) {
            this.f11388f = false;
        } else {
            this.f11388f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f11384b = colorStateList;
        this.f11386d = true;
        a();
    }

    void g(@androidx.annotation.p0 PorterDuff.Mode mode) {
        this.f11385c = mode;
        this.f11387e = true;
        a();
    }
}
