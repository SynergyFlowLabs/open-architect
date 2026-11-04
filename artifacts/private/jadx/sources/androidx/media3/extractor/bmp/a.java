package androidx.media3.extractor.bmp;

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
    private static final int f67143e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f67144f = 16973;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r0 f67145d = new r0(f67144f, 2, s0.f61297b1);

    public a() {
        int i10 = 5 & 2;
    }

    @Override // androidx.media3.extractor.r
    public void a(long j10, long j11) {
        this.f67145d.a(j10, j11);
    }

    @Override // androidx.media3.extractor.r
    public int f(s sVar, n0 n0Var) throws IOException {
        return this.f67145d.f(sVar, n0Var);
    }

    @Override // androidx.media3.extractor.r
    public boolean g(s sVar) throws IOException {
        return this.f67145d.g(sVar);
    }

    @Override // androidx.media3.extractor.r
    public void h(t tVar) {
        this.f67145d.h(tVar);
    }

    @Override // androidx.media3.extractor.r
    public void release() {
    }
}
