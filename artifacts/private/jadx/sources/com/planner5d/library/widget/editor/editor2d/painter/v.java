package com.planner5d.library.widget.editor.editor2d.painter;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes12.dex */
class v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i f255326f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointF f255321a = new PointF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix f255322b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f255323c = new Matrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Matrix f255324d = new Matrix();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f255325e = 1.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f255327g = new Paint(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f255328h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private w f255329i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f255330j = new Rect();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Rect f255331k = new Rect();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final RectF f255332l = new RectF();

    v(i iVar) {
        int i10 = 0 << 0;
        this.f255326f = iVar;
    }

    private void a(Canvas canvas, Bitmap bitmap, Matrix matrix, int i10, int i11, Rect rect) {
        int i12 = rect.left;
        if (i12 > 0) {
            this.f255330j.set(0, 0, i12 + 1, i11);
            b(canvas, bitmap, matrix, this.f255330j);
        }
        int i13 = rect.right;
        if (i13 < i10) {
            this.f255330j.set(i13 - 1, 0, i10, i11);
            b(canvas, bitmap, matrix, this.f255330j);
        }
        int i14 = rect.top;
        if (i14 > 0) {
            this.f255330j.set(rect.left, 0, rect.right, i14 + 1);
            b(canvas, bitmap, matrix, this.f255330j);
        }
        int i15 = rect.bottom;
        if (i15 < i11) {
            this.f255330j.set(rect.left, i15 - 1, rect.right, i11);
            b(canvas, bitmap, matrix, this.f255330j);
        }
    }

    private void b(Canvas canvas, Bitmap bitmap, Matrix matrix, Rect rect) {
        canvas.save();
        canvas.clipRect(rect);
        canvas.drawBitmap(bitmap, matrix, this.f255327g);
        canvas.restore();
    }

    private Rect c(Bitmap bitmap, Matrix matrix) {
        this.f255332l.set(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(this.f255332l);
        this.f255332l.round(this.f255331k);
        return this.f255331k;
    }

    boolean d(x xVar, x.a aVar, d dVar, Matrix matrix, int i10, int i11) {
        x.c cVar;
        Matrix matrix2;
        int i12;
        int i13;
        Canvas canvas;
        synchronized (dVar.f255184q) {
            try {
                x.c cVar2 = dVar.f255181n;
                x.c cVar3 = x.c.Idle;
                if (cVar2 != cVar3 && (cVar2 != (cVar = x.c.Started) || this.f255325e != dVar.C)) {
                    this.f255321a.set(dVar.f255180m);
                    if (this.f255329i == null) {
                        i12 = i10;
                        i13 = i11;
                        matrix2 = matrix;
                        this.f255329i = new w(dVar, matrix, this.f255321a, i12, i13);
                    } else {
                        matrix2 = matrix;
                        i12 = i10;
                        i13 = i11;
                    }
                    w wVar = this.f255329i;
                    float f10 = dVar.C;
                    this.f255325e = f10;
                    float fA = wVar.a(f10);
                    x.c cVar4 = dVar.f255181n;
                    if (cVar4 == x.c.Finished) {
                        this.f255328h = false;
                        this.f255329i = null;
                        Matrix matrix3 = this.f255322b;
                        PointF pointF = this.f255321a;
                        matrix3.setScale(fA, fA, pointF.x, pointF.y);
                        matrix2.postConcat(this.f255322b);
                        dVar.f255181n = cVar3;
                        this.f255326f.a(matrix2, i12, i13, dVar.O.width(), dVar.O.height(), dVar);
                        dVar.q();
                        return false;
                    }
                    if (cVar4 != cVar) {
                        return true;
                    }
                    Matrix matrix4 = this.f255322b;
                    PointF pointF2 = this.f255321a;
                    matrix4.setScale(fA, fA, pointF2.x, pointF2.y);
                    xVar.g(aVar);
                    Canvas canvasLock = dVar.f255182o.lock();
                    if (canvasLock != null) {
                        canvasLock.drawColor(-1);
                        if (fA < 1.0f) {
                            if (!this.f255328h) {
                                this.f255328h = true;
                                this.f255324d.set(matrix2);
                                Matrix matrix5 = this.f255324d;
                                float f11 = dVar.B.x;
                                float f12 = this.f255329i.f255335c;
                                float f13 = f11 / f12;
                                float f14 = f11 / f12;
                                PointF pointF3 = this.f255321a;
                                matrix5.postScale(f13, f14, pointF3.x, pointF3.y);
                                aVar.f255359d.drawColor(-1);
                                xVar.c(aVar.f255359d, false, this.f255324d, true);
                            }
                            Matrix matrix6 = this.f255323c;
                            float f15 = this.f255329i.f255335c;
                            float f16 = dVar.B.x;
                            float f17 = (fA * f15) / f16;
                            float f18 = (fA * f15) / f16;
                            PointF pointF4 = this.f255321a;
                            matrix6.setScale(f17, f18, pointF4.x, pointF4.y);
                            canvas = canvasLock;
                            a(canvas, aVar.f255358c, this.f255323c, i10, i11, c(aVar.f255356a, this.f255322b));
                        } else {
                            canvas = canvasLock;
                        }
                        canvas.drawBitmap(aVar.f255356a, this.f255322b, this.f255327g);
                        dVar.f255182o.d(canvas);
                    }
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
