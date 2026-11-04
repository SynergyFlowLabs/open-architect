package androidx.media3.exoplayer.upstream;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class i implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f66064h = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f66065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f66066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final byte[] f66067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f66068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f66069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f66070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a[] f66071g;

    public i(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public synchronized int a() {
        return this.f66069e * this.f66066b;
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public synchronized void b() {
        try {
            int i10 = 0;
            int iMax = Math.max(0, k1.q(this.f66068d, this.f66066b) - this.f66069e);
            int i11 = this.f66070f;
            if (iMax >= i11) {
                return;
            }
            if (this.f66067c != null) {
                int i12 = i11 - 1;
                while (i10 <= i12) {
                    a aVar = (a) androidx.media3.common.util.a.g(this.f66071g[i10]);
                    if (aVar.f65839a == this.f66067c) {
                        i10++;
                    } else {
                        a aVar2 = (a) androidx.media3.common.util.a.g(this.f66071g[i12]);
                        if (aVar2.f65839a != this.f66067c) {
                            i12--;
                        } else {
                            a[] aVarArr = this.f66071g;
                            aVarArr[i10] = aVar2;
                            aVarArr[i12] = aVar;
                            i12--;
                            i10++;
                        }
                    }
                }
                iMax = Math.max(iMax, i10);
                if (iMax >= this.f66070f) {
                    return;
                }
            }
            Arrays.fill(this.f66071g, iMax, this.f66070f, (Object) null);
            this.f66070f = iMax;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public synchronized a c() {
        a aVar;
        try {
            this.f66069e++;
            int i10 = this.f66070f;
            if (i10 > 0) {
                a[] aVarArr = this.f66071g;
                int i11 = i10 - 1;
                this.f66070f = i11;
                aVar = (a) androidx.media3.common.util.a.g(aVarArr[i11]);
                this.f66071g[this.f66070f] = null;
            } else {
                aVar = new a(new byte[this.f66066b], 0);
                int i12 = this.f66069e;
                a[] aVarArr2 = this.f66071g;
                if (i12 > aVarArr2.length) {
                    this.f66071g = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public int d() {
        return this.f66066b;
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public synchronized void e(@p0 b.a aVar) {
        while (aVar != null) {
            try {
                a[] aVarArr = this.f66071g;
                int i10 = this.f66070f;
                this.f66070f = i10 + 1;
                aVarArr[i10] = aVar.a();
                this.f66069e--;
                aVar = aVar.next();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public synchronized void f(a aVar) {
        a[] aVarArr = this.f66071g;
        int i10 = this.f66070f;
        this.f66070f = i10 + 1;
        aVarArr[i10] = aVar;
        this.f66069e--;
        notifyAll();
    }

    public synchronized void g() {
        try {
            if (this.f66065a) {
                h(0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void h(int i10) {
        try {
            boolean z10 = i10 < this.f66068d;
            this.f66068d = i10;
            if (z10) {
                b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public i(boolean z10, int i10, int i11) {
        androidx.media3.common.util.a.a(i10 > 0);
        androidx.media3.common.util.a.a(i11 >= 0);
        this.f66065a = z10;
        this.f66066b = i10;
        this.f66070f = i11;
        this.f66071g = new a[i11 + 100];
        if (i11 <= 0) {
            this.f66067c = null;
            return;
        }
        this.f66067c = new byte[i11 * i10];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f66071g[i12] = new a(this.f66067c, i12 * i10);
        }
    }
}
