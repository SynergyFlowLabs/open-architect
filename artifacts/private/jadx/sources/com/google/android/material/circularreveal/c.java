package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.GridLayout;
import androidx.annotation.NonNull;
import androidx.annotation.l;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public class c extends GridLayout implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final d f111922a;

    public c(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.circularreveal.g
    public void a() {
        this.f111922a.b();
    }

    @Override // com.google.android.material.circularreveal.d.a
    public void b(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.google.android.material.circularreveal.d.a
    public boolean c() {
        return super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.g
    public void d() {
        this.f111922a.a();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.g
    public void draw(@NonNull Canvas canvas) {
        d dVar = this.f111922a;
        if (dVar != null) {
            dVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.g
    @p0
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f111922a.g();
    }

    @Override // com.google.android.material.circularreveal.g
    public int getCircularRevealScrimColor() {
        return this.f111922a.h();
    }

    @Override // com.google.android.material.circularreveal.g
    @p0
    public g.e getRevealInfo() {
        return this.f111922a.j();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.g
    public boolean isOpaque() {
        d dVar = this.f111922a;
        return dVar != null ? dVar.l() : super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.g
    public void setCircularRevealOverlayDrawable(@p0 Drawable drawable) {
        this.f111922a.m(drawable);
    }

    @Override // com.google.android.material.circularreveal.g
    public void setCircularRevealScrimColor(@l int i10) {
        this.f111922a.n(i10);
    }

    @Override // com.google.android.material.circularreveal.g
    public void setRevealInfo(@p0 g.e eVar) {
        this.f111922a.o(eVar);
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f111922a = new d(this);
    }
}
