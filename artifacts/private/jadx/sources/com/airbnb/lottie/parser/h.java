package com.airbnb.lottie.parser;

import androidx.annotation.p0;
import com.devtodev.core.data.metrics.MetricConsts;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88663a = com.airbnb.lottie.parser.moshi.c.a.a("ty", "d");

    private h() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    @p0
    static com.airbnb.lottie.model.content.c a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        com.airbnb.lottie.model.content.c cVarA;
        String strJc;
        cVar.m1();
        byte b10 = 2;
        int i10 = 4 ^ 2;
        int iNextInt = 2;
        while (true) {
            cVarA = null;
            if (!cVar.hasNext()) {
                strJc = null;
                break;
            }
            int iE = cVar.e(f88663a);
            if (iE == 0) {
                strJc = cVar.jc();
                break;
            }
            if (iE != 1) {
                cVar.f();
                cVar.a9();
            } else {
                iNextInt = cVar.nextInt();
            }
        }
        if (strJc == null) {
            return null;
        }
        switch (strJc.hashCode()) {
            case 3239:
                if (!strJc.equals("el")) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case 3270:
                if (!strJc.equals("fl")) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case 3295:
                if (!strJc.equals("gf")) {
                    b10 = -1;
                }
                break;
            case 3307:
                if (!strJc.equals(MetricConsts.Gender)) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case 3308:
                if (!strJc.equals(MetricConsts.GameSession)) {
                    b10 = -1;
                } else {
                    b10 = 4;
                }
                break;
            case 3488:
                if (!strJc.equals("mm")) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            case 3633:
                if (!strJc.equals("rc")) {
                    b10 = -1;
                } else {
                    b10 = 6;
                }
                break;
            case 3634:
                if (!strJc.equals("rd")) {
                    b10 = -1;
                } else {
                    b10 = 7;
                }
                break;
            case 3646:
                if (!strJc.equals("rp")) {
                    b10 = -1;
                } else {
                    b10 = 8;
                }
                break;
            case 3669:
                if (!strJc.equals("sh")) {
                    b10 = -1;
                } else {
                    b10 = 9;
                }
                break;
            case 3679:
                if (!strJc.equals("sr")) {
                    b10 = -1;
                } else {
                    b10 = 10;
                }
                break;
            case 3681:
                if (!strJc.equals("st")) {
                    b10 = -1;
                } else {
                    b10 = 11;
                }
                break;
            case 3705:
                if (!strJc.equals("tm")) {
                    b10 = -1;
                } else {
                    b10 = com.google.common.base.c.f116461n;
                }
                break;
            case 3710:
                if (!strJc.equals("tr")) {
                    b10 = -1;
                } else {
                    b10 = com.google.common.base.c.f116462o;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                cVarA = f.a(cVar, kVar, iNextInt);
                break;
            case 1:
                cVarA = i0.a(cVar, kVar);
                break;
            case 2:
                cVarA = p.a(cVar, kVar);
                break;
            case 3:
                cVarA = j0.a(cVar, kVar);
                break;
            case 4:
                cVarA = q.a(cVar, kVar);
                break;
            case 5:
                cVarA = y.a(cVar);
                kVar.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                cVarA = d0.a(cVar, kVar);
                break;
            case 7:
                cVarA = f0.a(cVar, kVar);
                break;
            case 8:
                cVarA = e0.a(cVar, kVar);
                break;
            case 9:
                cVarA = k0.a(cVar, kVar);
                break;
            case 10:
                cVarA = c0.a(cVar, kVar, iNextInt);
                break;
            case 11:
                cVarA = l0.a(cVar, kVar);
                break;
            case 12:
                cVarA = m0.a(cVar, kVar);
                break;
            case 13:
                cVarA = c.g(cVar, kVar);
                break;
            default:
                com.airbnb.lottie.utils.d.e("Unknown shape type " + strJc);
                break;
        }
        while (cVar.hasNext()) {
            cVar.a9();
        }
        cVar.F1();
        return cVarA;
    }
}
