package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.d1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
final class c {
    private c() {
    }

    static double[] a(@p0 double[] dArr) {
        if (dArr == null) {
            return new double[4];
        }
        if (dArr.length >= 4) {
            return dArr;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 4");
    }

    static void b(@NonNull double[] dArr) {
        if (dArr.length < 4) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 4");
        }
    }

    @NonNull
    @d1(min = 3)
    static float[] c(@p0 float[] fArr) {
        if (fArr == null) {
            return new float[3];
        }
        if (fArr.length >= 3) {
            return fArr;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 3");
    }

    static void d(@NonNull float[] fArr) {
        int i10 = 7 | 3;
        if (fArr.length < 3) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 3");
        }
    }

    @NonNull
    @d1(min = 4)
    static float[] e(@p0 float[] fArr) {
        if (fArr == null) {
            return new float[4];
        }
        if (fArr.length >= 4) {
            return fArr;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 4");
    }

    static void f(@NonNull float[] fArr) {
        if (fArr.length < 4) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 4");
        }
    }

    @NonNull
    @d1(min = 9)
    static float[] g(@p0 float[] fArr) {
        if (fArr == null) {
            return new float[9];
        }
        if (fArr.length >= 9) {
            return fArr;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 9");
    }

    static void h(@NonNull @d1(min = 9) float[] fArr) {
        if (fArr.length < 9) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 9");
        }
    }

    @NonNull
    @d1(min = 16)
    static double[] i(@p0 double[] dArr) {
        if (dArr == null) {
            return new double[16];
        }
        if (dArr.length >= 16) {
            return dArr;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
    }

    static void j(@NonNull @d1(min = 16) double[] dArr) {
        if (dArr.length < 16) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
        }
    }

    @NonNull
    @d1(min = 16)
    static double[] k(@p0 double[] dArr) {
        if (dArr == null) {
            return new double[16];
        }
        if (dArr.length >= 16) {
            return dArr;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
    }

    static void l(@NonNull @d1(min = 16) double[] dArr) {
        if (dArr.length < 16) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
        }
    }

    @NonNull
    @d1(min = 16)
    static float[] m(@p0 float[] fArr) {
        if (fArr == null) {
            return new float[16];
        }
        if (fArr.length >= 16) {
            return fArr;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
    }

    static void n(@NonNull @d1(min = 16) float[] fArr) {
        if (fArr.length < 16) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
        }
    }
}
