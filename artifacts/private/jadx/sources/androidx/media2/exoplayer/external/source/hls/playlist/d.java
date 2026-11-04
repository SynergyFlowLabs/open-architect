package androidx.media2.exoplayer.external.source.hls.playlist;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.offline.StreamKey;
import androidx.media2.exoplayer.external.upstream.i0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f56106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<StreamKey> f56107b;

    public d(i hlsPlaylistParserFactory, List<StreamKey> streamKeys) {
        this.f56106a = hlsPlaylistParserFactory;
        this.f56107b = streamKeys;
    }

    @Override // androidx.media2.exoplayer.external.source.hls.playlist.i
    public i0.a<g> a(e masterPlaylist) {
        return new androidx.media2.exoplayer.external.offline.b(this.f56106a.a(masterPlaylist), this.f56107b);
    }

    @Override // androidx.media2.exoplayer.external.source.hls.playlist.i
    public i0.a<g> b() {
        return new androidx.media2.exoplayer.external.offline.b(this.f56106a.b(), this.f56107b);
    }
}
