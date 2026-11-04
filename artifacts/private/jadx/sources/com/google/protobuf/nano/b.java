package com.google.protobuf.nano;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f126148b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f126149c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f126150d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f126151a;

    public static class a extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final long f126152a = -6947486886997889499L;

        a(int i10, int i11) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i10 + " limit " + i11 + ").");
        }
    }

    private b(byte[] bArr, int i10, int i11) {
        this(ByteBuffer.wrap(bArr, i10, i11));
    }

    public static int A(int i10, int i11) {
        return K(i10) + B(i11);
    }

    public static int B(int i10) {
        return 4;
    }

    public static int C(int i10, long j10) {
        return K(i10) + D(j10);
    }

    public static int D(long j10) {
        return 8;
    }

    public static int E(int i10, int i11) {
        return K(i10) + F(i11);
    }

    public static int F(int i10) {
        return y(S(i10));
    }

    public static int G(int i10, long j10) {
        return K(i10) + H(j10);
    }

    public static int H(long j10) {
        return z(T(j10));
    }

    public static int I(int i10, String str) {
        return K(i10) + J(str);
    }

    public static int J(String str) {
        int iU = U(str);
        return y(iU) + iU;
    }

    public static int K(int i10) {
        return y(m.d(i10, 0));
    }

    public static int L(int i10, int i11) {
        return K(i10) + M(i11);
    }

    public static int M(int i10) {
        return y(i10);
    }

    public static int N(int i10, long j10) {
        return K(i10) + O(j10);
    }

    public static int O(long j10) {
        return z(j10);
    }

    private static int P(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        int i12;
        char cCharAt;
        int length = charSequence.length();
        int i13 = i11 + i10;
        int i14 = 0;
        while (i14 < length && (i12 = i14 + i10) < i13 && (cCharAt = charSequence.charAt(i14)) < 128) {
            bArr[i12] = (byte) cCharAt;
            i14++;
        }
        if (i14 == length) {
            return i10 + length;
        }
        int i15 = i10 + i14;
        while (i14 < length) {
            char cCharAt2 = charSequence.charAt(i14);
            if (cCharAt2 < 128 && i15 < i13) {
                bArr[i15] = (byte) cCharAt2;
                i15++;
            } else if (cCharAt2 < 2048 && i15 <= i13 - 2) {
                int i16 = i15 + 1;
                bArr[i15] = (byte) ((cCharAt2 >>> 6) | 960);
                i15 += 2;
                bArr[i16] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i15 > i13 - 3) {
                    if (i15 > i13 - 4) {
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i15);
                    }
                    int i17 = i14 + 1;
                    if (i17 != charSequence.length()) {
                        char cCharAt3 = charSequence.charAt(i17);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i15] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i15 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i18 = i15 + 3;
                            bArr[i15 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i15 += 4;
                            bArr[i18] = (byte) ((codePoint & 63) | 128);
                            i14 = i17;
                        } else {
                            i14 = i17;
                        }
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unpaired surrogate at index ");
                    sb2.append(i14 - 1);
                    throw new IllegalArgumentException(sb2.toString());
                }
                bArr[i15] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i19 = i15 + 2;
                bArr[i15 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i15 += 3;
                bArr[i19] = (byte) ((cCharAt2 & '?') | 128);
            }
            i14++;
        }
        return i15;
    }

    private static void Q(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        if (!byteBuffer.hasArray()) {
            R(charSequence, byteBuffer);
            return;
        }
        try {
            byteBuffer.position(P(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e10) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e10);
            throw bufferOverflowException;
        }
    }

    private static void R(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt < 128) {
                byteBuffer.put((byte) cCharAt);
            } else if (cCharAt < 2048) {
                byteBuffer.put((byte) ((cCharAt >>> 6) | 960));
                byteBuffer.put((byte) ((cCharAt & '?') | 128));
            } else {
                if (cCharAt >= 55296 && 57343 >= cCharAt) {
                    int i11 = i10 + 1;
                    if (i11 != charSequence.length()) {
                        char cCharAt2 = charSequence.charAt(i11);
                        if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
                            int codePoint = Character.toCodePoint(cCharAt, cCharAt2);
                            byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                            byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                            byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                            byteBuffer.put((byte) ((codePoint & 63) | 128));
                            i10 = i11;
                        } else {
                            i10 = i11;
                        }
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unpaired surrogate at index ");
                    sb2.append(i10 - 1);
                    throw new IllegalArgumentException(sb2.toString());
                }
                byteBuffer.put((byte) ((cCharAt >>> '\f') | 480));
                byteBuffer.put((byte) (((cCharAt >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((cCharAt & '?') | 128));
            }
            i10++;
        }
    }

    public static int S(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long T(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    private static int U(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int iV = length;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt >= 2048) {
                iV += V(charSequence, i10);
                break;
            }
            iV += (127 - cCharAt) >>> 31;
            i10++;
        }
        if (iV >= length) {
            return iV;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iV) + 4294967296L));
    }

    private static int V(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt < 2048) {
                i11 += (127 - cCharAt) >>> 31;
            } else {
                i11 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i10) < 65536) {
                        throw new IllegalArgumentException("Unpaired surrogate at index " + i10);
                    }
                    i10++;
                }
            }
            i10++;
        }
        return i11;
    }

    public static b W(byte[] bArr) {
        return X(bArr, 0, bArr.length);
    }

    public static b X(byte[] bArr, int i10, int i11) {
        return new b(bArr, i10, i11);
    }

    public static int b(int i10, boolean z10) {
        return K(i10) + c(z10);
    }

    public static int c(boolean z10) {
        return 1;
    }

    public static int d(int i10, byte[] bArr) {
        return K(i10) + e(bArr);
    }

    public static int e(byte[] bArr) {
        return y(bArr.length) + bArr.length;
    }

    public static int f(int i10, double d10) {
        return K(i10) + g(d10);
    }

    public static int g(double d10) {
        return 8;
    }

    public static int h(int i10, int i11) {
        return K(i10) + i(i11);
    }

    public static int i(int i10) {
        return y(i10);
    }

    static int j(int i10, int i11, Object obj) {
        switch (i11) {
            case 1:
                return f(i10, ((Double) obj).doubleValue());
            case 2:
                return o(i10, ((Float) obj).floatValue());
            case 3:
                return u(i10, ((Long) obj).longValue());
            case 4:
                return N(i10, ((Long) obj).longValue());
            case 5:
                return s(i10, ((Integer) obj).intValue());
            case 6:
                return m(i10, ((Long) obj).longValue());
            case 7:
                return k(i10, ((Integer) obj).intValue());
            case 8:
                return b(i10, ((Boolean) obj).booleanValue());
            case 9:
                return I(i10, (String) obj);
            case 10:
                return q(i10, (j) obj);
            case 11:
                return w(i10, (j) obj);
            case 12:
                return d(i10, (byte[]) obj);
            case 13:
                return L(i10, ((Integer) obj).intValue());
            case 14:
                return h(i10, ((Integer) obj).intValue());
            case 15:
                return A(i10, ((Integer) obj).intValue());
            case 16:
                return C(i10, ((Long) obj).longValue());
            case 17:
                return E(i10, ((Integer) obj).intValue());
            case 18:
                return G(i10, ((Long) obj).longValue());
            default:
                throw new IllegalArgumentException("Unknown type: " + i11);
        }
    }

    public static int k(int i10, int i11) {
        return K(i10) + l(i11);
    }

    public static int l(int i10) {
        return 4;
    }

    public static int m(int i10, long j10) {
        return K(i10) + n(j10);
    }

    public static int n(long j10) {
        return 8;
    }

    public static int o(int i10, float f10) {
        return K(i10) + p(f10);
    }

    public static int p(float f10) {
        return 4;
    }

    public static int q(int i10, j jVar) {
        return (K(i10) * 2) + r(jVar);
    }

    public static int r(j jVar) {
        return jVar.d();
    }

    public static int s(int i10, int i11) {
        return K(i10) + t(i11);
    }

    public static int t(int i10) {
        if (i10 >= 0) {
            return y(i10);
        }
        return 10;
    }

    public static int u(int i10, long j10) {
        return K(i10) + v(j10);
    }

    public static int v(long j10) {
        return z(j10);
    }

    public static int w(int i10, j jVar) {
        return K(i10) + x(jVar);
    }

    public static int x(j jVar) {
        int iD = jVar.d();
        return y(iD) + iD;
    }

    public static int y(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int z(long j10) {
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (((-16384) & j10) == 0) {
            return 2;
        }
        if (((-2097152) & j10) == 0) {
            return 3;
        }
        if (((-268435456) & j10) == 0) {
            return 4;
        }
        if (((-34359738368L) & j10) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j10) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j10) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j10) == 0) {
            return 8;
        }
        return (j10 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public void A0(byte[] bArr) throws IOException {
        B0(bArr, 0, bArr.length);
    }

    public void B0(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f126151a.remaining() < i11) {
            throw new a(this.f126151a.position(), this.f126151a.limit());
        }
        this.f126151a.put(bArr, i10, i11);
    }

    public void C0(int i10) throws IOException {
        if (this.f126151a.remaining() < 4) {
            throw new a(this.f126151a.position(), this.f126151a.limit());
        }
        this.f126151a.putInt(i10);
    }

    public void D0(long j10) throws IOException {
        if (this.f126151a.remaining() < 8) {
            throw new a(this.f126151a.position(), this.f126151a.limit());
        }
        this.f126151a.putLong(j10);
    }

    public void E0(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            z0((i10 & 127) | 128);
            i10 >>>= 7;
        }
        z0(i10);
    }

    public void F0(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            z0((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        z0((int) j10);
    }

    public void G0(int i10, int i11) throws IOException {
        Q0(i10, 5);
        H0(i11);
    }

    public void H0(int i10) throws IOException {
        C0(i10);
    }

    public void I0(int i10, long j10) throws IOException {
        Q0(i10, 1);
        J0(j10);
    }

    public void J0(long j10) throws IOException {
        D0(j10);
    }

    public void K0(int i10, int i11) throws IOException {
        Q0(i10, 0);
        L0(i11);
    }

    public void L0(int i10) throws IOException {
        E0(S(i10));
    }

    public void M0(int i10, long j10) throws IOException {
        Q0(i10, 0);
        N0(j10);
    }

    public void N0(long j10) throws IOException {
        F0(T(j10));
    }

    public void O0(int i10, String str) throws IOException {
        Q0(i10, 2);
        P0(str);
    }

    public void P0(String str) throws IOException {
        try {
            int iY = y(str.length());
            if (iY != y(str.length() * 3)) {
                E0(U(str));
                Q(str, this.f126151a);
                return;
            }
            int iPosition = this.f126151a.position();
            if (this.f126151a.remaining() < iY) {
                throw new a(iPosition + iY, this.f126151a.limit());
            }
            this.f126151a.position(iPosition + iY);
            Q(str, this.f126151a);
            int iPosition2 = this.f126151a.position();
            this.f126151a.position(iPosition);
            E0((iPosition2 - iPosition) - iY);
            this.f126151a.position(iPosition2);
        } catch (BufferOverflowException e10) {
            a aVar = new a(this.f126151a.position(), this.f126151a.limit());
            aVar.initCause(e10);
            throw aVar;
        }
    }

    public void Q0(int i10, int i11) throws IOException {
        E0(m.d(i10, i11));
    }

    public void R0(int i10, int i11) throws IOException {
        Q0(i10, 0);
        S0(i11);
    }

    public void S0(int i10) throws IOException {
        E0(i10);
    }

    public void T0(int i10, long j10) throws IOException {
        Q0(i10, 0);
        U0(j10);
    }

    public void U0(long j10) throws IOException {
        F0(j10);
    }

    public int Y() {
        return this.f126151a.position();
    }

    public void Z() {
        this.f126151a.clear();
    }

    public void a() {
        if (a0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public int a0() {
        return this.f126151a.remaining();
    }

    public void b0(int i10, boolean z10) throws IOException {
        Q0(i10, 0);
        c0(z10);
    }

    public void c0(boolean z10) throws IOException {
        z0(z10 ? 1 : 0);
    }

    public void d0(int i10, byte[] bArr) throws IOException {
        Q0(i10, 2);
        e0(bArr);
    }

    public void e0(byte[] bArr) throws IOException {
        E0(bArr.length);
        A0(bArr);
    }

    public void f0(int i10, double d10) throws IOException {
        Q0(i10, 1);
        g0(d10);
    }

    public void g0(double d10) throws IOException {
        D0(Double.doubleToLongBits(d10));
    }

    public void h0(int i10, int i11) throws IOException {
        Q0(i10, 0);
        i0(i11);
    }

    public void i0(int i10) throws IOException {
        E0(i10);
    }

    void j0(int i10, int i11, Object obj) throws IOException {
        switch (i11) {
            case 1:
                f0(i10, ((Double) obj).doubleValue());
                return;
            case 2:
                o0(i10, ((Float) obj).floatValue());
                return;
            case 3:
                u0(i10, ((Long) obj).longValue());
                return;
            case 4:
                T0(i10, ((Long) obj).longValue());
                return;
            case 5:
                s0(i10, ((Integer) obj).intValue());
                return;
            case 6:
                m0(i10, ((Long) obj).longValue());
                return;
            case 7:
                k0(i10, ((Integer) obj).intValue());
                return;
            case 8:
                b0(i10, ((Boolean) obj).booleanValue());
                return;
            case 9:
                O0(i10, (String) obj);
                return;
            case 10:
                q0(i10, (j) obj);
                return;
            case 11:
                w0(i10, (j) obj);
                return;
            case 12:
                d0(i10, (byte[]) obj);
                return;
            case 13:
                R0(i10, ((Integer) obj).intValue());
                return;
            case 14:
                h0(i10, ((Integer) obj).intValue());
                return;
            case 15:
                G0(i10, ((Integer) obj).intValue());
                return;
            case 16:
                I0(i10, ((Long) obj).longValue());
                return;
            case 17:
                K0(i10, ((Integer) obj).intValue());
                return;
            case 18:
                M0(i10, ((Long) obj).longValue());
                return;
            default:
                throw new IOException("Unknown type: " + i11);
        }
    }

    public void k0(int i10, int i11) throws IOException {
        Q0(i10, 5);
        l0(i11);
    }

    public void l0(int i10) throws IOException {
        C0(i10);
    }

    public void m0(int i10, long j10) throws IOException {
        Q0(i10, 1);
        n0(j10);
    }

    public void n0(long j10) throws IOException {
        D0(j10);
    }

    public void o0(int i10, float f10) throws IOException {
        Q0(i10, 5);
        p0(f10);
    }

    public void p0(float f10) throws IOException {
        C0(Float.floatToIntBits(f10));
    }

    public void q0(int i10, j jVar) throws IOException {
        Q0(i10, 3);
        r0(jVar);
        Q0(i10, 4);
    }

    public void r0(j jVar) throws IOException {
        jVar.k(this);
    }

    public void s0(int i10, int i11) throws IOException {
        Q0(i10, 0);
        t0(i11);
    }

    public void t0(int i10) throws IOException {
        if (i10 >= 0) {
            E0(i10);
        } else {
            F0(i10);
        }
    }

    public void u0(int i10, long j10) throws IOException {
        Q0(i10, 0);
        v0(j10);
    }

    public void v0(long j10) throws IOException {
        F0(j10);
    }

    public void w0(int i10, j jVar) throws IOException {
        Q0(i10, 2);
        x0(jVar);
    }

    public void x0(j jVar) throws IOException {
        E0(jVar.c());
        jVar.k(this);
    }

    public void y0(byte b10) throws IOException {
        if (!this.f126151a.hasRemaining()) {
            throw new a(this.f126151a.position(), this.f126151a.limit());
        }
        this.f126151a.put(b10);
    }

    public void z0(int i10) throws IOException {
        y0((byte) i10);
    }

    private b(ByteBuffer byteBuffer) {
        this.f126151a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }
}
