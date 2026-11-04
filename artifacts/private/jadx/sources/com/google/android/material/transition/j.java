package com.google.android.material.transition;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes4.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f114510a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f114511b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f114512c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.material.shape.q f114513d = com.google.android.material.shape.q.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.material.shape.p f114514e;

    j() {
    }

    void a(Canvas canvas) {
        canvas.clipPath(this.f114510a);
    }

    void b(float f10, com.google.android.material.shape.p pVar, com.google.android.material.shape.p pVar2, RectF rectF, RectF rectF2, RectF rectF3, l.e eVar) {
        com.google.android.material.shape.p pVarP = v.p(pVar, pVar2, rectF, rectF3, eVar.d(), eVar.c(), f10);
        this.f114514e = pVarP;
        this.f114513d.d(pVarP, 1.0f, rectF2, this.f114511b);
        this.f114513d.d(this.f114514e, 1.0f, rectF3, this.f114512c);
        this.f114510a.op(this.f114511b, this.f114512c, Path.Op.UNION);
    }

    com.google.android.material.shape.p c() {
        return this.f114514e;
    }

    Path d() {
        return this.f114510a;
    }
}
