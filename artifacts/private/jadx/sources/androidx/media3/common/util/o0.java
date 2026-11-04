package androidx.media3.common.util;

import com.google.common.collect.z6;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@b1
@z7.b
public final class o0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f61585d = {org.apache.commons.lang3.k.f337188d, '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f61586e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final z6<Charset> f61587f = z6.N(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f61588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f61589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f61590c;

    public o0() {
        this.f61588a = k1.f61545f;
    }

    private void c0(Charset charset) {
        if (o(charset, f61585d) == '\r') {
            o(charset, f61586e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bb A[SYNTHETIC] */
    private int d(Charset charset) {
        int i10;
        byte[] bArr;
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
            i10 = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        }
        int i11 = this.f61589b;
        while (true) {
            int i12 = this.f61590c;
            if (i11 >= i12 - (i10 - 1)) {
                return i12;
            }
            if ((!charset.equals(StandardCharsets.UTF_8) && !charset.equals(StandardCharsets.US_ASCII)) || !k1.j1(this.f61588a[i11])) {
                if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    byte[] bArr2 = this.f61588a;
                    if (bArr2[i11] != 0 || !k1.j1(bArr2[i11 + 1])) {
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            bArr = this.f61588a;
                            if (bArr[i11 + 1] != 0 || !k1.j1(bArr[i11])) {
                            }
                        }
                        i11 += i10;
                    }
                } else {
                    if (charset.equals(StandardCharsets.UTF_16LE)) {
                        bArr = this.f61588a;
                        if (bArr[i11 + 1] != 0) {
                            continue;
                        }
                    }
                    i11 += i10;
                }
            }
            return i11;
        }
    }

