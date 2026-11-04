package androidx.media2.exoplayer.external.source;

import androidx.media2.exoplayer.external.Format;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class y0 extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f56495g = 44100;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f56496h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f56497i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Format f56498j = Format.r(null, "audio/raw", null, -1, -1, 2, 44100, 2, null, null, 0, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final byte[] f56499k = new byte[androidx.media2.exoplayer.external.util.q0.V(2, 2) * 1024];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f56500f;

    private static final class a implements x {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final TrackGroupArray f56501c = new TrackGroupArray(new TrackGroup(y0.f56498j));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f56502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<v0> f56503b = new ArrayList<>();

        public a(long durationUs) {
            this.f56502a = durationUs;
        }

        private long a(long positionUs) {
            return androidx.media2.exoplayer.external.util.q0.s(positionUs, 0L, this.f56502a);
        }

        @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
        public long b() {
            return Long.MIN_VALUE;
        }

        @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
        public void c(long positionUs) {
        }

        @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
        public long e() {
            return Long.MIN_VALUE;
        }

        @Override // androidx.media2.exoplayer.external.source.x
        public List f(List list) {
            return w.a(this, list);
        }

        @Override // androidx.media2.exoplayer.external.source.x
        public long h(long positionUs) {
            long jA = a(positionUs);
            for (int i10 = 0; i10 < this.f56503b.size(); i10++) {
                ((b) this.f56503b.get(i10)).b(jA);
            }
            return jA;
        }

        @Override // androidx.media2.exoplayer.external.source.x
        public long i() {
            return -9223372036854775807L;
        }

        @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
        public boolean k(long positionUs) {
            return false;
        }

        @Override // androidx.media2.exoplayer.external.source.x
        public TrackGroupArray m() {
            return f56501c;
        }

        @Override // androidx.media2.exoplayer.external.source.x
        public long n(long positionUs, androidx.media2.exoplayer.external.x0 seekParameters) {
            return a(positionUs);
        }

        @Override // androidx.media2.exoplayer.external.source.x
        public void o() {
        }

        @Override // androidx.media2.exoplayer.external.source.x
        public void p(long positionUs, boolean toKeyframe) {
        }

        @Override // androidx.media2.exoplayer.external.source.x
        public void r(x.a callback, long positionUs) {
            callback.g(this);
        }

        @Override // androidx.media2.exoplayer.external.source.x
        public long s(androidx.media2.exoplayer.external.trackselection.m[] selections, boolean[] mayRetainStreamFlags, v0[] streams, boolean[] streamResetFlags, long positionUs) {
            long jA = a(positionUs);
            for (int i10 = 0; i10 < selections.length; i10++) {
                v0 v0Var = streams[i10];
                if (v0Var != null && (selections[i10] == null || !mayRetainStreamFlags[i10])) {
                    this.f56503b.remove(v0Var);
                    streams[i10] = null;
                }
                if (streams[i10] == null && selections[i10] != null) {
                    b bVar = new b(this.f56502a);
                    bVar.b(jA);
                    this.f56503b.add(bVar);
                    streams[i10] = bVar;
                    streamResetFlags[i10] = true;
                }
            }
            return jA;
        }
    }

    private static final class b implements v0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f56504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f56505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f56506c;

        public b(long durationUs) {
            this.f56504a = y0.y(durationUs);
            b(0L);
        }

        @Override // androidx.media2.exoplayer.external.source.v0
        public void a() {
        }

        public void b(long positionUs) {
            this.f56506c = androidx.media2.exoplayer.external.util.q0.s(y0.y(positionUs), 0L, this.f56504a);
        }

        @Override // androidx.media2.exoplayer.external.source.v0
        public boolean isReady() {
            return true;
        }

        @Override // androidx.media2.exoplayer.external.source.v0
        public int l(long positionUs) {
            long j10 = this.f56506c;
            b(positionUs);
            return (int) ((this.f56506c - j10) / ((long) y0.f56499k.length));
        }

        @Override // androidx.media2.exoplayer.external.source.v0
        public int q(androidx.media2.exoplayer.external.d0 formatHolder, androidx.media2.exoplayer.external.decoder.e buffer, boolean formatRequired) {
            if (!this.f56505b || formatRequired) {
                formatHolder.f53762c = y0.f56498j;
                this.f56505b = true;
                return -5;
            }
            long j10 = this.f56504a - this.f56506c;
            if (j10 == 0) {
                buffer.c(4);
                return -4;
            }
            int iMin = (int) Math.min(y0.f56499k.length, j10);
            buffer.z(iMin);
            buffer.f53789c.put(y0.f56499k, 0, iMin);
            buffer.f53790d = y0.z(this.f56506c);
            buffer.c(1);
            this.f56506c += (long) iMin;
            return -4;
        }
    }

    static {
        int i10 = 2 >> 0;
    }

    public y0(long durationUs) {
        androidx.media2.exoplayer.external.util.a.a(durationUs >= 0);
        this.f56500f = durationUs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long y(long durationUs) {
        return ((long) androidx.media2.exoplayer.external.util.q0.V(2, 2)) * ((durationUs * 44100) / 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long z(long bytes) {
        return ((bytes / ((long) androidx.media2.exoplayer.external.util.q0.V(2, 2))) * 1000000) / 44100;
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public void a() {
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public void c(x mediaPeriod) {
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public x e(z.a id2, androidx.media2.exoplayer.external.upstream.b allocator, long startPositionUs) {
        return new a(this.f56500f);
    }

    @Override // androidx.media2.exoplayer.external.source.c
    protected void r(@androidx.annotation.p0 androidx.media2.exoplayer.external.upstream.q0 mediaTransferListener) {
        s(new z0(this.f56500f, true, false));
    }

    @Override // androidx.media2.exoplayer.external.source.c
    protected void t() {
    }
}
