package com.airbnb.lottie.parser;

import android.graphics.Path;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88668a = com.airbnb.lottie.parser.moshi.c.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    private i0() {
    }

    static com.airbnb.lottie.model.content.p a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        com.airbnb.lottie.model.animatable.d dVar = null;
        String strJc = null;
        com.airbnb.lottie.model.animatable.a aVarC = null;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        int iNextInt = 1;
        while (cVar.hasNext()) {
            int iE = cVar.e(f88668a);
            if (iE == 0) {
                strJc = cVar.jc();
            } else if (iE == 1) {
                aVarC = d.c(cVar, kVar);
            } else if (iE == 2) {
                dVar = d.h(cVar, kVar);
            } else if (iE == 3) {
                zNextBoolean = cVar.nextBoolean();
            } else if (iE == 4) {
                iNextInt = cVar.nextInt();
            } else if (iE != 5) {
                cVar.f();
                cVar.a9();
            } else {
                zNextBoolean2 = cVar.nextBoolean();
            }
        }
        if (dVar == null) {
            dVar = new com.airbnb.lottie.model.animatable.d(Collections.singletonList(new com.airbnb.lottie.value.a(100)));
        }
        return new com.airbnb.lottie.model.content.p(strJc, zNextBoolean, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVarC, dVar, zNextBoolean2);
    }
}
