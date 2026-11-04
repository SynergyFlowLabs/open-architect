package androidx.media3.extractor.heif;

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
    private static final int f67362f = 1718909296;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f67363g = 1751476579;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f67364h = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o0 f67365d = new o0(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r0 f67366e = new r0(-1, -1, "image/heif");

    private boolean d(s sVar, int i10) throws IOException {
        this.f67365d.W(4);
        sVar.i(this.f67365d.e(), 0, 4);
        return this.f67365d.N() == ((long) i10);
    }

    @Override // androidx.media3.extractor.r
    public void a(long j10, long j11) {
        this.f67366e.a(j10, j11);
    }

    @Override // androidx.media3.extractor.r
    public int f(s sVar, n0 n0Var) throws IOException {
        return this.f67366e.f(sVar, n0Var);
    }

    @Override // androidx.media3.extractor.r
    public boolean g(s sVar) throws IOException {
        sVar.n(4);
        return d(sVar, 1718909296) && d(sVar, 1751476579);
    }

    @Override // androidx.media3.extractor.r
    public void h(t tVar) {
        this.f67366e.h(tVar);
    }

    @Override // androidx.media3.extractor.r
    public void release() {
    }
}
