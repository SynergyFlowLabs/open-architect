package com.airbnb.lottie.parser;

import android.graphics.Path;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88786a = com.airbnb.lottie.parser.moshi.c.a.a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88787b = com.airbnb.lottie.parser.moshi.c.a.a("p", "k");

    private p() {
    }

    static com.airbnb.lottie.model.content.e a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        com.airbnb.lottie.model.animatable.d dVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strJc = null;
        com.airbnb.lottie.model.content.g gVar = null;
        com.airbnb.lottie.model.animatable.c cVarG = null;
        com.airbnb.lottie.model.animatable.f fVarI = null;
        com.airbnb.lottie.model.animatable.f fVarI2 = null;
        boolean zNextBoolean = false;
        while (cVar.hasNext()) {
            switch (cVar.e(f88786a)) {
                case 0:
                    strJc = cVar.jc();
                    break;
                case 1:
                    cVar.m1();
                    int iNextInt = -1;
                    while (cVar.hasNext()) {
                        int iE = cVar.e(f88787b);
                        if (iE == 0) {
                            iNextInt = cVar.nextInt();
                        } else if (iE != 1) {
                            cVar.f();
                            cVar.a9();
                        } else {
                            cVarG = d.g(cVar, kVar, iNextInt);
                        }
                    }
                    cVar.F1();
                    break;
                case 2:
                    dVar = d.h(cVar, kVar);
                    break;
                case 3:
                    gVar = cVar.nextInt() == 1 ? com.airbnb.lottie.model.content.g.LINEAR : com.airbnb.lottie.model.content.g.RADIAL;
                    break;
                case 4:
                    fVarI = d.i(cVar, kVar);
                    break;
                case 5:
                    fVarI2 = d.i(cVar, kVar);
                    break;
                case 6:
                    fillType = cVar.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zNextBoolean = cVar.nextBoolean();
                    break;
                default:
                    cVar.f();
                    cVar.a9();
                    break;
            }
        }
        if (dVar == null) {
            dVar = new com.airbnb.lottie.model.animatable.d(Collections.singletonList(new com.airbnb.lottie.value.a(100)));
        }
        return new com.airbnb.lottie.model.content.e(strJc, gVar, fillType, cVarG, dVar, fVarI, fVarI2, null, null, zNextBoolean);
    }
}
