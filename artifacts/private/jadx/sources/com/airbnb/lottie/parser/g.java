package com.airbnb.lottie.parser;

import android.graphics.Color;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class g implements n0<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f88661a = new g();

    private g() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(com.airbnb.lottie.parser.moshi.c cVar, float f10) throws IOException {
        boolean z10 = cVar.c() == com.airbnb.lottie.parser.moshi.c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.J0();
        }
        double dNextDouble = cVar.nextDouble();
        double dNextDouble2 = cVar.nextDouble();
        double dNextDouble3 = cVar.nextDouble();
        double dNextDouble4 = cVar.c() == com.airbnb.lottie.parser.moshi.c.b.NUMBER ? cVar.nextDouble() : 1.0d;
        if (z10) {
            cVar.F0();
        }
        if (dNextDouble <= 1.0d && dNextDouble2 <= 1.0d && dNextDouble3 <= 1.0d) {
            dNextDouble *= 255.0d;
            dNextDouble2 *= 255.0d;
            dNextDouble3 *= 255.0d;
            if (dNextDouble4 <= 1.0d) {
                dNextDouble4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dNextDouble4, (int) dNextDouble, (int) dNextDouble2, (int) dNextDouble3));
    }
}
