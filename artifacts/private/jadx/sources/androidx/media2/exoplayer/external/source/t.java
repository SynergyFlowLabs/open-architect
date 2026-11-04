package androidx.media2.exoplayer.external.source;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class t extends h<Void> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final z f56412i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f56413j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map<z.a, z.a> f56414k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<x, z.a> f56415l;

    private static final class a extends r {
        public a(androidx.media2.exoplayer.external.z0 timeline) {
            super(timeline);
        }

        @Override // androidx.media2.exoplayer.external.source.r, androidx.media2.exoplayer.external.z0
        public int e(int windowIndex, int repeatMode, boolean shuffleModeEnabled) {
            int iE = this.f56325b.e(windowIndex, repeatMode, shuffleModeEnabled);
            return iE == -1 ? a(shuffleModeEnabled) : iE;
        }

        @Override // androidx.media2.exoplayer.external.source.r, androidx.media2.exoplayer.external.z0
        public int l(int windowIndex, int repeatMode, boolean shuffleModeEnabled) {
            int iL = this.f56325b.l(windowIndex, repeatMode, shuffleModeEnabled);
            return iL == -1 ? c(shuffleModeEnabled) : iL;
        }
    }

    private static final class b extends androidx.media2.exoplayer.external.source.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.z0 f56416e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f56417f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f56418g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f56419h;

        public b(androidx.media2.exoplayer.external.z0 childTimeline, int loopCount) {
            super(false, new x0.b(loopCount));
            this.f56416e = childTimeline;
            int i10 = childTimeline.i();
            this.f56417f = i10;
            this.f56418g = childTimeline.r();
            this.f56419h = loopCount;
            if (i10 > 0) {
                androidx.media2.exoplayer.external.util.a.j(loopCount <= Integer.MAX_VALUE / i10, "LoopingMediaSource contains too many periods");
            }
        }

        @Override // androidx.media2.exoplayer.external.source.a
        protected int B(int childIndex) {
            return childIndex * this.f56417f;
        }

        @Override // androidx.media2.exoplayer.external.source.a
        protected int C(int childIndex) {
            return childIndex * this.f56418g;
        }

        @Override // androidx.media2.exoplayer.external.source.a
        protected androidx.media2.exoplayer.external.z0 F(int childIndex) {
            return this.f56416e;
        }

        @Override // androidx.media2.exoplayer.external.z0
        public int i() {
            return this.f56417f * this.f56419h;
        }

        @Override // androidx.media2.exoplayer.external.z0
        public int r() {
            return this.f56418g * this.f56419h;
        }

        @Override // androidx.media2.exoplayer.external.source.a
        protected int u(Object childUid) {
            if (childUid instanceof Integer) {
                return ((Integer) childUid).intValue();
            }
            return -1;
        }

        @Override // androidx.media2.exoplayer.external.source.a
        protected int v(int periodIndex) {
            return periodIndex / this.f56417f;
        }

        @Override // androidx.media2.exoplayer.external.source.a
        protected int w(int windowIndex) {
            return windowIndex / this.f56418g;
        }

        @Override // androidx.media2.exoplayer.external.source.a
        protected Object z(int childIndex) {
            return Integer.valueOf(childIndex);
        }
    }

    public t(z childSource) {
        this(childSource, Integer.MAX_VALUE);
    }

    @Override // androidx.media2.exoplayer.external.source.c, androidx.media2.exoplayer.external.source.z
    @androidx.annotation.p0
    public Object E() {
        return this.f56412i.E();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media2.exoplayer.external.source.h
    @androidx.annotation.p0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public z.a w(Void id2, z.a mediaPeriodId) {
        return this.f56413j != Integer.MAX_VALUE ? this.f56414k.get(mediaPeriodId) : mediaPeriodId;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media2.exoplayer.external.source.h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void z(Void id2, z mediaSource, androidx.media2.exoplayer.external.z0 timeline) {
        s(this.f56413j != Integer.MAX_VALUE ? new b(timeline, this.f56413j) : new a(timeline));
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public void c(x mediaPeriod) {
        this.f56412i.c(mediaPeriod);
        z.a aVarRemove = this.f56415l.remove(mediaPeriod);
        if (aVarRemove != null) {
            this.f56414k.remove(aVarRemove);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public x e(z.a id2, androidx.media2.exoplayer.external.upstream.b allocator, long startPositionUs) {
        if (this.f56413j == Integer.MAX_VALUE) {
            return this.f56412i.e(id2, allocator, startPositionUs);
        }
        z.a aVarA = id2.a(androidx.media2.exoplayer.external.source.a.x(id2.f56507a));
        this.f56414k.put(aVarA, id2);
        x xVarE = this.f56412i.e(aVarA, allocator, startPositionUs);
        this.f56415l.put(xVarE, aVarA);
        return xVarE;
    }

    @Override // androidx.media2.exoplayer.external.source.h, androidx.media2.exoplayer.external.source.c
    protected void r(@androidx.annotation.p0 androidx.media2.exoplayer.external.upstream.q0 mediaTransferListener) {
        super.r(mediaTransferListener);
        B(null, this.f56412i);
    }

    public t(z childSource, int loopCount) {
        androidx.media2.exoplayer.external.util.a.a(loopCount > 0);
        this.f56412i = childSource;
        this.f56413j = loopCount;
        this.f56414k = new HashMap();
        this.f56415l = new HashMap();
    }
}
