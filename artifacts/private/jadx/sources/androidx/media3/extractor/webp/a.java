package androidx.media3.extractor.webp;

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
    private static final int f69626f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f69627g = 1380533830;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f69628h = 1464156752;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o0 f69629d = new o0(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r0 f69630e = new r0(-1, -1, "image/webp");

    @Override // androidx.media3.extractor.r
    public void a(long j10, long j11) {
        this.f69630e.a(j10, j11);
    }

    @Override // androidx.media3.extractor.r
    public int f(s sVar, n0 n0Var) throws IOException {
        return this.f69630e.f(sVar, n0Var);
    }

    @Override // androidx.media3.extractor.r
    public boolean g(s sVar) throws IOException {
        this.f69629d.W(4);
        sVar.i(this.f69629d.e(), 0, 4);
        if (this.f69629d.N() != 1380533830) {
            return false;
        }
        sVar.n(4);
        this.f69629d.W(4);
        sVar.i(this.f69629d.e(), 0, 4);
        return this.f69629d.N() == 1464156752;
    }

    @Override // androidx.media3.extractor.r
    public void h(t tVar) {
        this.f69630e.h(tVar);
    }

    @Override // androidx.media3.extractor.r
    public void release() {
    }
}
