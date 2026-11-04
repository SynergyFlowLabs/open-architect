package com.google.common.math;

import com.google.common.base.j0;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@e
@com.google.common.annotations.d
public final class m {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f119447a;

        public c a(int index) {
            return new c(this.f119447a, index);
        }

        public d b(Collection<Integer> indexes) {
            return new d(this.f119447a, com.google.common.primitives.l.E(indexes));
        }

        public d c(int... indexes) {
            return new d(this.f119447a, (int[]) indexes.clone());
        }

        private b(int scale) {
            j0.e(scale > 0, "Quantile scale must be positive");
            this.f119447a = scale;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f119448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f119449b;

        public double a(Collection<? extends Number> dataset) {
            return e(com.google.common.primitives.d.C(dataset));
        }

        public double b(double... dataset) {
            return e((double[]) dataset.clone());
        }

        public double c(int... dataset) {
            return e(m.l(dataset));
        }

        public double d(long... dataset) {
            return e(m.m(dataset));
        }

        public double e(double... dataset) {
            j0.e(dataset.length > 0, "Cannot calculate quantiles of an empty dataset");
            if (m.j(dataset)) {
                return Double.NaN;
            }
            long length = ((long) this.f119449b) * ((long) (dataset.length - 1));
            int iG = (int) h.g(length, this.f119448a, RoundingMode.DOWN);
            int i10 = (int) (length - (((long) iG) * ((long) this.f119448a)));
            m.u(iG, dataset, 0, dataset.length - 1);
            if (i10 == 0) {
                return dataset[iG];
            }
            int i11 = iG + 1;
            m.u(i11, dataset, i11, dataset.length - 1);
            return m.k(dataset[iG], dataset[i11], i10, this.f119448a);
        }

        private c(int scale, int index) {
            m.h(index, scale);
            this.f119448a = scale;
            this.f119449b = index;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f119450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f119451b;

        public Map<Integer, Double> a(Collection<? extends Number> dataset) {
            return e(com.google.common.primitives.d.C(dataset));
        }

        public Map<Integer, Double> b(double... dataset) {
            return e((double[]) dataset.clone());
        }

        public Map<Integer, Double> c(int... dataset) {
            return e(m.l(dataset));
        }

        public Map<Integer, Double> d(long... dataset) {
            return e(m.m(dataset));
        }

        public Map<Integer, Double> e(double... dataset) {
            int i10 = 0;
            j0.e(dataset.length > 0, "Cannot calculate quantiles of an empty dataset");
            if (m.j(dataset)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int[] iArr = this.f119451b;
                int length = iArr.length;
                while (i10 < length) {
                    linkedHashMap.put(Integer.valueOf(iArr[i10]), Double.valueOf(Double.NaN));
                    i10++;
                }
                return Collections.unmodifiableMap(linkedHashMap);
            }
            int[] iArr2 = this.f119451b;
            int[] iArr3 = new int[iArr2.length];
            int[] iArr4 = new int[iArr2.length];
            int[] iArr5 = new int[iArr2.length * 2];
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int[] iArr6 = this.f119451b;
                if (i11 >= iArr6.length) {
                    break;
                }
                long length2 = ((long) iArr6[i11]) * ((long) (dataset.length - 1));
                int iG = (int) h.g(length2, this.f119450a, RoundingMode.DOWN);
                int i13 = (int) (length2 - (((long) iG) * ((long) this.f119450a)));
                iArr3[i11] = iG;
                iArr4[i11] = i13;
                iArr5[i12] = iG;
                int i14 = i12 + 1;
                if (i13 != 0) {
                    iArr5[i14] = iG + 1;
                    i12 += 2;
                } else {
                    i12 = i14;
                }
                i11++;
            }
            Arrays.sort(iArr5, 0, i12);
            m.t(iArr5, 0, i12 - 1, dataset, 0, dataset.length - 1);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            while (true) {
                int[] iArr7 = this.f119451b;
                if (i10 >= iArr7.length) {
                    return Collections.unmodifiableMap(linkedHashMap2);
                }
                int i15 = iArr3[i10];
                int i16 = iArr4[i10];
                if (i16 == 0) {
                    linkedHashMap2.put(Integer.valueOf(iArr7[i10]), Double.valueOf(dataset[i15]));
                } else {
                    linkedHashMap2.put(Integer.valueOf(iArr7[i10]), Double.valueOf(m.k(dataset[i15], dataset[i15 + 1], i16, this.f119450a)));
                }
                i10++;
            }
        }

        private d(int scale, int[] indexes) {
            for (int i10 : indexes) {
                m.h(i10, scale);
            }
            j0.e(indexes.length > 0, "Indexes must be a non empty array");
            this.f119450a = scale;
            this.f119451b = indexes;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(int index, int scale) {
        if (index < 0 || index > scale) {
            throw new IllegalArgumentException("Quantile indexes must be between 0 and the scale, which is " + scale);
        }
    }

    private static int i(int[] allRequired, int requiredFrom, int requiredTo, int from, int to) {
        if (requiredFrom == requiredTo) {
            return requiredFrom;
        }
        int i10 = from + to;
        int i11 = i10 >>> 1;
        while (requiredTo > requiredFrom + 1) {
            int i12 = (requiredFrom + requiredTo) >>> 1;
            int i13 = allRequired[i12];
            if (i13 > i11) {
                requiredTo = i12;
            } else {
                if (i13 >= i11) {
                    return i12;
                }
                requiredFrom = i12;
            }
        }
        return (i10 - allRequired[requiredFrom]) - allRequired[requiredTo] > 0 ? requiredTo : requiredFrom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j(double... dataset) {
        for (double d10 : dataset) {
            if (Double.isNaN(d10)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double k(double lower, double upper, double remainder, double scale) {
        if (lower == Double.NEGATIVE_INFINITY) {
            return upper == Double.POSITIVE_INFINITY ? Double.NaN : Double.NEGATIVE_INFINITY;
        }
        if (upper == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        }
        return lower + (((upper - lower) * remainder) / scale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double[] l(int[] ints) {
        int length = ints.length;
        double[] dArr = new double[length];
        for (int i10 = 0; i10 < length; i10++) {
            dArr[i10] = ints[i10];
        }
        return dArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double[] m(long[] longs) {
        int length = longs.length;
        double[] dArr = new double[length];
        for (int i10 = 0; i10 < length; i10++) {
            dArr[i10] = longs[i10];
        }
        return dArr;
    }

    public static c n() {
        return s(2).a(1);
    }

    private static void o(double[] array, int from, int to) {
        int i10 = (from + to) >>> 1;
        double d10 = array[to];
        double d11 = array[i10];
        boolean z10 = d10 < d11;
        double d12 = array[from];
        boolean z11 = d11 < d12;
        boolean z12 = d10 < d12;
        if (z10 == z11) {
            v(array, i10, from);
        } else if (z10 != z12) {
            v(array, from, to);
        }
    }

    private static int p(double[] array, int from, int to) {
        o(array, from, to);
        double d10 = array[from];
        int i10 = to;
        while (to > from) {
            if (array[to] > d10) {
                v(array, i10, to);
                i10--;
            }
            to--;
        }
        v(array, from, i10);
        return i10;
    }

    public static b q() {
        return s(100);
    }

    public static b r() {
        return s(4);
    }

    public static b s(int scale) {
        return new b(scale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t(int[] allRequired, int requiredFrom, int requiredTo, double[] array, int from, int to) {
        int i10 = i(allRequired, requiredFrom, requiredTo, from, to);
        int i11 = allRequired[i10];
        u(i11, array, from, to);
        int i12 = i10 - 1;
        while (i12 >= requiredFrom && allRequired[i12] == i11) {
            i12--;
        }
        if (i12 >= requiredFrom) {
            t(allRequired, requiredFrom, i12, array, from, i11 - 1);
        }
        int i13 = i10 + 1;
        while (i13 <= requiredTo && allRequired[i13] == i11) {
            i13++;
        }
        if (i13 <= requiredTo) {
            t(allRequired, i13, requiredTo, array, i11 + 1, to);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(int required, double[] array, int from, int to) {
        if (required != from) {
            while (to > from) {
                int iP = p(array, from, to);
                if (iP >= required) {
                    to = iP - 1;
                }
                if (iP <= required) {
                    from = iP + 1;
                }
            }
            return;
        }
        int i10 = from;
        for (int i11 = from + 1; i11 <= to; i11++) {
            if (array[i10] > array[i11]) {
                i10 = i11;
            }
        }
        if (i10 != from) {
            v(array, i10, from);
        }
    }

    private static void v(double[] array, int i10, int j10) {
        double d10 = array[i10];
        array[i10] = array[j10];
        array[j10] = d10;
    }
}
