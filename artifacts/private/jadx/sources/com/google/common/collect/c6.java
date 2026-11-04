package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
final class c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f117241a = -862048943;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f117242b = 461845907;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f117243c = 1073741824;

    private c6() {
    }

    static int a(int expectedEntries, double loadFactor) {
        int iMax = Math.max(expectedEntries, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (loadFactor * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i10 = iHighestOneBit << 1;
        if (i10 > 0) {
            return i10;
        }
        return 1073741824;
    }

    static boolean b(int size, int tableSize, double loadFactor) {
        return ((double) size) > loadFactor * ((double) tableSize) && tableSize < 1073741824;
    }

    static int c(int hashCode) {
        return (int) (((long) Integer.rotateLeft((int) (((long) hashCode) * f117241a), 15)) * f117242b);
    }

    static int d(@fj.a Object o10) {
        return c(o10 == null ? 0 : o10.hashCode());
    }
}
