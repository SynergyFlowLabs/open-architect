package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88792a = com.airbnb.lottie.parser.moshi.c.a.a("x", "y");

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88793a;

        static {
            int[] iArr = new int[com.airbnb.lottie.parser.moshi.c.b.values().length];
            f88793a = iArr;
            try {
                iArr[com.airbnb.lottie.parser.moshi.c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88793a[com.airbnb.lottie.parser.moshi.c.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88793a[com.airbnb.lottie.parser.moshi.c.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private s() {
    }

    private static PointF a(com.airbnb.lottie.parser.moshi.c cVar, float f10) throws IOException {
        cVar.J0();
        float fNextDouble = (float) cVar.nextDouble();
        float fNextDouble2 = (float) cVar.nextDouble();
        while (cVar.c() != com.airbnb.lottie.parser.moshi.c.b.END_ARRAY) {
            cVar.a9();
        }
        cVar.F0();
        return new PointF(fNextDouble * f10, fNextDouble2 * f10);
    }

    private static PointF b(com.airbnb.lottie.parser.moshi.c cVar, float f10) throws IOException {
        float fNextDouble = (float) cVar.nextDouble();
        float fNextDouble2 = (float) cVar.nextDouble();
        while (cVar.hasNext()) {
            cVar.a9();
        }
        return new PointF(fNextDouble * f10, fNextDouble2 * f10);
    }

    private static PointF c(com.airbnb.lottie.parser.moshi.c cVar, float f10) throws IOException {
        cVar.m1();
        float fG = 0.0f;
        float fG2 = 0.0f;
        while (cVar.hasNext()) {
            int iE = cVar.e(f88792a);
            if (iE == 0) {
                fG = g(cVar);
            } else if (iE != 1) {
                cVar.f();
                cVar.a9();
            } else {
                fG2 = g(cVar);
            }
        }
        cVar.F1();
        return new PointF(fG * f10, fG2 * f10);
    }

    @androidx.annotation.l
    static int d(com.airbnb.lottie.parser.moshi.c cVar) throws IOException {
        cVar.J0();
        int iNextDouble = (int) (cVar.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (cVar.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (cVar.nextDouble() * 255.0d);
        while (cVar.hasNext()) {
            cVar.a9();
        }
        cVar.F0();
        return Color.argb(255, iNextDouble, iNextDouble2, iNextDouble3);
    }

    static PointF e(com.airbnb.lottie.parser.moshi.c cVar, float f10) throws IOException {
        int i10 = a.f88793a[cVar.c().ordinal()];
        if (i10 == 1) {
            return b(cVar, f10);
        }
        if (i10 == 2) {
            return a(cVar, f10);
        }
        if (i10 == 3) {
            return c(cVar, f10);
        }
        throw new IllegalArgumentException("Unknown point starts with " + cVar.c());
    }

    static List<PointF> f(com.airbnb.lottie.parser.moshi.c cVar, float f10) throws IOException {
        ArrayList arrayList = new ArrayList();
        cVar.J0();
        while (cVar.c() == com.airbnb.lottie.parser.moshi.c.b.BEGIN_ARRAY) {
            cVar.J0();
            arrayList.add(e(cVar, f10));
            cVar.F0();
        }
        cVar.F0();
        return arrayList;
    }

    static float g(com.airbnb.lottie.parser.moshi.c cVar) throws IOException {
        com.airbnb.lottie.parser.moshi.c.b bVarC = cVar.c();
        int i10 = a.f88793a[bVarC.ordinal()];
        if (i10 == 1) {
            return (float) cVar.nextDouble();
        }
        if (i10 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + bVarC);
        }
        cVar.J0();
        float fNextDouble = (float) cVar.nextDouble();
        while (cVar.hasNext()) {
            cVar.a9();
        }
        cVar.F0();
        return fNextDouble;
    }
}