    private int j(Charset charset) {
        byte b10;
        byte b11;
        byte b12 = 1;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && a() >= 1) {
            b10 = this.f61588a[this.f61589b];
            b11 = 0;
        } else {
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && a() >= 2) {
                byte[] bArr = this.f61588a;
                int i10 = this.f61589b;
                b11 = bArr[i10];
                b10 = bArr[i10 + 1];
            } else {
                if (!charset.equals(StandardCharsets.UTF_16LE) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f61588a;
                int i11 = this.f61589b;
                b11 = bArr2[i11 + 1];
                b10 = bArr2[i11];
            }
            b12 = 2;
        }
        return com.google.common.primitives.l.l(b11, b10, (byte) 0, b12);
    }

    private char o(Charset charset, char[] cArr) {
        int iJ = j(charset);
        if (iJ == 0) {
            return (char) 0;
        }
        char c10 = (char) (iJ >> 16);
        if (!com.google.common.primitives.c.i(cArr, c10)) {
            return (char) 0;
        }
        this.f61589b += iJ & 65535;
        return c10;
    }

    public long A() {
        byte[] bArr = this.f61588a;
        int i10 = this.f61589b;
        int i11 = i10 + 1;
        this.f61589b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f61589b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f61589b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        this.f61589b = i10 + 4;
        return ((((long) bArr[i13]) & 255) << 24) | j12;
    }

    public int B() {
        byte[] bArr = this.f61588a;
        int i10 = this.f61589b;
        int i11 = i10 + 1;
        this.f61589b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f61589b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f61589b = i10 + 3;
        return ((bArr[i13] & 255) << 16) | i14;
    }

    public int C() {
        int iW = w();
        if (iW >= 0) {
            return iW;
        }
        throw new IllegalStateException("Top bit not zero: " + iW);
    }

    public int D() {
        byte[] bArr = this.f61588a;
        int i10 = this.f61589b;
        int i11 = i10 + 1;
        this.f61589b = i11;
        int i12 = bArr[i10] & 255;
        this.f61589b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public long E() {
        byte[] bArr = this.f61588a;
        int i10 = this.f61589b;
        int i11 = i10 + 1;
        this.f61589b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i10 + 2;
        this.f61589b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48);
        int i13 = i10 + 3;
        this.f61589b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i10 + 4;
        this.f61589b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i10 + 5;
        this.f61589b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i10 + 6;
        this.f61589b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i10 + 7;
        this.f61589b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 8);
        this.f61589b = i10 + 8;
        return (((long) bArr[i17]) & 255) | j16;
    }

    @androidx.annotation.p0
    public String F() {
        return p((char) 0);
    }

    public String G(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f61589b;
        int i12 = (i11 + i10) - 1;
        String strU = k1.U(this.f61588a, i11, (i12 >= this.f61590c || this.f61588a[i12] != 0) ? i10 : i10 - 1);
        this.f61589b += i10;
        return strU;
    }

    public short H() {
        byte[] bArr = this.f61588a;
        int i10 = this.f61589b;
        int i11 = i10 + 1;
        this.f61589b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f61589b = i10 + 2;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public String I(int i10) {
        return J(i10, StandardCharsets.UTF_8);
    }

    public String J(int i10, Charset charset) {
        String str = new String(this.f61588a, this.f61589b, i10, charset);
        this.f61589b += i10;
        return str;
    }

    public int K() {
        return L() | (L() << 21) | (L() << 14) | (L() << 7);
    }

    public int L() {
        byte[] bArr = this.f61588a;
        int i10 = this.f61589b;
        this.f61589b = i10 + 1;
        return bArr[i10] & 255;
    }

    public int M() {
        byte[] bArr = this.f61588a;
        int i10 = this.f61589b;
        int i11 = i10 + 1;
        this.f61589b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f61589b = i10 + 2;
        int i13 = (bArr[i11] & 255) | i12;
        this.f61589b = i10 + 4;
        return i13;
    }

    public long N() {
        byte[] bArr = this.f61588a;
        int i10 = this.f61589b;
        int i11 = i10 + 1;
        this.f61589b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i10 + 2;
        this.f61589b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16);
        int i13 = i10 + 3;
        this.f61589b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        this.f61589b = i10 + 4;
        return (((long) bArr[i13]) & 255) | j12;
    }

    public int O() {
        byte[] bArr = this.f61588a;
        int i10 = this.f61589b;
        int i11 = i10 + 1;
        this.f61589b = i11;
        int i12 = (bArr[i10] & 255) << 16;
        int i13 = i10 + 2;
        this.f61589b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f61589b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    public int P() {
        int iS = s();
        if (iS >= 0) {
            return iS;
        }
        throw new IllegalStateException("Top bit not zero: " + iS);
    }

    public int Q() {
        return com.google.common.primitives.l.e(R());
    }

    public long R() {
        long j10 = 0;
        for (int i10 = 0; i10 < 9; i10++) {
            if (this.f61589b == this.f61590c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jL = L();
            j10 |= (127 & jL) << (i10 * 7);
            if ((jL & 128) == 0) {
                return j10;
            }
        }
        return j10;
    }

    public long S() {
        long jE = E();
        if (jE >= 0) {
            return jE;
        }
        throw new IllegalStateException("Top bit not zero: " + jE);
    }

    public int T() {
        byte[] bArr = this.f61588a;
        int i10 = this.f61589b;
        int i11 = i10 + 1;
        this.f61589b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f61589b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public long U() {
        int i10;
        int i11;
        long j10 = this.f61588a[this.f61589b];
        int i12 = 7;
        while (true) {
            if (i12 >= 0) {
                int i13 = 1 << i12;
                if ((((long) i13) & j10) == 0) {
                    if (i12 < 6) {
                        j10 &= (long) (i13 - 1);
                        i11 = 7 - i12;
                        break;
                    }
                    if (i12 == 7) {
                        i11 = 1;
                        break;
                    }
                } else {
                    i12--;
                }
            }
            i11 = 0;
            break;
        }
        if (i11 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
        }
        for (i10 = 1; i10 < i11; i10++) {
            byte b10 = this.f61588a[this.f61589b + i10];
            if ((b10 & org.msgpack.core.h.a.f339269e) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | ((long) (b10 & 63));
        }
        this.f61589b += i11;
        return j10;
    }

    @androidx.annotation.p0
    public Charset V() {
        if (a() >= 3) {
            byte[] bArr = this.f61588a;
            int i10 = this.f61589b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f61589b = i10 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() >= 2) {
            byte[] bArr2 = this.f61588a;
            int i11 = this.f61589b;
            byte b10 = bArr2[i11];
            if (b10 == -2 && bArr2[i11 + 1] == -1) {
                this.f61589b = i11 + 2;
                return StandardCharsets.UTF_16BE;
            }
            if (b10 == -1 && bArr2[i11 + 1] == -2) {
                this.f61589b = i11 + 2;
                return StandardCharsets.UTF_16LE;
            }
        }
        return null;
    }

    public void W(int i10) {
        Y(b() < i10 ? new byte[i10] : this.f61588a, i10);
    }

    public void X(byte[] bArr) {
        Y(bArr, bArr.length);
    }

    public void Y(byte[] bArr, int i10) {
        this.f61588a = bArr;
        this.f61590c = i10;
        this.f61589b = 0;
    }

    public void Z(int i10) {
        a.a(i10 >= 0 && i10 <= this.f61588a.length);
        this.f61590c = i10;
    }

    public int a() {
        return this.f61590c - this.f61589b;
    }

    public void a0(int i10) {
        a.a(i10 >= 0 && i10 <= this.f61590c);
        this.f61589b = i10;
    }

    public int b() {
        return this.f61588a.length;
    }

    public void b0(int i10) {
        a0(this.f61589b + i10);
    }

    public void c(int i10) {
        if (i10 > b()) {
            this.f61588a = Arrays.copyOf(this.f61588a, i10);
        }
    }

    public byte[] e() {
        return this.f61588a;
    }

    public int f() {
        return this.f61589b;
    }

    public int g() {
        return this.f61590c;
    }

    public char h() {
        byte[] bArr = this.f61588a;
        int i10 = this.f61589b;
        return (char) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    public char i(Charset charset) {
        a.b(f61587f.contains(charset), "Unsupported charset: " + charset);
        return (char) (j(charset) >> 16);
    }

    public int k() {
        return this.f61588a[this.f61589b] & 255;
    }

    public void l(n0 n0Var, int i10) {
        n(n0Var.f61581a, 0, i10);
        n0Var.q(0);
    }

    public void m(ByteBuffer byteBuffer, int i10) {
        byteBuffer.put(this.f61588a, this.f61589b, i10);
        this.f61589b += i10;
    }

    public void n(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f61588a, this.f61589b, bArr, i10, i11);
        this.f61589b += i11;
    }

    @androidx.annotation.p0
    public String p(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f61589b;
        while (i10 < this.f61590c && this.f61588a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f61588a;
        int i11 = this.f61589b;
        String strU = k1.U(bArr, i11, i10 - i11);
        this.f61589b = i10;
        if (i10 < this.f61590c) {
            this.f61589b = i10 + 1;
        }
        return strU;
    }

    public double q() {
        return Double.longBitsToDouble(E());
    }

    public float r() {
        return Float.intBitsToFloat(s());
    }

    public int s() {
        byte[] bArr = this.f61588a;
        int i10 = this.f61589b;
        int i11 = i10 + 1;
        this.f61589b = i11;
        int i12 = (bArr[i10] & 255) << 24;
        int i13 = i10 + 2;
        this.f61589b = i13;
        int i14 = ((bArr[i11] & 255) << 16) | i12;
        int i15 = i10 + 3;
        this.f61589b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        this.f61589b = i10 + 4;
        return (bArr[i15] & 255) | i16;
    }

    public int t() {
        byte[] bArr = this.f61588a;
        int i10 = this.f61589b;
        int i11 = i10 + 1;
        this.f61589b = i11;
        int i12 = ((bArr[i10] & 255) << 24) >> 8;
        int i13 = i10 + 2;
        this.f61589b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f61589b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    @androidx.annotation.p0
    public String u() {
        return v(StandardCharsets.UTF_8);
    }

    @androidx.annotation.p0
    public String v(Charset charset) {
        a.b(f61587f.contains(charset), "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            V();
        }
        String strJ = J(d(charset) - this.f61589b, charset);
        if (this.f61589b == this.f61590c) {
            return strJ;
        }
        c0(charset);
        return strJ;
    }

    public int w() {
        byte[] bArr = this.f61588a;
        int i10 = this.f61589b;
        int i11 = i10 + 1;
        this.f61589b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f61589b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        int i15 = i10 + 3;
        this.f61589b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 16);
        this.f61589b = i10 + 4;
        return ((bArr[i15] & 255) << 24) | i16;
    }

    public int x() {
        byte[] bArr = this.f61588a;
        int i10 = this.f61589b;
        int i11 = i10 + 1;
        this.f61589b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f61589b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f61589b = i10 + 3;
        return ((bArr[i13] & 255) << 16) | i14;
    }

    public long y() {
        byte[] bArr = this.f61588a;
        int i10 = this.f61589b;
        int i11 = i10 + 1;
        this.f61589b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f61589b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f61589b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i10 + 4;
        this.f61589b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i10 + 5;
        this.f61589b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i10 + 6;
        this.f61589b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i10 + 7;
        this.f61589b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 48);
        this.f61589b = i10 + 8;
        return ((((long) bArr[i17]) & 255) << 56) | j16;
    }

    public short z() {
        byte[] bArr = this.f61588a;
        int i10 = this.f61589b;
        int i11 = i10 + 1;
        this.f61589b = i11;
        int i12 = bArr[i10] & 255;
        this.f61589b = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public o0(int i10) {
        this.f61588a = new byte[i10];
        this.f61590c = i10;
    }

    public o0(byte[] bArr) {
        this.f61588a = bArr;
        this.f61590c = bArr.length;
    }

    public o0(byte[] bArr, int i10) {
        this.f61588a = bArr;
        this.f61590c = i10;
    }
}
