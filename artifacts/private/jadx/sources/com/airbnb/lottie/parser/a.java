package com.airbnb.lottie.parser;

import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88647a = com.airbnb.lottie.parser.moshi.c.a.a("k", "x", "y");

    private a() {
    }

    public static com.airbnb.lottie.model.animatable.e a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (cVar.c() == com.airbnb.lottie.parser.moshi.c.b.BEGIN_ARRAY) {
            cVar.J0();
            while (cVar.hasNext()) {
                arrayList.add(z.a(cVar, kVar));
            }
            cVar.F0();
            u.b(arrayList);
        } else {
            arrayList.add(new com.airbnb.lottie.value.a(s.e(cVar, com.airbnb.lottie.utils.j.e())));
        }
        return new com.airbnb.lottie.model.animatable.e(arrayList);
    }

    static com.airbnb.lottie.model.animatable.m<PointF, PointF> b(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        cVar.m1();
        com.airbnb.lottie.model.animatable.e eVarA = null;
        com.airbnb.lottie.model.animatable.b bVarE = null;
        boolean z10 = false;
        com.airbnb.lottie.model.animatable.b bVarE2 = null;
        while (cVar.c() != com.airbnb.lottie.parser.moshi.c.b.END_OBJECT) {
            int iE = cVar.e(f88647a);
            if (iE == 0) {
                eVarA = a(cVar, kVar);
            } else if (iE != 1) {
                if (iE != 2) {
                    cVar.f();
                    cVar.a9();
                } else if (cVar.c() == com.airbnb.lottie.parser.moshi.c.b.STRING) {
                    cVar.a9();
                    z10 = true;
                } else {
                    bVarE = d.e(cVar, kVar);
                }
            } else if (cVar.c() == com.airbnb.lottie.parser.moshi.c.b.STRING) {
                cVar.a9();
                z10 = true;
            } else {
                bVarE2 = d.e(cVar, kVar);
            }
        }
        cVar.F1();
        if (z10) {
            kVar.a("Lottie doesn't support expressions.");
        }
        return eVarA != null ? eVarA : new com.airbnb.lottie.model.animatable.i(bVarE2, bVarE);
    }
}
