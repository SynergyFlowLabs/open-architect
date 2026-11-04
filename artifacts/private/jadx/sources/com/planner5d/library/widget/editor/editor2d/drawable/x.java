package com.planner5d.library.widget.editor.editor2d.drawable;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import com.planner5d.library.services.c0;

/* JADX INFO: loaded from: classes12.dex */
class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Region f255100a = new Region();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Region f255101b = new Region();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Path f255102c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Path f255103d = new Path();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Rect f255104e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Rect f255105f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final RectF f255106g = new RectF();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final RectF f255107h = new RectF();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final RectF f255108i = new RectF();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final PointF[] f255109j = {new PointF(), new PointF(), new PointF(), new PointF()};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float[] f255110k = new float[9];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f255111l = new float[4];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Matrix f255112m = new Matrix();

    static {
        int i10 = 7 >> 4;
    }

    x() {
    }

    static boolean a(Path path, Matrix matrix, PointF pointF) {
        boolean zContains;
        synchronized (f255100a) {
            try {
                zContains = m(path, matrix).contains((int) pointF.x, (int) pointF.y);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zContains;
    }

    private static boolean b(Path path, Matrix matrix, Rect rect) {
        boolean z10;
        Region region = f255100a;
        synchronized (region) {
            m(path, matrix).op(rect, Region.Op.INTERSECT);
            z10 = !region.isEmpty();
        }
        return z10;
    }

    static boolean c(Path path, Matrix matrix, RectF rectF) {
        boolean zB;
        Rect rect = f255105f;
        synchronized (rect) {
            rectF.roundOut(rect);
            zB = b(path, matrix, rect);
        }
        return zB;
    }

    static boolean d(RectF rectF, Matrix matrix, PointF pointF) {
        return e(rectF, matrix, pointF, 10.0f);
    }

    static boolean e(RectF rectF, Matrix matrix, PointF pointF, float f10) {
        RectF rectF2 = f255107h;
        synchronized (rectF2) {
            try {
                rectF2.set(rectF);
                n(rectF2, matrix, f10);
                if (matrix == null) {
                    return rectF2.contains(pointF.x, pointF.y);
                }
                PointF[] pointFArr = f255109j;
                pointFArr[0].set(rectF2.left, rectF2.bottom);
                pointFArr[1].set(rectF2.left, rectF2.top);
                pointFArr[2].set(rectF2.right, rectF2.top);
                pointFArr[3].set(rectF2.right, rectF2.bottom);
                Path path = f255103d;
                path.reset();
                PointF pointF2 = pointFArr[0];
                path.moveTo(pointF2.x, pointF2.y);
                PointF pointF3 = pointFArr[1];
                path.lineTo(pointF3.x, pointF3.y);
                PointF pointF4 = pointFArr[2];
                path.lineTo(pointF4.x, pointF4.y);
                PointF pointF5 = pointFArr[3];
                path.lineTo(pointF5.x, pointF5.y);
                path.close();
                return a(path, matrix, pointF);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static boolean f(com.planner5d.library.engine.util.math.h hVar, Matrix matrix, PointF pointF) {
        Matrix matrix2 = f255112m;
        synchronized (matrix2) {
            try {
                if (!matrix.invert(matrix2)) {
                    return false;
                }
                float[] fArr = f255111l;
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                matrix2.mapPoints(fArr, 2, fArr, 0, 1);
                return hVar.b(fArr[2], fArr[3]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static boolean g(c0 c0Var, PointF pointF) {
        return c0Var != null && c0Var.a(pointF.x, pointF.y);
    }

    static boolean h(c cVar, PointF pointF) {
        return i(cVar, pointF, 10.0f);
    }

    static boolean i(c cVar, PointF pointF, float f10) {
        boolean zE;
        RectF rectF = f255108i;
        synchronized (rectF) {
            cVar.d(rectF);
            zE = e(rectF, null, pointF, f10);
        }
        return zE;
    }

    private static int j(Path path, Matrix matrix, Rect rect) {
        int iWidth;
        Region region = f255100a;
        synchronized (region) {
            try {
                m(path, matrix).op(rect, Region.Op.INTERSECT);
                Rect bounds = region.getBounds();
                iWidth = bounds.width() * bounds.height();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iWidth;
    }

    public static int k(Path path, Matrix matrix, RectF rectF) {
        int iJ;
        Rect rect = f255105f;
        synchronized (rect) {
            rectF.roundOut(rect);
            iJ = j(path, matrix, rect);
        }
        return iJ;
    }

    private static double l(float[] fArr, int i10) {
        return Math.sqrt(Math.pow(fArr[i10], 2.0d) + Math.pow(fArr[i10 == 0 ? (char) 3 : (char) 1], 2.0d));
    }

    private static Region m(Path path, Matrix matrix) {
        Path path2 = f255102c;
        path2.set(path);
        if (matrix != null) {
            path2.transform(matrix);
        }
        RectF rectF = f255106g;
        path2.computeBounds(rectF, true);
        Rect rect = f255104e;
        rectF.roundOut(rect);
        Region region = f255101b;
        region.set(rect);
        Region region2 = f255100a;
        region2.setPath(path2, region);
        return region2;
    }

    private static void n(RectF rectF, Matrix matrix, float f10) {
        float[] fArr = f255110k;
        synchronized (fArr) {
            try {
                if (matrix != null) {
                    matrix.getValues(fArr);
                    float f11 = -f10;
                    rectF.inset(f11 / ((float) l(fArr, 0)), f11 / ((float) l(fArr, 4)));
                } else {
                    float f12 = -f10;
                    rectF.inset(f12, f12);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
