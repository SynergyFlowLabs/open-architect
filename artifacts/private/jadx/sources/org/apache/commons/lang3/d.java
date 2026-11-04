package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes14.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f337143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f337144b;

    public d(int i10) {
        this.f337143a = i10;
        this.f337144b = i10 != 0 ? Integer.numberOfTrailingZeros(i10) : 0;
    }

    public int a(int i10) {
        return (~this.f337143a) & i10;
    }

    public byte b(byte b10) {
        return (byte) a(b10);
    }

    public short c(short s10) {
        return (short) a(s10);
    }

    public int d(int i10) {
        return this.f337143a & i10;
    }

    public short e(short s10) {
        return (short) d(s10);
    }

    public short f(short s10) {
        return (short) g(s10);
    }

    public int g(int i10) {
        return d(i10) >> this.f337144b;
    }

    public boolean h(int i10) {
        int i11 = this.f337143a;
        if ((i10 & i11) != i11) {
            return false;
        }
        int i12 = 5 ^ 1;
        return true;
    }

    public boolean i(int i10) {
        return (this.f337143a & i10) != 0;
    }

    public int j(int i10) {
        return this.f337143a | i10;
    }

    public int k(int i10, boolean z10) {
        return z10 ? j(i10) : a(i10);
    }

    public byte l(byte b10) {
        return (byte) j(b10);
    }

    public byte m(byte b10, boolean z10) {
        return z10 ? l(b10) : b(b10);
    }

    public short n(short s10) {
        return (short) j(s10);
    }

    public short o(short s10, boolean z10) {
        return z10 ? n(s10) : c(s10);
    }

    public short p(short s10, short s11) {
        return (short) q(s10, s11);
    }

    public int q(int i10, int i11) {
        int i12 = this.f337143a;
        return ((i11 << this.f337144b) & i12) | (i10 & (~i12));
    }
}
