package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.k1;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes4.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r[] f113620a = new r[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix[] f113621b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix[] f113622c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PointF f113623d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Path f113624e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Path f113625f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final r f113626g = new r();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f113627h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f113628i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f113629j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Path f113630k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f113631l = true;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final q f113632a = new q();

        private a() {
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    public interface b {
        void a(r rVar, Matrix matrix, int i10);

        void b(r rVar, Matrix matrix, int i10);
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final p f113633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final Path f113634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final RectF f113635c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        public final b f113636d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f113637e;

        c(@NonNull p pVar, float f10, RectF rectF, @p0 b bVar, Path path) {
            this.f113636d = bVar;
            this.f113633a = pVar;
            this.f113637e = f10;
            this.f113635c = rectF;
            this.f113634b = path;
        }
    }

    public q() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f113620a[i10] = new r();
            this.f113621b[i10] = new Matrix();
            this.f113622c[i10] = new Matrix();
        }
    }

    private float a(int i10) {
        return ((i10 + 1) % 4) * 90;
    }

    private void b(@NonNull c cVar, int i10) {
        this.f113627h[0] = this.f113620a[i10].l();
        this.f113627h[1] = this.f113620a[i10].m();
        this.f113621b[i10].mapPoints(this.f113627h);
        if (i10 == 0) {
            Path path = cVar.f113634b;
            float[] fArr = this.f113627h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f113634b;
            float[] fArr2 = this.f113627h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f113620a[i10].d(this.f113621b[i10], cVar.f113634b);
        b bVar = cVar.f113636d;
        if (bVar != null) {
            bVar.a(this.f113620a[i10], this.f113621b[i10], i10);
        }
    }

    private void c(@NonNull c cVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f113627h[0] = this.f113620a[i10].j();
        this.f113627h[1] = this.f113620a[i10].k();
        this.f113621b[i10].mapPoints(this.f113627h);
        this.f113628i[0] = this.f113620a[i11].l();
        this.f113628i[1] = this.f113620a[i11].m();
        this.f113621b[i11].mapPoints(this.f113628i);
        float[] fArr = this.f113627h;
        float f10 = fArr[0];
        float[] fArr2 = this.f113628i;
        int i12 = 5 | 0;
        float fMax = Math.max(((float) Math.hypot(f10 - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float fI = i(cVar.f113635c, i10);
        this.f113626g.q(0.0f, 0.0f);
        h hVarJ = j(i10, cVar.f113633a);
        hVarJ.b(fMax, fI, cVar.f113637e, this.f113626g);
        this.f113629j.reset();
        this.f113626g.d(this.f113622c[i10], this.f113629j);
        if (this.f113631l && (hVarJ.a() || l(this.f113629j, i10) || l(this.f113629j, i11))) {
            Path path = this.f113629j;
            path.op(path, this.f113625f, Path.Op.DIFFERENCE);
            this.f113627h[0] = this.f113626g.l();
            this.f113627h[1] = this.f113626g.m();
            this.f113622c[i10].mapPoints(this.f113627h);
            Path path2 = this.f113624e;
            float[] fArr3 = this.f113627h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f113626g.d(this.f113622c[i10], this.f113624e);
        } else {
            this.f113626g.d(this.f113622c[i10], cVar.f113634b);
        }
        b bVar = cVar.f113636d;
        if (bVar != null) {
            bVar.b(this.f113626g, this.f113622c[i10], i10);
        }
    }

    private void f(int i10, @NonNull RectF rectF, @NonNull PointF pointF) {
        if (i10 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i10 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i10 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private e g(int i10, @NonNull p pVar) {
        if (i10 == 1) {
            return pVar.l();
        }
        if (i10 != 2) {
            return i10 != 3 ? pVar.t() : pVar.r();
        }
        return pVar.j();
    }

    private f h(int i10, @NonNull p pVar) {
        if (i10 == 1) {
            return pVar.k();
        }
        if (i10 == 2) {
            return pVar.i();
        }
        int i11 = 2 << 3;
        return i10 != 3 ? pVar.s() : pVar.q();
    }

    private float i(@NonNull RectF rectF, int i10) {
        float[] fArr = this.f113627h;
        r rVar = this.f113620a[i10];
        fArr[0] = rVar.f113642c;
        fArr[1] = rVar.f113643d;
        this.f113621b[i10].mapPoints(fArr);
        return (i10 == 1 || i10 == 3) ? Math.abs(rectF.centerX() - this.f113627h[0]) : Math.abs(rectF.centerY() - this.f113627h[1]);
    }

    private h j(int i10, @NonNull p pVar) {
        if (i10 == 1) {
            return pVar.h();
        }
        if (i10 != 2) {
            return i10 != 3 ? pVar.o() : pVar.p();
        }
        return pVar.n();
    }

    @NonNull
    @k1
    @b1({b1.a.LIBRARY_GROUP})
    public static q k() {
        return a.f113632a;
    }

    @w0(19)
    private boolean l(Path path, int i10) {
        this.f113630k.reset();
        this.f113620a[i10].d(this.f113621b[i10], this.f113630k);
        RectF rectF = new RectF();
        int i11 = 2 | 1;
        path.computeBounds(rectF, true);
        this.f113630k.computeBounds(rectF, true);
        path.op(this.f113630k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty() && (rectF.width() <= 1.0f || rectF.height() <= 1.0f)) {
            return false;
        }
        return true;
    }

    private void m(@NonNull c cVar, int i10) {
        h(i10, cVar.f113633a).c(this.f113620a[i10], 90.0f, cVar.f113637e, cVar.f113635c, g(i10, cVar.f113633a));
        float fA = a(i10);
        this.f113621b[i10].reset();
        f(i10, cVar.f113635c, this.f113623d);
        Matrix matrix = this.f113621b[i10];
        PointF pointF = this.f113623d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f113621b[i10].preRotate(fA);
    }

    private void o(int i10) {
        this.f113627h[0] = this.f113620a[i10].j();
        this.f113627h[1] = this.f113620a[i10].k();
        this.f113621b[i10].mapPoints(this.f113627h);
        float fA = a(i10);
        this.f113622c[i10].reset();
        Matrix matrix = this.f113622c[i10];
        float[] fArr = this.f113627h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f113622c[i10].preRotate(fA);
    }

    public void d(p pVar, float f10, RectF rectF, @NonNull Path path) {
        e(pVar, f10, rectF, null, path);
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void e(p pVar, float f10, RectF rectF, b bVar, @NonNull Path path) {
        path.rewind();
        this.f113624e.rewind();
        this.f113625f.rewind();
        this.f113625f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(pVar, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            m(cVar, i10);
            o(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f113624e.close();
        if (this.f113624e.isEmpty()) {
            return;
        }
        path.op(this.f113624e, Path.Op.UNION);
    }

    void n(boolean z10) {
        this.f113631l = z10;
    }
}
