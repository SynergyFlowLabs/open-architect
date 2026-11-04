package com.airbnb.lottie.parser;

import android.graphics.PointF;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88654a = com.airbnb.lottie.parser.moshi.c.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d");

    private c0() {
    }

    static com.airbnb.lottie.model.content.k a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, int i10) throws IOException {
        boolean zNextBoolean = false;
        boolean z10 = i10 == 3;
        String strJc = null;
        com.airbnb.lottie.model.content.k.a aVarL = null;
        com.airbnb.lottie.model.animatable.b bVarF = null;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVarB = null;
        com.airbnb.lottie.model.animatable.b bVarF2 = null;
        com.airbnb.lottie.model.animatable.b bVarE = null;
        com.airbnb.lottie.model.animatable.b bVarE2 = null;
        com.airbnb.lottie.model.animatable.b bVarF3 = null;
        com.airbnb.lottie.model.animatable.b bVarF4 = null;
        while (cVar.hasNext()) {
            switch (cVar.e(f88654a)) {
                case 0:
                    strJc = cVar.jc();
                    break;
                case 1:
                    aVarL = com.airbnb.lottie.model.content.k.a.l(cVar.nextInt());
                    break;
                case 2:
                    bVarF = d.f(cVar, kVar, false);
                    break;
                case 3:
                    mVarB = a.b(cVar, kVar);
                    break;
                case 4:
                    bVarF2 = d.f(cVar, kVar, false);
                    break;
                case 5:
                    bVarE2 = d.e(cVar, kVar);
                    break;
                case 6:
                    bVarF4 = d.f(cVar, kVar, false);
                    break;
                case 7:
                    bVarE = d.e(cVar, kVar);
                    break;
                case 8:
                    bVarF3 = d.f(cVar, kVar, false);
                    break;
                case 9:
                    zNextBoolean = cVar.nextBoolean();
                    break;
                case 10:
                    z10 = cVar.nextInt() == 3;
                    break;
                default:
                    cVar.f();
                    cVar.a9();
                    break;
            }
        }
        return new com.airbnb.lottie.model.content.k(strJc, aVarL, bVarF, mVarB, bVarF2, bVarE, bVarE2, bVarF3, bVarF4, zNextBoolean, z10);
    }
}
