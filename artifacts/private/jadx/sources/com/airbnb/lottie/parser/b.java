package com.airbnb.lottie.parser;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88649a = com.airbnb.lottie.parser.moshi.c.a.a(androidx.media3.exoplayer.upstream.h.f65998l);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88650b = com.airbnb.lottie.parser.moshi.c.a.a("fc", "sc", "sw", "t");

    private b() {
    }

    public static com.airbnb.lottie.model.animatable.k a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        cVar.m1();
        com.airbnb.lottie.model.animatable.k kVarB = null;
        while (cVar.hasNext()) {
            if (cVar.e(f88649a) != 0) {
                cVar.f();
                cVar.a9();
            } else {
                kVarB = b(cVar, kVar);
            }
        }
        cVar.F1();
        return kVarB == null ? new com.airbnb.lottie.model.animatable.k(null, null, null, null) : kVarB;
    }

    private static com.airbnb.lottie.model.animatable.k b(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        cVar.m1();
        com.airbnb.lottie.model.animatable.a aVarC = null;
        com.airbnb.lottie.model.animatable.a aVarC2 = null;
        com.airbnb.lottie.model.animatable.b bVarE = null;
        com.airbnb.lottie.model.animatable.b bVarE2 = null;
        while (cVar.hasNext()) {
            int iE = cVar.e(f88650b);
            if (iE == 0) {
                aVarC = d.c(cVar, kVar);
            } else if (iE == 1) {
                aVarC2 = d.c(cVar, kVar);
            } else if (iE == 2) {
                bVarE = d.e(cVar, kVar);
            } else if (iE != 3) {
                cVar.f();
                cVar.a9();
            } else {
                bVarE2 = d.e(cVar, kVar);
            }
        }
        cVar.F1();
        return new com.airbnb.lottie.model.animatable.k(aVarC, aVarC2, bVarE, bVarE2);
    }
}
