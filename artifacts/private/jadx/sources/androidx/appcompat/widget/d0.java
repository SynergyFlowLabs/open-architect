package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: loaded from: classes.dex */
class d0 extends z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SeekBar f11231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f11232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ColorStateList f11233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f11234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f11235h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f11236i;

    d0(SeekBar seekBar) {
        super(seekBar);
        this.f11233f = null;
        this.f11234g = null;
        this.f11235h = false;
        this.f11236i = false;
        this.f11231d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f11232e;
        if (drawable != null) {
            if (this.f11235h || this.f11236i) {
                Drawable drawableR = androidx.core.graphics.drawable.c.r(drawable.mutate());
                this.f11232e = drawableR;
                if (this.f11235h) {
                    androidx.core.graphics.drawable.c.o(drawableR, this.f11233f);
                }
                if (this.f11236i) {
                    androidx.core.graphics.drawable.c.p(this.f11232e, this.f11234g);
                }
                if (this.f11232e.isStateful()) {
                    this.f11232e.setState(this.f11231d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.z
    void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        j1 j1VarG = j1.G(this.f11231d.getContext(), attributeSet, i.a.m.f286550i0, i10, 0);
        SeekBar seekBar = this.f11231d;
        androidx.core.view.u1.E1(seekBar, seekBar.getContext(), i.a.m.f286550i0, attributeSet, j1VarG.B(), i10, 0);
        Drawable drawableI = j1VarG.i(i.a.m.f286559j0);
        if (drawableI != null) {
            this.f11231d.setThumb(drawableI);
        }
        m(j1VarG.h(i.a.m.f286568k0));
        if (j1VarG.C(i.a.m.f286586m0)) {
            this.f11234g = m0.e(j1VarG.o(i.a.m.f286586m0, -1), this.f11234g);
            this.f11236i = true;
        }
        if (j1VarG.C(i.a.m.f286577l0)) {
            this.f11233f = j1VarG.d(i.a.m.f286577l0);
            this.f11235h = true;
        }
        j1VarG.I();
        f();
    }

    void g(Canvas canvas) {
        if (this.f11232e != null) {
            int max = this.f11231d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f11232e.getIntrinsicWidth();
                int intrinsicHeight = this.f11232e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f11232e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f11231d.getWidth() - this.f11231d.getPaddingLeft()) - this.f11231d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f11231d.getPaddingLeft(), this.f11231d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f11232e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.f11232e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f11231d.getDrawableState())) {
            this.f11231d.invalidateDrawable(drawable);
        }
    }

    @androidx.annotation.p0
    Drawable i() {
        return this.f11232e;
    }

    @androidx.annotation.p0
    ColorStateList j() {
        return this.f11233f;
    }

    @androidx.annotation.p0
    PorterDuff.Mode k() {
        return this.f11234g;
    }

    void l() {
        Drawable drawable = this.f11232e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void m(@androidx.annotation.p0 Drawable drawable) {
        Drawable drawable2 = this.f11232e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f11232e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f11231d);
            androidx.core.graphics.drawable.c.m(drawable, this.f11231d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f11231d.getDrawableState());
            }
            f();
        }
        this.f11231d.invalidate();
    }

    void n(@androidx.annotation.p0 ColorStateList colorStateList) {
        this.f11233f = colorStateList;
        this.f11235h = true;
        f();
    }

    void o(@androidx.annotation.p0 PorterDuff.Mode mode) {
        this.f11234g = mode;
        this.f11236i = true;
        f();
    }
}
