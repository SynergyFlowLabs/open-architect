package androidx.media2.exoplayer.external.source.hls.playlist;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.upstream.i0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a implements i {
    @Override // androidx.media2.exoplayer.external.source.hls.playlist.i
    public i0.a<g> a(e masterPlaylist) {
        return new h(masterPlaylist);
    }

    @Override // androidx.media2.exoplayer.external.source.hls.playlist.i
    public i0.a<g> b() {
        return new h();
    }
}
