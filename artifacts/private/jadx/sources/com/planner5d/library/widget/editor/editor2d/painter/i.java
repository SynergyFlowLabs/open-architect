package com.planner5d.library.widget.editor.editor2d.painter;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes12.dex */
class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float[] f255216a = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PointF f255217b = new PointF();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PointF f255218c = new PointF();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Point f255219d = new Point();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Matrix f255220e = new Matrix();

    i() {
    }

    void a(Matrix matrix, int i10, int i11, int i12, int i13, d dVar) {
        this.f255219d.set(0, 0);
        c(this.f255219d, matrix, i10, i11, i12, i13, dVar);
    }

    void b(Matrix matrix, d dVar) {
        dVar.N(matrix);
    }

    void c(Point point, Matrix matrix, int i10, int i11, int i12, int i13, d dVar) {
        synchronized (dVar.f255184q) {
            try {
                matrix.getValues(this.f255216a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        PointF pointF = this.f255218c;
        float[] fArr = this.f255216a;
        pointF.set(fArr[2], fArr[5]);
        PointF pointF2 = this.f255217b;
        pointF2.set(this.f255218c);
        pointF2.offset(point.x, point.y);
        pointF2.x = Math.max(i10 - ((i12 * dVar.K) * this.f255216a[0]), Math.min(0.0f, pointF2.x));
        float fMax = Math.max(i11 - ((i13 * dVar.K) * this.f255216a[0]), Math.min(0.0f, pointF2.y));
        pointF2.y = fMax;
        float f10 = pointF2.x;
        PointF pointF3 = this.f255218c;
        point.set((int) (f10 - pointF3.x), (int) (fMax - pointF3.y));
        this.f255220e.setTranslate(point.x, point.y);
        synchronized (dVar.f255184q) {
            matrix.postConcat(this.f255220e);
        }
        b(matrix, dVar);
    }
}
