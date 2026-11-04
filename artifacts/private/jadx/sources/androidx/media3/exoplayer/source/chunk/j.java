package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.p0;
import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.o0;
import androidx.media3.common.w;
import androidx.media3.datasource.p1;
import androidx.media3.datasource.x;
import androidx.media3.extractor.u0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class j extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f64918o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f64919p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final f f64920q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f64921r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile boolean f64922s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f64923t;

    public j(androidx.media3.datasource.p pVar, x xVar, w wVar, int i10, @p0 Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, f fVar) {
        super(pVar, xVar, wVar, i10, obj, j10, j11, j12, j13, j14);
        this.f64918o = i11;
        this.f64919p = j15;
        this.f64920q = fVar;
    }

    private void o(c cVar) {
        if (s0.s(this.f64883d.f61760n)) {
            w wVar = this.f64883d;
            int i10 = wVar.L;
            if ((i10 > 1 || wVar.M > 1) && i10 != -1 && wVar.M != -1) {
                u0 u0VarA = cVar.a(0, 4);
                w wVar2 = this.f64883d;
                int i11 = wVar2.L * wVar2.M;
                long j10 = (this.f64887h - this.f64886g) / ((long) i11);
                for (int i12 = 1; i12 < i11; i12++) {
                    u0VarA.b(new o0(), 0);
                    u0VarA.g(((long) i12) * j10, 0, 0, 0, null);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.upstream.o.e
    public final void a() throws IOException {
        c cVarJ = j();
        if (this.f64921r == 0) {
            cVarJ.c(this.f64919p);
            f fVar = this.f64920q;
            f.b bVarM = m(cVarJ);
            long j10 = this.f64849k;
            long j11 = j10 == -9223372036854775807L ? -9223372036854775807L : j10 - this.f64919p;
            long j12 = this.f64850l;
            fVar.c(bVarM, j11, j12 != -9223372036854775807L ? j12 - this.f64919p : -9223372036854775807L);
        }
        try {
            x xVarE = this.f64881b.e(this.f64921r);
            p1 p1Var = this.f64888i;
            androidx.media3.extractor.i iVar = new androidx.media3.extractor.i(p1Var, xVarE.f62600g, p1Var.c(xVarE));
            do {
                try {
                    if (this.f64922s) {
                        break;
                    }
                } catch (Throwable th2) {
                    this.f64921r = iVar.getPosition() - this.f64881b.f62600g;
                    throw th2;
                }
            } while (this.f64920q.b(iVar));
            o(cVarJ);
            this.f64921r = iVar.getPosition() - this.f64881b.f62600g;
            p();
            androidx.media3.datasource.w.a(this.f64888i);
            this.f64923t = !this.f64922s;
        } catch (Throwable th3) {
            p();
            androidx.media3.datasource.w.a(this.f64888i);
            throw th3;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.o.e
    public final void b() {
        this.f64922s = true;
    }

    @Override // androidx.media3.exoplayer.source.chunk.m
    public long g() {
        return this.f64932j + ((long) this.f64918o);
    }

    @Override // androidx.media3.exoplayer.source.chunk.m
    public boolean h() {
        return this.f64923t;
    }

    public final long l() {
        return this.f64921r;
    }

    protected f.b m(c cVar) {
        return cVar;
    }

    public final boolean n() {
        return this.f64922s;
    }

    @z7.g
    protected void p() {
    }
}
