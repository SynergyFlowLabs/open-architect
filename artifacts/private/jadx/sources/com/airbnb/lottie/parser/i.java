package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.devtodev.core.data.consts.RequestParams;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class i implements n0<com.airbnb.lottie.model.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f88666a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.airbnb.lottie.parser.moshi.c.a f88667b = com.airbnb.lottie.parser.moshi.c.a.a("t", RequestParams.F, "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    private i() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.model.b a(com.airbnb.lottie.parser.moshi.c cVar, float f10) throws IOException {
        com.airbnb.lottie.model.b.a aVar = com.airbnb.lottie.model.b.a.CENTER;
        cVar.m1();
        com.airbnb.lottie.model.b.a aVar2 = aVar;
        String strJc = null;
        String strJc2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iD = 0;
        int iD2 = 0;
        boolean zNextBoolean = true;
        while (cVar.hasNext()) {
            switch (cVar.e(f88667b)) {
                case 0:
                    strJc = cVar.jc();
                    break;
                case 1:
                    strJc2 = cVar.jc();
                    break;
                case 2:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 3:
                    int iNextInt2 = cVar.nextInt();
                    aVar2 = com.airbnb.lottie.model.b.a.CENTER;
                    if (iNextInt2 <= aVar2.ordinal() && iNextInt2 >= 0) {
                        aVar2 = com.airbnb.lottie.model.b.a.values()[iNextInt2];
                    }
                    break;
                case 4:
                    iNextInt = cVar.nextInt();
                    break;
                case 5:
                    fNextDouble2 = (float) cVar.nextDouble();
                    break;
                case 6:
                    fNextDouble3 = (float) cVar.nextDouble();
                    break;
                case 7:
                    iD = s.d(cVar);
                    break;
                case 8:
                    iD2 = s.d(cVar);
                    break;
                case 9:
                    fNextDouble4 = (float) cVar.nextDouble();
                    break;
                case 10:
                    zNextBoolean = cVar.nextBoolean();
                    break;
                case 11:
                    cVar.J0();
                    PointF pointF3 = new PointF(((float) cVar.nextDouble()) * f10, ((float) cVar.nextDouble()) * f10);
                    cVar.F0();
                    pointF = pointF3;
                    break;
                case 12:
                    cVar.J0();
                    PointF pointF4 = new PointF(((float) cVar.nextDouble()) * f10, ((float) cVar.nextDouble()) * f10);
                    cVar.F0();
                    pointF2 = pointF4;
                    break;
                default:
                    cVar.f();
                    cVar.a9();
                    break;
            }
        }
        cVar.F1();
        return new com.airbnb.lottie.model.b(strJc, strJc2, fNextDouble, aVar2, iNextInt, fNextDouble2, fNextDouble3, iD, iD2, fNextDouble4, zNextBoolean, pointF, pointF2);
    }
}
