package com.airbnb.lottie.model;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY})
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointF f88342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f88343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PointF f88344c;

    public a() {
        this.f88342a = new PointF();
        this.f88343b = new PointF();
        this.f88344c = new PointF();
    }

    public PointF a() {
        return this.f88342a;
    }

    public PointF b() {
        return this.f88343b;
    }

    public PointF c() {
        return this.f88344c;
    }

    public void d(float f10, float f11) {
        this.f88342a.set(f10, f11);
    }

    public void e(float f10, float f11) {
        this.f88343b.set(f10, f11);
    }

    public void f(a aVar) {
        PointF pointF = aVar.f88344c;
        g(pointF.x, pointF.y);
        PointF pointF2 = aVar.f88342a;
        d(pointF2.x, pointF2.y);
        PointF pointF3 = aVar.f88343b;
        e(pointF3.x, pointF3.y);
    }

    public void g(float f10, float f11) {
        this.f88344c.set(f10, f11);
    }

    @NonNull
    @e.a({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f88344c.x), Float.valueOf(this.f88344c.y), Float.valueOf(this.f88342a.x), Float.valueOf(this.f88342a.y), Float.valueOf(this.f88343b.x), Float.valueOf(this.f88343b.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f88342a = pointF;
        this.f88343b = pointF2;
        this.f88344c = pointF3;
    }
}
