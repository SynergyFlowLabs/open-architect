package androidx.media3.common.util;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class b0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f61469f = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f61470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f61471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f61472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f61473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f61474e;

    public b0() {
        this(16);
    }

    private void d() {
        long[] jArr = this.f61473d;
        int length = jArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        long[] jArr2 = new long[length];
        int length2 = jArr.length;
        int i10 = this.f61470a;
        int i11 = length2 - i10;
        System.arraycopy(jArr, i10, jArr2, 0, i11);
        System.arraycopy(this.f61473d, 0, jArr2, i11, i10);
        this.f61470a = 0;
        this.f61471b = this.f61472c - 1;
        this.f61473d = jArr2;
        this.f61474e = jArr2.length - 1;
    }

    public void a(long j10) {
        if (this.f61472c == this.f61473d.length) {
            d();
        }
        int i10 = (this.f61471b + 1) & this.f61474e;
        this.f61471b = i10;
        this.f61473d[i10] = j10;
        this.f61472c++;
    }

    @androidx.annotation.l1
    int b() {
        return this.f61473d.length;
    }

    public void c() {
        this.f61470a = 0;
        int i10 = 0 & (-1);
        this.f61471b = -1;
        this.f61472c = 0;
    }

    public long e() {
        if (this.f61472c != 0) {
            return this.f61473d[this.f61470a];
        }
        throw new NoSuchElementException();
    }

    public boolean f() {
        return this.f61472c == 0;
    }

    public long g() {
        int i10 = this.f61472c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f61473d;
        int i11 = this.f61470a;
        long j10 = jArr[i11];
        this.f61470a = this.f61474e & (i11 + 1);
        this.f61472c = i10 - 1;
        return j10;
    }

    public int h() {
        return this.f61472c;
    }

    public b0(int i10) {
        a.a(i10 >= 0 && i10 <= 1073741824);
        i10 = i10 == 0 ? 1 : i10;
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f61470a = 0;
        this.f61471b = -1;
        this.f61472c = 0;
        long[] jArr = new long[i10];
        this.f61473d = jArr;
        this.f61474e = jArr.length - 1;
    }
}
