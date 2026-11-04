package com.airbnb.lottie.parser;

import android.graphics.PointF;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88652a = com.airbnb.lottie.parser.moshi.c.a.a(androidx.media3.exoplayer.upstream.h.f65998l, "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88653b = com.airbnb.lottie.parser.moshi.c.a.a("k");

    private c() {
    }

    private static boolean a(com.airbnb.lottie.model.animatable.e eVar) {
        if (eVar != null && (!eVar.c() || !eVar.b().get(0).f88869b.equals(0.0f, 0.0f))) {
            return false;
        }
        return true;
    }

    private static boolean b(com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar) {
        if (mVar != null) {
            return !(mVar instanceof com.airbnb.lottie.model.animatable.i) && mVar.c() && mVar.b().get(0).f88869b.equals(0.0f, 0.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean c(com.airbnb.lottie.model.animatable.b bVar) {
        if (bVar != null) {
            return bVar.c() && ((Float) ((com.airbnb.lottie.value.a) bVar.b().get(0)).f88869b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean d(com.airbnb.lottie.model.animatable.g gVar) {
        if (gVar != null && (!gVar.c() || !((com.airbnb.lottie.value.k) ((com.airbnb.lottie.value.a) gVar.b().get(0)).f88869b).a(1.0f, 1.0f))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean e(com.airbnb.lottie.model.animatable.b bVar) {
        if (bVar != null) {
            return bVar.c() && ((Float) ((com.airbnb.lottie.value.a) bVar.b().get(0)).f88869b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean f(com.airbnb.lottie.model.animatable.b bVar) {
        if (bVar != null && (!bVar.c() || ((Float) ((com.airbnb.lottie.value.a) bVar.b().get(0)).f88869b).floatValue() != 0.0f)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code duplicated, block: B:23:0x0087  */
    /* JADX WARN: Code duplicated, block: B:25:0x0095  */
    public static com.airbnb.lottie.model.animatable.l g(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        com.airbnb.lottie.model.animatable.b bVarF;
        com.airbnb.lottie.k kVar2 = kVar;
        Float fValueOf = Float.valueOf(0.0f);
        boolean z10 = cVar.c() == com.airbnb.lottie.parser.moshi.c.b.BEGIN_OBJECT;
        if (z10) {
            cVar.m1();
        }
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.e eVarA = null;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVarB = null;
        com.airbnb.lottie.model.animatable.g gVarJ = null;
        com.airbnb.lottie.model.animatable.b bVarF2 = null;
        com.airbnb.lottie.model.animatable.b bVarF3 = null;
        com.airbnb.lottie.model.animatable.d dVarH = null;
        com.airbnb.lottie.model.animatable.b bVarF4 = null;
        com.airbnb.lottie.model.animatable.b bVarF5 = null;
        while (cVar.hasNext()) {
            switch (cVar.e(f88652a)) {
                case 0:
                    cVar.m1();
                    while (cVar.hasNext()) {
                        if (cVar.e(f88653b) != 0) {
                            cVar.f();
                            cVar.a9();
                        } else {
                            eVarA = a.a(cVar, kVar);
                        }
                    }
                    cVar.F1();
                    kVar2 = kVar;
                    break;
                case 1:
                    mVarB = a.b(cVar, kVar);
                    kVar2 = kVar;
                    break;
                case 2:
                    gVarJ = d.j(cVar, kVar);
                    kVar2 = kVar;
                    break;
                case 3:
                    kVar2.a("Lottie doesn't support 3D layers.");
                    bVarF = d.f(cVar, kVar2, false);
                    if (bVarF.b().isEmpty()) {
                        bVarF.b().add(new com.airbnb.lottie.value.a(kVar2, fValueOf, fValueOf, null, 0.0f, Float.valueOf(kVar2.f())));
                    } else if (((com.airbnb.lottie.value.a) bVarF.b().get(0)).f88869b == 0) {
                        bVarF.b().set(0, new com.airbnb.lottie.value.a(kVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(kVar.f())));
                    }
                    kVar2 = kVar;
                    bVar = bVarF;
                    break;
                case 4:
                    bVarF = d.f(cVar, kVar2, false);
                    if (bVarF.b().isEmpty()) {
                        bVarF.b().add(new com.airbnb.lottie.value.a(kVar2, fValueOf, fValueOf, null, 0.0f, Float.valueOf(kVar2.f())));
                    } else if (((com.airbnb.lottie.value.a) bVarF.b().get(0)).f88869b == 0) {
                        bVarF.b().set(0, new com.airbnb.lottie.value.a(kVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(kVar.f())));
                    }
                    kVar2 = kVar;
                    bVar = bVarF;
                    break;
                case 5:
                    dVarH = d.h(cVar, kVar);
                    break;
                case 6:
                    bVarF4 = d.f(cVar, kVar2, false);
                    break;
                case 7:
                    bVarF5 = d.f(cVar, kVar2, false);
                    break;
                case 8:
                    bVarF2 = d.f(cVar, kVar2, false);
                    break;
                case 9:
                    bVarF3 = d.f(cVar, kVar2, false);
                    break;
                default:
                    cVar.f();
                    cVar.a9();
                    break;
            }
        }
        if (z10) {
            cVar.F1();
        }
        com.airbnb.lottie.model.animatable.e eVar = a(eVarA) ? null : eVarA;
        if (b(mVarB)) {
            mVarB = null;
        }
        return new com.airbnb.lottie.model.animatable.l(eVar, mVarB, d(gVarJ) ? null : gVarJ, c(bVar) ? null : bVar, dVarH, bVarF4, bVarF5, f(bVarF2) ? null : bVarF2, e(bVarF3) ? null : bVarF3);
    }
}
