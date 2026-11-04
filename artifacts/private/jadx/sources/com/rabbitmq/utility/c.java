package com.rabbitmq.utility;

import java.util.BitSet;

/* JADX INFO: loaded from: classes13.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f266131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f266132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f266133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f266134d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BitSet f266135e;

    public c(int i10, int i11) {
        this.f266131a = i10;
        int i12 = i11 + 1;
        this.f266132b = i12;
        int i13 = i12 - i10;
        this.f266133c = i13;
        BitSet bitSet = new BitSet(i13);
        this.f266135e = bitSet;
        bitSet.set(0, i13);
    }

    private void d(StringBuilder sb2, int i10, int i11) {
        sb2.append(this.f266131a + i10);
        if (i10 + 1 != i11) {
            sb2.append("..");
            sb2.append((i11 - 1) + this.f266131a);
        }
    }

    public int a() {
        int iNextSetBit = this.f266135e.nextSetBit(this.f266134d);
        if (iNextSetBit < 0) {
            iNextSetBit = this.f266135e.nextSetBit(0);
        }
        if (iNextSetBit < 0) {
            return -1;
        }
        this.f266134d = iNextSetBit;
        this.f266135e.clear(iNextSetBit);
        return iNextSetBit + this.f266131a;
    }

    public void b(int i10) {
        this.f266135e.set(i10 - this.f266131a);
    }

    public boolean c(int i10) {
        int i11 = i10 - this.f266131a;
        if (!this.f266135e.get(i11)) {
            return false;
        }
        this.f266135e.clear(i11);
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("IntAllocator{allocated = [");
        int iNextClearBit = this.f266135e.nextClearBit(0);
        if (iNextClearBit < this.f266133c) {
            int iNextSetBit = this.f266135e.nextSetBit(iNextClearBit + 1);
            if (iNextSetBit < 0) {
                iNextSetBit = this.f266133c;
            }
            d(sb2, iNextClearBit, iNextSetBit);
            int iNextClearBit2 = this.f266135e.nextClearBit(iNextSetBit + 1);
            while (iNextClearBit2 < this.f266133c) {
                int iNextSetBit2 = this.f266135e.nextSetBit(iNextClearBit2);
                if (iNextSetBit2 < 0) {
                    iNextSetBit2 = this.f266133c;
                }
                sb2.append(", ");
                d(sb2, iNextClearBit2, iNextSetBit2);
                iNextClearBit2 = this.f266135e.nextClearBit(iNextSetBit2 + 1);
            }
        }
        sb2.append("]}");
        return sb2.toString();
    }
}
