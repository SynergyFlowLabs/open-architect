package androidx.media2.exoplayer.external.util;

import androidx.annotation.b1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class j0<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f57574e = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f57575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private V[] f57576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f57577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f57578d;

    public j0() {
        this(10);
    }

    private void b(long timestamp, V value) {
        int i10 = this.f57577c;
        int i11 = this.f57578d;
        V[] vArr = this.f57576b;
        int length = (i10 + i11) % vArr.length;
        this.f57575a[length] = timestamp;
        vArr[length] = value;
        this.f57578d = i11 + 1;
    }

    private void d(long timestamp) {
        int i10 = this.f57578d;
        if (i10 > 0) {
            if (timestamp <= this.f57575a[((this.f57577c + i10) - 1) % this.f57576b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.f57576b.length;
        if (this.f57578d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        V[] vArr = (V[]) f(i10);
        int i11 = this.f57577c;
        int i12 = length - i11;
        System.arraycopy(this.f57575a, i11, jArr, 0, i12);
        System.arraycopy(this.f57576b, this.f57577c, vArr, 0, i12);
        int i13 = this.f57577c;
        if (i13 > 0) {
            System.arraycopy(this.f57575a, 0, jArr, i12, i13);
            System.arraycopy(this.f57576b, 0, vArr, i12, this.f57577c);
        }
        this.f57575a = jArr;
        this.f57576b = vArr;
        this.f57577c = 0;
    }

    private static <V> V[] f(int i10) {
        return (V[]) new Object[i10];
    }

    @androidx.annotation.p0
    private V h(long timestamp, boolean onlyOlder) {
        long j10 = Long.MAX_VALUE;
        V v10 = null;
        while (true) {
            int i10 = this.f57578d;
            if (i10 <= 0) {
                break;
            }
            long[] jArr = this.f57575a;
            int i11 = this.f57577c;
            long j11 = timestamp - jArr[i11];
            if (j11 < 0 && (onlyOlder || (-j11) >= j10)) {
                break;
                break;
            }
            V[] vArr = this.f57576b;
            v10 = vArr[i11];
            vArr[i11] = null;
            this.f57577c = (i11 + 1) % vArr.length;
            this.f57578d = i10 - 1;
            j10 = j11;
        }
        return v10;
    }

    public synchronized void a(long timestamp, V value) {
        try {
            d(timestamp);
            e();
            b(timestamp, value);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void c() {
        try {
            this.f57577c = 0;
            this.f57578d = 0;
            Arrays.fill(this.f57576b, (Object) null);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @androidx.annotation.p0
    public synchronized V g(long timestamp) {
        return h(timestamp, false);
    }

    @androidx.annotation.p0
    public synchronized V i(long timestamp) {
        return h(timestamp, true);
    }

    public synchronized int j() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f57578d;
    }

    public j0(int i10) {
        this.f57575a = new long[i10];
        this.f57576b = (V[]) f(i10);
    }
}
