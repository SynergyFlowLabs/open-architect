package com.airbnb.lottie.parser;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88686a = com.airbnb.lottie.parser.moshi.c.a.a("ch", "size", "w", "style", "fFamily", "data");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88687b = com.airbnb.lottie.parser.moshi.c.a.a("shapes");

    private m() {
    }

    static com.airbnb.lottie.model.d a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        cVar.m1();
        int i10 = 2 ^ 0;
        double dNextDouble = 0.0d;
        String strJc = null;
        String strJc2 = null;
        char cCharAt = 0;
        double dNextDouble2 = 0.0d;
        while (cVar.hasNext()) {
            int iE = cVar.e(f88686a);
            if (iE == 0) {
                cCharAt = cVar.jc().charAt(0);
            } else if (iE == 1) {
                dNextDouble2 = cVar.nextDouble();
            } else if (iE == 2) {
                dNextDouble = cVar.nextDouble();
            } else if (iE == 3) {
                strJc = cVar.jc();
            } else if (iE == 4) {
                strJc2 = cVar.jc();
            } else if (iE != 5) {
                cVar.f();
                cVar.a9();
            } else {
                cVar.m1();
                while (cVar.hasNext()) {
                    if (cVar.e(f88687b) != 0) {
                        cVar.f();
                        cVar.a9();
                    } else {
                        cVar.J0();
                        while (cVar.hasNext()) {
                            arrayList.add((com.airbnb.lottie.model.content.q) h.a(cVar, kVar));
                        }
                        cVar.F0();
                    }
                }
                cVar.F1();
            }
        }
        cVar.F1();
        return new com.airbnb.lottie.model.d(arrayList, cCharAt, dNextDouble2, dNextDouble, strJc, strJc2);
    }
}
