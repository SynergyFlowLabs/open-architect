package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ImageView f11601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h1 f11602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h1 f11603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h1 f11604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11605e = 0;

    public u(@NonNull ImageView imageView) {
        this.f11601a = imageView;
    }

    private boolean a(@NonNull Drawable drawable) {
        if (this.f11604d == null) {
            this.f11604d = new h1();
        }
        h1 h1Var = this.f11604d;
        h1Var.a();
        ColorStateList colorStateListA = androidx.core.widget.k.a(this.f11601a);
        if (colorStateListA != null) {
            h1Var.f11335d = true;
            h1Var.f11332a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.k.b(this.f11601a);
        if (modeB != null) {
            h1Var.f11334c = true;
            h1Var.f11333b = modeB;
        }
        if (!h1Var.f11335d && !h1Var.f11334c) {
            return false;
        }
        n.j(drawable, h1Var, this.f11601a.getDrawableState());
        return true;
    }

    private boolean m() {
        return this.f11602b != null;
    }

    void b() {
        if (this.f11601a.getDrawable() != null) {
            this.f11601a.getDrawable().setLevel(this.f11605e);
        }
    }

    void c() {
        Drawable drawable = this.f11601a.getDrawable();
        if (drawable != null) {
            m0.b(drawable);
        }
        if (drawable != null) {
            if (m() && a(drawable)) {
                return;
            }
            h1 h1Var = this.f11603c;
            if (h1Var != null) {
                n.j(drawable, h1Var, this.f11601a.getDrawableState());
                return;
            }
            h1 h1Var2 = this.f11602b;
            if (h1Var2 != null) {
                n.j(drawable, h1Var2, this.f11601a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        h1 h1Var = this.f11603c;
        if (h1Var != null) {
            return h1Var.f11332a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        h1 h1Var = this.f11603c;
        if (h1Var != null) {
            return h1Var.f11333b;
        }
        return null;
    }

    boolean f() {
        return !(this.f11601a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int iU;
        j1 j1VarG = j1.G(this.f11601a.getContext(), attributeSet, i.a.m.f286505d0, i10, 0);
        ImageView imageView = this.f11601a;
        androidx.core.view.u1.E1(imageView, imageView.getContext(), i.a.m.f286505d0, attributeSet, j1VarG.B(), i10, 0);
        try {
            Drawable drawable = this.f11601a.getDrawable();
            if (drawable == null && (iU = j1VarG.u(i.a.m.f286523f0, -1)) != -1 && (drawable = j.a.b(this.f11601a.getContext(), iU)) != null) {
                this.f11601a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                m0.b(drawable);
            }
            if (j1VarG.C(i.a.m.f286532g0)) {
                androidx.core.widget.k.c(this.f11601a, j1VarG.d(i.a.m.f286532g0));
            }
            if (j1VarG.C(i.a.m.f286541h0)) {
                androidx.core.widget.k.d(this.f11601a, m0.e(j1VarG.o(i.a.m.f286541h0, -1), null));
            }
        } finally {
            j1VarG.I();
        }
    }

    void h(@NonNull Drawable drawable) {
        this.f11605e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable drawableB = j.a.b(this.f11601a.getContext(), i10);
            if (drawableB != null) {
                m0.b(drawableB);
            }
            this.f11601a.setImageDrawable(drawableB);
        } else {
            this.f11601a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f11602b == null) {
                this.f11602b = new h1();
            }
            h1 h1Var = this.f11602b;
            h1Var.f11332a = colorStateList;
            h1Var.f11335d = true;
        } else {
            this.f11602b = null;
        }
        c();
    }

    void k(ColorStateList colorStateList) {
        if (this.f11603c == null) {
            this.f11603c = new h1();
        }
        h1 h1Var = this.f11603c;
        h1Var.f11332a = colorStateList;
        h1Var.f11335d = true;
        c();
    }

    void l(PorterDuff.Mode mode) {
        if (this.f11603c == null) {
            this.f11603c = new h1();
        }
        h1 h1Var = this.f11603c;
        h1Var.f11333b = mode;
        h1Var.f11334c = true;
        c();
    }
}
