package androidx.media3.exoplayer.trackselection;

import android.os.SystemClock;
import androidx.annotation.p0;
import androidx.media3.common.b4;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public abstract class c implements c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final b4 f65667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f65668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int[] f65669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f65670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.media3.common.w[] f65671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long[] f65672h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f65673i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f65674j;

    public c(b4 b4Var, int... iArr) {
        this(b4Var, iArr, 0);
    }

    public static /* synthetic */ int x(androidx.media3.common.w wVar, androidx.media3.common.w wVar2) {
        return wVar2.f61756j - wVar.f61756j;
    }

    @Override // androidx.media3.exoplayer.trackselection.h0
    public final int b(int i10) {
        return this.f65669e[i10];
    }

    @Override // androidx.media3.exoplayer.trackselection.h0
    public final int c() {
        return this.f65670f;
    }

    @Override // androidx.media3.exoplayer.trackselection.c0
    public void d() {
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f65667c.equals(cVar.f65667c) && Arrays.equals(this.f65669e, cVar.f65669e)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.trackselection.h0
    public final int f(int i10) {
        for (int i11 = 0; i11 < this.f65668d; i11++) {
            if (this.f65669e[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.trackselection.h0
    public final b4 g() {
        return this.f65667c;
    }

    @Override // androidx.media3.exoplayer.trackselection.c0
    public void h() {
    }

    public int hashCode() {
        if (this.f65673i == 0) {
            this.f65673i = (System.identityHashCode(this.f65667c) * 31) + Arrays.hashCode(this.f65669e);
        }
        return this.f65673i;
    }

    @Override // androidx.media3.exoplayer.trackselection.c0
    public int i(long j10, List<? extends androidx.media3.exoplayer.source.chunk.m> list) {
        return list.size();
    }

    @Override // androidx.media3.exoplayer.trackselection.c0
    public final int j() {
        return this.f65669e[a()];
    }

    @Override // androidx.media3.exoplayer.trackselection.c0
    public final androidx.media3.common.w k() {
        return this.f65671g[a()];
    }

    @Override // androidx.media3.exoplayer.trackselection.h0
    public final androidx.media3.common.w l(int i10) {
        return this.f65671g[i10];
    }

    @Override // androidx.media3.exoplayer.trackselection.h0
    public final int length() {
        return this.f65669e.length;
    }

    @Override // androidx.media3.exoplayer.trackselection.c0
    public void m(float f10) {
    }

    @Override // androidx.media3.exoplayer.trackselection.c0
    public boolean q(int i10, long j10) {
        return this.f65672h[i10] > j10;
    }

    @Override // androidx.media3.exoplayer.trackselection.c0
    public boolean r(int i10, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zQ = q(i10, jElapsedRealtime);
        int i11 = 0;
        while (i11 < this.f65668d && !zQ) {
            zQ = (i11 == i10 || q(i11, jElapsedRealtime)) ? false : true;
            i11++;
        }
        if (!zQ) {
            return false;
        }
        long[] jArr = this.f65672h;
        jArr[i10] = Math.max(jArr[i10], k1.f(jElapsedRealtime, j10, Long.MAX_VALUE));
        return true;
    }

    @Override // androidx.media3.exoplayer.trackselection.h0
    public final int u(androidx.media3.common.w wVar) {
        for (int i10 = 0; i10 < this.f65668d; i10++) {
            if (this.f65671g[i10] == wVar) {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.trackselection.c0
    @androidx.annotation.i
    public void w(boolean z10) {
        this.f65674j = z10;
    }

    protected final boolean y() {
        return this.f65674j;
    }

    public c(b4 b4Var, int[] iArr, int i10) {
        androidx.media3.common.util.a.i(iArr.length > 0);
        this.f65670f = i10;
        this.f65667c = (b4) androidx.media3.common.util.a.g(b4Var);
        int length = iArr.length;
        this.f65668d = length;
        this.f65671g = new androidx.media3.common.w[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f65671g[i11] = b4Var.c(iArr[i11]);
        }
        Arrays.sort(this.f65671g, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.x((androidx.media3.common.w) obj, (androidx.media3.common.w) obj2);
            }
        });
        this.f65669e = new int[this.f65668d];
        int i12 = 0;
        while (true) {
            int i13 = this.f65668d;
            if (i12 >= i13) {
                this.f65672h = new long[i13];
                this.f65674j = false;
                return;
            } else {
                this.f65669e[i12] = b4Var.d(this.f65671g[i12]);
                i12++;
            }
        }
    }
}
