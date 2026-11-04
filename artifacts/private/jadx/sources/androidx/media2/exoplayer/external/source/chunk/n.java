package androidx.media2.exoplayer.external.source.chunk;

import androidx.annotation.b1;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class n extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<? extends l> f55842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f55843f;

    public n(List<? extends l> chunks, boolean reverseOrder) {
        super(0L, chunks.size() - 1);
        this.f55842e = chunks;
        this.f55843f = reverseOrder;
    }

    private l g() {
        int iF = (int) super.f();
        if (this.f55843f) {
            iF = (this.f55842e.size() - 1) - iF;
        }
        return this.f55842e.get(iF);
    }

    @Override // androidx.media2.exoplayer.external.source.chunk.m
    public long b() {
        return g().f55780g;
    }

    @Override // androidx.media2.exoplayer.external.source.chunk.m
    public long c() {
        return g().f55779f;
    }

    @Override // androidx.media2.exoplayer.external.source.chunk.m
    public androidx.media2.exoplayer.external.upstream.o d() {
        return g().f55774a;
    }
}
