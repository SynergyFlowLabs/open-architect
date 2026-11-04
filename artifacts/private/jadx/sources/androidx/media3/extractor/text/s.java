package androidx.media3.extractor.text;

import androidx.media3.common.util.b1;
import androidx.media3.extractor.n0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
@Deprecated
public class s implements androidx.media3.extractor.r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.extractor.r f68574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r.a f68575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private t f68576f;

    public s(androidx.media3.extractor.r rVar, r.a aVar) {
        this.f68574d = rVar;
        this.f68575e = aVar;
    }

    @Override // androidx.media3.extractor.r
    public void a(long j10, long j11) {
        t tVar = this.f68576f;
        if (tVar != null) {
            tVar.b();
        }
        this.f68574d.a(j10, j11);
    }

    @Override // androidx.media3.extractor.r
    public androidx.media3.extractor.r b() {
        return this.f68574d;
    }

    @Override // androidx.media3.extractor.r
    public int f(androidx.media3.extractor.s sVar, n0 n0Var) throws IOException {
        return this.f68574d.f(sVar, n0Var);
    }

    @Override // androidx.media3.extractor.r
    public boolean g(androidx.media3.extractor.s sVar) throws IOException {
        return this.f68574d.g(sVar);
    }

    @Override // androidx.media3.extractor.r
    public void h(androidx.media3.extractor.t tVar) {
        t tVar2 = new t(tVar, this.f68575e);
        this.f68576f = tVar2;
        this.f68574d.h(tVar2);
    }

    @Override // androidx.media3.extractor.r
    public void release() {
        this.f68574d.release();
    }
}
