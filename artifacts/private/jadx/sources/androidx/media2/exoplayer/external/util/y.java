package androidx.media2.exoplayer.external.util;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f57723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f57724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f57725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f57726d;

    public y(byte[] data, int offset, int limit) {
        i(data, offset, limit);
    }

    private void a() {
        int i10;
        int i11 = this.f57725c;
        a.i(i11 >= 0 && (i11 < (i10 = this.f57724b) || (i11 == i10 && this.f57726d == 0)));
    }

    private int f() {
        int i10 = 0;
        while (!d()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? e(i10) : 0);
    }

    private boolean j(int offset) {
        if (2 > offset || offset >= this.f57724b) {
            return false;
        }
        byte[] bArr = this.f57723a;
        return bArr[offset] == 3 && bArr[offset + (-2)] == 0 && bArr[offset - 1] == 0;
    }

    public boolean b(int numBits) {
        int i10 = this.f57725c;
        int i11 = numBits / 8;
        int i12 = i10 + i11;
        int i13 = (this.f57726d + numBits) - (i11 * 8);
        if (i13 > 7) {
            i12++;
            i13 -= 8;
        }
        while (true) {
            i10++;
            if (i10 > i12 || i12 >= this.f57724b) {
                break;
            }
            if (j(i10)) {
                i12++;
                i10 += 2;
            }
        }
        int i14 = this.f57724b;
        if (i12 >= i14 && (i12 != i14 || i13 != 0)) {
            return false;
        }
        return true;
    }

    public boolean c() {
        int i10 = this.f57725c;
        int i11 = this.f57726d;
        int i12 = 0;
        while (this.f57725c < this.f57724b && !d()) {
            i12++;
        }
        boolean z10 = this.f57725c == this.f57724b;
        this.f57725c = i10;
        this.f57726d = i11;
        return !z10 && b((i12 * 2) + 1);
    }

    public boolean d() {
        boolean z10 = (this.f57723a[this.f57725c] & (128 >> this.f57726d)) != 0;
        k();
        return z10;
    }

    public int e(int numBits) {
        int i10;
        this.f57726d += numBits;
        int i11 = 0;
        while (true) {
            i10 = this.f57726d;
            int i12 = 2;
            if (i10 <= 8) {
                break;
            }
            int i13 = i10 - 8;
            this.f57726d = i13;
            byte[] bArr = this.f57723a;
            int i14 = this.f57725c;
            i11 |= (bArr[i14] & 255) << i13;
            if (!j(i14 + 1)) {
                i12 = 1;
            }
            this.f57725c = i14 + i12;
        }
        byte[] bArr2 = this.f57723a;
        int i15 = this.f57725c;
        int i16 = ((-1) >>> (32 - numBits)) & (i11 | ((bArr2[i15] & 255) >> (8 - i10)));
        if (i10 == 8) {
            this.f57726d = 0;
            this.f57725c = i15 + (j(i15 + 1) ? 2 : 1);
        }
        a();
        return i16;
    }

    public int g() {
        int iF = f();
        return (iF % 2 == 0 ? -1 : 1) * ((iF + 1) / 2);
    }

    public int h() {
        return f();
    }

    public void i(byte[] data, int offset, int limit) {
        this.f57723a = data;
        this.f57725c = offset;
        this.f57724b = limit;
        this.f57726d = 0;
        a();
    }

    public void k() {
        int i10 = this.f57726d + 1;
        this.f57726d = i10;
        if (i10 == 8) {
            this.f57726d = 0;
            int i11 = this.f57725c;
            this.f57725c = i11 + (j(i11 + 1) ? 2 : 1);
        }
        a();
    }

    public void l(int numBits) {
        int i10 = this.f57725c;
        int i11 = numBits / 8;
        int i12 = i10 + i11;
        this.f57725c = i12;
        int i13 = this.f57726d + (numBits - (i11 * 8));
        this.f57726d = i13;
        if (i13 > 7) {
            this.f57725c = i12 + 1;
            this.f57726d = i13 - 8;
        }
        while (true) {
            i10++;
            if (i10 > this.f57725c) {
                a();
                return;
            } else if (j(i10)) {
                this.f57725c++;
                i10 += 2;
            }
        }
    }
}
