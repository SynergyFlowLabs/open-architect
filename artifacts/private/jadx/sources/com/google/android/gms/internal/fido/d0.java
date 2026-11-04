package com.google.android.gms.internal.fido;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f108002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[] f108003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f108004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f108005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f108006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f108007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f108008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f108009h;

    /* JADX WARN: Illegal instructions before constructor call */
    d0(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < cArr.length; i10++) {
            char c10 = cArr[i10];
            boolean z10 = true;
            n.d(c10 < 128, "Non-ASCII character: %s", c10);
            if (bArr[c10] != -1) {
                z10 = false;
            }
            n.d(z10, "Duplicate character: %s", c10);
            bArr[c10] = (byte) i10;
        }
        this(str, cArr, bArr, false);
    }

    final char a(int i10) {
        return this.f108003b[i10];
    }

    public final boolean b(char c10) {
        return this.f108008g[61] != -1;
    }

    public final boolean equals(@fj.a Object obj) {
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            boolean z10 = d0Var.f108009h;
            if (Arrays.equals(this.f108003b, d0Var.f108003b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f108003b) + 1237;
    }

    public final String toString() {
        return this.f108002a;
    }

    private d0(String str, char[] cArr, byte[] bArr, boolean z10) {
        this.f108002a = str;
        cArr.getClass();
        this.f108003b = cArr;
        try {
            int length = cArr.length;
            int iB = j0.b(length, RoundingMode.UNNECESSARY);
            this.f108005d = iB;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iB);
            int i10 = 1 << (3 - iNumberOfTrailingZeros);
            this.f108006e = i10;
            this.f108007f = iB >> iNumberOfTrailingZeros;
            this.f108004c = length - 1;
            this.f108008g = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.f108007f; i11++) {
                zArr[j0.a(i11 * 8, this.f108005d, RoundingMode.CEILING)] = true;
            }
            this.f108009h = false;
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e10);
        }
    }
}
