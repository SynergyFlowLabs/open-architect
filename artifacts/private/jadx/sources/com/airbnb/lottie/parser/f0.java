package com.airbnb.lottie.parser;

import androidx.annotation.p0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88660a = com.airbnb.lottie.parser.moshi.c.a.a("nm", "r", "hd");

    private f0() {
    }

    @p0
    static com.airbnb.lottie.model.content.n a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        boolean zNextBoolean = false;
        String strJc = null;
        com.airbnb.lottie.model.animatable.b bVarF = null;
        while (cVar.hasNext()) {
            int iE = cVar.e(f88660a);
            if (iE == 0) {
                strJc = cVar.jc();
            } else if (iE == 1) {
                bVarF = d.f(cVar, kVar, true);
            } else if (iE != 2) {
                cVar.a9();
            } else {
                zNextBoolean = cVar.nextBoolean();
            }
        }
        if (zNextBoolean) {
            return null;
        }
        return new com.airbnb.lottie.model.content.n(strJc, bVarF);
    }
}
