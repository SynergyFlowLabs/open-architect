package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.l;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public class b extends FrameLayout implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final d f111921a;

    public b(@NonNull Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.circularreveal.g
    public void a() {
        this.f111921a.b();
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
        this.f111921a.a();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.g
    @e.a({"MissingSuperCall"})
    public void draw(@NonNull Canvas canvas) {
        d dVar = this.f111921a;
        if (dVar != null) {
            dVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.g
    @p0
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f111921a.g();
    }

    @Override // com.google.android.material.circularreveal.g
    public int getCircularRevealScrimColor() {
        return this.f111921a.h();
    }

    @Override // com.google.android.material.circularreveal.g
    @p0
    public g.e getRevealInfo() {
        return this.f111921a.j();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.g
    public boolean isOpaque() {
        d dVar = this.f111921a;
        return dVar != null ? dVar.l() : super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.g
    public void setCircularRevealOverlayDrawable(@p0 Drawable drawable) {
        this.f111921a.m(drawable);
    }

    @Override // com.google.android.material.circularreveal.g
    public void setCircularRevealScrimColor(@l int i10) {
        this.f111921a.n(i10);
    }

    @Override // com.google.android.material.circularreveal.g
    public void setRevealInfo(@p0 g.e eVar) {
        this.f111921a.o(eVar);
    }

    public b(@NonNull Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f111921a = new d(this);
    }
}
