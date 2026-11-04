package com.airbnb.lottie.parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static com.airbnb.lottie.parser.moshi.c.a f88799a = com.airbnb.lottie.parser.moshi.c.a.a("k");

    private u() {
    }

    static <T> List<com.airbnb.lottie.value.a<T>> a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, float f10, n0<T> n0Var, boolean z10) throws IOException {
        com.airbnb.lottie.parser.moshi.c cVar2;
        com.airbnb.lottie.k kVar2;
        float f11;
        n0<T> n0Var2;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        if (cVar.c() == com.airbnb.lottie.parser.moshi.c.b.STRING) {
            kVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.m1();
        while (cVar.hasNext()) {
            if (cVar.e(f88799a) != 0) {
                cVar.a9();
            } else if (cVar.c() == com.airbnb.lottie.parser.moshi.c.b.BEGIN_ARRAY) {
                cVar.J0();
                if (cVar.c() == com.airbnb.lottie.parser.moshi.c.b.NUMBER) {
                    com.airbnb.lottie.parser.moshi.c cVar3 = cVar;
                    com.airbnb.lottie.k kVar3 = kVar;
                    float f12 = f10;
                    n0<T> n0Var3 = n0Var;
                    boolean z12 = z10;
                    com.airbnb.lottie.value.a aVarC = t.c(cVar3, kVar3, f12, n0Var3, false, z12);
                    cVar2 = cVar3;
                    kVar2 = kVar3;
                    f11 = f12;
                    n0Var2 = n0Var3;
                    z11 = z12;
                    arrayList.add(aVarC);
                } else {
                    cVar2 = cVar;
                    kVar2 = kVar;
                    f11 = f10;
                    n0Var2 = n0Var;
                    z11 = z10;
                    while (cVar2.hasNext()) {
                        arrayList.add(t.c(cVar2, kVar2, f11, n0Var2, true, z11));
                    }
                }
                cVar2.F0();
                cVar = cVar2;
                kVar = kVar2;
                f10 = f11;
                n0Var = n0Var2;
                z10 = z11;
            } else {
                com.airbnb.lottie.parser.moshi.c cVar4 = cVar;
                arrayList.add(t.c(cVar4, kVar, f10, n0Var, false, z10));
                cVar = cVar4;
            }
        }
        cVar.F1();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends com.airbnb.lottie.value.a<T>> list) {
        int i10;
        T t10;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            com.airbnb.lottie.value.a<T> aVar = list.get(i11);
            i11++;
            com.airbnb.lottie.value.a<T> aVar2 = list.get(i11);
            aVar.f88875h = Float.valueOf(aVar2.f88874g);
            if (aVar.f88870c == null && (t10 = aVar2.f88869b) != null) {
                aVar.f88870c = t10;
                if (aVar instanceof com.airbnb.lottie.animation.keyframe.i) {
                    ((com.airbnb.lottie.animation.keyframe.i) aVar).j();
                }
            }
        }
        com.airbnb.lottie.value.a<T> aVar3 = list.get(i10);
        if ((aVar3.f88869b == null || aVar3.f88870c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
