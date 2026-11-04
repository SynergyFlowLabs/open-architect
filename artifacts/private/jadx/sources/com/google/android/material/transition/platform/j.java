package com.google.android.material.transition.platform;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes4.dex */
@w0(21)
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f114614a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f114615b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f114616c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.material.shape.q f114617d = com.google.android.material.shape.q.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.material.shape.p f114618e;

    j() {
    }

    void a(Canvas canvas) {
        canvas.clipPath(this.f114614a);
    }

    void b(float f10, com.google.android.material.shape.p pVar, com.google.android.material.shape.p pVar2, RectF rectF, RectF rectF2, RectF rectF3, l.e eVar) {
        com.google.android.material.shape.p pVarP = w.p(pVar, pVar2, rectF, rectF3, eVar.d(), eVar.c(), f10);
        this.f114618e = pVarP;
        this.f114617d.d(pVarP, 1.0f, rectF2, this.f114615b);
        this.f114617d.d(this.f114618e, 1.0f, rectF3, this.f114616c);
        this.f114614a.op(this.f114615b, this.f114616c, Path.Op.UNION);
    }

    com.google.android.material.shape.p c() {
        return this.f114618e;
    }

    Path d() {
        return this.f114614a;
    }
}
