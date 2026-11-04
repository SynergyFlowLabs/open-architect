package androidx.media3.exoplayer.source;

import android.net.Uri;
import com.google.common.collect.l6;
import com.google.common.collect.x7;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class d implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.extractor.w f64951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.extractor.r f64952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.extractor.s f64953c;

    public d(androidx.media3.extractor.w wVar) {
        this.f64951a = wVar;
    }

    @Override // androidx.media3.exoplayer.source.g1
    public void a(long j10, long j11) {
        ((androidx.media3.extractor.r) androidx.media3.common.util.a.g(this.f64952b)).a(j10, j11);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    @Override // androidx.media3.exoplayer.source.g1
    public void b(androidx.media3.common.l lVar, Uri uri, Map<String, List<String>> map, long j10, long j11, androidx.media3.extractor.t tVar) throws IOException {
        androidx.media3.extractor.i iVar = new androidx.media3.extractor.i(lVar, j10, j11);
        this.f64953c = iVar;
        if (this.f64952b != null) {
            return;
        }
        androidx.media3.extractor.r[] rVarArrE = this.f64951a.e(uri, map);
        l6.a aVarT = l6.t(rVarArrE.length);
        if (rVarArrE.length == 1) {
            this.f64952b = rVarArrE[0];
        } else {
            for (androidx.media3.extractor.r rVar : rVarArrE) {
                try {
                    if (rVar.g(iVar)) {
                        this.f64952b = rVar;
                        androidx.media3.common.util.a.i(true);
                        iVar.l();
                        break;
                    } else {
                        aVarT.c(rVar.c());
                        boolean z10 = this.f64952b != null || iVar.getPosition() == j10;
                        androidx.media3.common.util.a.i(z10);
                        iVar.l();
                    }
                } catch (EOFException unused) {
                    if (this.f64952b != null || iVar.getPosition() == j10) {
                    }
                } catch (Throwable th2) {
                    androidx.media3.common.util.a.i(this.f64952b != null || iVar.getPosition() == j10);
                    iVar.l();
                    throw th2;
                }
                androidx.media3.common.util.a.i(z10);
                iVar.l();
            }
            if (this.f64952b == null) {
                throw new i2("None of the available extractors (" + com.google.common.base.a0.p(", ").k(x7.D(l6.B(rVarArrE), new com.google.common.base.t() { // from class: androidx.media3.exoplayer.source.c
                    @Override // com.google.common.base.t
                    public final Object apply(Object obj) {
                        return ((androidx.media3.extractor.r) obj).b().getClass().getSimpleName();
                    }
                })) + ") could read the stream.", (Uri) androidx.media3.common.util.a.g(uri), aVarT.e());
            }
        }
        this.f64952b.h(tVar);
    }

    @Override // androidx.media3.exoplayer.source.g1
    public long c() {
        androidx.media3.extractor.s sVar = this.f64953c;
        if (sVar != null) {
            return sVar.getPosition();
        }
        return -1L;
    }

    @Override // androidx.media3.exoplayer.source.g1
    public void d() {
        androidx.media3.extractor.r rVar = this.f64952b;
        if (rVar == null) {
            return;
        }
        androidx.media3.extractor.r rVarB = rVar.b();
        if (rVarB instanceof androidx.media3.extractor.mp3.f) {
            ((androidx.media3.extractor.mp3.f) rVarB).l();
        }
    }

    @Override // androidx.media3.exoplayer.source.g1
    public int e(androidx.media3.extractor.n0 n0Var) throws IOException {
        return ((androidx.media3.extractor.r) androidx.media3.common.util.a.g(this.f64952b)).f((androidx.media3.extractor.s) androidx.media3.common.util.a.g(this.f64953c), n0Var);
    }

    @Override // androidx.media3.exoplayer.source.g1
    public void release() {
        androidx.media3.extractor.r rVar = this.f64952b;
        if (rVar != null) {
            rVar.release();
            this.f64952b = null;
        }
        this.f64953c = null;
    }
}
