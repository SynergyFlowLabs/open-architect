package com.airbnb.lottie.parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88684a = com.airbnb.lottie.parser.moshi.c.a.a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88685b = com.airbnb.lottie.parser.moshi.c.a.a("n", "v");

    private l0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static com.airbnb.lottie.model.content.s a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String strJc = null;
        com.airbnb.lottie.model.content.s.b bVar = null;
        com.airbnb.lottie.model.content.s.c cVar2 = null;
        Object obj = null;
        com.airbnb.lottie.model.animatable.a aVarC = null;
        com.airbnb.lottie.model.animatable.b bVarE = null;
        String str = null;
        float fNextDouble = 0.0f;
        boolean zNextBoolean = false;
        com.airbnb.lottie.model.animatable.d dVar = null;
        while (cVar.hasNext()) {
            switch (cVar.e(f88684a)) {
                case 0:
                    strJc = cVar.jc();
                    break;
                case 1:
                    aVarC = d.c(cVar, kVar);
                    break;
                case 2:
                    bVarE = d.e(cVar, kVar);
                    break;
                case 3:
                    dVar = d.h(cVar, kVar);
                    break;
                case 4:
                    bVar = com.airbnb.lottie.model.content.s.b.values()[cVar.nextInt() - 1];
                    break;
                case 5:
                    cVar2 = com.airbnb.lottie.model.content.s.c.values()[cVar.nextInt() - 1];
                    break;
                case 6:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 7:
                    zNextBoolean = cVar.nextBoolean();
                    break;
                case 8:
                    cVar.J0();
                    while (cVar.hasNext()) {
                        cVar.m1();
                        String strJc2 = str;
                        Object objE = strJc2;
                        while (cVar.hasNext()) {
                            int iE = cVar.e(f88685b);
                            if (iE == 0) {
                                strJc2 = cVar.jc();
                            } else if (iE != 1) {
                                cVar.f();
                                cVar.a9();
                            } else {
                                objE = d.e(cVar, kVar);
                            }
                        }
                        cVar.F1();
                        strJc2.getClass();
                        switch (strJc2) {
                            case "d":
                            case "g":
                                kVar.y(true);
                                arrayList.add(objE);
                                break;
                            case "o":
                                obj = objE;
                                break;
                        }
                        str = null;
                    }
                    cVar.F0();
                    if (arrayList.size() == 1) {
                        arrayList.add((com.airbnb.lottie.model.animatable.b) arrayList.get(0));
                    }
                    break;
                default:
                    cVar.a9();
                    continue;
            }
            str = null;
        }
        if (dVar == null) {
            dVar = new com.airbnb.lottie.model.animatable.d(Collections.singletonList(new com.airbnb.lottie.value.a(100)));
        }
        if (bVar == null) {
            bVar = com.airbnb.lottie.model.content.s.b.BUTT;
        }
        if (cVar2 == null) {
            cVar2 = com.airbnb.lottie.model.content.s.c.MITER;
        }
        return new com.airbnb.lottie.model.content.s(strJc, obj, arrayList, aVarC, dVar, bVarE, bVar, cVar2, fNextDouble, zNextBoolean);
    }
}
