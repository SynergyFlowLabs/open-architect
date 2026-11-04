package com.google.vr.sdk.deps;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* JADX INFO: loaded from: classes5.dex */
public final class u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f129617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private t2 f129618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f129619c;

    private u6(byte[] bArr, int i10, int i11) {
        this(ByteBuffer.wrap(bArr, i10, i11));
    }

    private final void A(int i10) throws IOException {
        byte b10 = (byte) i10;
        if (!this.f129617a.hasRemaining()) {
            throw new v6(this.f129617a.position(), this.f129617a.limit());
        }
        this.f129617a.put(b10);
    }

    public static int a(int i10) {
        if (i10 >= 0) {
            return z(i10);
        }
        return 10;
    }

    private static int b(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt >= 2048) {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char cCharAt2 = charSequence.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) < 65536) {
                                StringBuilder sb2 = new StringBuilder(39);
                                sb2.append("Unpaired surrogate at index ");
                                sb2.append(i11);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
                break;
            }
            i12 += (127 - cCharAt) >>> 31;
            i11++;
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder sb3 = new StringBuilder(54);
        sb3.append("UTF-8 length does not fit in int: ");
        sb3.append(((long) i12) + 4294967296L);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static int c(String str) {
        int iB = b(str);
        return z(iB) + iB;
    }

    public static u6 d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static u6 e(byte[] bArr, int i10, int i11) {
        return new u6(bArr, i10, i11);
    }

    private final void o(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            A((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        A((int) j10);
    }

    private static void p(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i10;
        char cCharAt;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        char c10 = 57343;
        int i11 = 0;
        if (!byteBuffer.hasArray()) {
            int length = charSequence.length();
            while (i11 < length) {
                char cCharAt2 = charSequence.charAt(i11);
                if (cCharAt2 < 128) {
                    byteBuffer.put((byte) cCharAt2);
                } else {
                    if (cCharAt2 < 2048) {
                        byteBuffer.put((byte) ((cCharAt2 >>> 6) | 960));
                        byteBuffer.put((byte) ((cCharAt2 & '?') | 128));
                    } else {
                        if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                            int i12 = i11 + 1;
                            if (i12 != charSequence.length()) {
                                char cCharAt3 = charSequence.charAt(i12);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                                    byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint & 63) | 128));
                                    i11 = i12;
                                } else {
                                    i11 = i12;
                                }
                            }
                            StringBuilder sb2 = new StringBuilder(39);
                            sb2.append("Unpaired surrogate at index ");
                            sb2.append(i11 - 1);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        byteBuffer.put((byte) ((cCharAt2 >>> '\f') | 480));
                        byteBuffer.put((byte) (((cCharAt2 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((cCharAt2 & '?') | 128));
                    }
                    i11++;
                }
                i11++;
            }
            return;
        }
        try {
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            int iRemaining = byteBuffer.remaining();
            int length2 = charSequence.length();
            int i13 = iRemaining + iArrayOffset;
            while (i11 < length2) {
                int i14 = i11 + iArrayOffset;
                if (i14 >= i13 || (cCharAt = charSequence.charAt(i11)) >= 128) {
                    break;
                }
                bArrArray[i14] = (byte) cCharAt;
                i11++;
            }
            if (i11 == length2) {
                i10 = iArrayOffset + length2;
            } else {
                i10 = iArrayOffset + i11;
                while (i11 < length2) {
                    char cCharAt4 = charSequence.charAt(i11);
                    if (cCharAt4 < 128 && i10 < i13) {
                        bArrArray[i10] = (byte) cCharAt4;
                        i10++;
                    } else if (cCharAt4 < 2048 && i10 <= i13 - 2) {
                        int i15 = i10 + 1;
                        bArrArray[i10] = (byte) ((cCharAt4 >>> 6) | 960);
                        i10 += 2;
                        bArrArray[i15] = (byte) ((cCharAt4 & '?') | 128);
                    } else {
                        if ((cCharAt4 >= 55296 && c10 >= cCharAt4) || i10 > i13 - 3) {
                            if (i10 > i13 - 4) {
                                StringBuilder sb3 = new StringBuilder(37);
                                sb3.append("Failed writing ");
                                sb3.append(cCharAt4);
                                sb3.append(" at index ");
                                sb3.append(i10);
                                throw new ArrayIndexOutOfBoundsException(sb3.toString());
                            }
                            int i16 = i11 + 1;
                            if (i16 != charSequence.length()) {
                                char cCharAt5 = charSequence.charAt(i16);
                                if (Character.isSurrogatePair(cCharAt4, cCharAt5)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt4, cCharAt5);
                                    bArrArray[i10] = (byte) ((codePoint2 >>> 18) | 240);
                                    bArrArray[i10 + 1] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                    int i17 = i10 + 3;
                                    bArrArray[i10 + 2] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                    i10 += 4;
                                    bArrArray[i17] = (byte) ((codePoint2 & 63) | 128);
                                    i11 = i16;
                                } else {
                                    i11 = i16;
                                }
                            }
                            StringBuilder sb4 = new StringBuilder(39);
                            sb4.append("Unpaired surrogate at index ");
                            sb4.append(i11 - 1);
                            throw new IllegalArgumentException(sb4.toString());
                        }
                        bArrArray[i10] = (byte) ((cCharAt4 >>> '\f') | 480);
                        int i18 = i10 + 2;
                        bArrArray[i10 + 1] = (byte) (((cCharAt4 >>> 6) & 63) | 128);
                        i10 += 3;
                        bArrArray[i18] = (byte) ((cCharAt4 & '?') | 128);
                    }
                    i11++;
                    c10 = 57343;
                }
            }
            byteBuffer.position(i10 - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e10) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e10);
            throw bufferOverflowException;
        }
    }

    public static int q(int i10) {
        return z(i10 << 3);
    }

    public static int r(int i10, int i11) {
        return q(i10) + a(i11);
    }

    public static int s(int i10, long j10) {
        int i11;
        int iQ = q(i10);
        if (((-128) & j10) == 0) {
            i11 = 1;
        } else if (((-16384) & j10) == 0) {
            i11 = 2;
        } else if (((-2097152) & j10) == 0) {
            i11 = 3;
        } else if (((-268435456) & j10) == 0) {
            i11 = 4;
        } else if (((-34359738368L) & j10) == 0) {
            i11 = 5;
        } else if (((-4398046511104L) & j10) == 0) {
            i11 = 6;
            int i12 = 3 >> 6;
        } else if (((-562949953421312L) & j10) == 0) {
            i11 = 7;
        } else if (((-72057594037927936L) & j10) == 0) {
            i11 = 8;
        } else {
            i11 = (j10 & Long.MIN_VALUE) == 0 ? 9 : 10;
        }
        return iQ + i11;
    }

    public static int t(int i10, c7 c7Var) {
        int iQ = q(i10);
        int iD = c7Var.d();
        return iQ + z(iD) + iD;
    }

    public static int u(int i10, String str) {
        return q(i10) + c(str);
    }

    private final t2 v() throws IOException {
        if (this.f129618b == null) {
            this.f129618b = t2.e(this.f129617a);
            this.f129619c = this.f129617a.position();
        } else if (this.f129619c != this.f129617a.position()) {
            this.f129618b.S(this.f129617a.array(), this.f129619c, this.f129617a.position() - this.f129619c);
            this.f129619c = this.f129617a.position();
        }
        return this.f129618b;
    }

    public static int z(int i10) {
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

    public final void f() {
        if (this.f129617a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", Integer.valueOf(this.f129617a.remaining())));
        }
    }

    public final void g(float f10) throws IOException {
        int iFloatToIntBits = Float.floatToIntBits(f10);
        if (this.f129617a.remaining() < 4) {
            throw new v6(this.f129617a.position(), this.f129617a.limit());
        }
        this.f129617a.putInt(iFloatToIntBits);
    }

    public final void h(int i10, float f10) throws IOException {
        y(i10, 5);
        g(f10);
    }

    public final void i(int i10, int i11) throws IOException {
        y(i10, 0);
        if (i11 >= 0) {
            x(i11);
        } else {
            o(i11);
        }
    }

    public final void j(int i10, long j10) throws IOException {
        y(i10, 0);
        o(j10);
    }

    public final void k(int i10, t4 t4Var) throws IOException {
        t2 t2VarV = v();
        t2VarV.p(i10, t4Var);
        t2VarV.C0();
        this.f129619c = this.f129617a.position();
    }

    public final void l(int i10, c7 c7Var) throws IOException {
        y(i10, 2);
        x(c7Var.c());
        c7Var.k(this);
    }

    public final void m(int i10, String str) throws IOException {
        y(i10, 2);
        try {
            int iZ = z(str.length());
            if (iZ != z(str.length() * 3)) {
                x(b(str));
                p(str, this.f129617a);
                return;
            }
            int iPosition = this.f129617a.position();
            if (this.f129617a.remaining() < iZ) {
                throw new v6(iPosition + iZ, this.f129617a.limit());
            }
            this.f129617a.position(iPosition + iZ);
            p(str, this.f129617a);
            int iPosition2 = this.f129617a.position();
            this.f129617a.position(iPosition);
            x((iPosition2 - iPosition) - iZ);
            this.f129617a.position(iPosition2);
        } catch (BufferOverflowException e10) {
            v6 v6Var = new v6(this.f129617a.position(), this.f129617a.limit());
            v6Var.initCause(e10);
            throw v6Var;
        }
    }

    public final void n(int i10, boolean z10) throws IOException {
        y(i10, 0);
        byte b10 = z10 ? (byte) 1 : (byte) 0;
        if (!this.f129617a.hasRemaining()) {
            throw new v6(this.f129617a.position(), this.f129617a.limit());
        }
        this.f129617a.put(b10);
    }

    public final void w(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.f129617a.remaining() < length) {
            throw new v6(this.f129617a.position(), this.f129617a.limit());
        }
        this.f129617a.put(bArr, 0, length);
    }

    public final void x(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            A((i10 & 127) | 128);
            i10 >>>= 7;
        }
        A(i10);
    }

    public final void y(int i10, int i11) throws IOException {
        x((i10 << 3) | i11);
    }

    private u6(ByteBuffer byteBuffer) {
        this.f129617a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }
}
