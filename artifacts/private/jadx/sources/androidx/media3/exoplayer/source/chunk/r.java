package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.w;
import androidx.media3.datasource.x;
import androidx.media3.extractor.u0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
@Deprecated
public final class r extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f64947o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final w f64948p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f64949q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f64950r;

    public r(androidx.media3.datasource.p pVar, x xVar, w wVar, int i10, @p0 Object obj, long j10, long j11, long j12, int i11, w wVar2) {
        super(pVar, xVar, wVar, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f64947o = i11;
        this.f64948p = wVar2;
    }

    @Override // androidx.media3.exoplayer.upstream.o.e
    public void a() throws IOException {
        c cVarJ = j();
        cVarJ.c(0L);
        u0 u0VarA = cVarJ.a(0, this.f64947o);
        u0VarA.e(this.f64948p);
        try {
            long jC = this.f64888i.c(this.f64881b.e(this.f64949q));
            if (jC != -1) {
                jC += this.f64949q;
            }
            androidx.media3.extractor.i iVar = new androidx.media3.extractor.i(this.f64888i, this.f64949q, jC);
            for (int iF = 0; iF != -1; iF = u0VarA.f(iVar, Integer.MAX_VALUE, true)) {
                this.f64949q += (long) iF;
            }
            u0VarA.g(this.f64886g, 1, (int) this.f64949q, 0, null);
            androidx.media3.datasource.w.a(this.f64888i);
            this.f64950r = true;
        } catch (Throwable th2) {
            androidx.media3.datasource.w.a(this.f64888i);
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.o.e
    public void b() {
    }

    @Override // androidx.media3.exoplayer.source.chunk.m
    public boolean h() {
        return this.f64950r;
    }
}
