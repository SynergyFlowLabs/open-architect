package com.airbnb.lottie.parser;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class g0 implements n0<com.airbnb.lottie.value.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f88662a = new g0();

    private g0() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.value.k a(com.airbnb.lottie.parser.moshi.c cVar, float f10) throws IOException {
        boolean z10 = cVar.c() == com.airbnb.lottie.parser.moshi.c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.J0();
        }
        float fNextDouble = (float) cVar.nextDouble();
        float fNextDouble2 = (float) cVar.nextDouble();
        while (cVar.hasNext()) {
            cVar.a9();
        }
        if (z10) {
            cVar.F0();
        }
        return new com.airbnb.lottie.value.k((fNextDouble / 100.0f) * f10, (fNextDouble2 / 100.0f) * f10);
    }
}
