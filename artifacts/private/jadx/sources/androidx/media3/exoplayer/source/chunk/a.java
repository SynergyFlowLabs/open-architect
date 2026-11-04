package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.w;
import androidx.media3.datasource.x;

/* JADX INFO: loaded from: classes3.dex */
@b1
public abstract class a extends m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f64849k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f64850l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f64851m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f64852n;

    public a(androidx.media3.datasource.p pVar, x xVar, w wVar, int i10, @p0 Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(pVar, xVar, wVar, i10, obj, j10, j11, j14);
        this.f64849k = j12;
        this.f64850l = j13;
    }

    public final int i(int i10) {
        return ((int[]) androidx.media3.common.util.a.k(this.f64852n))[i10];
    }

    protected final c j() {
        return (c) androidx.media3.common.util.a.k(this.f64851m);
    }

    public void k(c cVar) {
        this.f64851m = cVar;
        this.f64852n = cVar.b();
    }
}
