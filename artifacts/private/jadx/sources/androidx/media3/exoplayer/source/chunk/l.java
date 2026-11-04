package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.w;
import androidx.media3.datasource.p1;
import androidx.media3.datasource.x;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class l extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f f64927j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private f.b f64928k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private androidx.media3.extractor.g f64929l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f64930m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f64931n;

    public l(androidx.media3.datasource.p pVar, x xVar, w wVar, int i10, @p0 Object obj, f fVar) {
        super(pVar, xVar, 2, wVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f64927j = fVar;
    }

    @Override // androidx.media3.exoplayer.upstream.o.e
    public void a() throws IOException {
        if (this.f64930m == 0) {
            this.f64927j.c(this.f64928k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            x xVarE = this.f64881b.e(this.f64930m);
            p1 p1Var = this.f64888i;
            androidx.media3.extractor.i iVar = new androidx.media3.extractor.i(p1Var, xVarE.f62600g, p1Var.c(xVarE));
            while (!this.f64931n && this.f64927j.b(iVar)) {
                try {
                } catch (Throwable th2) {
                    this.f64930m = iVar.getPosition() - this.f64881b.f62600g;
                    this.f64929l = this.f64927j.d();
                    throw th2;
                }
            }
            this.f64930m = iVar.getPosition() - this.f64881b.f62600g;
            this.f64929l = this.f64927j.d();
            androidx.media3.datasource.w.a(this.f64888i);
        } catch (Throwable th3) {
            androidx.media3.datasource.w.a(this.f64888i);
            throw th3;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.o.e
    public void b() {
        this.f64931n = true;
    }

    @p0
    public androidx.media3.extractor.g g() {
        return this.f64929l;
    }

    public void h(f.b bVar) {
        this.f64928k = bVar;
    }
}
