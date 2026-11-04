package androidx.media2.exoplayer.external.analytics;

import android.view.Surface;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.m0;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.source.TrackGroupArray;
import androidx.media2.exoplayer.external.source.k0;
import androidx.media2.exoplayer.external.source.z;
import androidx.media2.exoplayer.external.trackselection.p;
import androidx.media2.exoplayer.external.z0;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface c {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f53140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final z0 f53141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f53142c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        public final z.a f53143d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f53144e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f53145f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f53146g;

        public a(long realtimeMs, z0 timeline, int windowIndex, @p0 z.a mediaPeriodId, long eventPlaybackPositionMs, long currentPlaybackPositionMs, long totalBufferedDurationMs) {
            this.f53140a = realtimeMs;
            this.f53141b = timeline;
            this.f53142c = windowIndex;
            this.f53143d = mediaPeriodId;
            this.f53144e = eventPlaybackPositionMs;
            this.f53145f = currentPlaybackPositionMs;
            this.f53146g = totalBufferedDurationMs;
        }
    }

    void A(a eventTime, k0.b loadEventInfo, k0.c mediaLoadData);

    void B(a eventTime, int bufferSize, long bufferSizeMs, long elapsedSinceLastFeedMs);

    void C(a eventTime, Metadata metadata);

    void D(a eventTime, androidx.media2.exoplayer.external.i error);

    void F(a eventTime, m0 playbackParameters);

    void G(a eventTime, int reason);

    void H(a eventTime, k0.b loadEventInfo, k0.c mediaLoadData);

    void I(a eventTime, int trackType, androidx.media2.exoplayer.external.decoder.d decoderCounters);

    void J(a eventTime);

    void K(a eventTime);

    void L(a eventTime, boolean isLoading);

    void M(a eventTime, k0.b loadEventInfo, k0.c mediaLoadData);

    void N(a eventTime, boolean playWhenReady, int playbackState);

    void O(a eventTime, @p0 Surface surface);

    void P(a eventTime, boolean shuffleModeEnabled);

    void Q(a eventTime, int trackType, androidx.media2.exoplayer.external.decoder.d decoderCounters);

    void R(a eventTime);

    void b(a eventTime, Exception error);

    void d(a eventTime);

    void e(a eventTime, int reason);

    void f(a eventTime, int trackType, String decoderName, long initializationDurationMs);

    void g(a eventTime);

    void h(a eventTime);

    void i(a eventTime);

    void k(a eventTime, int repeatMode);

    void l(a eventTime);

    void m(a eventTime, k0.c mediaLoadData);

    void n(a eventTime);

    void o(a eventTime, androidx.media2.exoplayer.external.audio.c audioAttributes);

    void p(a eventTime, int width, int height);

    void q(a eventTime, int totalLoadTimeMs, long totalBytesLoaded, long bitrateEstimate);

    void r(a eventTime, int audioSessionId);

    void s(a eventTime, k0.b loadEventInfo, k0.c mediaLoadData, IOException error, boolean wasCanceled);

    void t(a eventTime, int width, int height, int unappliedRotationDegrees, float pixelWidthHeightRatio);

    void u(a eventTime, TrackGroupArray trackGroups, p trackSelections);

    void v(a eventTime);

    void w(a eventTime, float volume);

    void x(a eventTime, int droppedFrames, long elapsedMs);

    void y(a eventTime, k0.c mediaLoadData);

    void z(a eventTime, int trackType, Format format);
}
