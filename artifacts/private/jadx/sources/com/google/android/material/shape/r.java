package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class r {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f113638j = 270.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected static final float f113639k = 180.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f113640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f113641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f113642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f113643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f113644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public float f113645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<h> f113646g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<j> f113647h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f113648i;

    class a extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f113649c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Matrix f113650d;

        a(List list, Matrix matrix) {
            this.f113649c = list;
            this.f113650d = matrix;
        }

        @Override // com.google.android.material.shape.r.j
        public void a(Matrix matrix, com.google.android.material.shadow.b bVar, int i10, Canvas canvas) {
            Iterator it = this.f113649c.iterator();
            while (it.hasNext()) {
                ((j) it.next()).a(this.f113650d, bVar, i10, canvas);
            }
        }
    }

    static class b extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f113652c;

        public b(e eVar) {
            this.f113652c = eVar;
        }

        @Override // com.google.android.material.shape.r.j
        public void a(Matrix matrix, @NonNull com.google.android.material.shadow.b bVar, int i10, @NonNull Canvas canvas) {
            bVar.a(canvas, matrix, new RectF(this.f113652c.k(), this.f113652c.o(), this.f113652c.l(), this.f113652c.j()), i10, this.f113652c.m(), this.f113652c.n());
        }
    }

    static class c extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g f113653c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final g f113654d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f113655e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f113656f;

        public c(g gVar, g gVar2, float f10, float f11) {
            this.f113653c = gVar;
            this.f113654d = gVar2;
            this.f113655e = f10;
            this.f113656f = f11;
        }

        @Override // com.google.android.material.shape.r.j
        public void a(Matrix matrix, com.google.android.material.shadow.b bVar, int i10, Canvas canvas) {
            int i11;
            float fE = e();
            if (fE > 0.0f) {
                return;
            }
            double dHypot = Math.hypot(this.f113653c.f113673b - this.f113655e, this.f113653c.f113674c - this.f113656f);
            double dHypot2 = Math.hypot(this.f113654d.f113673b - this.f113653c.f113673b, this.f113654d.f113674c - this.f113653c.f113674c);
            float fMin = (float) Math.min(i10, Math.min(dHypot, dHypot2));
            double d10 = fMin;
            double dTan = Math.tan(Math.toRadians((-fE) / 2.0f)) * d10;
            if (dHypot > dTan) {
                RectF rectF = new RectF(0.0f, 0.0f, (float) (dHypot - dTan), 0.0f);
                this.f113681a.set(matrix);
                this.f113681a.preTranslate(this.f113655e, this.f113656f);
                this.f113681a.preRotate(d());
                i11 = i10;
                bVar.b(canvas, this.f113681a, rectF, i11);
            } else {
                i11 = i10;
            }
            float f10 = fMin * 2.0f;
            RectF rectF2 = new RectF(0.0f, 0.0f, f10, f10);
            this.f113681a.set(matrix);
            this.f113681a.preTranslate(this.f113653c.f113673b, this.f113653c.f113674c);
            this.f113681a.preRotate(d());
            this.f113681a.preTranslate((float) ((-dTan) - d10), (-2.0f) * fMin);
            bVar.c(canvas, this.f113681a, rectF2, (int) fMin, 450.0f, fE, new float[]{(float) (d10 + dTan), f10});
            if (dHypot2 > dTan) {
                RectF rectF3 = new RectF(0.0f, 0.0f, (float) (dHypot2 - dTan), 0.0f);
                this.f113681a.set(matrix);
                this.f113681a.preTranslate(this.f113653c.f113673b, this.f113653c.f113674c);
                this.f113681a.preRotate(c());
                this.f113681a.preTranslate((float) dTan, 0.0f);
                bVar.b(canvas, this.f113681a, rectF3, i11);
            }
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f113654d.f113674c - this.f113653c.f113674c) / (this.f113654d.f113673b - this.f113653c.f113673b)));
        }

        float d() {
            return (float) Math.toDegrees(Math.atan((this.f113653c.f113674c - this.f113656f) / (this.f113653c.f113673b - this.f113655e)));
        }

        float e() {
            float fC = ((c() - d()) + 360.0f) % 360.0f;
            return fC <= r.f113639k ? fC : fC - 360.0f;
        }
    }

    static class d extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g f113657c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f113658d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f113659e;

        public d(g gVar, float f10, float f11) {
            this.f113657c = gVar;
            this.f113658d = f10;
            this.f113659e = f11;
        }

        @Override // com.google.android.material.shape.r.j
        public void a(Matrix matrix, @NonNull com.google.android.material.shadow.b bVar, int i10, @NonNull Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f113657c.f113674c - this.f113659e, this.f113657c.f113673b - this.f113658d), 0.0f);
            this.f113681a.set(matrix);
            this.f113681a.preTranslate(this.f113658d, this.f113659e);
            this.f113681a.preRotate(c());
            bVar.b(canvas, this.f113681a, rectF, i10);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f113657c.f113674c - this.f113659e) / (this.f113657c.f113673b - this.f113658d)));
        }
    }

    public static class e extends h {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final RectF f113660h = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public float f113661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f113662c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f113663d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f113664e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f113665f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f113666g;

        public e(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f113664e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f113661b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f113663d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f113665f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f113666g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f113662c;
        }

        private void p(float f10) {
            this.f113664e = f10;
        }

        private void q(float f10) {
            this.f113661b = f10;
        }

        private void r(float f10) {
            this.f113663d = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f10) {
            this.f113665f = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f10) {
            this.f113666g = f10;
        }

        private void u(float f10) {
            this.f113662c = f10;
        }

        @Override // com.google.android.material.shape.r.h
        public void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f113675a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f113660h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    public static class f extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f113667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f113668c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f113669d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f113670e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f113671f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f113672g;

        public f(float f10, float f11, float f12, float f13, float f14, float f15) {
            h(f10);
            j(f11);
            i(f12);
            k(f13);
            l(f14);
            m(f15);
        }

        private float b() {
            return this.f113667b;
        }

        private float c() {
            return this.f113669d;
        }

        private float d() {
            return this.f113668c;
        }

        private float e() {
            return this.f113668c;
        }

        private float f() {
            return this.f113671f;
        }

        private float g() {
            return this.f113672g;
        }

        private void h(float f10) {
            this.f113667b = f10;
        }

        private void i(float f10) {
            this.f113669d = f10;
        }

        private void j(float f10) {
            this.f113668c = f10;
        }

        private void k(float f10) {
            this.f113670e = f10;
        }

        private void l(float f10) {
            this.f113671f = f10;
        }

        private void m(float f10) {
            this.f113672g = f10;
        }

        @Override // com.google.android.material.shape.r.h
        public void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f113675a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.f113667b, this.f113668c, this.f113669d, this.f113670e, this.f113671f, this.f113672g);
            path.transform(matrix);
        }
    }

    public static class g extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f113673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f113674c;

        @Override // com.google.android.material.shape.r.h
        public void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f113675a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f113673b, this.f113674c);
            path.transform(matrix);
        }
    }

    public static abstract class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Matrix f113675a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static class i extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public float f113676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f113677c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f113678d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f113679e;

        private float f() {
            return this.f113676b;
        }

        private float g() {
            return this.f113677c;
        }

        private float h() {
            return this.f113678d;
        }

        private float i() {
            return this.f113679e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(float f10) {
            this.f113676b = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(float f10) {
            this.f113677c = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(float f10) {
            this.f113678d = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m(float f10) {
            this.f113679e = f10;
        }

        @Override // com.google.android.material.shape.r.h
        public void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f113675a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(f(), g(), h(), i());
            path.transform(matrix);
        }
    }

    static abstract class j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Matrix f113680b = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matrix f113681a = new Matrix();

        j() {
        }

        public abstract void a(Matrix matrix, com.google.android.material.shadow.b bVar, int i10, Canvas canvas);

        public final void b(com.google.android.material.shadow.b bVar, int i10, Canvas canvas) {
            a(f113680b, bVar, i10, canvas);
        }
    }

    public r() {
        q(0.0f, 0.0f);
    }

    private void b(float f10) {
        if (h() == f10) {
            return;
        }
        float fH = ((f10 - h()) + 360.0f) % 360.0f;
        if (fH > f113639k) {
            return;
        }
        e eVar = new e(j(), k(), j(), k());
        eVar.s(h());
        eVar.t(fH);
        this.f113647h.add(new b(eVar));
        s(f10);
    }

    private void c(j jVar, float f10, float f11) {
        b(f10);
        this.f113647h.add(jVar);
        s(f11);
    }

    private float h() {
        return this.f113644e;
    }

    private float i() {
        return this.f113645f;
    }

    private void s(float f10) {
        this.f113644e = f10;
    }

    private void t(float f10) {
        this.f113645f = f10;
    }

    private void u(float f10) {
        this.f113642c = f10;
    }

    private void v(float f10) {
        this.f113643d = f10;
    }

    private void w(float f10) {
        this.f113640a = f10;
    }

    private void x(float f10) {
        this.f113641b = f10;
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        e eVar = new e(f10, f11, f12, f13);
        eVar.s(f14);
        eVar.t(f15);
        this.f113646g.add(eVar);
        b bVar = new b(eVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + f113639k) % 360.0f;
        }
        c(bVar, f14, z10 ? (f113639k + f16) % 360.0f : f16);
        double d10 = f16;
        u(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        v(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f113646g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f113646g.get(i10).a(matrix, path);
        }
    }

    boolean e() {
        return this.f113648i;
    }

    @NonNull
    j f(Matrix matrix) {
        b(i());
        return new a(new ArrayList(this.f113647h), new Matrix(matrix));
    }

    @w0(21)
    public void g(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f113646g.add(new f(f10, f11, f12, f13, f14, f15));
        this.f113648i = true;
        u(f14);
        v(f15);
    }

    float j() {
        return this.f113642c;
    }

    float k() {
        return this.f113643d;
    }

    float l() {
        return this.f113640a;
    }

    float m() {
        return this.f113641b;
    }

    public void n(float f10, float f11) {
        g gVar = new g();
        gVar.f113673b = f10;
        gVar.f113674c = f11;
        this.f113646g.add(gVar);
        d dVar = new d(gVar, j(), k());
        c(dVar, dVar.c() + 270.0f, dVar.c() + 270.0f);
        u(f10);
        v(f11);
    }

    public void o(float f10, float f11, float f12, float f13) {
        if ((Math.abs(f10 - j()) < 0.001f && Math.abs(f11 - k()) < 0.001f) || (Math.abs(f10 - f12) < 0.001f && Math.abs(f11 - f13) < 0.001f)) {
            n(f12, f13);
            return;
        }
        g gVar = new g();
        gVar.f113673b = f10;
        gVar.f113674c = f11;
        this.f113646g.add(gVar);
        g gVar2 = new g();
        gVar2.f113673b = f12;
        gVar2.f113674c = f13;
        this.f113646g.add(gVar2);
        c cVar = new c(gVar, gVar2, j(), k());
        if (cVar.e() > 0.0f) {
            n(f10, f11);
            n(f12, f13);
        } else {
            c(cVar, cVar.d() + 270.0f, cVar.c() + 270.0f);
            u(f12);
            v(f13);
        }
    }

    @w0(21)
    public void p(float f10, float f11, float f12, float f13) {
        i iVar = new i();
        iVar.j(f10);
        iVar.k(f11);
        iVar.l(f12);
        iVar.m(f13);
        this.f113646g.add(iVar);
        this.f113648i = true;
        u(f12);
        v(f13);
    }

    public void q(float f10, float f11) {
        r(f10, f11, 270.0f, 0.0f);
    }

    public void r(float f10, float f11, float f12, float f13) {
        w(f10);
        x(f11);
        u(f10);
        v(f11);
        s(f12);
        t((f12 + f13) % 360.0f);
        this.f113646g.clear();
        this.f113647h.clear();
        this.f113648i = false;
    }

    public r(float f10, float f11) {
        q(f10, f11);
    }
}
