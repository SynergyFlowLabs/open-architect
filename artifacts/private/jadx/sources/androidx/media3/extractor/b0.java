package androidx.media3.extractor;

import androidx.media3.common.util.b1;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class b0 implements r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f67142d;

    public b0(r rVar) {
        this.f67142d = rVar;
    }

    @Override // androidx.media3.extractor.r
    public void a(long j10, long j11) {
        this.f67142d.a(j10, j11);
    }

    @Override // androidx.media3.extractor.r
    public r b() {
        return this.f67142d.b();
    }

    @Override // androidx.media3.extractor.r
    public List<t0> c() {
        return this.f67142d.c();
    }

    @Override // androidx.media3.extractor.r
    public int f(s sVar, n0 n0Var) throws IOException {
        return this.f67142d.f(sVar, n0Var);
    }

    @Override // androidx.media3.extractor.r
    public boolean g(s sVar) throws IOException {
        return this.f67142d.g(sVar);
    }

    @Override // androidx.media3.extractor.r
    public void h(t tVar) {
        this.f67142d.h(tVar);
    }

    @Override // androidx.media3.extractor.r
    public void release() {
        this.f67142d.release();
    }
}
