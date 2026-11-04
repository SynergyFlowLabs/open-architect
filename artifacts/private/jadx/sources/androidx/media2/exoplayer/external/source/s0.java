package androidx.media2.exoplayer.external.source;

import android.net.Uri;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class s0 extends c implements r0.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f56392q = 1048576;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Uri f56393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.l.a f56394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.extractor.l f56395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.drm.r<?> f56396i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.f0 f56397j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f56398k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f56399l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    private final Object f56400m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f56401n = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f56402o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media2.exoplayer.external.upstream.q0 f56403p;

    public static final class a implements m0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.upstream.l.a f56404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.media2.exoplayer.external.extractor.l f56405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private String f56406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private Object f56407d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.media2.exoplayer.external.drm.r<?> f56408e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private androidx.media2.exoplayer.external.upstream.f0 f56409f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f56410g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f56411h;

        public a(androidx.media2.exoplayer.external.upstream.l.a dataSourceFactory) {
            this(dataSourceFactory, new androidx.media2.exoplayer.external.extractor.f());
        }

        @Override // androidx.media2.exoplayer.external.source.m0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public s0 d(Uri uri) {
            this.f56411h = true;
            return new s0(uri, this.f56404a, this.f56405b, this.f56408e, this.f56409f, this.f56406c, this.f56410g, this.f56407d);
        }

        public a b(int continueLoadingCheckIntervalBytes) {
            androidx.media2.exoplayer.external.util.a.i(!this.f56411h);
            this.f56410g = continueLoadingCheckIntervalBytes;
            return this;
        }

        @Override // androidx.media2.exoplayer.external.source.m0
        public int[] c() {
            return new int[]{3};
        }

        @Override // androidx.media2.exoplayer.external.source.m0
        public m0 e(List list) {
            return l0.a(this, list);
        }

        public a f(String customCacheKey) {
            androidx.media2.exoplayer.external.util.a.i(!this.f56411h);
            this.f56406c = customCacheKey;
            return this;
        }

        public a g(androidx.media2.exoplayer.external.drm.r<?> drmSessionManager) {
            androidx.media2.exoplayer.external.util.a.i(!this.f56411h);
            this.f56408e = drmSessionManager;
            return this;
        }

        @Deprecated
        public a h(androidx.media2.exoplayer.external.extractor.l extractorsFactory) {
            androidx.media2.exoplayer.external.util.a.i(!this.f56411h);
            this.f56405b = extractorsFactory;
            return this;
        }

        public a i(androidx.media2.exoplayer.external.upstream.f0 loadErrorHandlingPolicy) {
            androidx.media2.exoplayer.external.util.a.i(!this.f56411h);
            this.f56409f = loadErrorHandlingPolicy;
            return this;
        }

        public a j(Object tag) {
            androidx.media2.exoplayer.external.util.a.i(!this.f56411h);
            this.f56407d = tag;
            return this;
        }

        public a(androidx.media2.exoplayer.external.upstream.l.a dataSourceFactory, androidx.media2.exoplayer.external.extractor.l extractorsFactory) {
            this.f56404a = dataSourceFactory;
            this.f56405b = extractorsFactory;
            this.f56408e = androidx.media2.exoplayer.external.drm.q.b();
            this.f56409f = new androidx.media2.exoplayer.external.upstream.x();
            this.f56410g = 1048576;
        }
    }

    s0(Uri uri, androidx.media2.exoplayer.external.upstream.l.a dataSourceFactory, androidx.media2.exoplayer.external.extractor.l extractorsFactory, androidx.media2.exoplayer.external.drm.r<?> drmSessionManager, androidx.media2.exoplayer.external.upstream.f0 loadableLoadErrorHandlingPolicy, @androidx.annotation.p0 String customCacheKey, int continueLoadingCheckIntervalBytes, @androidx.annotation.p0 Object tag) {
        this.f56393f = uri;
        this.f56394g = dataSourceFactory;
        this.f56395h = extractorsFactory;
        this.f56396i = drmSessionManager;
        this.f56397j = loadableLoadErrorHandlingPolicy;
        this.f56398k = customCacheKey;
        this.f56399l = continueLoadingCheckIntervalBytes;
        this.f56400m = tag;
    }

    private void u(long durationUs, boolean isSeekable) {
        this.f56401n = durationUs;
        this.f56402o = isSeekable;
        s(new z0(this.f56401n, this.f56402o, false, null, this.f56400m));
    }

    @Override // androidx.media2.exoplayer.external.source.c, androidx.media2.exoplayer.external.source.z
    @androidx.annotation.p0
    public Object E() {
        return this.f56400m;
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public void a() throws IOException {
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public void c(x mediaPeriod) {
        ((r0) mediaPeriod).X();
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public x e(z.a id2, androidx.media2.exoplayer.external.upstream.b allocator, long startPositionUs) {
        androidx.media2.exoplayer.external.upstream.l lVarA = this.f56394g.a();
        androidx.media2.exoplayer.external.upstream.q0 q0Var = this.f56403p;
        if (q0Var != null) {
            lVarA.c(q0Var);
        }
        return new r0(this.f56393f, lVarA, this.f56395h.c(), this.f56396i, this.f56397j, m(id2), this, allocator, this.f56398k, this.f56399l);
    }

    @Override // androidx.media2.exoplayer.external.source.r0.c
    public void k(long durationUs, boolean isSeekable) {
        if (durationUs == -9223372036854775807L) {
            durationUs = this.f56401n;
        }
        if (this.f56401n == durationUs && this.f56402o == isSeekable) {
            return;
        }
        u(durationUs, isSeekable);
    }

    @Override // androidx.media2.exoplayer.external.source.c
    protected void r(@androidx.annotation.p0 androidx.media2.exoplayer.external.upstream.q0 mediaTransferListener) {
        this.f56403p = mediaTransferListener;
        u(this.f56401n, this.f56402o);
    }

    @Override // androidx.media2.exoplayer.external.source.c
    protected void t() {
    }
}
