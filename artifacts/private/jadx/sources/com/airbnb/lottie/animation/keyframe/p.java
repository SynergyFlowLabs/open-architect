package com.airbnb.lottie.animation.keyframe;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.annotation.p0;
import com.airbnb.lottie.b1;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matrix f88133a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix f88134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f88135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Matrix f88136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f88137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private a<PointF, PointF> f88138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private a<?, PointF> f88139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> f88140h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private a<Float, Float> f88141i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private a<Integer, Integer> f88142j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private d f88143k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private d f88144l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private a<?, Float> f88145m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private a<?, Float> f88146n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f88147o;

    public p(com.airbnb.lottie.model.animatable.l lVar) {
        this.f88138f = lVar.c() == null ? null : lVar.c().a();
        this.f88139g = lVar.f() == null ? null : lVar.f().a();
        this.f88140h = lVar.h() == null ? null : lVar.h().a();
        this.f88141i = lVar.g() == null ? null : lVar.g().a();
        this.f88143k = lVar.i() == null ? null : (d) lVar.i().a();
        this.f88147o = lVar.l();
        if (this.f88143k != null) {
            this.f88134b = new Matrix();
            this.f88135c = new Matrix();
            this.f88136d = new Matrix();
            this.f88137e = new float[9];
        } else {
            this.f88134b = null;
            this.f88135c = null;
            this.f88136d = null;
            this.f88137e = null;
        }
        this.f88144l = lVar.j() == null ? null : (d) lVar.j().a();
        if (lVar.e() != null) {
            this.f88142j = lVar.e().a();
        }
        if (lVar.k() != null) {
            this.f88145m = lVar.k().a();
        } else {
            this.f88145m = null;
        }
        if (lVar.d() != null) {
            this.f88146n = lVar.d().a();
        } else {
            this.f88146n = null;
        }
    }

    private void d() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f88137e[i10] = 0.0f;
        }
    }

    public void a(com.airbnb.lottie.model.layer.b bVar) {
        bVar.i(this.f88142j);
        bVar.i(this.f88145m);
        bVar.i(this.f88146n);
        bVar.i(this.f88138f);
        bVar.i(this.f88139g);
        bVar.i(this.f88140h);
        bVar.i(this.f88141i);
        bVar.i(this.f88143k);
        bVar.i(this.f88144l);
    }

    public void b(a.b bVar) {
        a<Integer, Integer> aVar = this.f88142j;
        if (aVar != null) {
            aVar.a(bVar);
        }
        a<?, Float> aVar2 = this.f88145m;
        if (aVar2 != null) {
            aVar2.a(bVar);
        }
        a<?, Float> aVar3 = this.f88146n;
        if (aVar3 != null) {
            aVar3.a(bVar);
        }
        a<PointF, PointF> aVar4 = this.f88138f;
        if (aVar4 != null) {
            aVar4.a(bVar);
        }
        a<?, PointF> aVar5 = this.f88139g;
        if (aVar5 != null) {
            aVar5.a(bVar);
        }
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar6 = this.f88140h;
        if (aVar6 != null) {
            aVar6.a(bVar);
        }
        a<Float, Float> aVar7 = this.f88141i;
        if (aVar7 != null) {
            aVar7.a(bVar);
        }
        d dVar = this.f88143k;
        if (dVar != null) {
            dVar.a(bVar);
        }
        d dVar2 = this.f88144l;
        if (dVar2 != null) {
            dVar2.a(bVar);
        }
    }

    public <T> boolean c(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (t10 == b1.f88156f) {
            a<PointF, PointF> aVar = this.f88138f;
            if (aVar == null) {
                this.f88138f = new q(jVar, new PointF());
                return true;
            }
            aVar.o(jVar);
            return true;
        }
        if (t10 == b1.f88157g) {
            a<?, PointF> aVar2 = this.f88139g;
            if (aVar2 == null) {
                this.f88139g = new q(jVar, new PointF());
                return true;
            }
            aVar2.o(jVar);
            return true;
        }
        if (t10 == b1.f88158h) {
            a<?, PointF> aVar3 = this.f88139g;
            if (aVar3 instanceof n) {
                ((n) aVar3).s(jVar);
                return true;
            }
        }
        if (t10 == b1.f88159i) {
            a<?, PointF> aVar4 = this.f88139g;
            if (aVar4 instanceof n) {
                ((n) aVar4).t(jVar);
                return true;
            }
        }
        if (t10 == b1.f88165o) {
            a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar5 = this.f88140h;
            if (aVar5 == null) {
                this.f88140h = new q(jVar, new com.airbnb.lottie.value.k());
                return true;
            }
            aVar5.o(jVar);
            return true;
        }
        if (t10 == b1.f88166p) {
            a<Float, Float> aVar6 = this.f88141i;
            if (aVar6 == null) {
                this.f88141i = new q(jVar, fValueOf2);
                return true;
            }
            aVar6.o(jVar);
            return true;
        }
        if (t10 == b1.f88153c) {
            a<Integer, Integer> aVar7 = this.f88142j;
            if (aVar7 == null) {
                this.f88142j = new q(jVar, 100);
                return true;
            }
            aVar7.o(jVar);
            return true;
        }
        if (t10 == b1.C) {
            a<?, Float> aVar8 = this.f88145m;
            if (aVar8 == null) {
                this.f88145m = new q(jVar, fValueOf);
                return true;
            }
            aVar8.o(jVar);
            return true;
        }
        if (t10 == b1.D) {
            a<?, Float> aVar9 = this.f88146n;
            if (aVar9 == null) {
                this.f88146n = new q(jVar, fValueOf);
                return true;
            }
            aVar9.o(jVar);
            return true;
        }
        if (t10 == b1.f88167q) {
            if (this.f88143k == null) {
                this.f88143k = new d(Collections.singletonList(new com.airbnb.lottie.value.a(fValueOf2)));
            }
            this.f88143k.o(jVar);
            return true;
        }
        if (t10 != b1.f88168r) {
            return false;
        }
        if (this.f88144l == null) {
            this.f88144l = new d(Collections.singletonList(new com.airbnb.lottie.value.a(fValueOf2)));
        }
        this.f88144l.o(jVar);
        return true;
    }

    @p0
    public a<?, Float> e() {
        return this.f88146n;
    }

    public Matrix f() {
        PointF pointFH;
        com.airbnb.lottie.value.k kVarH;
        PointF pointFH2;
        this.f88133a.reset();
        a<?, PointF> aVar = this.f88139g;
        if (aVar != null && (pointFH2 = aVar.h()) != null) {
            float f10 = pointFH2.x;
            if (f10 != 0.0f || pointFH2.y != 0.0f) {
                this.f88133a.preTranslate(f10, pointFH2.y);
            }
        }
        if (!this.f88147o) {
            a<Float, Float> aVar2 = this.f88141i;
            if (aVar2 != null) {
                float fFloatValue = aVar2 instanceof q ? aVar2.h().floatValue() : ((d) aVar2).q();
                if (fFloatValue != 0.0f) {
                    this.f88133a.preRotate(fFloatValue);
                }
            }
        } else if (aVar != null) {
            float f11 = aVar.f();
            PointF pointFH3 = aVar.h();
            float f12 = pointFH3.x;
            float f13 = pointFH3.y;
            aVar.n(1.0E-4f + f11);
            PointF pointFH4 = aVar.h();
            aVar.n(f11);
            this.f88133a.preRotate((float) Math.toDegrees(Math.atan2(pointFH4.y - f13, pointFH4.x - f12)));
        }
        d dVar = this.f88143k;
        if (dVar != null) {
            d dVar2 = this.f88144l;
            float fCos = dVar2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-dVar2.q()) + 90.0f));
            d dVar3 = this.f88144l;
            float fSin = dVar3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-dVar3.q()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(dVar.q()));
            d();
            float[] fArr = this.f88137e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f14 = -fSin;
            fArr[3] = f14;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f88134b.setValues(fArr);
            d();
            float[] fArr2 = this.f88137e;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f88135c.setValues(fArr2);
            d();
            float[] fArr3 = this.f88137e;
            fArr3[0] = fCos;
            fArr3[1] = f14;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.f88136d.setValues(fArr3);
            this.f88135c.preConcat(this.f88134b);
            this.f88136d.preConcat(this.f88135c);
            this.f88133a.preConcat(this.f88136d);
        }
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar3 = this.f88140h;
        if (aVar3 != null && (kVarH = aVar3.h()) != null && (kVarH.b() != 1.0f || kVarH.c() != 1.0f)) {
            this.f88133a.preScale(kVarH.b(), kVarH.c());
        }
        a<PointF, PointF> aVar4 = this.f88138f;
        if (aVar4 != null && (pointFH = aVar4.h()) != null) {
            float f15 = pointFH.x;
            if (f15 != 0.0f || pointFH.y != 0.0f) {
                this.f88133a.preTranslate(-f15, -pointFH.y);
            }
        }
        return this.f88133a;
    }

    public Matrix g(float f10) {
        a<?, PointF> aVar = this.f88139g;
        PointF pointFH = aVar == null ? null : aVar.h();
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar2 = this.f88140h;
        com.airbnb.lottie.value.k kVarH = aVar2 == null ? null : aVar2.h();
        this.f88133a.reset();
        if (pointFH != null) {
            this.f88133a.preTranslate(pointFH.x * f10, pointFH.y * f10);
        }
        if (kVarH != null) {
            double d10 = f10;
            this.f88133a.preScale((float) Math.pow(kVarH.b(), d10), (float) Math.pow(kVarH.c(), d10));
        }
        a<Float, Float> aVar3 = this.f88141i;
        if (aVar3 != null) {
            float fFloatValue = aVar3.h().floatValue();
            a<PointF, PointF> aVar4 = this.f88138f;
            PointF pointFH2 = aVar4 != null ? aVar4.h() : null;
            Matrix matrix = this.f88133a;
            float f11 = fFloatValue * f10;
            float f12 = 0.0f;
            float f13 = pointFH2 == null ? 0.0f : pointFH2.x;
            if (pointFH2 != null) {
                f12 = pointFH2.y;
            }
            matrix.preRotate(f11, f13, f12);
        }
        return this.f88133a;
    }

    @p0
    public a<?, Integer> h() {
        return this.f88142j;
    }

    @p0
    public a<?, Float> i() {
        return this.f88145m;
    }

    public void j(float f10) {
        a<Integer, Integer> aVar = this.f88142j;
        if (aVar != null) {
            aVar.n(f10);
        }
        a<?, Float> aVar2 = this.f88145m;
        if (aVar2 != null) {
            aVar2.n(f10);
        }
        a<?, Float> aVar3 = this.f88146n;
        if (aVar3 != null) {
            aVar3.n(f10);
        }
        a<PointF, PointF> aVar4 = this.f88138f;
        if (aVar4 != null) {
            aVar4.n(f10);
        }
        a<?, PointF> aVar5 = this.f88139g;
        if (aVar5 != null) {
            aVar5.n(f10);
        }
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar6 = this.f88140h;
        if (aVar6 != null) {
            aVar6.n(f10);
        }
        a<Float, Float> aVar7 = this.f88141i;
        if (aVar7 != null) {
            aVar7.n(f10);
        }
        d dVar = this.f88143k;
        if (dVar != null) {
            dVar.n(f10);
        }
        d dVar2 = this.f88144l;
        if (dVar2 != null) {
            dVar2.n(f10);
        }
    }
}
