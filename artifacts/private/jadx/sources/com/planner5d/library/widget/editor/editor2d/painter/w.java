package com.planner5d.library.widget.editor.editor2d.painter;

import android.graphics.Matrix;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes12.dex */
class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointF f255333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f255334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final float f255335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f255336d;

    w(d dVar, Matrix matrix, PointF pointF, float f10, float f11) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float f12 = fArr[0];
        this.f255335c = f12;
        this.f255336d = f12 * dVar.K;
        this.f255334b = dVar.D;
        this.f255333a = new PointF(b(fArr, pointF, dVar.B.x, dVar.O.width(), dVar.O.height(), f10, f11), dVar.B.y);
    }

    private float b(float[] fArr, PointF pointF, float f10, float f11, float f12, float f13, float f14) {
        PointF pointF2 = new PointF(-fArr[2], -fArr[5]);
        return Math.max(f10, Math.max(Math.max(Math.max(c(this.f255335c, pointF.x, pointF2.x), c(this.f255335c, pointF.y, pointF2.y)), d(this.f255335c, pointF.x, pointF2.x, f13, f11 * this.f255336d)), d(this.f255335c, pointF.y, pointF2.y, f14, f12 * this.f255336d)));
    }

    private float c(float f10, float f11, float f12) {
        return f11 / ((Math.max(0.0f, f12) + f11) / f10);
    }

    private float d(float f10, float f11, float f12, float f13, float f14) {
        return c(f10, f13 - f11, (f14 - f12) - f13);
    }

    float a(float f10) {
        float f11 = f10 / this.f255334b;
        float f12 = this.f255335c;
        float f13 = f12 * f11;
        PointF pointF = this.f255333a;
        float f14 = pointF.y;
        if (f13 > f14) {
            return f14 / f12;
        }
        float f15 = pointF.x;
        return f13 < f15 ? f15 / f12 : f11;
    }
}
