package com.airbnb.lottie.utils;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.x;
import com.airbnb.lottie.model.content.o;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final PointF f88855a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static double b(double d10, double d11, double d12) {
        return Math.max(d11, Math.min(d12, d10));
    }

    public static float c(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static int d(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i12, i10));
    }

    public static boolean e(float f10, float f11, float f12) {
        return f10 >= f11 && f10 <= f12;
    }

    private static int f(int i10, int i11) {
        int i12 = i10 / i11;
        boolean z10 = (i10 ^ i11) >= 0;
        int i13 = i10 % i11;
        if (!z10 && i13 != 0) {
            i12--;
        }
        return i12;
    }

    static int g(float f10, float f11) {
        return h((int) f10, (int) f11);
    }

    private static int h(int i10, int i11) {
        return i10 - (i11 * f(i10, i11));
    }

    public static void i(o oVar, Path path) {
        Path path2;
        path.reset();
        PointF pointFB = oVar.b();
        path.moveTo(pointFB.x, pointFB.y);
        f88855a.set(pointFB.x, pointFB.y);
        int i10 = 0;
        while (i10 < oVar.a().size()) {
            com.airbnb.lottie.model.a aVar = oVar.a().get(i10);
            PointF pointFA = aVar.a();
            PointF pointFB2 = aVar.b();
            PointF pointFC = aVar.c();
            PointF pointF = f88855a;
            if (pointFA.equals(pointF) && pointFB2.equals(pointFC)) {
                path.lineTo(pointFC.x, pointFC.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointFA.x, pointFA.y, pointFB2.x, pointFB2.y, pointFC.x, pointFC.y);
            }
            pointF.set(pointFC.x, pointFC.y);
            i10++;
            path = path2;
        }
        Path path3 = path;
        if (oVar.d()) {
            path3.close();
        }
    }

    public static double j(double d10, double d11, @x(from = 0.0d, to = 1.0d) double d12) {
        return d10 + (d12 * (d11 - d10));
    }

    public static float k(float f10, float f11, @x(from = 0.0d, to = 1.0d) float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    public static int l(int i10, int i11, @x(from = 0.0d, to = 1.0d) float f10) {
        return (int) (i10 + (f10 * (i11 - i10)));
    }

    public static void m(com.airbnb.lottie.model.e eVar, int i10, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2, com.airbnb.lottie.animation.content.k kVar) {
        if (eVar.c(kVar.getName(), i10)) {
            list.add(eVar2.a(kVar.getName()).j(kVar));
        }
    }
}
