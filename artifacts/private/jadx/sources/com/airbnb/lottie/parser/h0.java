package com.airbnb.lottie.parser;

import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class h0 implements n0<com.airbnb.lottie.model.content.o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f88664a = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88665b = com.airbnb.lottie.parser.moshi.c.a.a("c", "v", androidx.media3.exoplayer.upstream.h.f65997k, "o");

    private h0() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.model.content.o a(com.airbnb.lottie.parser.moshi.c cVar, float f10) throws IOException {
        if (cVar.c() == com.airbnb.lottie.parser.moshi.c.b.BEGIN_ARRAY) {
            cVar.J0();
        }
        cVar.m1();
        List<PointF> listF = null;
        List<PointF> listF2 = null;
        List<PointF> listF3 = null;
        boolean zNextBoolean = false;
        while (cVar.hasNext()) {
            int iE = cVar.e(f88665b);
            if (iE == 0) {
                zNextBoolean = cVar.nextBoolean();
            } else if (iE == 1) {
                listF = s.f(cVar, f10);
            } else if (iE == 2) {
                listF2 = s.f(cVar, f10);
            } else if (iE != 3) {
                cVar.f();
                cVar.a9();
            } else {
                listF3 = s.f(cVar, f10);
            }
        }
        cVar.F1();
        if (cVar.c() == com.airbnb.lottie.parser.moshi.c.b.END_ARRAY) {
            cVar.F0();
        }
        if (listF == null || listF2 == null || listF3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listF.isEmpty()) {
            return new com.airbnb.lottie.model.content.o(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = listF.size();
        PointF pointF = listF.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 1; i10 < size; i10++) {
            PointF pointF2 = listF.get(i10);
            int i11 = i10 - 1;
            arrayList.add(new com.airbnb.lottie.model.a(com.airbnb.lottie.utils.i.a(listF.get(i11), listF3.get(i11)), com.airbnb.lottie.utils.i.a(pointF2, listF2.get(i10)), pointF2));
        }
        if (zNextBoolean) {
            PointF pointF3 = listF.get(0);
            int i12 = size - 1;
            arrayList.add(new com.airbnb.lottie.model.a(com.airbnb.lottie.utils.i.a(listF.get(i12), listF3.get(i12)), com.airbnb.lottie.utils.i.a(pointF3, listF2.get(0)), pointF3));
        }
        return new com.airbnb.lottie.model.content.o(pointF, zNextBoolean, arrayList);
    }
}
