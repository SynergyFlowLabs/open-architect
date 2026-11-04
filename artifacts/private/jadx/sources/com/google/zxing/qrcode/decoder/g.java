package com.google.zxing.qrcode.decoder;

/* JADX INFO: loaded from: classes5.dex */
final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f130904c = 21522;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[][] f130905d = {new int[]{f130904c, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f130906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte f130907b;

    private g(int i10) {
        this.f130906a = f.b((i10 >> 3) & 3);
        this.f130907b = (byte) (i10 & 7);
    }

    static g a(int i10, int i11) {
        g gVarB = b(i10, i11);
        return gVarB != null ? gVarB : b(i10 ^ f130904c, i11 ^ f130904c);
    }

    private static g b(int i10, int i11) {
        int iE;
        int i12 = Integer.MAX_VALUE;
        int i13 = 0;
        for (int[] iArr : f130905d) {
            int i14 = iArr[0];
            if (i14 == i10 || i14 == i11) {
                return new g(iArr[1]);
            }
            int iE2 = e(i10, i14);
            if (iE2 < i12) {
                i13 = iArr[1];
                i12 = iE2;
            }
            if (i10 != i11 && (iE = e(i11, i14)) < i12) {
                i13 = iArr[1];
                i12 = iE;
            }
        }
        if (i12 <= 3) {
            return new g(i13);
        }
        return null;
    }

    static int e(int i10, int i11) {
        return Integer.bitCount(i10 ^ i11);
    }

    byte c() {
        return this.f130907b;
    }

    f d() {
        return this.f130906a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f130906a == gVar.f130906a && this.f130907b == gVar.f130907b;
    }

    public int hashCode() {
        return this.f130907b | (this.f130906a.ordinal() << 3);
    }
}
