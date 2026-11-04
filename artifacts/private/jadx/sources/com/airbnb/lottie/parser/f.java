package com.airbnb.lottie.parser;

import android.graphics.PointF;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88659a = com.airbnb.lottie.parser.moshi.c.a.a("nm", "p", "s", "hd", "d");

    private f() {
    }

    static com.airbnb.lottie.model.content.b a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, int i10) throws IOException {
        boolean z10 = i10 == 3;
        boolean zNextBoolean = false;
        String strJc = null;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVarB = null;
        com.airbnb.lottie.model.animatable.f fVarI = null;
        while (cVar.hasNext()) {
            int iE = cVar.e(f88659a);
            if (iE == 0) {
                strJc = cVar.jc();
            } else if (iE == 1) {
                mVarB = a.b(cVar, kVar);
            } else if (iE == 2) {
                fVarI = d.i(cVar, kVar);
            } else if (iE == 3) {
                zNextBoolean = cVar.nextBoolean();
            } else if (iE != 4) {
                cVar.f();
                cVar.a9();
            } else {
                z10 = cVar.nextInt() == 3;
            }
        }
        return new com.airbnb.lottie.model.content.b(strJc, mVarB, fVarI, z10, zNextBoolean);
    }
}
