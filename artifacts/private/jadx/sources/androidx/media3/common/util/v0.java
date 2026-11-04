package androidx.media3.common.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class v0<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f61671e = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f61672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private V[] f61673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f61674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f61675d;

    public v0() {
        this(10);
    }

    private void b(long j10, V v10) {
        int i10 = this.f61674c;
        int i11 = this.f61675d;
        V[] vArr = this.f61673b;
        int length = (i10 + i11) % vArr.length;
        this.f61672a[length] = j10;
        vArr[length] = v10;
        this.f61675d = i11 + 1;
    }

    private void d(long j10) {
        int i10 = this.f61675d;
        if (i10 > 0) {
            if (j10 <= this.f61672a[((this.f61674c + i10) - 1) % this.f61673b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.f61673b.length;
        if (this.f61675d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        V[] vArr = (V[]) f(i10);
        int i11 = this.f61674c;
        int i12 = length - i11;
        System.arraycopy(this.f61672a, i11, jArr, 0, i12);
        System.arraycopy(this.f61673b, this.f61674c, vArr, 0, i12);
        int i13 = this.f61674c;
        if (i13 > 0) {
            System.arraycopy(this.f61672a, 0, jArr, i12, i13);
            System.arraycopy(this.f61673b, 0, vArr, i12, this.f61674c);
        }
        this.f61672a = jArr;
        this.f61673b = vArr;
        this.f61674c = 0;
    }

    private static <V> V[] f(int i10) {
        return (V[]) new Object[i10];
    }

    @androidx.annotation.p0
    private V h(long j10, boolean z10) {
        V vK = null;
        long j11 = Long.MAX_VALUE;
        while (this.f61675d > 0) {
            long j12 = j10 - this.f61672a[this.f61674c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            vK = k();
            j11 = j12;
        }
        return vK;
    }

    @androidx.annotation.p0
    private V k() {
        a.i(this.f61675d > 0);
        V[] vArr = this.f61673b;
        int i10 = this.f61674c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        this.f61674c = (i10 + 1) % vArr.length;
        this.f61675d--;
        return v10;
    }

    public synchronized void a(long j10, V v10) {
        d(j10);
        e();
        b(j10, v10);
    }

    public synchronized void c() {
        try {
            this.f61674c = 0;
            this.f61675d = 0;
            Arrays.fill(this.f61673b, (Object) null);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @androidx.annotation.p0
    public synchronized V g(long j10) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return h(j10, false);
    }

    @androidx.annotation.p0
    public synchronized V i() {
        return this.f61675d == 0 ? null : k();
    }

    @androidx.annotation.p0
    public synchronized V j(long j10) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return h(j10, true);
    }

    public synchronized int l() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f61675d;
    }

    public v0(int i10) {
        this.f61672a = new long[i10];
        this.f61673b = (V[]) f(i10);
    }
}
