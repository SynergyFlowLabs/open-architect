package androidx.media2.exoplayer.external.util;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f57716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f57717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f57718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f57719d;

    public w() {
        this.f57716a = q0.f57631f;
    }

    private void a() {
        int i10;
        int i11 = this.f57717b;
        a.i(i11 >= 0 && (i11 < (i10 = this.f57719d) || (i11 == i10 && this.f57718c == 0)));
    }

    public int b() {
        return ((this.f57719d - this.f57717b) * 8) - this.f57718c;
    }

    public void c() {
        if (this.f57718c == 0) {
            return;
        }
        this.f57718c = 0;
        this.f57717b++;
        a();
    }

    public int d() {
        a.i(this.f57718c == 0);
        return this.f57717b;
    }

    public int e() {
        return (this.f57717b * 8) + this.f57718c;
    }

    public void f(int value, int numBits) {
        if (numBits < 32) {
            value &= (1 << numBits) - 1;
        }
        int iMin = Math.min(8 - this.f57718c, numBits);
        int i10 = this.f57718c;
        int i11 = (8 - i10) - iMin;
        int i12 = (androidx.core.view.s0.f48920f >> i10) | ((1 << i11) - 1);
        byte[] bArr = this.f57716a;
        int i13 = this.f57717b;
        byte b10 = (byte) (i12 & bArr[i13]);
        bArr[i13] = b10;
        int i14 = numBits - iMin;
        bArr[i13] = (byte) (b10 | ((value >>> i14) << i11));
        int i15 = i13 + 1;
        while (i14 > 8) {
            this.f57716a[i15] = (byte) (value >>> (i14 - 8));
            i14 -= 8;
            i15++;
        }
        int i16 = 8 - i14;
        byte[] bArr2 = this.f57716a;
        byte b11 = (byte) (bArr2[i15] & ((1 << i16) - 1));
        bArr2[i15] = b11;
        bArr2[i15] = (byte) (((value & ((1 << i14) - 1)) << i16) | b11);
        p(numBits);
        a();
    }

    public boolean g() {
        boolean z10 = (this.f57716a[this.f57717b] & (128 >> this.f57718c)) != 0;
        o();
        return z10;
    }

    public int h(int numBits) {
        int i10;
        if (numBits == 0) {
            return 0;
        }
        this.f57718c += numBits;
        int i11 = 0;
        while (true) {
            i10 = this.f57718c;
            if (i10 <= 8) {
                break;
            }
            int i12 = i10 - 8;
            this.f57718c = i12;
            byte[] bArr = this.f57716a;
            int i13 = this.f57717b;
            this.f57717b = i13 + 1;
            i11 |= (bArr[i13] & 255) << i12;
        }
        byte[] bArr2 = this.f57716a;
        int i14 = this.f57717b;
        int i15 = ((-1) >>> (32 - numBits)) & (i11 | ((bArr2[i14] & 255) >> (8 - i10)));
        if (i10 == 8) {
            this.f57718c = 0;
            this.f57717b = i14 + 1;
        }
        a();
        return i15;
    }

    public void i(byte[] buffer, int offset, int numBits) {
        int i10 = (numBits >> 3) + offset;
        while (offset < i10) {
            byte[] bArr = this.f57716a;
            int i11 = this.f57717b;
            int i12 = i11 + 1;
            this.f57717b = i12;
            byte b10 = bArr[i11];
            int i13 = this.f57718c;
            byte b11 = (byte) (b10 << i13);
            buffer[offset] = b11;
            buffer[offset] = (byte) (((255 & bArr[i12]) >> (8 - i13)) | b11);
            offset++;
        }
        int i14 = numBits & 7;
        if (i14 == 0) {
            return;
        }
        byte b12 = (byte) (buffer[i10] & (255 >> i14));
        buffer[i10] = b12;
        int i15 = this.f57718c;
        if (i15 + i14 > 8) {
            byte[] bArr2 = this.f57716a;
            int i16 = this.f57717b;
            this.f57717b = i16 + 1;
            buffer[i10] = (byte) (b12 | ((bArr2[i16] & 255) << i15));
            this.f57718c = i15 - 8;
        }
        int i17 = this.f57718c + i14;
        this.f57718c = i17;
        byte[] bArr3 = this.f57716a;
        int i18 = this.f57717b;
        buffer[i10] = (byte) (((byte) (((255 & bArr3[i18]) >> (8 - i17)) << (8 - i14))) | buffer[i10]);
        if (i17 == 8) {
            this.f57718c = 0;
            this.f57717b = i18 + 1;
        }
        a();
    }

    public void j(byte[] buffer, int offset, int length) {
        boolean z10;
        if (this.f57718c == 0) {
            z10 = true;
            int i10 = 3 ^ 1;
        } else {
            z10 = false;
        }
        a.i(z10);
        System.arraycopy(this.f57716a, this.f57717b, buffer, offset, length);
        this.f57717b += length;
        a();
    }

    public void k(x parsableByteArray) {
        m(parsableByteArray.f57720a, parsableByteArray.d());
        n(parsableByteArray.c() * 8);
    }

    public void l(byte[] data) {
        m(data, data.length);
    }

    public void m(byte[] data, int limit) {
        this.f57716a = data;
        this.f57717b = 0;
        this.f57718c = 0;
        this.f57719d = limit;
    }

    public void n(int position) {
        int i10 = position / 8;
        this.f57717b = i10;
        this.f57718c = position - (i10 * 8);
        a();
    }

    public void o() {
        int i10 = this.f57718c + 1;
        this.f57718c = i10;
        if (i10 == 8) {
            this.f57718c = 0;
            this.f57717b++;
        }
        a();
    }

    public void p(int numBits) {
        int i10 = numBits / 8;
        int i11 = this.f57717b + i10;
        this.f57717b = i11;
        int i12 = this.f57718c + (numBits - (i10 * 8));
        this.f57718c = i12;
        int i13 = 4 ^ 7;
        if (i12 > 7) {
            this.f57717b = i11 + 1;
            this.f57718c = i12 - 8;
        }
        a();
    }

    public void q(int length) {
        a.i(this.f57718c == 0);
        this.f57717b += length;
        a();
    }

    public w(byte[] data) {
        this(data, data.length);
    }

    public w(byte[] data, int limit) {
        this.f57716a = data;
        this.f57719d = limit;
    }
}
