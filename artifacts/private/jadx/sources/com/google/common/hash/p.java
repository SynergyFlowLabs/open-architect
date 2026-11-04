package com.google.common.hash;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@k
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f118896a = "0123456789abcdef".toCharArray();

    private static final class a extends p implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f118897c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final byte[] f118898b;

        a(byte[] bytes) {
            this.f118898b = (byte[]) com.google.common.base.j0.E(bytes);
        }

        @Override // com.google.common.hash.p
        public byte[] a() {
            return (byte[]) this.f118898b.clone();
        }

        @Override // com.google.common.hash.p
        public int b() {
            byte[] bArr = this.f118898b;
            com.google.common.base.j0.n0(bArr.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", bArr.length);
            byte[] bArr2 = this.f118898b;
            return ((bArr2[3] & 255) << 24) | (bArr2[0] & 255) | ((bArr2[1] & 255) << 8) | ((bArr2[2] & 255) << 16);
        }

        @Override // com.google.common.hash.p
        public long c() {
            byte[] bArr = this.f118898b;
            com.google.common.base.j0.n0(bArr.length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", bArr.length);
            return m();
        }

        @Override // com.google.common.hash.p
        public int d() {
            return this.f118898b.length * 8;
        }

        @Override // com.google.common.hash.p
        boolean f(p that) {
            if (this.f118898b.length != that.l().length) {
                return false;
            }
            boolean z10 = true;
            int i10 = 0;
            while (true) {
                byte[] bArr = this.f118898b;
                if (i10 >= bArr.length) {
                    return z10;
                }
                z10 &= bArr[i10] == that.l()[i10];
                i10++;
            }
        }

        @Override // com.google.common.hash.p
        byte[] l() {
            return this.f118898b;
        }

        @Override // com.google.common.hash.p
        public long m() {
            long j10 = this.f118898b[0] & 255;
            for (int i10 = 1; i10 < Math.min(this.f118898b.length, 8); i10++) {
                j10 |= (((long) this.f118898b[i10]) & 255) << (i10 * 8);
            }
            return j10;
        }

        @Override // com.google.common.hash.p
        void o(byte[] dest, int offset, int maxLength) {
            System.arraycopy(this.f118898b, 0, dest, offset, maxLength);
        }
    }

    private static final class b extends p implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f118899c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f118900b;

        b(int hash) {
            this.f118900b = hash;
        }

        @Override // com.google.common.hash.p
        public byte[] a() {
            int i10 = this.f118900b;
            return new byte[]{(byte) i10, (byte) (i10 >> 8), (byte) (i10 >> 16), (byte) (i10 >> 24)};
        }

        @Override // com.google.common.hash.p
        public int b() {
            return this.f118900b;
        }

        @Override // com.google.common.hash.p
        public long c() {
            throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
        }

        @Override // com.google.common.hash.p
        public int d() {
            return 32;
        }

        @Override // com.google.common.hash.p
        boolean f(p that) {
            return this.f118900b == that.b();
        }

        @Override // com.google.common.hash.p
        public long m() {
            return com.google.common.primitives.w.r(this.f118900b);
        }

        @Override // com.google.common.hash.p
        void o(byte[] dest, int offset, int maxLength) {
            for (int i10 = 0; i10 < maxLength; i10++) {
                dest[offset + i10] = (byte) (this.f118900b >> (i10 * 8));
            }
        }
    }

    private static final class c extends p implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f118901c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f118902b;

        c(long hash) {
            this.f118902b = hash;
        }

        @Override // com.google.common.hash.p
        public byte[] a() {
            long j10 = this.f118902b;
            return new byte[]{(byte) j10, (byte) (j10 >> 8), (byte) (j10 >> 16), (byte) (j10 >> 24), (byte) (j10 >> 32), (byte) (j10 >> 40), (byte) (j10 >> 48), (byte) (j10 >> 56)};
        }

        @Override // com.google.common.hash.p
        public int b() {
            return (int) this.f118902b;
        }

        @Override // com.google.common.hash.p
        public long c() {
            return this.f118902b;
        }

        @Override // com.google.common.hash.p
        public int d() {
            return 64;
        }

        @Override // com.google.common.hash.p
        boolean f(p that) {
            return this.f118902b == that.c();
        }

        @Override // com.google.common.hash.p
        public long m() {
            return this.f118902b;
        }

        @Override // com.google.common.hash.p
        void o(byte[] dest, int offset, int maxLength) {
            for (int i10 = 0; i10 < maxLength; i10++) {
                dest[offset + i10] = (byte) (this.f118902b >> (i10 * 8));
            }
        }
    }

    p() {
    }

    private static int e(char ch2) {
        if (ch2 >= '0' && ch2 <= '9') {
            return ch2 - org.locationtech.jts.geom.l.f338160j;
        }
        if (ch2 >= 'a' && ch2 <= 'f') {
            return ch2 - 'W';
        }
        throw new IllegalArgumentException("Illegal hexadecimal character: " + ch2);
    }

    public static p g(byte[] bytes) {
        com.google.common.base.j0.e(bytes.length >= 1, "A HashCode must contain at least 1 byte.");
        return h((byte[]) bytes.clone());
    }

    static p h(byte[] bytes) {
        return new a(bytes);
    }

    public static p i(int hash) {
        return new b(hash);
    }

    public static p j(long hash) {
        return new c(hash);
    }

    public static p k(String string) {
        com.google.common.base.j0.u(string.length() >= 2, "input string (%s) must have at least 2 characters", string);
        com.google.common.base.j0.u(string.length() % 2 == 0, "input string (%s) must have an even number of characters", string);
        byte[] bArr = new byte[string.length() / 2];
        for (int i10 = 0; i10 < string.length(); i10 += 2) {
            bArr[i10 / 2] = (byte) ((e(string.charAt(i10)) << 4) + e(string.charAt(i10 + 1)));
        }
        return h(bArr);
    }

    public abstract byte[] a();

    public abstract int b();

    public abstract long c();

    public abstract int d();

    public final boolean equals(@fj.a Object object) {
        if (object instanceof p) {
            p pVar = (p) object;
            if (d() == pVar.d() && f(pVar)) {
                return true;
            }
        }
        return false;
    }

    abstract boolean f(p that);

    public final int hashCode() {
        if (d() >= 32) {
            return b();
        }
        byte[] bArrL = l();
        int i10 = bArrL[0] & 255;
        int i11 = 6 & 1;
        for (int i12 = 1; i12 < bArrL.length; i12++) {
            i10 |= (bArrL[i12] & 255) << (i12 * 8);
        }
        return i10;
    }

    byte[] l() {
        return a();
    }

    public abstract long m();

    @z7.a
    public int n(byte[] dest, int offset, int maxLength) {
        int iV = com.google.common.primitives.l.v(maxLength, d() / 8);
        com.google.common.base.j0.f0(offset, offset + iV, dest.length);
        o(dest, offset, iV);
        return iV;
    }

    abstract void o(byte[] dest, int offset, int maxLength);

    public final String toString() {
        byte[] bArrL = l();
        StringBuilder sb2 = new StringBuilder(bArrL.length * 2);
        for (byte b10 : bArrL) {
            char[] cArr = f118896a;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & com.google.common.base.c.f116464q]);
        }
        return sb2.toString();
    }
}
