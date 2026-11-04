package com.airbnb.lottie.parser;

import android.graphics.PointF;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88655a = com.airbnb.lottie.parser.moshi.c.a.a("nm", "p", "s", "r", "hd");

    private d0() {
    }

    static com.airbnb.lottie.model.content.l a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        String strJc = null;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVarB = null;
        com.airbnb.lottie.model.animatable.f fVarI = null;
        com.airbnb.lottie.model.animatable.b bVarE = null;
        boolean zNextBoolean = false;
        while (cVar.hasNext()) {
            int iE = cVar.e(f88655a);
            if (iE == 0) {
                strJc = cVar.jc();
            } else if (iE == 1) {
                mVarB = a.b(cVar, kVar);
            } else if (iE == 2) {
                fVarI = d.i(cVar, kVar);
            } else if (iE == 3) {
                bVarE = d.e(cVar, kVar);
            } else if (iE != 4) {
                cVar.a9();
            } else {
                zNextBoolean = cVar.nextBoolean();
            }
        }
        return new com.airbnb.lottie.model.content.l(strJc, mVarB, fVarI, bVarE, zNextBoolean);
    }
}
