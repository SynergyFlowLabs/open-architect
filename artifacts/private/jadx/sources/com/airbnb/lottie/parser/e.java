package com.airbnb.lottie.parser;

import androidx.annotation.p0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88656a = com.airbnb.lottie.parser.moshi.c.a.a("ef");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88657b = com.airbnb.lottie.parser.moshi.c.a.a("ty", "v");

    e() {
    }

    @p0
    private static com.airbnb.lottie.model.content.a a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        cVar.m1();
        com.airbnb.lottie.model.content.a aVar = null;
        while (true) {
            boolean z10 = false;
            while (true) {
                if (!cVar.hasNext()) {
                    cVar.F1();
                    return aVar;
                }
                int iE = cVar.e(f88657b);
                if (iE != 0) {
                    if (iE != 1) {
                        cVar.f();
                        cVar.a9();
                    } else if (z10) {
                        aVar = new com.airbnb.lottie.model.content.a(d.e(cVar, kVar));
                    } else {
                        cVar.a9();
                    }
                } else if (cVar.nextInt() == 0) {
                    z10 = true;
                }
            }
        }
    }

    @p0
    static com.airbnb.lottie.model.content.a b(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        com.airbnb.lottie.model.content.a aVar = null;
        while (cVar.hasNext()) {
            if (cVar.e(f88656a) != 0) {
                cVar.f();
                cVar.a9();
            } else {
                cVar.J0();
                while (cVar.hasNext()) {
                    com.airbnb.lottie.model.content.a aVarA = a(cVar, kVar);
                    if (aVarA != null) {
                        aVar = aVarA;
                    }
                }
                cVar.F0();
            }
        }
        return aVar;
    }
}
