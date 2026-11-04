package androidx.media2.exoplayer.external.source.hls;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.c0;
import androidx.media2.exoplayer.external.offline.StreamKey;
import androidx.media2.exoplayer.external.source.k0;
import androidx.media2.exoplayer.external.source.m0;
import androidx.media2.exoplayer.external.source.z;
import androidx.media2.exoplayer.external.source.z0;
import androidx.media2.exoplayer.external.upstream.f0;
import androidx.media2.exoplayer.external.upstream.q0;
import androidx.media2.exoplayer.external.upstream.x;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class HlsMediaSource extends androidx.media2.exoplayer.external.source.c implements androidx.media2.exoplayer.external.source.hls.playlist.j.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f f55909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Uri f55910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e f55911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.source.j f55912i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.drm.r<?> f55913j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final f0 f55914k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f55915l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f55916m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.source.hls.playlist.j f55917n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private final Object f55918o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private q0 f55919p;

    public static final class Factory implements m0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f55920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private f f55921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.media2.exoplayer.external.source.hls.playlist.i f55922c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private List<StreamKey> f55923d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.media2.exoplayer.external.source.hls.playlist.j.a f55924e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private androidx.media2.exoplayer.external.source.j f55925f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private androidx.media2.exoplayer.external.drm.r<?> f55926g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private f0 f55927h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f55928i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f55929j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f55930k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @p0
        private Object f55931l;

        public Factory(androidx.media2.exoplayer.external.upstream.l.a dataSourceFactory) {
            this(new b(dataSourceFactory));
        }

        @Override // androidx.media2.exoplayer.external.source.m0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HlsMediaSource d(Uri playlistUri) {
            this.f55930k = true;
            List<StreamKey> list = this.f55923d;
            if (list != null) {
                this.f55922c = new androidx.media2.exoplayer.external.source.hls.playlist.d(this.f55922c, list);
            }
            e eVar = this.f55920a;
            f fVar = this.f55921b;
            androidx.media2.exoplayer.external.source.j jVar = this.f55925f;
            androidx.media2.exoplayer.external.drm.r<?> rVar = this.f55926g;
            f0 f0Var = this.f55927h;
            return new HlsMediaSource(playlistUri, eVar, fVar, jVar, rVar, f0Var, this.f55924e.a(eVar, f0Var, this.f55922c), this.f55928i, this.f55929j, this.f55931l);
        }

        @Deprecated
        public HlsMediaSource b(Uri playlistUri, @p0 Handler eventHandler, @p0 k0 eventListener) {
            HlsMediaSource hlsMediaSourceD = d(playlistUri);
            if (eventHandler != null && eventListener != null) {
                hlsMediaSourceD.g(eventHandler, eventListener);
            }
            return hlsMediaSourceD;
        }

        @Override // androidx.media2.exoplayer.external.source.m0
        public int[] c() {
            return new int[]{2};
        }

        public Factory f(boolean allowChunklessPreparation) {
            androidx.media2.exoplayer.external.util.a.i(!this.f55930k);
            this.f55928i = allowChunklessPreparation;
            return this;
        }

        public Factory g(androidx.media2.exoplayer.external.source.j compositeSequenceableLoaderFactory) {
            androidx.media2.exoplayer.external.util.a.i(!this.f55930k);
            this.f55925f = (androidx.media2.exoplayer.external.source.j) androidx.media2.exoplayer.external.util.a.g(compositeSequenceableLoaderFactory);
            return this;
        }

        public Factory h(androidx.media2.exoplayer.external.drm.r<?> drmSessionManager) {
            androidx.media2.exoplayer.external.util.a.i(!this.f55930k);
            this.f55926g = drmSessionManager;
            return this;
        }

        public Factory i(f extractorFactory) {
            androidx.media2.exoplayer.external.util.a.i(!this.f55930k);
            this.f55921b = (f) androidx.media2.exoplayer.external.util.a.g(extractorFactory);
            return this;
        }

        public Factory j(f0 loadErrorHandlingPolicy) {
            androidx.media2.exoplayer.external.util.a.i(!this.f55930k);
            this.f55927h = loadErrorHandlingPolicy;
            return this;
        }

        @Deprecated
        public Factory k(int minLoadableRetryCount) {
            androidx.media2.exoplayer.external.util.a.i(!this.f55930k);
            this.f55927h = new x(minLoadableRetryCount);
            return this;
        }

        public Factory l(androidx.media2.exoplayer.external.source.hls.playlist.i playlistParserFactory) {
            androidx.media2.exoplayer.external.util.a.i(!this.f55930k);
            this.f55922c = (androidx.media2.exoplayer.external.source.hls.playlist.i) androidx.media2.exoplayer.external.util.a.g(playlistParserFactory);
            return this;
        }

        public Factory m(androidx.media2.exoplayer.external.source.hls.playlist.j.a playlistTrackerFactory) {
            androidx.media2.exoplayer.external.util.a.i(!this.f55930k);
            this.f55924e = (androidx.media2.exoplayer.external.source.hls.playlist.j.a) androidx.media2.exoplayer.external.util.a.g(playlistTrackerFactory);
            return this;
        }

        @Override // androidx.media2.exoplayer.external.source.m0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Factory e(List<StreamKey> streamKeys) {
            androidx.media2.exoplayer.external.util.a.i(!this.f55930k);
            this.f55923d = streamKeys;
            return this;
        }

        public Factory o(@p0 Object tag) {
            androidx.media2.exoplayer.external.util.a.i(!this.f55930k);
            this.f55931l = tag;
            return this;
        }

        public Factory p(boolean useSessionKeys) {
            this.f55929j = useSessionKeys;
            return this;
        }

        public Factory(e hlsDataSourceFactory) {
            this.f55920a = (e) androidx.media2.exoplayer.external.util.a.g(hlsDataSourceFactory);
            this.f55922c = new androidx.media2.exoplayer.external.source.hls.playlist.a();
            this.f55924e = androidx.media2.exoplayer.external.source.hls.playlist.c.f56077t;
            this.f55921b = f.f55984a;
            this.f55926g = androidx.media2.exoplayer.external.drm.q.b();
            this.f55927h = new x();
            this.f55925f = new androidx.media2.exoplayer.external.source.n();
        }
    }

    static {
        c0.a("goog.exo.hls");
    }

    @Override // androidx.media2.exoplayer.external.source.c, androidx.media2.exoplayer.external.source.z
    @p0
    public Object E() {
        return this.f55918o;
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public void a() throws IOException {
        this.f55917n.k();
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public void c(androidx.media2.exoplayer.external.source.x mediaPeriod) {
        ((i) mediaPeriod).B();
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public androidx.media2.exoplayer.external.source.x e(z.a id2, androidx.media2.exoplayer.external.upstream.b allocator, long startPositionUs) {
        return new i(this.f55909f, this.f55917n, this.f55911h, this.f55919p, this.f55913j, this.f55914k, m(id2), allocator, this.f55912i, this.f55915l, this.f55916m);
    }

    @Override // androidx.media2.exoplayer.external.source.hls.playlist.j.e
    public void h(androidx.media2.exoplayer.external.source.hls.playlist.f playlist) {
        z0 z0Var;
        long jC = playlist.f56144m ? androidx.media2.exoplayer.external.c.c(playlist.f56137f) : -9223372036854775807L;
        int i10 = playlist.f56135d;
        long j10 = (i10 == 2 || i10 == 1) ? jC : -9223372036854775807L;
        long j11 = playlist.f56136e;
        g gVar = new g(this.f55917n.c(), playlist);
        if (this.f55917n.j()) {
            long jB = playlist.f56137f - this.f55917n.b();
            long j12 = playlist.f56143l ? playlist.f56147p + jB : -9223372036854775807L;
            List<androidx.media2.exoplayer.external.source.hls.playlist.f.b> list = playlist.f56146o;
            if (j11 == -9223372036854775807L) {
                j11 = list.isEmpty() ? 0L : list.get(Math.max(0, list.size() - 3)).f56153f;
            }
            z0Var = new z0(j10, jC, j12, playlist.f56147p, jB, j11, true, !playlist.f56143l, gVar, this.f55918o);
        } else {
            long j13 = j11 == -9223372036854775807L ? 0L : j11;
            long j14 = playlist.f56147p;
            z0Var = new z0(j10, jC, j14, j14, 0L, j13, true, false, gVar, this.f55918o);
        }
        s(z0Var);
    }

    @Override // androidx.media2.exoplayer.external.source.c
    protected void r(@p0 q0 mediaTransferListener) {
        this.f55919p = mediaTransferListener;
        this.f55917n.h(this.f55910g, m(null), this);
    }

    @Override // androidx.media2.exoplayer.external.source.c
    protected void t() {
        this.f55917n.stop();
    }

    private HlsMediaSource(Uri manifestUri, e dataSourceFactory, f extractorFactory, androidx.media2.exoplayer.external.source.j compositeSequenceableLoaderFactory, androidx.media2.exoplayer.external.drm.r<?> drmSessionManager, f0 loadErrorHandlingPolicy, androidx.media2.exoplayer.external.source.hls.playlist.j playlistTracker, boolean allowChunklessPreparation, boolean useSessionKeys, @p0 Object tag) {
        this.f55910g = manifestUri;
        this.f55911h = dataSourceFactory;
        this.f55909f = extractorFactory;
        this.f55912i = compositeSequenceableLoaderFactory;
        this.f55913j = drmSessionManager;
        this.f55914k = loadErrorHandlingPolicy;
        this.f55917n = playlistTracker;
        this.f55915l = allowChunklessPreparation;
        this.f55916m = useSessionKeys;
        this.f55918o = tag;
    }
}
