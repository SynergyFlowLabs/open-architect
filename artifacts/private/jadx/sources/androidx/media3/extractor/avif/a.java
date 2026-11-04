package androidx.media3.extractor.avif;

import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.o0;
import androidx.media3.extractor.n0;
import androidx.media3.extractor.r;
import androidx.media3.extractor.r0;
import androidx.media3.extractor.s;
import androidx.media3.extractor.t;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a implements r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f67113f = 1718909296;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f67114g = 1635150182;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f67115h = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o0 f67116d = new o0(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r0 f67117e = new r0(-1, -1, s0.f61294a1);

    private boolean d(s sVar, int i10) throws IOException {
        this.f67116d.W(4);
        sVar.i(this.f67116d.e(), 0, 4);
        return this.f67116d.N() == ((long) i10);
    }

    @Override // androidx.media3.extractor.r
    public void a(long j10, long j11) {
        this.f67117e.a(j10, j11);
    }

    @Override // androidx.media3.extractor.r
    public int f(s sVar, n0 n0Var) throws IOException {
        return this.f67117e.f(sVar, n0Var);
    }

    @Override // androidx.media3.extractor.r
    public boolean g(s sVar) throws IOException {
        sVar.n(4);
        return d(sVar, 1718909296) && d(sVar, f67114g);
    }

    @Override // androidx.media3.extractor.r
    public void h(t tVar) {
        this.f67117e.h(tVar);
    }

    @Override // androidx.media3.extractor.r
    public void release() {
    }
}
