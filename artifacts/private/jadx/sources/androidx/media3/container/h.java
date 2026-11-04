package androidx.media3.container;

import androidx.media3.common.util.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f62228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f62229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f62230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f62231d;

    public h(byte[] bArr, int i10, int i11) {
        j(bArr, i10, i11);
    }

    private void a() {
        int i10;
        int i11 = this.f62230c;
        androidx.media3.common.util.a.i(i11 >= 0 && (i11 < (i10 = this.f62229b) || (i11 == i10 && this.f62231d == 0)));
    }

    private int g() {
        int i10 = 0;
        while (!e()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? f(i10) : 0);
    }

    private boolean k(int i10) {
        if (2 > i10 || i10 >= this.f62229b) {
            return false;
        }
        byte[] bArr = this.f62228a;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 - 1] == 0;
    }

    public void b() {
        int i10 = this.f62231d;
        if (i10 > 0) {
            m(8 - i10);
        }
    }

    public boolean c(int i10) {
        int i11 = this.f62230c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f62231d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f62229b) {
                break;
            }
            if (k(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f62229b;
        if (i13 >= i15 && (i13 != i15 || i14 != 0)) {
            return false;
        }
        return true;
    }

    public boolean d() {
        int i10 = this.f62230c;
        int i11 = this.f62231d;
        int i12 = 0;
        while (this.f62230c < this.f62229b && !e()) {
            i12++;
        }
        boolean z10 = this.f62230c == this.f62229b;
        this.f62230c = i10;
        this.f62231d = i11;
        return !z10 && c((i12 * 2) + 1);
    }

    public boolean e() {
        boolean z10 = (this.f62228a[this.f62230c] & (128 >> this.f62231d)) != 0;
        l();
        return z10;
    }

    public int f(int i10) {
        int i11;
        this.f62231d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f62231d;
            int i13 = 2;
            if (i11 <= 8) {
                break;
            }
            int i14 = i11 - 8;
            this.f62231d = i14;
            byte[] bArr = this.f62228a;
            int i15 = this.f62230c;
            i12 |= (bArr[i15] & 255) << i14;
            if (!k(i15 + 1)) {
                i13 = 1;
            }
            this.f62230c = i15 + i13;
        }
        byte[] bArr2 = this.f62228a;
        int i16 = this.f62230c;
        int i17 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i16] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f62231d = 0;
            this.f62230c = i16 + (k(i16 + 1) ? 2 : 1);
        }
        a();
        return i17;
    }

    public int h() {
        int iG = g();
        int i10 = 5 & 1;
        return (iG % 2 == 0 ? -1 : 1) * ((iG + 1) / 2);
    }

    public int i() {
        return g();
    }

    public void j(byte[] bArr, int i10, int i11) {
        this.f62228a = bArr;
        this.f62230c = i10;
        this.f62229b = i11;
        this.f62231d = 0;
        a();
    }

    public void l() {
        int i10 = this.f62231d + 1;
        this.f62231d = i10;
        if (i10 == 8) {
            this.f62231d = 0;
            int i11 = this.f62230c;
            this.f62230c = i11 + (k(i11 + 1) ? 2 : 1);
        }
        a();
    }

    public void m(int i10) {
        int i11 = this.f62230c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f62230c = i13;
        int i14 = this.f62231d + (i10 - (i12 * 8));
        this.f62231d = i14;
        if (i14 > 7) {
            this.f62230c = i13 + 1;
            this.f62231d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f62230c) {
                a();
                return;
            } else if (k(i11)) {
                this.f62230c++;
                i11 += 2;
            }
        }
    }
}
