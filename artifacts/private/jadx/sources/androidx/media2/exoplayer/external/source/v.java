package androidx.media2.exoplayer.external.source;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class v extends h<Void> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final z f56479i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f56480j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.z0.c f56481k = new androidx.media2.exoplayer.external.z0.c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.z0.b f56482l = new androidx.media2.exoplayer.external.z0.b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b f56483m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    private u f56484n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.p0
    private k0.a f56485o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f56486p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f56487q;

    private static final class a extends androidx.media2.exoplayer.external.z0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private final Object f56488b;

        public a(@androidx.annotation.p0 Object tag) {
            this.f56488b = tag;
        }

        @Override // androidx.media2.exoplayer.external.z0
        public int b(Object uid) {
            return uid == b.f56489d ? 0 : -1;
        }

        @Override // androidx.media2.exoplayer.external.z0
        public androidx.media2.exoplayer.external.z0.b g(int periodIndex, androidx.media2.exoplayer.external.z0.b period, boolean setIds) {
            return period.p(0, b.f56489d, 0, -9223372036854775807L, 0L);
        }

        @Override // androidx.media2.exoplayer.external.z0
        public int i() {
            return 1;
        }

        @Override // androidx.media2.exoplayer.external.z0
        public Object m(int periodIndex) {
            return b.f56489d;
        }

        @Override // androidx.media2.exoplayer.external.z0
        public androidx.media2.exoplayer.external.z0.c o(int windowIndex, androidx.media2.exoplayer.external.z0.c window, long defaultPositionProjectionUs) {
            return window.g(this.f56488b, null, -9223372036854775807L, -9223372036854775807L, false, true, 0L, -9223372036854775807L, 0, 0, 0L);
        }

        @Override // androidx.media2.exoplayer.external.z0
        public int r() {
            return 1;
        }
    }

    private static final class b extends r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Object f56489d = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f56490c;

        private b(androidx.media2.exoplayer.external.z0 timeline, Object replacedInternalId) {
            super(timeline);
            this.f56490c = replacedInternalId;
        }

        public static b w(@androidx.annotation.p0 Object windowTag) {
            return new b(new a(windowTag), f56489d);
        }

        public static b x(androidx.media2.exoplayer.external.z0 timeline, Object firstPeriodUid) {
            return new b(timeline, firstPeriodUid);
        }

        @Override // androidx.media2.exoplayer.external.source.r, androidx.media2.exoplayer.external.z0
        public int b(Object uid) {
            androidx.media2.exoplayer.external.z0 z0Var = this.f56325b;
            if (f56489d.equals(uid)) {
                uid = this.f56490c;
            }
            return z0Var.b(uid);
        }

        @Override // androidx.media2.exoplayer.external.source.r, androidx.media2.exoplayer.external.z0
        public androidx.media2.exoplayer.external.z0.b g(int periodIndex, androidx.media2.exoplayer.external.z0.b period, boolean setIds) {
            this.f56325b.g(periodIndex, period, setIds);
            if (androidx.media2.exoplayer.external.util.q0.b(period.f57954b, this.f56490c)) {
                period.f57954b = f56489d;
            }
            return period;
        }

        @Override // androidx.media2.exoplayer.external.source.r, androidx.media2.exoplayer.external.z0
        public Object m(int periodIndex) {
            Object objM = this.f56325b.m(periodIndex);
            return androidx.media2.exoplayer.external.util.q0.b(objM, this.f56490c) ? f56489d : objM;
        }

        public b v(androidx.media2.exoplayer.external.z0 timeline) {
            return new b(timeline, this.f56490c);
        }

        public androidx.media2.exoplayer.external.z0 y() {
            return this.f56325b;
        }
    }

    public v(z mediaSource, boolean useLazyPreparation) {
        this.f56479i = mediaSource;
        this.f56480j = useLazyPreparation;
        this.f56483m = b.w(mediaSource.E());
    }

    private Object G(Object internalPeriodUid) {
        return this.f56483m.f56490c.equals(internalPeriodUid) ? b.f56489d : internalPeriodUid;
    }

    private Object H(Object externalPeriodUid) {
        return externalPeriodUid.equals(b.f56489d) ? this.f56483m.f56490c : externalPeriodUid;
    }

    @Override // androidx.media2.exoplayer.external.source.h
    protected boolean D(z.a mediaPeriodId) {
        u uVar = this.f56484n;
        return uVar == null || !mediaPeriodId.equals(uVar.f56445b);
    }

    @Override // androidx.media2.exoplayer.external.source.c, androidx.media2.exoplayer.external.source.z
    @androidx.annotation.p0
    public Object E() {
        return this.f56479i.E();
    }

    @Override // androidx.media2.exoplayer.external.source.z
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public u e(z.a id2, androidx.media2.exoplayer.external.upstream.b allocator, long startPositionUs) {
        u uVar = new u(this.f56479i, id2, allocator, startPositionUs);
        if (this.f56487q) {
            uVar.d(id2.a(H(id2.f56507a)));
            return uVar;
        }
        this.f56484n = uVar;
        k0.a aVarL = l(0, id2, 0L);
        this.f56485o = aVarL;
        aVarL.z();
        if (!this.f56486p) {
            this.f56486p = true;
            B(null, this.f56479i);
        }
        return uVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media2.exoplayer.external.source.h
    @androidx.annotation.p0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public z.a w(Void id2, z.a mediaPeriodId) {
        return mediaPeriodId.a(G(mediaPeriodId.f56507a));
    }

    public androidx.media2.exoplayer.external.z0 J() {
        return this.f56483m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    @Override // androidx.media2.exoplayer.external.source.h
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void z(Void id2, z mediaSource, androidx.media2.exoplayer.external.z0 newTimeline) {
        long j10;
        if (this.f56487q) {
            this.f56483m = this.f56483m.v(newTimeline);
        } else if (newTimeline.s()) {
            this.f56483m = b.x(newTimeline, b.f56489d);
        } else {
            newTimeline.n(0, this.f56481k);
            long jB = this.f56481k.b();
            u uVar = this.f56484n;
            if (uVar != null) {
                long jL = uVar.l();
                if (jL != 0) {
                    j10 = jL;
                } else {
                    j10 = jB;
                }
            } else {
                j10 = jB;
            }
            Pair<Object, Long> pairJ = newTimeline.j(this.f56481k, this.f56482l, 0, j10);
            Object obj = pairJ.first;
            long jLongValue = ((Long) pairJ.second).longValue();
            this.f56483m = b.x(newTimeline, obj);
            u uVar2 = this.f56484n;
            if (uVar2 != null) {
                uVar2.v(jLongValue);
                z.a aVar = uVar2.f56445b;
                uVar2.d(aVar.a(H(aVar.f56507a)));
            }
        }
        this.f56487q = true;
        s(this.f56483m);
    }

    @Override // androidx.media2.exoplayer.external.source.h, androidx.media2.exoplayer.external.source.z
    public void a() throws IOException {
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public void c(x mediaPeriod) {
        ((u) mediaPeriod).w();
        if (mediaPeriod == this.f56484n) {
            ((k0.a) androidx.media2.exoplayer.external.util.a.g(this.f56485o)).A();
            this.f56485o = null;
            this.f56484n = null;
        }
    }

    @Override // androidx.media2.exoplayer.external.source.h, androidx.media2.exoplayer.external.source.c
    public void r(@androidx.annotation.p0 androidx.media2.exoplayer.external.upstream.q0 mediaTransferListener) {
        super.r(mediaTransferListener);
        if (this.f56480j) {
            return;
        }
        this.f56486p = true;
        B(null, this.f56479i);
    }

    @Override // androidx.media2.exoplayer.external.source.h, androidx.media2.exoplayer.external.source.c
    public void t() {
        this.f56487q = false;
        this.f56486p = false;
        super.t();
    }
}
