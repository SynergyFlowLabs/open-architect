package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.p0;
import androidx.collection.j3;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f88794a = 100.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static j3<WeakReference<Interpolator>> f88796c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Interpolator f88795b = new LinearInterpolator();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static com.airbnb.lottie.parser.moshi.c.a f88797d = com.airbnb.lottie.parser.moshi.c.a.a("t", "s", "e", "o", androidx.media3.exoplayer.upstream.h.f65997k, androidx.media3.exoplayer.upstream.h.f65993g, "to", "ti");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static com.airbnb.lottie.parser.moshi.c.a f88798e = com.airbnb.lottie.parser.moshi.c.a.a("x", "y");

    t() {
    }

    @p0
    private static WeakReference<Interpolator> a(int i10) {
        WeakReference<Interpolator> weakReferenceG;
        synchronized (t.class) {
            weakReferenceG = g().g(i10);
        }
        return weakReferenceG;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator interpolatorB;
        pointF.x = com.airbnb.lottie.utils.i.c(pointF.x, -1.0f, 1.0f);
        pointF.y = com.airbnb.lottie.utils.i.c(pointF.y, -100.0f, f88794a);
        pointF2.x = com.airbnb.lottie.utils.i.c(pointF2.x, -1.0f, 1.0f);
        float fC = com.airbnb.lottie.utils.i.c(pointF2.y, -100.0f, f88794a);
        pointF2.y = fC;
        int i10 = com.airbnb.lottie.utils.j.i(pointF.x, pointF.y, pointF2.x, fC);
        WeakReference<Interpolator> weakReferenceA = com.airbnb.lottie.f.e() ? null : a(i10);
        Interpolator interpolator = weakReferenceA != null ? weakReferenceA.get() : null;
        if (weakReferenceA != null && interpolator != null) {
            return interpolator;
        }
        try {
            interpolatorB = androidx.core.view.animation.b.b(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e10) {
            interpolatorB = "The Path cannot loop back on itself.".equals(e10.getMessage()) ? androidx.core.view.animation.b.b(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        if (!com.airbnb.lottie.f.e()) {
            try {
                h(i10, new WeakReference(interpolatorB));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolatorB;
    }

    static <T> com.airbnb.lottie.value.a<T> c(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, float f10, n0<T> n0Var, boolean z10, boolean z11) throws IOException {
        if (z10 && z11) {
            return e(kVar, cVar, f10, n0Var);
        }
        return z10 ? d(kVar, cVar, f10, n0Var) : f(cVar, f10, n0Var);
    }

    private static <T> com.airbnb.lottie.value.a<T> d(com.airbnb.lottie.k kVar, com.airbnb.lottie.parser.moshi.c cVar, float f10, n0<T> n0Var) throws IOException {
        Interpolator interpolatorB;
        T t10;
        cVar.m1();
        PointF pointFE = null;
        T tA = null;
        T tA2 = null;
        PointF pointFE2 = null;
        PointF pointFE3 = null;
        float fNextDouble = 0.0f;
        boolean z10 = false;
        PointF pointFE4 = null;
        while (cVar.hasNext()) {
            switch (cVar.e(f88797d)) {
                case 0:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 1:
                    tA2 = n0Var.a(cVar, f10);
                    break;
                case 2:
                    tA = n0Var.a(cVar, f10);
                    break;
                case 3:
                    pointFE = s.e(cVar, 1.0f);
                    break;
                case 4:
                    pointFE4 = s.e(cVar, 1.0f);
                    break;
                case 5:
                    z10 = cVar.nextInt() == 1;
                    break;
                case 6:
                    pointFE2 = s.e(cVar, f10);
                    break;
                case 7:
                    pointFE3 = s.e(cVar, f10);
                    break;
                default:
                    cVar.a9();
                    break;
            }
        }
        cVar.F1();
        if (z10) {
            interpolatorB = f88795b;
            t10 = tA2;
        } else {
            interpolatorB = (pointFE == null || pointFE4 == null) ? f88795b : b(pointFE, pointFE4);
            t10 = tA;
        }
        com.airbnb.lottie.value.a<T> aVar = new com.airbnb.lottie.value.a<>(kVar, tA2, t10, interpolatorB, fNextDouble, null);
        aVar.f88882o = pointFE2;
        aVar.f88883p = pointFE3;
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01fe  */
    private static <T> com.airbnb.lottie.value.a<T> e(com.airbnb.lottie.k kVar, com.airbnb.lottie.parser.moshi.c cVar, float f10, n0<T> n0Var) throws IOException {
        Interpolator interpolatorB;
        Interpolator interpolatorB2;
        Interpolator interpolatorB3;
        T t10;
        Interpolator interpolator;
        PointF pointF;
        com.airbnb.lottie.value.a<T> aVar;
        PointF pointF2;
        boolean z10;
        float f11;
        cVar.m1();
        boolean z11 = false;
        PointF pointFE = null;
        PointF pointFE2 = null;
        PointF pointF3 = null;
        T tA = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointFE3 = null;
        PointF pointFE4 = null;
        float fNextDouble = 0.0f;
        T tA2 = null;
        while (cVar.hasNext()) {
            switch (cVar.e(f88797d)) {
                case 0:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 1:
                    tA = n0Var.a(cVar, f10);
                    break;
                case 2:
                    tA2 = n0Var.a(cVar, f10);
                    break;
                case 3:
                    boolean z12 = z11;
                    if (cVar.c() == com.airbnb.lottie.parser.moshi.c.b.BEGIN_OBJECT) {
                        cVar.m1();
                        float fNextDouble2 = 0.0f;
                        float fNextDouble3 = 0.0f;
                        float fNextDouble4 = 0.0f;
                        float fNextDouble5 = 0.0f;
                        while (cVar.hasNext()) {
                            int iE = cVar.e(f88798e);
                            if (iE == 0) {
                                pointF2 = pointF5;
                                com.airbnb.lottie.parser.moshi.c.b bVarC = cVar.c();
                                com.airbnb.lottie.parser.moshi.c.b bVar = com.airbnb.lottie.parser.moshi.c.b.NUMBER;
                                if (bVarC == bVar) {
                                    fNextDouble4 = (float) cVar.nextDouble();
                                    fNextDouble2 = fNextDouble4;
                                } else {
                                    cVar.J0();
                                    fNextDouble2 = (float) cVar.nextDouble();
                                    fNextDouble4 = cVar.c() == bVar ? (float) cVar.nextDouble() : fNextDouble2;
                                    cVar.F0();
                                }
                            } else if (iE != 1) {
                                cVar.a9();
                            } else {
                                com.airbnb.lottie.parser.moshi.c.b bVarC2 = cVar.c();
                                com.airbnb.lottie.parser.moshi.c.b bVar2 = com.airbnb.lottie.parser.moshi.c.b.NUMBER;
                                if (bVarC2 == bVar2) {
                                    pointF2 = pointF5;
                                    fNextDouble5 = (float) cVar.nextDouble();
                                    fNextDouble3 = fNextDouble5;
                                } else {
                                    pointF2 = pointF5;
                                    cVar.J0();
                                    fNextDouble3 = (float) cVar.nextDouble();
                                    fNextDouble5 = cVar.c() == bVar2 ? (float) cVar.nextDouble() : fNextDouble3;
                                    cVar.F0();
                                }
                            }
                            pointF5 = pointF2;
                        }
                        pointF3 = new PointF(fNextDouble2, fNextDouble3);
                        pointF4 = new PointF(fNextDouble4, fNextDouble5);
                        cVar.F1();
                    } else {
                        pointFE = s.e(cVar, f10);
                    }
                    z11 = z12;
                    break;
                case 4:
                    if (cVar.c() != com.airbnb.lottie.parser.moshi.c.b.BEGIN_OBJECT) {
                        pointFE2 = s.e(cVar, f10);
                    } else {
                        cVar.m1();
                        float f12 = 0.0f;
                        float f13 = 0.0f;
                        float fNextDouble6 = 0.0f;
                        float fNextDouble7 = 0.0f;
                        while (cVar.hasNext()) {
                            int iE2 = cVar.e(f88798e);
                            if (iE2 != 0) {
                                z10 = z11;
                                if (iE2 != 1) {
                                    cVar.a9();
                                } else {
                                    com.airbnb.lottie.parser.moshi.c.b bVarC3 = cVar.c();
                                    com.airbnb.lottie.parser.moshi.c.b bVar3 = com.airbnb.lottie.parser.moshi.c.b.NUMBER;
                                    if (bVarC3 == bVar3) {
                                        fNextDouble7 = (float) cVar.nextDouble();
                                        f13 = fNextDouble7;
                                    } else {
                                        cVar.J0();
                                        PointF pointF7 = pointFE3;
                                        float fNextDouble8 = (float) cVar.nextDouble();
                                        fNextDouble7 = cVar.c() == bVar3 ? (float) cVar.nextDouble() : fNextDouble8;
                                        cVar.F0();
                                        pointFE3 = pointF7;
                                        f13 = fNextDouble8;
                                    }
                                }
                            } else {
                                z10 = z11;
                                PointF pointF8 = pointFE3;
                                com.airbnb.lottie.parser.moshi.c.b bVarC4 = cVar.c();
                                com.airbnb.lottie.parser.moshi.c.b bVar4 = com.airbnb.lottie.parser.moshi.c.b.NUMBER;
                                if (bVarC4 == bVar4) {
                                    pointFE3 = pointF8;
                                    fNextDouble6 = (float) cVar.nextDouble();
                                    f12 = fNextDouble6;
                                } else {
                                    pointFE3 = pointF8;
                                    cVar.J0();
                                    float fNextDouble9 = (float) cVar.nextDouble();
                                    if (cVar.c() == bVar4) {
                                        f11 = fNextDouble9;
                                        fNextDouble6 = (float) cVar.nextDouble();
                                    } else {
                                        f11 = fNextDouble9;
                                        fNextDouble6 = f11;
                                    }
                                    cVar.F0();
                                    f12 = f11;
                                }
                            }
                            z11 = z10;
                        }
                        PointF pointF9 = new PointF(f12, f13);
                        PointF pointF10 = new PointF(fNextDouble6, fNextDouble7);
                        cVar.F1();
                        pointF6 = pointF10;
                        pointF5 = pointF9;
                    }
                    break;
                case 5:
                    z11 = cVar.nextInt() == 1;
                    break;
                case 6:
                    pointFE3 = s.e(cVar, f10);
                    break;
                case 7:
                    pointFE4 = s.e(cVar, f10);
                    break;
                default:
                    cVar.a9();
                    break;
            }
        }
        boolean z13 = z11;
        PointF pointF11 = pointF5;
        cVar.F1();
        if (z13) {
            interpolator = f88795b;
            t10 = tA;
        } else {
            if (pointFE == null || pointFE2 == null) {
                if (pointF3 == null || pointF4 == null || pointF11 == null || pointF6 == null) {
                    interpolatorB = f88795b;
                } else {
                    interpolatorB2 = b(pointF3, pointF11);
                    interpolatorB3 = b(pointF4, pointF6);
                    t10 = tA2;
                    interpolator = null;
                }
                if (interpolatorB2 != null || interpolatorB3 == null) {
                    pointF = pointFE4;
                    aVar = new com.airbnb.lottie.value.a<>(kVar, tA, t10, interpolator, fNextDouble, null);
                } else {
                    pointF = pointFE4;
                    aVar = new com.airbnb.lottie.value.a<>(kVar, tA, t10, interpolatorB2, interpolatorB3, fNextDouble, null);
                }
                aVar.f88882o = pointFE3;
                aVar.f88883p = pointF;
                return aVar;
            }
            interpolatorB = b(pointFE, pointFE2);
            interpolator = interpolatorB;
            t10 = tA2;
        }
        interpolatorB2 = null;
        interpolatorB3 = null;
        if (interpolatorB2 != null) {
            pointF = pointFE4;
            aVar = new com.airbnb.lottie.value.a<>(kVar, tA, t10, interpolator, fNextDouble, null);
        } else {
            pointF = pointFE4;
            aVar = new com.airbnb.lottie.value.a<>(kVar, tA, t10, interpolator, fNextDouble, null);
        }
        aVar.f88882o = pointFE3;
        aVar.f88883p = pointF;
        return aVar;
    }

    private static <T> com.airbnb.lottie.value.a<T> f(com.airbnb.lottie.parser.moshi.c cVar, float f10, n0<T> n0Var) throws IOException {
        return new com.airbnb.lottie.value.a<>(n0Var.a(cVar, f10));
    }

    private static j3<WeakReference<Interpolator>> g() {
        if (f88796c == null) {
            f88796c = new j3<>();
        }
        return f88796c;
    }

    private static void h(int i10, WeakReference<Interpolator> weakReference) {
        synchronized (t.class) {
            try {
                f88796c.o(i10, weakReference);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
