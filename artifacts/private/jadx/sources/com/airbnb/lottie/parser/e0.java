package com.airbnb.lottie.parser;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88658a = com.airbnb.lottie.parser.moshi.c.a.a("nm", "c", "o", "tr", "hd");

    private e0() {
    }

    static com.airbnb.lottie.model.content.m a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        String strJc = null;
        com.airbnb.lottie.model.animatable.b bVarF = null;
        com.airbnb.lottie.model.animatable.b bVarF2 = null;
        com.airbnb.lottie.model.animatable.l lVarG = null;
        boolean zNextBoolean = false;
        while (cVar.hasNext()) {
            int iE = cVar.e(f88658a);
            if (iE == 0) {
                strJc = cVar.jc();
            } else if (iE == 1) {
                bVarF = d.f(cVar, kVar, false);
            } else if (iE == 2) {
                bVarF2 = d.f(cVar, kVar, false);
            } else if (iE == 3) {
                lVarG = c.g(cVar, kVar);
            } else if (iE != 4) {
                cVar.a9();
            } else {
                zNextBoolean = cVar.nextBoolean();
            }
        }
        return new com.airbnb.lottie.model.content.m(strJc, bVarF, bVarF2, lVarG, zNextBoolean);
    }
}
