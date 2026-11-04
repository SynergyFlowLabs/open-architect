package androidx.media2.exoplayer.external.source.hls;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.l.a f55944a;

    public b(androidx.media2.exoplayer.external.upstream.l.a dataSourceFactory) {
        this.f55944a = dataSourceFactory;
    }

    @Override // androidx.media2.exoplayer.external.source.hls.e
    public androidx.media2.exoplayer.external.upstream.l a(int dataType) {
        return this.f55944a.a();
    }
}
