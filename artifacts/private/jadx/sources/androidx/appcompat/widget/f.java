package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f11269a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h1 f11272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h1 f11273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h1 f11274f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11271c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f11270b = n.b();

    f(@NonNull View view) {
        int i10 = 5 | (-1);
        this.f11269a = view;
    }

    private boolean a(@NonNull Drawable drawable) {
        if (this.f11274f == null) {
            this.f11274f = new h1();
        }
        h1 h1Var = this.f11274f;
        h1Var.a();
        ColorStateList colorStateListO = androidx.core.view.u1.O(this.f11269a);
        if (colorStateListO != null) {
            h1Var.f11335d = true;
            h1Var.f11332a = colorStateListO;
        }
        PorterDuff.Mode modeP = androidx.core.view.u1.P(this.f11269a);
        if (modeP != null) {
            h1Var.f11334c = true;
            h1Var.f11333b = modeP;
        }
        if (!h1Var.f11335d && !h1Var.f11334c) {
            return false;
        }
        n.j(drawable, h1Var, this.f11269a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f11272d != null;
    }

    void b() {
        Drawable background = this.f11269a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            h1 h1Var = this.f11273e;
            if (h1Var != null) {
                n.j(background, h1Var, this.f11269a.getDrawableState());
                return;
            }
            h1 h1Var2 = this.f11272d;
            if (h1Var2 != null) {
                n.j(background, h1Var2, this.f11269a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        h1 h1Var = this.f11273e;
        if (h1Var != null) {
            return h1Var.f11332a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        h1 h1Var = this.f11273e;
        if (h1Var != null) {
            return h1Var.f11333b;
        }
        return null;
    }

    void e(@androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        j1 j1VarG = j1.G(this.f11269a.getContext(), attributeSet, i.a.m.f286521e7, i10, 0);
        View view = this.f11269a;
        androidx.core.view.u1.E1(view, view.getContext(), i.a.m.f286521e7, attributeSet, j1VarG.B(), i10, 0);
        try {
            if (j1VarG.C(i.a.m.f286530f7)) {
                this.f11271c = j1VarG.u(i.a.m.f286530f7, -1);
                ColorStateList colorStateListF = this.f11270b.f(this.f11269a.getContext(), this.f11271c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            if (j1VarG.C(i.a.m.f286539g7)) {
                androidx.core.view.u1.P1(this.f11269a, j1VarG.d(i.a.m.f286539g7));
            }
            if (j1VarG.C(i.a.m.f286548h7)) {
                androidx.core.view.u1.Q1(this.f11269a, m0.e(j1VarG.o(i.a.m.f286548h7, -1), null));
            }
        } finally {
            j1VarG.I();
        }
    }

    void f(Drawable drawable) {
        this.f11271c = -1;
        h(null);
        b();
    }

    void g(int i10) {
        this.f11271c = i10;
        n nVar = this.f11270b;
        h(nVar != null ? nVar.f(this.f11269a.getContext(), i10) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f11272d == null) {
                this.f11272d = new h1();
            }
            h1 h1Var = this.f11272d;
            h1Var.f11332a = colorStateList;
            h1Var.f11335d = true;
        } else {
            this.f11272d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f11273e == null) {
            this.f11273e = new h1();
        }
        h1 h1Var = this.f11273e;
        h1Var.f11332a = colorStateList;
        h1Var.f11335d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f11273e == null) {
            this.f11273e = new h1();
        }
        h1 h1Var = this.f11273e;
        h1Var.f11333b = mode;
        h1Var.f11334c = true;
        b();
    }
}
