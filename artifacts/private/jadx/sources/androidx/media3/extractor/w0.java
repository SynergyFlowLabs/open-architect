package androidx.media3.extractor;

import androidx.media3.common.util.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f69569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f69570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f69571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f69572d;

    public w0(byte[] bArr) {
        this.f69569a = bArr;
        this.f69570b = bArr.length;
    }

    private void a() {
        int i10;
        int i11 = this.f69571c;
        androidx.media3.common.util.a.i(i11 >= 0 && (i11 < (i10 = this.f69570b) || (i11 == i10 && this.f69572d == 0)));
    }

    public int b() {
        return ((this.f69570b - this.f69571c) * 8) - this.f69572d;
    }

    public int c() {
        return (this.f69571c * 8) + this.f69572d;
    }

    public boolean d() {
        boolean z10 = (((this.f69569a[this.f69571c] & 255) >> this.f69572d) & 1) == 1;
        h(1);
        return z10;
    }

    public int e(int i10) {
        int i11 = this.f69571c;
        int iMin = Math.min(i10, 8 - this.f69572d);
        int i12 = i11 + 1;
        int i13 = ((this.f69569a[i11] & 255) >> this.f69572d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f69569a[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        h(i10);
        return i14;
    }

    public void f() {
        this.f69571c = 0;
        this.f69572d = 0;
    }

    public void g(int i10) {
        int i11 = i10 / 8;
        this.f69571c = i11;
        this.f69572d = i10 - (i11 * 8);
        a();
    }

    public void h(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f69571c + i11;
        this.f69571c = i12;
        int i13 = this.f69572d + (i10 - (i11 * 8));
        this.f69572d = i13;
        if (i13 > 7) {
            this.f69571c = i12 + 1;
            this.f69572d = i13 - 8;
        }
        a();
    }
}
