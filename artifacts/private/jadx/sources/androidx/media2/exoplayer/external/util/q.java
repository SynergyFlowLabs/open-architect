package androidx.media2.exoplayer.external.util;

import androidx.annotation.b1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f57623c = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f57624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f57625b;

    public q() {
        this(32);
    }

    public void a(long value) {
        int i10 = this.f57624a;
        long[] jArr = this.f57625b;
        if (i10 == jArr.length) {
            this.f57625b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f57625b;
        int i11 = this.f57624a;
        this.f57624a = i11 + 1;
        jArr2[i11] = value;
    }

    public long b(int index) {
        if (index >= 0 && index < this.f57624a) {
            return this.f57625b[index];
        }
        int i10 = this.f57624a;
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Invalid index ");
        sb2.append(index);
        sb2.append(", size is ");
        sb2.append(i10);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public int c() {
        return this.f57624a;
    }

    public long[] d() {
        return Arrays.copyOf(this.f57625b, this.f57624a);
    }

    public q(int initialCapacity) {
        this.f57625b = new long[initialCapacity];
    }
}
