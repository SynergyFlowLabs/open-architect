package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.Rect;
import com.devtodev.core.data.metrics.MetricConsts;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88800a = com.airbnb.lottie.parser.moshi.c.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", androidx.media3.exoplayer.upstream.h.f65993g, MetricConsts.InGamePurchase, "op", "tm", "cl", "hd", "ao", "bm");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88801b = com.airbnb.lottie.parser.moshi.c.a.a("d", androidx.media3.exoplayer.upstream.h.f65998l);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88802c = com.airbnb.lottie.parser.moshi.c.a.a("ty", "nm");

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88803a;

        static {
            int[] iArr = new int[com.airbnb.lottie.model.layer.e.b.values().length];
            f88803a = iArr;
            try {
                iArr[com.airbnb.lottie.model.layer.e.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88803a[com.airbnb.lottie.model.layer.e.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private v() {
    }

    public static com.airbnb.lottie.model.layer.e a(com.airbnb.lottie.k kVar) {
        Rect rectB = kVar.b();
        List list = Collections.EMPTY_LIST;
        return new com.airbnb.lottie.model.layer.e(list, kVar, "__container", -1L, com.airbnb.lottie.model.layer.e.a.PRE_COMP, -1L, null, list, new com.airbnb.lottie.model.animatable.l(), 0, 0, 0, 0.0f, 0.0f, rectB.width(), rectB.height(), null, null, list, com.airbnb.lottie.model.layer.e.b.NONE, null, false, null, null, com.airbnb.lottie.model.content.h.NORMAL);
    }

    public static com.airbnb.lottie.model.layer.e b(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        float f10;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        com.airbnb.lottie.model.layer.e.b bVar = com.airbnb.lottie.model.layer.e.b.NONE;
        com.airbnb.lottie.model.content.h hVar = com.airbnb.lottie.model.content.h.NORMAL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        cVar.m1();
        boolean z10 = false;
        com.airbnb.lottie.model.layer.e.b bVar2 = bVar;
        com.airbnb.lottie.model.content.h hVar2 = hVar;
        float fNextDouble = 0.0f;
        float f11 = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        String strJc = null;
        com.airbnb.lottie.model.animatable.j jVarD = null;
        com.airbnb.lottie.model.animatable.k kVarA = null;
        com.airbnb.lottie.model.animatable.b bVarF = null;
        com.airbnb.lottie.model.content.a aVarB = null;
        j jVarB = null;
        long jNextInt = 0;
        int iNextInt = 0;
        int iNextInt2 = 0;
        int color = 0;
        boolean zNextBoolean = false;
        long jNextInt2 = -1;
        float fNextDouble5 = 1.0f;
        String strJc2 = "UNSET";
        String strJc3 = null;
        com.airbnb.lottie.model.animatable.l lVar = null;
        com.airbnb.lottie.model.layer.e.a aVar = null;
        boolean z11 = false;
        while (cVar.hasNext()) {
            switch (cVar.e(f88800a)) {
                case 0:
                    strJc2 = cVar.jc();
                    z10 = false;
                    break;
                case 1:
                    jNextInt = cVar.nextInt();
                    z10 = false;
                    break;
                case 2:
                    strJc = cVar.jc();
                    z10 = false;
                    break;
                case 3:
                    f10 = fNextDouble5;
                    int iNextInt3 = cVar.nextInt();
                    aVar = com.airbnb.lottie.model.layer.e.a.UNKNOWN;
                    if (iNextInt3 < aVar.ordinal()) {
                        aVar = com.airbnb.lottie.model.layer.e.a.values()[iNextInt3];
                    }
                    fNextDouble5 = f10;
                    z10 = false;
                    break;
                case 4:
                    jNextInt2 = cVar.nextInt();
                    z10 = false;
                    break;
                case 5:
                    iNextInt = (int) (cVar.nextInt() * com.airbnb.lottie.utils.j.e());
                    z10 = false;
                    break;
                case 6:
                    iNextInt2 = (int) (cVar.nextInt() * com.airbnb.lottie.utils.j.e());
                    z10 = false;
                    break;
                case 7:
                    color = Color.parseColor(cVar.jc());
                    z10 = false;
                    break;
                case 8:
                    lVar = c.g(cVar, kVar);
                    z10 = false;
                    break;
                case 9:
                    f10 = fNextDouble5;
                    int iNextInt4 = cVar.nextInt();
                    if (iNextInt4 >= com.airbnb.lottie.model.layer.e.b.values().length) {
                        kVar.a("Unsupported matte type: " + iNextInt4);
                    } else {
                        bVar2 = com.airbnb.lottie.model.layer.e.b.values()[iNextInt4];
                        int i10 = a.f88803a[bVar2.ordinal()];
                        if (i10 == 1) {
                            kVar.a("Unsupported matte type: Luma");
                        } else if (i10 == 2) {
                            kVar.a("Unsupported matte type: Luma Inverted");
                        }
                        kVar.v(1);
                    }
                    fNextDouble5 = f10;
                    z10 = false;
                    break;
                case 10:
                    f10 = fNextDouble5;
                    cVar.J0();
                    while (cVar.hasNext()) {
                        arrayList.add(x.a(cVar, kVar));
                    }
                    kVar.v(arrayList.size());
                    cVar.F0();
                    fNextDouble5 = f10;
                    z10 = false;
                    break;
                case 11:
                    f10 = fNextDouble5;
                    cVar.J0();
                    while (cVar.hasNext()) {
                        com.airbnb.lottie.model.content.c cVarA = h.a(cVar, kVar);
                        if (cVarA != null) {
                            arrayList2.add(cVarA);
                        }
                    }
                    cVar.F0();
                    fNextDouble5 = f10;
                    z10 = false;
                    break;
                case 12:
                    f10 = fNextDouble5;
                    cVar.m1();
                    while (cVar.hasNext()) {
                        int iE = cVar.e(f88801b);
                        if (iE == 0) {
                            jVarD = d.d(cVar, kVar);
                        } else if (iE != 1) {
                            cVar.f();
                            cVar.a9();
                        } else {
                            cVar.J0();
                            if (cVar.hasNext()) {
                                kVarA = b.a(cVar, kVar);
                            }
                            while (cVar.hasNext()) {
                                cVar.a9();
                            }
                            cVar.F0();
                        }
                    }
                    cVar.F1();
                    fNextDouble5 = f10;
                    z10 = false;
                    break;
                case 13:
                    f10 = fNextDouble5;
                    cVar.J0();
                    ArrayList arrayList3 = new ArrayList();
                    while (cVar.hasNext()) {
                        cVar.m1();
                        while (cVar.hasNext()) {
                            int iE2 = cVar.e(f88802c);
                            if (iE2 == 0) {
                                int iNextInt5 = cVar.nextInt();
                                if (iNextInt5 == 29) {
                                    aVarB = e.b(cVar, kVar);
                                } else if (iNextInt5 == 25) {
                                    jVarB = new k().b(cVar, kVar);
                                }
                            } else if (iE2 != 1) {
                                cVar.f();
                                cVar.a9();
                            } else {
                                arrayList3.add(cVar.jc());
                            }
                        }
                        cVar.F1();
                    }
                    cVar.F0();
                    kVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    fNextDouble5 = f10;
                    z10 = false;
                    break;
                case 14:
                    fNextDouble5 = (float) cVar.nextDouble();
                    z10 = false;
                    break;
                case 15:
                    fNextDouble4 = (float) cVar.nextDouble();
                    z10 = false;
                    break;
                case 16:
                    f10 = fNextDouble5;
                    fNextDouble2 = (float) (cVar.nextDouble() * ((double) com.airbnb.lottie.utils.j.e()));
                    fNextDouble5 = f10;
                    z10 = false;
                    break;
                case 17:
                    f10 = fNextDouble5;
                    fNextDouble3 = (float) (cVar.nextDouble() * ((double) com.airbnb.lottie.utils.j.e()));
                    fNextDouble5 = f10;
                    z10 = false;
                    break;
                case 18:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 19:
                    f11 = (float) cVar.nextDouble();
                    break;
                case 20:
                    bVarF = d.f(cVar, kVar, z10);
                    break;
                case 21:
                    strJc3 = cVar.jc();
                    break;
                case 22:
                    zNextBoolean = cVar.nextBoolean();
                    break;
                case 23:
                    z11 = cVar.nextInt() != 1 ? z10 : true;
                    break;
                case 24:
                    int iNextInt6 = cVar.nextInt();
                    if (iNextInt6 < com.airbnb.lottie.model.content.h.values().length) {
                        hVar2 = com.airbnb.lottie.model.content.h.values()[iNextInt6];
                    } else {
                        kVar.a("Unsupported Blend Mode: " + iNextInt6);
                        hVar2 = com.airbnb.lottie.model.content.h.NORMAL;
                    }
                    break;
                default:
                    cVar.f();
                    cVar.a9();
                    f10 = fNextDouble5;
                    fNextDouble5 = f10;
                    z10 = false;
                    break;
            }
        }
        float f12 = fNextDouble5;
        cVar.F1();
        ArrayList arrayList4 = new ArrayList();
        if (fNextDouble > 0.0f) {
            arrayList4.add(new com.airbnb.lottie.value.a(kVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(fNextDouble)));
        }
        if (f11 <= 0.0f) {
            f11 = kVar.f();
        }
        arrayList4.add(new com.airbnb.lottie.value.a(kVar, fValueOf2, fValueOf2, null, fNextDouble, Float.valueOf(f11)));
        arrayList4.add(new com.airbnb.lottie.value.a(kVar, fValueOf, fValueOf, null, f11, Float.valueOf(Float.MAX_VALUE)));
        if (strJc2.endsWith(".ai") || MetricConsts.ApplicationInfo.equals(strJc3)) {
            kVar.a("Convert your Illustrator layers to shape layers.");
        }
        if (z11 != 0) {
            if (lVar == null) {
                lVar = new com.airbnb.lottie.model.animatable.l();
            }
            lVar.m(z11);
        }
        return new com.airbnb.lottie.model.layer.e(arrayList2, kVar, strJc2, jNextInt, aVar, jNextInt2, strJc, arrayList, lVar, iNextInt, iNextInt2, color, f12, fNextDouble4, fNextDouble2, fNextDouble3, jVarD, kVarA, arrayList4, bVar2, bVarF, zNextBoolean, aVarB, jVarB, hVar2);
    }
}
