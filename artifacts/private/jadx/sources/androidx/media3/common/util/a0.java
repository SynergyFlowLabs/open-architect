package androidx.media3.common.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f61461c = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f61462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f61463b;

    public a0() {
        this(32);
    }

    public void a(long j10) {
        int i10 = this.f61462a;
        long[] jArr = this.f61463b;
        if (i10 == jArr.length) {
            this.f61463b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f61463b;
        int i11 = this.f61462a;
        this.f61462a = i11 + 1;
        jArr2[i11] = j10;
    }

    public void b(long[] jArr) {
        int length = this.f61462a + jArr.length;
        long[] jArr2 = this.f61463b;
        if (length > jArr2.length) {
            this.f61463b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f61463b, this.f61462a, jArr.length);
        this.f61462a = length;
    }

    public long c(int i10) {
        if (i10 >= 0 && i10 < this.f61462a) {
            return this.f61463b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f61462a);
    }

    public int d() {
        return this.f61462a;
    }

    public long[] e() {
        return Arrays.copyOf(this.f61463b, this.f61462a);
    }

    public a0(int i10) {
        this.f61463b = new long[i10];
    }
}
