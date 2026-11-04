package com.airbnb.lottie.parser;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88808a = com.airbnb.lottie.parser.moshi.c.a.a("nm", "mm", "hd");

    private y() {
    }

    static com.airbnb.lottie.model.content.j a(com.airbnb.lottie.parser.moshi.c cVar) throws IOException {
        String strJc = null;
        boolean zNextBoolean = false;
        com.airbnb.lottie.model.content.j.a aVarL = null;
        while (cVar.hasNext()) {
            int iE = cVar.e(f88808a);
            if (iE == 0) {
                strJc = cVar.jc();
            } else if (iE == 1) {
                aVarL = com.airbnb.lottie.model.content.j.a.l(cVar.nextInt());
            } else if (iE != 2) {
                cVar.f();
                cVar.a9();
            } else {
                zNextBoolean = cVar.nextBoolean();
            }
        }
        return new com.airbnb.lottie.model.content.j(strJc, aVarL, zNextBoolean);
    }
}
