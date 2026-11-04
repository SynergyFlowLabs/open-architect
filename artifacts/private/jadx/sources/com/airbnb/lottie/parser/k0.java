package com.airbnb.lottie.parser;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static com.airbnb.lottie.parser.moshi.c.a f88682a = com.airbnb.lottie.parser.moshi.c.a.a("nm", "ind", "ks", "hd");

    private k0() {
    }

    static com.airbnb.lottie.model.content.r a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        String strJc = null;
        int iNextInt = 0;
        boolean zNextBoolean = false;
        com.airbnb.lottie.model.animatable.h hVarK = null;
        while (cVar.hasNext()) {
            int iE = cVar.e(f88682a);
            if (iE == 0) {
                strJc = cVar.jc();
            } else if (iE == 1) {
                iNextInt = cVar.nextInt();
            } else if (iE != 2) {
                int i10 = 4 | 3;
                if (iE != 3) {
                    cVar.a9();
                } else {
                    zNextBoolean = cVar.nextBoolean();
                }
            } else {
                hVarK = d.k(cVar, kVar);
            }
        }
        return new com.airbnb.lottie.model.content.r(strJc, iNextInt, hVarK, zNextBoolean);
    }
}
