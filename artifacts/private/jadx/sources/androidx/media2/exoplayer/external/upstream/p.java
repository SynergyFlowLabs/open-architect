package androidx.media2.exoplayer.external.upstream;

import androidx.annotation.b1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class p implements b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f57383i = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f57384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f57385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f57386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a[] f57387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f57388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f57389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f57390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a[] f57391h;

    public p(boolean trimOnReset, int individualAllocationSize) {
        this(trimOnReset, individualAllocationSize, 0);
    }

    @Override // androidx.media2.exoplayer.external.upstream.b
    public synchronized int a() {
        return this.f57389f * this.f57385b;
    }

    @Override // androidx.media2.exoplayer.external.upstream.b
    public synchronized void b() {
        try {
            int i10 = 0;
            int iMax = Math.max(0, androidx.media2.exoplayer.external.util.q0.k(this.f57388e, this.f57385b) - this.f57389f);
            int i11 = this.f57390g;
            if (iMax >= i11) {
                return;
            }
            if (this.f57386c != null) {
                int i12 = i11 - 1;
                while (i10 <= i12) {
                    a[] aVarArr = this.f57391h;
                    a aVar = aVarArr[i10];
                    byte[] bArr = aVar.f57243a;
                    byte[] bArr2 = this.f57386c;
                    if (bArr == bArr2) {
                        i10++;
                    } else {
                        a aVar2 = aVarArr[i12];
                        if (aVar2.f57243a != bArr2) {
                            i12--;
                        } else {
                            aVarArr[i10] = aVar2;
                            aVarArr[i12] = aVar;
                            i12--;
                            i10++;
                        }
                    }
                }
                iMax = Math.max(iMax, i10);
                if (iMax >= this.f57390g) {
                    return;
                }
            }
            Arrays.fill(this.f57391h, iMax, this.f57390g, (Object) null);
            this.f57390g = iMax;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.b
    public synchronized a c() {
        a aVar;
        try {
            this.f57389f++;
            int i10 = this.f57390g;
            if (i10 > 0) {
                a[] aVarArr = this.f57391h;
                int i11 = i10 - 1;
                this.f57390g = i11;
                aVar = aVarArr[i11];
                aVarArr[i11] = null;
            } else {
                aVar = new a(new byte[this.f57385b], 0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    @Override // androidx.media2.exoplayer.external.upstream.b
    public int d() {
        return this.f57385b;
    }

    @Override // androidx.media2.exoplayer.external.upstream.b
    public synchronized void e(a allocation) {
        a[] aVarArr = this.f57387d;
        aVarArr[0] = allocation;
        f(aVarArr);
    }

    @Override // androidx.media2.exoplayer.external.upstream.b
    public synchronized void f(a[] allocations) {
        try {
            int i10 = this.f57390g;
            int length = allocations.length + i10;
            a[] aVarArr = this.f57391h;
            if (length >= aVarArr.length) {
                this.f57391h = (a[]) Arrays.copyOf(aVarArr, Math.max(aVarArr.length * 2, i10 + allocations.length));
            }
            for (a aVar : allocations) {
                a[] aVarArr2 = this.f57391h;
                int i11 = this.f57390g;
                this.f57390g = i11 + 1;
                aVarArr2[i11] = aVar;
            }
            this.f57389f -= allocations.length;
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void g() {
        try {
            if (this.f57384a) {
                h(0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void h(int targetBufferSize) {
        boolean z10 = targetBufferSize < this.f57388e;
        this.f57388e = targetBufferSize;
        if (z10) {
            b();
        }
    }

    public p(boolean trimOnReset, int individualAllocationSize, int initialAllocationCount) {
        androidx.media2.exoplayer.external.util.a.a(individualAllocationSize > 0);
        androidx.media2.exoplayer.external.util.a.a(initialAllocationCount >= 0);
        this.f57384a = trimOnReset;
        this.f57385b = individualAllocationSize;
        this.f57390g = initialAllocationCount;
        this.f57391h = new a[initialAllocationCount + 100];
        if (initialAllocationCount > 0) {
            this.f57386c = new byte[initialAllocationCount * individualAllocationSize];
            for (int i10 = 0; i10 < initialAllocationCount; i10++) {
                this.f57391h[i10] = new a(this.f57386c, i10 * individualAllocationSize);
            }
        } else {
            this.f57386c = null;
        }
        this.f57387d = new a[1];
    }
}
