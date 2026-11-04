package androidx.media3.extractor.png;

import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import androidx.media3.extractor.n0;
import androidx.media3.extractor.r;
import androidx.media3.extractor.r0;
import androidx.media3.extractor.s;
import androidx.media3.extractor.t;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a implements r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f68284e = 35152;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f68285f = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r0 f68286d = new r0(f68284e, 2, s0.X0);

    @Override // androidx.media3.extractor.r
    public void a(long j10, long j11) {
        this.f68286d.a(j10, j11);
    }

    @Override // androidx.media3.extractor.r
    public int f(s sVar, n0 n0Var) throws IOException {
        return this.f68286d.f(sVar, n0Var);
    }

    @Override // androidx.media3.extractor.r
    public boolean g(s sVar) throws IOException {
        return this.f68286d.g(sVar);
    }

    @Override // androidx.media3.extractor.r
    public void h(t tVar) {
        this.f68286d.h(tVar);
    }

    @Override // androidx.media3.extractor.r
    public void release() {
    }
}
