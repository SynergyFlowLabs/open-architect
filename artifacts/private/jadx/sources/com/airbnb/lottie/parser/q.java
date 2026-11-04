package com.airbnb.lottie.parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88788a = com.airbnb.lottie.parser.moshi.c.a.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88789b = com.airbnb.lottie.parser.moshi.c.a.a("p", "k");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88790c = com.airbnb.lottie.parser.moshi.c.a.a("n", "v");

    private q() {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0030. Please report as an issue. */
    static com.airbnb.lottie.model.content.f a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        com.airbnb.lottie.model.animatable.d dVar;
        ArrayList arrayList = new ArrayList();
        com.airbnb.lottie.model.content.g gVar = null;
        String strJc = null;
        com.airbnb.lottie.model.animatable.c cVarG = null;
        com.airbnb.lottie.model.animatable.f fVarI = null;
        com.airbnb.lottie.model.animatable.f fVarI2 = null;
        com.airbnb.lottie.model.animatable.b bVarE = null;
        com.airbnb.lottie.model.content.s.b bVar = null;
        com.airbnb.lottie.model.content.s.c cVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        float fNextDouble = 0.0f;
        boolean zNextBoolean = false;
        com.airbnb.lottie.model.animatable.d dVarH = null;
        while (cVar.hasNext()) {
            com.airbnb.lottie.model.content.g gVar2 = gVar;
            switch (cVar.e(f88788a)) {
                case 0:
                    strJc = cVar.jc();
                    gVar = gVar2;
                    break;
                case 1:
                    dVar = dVarH;
                    cVar.m1();
                    int iNextInt = -1;
                    while (cVar.hasNext()) {
                        int iE = cVar.e(f88789b);
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
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                case 2:
                    dVarH = d.h(cVar, kVar);
                    gVar = gVar2;
                    break;
                case 3:
                    dVar = dVarH;
                    gVar = cVar.nextInt() == 1 ? com.airbnb.lottie.model.content.g.LINEAR : com.airbnb.lottie.model.content.g.RADIAL;
                    dVarH = dVar;
                    break;
                case 4:
                    fVarI = d.i(cVar, kVar);
                    gVar = gVar2;
                    break;
                case 5:
                    fVarI2 = d.i(cVar, kVar);
                    gVar = gVar2;
                    break;
                case 6:
                    bVarE = d.e(cVar, kVar);
                    gVar = gVar2;
                    break;
                case 7:
                    dVar = dVarH;
                    bVar = com.airbnb.lottie.model.content.s.b.values()[cVar.nextInt() - 1];
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                case 8:
                    dVar = dVarH;
                    cVar2 = com.airbnb.lottie.model.content.s.c.values()[cVar.nextInt() - 1];
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                case 9:
                    dVar = dVarH;
                    fNextDouble = (float) cVar.nextDouble();
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                case 10:
                    zNextBoolean = cVar.nextBoolean();
                    gVar = gVar2;
                    break;
                case 11:
                    cVar.J0();
                    while (cVar.hasNext()) {
                        cVar.m1();
                        String strJc2 = null;
                        com.airbnb.lottie.model.animatable.b bVarE2 = null;
                        while (cVar.hasNext()) {
                            int iE2 = cVar.e(f88790c);
                            if (iE2 != 0) {
                                com.airbnb.lottie.model.animatable.d dVar2 = dVarH;
                                if (iE2 != 1) {
                                    cVar.f();
                                    cVar.a9();
                                } else {
                                    bVarE2 = d.e(cVar, kVar);
                                }
                                dVarH = dVar2;
                            } else {
                                strJc2 = cVar.jc();
                            }
                        }
                        com.airbnb.lottie.model.animatable.d dVar3 = dVarH;
                        cVar.F1();
                        if (strJc2.equals("o")) {
                            bVar2 = bVarE2;
                        } else {
                            if (strJc2.equals("d") || strJc2.equals("g")) {
                                kVar.y(true);
                                arrayList.add(bVarE2);
                            }
                            dVarH = dVar3;
                        }
                        dVarH = dVar3;
                    }
                    dVar = dVarH;
                    cVar.F0();
                    if (arrayList.size() == 1) {
                        arrayList.add((com.airbnb.lottie.model.animatable.b) arrayList.get(0));
                    }
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                default:
                    cVar.f();
                    cVar.a9();
                    gVar = gVar2;
                    break;
            }
        }
        com.airbnb.lottie.model.animatable.d dVar4 = dVarH;
        return new com.airbnb.lottie.model.content.f(strJc, gVar, cVarG, dVar4 == null ? new com.airbnb.lottie.model.animatable.d(Collections.singletonList(new com.airbnb.lottie.value.a(100))) : dVar4, fVarI, fVarI2, bVarE, bVar, cVar2, fNextDouble, arrayList, bVar2, zNextBoolean);
    }
}
