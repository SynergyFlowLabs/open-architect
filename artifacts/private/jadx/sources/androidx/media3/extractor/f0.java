package androidx.media3.extractor;

import androidx.media3.common.util.b1;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class f0 implements u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u0 f67231d;

    public f0(u0 u0Var) {
        this.f67231d = u0Var;
    }

    @Override // androidx.media3.extractor.u0
    public void a(androidx.media3.common.util.o0 o0Var, int i10, int i11) {
        this.f67231d.a(o0Var, i10, i11);
    }

    @Override // androidx.media3.extractor.u0
    public void b(androidx.media3.common.util.o0 o0Var, int i10) {
        this.f67231d.b(o0Var, i10);
    }

    @Override // androidx.media3.extractor.u0
    public void c(long j10) {
        this.f67231d.c(j10);
    }

    @Override // androidx.media3.extractor.u0
    public int d(androidx.media3.common.l lVar, int i10, boolean z10, int i11) throws IOException {
        return this.f67231d.d(lVar, i10, z10, i11);
    }

    @Override // androidx.media3.extractor.u0
    public void e(androidx.media3.common.w wVar) {
        this.f67231d.e(wVar);
    }

    @Override // androidx.media3.extractor.u0
    public int f(androidx.media3.common.l lVar, int i10, boolean z10) throws IOException {
        return this.f67231d.f(lVar, i10, z10);
    }

    @Override // androidx.media3.extractor.u0
    public void g(long j10, int i10, int i11, int i12, @androidx.annotation.p0 u0.a aVar) {
        this.f67231d.g(j10, i10, i11, i12, aVar);
    }
}
