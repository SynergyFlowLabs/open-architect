package androidx.media2.exoplayer.external.extractor.ogg;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f54658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f54660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f54661d;

    public j(byte[] data) {
        this.f54658a = data;
        this.f54659b = data.length;
    }

    private void a() {
        int i10;
        int i11 = this.f54660c;
        androidx.media2.exoplayer.external.util.a.i(i11 >= 0 && (i11 < (i10 = this.f54659b) || (i11 == i10 && this.f54661d == 0)));
    }

    public int b() {
        return ((this.f54659b - this.f54660c) * 8) - this.f54661d;
    }

    public int c() {
        return (this.f54660c * 8) + this.f54661d;
    }

    public boolean d() {
        boolean z10 = (((this.f54658a[this.f54660c] & 255) >> this.f54661d) & 1) == 1;
        h(1);
        return z10;
    }

    public int e(int numBits) {
        int i10 = this.f54660c;
        int iMin = Math.min(numBits, 8 - this.f54661d);
        int i11 = i10 + 1;
        int i12 = ((this.f54658a[i10] & 255) >> this.f54661d) & (255 >> (8 - iMin));
        while (iMin < numBits) {
            i12 |= (this.f54658a[i11] & 255) << iMin;
            iMin += 8;
            i11++;
        }
        int i13 = i12 & ((-1) >>> (32 - numBits));
        h(numBits);
        return i13;
    }

    public void f() {
        this.f54660c = 0;
        this.f54661d = 0;
    }

    public void g(int position) {
        int i10 = position / 8;
        this.f54660c = i10;
        this.f54661d = position - (i10 * 8);
        a();
    }

    public void h(int numBits) {
        int i10 = numBits / 8;
        int i11 = this.f54660c + i10;
        this.f54660c = i11;
        int i12 = this.f54661d + (numBits - (i10 * 8));
        this.f54661d = i12;
        if (i12 > 7) {
            this.f54660c = i11 + 1;
            this.f54661d = i12 - 8;
        }
        a();
    }
}
