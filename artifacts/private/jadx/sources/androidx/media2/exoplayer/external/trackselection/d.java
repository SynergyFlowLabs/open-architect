package androidx.media2.exoplayer.external.trackselection;

import android.util.Pair;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.f0;
import androidx.media2.exoplayer.external.source.TrackGroup;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f57158l = 15000;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f57159m = 50000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f57160n = 2500;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f57161o = 5000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f57162p = 5000;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float f57163q = 0.75f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f57164r = 10000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private androidx.media2.exoplayer.external.upstream.p f57165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.media2.exoplayer.external.util.c f57166b = androidx.media2.exoplayer.external.util.c.f57511a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f57167c = 15000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f57168d = 50000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f57169e = 2500;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f57170f = 5000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f57171g = 5000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f57172h = 0.75f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f57173i = 10000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f57174j = c.f57195a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f57175k;

    class a implements m.b {
        a() {
        }

        @Override // androidx.media2.exoplayer.external.trackselection.m.b
        public m a(TrackGroup trackGroup, androidx.media2.exoplayer.external.upstream.d dVar, int... iArr) {
            return n.a(this, trackGroup, dVar, iArr);
        }

        @Override // androidx.media2.exoplayer.external.trackselection.m.b
        public m[] b(m.a[] definitions, final androidx.media2.exoplayer.external.upstream.d bandwidthMeter) {
            return q.a(definitions, new q.a(this, bandwidthMeter) { // from class: androidx.media2.exoplayer.external.trackselection.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final d.a f57156a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final androidx.media2.exoplayer.external.upstream.d f57157b;

                {
                    this.f57156a = this;
                    this.f57157b = bandwidthMeter;
                }

                @Override // androidx.media2.exoplayer.external.trackselection.q.a
                public m a(m.a aVar) {
                    return this.f57156a.c(this.f57157b, aVar);
                }
            });
        }

        final /* synthetic */ m c(androidx.media2.exoplayer.external.upstream.d dVar, m.a aVar) {
            return new b(aVar.f57218a, aVar.f57219b, dVar, d.this.f57167c, d.this.f57168d, d.this.f57171g, d.this.f57172h, d.this.f57173i, d.this.f57174j, d.this.f57166b, null);
        }
    }

    private static final class b extends androidx.media2.exoplayer.external.trackselection.b {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final int f57177x = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.upstream.d f57178g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.util.c f57179h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final c f57180i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int[] f57181j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final long f57182k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final long f57183l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final long f57184m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final float f57185n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final long f57186o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final int f57187p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final int f57188q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final double f57189r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final double f57190s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f57191t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f57192u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f57193v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private float f57194w;

        /* synthetic */ b(TrackGroup trackGroup, int[] iArr, androidx.media2.exoplayer.external.upstream.d dVar, int i10, int i11, int i12, float f10, int i13, c cVar, androidx.media2.exoplayer.external.util.c cVar2, a aVar) {
            this(trackGroup, iArr, dVar, i10, i11, i12, f10, i13, cVar, cVar2);
        }

        private void A(long nowMs) {
            for (int i10 = 0; i10 < this.f57151b; i10++) {
                if (nowMs == Long.MIN_VALUE || !c(i10, nowMs)) {
                    this.f57181j[i10] = l(i10).f53097e;
                } else {
                    this.f57181j[i10] = -1;
                }
            }
        }

        private static long t(long playbackPositionUs, long bufferedDurationUs) {
            return playbackPositionUs >= 0 ? bufferedDurationUs : playbackPositionUs + bufferedDurationUs;
        }

        private long u(int bitrate) {
            if (bitrate <= this.f57187p) {
                return this.f57182k;
            }
            return bitrate >= this.f57188q ? this.f57183l - this.f57184m : (int) ((this.f57189r * Math.log(bitrate)) + this.f57190s);
        }

        private boolean v(long bufferUs) {
            int i10 = this.f57181j[this.f57192u];
            return i10 == -1 || Math.abs(bufferUs - u(i10)) > this.f57184m;
        }

        private int w(boolean isInitialSelection) {
            long jB = (long) (this.f57178g.b() * this.f57185n);
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int[] iArr = this.f57181j;
                if (i10 >= iArr.length) {
                    return i11;
                }
                int i12 = iArr[i10];
                if (i12 != -1) {
                    if (Math.round(i12 * this.f57194w) <= jB && this.f57180i.a(l(i10), this.f57181j[i10], isInitialSelection)) {
                        return i10;
                    }
                    i11 = i10;
                }
                i10++;
            }
        }

        private int x(long bufferUs) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int[] iArr = this.f57181j;
                if (i10 >= iArr.length) {
                    return i11;
                }
                int i12 = iArr[i10];
                if (i12 != -1) {
                    if (u(i12) <= bufferUs && this.f57180i.a(l(i10), this.f57181j[i10], false)) {
                        return i10;
                    }
                    i11 = i10;
                }
                i10++;
            }
        }

        private void y(long bufferUs) {
            int iW = w(false);
            int iX = x(bufferUs);
            int i10 = this.f57192u;
            if (iX <= i10) {
                this.f57192u = iX;
                this.f57191t = true;
            } else if (bufferUs >= this.f57186o || iW >= i10 || this.f57181j[i10] == -1) {
                this.f57192u = iW;
            }
        }

        private void z(long bufferUs) {
            if (v(bufferUs)) {
                this.f57192u = x(bufferUs);
            }
        }

        @Override // androidx.media2.exoplayer.external.trackselection.m
        public int a() {
            return this.f57192u;
        }

        @Override // androidx.media2.exoplayer.external.trackselection.b, androidx.media2.exoplayer.external.trackselection.m
        public void e() {
            this.f57191t = false;
        }

        @Override // androidx.media2.exoplayer.external.trackselection.b, androidx.media2.exoplayer.external.trackselection.m
        public void m(float playbackSpeed) {
            this.f57194w = playbackSpeed;
        }

        @Override // androidx.media2.exoplayer.external.trackselection.m
        @p0
        public Object n() {
            return null;
        }

        @Override // androidx.media2.exoplayer.external.trackselection.m
        public int o() {
            return this.f57193v;
        }

        @Override // androidx.media2.exoplayer.external.trackselection.b, androidx.media2.exoplayer.external.trackselection.m
        public void p(long playbackPositionUs, long bufferedDurationUs, long availableDurationUs, List<? extends androidx.media2.exoplayer.external.source.chunk.l> queue, androidx.media2.exoplayer.external.source.chunk.m[] mediaChunkIterators) {
            A(this.f57179h.b());
            if (this.f57193v == 0) {
                this.f57193v = 1;
                this.f57192u = w(true);
                return;
            }
            long jT = t(playbackPositionUs, bufferedDurationUs);
            int i10 = this.f57192u;
            if (this.f57191t) {
                z(jT);
            } else {
                y(jT);
            }
            if (this.f57192u != i10) {
                this.f57193v = 3;
            }
        }

        private b(TrackGroup trackGroup, int[] tracks, androidx.media2.exoplayer.external.upstream.d bandwidthMeter, int minBufferMs, int maxBufferMs, int hysteresisBufferMs, float startUpBandwidthFraction, int startUpMinBufferForQualityIncreaseMs, c dynamicFormatFilter, androidx.media2.exoplayer.external.util.c clock) {
            super(trackGroup, tracks);
            this.f57178g = bandwidthMeter;
            long jB = androidx.media2.exoplayer.external.c.b(minBufferMs);
            this.f57182k = jB;
            long jB2 = androidx.media2.exoplayer.external.c.b(maxBufferMs);
            this.f57183l = jB2;
            long jB3 = androidx.media2.exoplayer.external.c.b(hysteresisBufferMs);
            this.f57184m = jB3;
            this.f57185n = startUpBandwidthFraction;
            this.f57186o = androidx.media2.exoplayer.external.c.b(startUpMinBufferForQualityIncreaseMs);
            this.f57180i = dynamicFormatFilter;
            this.f57179h = clock;
            this.f57181j = new int[this.f57151b];
            int i10 = l(0).f53097e;
            this.f57188q = i10;
            int i11 = l(this.f57151b - 1).f53097e;
            this.f57187p = i11;
            this.f57193v = 0;
            this.f57194w = 1.0f;
            double dLog = ((jB2 - jB3) - jB) / Math.log(((double) i10) / ((double) i11));
            this.f57189r = dLog;
            this.f57190s = jB - (dLog * Math.log(i11));
        }
    }

    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f57195a = f.f57196b;

        boolean a(Format format, int trackBitrate, boolean isInitialSelection);
    }

    public Pair<m.b, f0> h() {
        androidx.media2.exoplayer.external.util.a.a(this.f57171g < this.f57168d - this.f57167c);
        androidx.media2.exoplayer.external.util.a.i(!this.f57175k);
        this.f57175k = true;
        androidx.media2.exoplayer.external.f.a aVarF = new androidx.media2.exoplayer.external.f.a().f(Integer.MAX_VALUE);
        int i10 = this.f57168d;
        androidx.media2.exoplayer.external.f.a aVarD = aVarF.d(i10, i10, this.f57169e, this.f57170f);
        androidx.media2.exoplayer.external.upstream.p pVar = this.f57165a;
        if (pVar != null) {
            aVarD.b(pVar);
        }
        return Pair.create(new a(), aVarD.a());
    }

    public d i(androidx.media2.exoplayer.external.upstream.p allocator) {
        androidx.media2.exoplayer.external.util.a.i(!this.f57175k);
        this.f57165a = allocator;
        return this;
    }

    public d j(int minBufferMs, int maxBufferMs, int bufferForPlaybackMs, int bufferForPlaybackAfterRebufferMs) {
        androidx.media2.exoplayer.external.util.a.i(!this.f57175k);
        this.f57167c = minBufferMs;
        this.f57168d = maxBufferMs;
        this.f57169e = bufferForPlaybackMs;
        this.f57170f = bufferForPlaybackAfterRebufferMs;
        return this;
    }

    public d k(androidx.media2.exoplayer.external.util.c clock) {
        androidx.media2.exoplayer.external.util.a.i(!this.f57175k);
        this.f57166b = clock;
        return this;
    }

    public d l(c dynamicFormatFilter) {
        androidx.media2.exoplayer.external.util.a.i(!this.f57175k);
        this.f57174j = dynamicFormatFilter;
        return this;
    }

    public d m(int hysteresisBufferMs) {
        androidx.media2.exoplayer.external.util.a.i(!this.f57175k);
        this.f57171g = hysteresisBufferMs;
        return this;
    }

    public d n(float bandwidthFraction, int minBufferForQualityIncreaseMs) {
        androidx.media2.exoplayer.external.util.a.i(!this.f57175k);
        this.f57172h = bandwidthFraction;
        this.f57173i = minBufferForQualityIncreaseMs;
        return this;
    }
}
