package com.airbnb.lottie.parser;

import android.graphics.Rect;
import androidx.collection.b1;
import androidx.collection.j3;
import com.airbnb.lottie.x0;
import com.devtodev.core.data.metrics.MetricConsts;
import io.intercom.android.sdk.models.AttributeType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88804a = com.airbnb.lottie.parser.moshi.c.a.a("w", androidx.media3.exoplayer.upstream.h.f65993g, MetricConsts.InGamePurchase, "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static com.airbnb.lottie.parser.moshi.c.a f88805b = com.airbnb.lottie.parser.moshi.c.a.a("id", "layers", "w", androidx.media3.exoplayer.upstream.h.f65993g, "p", "u");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88806c = com.airbnb.lottie.parser.moshi.c.a.a(AttributeType.LIST);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88807d = com.airbnb.lottie.parser.moshi.c.a.a("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0046. Please report as an issue. */
    public static com.airbnb.lottie.k a(com.airbnb.lottie.parser.moshi.c cVar) throws IOException {
        cVar = cVar;
        float fE = com.airbnb.lottie.utils.j.e();
        b1<com.airbnb.lottie.model.layer.e> b1Var = new b1<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        j3<com.airbnb.lottie.model.d> j3Var = new j3<>();
        com.airbnb.lottie.k kVar = new com.airbnb.lottie.k();
        cVar.m1();
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        int iNextInt = 0;
        int iNextInt2 = 0;
        while (cVar.hasNext()) {
            switch (cVar.e(f88804a)) {
                case 0:
                    iNextInt = cVar.nextInt();
                    break;
                case 1:
                    iNextInt2 = cVar.nextInt();
                    break;
                case 2:
                    fNextDouble = (float) cVar.nextDouble();
                    fE = fE;
                    break;
                case 3:
                    fNextDouble2 = ((float) cVar.nextDouble()) - 0.01f;
                    fE = fE;
                    break;
                case 4:
                    fNextDouble3 = (float) cVar.nextDouble();
                    fE = fE;
                    break;
                case 5:
                    String[] strArrSplit = cVar.jc().split("\\.");
                    if (!com.airbnb.lottie.utils.j.j(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        kVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    break;
                case 6:
                    e(cVar, kVar, arrayList, b1Var);
                    break;
                case 7:
                    b(cVar, kVar, map, map2);
                    break;
                case 8:
                    d(cVar, map3);
                    break;
                case 9:
                    c(cVar, kVar, j3Var);
                    break;
                case 10:
                    f(cVar, arrayList2);
                    break;
                default:
                    cVar.f();
                    cVar.a9();
                    break;
            }
        }
        float f10 = fE;
        kVar.w(new Rect(0, 0, (int) (iNextInt * f10), (int) (iNextInt2 * f10)), fNextDouble, fNextDouble2, fNextDouble3, arrayList, b1Var, map, map2, com.airbnb.lottie.utils.j.e(), j3Var, map3, arrayList2);
        return kVar;
    }

    private static void b(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, Map<String, List<com.airbnb.lottie.model.layer.e>> map, Map<String, x0> map2) throws IOException {
        cVar.J0();
        while (cVar.hasNext()) {
            ArrayList arrayList = new ArrayList();
            b1 b1Var = new b1();
            cVar.m1();
            int iNextInt = 0;
            int iNextInt2 = 0;
            String strJc = null;
            String strJc2 = null;
            String strJc3 = null;
            while (cVar.hasNext()) {
                int iE = cVar.e(f88805b);
                if (iE == 0) {
                    strJc = cVar.jc();
                } else if (iE == 1) {
                    cVar.J0();
                    while (cVar.hasNext()) {
                        com.airbnb.lottie.model.layer.e eVarB = v.b(cVar, kVar);
                        b1Var.n(eVarB.e(), eVarB);
                        arrayList.add(eVarB);
                    }
                    cVar.F0();
                } else if (iE == 2) {
                    iNextInt = cVar.nextInt();
                } else if (iE == 3) {
                    iNextInt2 = cVar.nextInt();
                } else if (iE == 4) {
                    strJc2 = cVar.jc();
                } else if (iE != 5) {
                    cVar.f();
                    cVar.a9();
                } else {
                    strJc3 = cVar.jc();
                }
            }
            cVar.F1();
            if (strJc2 != null) {
                x0 x0Var = new x0(iNextInt, iNextInt2, strJc, strJc2, strJc3);
                map2.put(x0Var.f(), x0Var);
            } else {
                map.put(strJc, arrayList);
            }
        }
        cVar.F0();
    }

    private static void c(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, j3<com.airbnb.lottie.model.d> j3Var) throws IOException {
        cVar.J0();
        while (cVar.hasNext()) {
            com.airbnb.lottie.model.d dVarA = m.a(cVar, kVar);
            j3Var.o(dVarA.hashCode(), dVarA);
        }
        cVar.F0();
    }

    private static void d(com.airbnb.lottie.parser.moshi.c cVar, Map<String, com.airbnb.lottie.model.c> map) throws IOException {
        cVar.m1();
        while (cVar.hasNext()) {
            if (cVar.e(f88806c) != 0) {
                cVar.f();
                cVar.a9();
            } else {
                cVar.J0();
                while (cVar.hasNext()) {
                    com.airbnb.lottie.model.c cVarA = n.a(cVar);
                    map.put(cVarA.c(), cVarA);
                }
                cVar.F0();
            }
        }
        cVar.F1();
    }

    private static void e(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, List<com.airbnb.lottie.model.layer.e> list, b1<com.airbnb.lottie.model.layer.e> b1Var) throws IOException {
        cVar.J0();
        int i10 = 0;
        while (cVar.hasNext()) {
            com.airbnb.lottie.model.layer.e eVarB = v.b(cVar, kVar);
            if (eVarB.g() == com.airbnb.lottie.model.layer.e.a.IMAGE) {
                i10++;
            }
            list.add(eVarB);
            b1Var.n(eVarB.e(), eVarB);
            if (i10 > 4) {
                com.airbnb.lottie.utils.d.e("You have " + i10 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        cVar.F0();
    }

    private static void f(com.airbnb.lottie.parser.moshi.c cVar, List<com.airbnb.lottie.model.h> list) throws IOException {
        cVar.J0();
        while (cVar.hasNext()) {
            cVar.m1();
            float fNextDouble = 0.0f;
            String strJc = null;
            float fNextDouble2 = 0.0f;
            while (cVar.hasNext()) {
                int iE = cVar.e(f88807d);
                if (iE != 0) {
                    int i10 = 2 ^ 1;
                    if (iE == 1) {
                        fNextDouble = (float) cVar.nextDouble();
                    } else if (iE != 2) {
                        cVar.f();
                        cVar.a9();
                    } else {
                        fNextDouble2 = (float) cVar.nextDouble();
                    }
                } else {
                    strJc = cVar.jc();
                }
            }
            cVar.F1();
            list.add(new com.airbnb.lottie.model.h(strJc, fNextDouble, fNextDouble2));
        }
        cVar.F0();
    }
}
