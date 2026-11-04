package sk;

import org.apache.commons.lang3.c0;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    public static double a(double d10, double d11) {
        if (Double.isNaN(d10)) {
            return d11;
        }
        return Double.isNaN(d11) ? d10 : Math.max(d10, d11);
    }

    public static double b(double d10, double d11, double d12) {
        return a(a(d10, d11), d12);
    }

    public static double c(double... dArr) {
        c0.v(dArr != null, "The Array must not be null", new Object[0]);
        c0.v(dArr.length != 0, "Array cannot be empty.", new Object[0]);
        double dA = dArr[0];
        for (int i10 = 1; i10 < dArr.length; i10++) {
            dA = a(dArr[i10], dA);
        }
        return dA;
    }

    public static float d(float f10, float f11) {
        if (Float.isNaN(f10)) {
            return f11;
        }
        return Float.isNaN(f11) ? f10 : Math.max(f10, f11);
    }

    public static float e(float f10, float f11, float f12) {
        return d(d(f10, f11), f12);
    }

    public static float f(float... fArr) {
        c0.v(fArr != null, "The Array must not be null", new Object[0]);
        c0.v(fArr.length != 0, "Array cannot be empty.", new Object[0]);
        float fD = fArr[0];
        for (int i10 = 1; i10 < fArr.length; i10++) {
            fD = d(fArr[i10], fD);
        }
        return fD;
    }

    public static double g(double d10, double d11) {
        if (Double.isNaN(d10)) {
            return d11;
        }
        return Double.isNaN(d11) ? d10 : Math.min(d10, d11);
    }

    public static double h(double d10, double d11, double d12) {
        return g(g(d10, d11), d12);
    }

    public static double i(double... dArr) {
        c0.v(dArr != null, "The Array must not be null", new Object[0]);
        c0.v(dArr.length != 0, "Array cannot be empty.", new Object[0]);
        double dG = dArr[0];
        for (int i10 = 1; i10 < dArr.length; i10++) {
            dG = g(dArr[i10], dG);
        }
        return dG;
    }

    public static float j(float f10, float f11) {
        if (Float.isNaN(f10)) {
            return f11;
        }
        return Float.isNaN(f11) ? f10 : Math.min(f10, f11);
    }

    public static float k(float f10, float f11, float f12) {
        return j(j(f10, f11), f12);
    }

    public static float l(float... fArr) {
        c0.v(fArr != null, "The Array must not be null", new Object[0]);
        c0.v(fArr.length != 0, "Array cannot be empty.", new Object[0]);
        float fJ = fArr[0];
        for (int i10 = 1; i10 < fArr.length; i10++) {
            fJ = j(fArr[i10], fJ);
        }
        return fJ;
    }
}
