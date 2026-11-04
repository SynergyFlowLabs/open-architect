package com.airbnb.lottie.parser;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88784a = com.airbnb.lottie.parser.moshi.c.a.a("fFamily", "fName", "fStyle", "ascent");

    private n() {
    }

    static com.airbnb.lottie.model.c a(com.airbnb.lottie.parser.moshi.c cVar) throws IOException {
        cVar.m1();
        String strJc = null;
        String strJc2 = null;
        float fNextDouble = 0.0f;
        String strJc3 = null;
        while (cVar.hasNext()) {
            int iE = cVar.e(f88784a);
            if (iE == 0) {
                strJc = cVar.jc();
            } else if (iE == 1) {
                strJc3 = cVar.jc();
            } else if (iE == 2) {
                strJc2 = cVar.jc();
            } else if (iE != 3) {
                cVar.f();
                cVar.a9();
            } else {
                fNextDouble = (float) cVar.nextDouble();
            }
        }
        cVar.F1();
        return new com.airbnb.lottie.model.c(strJc, strJc3, strJc2, fNextDouble);
    }
}
