package androidx.media2.exoplayer.external.source;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
@Deprecated
public final class q extends h<Void> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final int f56314j = 1048576;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final s0 f56315i;

    @Deprecated
    public interface b {
        void a(IOException error);
    }

    @Deprecated
    private static final class c extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f56316a;

        public c(b eventListener) {
            this.f56316a = (b) androidx.media2.exoplayer.external.util.a.g(eventListener);
        }

        @Override // androidx.media2.exoplayer.external.source.o, androidx.media2.exoplayer.external.source.k0
        public void M(int windowIndex, @androidx.annotation.p0 z.a mediaPeriodId, k0.b loadEventInfo, k0.c mediaLoadData, IOException error, boolean wasCanceled) {
            this.f56316a.a(error);
        }
    }

    @Deprecated
    public static final class d implements m0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.upstream.l.a f56317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private androidx.media2.exoplayer.external.extractor.l f56318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private String f56319c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private Object f56320d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.media2.exoplayer.external.upstream.f0 f56321e = new androidx.media2.exoplayer.external.upstream.x();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f56322f = 1048576;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f56323g;

        public d(androidx.media2.exoplayer.external.upstream.l.a dataSourceFactory) {
            this.f56317a = dataSourceFactory;
        }

        @Override // androidx.media2.exoplayer.external.source.m0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q d(Uri uri) {
            this.f56323g = true;
            if (this.f56318b == null) {
                this.f56318b = new androidx.media2.exoplayer.external.extractor.f();
            }
            return new q(uri, this.f56317a, this.f56318b, this.f56321e, this.f56319c, this.f56322f, this.f56320d);
        }

        @Deprecated
        public q b(Uri uri, @androidx.annotation.p0 Handler eventHandler, @androidx.annotation.p0 k0 eventListener) {
            q qVarD = d(uri);
            if (eventHandler != null && eventListener != null) {
                qVarD.g(eventHandler, eventListener);
            }
            return qVarD;
        }

        @Override // androidx.media2.exoplayer.external.source.m0
        public int[] c() {
            return new int[]{3};
        }

        @Override // androidx.media2.exoplayer.external.source.m0
        public m0 e(List list) {
            return l0.a(this, list);
        }

        public d f(int continueLoadingCheckIntervalBytes) {
            androidx.media2.exoplayer.external.util.a.i(!this.f56323g);
            this.f56322f = continueLoadingCheckIntervalBytes;
            return this;
        }

        public d g(String customCacheKey) {
            androidx.media2.exoplayer.external.util.a.i(!this.f56323g);
            this.f56319c = customCacheKey;
            return this;
        }

        public d h(androidx.media2.exoplayer.external.extractor.l extractorsFactory) {
            androidx.media2.exoplayer.external.util.a.i(!this.f56323g);
            this.f56318b = extractorsFactory;
            return this;
        }

        public d i(androidx.media2.exoplayer.external.upstream.f0 loadErrorHandlingPolicy) {
            androidx.media2.exoplayer.external.util.a.i(!this.f56323g);
            this.f56321e = loadErrorHandlingPolicy;
            return this;
        }

        @Deprecated
        public d j(int minLoadableRetryCount) {
            return i(new androidx.media2.exoplayer.external.upstream.x(minLoadableRetryCount));
        }

        public d k(Object tag) {
            androidx.media2.exoplayer.external.util.a.i(!this.f56323g);
            this.f56320d = tag;
            return this;
        }
    }

    @Override // androidx.media2.exoplayer.external.source.c, androidx.media2.exoplayer.external.source.z
    @androidx.annotation.p0
    public Object E() {
        return this.f56315i.E();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media2.exoplayer.external.source.h
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void z(@androidx.annotation.p0 Void id2, z mediaSource, androidx.media2.exoplayer.external.z0 timeline) {
        s(timeline);
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public void c(x mediaPeriod) {
        this.f56315i.c(mediaPeriod);
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public x e(z.a id2, androidx.media2.exoplayer.external.upstream.b allocator, long startPositionUs) {
        return this.f56315i.e(id2, allocator, startPositionUs);
    }

    @Override // androidx.media2.exoplayer.external.source.h, androidx.media2.exoplayer.external.source.c
    protected void r(@androidx.annotation.p0 androidx.media2.exoplayer.external.upstream.q0 mediaTransferListener) {
        super.r(mediaTransferListener);
        B(null, this.f56315i);
    }

    @Deprecated
    public q(Uri uri, androidx.media2.exoplayer.external.upstream.l.a dataSourceFactory, androidx.media2.exoplayer.external.extractor.l extractorsFactory, @androidx.annotation.p0 Handler eventHandler, @androidx.annotation.p0 b eventListener) {
        this(uri, dataSourceFactory, extractorsFactory, eventHandler, eventListener, null);
    }

    @Deprecated
    public q(Uri uri, androidx.media2.exoplayer.external.upstream.l.a dataSourceFactory, androidx.media2.exoplayer.external.extractor.l extractorsFactory, @androidx.annotation.p0 Handler eventHandler, @androidx.annotation.p0 b eventListener, @androidx.annotation.p0 String customCacheKey) {
        this(uri, dataSourceFactory, extractorsFactory, eventHandler, eventListener, customCacheKey, 1048576);
    }

    @Deprecated
    public q(Uri uri, androidx.media2.exoplayer.external.upstream.l.a dataSourceFactory, androidx.media2.exoplayer.external.extractor.l extractorsFactory, @androidx.annotation.p0 Handler eventHandler, @androidx.annotation.p0 b eventListener, @androidx.annotation.p0 String customCacheKey, int continueLoadingCheckIntervalBytes) {
        this(uri, dataSourceFactory, extractorsFactory, new androidx.media2.exoplayer.external.upstream.x(), customCacheKey, continueLoadingCheckIntervalBytes, (Object) null);
        if (eventListener == null || eventHandler == null) {
            return;
        }
        g(eventHandler, new c(eventListener));
    }

    private q(Uri uri, androidx.media2.exoplayer.external.upstream.l.a dataSourceFactory, androidx.media2.exoplayer.external.extractor.l extractorsFactory, androidx.media2.exoplayer.external.upstream.f0 loadableLoadErrorHandlingPolicy, @androidx.annotation.p0 String customCacheKey, int continueLoadingCheckIntervalBytes, @androidx.annotation.p0 Object tag) {
        this.f56315i = new s0(uri, dataSourceFactory, extractorsFactory, androidx.media2.exoplayer.external.drm.q.b(), loadableLoadErrorHandlingPolicy, customCacheKey, continueLoadingCheckIntervalBytes, tag);
    }
}
