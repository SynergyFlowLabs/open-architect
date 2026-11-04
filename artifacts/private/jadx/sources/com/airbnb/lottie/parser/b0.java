package com.airbnb.lottie.parser;

import android.graphics.PointF;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class b0 implements n0<PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f88651a = new b0();

    private b0() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(com.airbnb.lottie.parser.moshi.c cVar, float f10) throws IOException {
        com.airbnb.lottie.parser.moshi.c.b bVarC = cVar.c();
        if (bVarC != com.airbnb.lottie.parser.moshi.c.b.BEGIN_ARRAY && bVarC != com.airbnb.lottie.parser.moshi.c.b.BEGIN_OBJECT) {
            if (bVarC == com.airbnb.lottie.parser.moshi.c.b.NUMBER) {
                PointF pointF = new PointF(((float) cVar.nextDouble()) * f10, ((float) cVar.nextDouble()) * f10);
                while (cVar.hasNext()) {
                    cVar.a9();
                }
                return pointF;
            }
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + bVarC);
        }
        return s.e(cVar, f10);
    }
}
