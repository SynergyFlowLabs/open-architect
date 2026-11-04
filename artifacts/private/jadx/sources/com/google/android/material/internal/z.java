package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.core.view.g3;
import androidx.core.view.u1;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class z extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    Drawable f112958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Rect f112959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Rect f112960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f112961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f112962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f112963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f112964g;

    class a implements androidx.core.view.b1 {
        a() {
        }

        @Override // androidx.core.view.b1
        public g3 b(View view, @NonNull g3 g3Var) {
            z zVar = z.this;
            if (zVar.f112959b == null) {
                zVar.f112959b = new Rect();
            }
            z.this.f112959b.set(g3Var.p(), g3Var.r(), g3Var.q(), g3Var.o());
            z.this.h(g3Var);
            z.this.setWillNotDraw(!g3Var.w() || z.this.f112958a == null);
            u1.s1(z.this);
            return g3Var.c();
        }
    }

    public z(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f112959b == null || this.f112958a == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.f112961d) {
            this.f112960c.set(0, 0, width, this.f112959b.top);
            this.f112958a.setBounds(this.f112960c);
            this.f112958a.draw(canvas);
        }
        if (this.f112962e) {
            this.f112960c.set(0, height - this.f112959b.bottom, width, height);
            this.f112958a.setBounds(this.f112960c);
            this.f112958a.draw(canvas);
        }
        if (this.f112963f) {
            Rect rect = this.f112960c;
            Rect rect2 = this.f112959b;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f112958a.setBounds(this.f112960c);
            this.f112958a.draw(canvas);
        }
        if (this.f112964g) {
            Rect rect3 = this.f112960c;
            Rect rect4 = this.f112959b;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f112958a.setBounds(this.f112960c);
            this.f112958a.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    protected void h(g3 g3Var) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f112958a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f112958a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z10) {
        this.f112962e = z10;
    }

    public void setDrawLeftInsetForeground(boolean z10) {
        this.f112963f = z10;
    }

    public void setDrawRightInsetForeground(boolean z10) {
        this.f112964g = z10;
    }

    public void setDrawTopInsetForeground(boolean z10) {
        this.f112961d = z10;
    }

    public void setScrimInsetForeground(@androidx.annotation.p0 Drawable drawable) {
        this.f112958a = drawable;
    }

    public z(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public z(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f112960c = new Rect();
        this.f112961d = true;
        this.f112962e = true;
        this.f112963f = true;
        this.f112964g = true;
        TypedArray typedArrayK = g0.k(context, attributeSet, r6.a.o.os, i10, r6.a.n.Re, new int[0]);
        this.f112958a = typedArrayK.getDrawable(r6.a.o.ps);
        typedArrayK.recycle();
        setWillNotDraw(true);
        u1.j2(this, new a());
    }
}
