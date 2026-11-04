package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import androidx.annotation.p0;
import com.airbnb.lottie.b1;
import com.airbnb.lottie.w0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class o implements n, com.airbnb.lottie.animation.keyframe.a.b, k {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final float f88014s = 0.47829f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f88015t = 0.25f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f88020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w0 f88021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.k.a f88022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f88023h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f88024i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f88025j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f88026k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f88027l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f88028m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f88029n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f88030o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f88031p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f88033r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f88016a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f88017b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PathMeasure f88018c = new PathMeasure();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f88019d = new float[2];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final b f88032q = new b();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88034a;

        static {
            int[] iArr = new int[com.airbnb.lottie.model.content.k.a.values().length];
            f88034a = iArr;
            try {
                iArr[com.airbnb.lottie.model.content.k.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88034a[com.airbnb.lottie.model.content.k.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public o(w0 w0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.k kVar) {
        this.f88021f = w0Var;
        this.f88020e = kVar.d();
        com.airbnb.lottie.model.content.k.a aVarJ = kVar.j();
        this.f88022g = aVarJ;
        this.f88023h = kVar.k();
        this.f88024i = kVar.l();
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarA = kVar.g().a();
        this.f88025j = aVarA;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVarA2 = kVar.h().a();
        this.f88026k = aVarA2;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarA3 = kVar.i().a();
        this.f88027l = aVarA3;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarA4 = kVar.e().a();
        this.f88029n = aVarA4;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarA5 = kVar.f().a();
        this.f88031p = aVarA5;
        com.airbnb.lottie.model.content.k.a aVar = com.airbnb.lottie.model.content.k.a.STAR;
        if (aVarJ == aVar) {
            this.f88028m = kVar.b().a();
            this.f88030o = kVar.c().a();
        } else {
            this.f88028m = null;
            this.f88030o = null;
        }
        bVar.i(aVarA);
        bVar.i(aVarA2);
        bVar.i(aVarA3);
        bVar.i(aVarA4);
        bVar.i(aVarA5);
        if (aVarJ == aVar) {
            bVar.i(this.f88028m);
            bVar.i(this.f88030o);
        }
        aVarA.a(this);
        aVarA2.a(this);
        aVarA3.a(this);
        aVarA4.a(this);
        aVarA5.a(this);
        if (aVarJ == aVar) {
            this.f88028m.a(this);
            this.f88030o.a(this);
        }
    }

    private void b() {
        double d10;
        float f10;
        float f11;
        float f12;
        int iFloor = (int) Math.floor(this.f88025j.h().floatValue());
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar = this.f88027l;
        double radians = Math.toRadians((aVar == null ? 0.0d : aVar.h().floatValue()) - 90.0d);
        double d11 = iFloor;
        float fFloatValue = this.f88031p.h().floatValue() / 100.0f;
        float fFloatValue2 = this.f88029n.h().floatValue();
        double d12 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d12);
        float fSin = (float) (Math.sin(radians) * d12);
        this.f88016a.moveTo(fCos, fSin);
        double d13 = (float) (6.283185307179586d / d11);
        double dCeil = Math.ceil(d11);
        double d14 = radians + d13;
        int i10 = 0;
        while (true) {
            double d15 = i10;
            if (d15 >= dCeil) {
                PointF pointFH = this.f88026k.h();
                this.f88016a.offset(pointFH.x, pointFH.y);
                this.f88016a.close();
                return;
            }
            float fCos2 = (float) (d12 * Math.cos(d14));
            float fSin2 = (float) (Math.sin(d14) * d12);
            if (fFloatValue != 0.0f) {
                d10 = dCeil;
                f10 = fFloatValue;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan3 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan3);
                float fSin4 = (float) Math.sin(dAtan3);
                float f13 = fFloatValue2 * f10 * f88015t;
                float f14 = f13 * fCos3;
                float f15 = f13 * fSin3;
                float f16 = fCos4 * f13;
                float f17 = f13 * fSin4;
                if (d15 == d10 - 1.0d) {
                    this.f88017b.reset();
                    this.f88017b.moveTo(fCos, fSin);
                    float f18 = fCos - f14;
                    float f19 = fSin - f15;
                    float f20 = fCos2 + f16;
                    float f21 = fSin2 + f17;
                    f11 = fCos2;
                    f12 = fSin2;
                    this.f88017b.cubicTo(f18, f19, f20, f21, f11, f12);
                    this.f88018c.setPath(this.f88017b, false);
                    PathMeasure pathMeasure = this.f88018c;
                    pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, this.f88019d, null);
                    Path path = this.f88016a;
                    float[] fArr = this.f88019d;
                    path.cubicTo(f18, f19, f20, f21, fArr[0], fArr[1]);
                } else {
                    f11 = fCos2;
                    f12 = fSin2;
                    this.f88016a.cubicTo(fCos - f14, fSin - f15, f11 + f16, f12 + f17, f11, f12);
                }
                fCos = f11;
                fSin = f12;
            } else {
                fCos = fCos2;
                fSin = fSin2;
                d10 = dCeil;
                f10 = fFloatValue;
                if (d15 != d10 - 1.0d) {
                    this.f88016a.lineTo(fCos, fSin);
                }
                i10++;
                dCeil = d10;
                fFloatValue = f10;
            }
            d14 += d13;
            i10++;
            dCeil = d10;
            fFloatValue = f10;
        }
    }

    private void i() {
        float f10;
        float f11;
        float fCos;
        float fSin;
        float f12;
        double d10;
        float f13;
        float f14;
        float f15;
        float fFloatValue = this.f88025j.h().floatValue();
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar = this.f88027l;
        double radians = Math.toRadians((aVar == null ? 0.0d : aVar.h().floatValue()) - 90.0d);
        double d11 = fFloatValue;
        float f16 = (float) (6.283185307179586d / d11);
        if (this.f88024i) {
            f16 *= -1.0f;
        }
        float f17 = f16 / 2.0f;
        float f18 = fFloatValue - ((int) fFloatValue);
        if (f18 != 0.0f) {
            radians += (double) ((1.0f - f18) * f17);
        }
        float fFloatValue2 = this.f88029n.h().floatValue();
        float fFloatValue3 = this.f88028m.h().floatValue();
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar2 = this.f88030o;
        float fFloatValue4 = aVar2 != null ? aVar2.h().floatValue() / 100.0f : 0.0f;
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar3 = this.f88031p;
        float fFloatValue5 = aVar3 != null ? aVar3.h().floatValue() / 100.0f : 0.0f;
        if (f18 != 0.0f) {
            f13 = ((fFloatValue2 - fFloatValue3) * f18) + fFloatValue3;
            f11 = 0.0f;
            double d12 = f13;
            f10 = 2.0f;
            float fCos2 = (float) (d12 * Math.cos(radians));
            fSin = (float) (d12 * Math.sin(radians));
            this.f88016a.moveTo(fCos2, fSin);
            d10 = radians + ((double) ((f16 * f18) / 2.0f));
            fCos = fCos2;
            f12 = f17;
        } else {
            f10 = 2.0f;
            f11 = 0.0f;
            double d13 = fFloatValue2;
            fCos = (float) (Math.cos(radians) * d13);
            fSin = (float) (d13 * Math.sin(radians));
            this.f88016a.moveTo(fCos, fSin);
            f12 = f17;
            d10 = radians + ((double) f12);
            f13 = 0.0f;
        }
        double dCeil = Math.ceil(d11) * 2.0d;
        int i10 = 0;
        boolean z10 = false;
        double d14 = d10;
        float f19 = fSin;
        float f20 = fCos;
        double d15 = d14;
        while (true) {
            double d16 = i10;
            if (d16 >= dCeil) {
                PointF pointFH = this.f88026k.h();
                this.f88016a.offset(pointFH.x, pointFH.y);
                this.f88016a.close();
                return;
            }
            float f21 = z10 ? fFloatValue2 : fFloatValue3;
            float f22 = (f13 == f11 || d16 != dCeil - 2.0d) ? f12 : (f16 * f18) / f10;
            double d17 = (f13 == f11 || d16 != dCeil - 1.0d) ? f21 : f13;
            float fCos3 = (float) (d17 * Math.cos(d15));
            float f23 = f16;
            float fSin2 = (float) (d17 * Math.sin(d15));
            if (fFloatValue4 == f11 && fFloatValue5 == f11) {
                this.f88016a.lineTo(fCos3, fSin2);
                f15 = fCos3;
                f14 = fSin2;
            } else {
                double dAtan2 = (float) (Math.atan2(f19, f20) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                float f24 = f20;
                float f25 = f19;
                f14 = fSin2;
                double dAtan3 = (float) (Math.atan2(fSin2, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan3);
                float fSin4 = (float) Math.sin(dAtan3);
                float f26 = z10 ? fFloatValue4 : fFloatValue5;
                float f27 = z10 ? fFloatValue5 : fFloatValue4;
                float f28 = z10 ? fFloatValue3 : fFloatValue2;
                float f29 = z10 ? fFloatValue2 : fFloatValue3;
                float f30 = f28 * f26 * f88014s;
                float f31 = fCos4 * f30;
                float f32 = f30 * fSin3;
                float f33 = f29 * f27 * f88014s;
                float f34 = fCos5 * f33;
                float f35 = f33 * fSin4;
                if (f18 != 0.0f) {
                    if (i10 == 0) {
                        f31 *= f18;
                        f32 *= f18;
                    } else if (d16 == dCeil - 1.0d) {
                        f34 *= f18;
                        f35 *= f18;
                    }
                }
                f15 = fCos3;
                this.f88016a.cubicTo(f24 - f31, f25 - f32, fCos3 + f34, f14 + f35, f15, f14);
            }
            d15 += (double) f22;
            z10 = !z10;
            i10++;
            f12 = f12;
            f20 = f15;
            f19 = f14;
            f16 = f23;
        }
    }

    private void j() {
        this.f88033r = false;
        this.f88021f.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path S() {
        if (this.f88033r) {
            return this.f88016a;
        }
        this.f88016a.reset();
        if (this.f88023h) {
            this.f88033r = true;
            return this.f88016a;
        }
        int i10 = a.f88034a[this.f88022g.ordinal()];
        if (i10 == 1) {
            i();
        } else if (i10 == 2) {
            b();
        }
        this.f88016a.close();
        this.f88032q.b(this.f88016a);
        this.f88033r = true;
        return this.f88016a;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void d() {
        j();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void e(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                if (vVar.j() == com.airbnb.lottie.model.content.t.a.SIMULTANEOUSLY) {
                    this.f88032q.a(vVar);
                    vVar.b(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.model.f
    public <T> void g(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar;
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar2;
        if (t10 == b1.f88173w) {
            this.f88025j.o(jVar);
            return;
        }
        if (t10 == b1.f88174x) {
            this.f88027l.o(jVar);
            return;
        }
        if (t10 == b1.f88164n) {
            this.f88026k.o(jVar);
            return;
        }
        if (t10 == b1.f88175y && (aVar2 = this.f88028m) != null) {
            aVar2.o(jVar);
            return;
        }
        if (t10 == b1.f88176z) {
            this.f88029n.o(jVar);
            return;
        }
        if (t10 == b1.A && (aVar = this.f88030o) != null) {
            aVar.o(jVar);
        } else if (t10 == b1.B) {
            this.f88031p.o(jVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f88020e;
    }

    @Override // com.airbnb.lottie.model.f
    public void h(com.airbnb.lottie.model.e eVar, int i10, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.i.m(eVar, i10, list, eVar2, this);
    }
}
