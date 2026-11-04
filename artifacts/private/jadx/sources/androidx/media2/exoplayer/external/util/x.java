package androidx.media2.exoplayer.external.util;

import androidx.annotation.b1;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f57720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f57721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f57722c;

    public x() {
        this.f57720a = q0.f57631f;
    }

    public String A(int length) {
        return B(length, Charset.forName("UTF-8"));
    }

    public String B(int length, Charset charset) {
        String str = new String(this.f57720a, this.f57721b, length, charset);
        this.f57721b += length;
        return str;
    }

    public int C() {
        return D() | (D() << 21) | (D() << 14) | (D() << 7);
    }

    public int D() {
        byte[] bArr = this.f57720a;
        int i10 = this.f57721b;
        this.f57721b = i10 + 1;
        return bArr[i10] & 255;
    }

    public int E() {
        byte[] bArr = this.f57720a;
        int i10 = this.f57721b;
        int i11 = i10 + 1;
        this.f57721b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f57721b = i10 + 2;
        int i13 = (bArr[i11] & 255) | i12;
        this.f57721b = i10 + 4;
        return i13;
    }

    public long F() {
        byte[] bArr = this.f57720a;
        int i10 = this.f57721b;
        int i11 = i10 + 1;
        this.f57721b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i10 + 2;
        this.f57721b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16);
        int i13 = i10 + 3;
        this.f57721b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        this.f57721b = i10 + 4;
        return (((long) bArr[i13]) & 255) | j12;
    }

    public int G() {
        byte[] bArr = this.f57720a;
        int i10 = this.f57721b;
        int i11 = i10 + 1;
        this.f57721b = i11;
        int i12 = (bArr[i10] & 255) << 16;
        int i13 = i10 + 2;
        this.f57721b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f57721b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    public int H() {
        int iL = l();
        if (iL >= 0) {
            return iL;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("Top bit not zero: ");
        sb2.append(iL);
        throw new IllegalStateException(sb2.toString());
    }

    public long I() {
        long jW = w();
        if (jW >= 0) {
            return jW;
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("Top bit not zero: ");
        sb2.append(jW);
        throw new IllegalStateException(sb2.toString());
    }

    public int J() {
        byte[] bArr = this.f57720a;
        int i10 = this.f57721b;
        int i11 = i10 + 1;
        this.f57721b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f57721b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public long K() {
        int i10;
        int i11;
        long j10 = this.f57720a[this.f57721b];
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
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("Invalid UTF-8 sequence first byte: ");
            sb2.append(j10);
            throw new NumberFormatException(sb2.toString());
        }
        for (i10 = 1; i10 < i11; i10++) {
            byte b10 = this.f57720a[this.f57721b + i10];
            if ((b10 & org.msgpack.core.h.a.f339269e) != 128) {
                StringBuilder sb3 = new StringBuilder(62);
                sb3.append("Invalid UTF-8 sequence continuation byte: ");
                sb3.append(j10);
                throw new NumberFormatException(sb3.toString());
            }
            j10 = (j10 << 6) | ((long) (b10 & 63));
        }
        this.f57721b += i11;
        return j10;
    }

    public void L() {
        this.f57721b = 0;
        this.f57722c = 0;
    }

    public void M(int limit) {
        O(b() < limit ? new byte[limit] : this.f57720a, limit);
    }

    public void N(byte[] data) {
        O(data, data.length);
    }

    public void O(byte[] data, int limit) {
        this.f57720a = data;
        this.f57722c = limit;
        this.f57721b = 0;
    }

    public void P(int limit) {
        a.a(limit >= 0 && limit <= this.f57720a.length);
        this.f57722c = limit;
    }

    public void Q(int position) {
        a.a(position >= 0 && position <= this.f57722c);
        this.f57721b = position;
    }

    public void R(int bytes) {
        Q(this.f57721b + bytes);
    }

    public int a() {
        return this.f57722c - this.f57721b;
    }

    public int b() {
        return this.f57720a.length;
    }

    public int c() {
        return this.f57721b;
    }

    public int d() {
        return this.f57722c;
    }

    public char e() {
        byte[] bArr = this.f57720a;
        int i10 = this.f57721b;
        return (char) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    public int f() {
        return this.f57720a[this.f57721b] & 255;
    }

    public void g(w bitArray, int length) {
        i(bitArray.f57716a, 0, length);
        bitArray.n(0);
    }

    public void h(ByteBuffer buffer, int length) {
        buffer.put(this.f57720a, this.f57721b, length);
        this.f57721b += length;
    }

    public void i(byte[] buffer, int offset, int length) {
        System.arraycopy(this.f57720a, this.f57721b, buffer, offset, length);
        this.f57721b += length;
    }

    public double j() {
        return Double.longBitsToDouble(w());
    }

    public float k() {
        return Float.intBitsToFloat(l());
    }

    public int l() {
        byte[] bArr = this.f57720a;
        int i10 = this.f57721b;
        int i11 = i10 + 1;
        this.f57721b = i11;
        int i12 = (bArr[i10] & 255) << 24;
        int i13 = i10 + 2;
        this.f57721b = i13;
        int i14 = ((bArr[i11] & 255) << 16) | i12;
        int i15 = i10 + 3;
        this.f57721b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        this.f57721b = i10 + 4;
        return (bArr[i15] & 255) | i16;
    }

    public int m() {
        byte[] bArr = this.f57720a;
        int i10 = this.f57721b;
        int i11 = i10 + 1;
        this.f57721b = i11;
        int i12 = ((bArr[i10] & 255) << 24) >> 8;
        int i13 = i10 + 2;
        this.f57721b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f57721b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    @androidx.annotation.p0
    public String n() {
        int i10;
        if (a() == 0) {
            return null;
        }
        int i11 = this.f57721b;
        while (i11 < this.f57722c && !q0.p0(this.f57720a[i11])) {
            i11++;
        }
        int i12 = this.f57721b;
        if (i11 - i12 >= 3) {
            byte[] bArr = this.f57720a;
            if (bArr[i12] == -17 && bArr[i12 + 1] == -69 && bArr[i12 + 2] == -65) {
                this.f57721b = i12 + 3;
            }
        }
        byte[] bArr2 = this.f57720a;
        int i13 = this.f57721b;
        String strD = q0.D(bArr2, i13, i11 - i13);
        this.f57721b = i11;
        int i14 = this.f57722c;
        if (i11 != i14) {
            byte[] bArr3 = this.f57720a;
            if (bArr3[i11] == 13) {
                int i15 = i11 + 1;
                this.f57721b = i15;
                if (i15 != i14) {
                    i10 = this.f57721b;
                    if (bArr3[i10] == 10) {
                        this.f57721b = i10 + 1;
                    }
                }
            } else {
                i10 = this.f57721b;
                if (bArr3[i10] == 10) {
                    this.f57721b = i10 + 1;
                }
            }
        }
        return strD;
    }

    public int o() {
        byte[] bArr = this.f57720a;
        int i10 = this.f57721b;
        int i11 = i10 + 1;
        this.f57721b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f57721b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        int i15 = i10 + 3;
        this.f57721b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 16);
        this.f57721b = i10 + 4;
        return ((bArr[i15] & 255) << 24) | i16;
    }

    public int p() {
        byte[] bArr = this.f57720a;
        int i10 = this.f57721b;
        int i11 = i10 + 1;
        this.f57721b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f57721b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f57721b = i10 + 3;
        return ((bArr[i13] & 255) << 16) | i14;
    }

    public long q() {
        byte[] bArr = this.f57720a;
        int i10 = this.f57721b;
        int i11 = i10 + 1;
        this.f57721b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f57721b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f57721b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i10 + 4;
        this.f57721b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i10 + 5;
        this.f57721b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i10 + 6;
        this.f57721b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i10 + 7;
        this.f57721b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 48);
        this.f57721b = i10 + 8;
        return ((((long) bArr[i17]) & 255) << 56) | j16;
    }

    public short r() {
        byte[] bArr = this.f57720a;
        int i10 = this.f57721b;
        int i11 = i10 + 1;
        this.f57721b = i11;
        int i12 = bArr[i10] & 255;
        this.f57721b = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public long s() {
        byte[] bArr = this.f57720a;
        int i10 = this.f57721b;
        int i11 = i10 + 1;
        this.f57721b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f57721b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f57721b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        this.f57721b = i10 + 4;
        return ((((long) bArr[i13]) & 255) << 24) | j12;
    }

    public int t() {
        byte[] bArr = this.f57720a;
        int i10 = this.f57721b;
        int i11 = i10 + 1;
        this.f57721b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f57721b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f57721b = i10 + 3;
        return ((bArr[i13] & 255) << 16) | i14;
    }

    public int u() {
        int iO = o();
        if (iO >= 0) {
            return iO;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("Top bit not zero: ");
        sb2.append(iO);
        throw new IllegalStateException(sb2.toString());
    }

    public int v() {
        byte[] bArr = this.f57720a;
        int i10 = this.f57721b;
        int i11 = i10 + 1;
        this.f57721b = i11;
        int i12 = bArr[i10] & 255;
        this.f57721b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public long w() {
        byte[] bArr = this.f57720a;
        int i10 = this.f57721b;
        int i11 = i10 + 1;
        this.f57721b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i10 + 2;
        this.f57721b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48);
        int i13 = i10 + 3;
        this.f57721b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i10 + 4;
        this.f57721b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i10 + 5;
        this.f57721b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i10 + 6;
        this.f57721b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i10 + 7;
        this.f57721b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 8);
        this.f57721b = i10 + 8;
        return (((long) bArr[i17]) & 255) | j16;
    }

    @androidx.annotation.p0
    public String x() {
        if (a() == 0) {
            boolean z10 = false;
            return null;
        }
        int i10 = this.f57721b;
        while (i10 < this.f57722c && this.f57720a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f57720a;
        int i11 = this.f57721b;
        String strD = q0.D(bArr, i11, i10 - i11);
        this.f57721b = i10;
        if (i10 < this.f57722c) {
            this.f57721b = i10 + 1;
        }
        return strD;
    }

    public String y(int length) {
        if (length == 0) {
            return "";
        }
        int i10 = this.f57721b;
        int i11 = (i10 + length) - 1;
        String strD = q0.D(this.f57720a, i10, (i11 >= this.f57722c || this.f57720a[i11] != 0) ? length : length - 1);
        this.f57721b += length;
        return strD;
    }

    public short z() {
        byte[] bArr = this.f57720a;
        int i10 = this.f57721b;
        int i11 = i10 + 1;
        this.f57721b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f57721b = i10 + 2;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public x(int limit) {
        this.f57720a = new byte[limit];
        this.f57722c = limit;
    }

    public x(byte[] data) {
        this.f57720a = data;
        this.f57722c = data.length;
    }

    public x(byte[] data, int limit) {
        this.f57720a = data;
        this.f57722c = limit;
    }
}
