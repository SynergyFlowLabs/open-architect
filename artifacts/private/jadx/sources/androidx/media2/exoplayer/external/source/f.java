package androidx.media2.exoplayer.external.source;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class f extends h<Void> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final z f55865i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f55866j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f55867k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f55868l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f55869m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f55870n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ArrayList<e> f55871o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.z0.c f55872p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.p0
    private a f55873q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.p0
    private b f55874r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f55875s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f55876t;

    private static final class a extends r {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f55877c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f55878d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f55879e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f55880f;

        public a(androidx.media2.exoplayer.external.z0 timeline, long startUs, long endUs) throws b {
            super(timeline);
            boolean z10 = false;
            if (timeline.i() != 1) {
                throw new b(0);
            }
            androidx.media2.exoplayer.external.z0.c cVarN = timeline.n(0, new androidx.media2.exoplayer.external.z0.c());
            long jMax = Math.max(0L, startUs);
            long jMax2 = endUs == Long.MIN_VALUE ? cVarN.f57968j : Math.max(0L, endUs);
            long j10 = cVarN.f57968j;
            if (j10 != -9223372036854775807L) {
                jMax2 = jMax2 > j10 ? j10 : jMax2;
                if (jMax != 0 && !cVarN.f57963e) {
                    throw new b(1);
                }
                if (jMax > jMax2) {
                    throw new b(2);
                }
            }
            this.f55877c = jMax;
            this.f55878d = jMax2;
            this.f55879e = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
            if (cVarN.f57964f && (jMax2 == -9223372036854775807L || (j10 != -9223372036854775807L && jMax2 == j10))) {
                z10 = true;
            }
            this.f55880f = z10;
        }

        @Override // androidx.media2.exoplayer.external.source.r, androidx.media2.exoplayer.external.z0
        public androidx.media2.exoplayer.external.z0.b g(int periodIndex, androidx.media2.exoplayer.external.z0.b period, boolean setIds) {
            this.f56325b.g(0, period, setIds);
            long jM = period.m() - this.f55877c;
            long j10 = this.f55879e;
            return period.p(period.f57953a, period.f57954b, 0, j10 != -9223372036854775807L ? j10 - jM : -9223372036854775807L, jM);
        }

        @Override // androidx.media2.exoplayer.external.source.r, androidx.media2.exoplayer.external.z0
        public androidx.media2.exoplayer.external.z0.c o(int windowIndex, androidx.media2.exoplayer.external.z0.c window, long defaultPositionProjectionUs) {
            this.f56325b.o(0, window, 0L);
            long j10 = window.f57969k;
            long j11 = this.f55877c;
            window.f57969k = j10 + j11;
            window.f57968j = this.f55879e;
            window.f57964f = this.f55880f;
            long j12 = window.f57967i;
            if (j12 != -9223372036854775807L) {
                long jMax = Math.max(j12, j11);
                window.f57967i = jMax;
                long j13 = this.f55878d;
                if (j13 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j13);
                }
                window.f57967i = jMax - this.f55877c;
            }
            long jC = androidx.media2.exoplayer.external.c.c(this.f55877c);
            long j14 = window.f57961c;
            if (j14 != -9223372036854775807L) {
                window.f57961c = j14 + jC;
            }
            long j15 = window.f57962d;
            if (j15 != -9223372036854775807L) {
                window.f57962d = j15 + jC;
            }
            return window;
        }
    }

    public static final class b extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f55881b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f55882c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f55883d = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f55884a;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public b(int reason) {
            String strValueOf = String.valueOf(a(reason));
            super(strValueOf.length() != 0 ? "Illegal clipping: ".concat(strValueOf) : new String("Illegal clipping: "));
            this.f55884a = reason;
        }

        private static String a(int reason) {
            if (reason == 0) {
                return "invalid period count";
            }
            if (reason != 1) {
                return reason != 2 ? "unknown" : "start exceeds end";
            }
            return "not seekable to start";
        }
    }

    public f(z mediaSource, long startPositionUs, long endPositionUs) {
        this(mediaSource, startPositionUs, endPositionUs, true, false, false);
    }

    private void H(androidx.media2.exoplayer.external.z0 timeline) {
        long j10;
        long j11;
        timeline.n(0, this.f55872p);
        long jF = this.f55872p.f();
        if (this.f55873q == null || this.f55871o.isEmpty() || this.f55869m) {
            long j12 = this.f55866j;
            long j13 = this.f55867k;
            if (this.f55870n) {
                long jB = this.f55872p.b();
                j12 += jB;
                j13 += jB;
            }
            this.f55875s = jF + j12;
            this.f55876t = this.f55867k != Long.MIN_VALUE ? jF + j13 : Long.MIN_VALUE;
            int size = this.f55871o.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f55871o.get(i10).v(this.f55875s, this.f55876t);
            }
            j10 = j12;
            j11 = j13;
        } else {
            long j14 = this.f55875s - jF;
            j11 = this.f55867k != Long.MIN_VALUE ? this.f55876t - jF : Long.MIN_VALUE;
            j10 = j14;
        }
        try {
            a aVar = new a(timeline, j10, j11);
            this.f55873q = aVar;
            s(aVar);
        } catch (b e10) {
            this.f55874r = e10;
        }
    }

    @Override // androidx.media2.exoplayer.external.source.c, androidx.media2.exoplayer.external.source.z
    @androidx.annotation.p0
    public Object E() {
        return this.f55865i.E();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media2.exoplayer.external.source.h
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public long x(Void id2, long mediaTimeMs) {
        if (mediaTimeMs == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long jC = androidx.media2.exoplayer.external.c.c(this.f55866j);
        long jMax = Math.max(0L, mediaTimeMs - jC);
        long j10 = this.f55867k;
        return j10 != Long.MIN_VALUE ? Math.min(androidx.media2.exoplayer.external.c.c(j10) - jC, jMax) : jMax;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media2.exoplayer.external.source.h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void z(Void id2, z mediaSource, androidx.media2.exoplayer.external.z0 timeline) {
        if (this.f55874r != null) {
            return;
        }
        H(timeline);
    }

    @Override // androidx.media2.exoplayer.external.source.h, androidx.media2.exoplayer.external.source.z
    public void a() throws IOException {
        b bVar = this.f55874r;
        if (bVar != null) {
            throw bVar;
        }
        super.a();
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public void c(x mediaPeriod) {
        androidx.media2.exoplayer.external.util.a.i(this.f55871o.remove(mediaPeriod));
        this.f55865i.c(((e) mediaPeriod).f55852a);
        if (!this.f55871o.isEmpty() || this.f55869m) {
            return;
        }
        H(((a) androidx.media2.exoplayer.external.util.a.g(this.f55873q)).f56325b);
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public x e(z.a id2, androidx.media2.exoplayer.external.upstream.b allocator, long startPositionUs) {
        e eVar = new e(this.f55865i.e(id2, allocator, startPositionUs), this.f55868l, this.f55875s, this.f55876t);
        this.f55871o.add(eVar);
        return eVar;
    }

    @Override // androidx.media2.exoplayer.external.source.h, androidx.media2.exoplayer.external.source.c
    protected void r(@androidx.annotation.p0 androidx.media2.exoplayer.external.upstream.q0 mediaTransferListener) {
        super.r(mediaTransferListener);
        B(null, this.f55865i);
    }

    @Override // androidx.media2.exoplayer.external.source.h, androidx.media2.exoplayer.external.source.c
    protected void t() {
        super.t();
        this.f55874r = null;
        this.f55873q = null;
    }

    public f(z mediaSource, long durationUs) {
        this(mediaSource, 0L, durationUs, true, false, true);
    }

    public f(z mediaSource, long startPositionUs, long endPositionUs, boolean enableInitialDiscontinuity, boolean allowDynamicClippingUpdates, boolean relativeToDefaultPosition) {
        androidx.media2.exoplayer.external.util.a.a(startPositionUs >= 0);
        this.f55865i = (z) androidx.media2.exoplayer.external.util.a.g(mediaSource);
        this.f55866j = startPositionUs;
        this.f55867k = endPositionUs;
        this.f55868l = enableInitialDiscontinuity;
        this.f55869m = allowDynamicClippingUpdates;
        this.f55870n = relativeToDefaultPosition;
        this.f55871o = new ArrayList<>();
        this.f55872p = new androidx.media2.exoplayer.external.z0.c();
    }
}
