package androidx.media2.exoplayer.external.trackselection;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.source.TrackGroup;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface m {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TrackGroup f57218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f57219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f57220c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        public final Object f57221d;

        public a(TrackGroup group, int... tracks) {
            this(group, tracks, 0, null);
        }

        public a(TrackGroup group, int[] tracks, int reason, @p0 Object data) {
            this.f57218a = group;
            this.f57219b = tracks;
            this.f57220c = reason;
            this.f57221d = data;
        }
    }

    public interface b {
        @Deprecated
        m a(TrackGroup group, androidx.media2.exoplayer.external.upstream.d bandwidthMeter, int... tracks);

        m[] b(a[] definitions, androidx.media2.exoplayer.external.upstream.d bandwidthMeter);
    }

    int a();

    int b(int index);

    void d();

    void e();

    int f(int indexInTrackGroup);

    TrackGroup g();

    void h();

    int i(long playbackPositionUs, List<? extends androidx.media2.exoplayer.external.source.chunk.l> queue);

    int j();

    Format k();

    Format l(int index);

    int length();

    void m(float speed);

    @p0
    Object n();

    int o();

    void p(long playbackPositionUs, long bufferedDurationUs, long availableDurationUs, List<? extends androidx.media2.exoplayer.external.source.chunk.l> queue, androidx.media2.exoplayer.external.source.chunk.m[] mediaChunkIterators);

    boolean q(int index, long blacklistDurationMs);

    int r(Format format);

    @Deprecated
    void s(long playbackPositionUs, long bufferedDurationUs, long availableDurationUs);
}
