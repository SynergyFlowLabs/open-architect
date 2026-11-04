package com.airbnb.lottie.parser;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88688a = com.airbnb.lottie.parser.moshi.c.a.a("s", "e", "o", "nm", androidx.media3.exoplayer.upstream.h.f66001o, "hd");

    private m0() {
    }

    static com.airbnb.lottie.model.content.t a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        String strJc = null;
        com.airbnb.lottie.model.content.t.a aVarL = null;
        com.airbnb.lottie.model.animatable.b bVarF = null;
        com.airbnb.lottie.model.animatable.b bVarF2 = null;
        com.airbnb.lottie.model.animatable.b bVarF3 = null;
        boolean zNextBoolean = false;
        while (cVar.hasNext()) {
            int iE = cVar.e(f88688a);
            if (iE == 0) {
                bVarF = d.f(cVar, kVar, false);
            } else if (iE != 1) {
                int i10 = 5 & 2;
                if (iE != 2) {
                    int i11 = i10 & 3;
                    if (iE != 3) {
                        int i12 = i11 & 4;
                        if (iE == 4) {
                            aVarL = com.airbnb.lottie.model.content.t.a.l(cVar.nextInt());
                        } else if (iE != 5) {
                            cVar.a9();
                        } else {
                            zNextBoolean = cVar.nextBoolean();
                        }
                    } else {
                        strJc = cVar.jc();
                    }
                } else {
                    bVarF3 = d.f(cVar, kVar, false);
                }
            } else {
                bVarF2 = d.f(cVar, kVar, false);
            }
        }
        return new com.airbnb.lottie.model.content.t(strJc, aVarL, bVarF, bVarF2, bVarF3, zNextBoolean);
    }
}
