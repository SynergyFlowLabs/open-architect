package androidx.media2.exoplayer.external.source.hls.playlist;

import android.net.Uri;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.source.k0;
import androidx.media2.exoplayer.external.upstream.f0;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface j {

    public interface a {
        j a(androidx.media2.exoplayer.external.source.hls.e dataSourceFactory, f0 loadErrorHandlingPolicy, i playlistParserFactory);
    }

    public interface b {
        void d();

        boolean l(Uri url, long blacklistDurationMs);
    }

    public static final class c extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f56214a;

        public c(Uri url) {
            this.f56214a = url;
        }
    }

    public static final class d extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f56215a;

        public d(Uri url) {
            this.f56215a = url;
        }
    }

    public interface e {
        void h(f mediaPlaylist);
    }

    void a(b listener);

    long b();

    @p0
    androidx.media2.exoplayer.external.source.hls.playlist.e c();

    void e(Uri url) throws IOException;

    void f(b listener);

    void g(Uri url);

    void h(Uri initialPlaylistUri, k0.a eventDispatcher, e listener);

    boolean i(Uri url);

    boolean j();

    void k() throws IOException;

    @p0
    f l(Uri url, boolean isForPlayback);

    void stop();
}
