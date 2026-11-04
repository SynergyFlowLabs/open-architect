package com.google.api.client.repackaged.com.google.common.base;

import java.util.BitSet;

/* JADX INFO: loaded from: classes4.dex */
@r7.c
final class t extends c.v {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final int f115912t = 1023;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f115913u = -862048943;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f115914v = 461845907;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final double f115915w = 0.5d;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final char[] f115916q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f115917r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final long f115918s;

    private t(char[] cArr, long j10, boolean z10, String str) {
        super(str);
        this.f115916q = cArr;
        this.f115918s = j10;
        this.f115917r = z10;
    }

    private boolean Y(int i10) {
        if (1 != ((this.f115918s >> i10) & 1)) {
            return false;
        }
        int i11 = 3 | 1;
        return true;
    }

    @r7.d
    static int Z(int i10) {
        if (i10 == 1) {
            return 2;
        }
        int iHighestOneBit = Integer.highestOneBit(i10 - 1) << 1;
        while (((double) iHighestOneBit) * 0.5d < i10) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    static c a0(BitSet bitSet, String str) {
        int i10;
        int iCardinality = bitSet.cardinality();
        boolean z10 = bitSet.get(0);
        int iZ = Z(iCardinality);
        char[] cArr = new char[iZ];
        int i11 = iZ - 1;
        int iNextSetBit = bitSet.nextSetBit(0);
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
            iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1);
            j10 = j11;
        }
        return new t(cArr, j10, z10, str);
    }

    static int b0(int i10) {
        return Integer.rotateLeft(i10 * (-862048943), 15) * f115914v;
    }

    @Override // com.google.api.client.repackaged.com.google.common.base.c
    public boolean B(char c10) {
        if (c10 == 0) {
            return this.f115917r;
        }
        if (!Y(c10)) {
            return false;
        }
        int length = this.f115916q.length - 1;
        int iB0 = b0(c10) & length;
        int i10 = iB0;
        do {
            char c11 = this.f115916q[i10];
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

    @Override // com.google.api.client.repackaged.com.google.common.base.c
    void Q(BitSet bitSet) {
        if (this.f115917r) {
            bitSet.set(0);
        }
        for (char c10 : this.f115916q) {
            if (c10 != 0) {
                bitSet.set(c10);
            }
        }
    }
}
