package com.google.common.base;

import java.util.BitSet;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.c
@k
final class n0 extends e.v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f116596f = 1023;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f116597g = -862048943;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f116598h = 461845907;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final double f116599i = 0.5d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char[] f116600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f116601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f116602e;

    private n0(char[] table, long filter, boolean containsZero, String description) {
        super(description);
        this.f116600c = table;
        this.f116602e = filter;
        this.f116601d = containsZero;
    }

    private boolean Y(int c10) {
        return 1 == ((this.f116602e >> c10) & 1);
    }

    @com.google.common.annotations.e
    static int Z(int setSize) {
        if (setSize == 1) {
            return 2;
        }
        int iHighestOneBit = Integer.highestOneBit(setSize - 1) << 1;
        while (((double) iHighestOneBit) * 0.5d < setSize) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    static e a0(BitSet chars, String description) {
        int i10;
        int iCardinality = chars.cardinality();
        boolean z10 = chars.get(0);
        int iZ = Z(iCardinality);
        char[] cArr = new char[iZ];
        int i11 = iZ - 1;
        int iNextSetBit = chars.nextSetBit(0);
        long j10 = 0;
        while (iNextSetBit != -1) {
            long j11 = (1 << iNextSetBit) | j10;
            int iB0 = b0(iNextSetBit);
            while (true) {
                i10 = iB0 & i11;
                if (cArr[i10] == 0) {
                    break;
                }
                iB0 = i10 + 1;
            }
            cArr[i10] = (char) iNextSetBit;
            iNextSetBit = chars.nextSetBit(iNextSetBit + 1);
            j10 = j11;
        }
        return new n0(cArr, j10, z10, description);
    }

    static int b0(int hashCode) {
        return Integer.rotateLeft(hashCode * (-862048943), 15) * f116598h;
    }

    @Override // com.google.common.base.e
    public boolean B(char c10) {
        if (c10 == 0) {
            return this.f116601d;
        }
        if (!Y(c10)) {
            return false;
        }
        int length = this.f116600c.length - 1;
        int iB0 = b0(c10) & length;
        int i10 = iB0;
        do {
            char c11 = this.f116600c[i10];
            if (c11 == 0) {
                return false;
            }
            if (c11 == c10) {
                return true;
            }
            i10 = (i10 + 1) & length;
        } while (i10 != iB0);
        return false;
    }

    @Override // com.google.common.base.e
    void Q(BitSet table) {
        if (this.f116601d) {
            table.set(0);
        }
        for (char c10 : this.f116600c) {
            if (c10 != 0) {
                table.set(c10);
            }
        }
    }
}
