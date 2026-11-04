package androidx.media2.exoplayer.external.source;

import android.net.Uri;
import android.os.Handler;
import androidx.media2.exoplayer.external.Format;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class b1 extends androidx.media2.exoplayer.external.source.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.o f55739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.l.a f55740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Format f55741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f55742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.f0 f55743j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f55744k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.z0 f55745l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    private final Object f55746m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media2.exoplayer.external.upstream.q0 f55747n;

    @Deprecated
    public interface b {
        void a(int sourceId, IOException e10);
    }

    @Deprecated
    private static final class c extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f55748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f55749b;

        public c(b eventListener, int eventSourceId) {
            this.f55748a = (b) androidx.media2.exoplayer.external.util.a.g(eventListener);
            this.f55749b = eventSourceId;
        }

        @Override // androidx.media2.exoplayer.external.source.o, androidx.media2.exoplayer.external.source.k0
        public void M(int windowIndex, @androidx.annotation.p0 z.a mediaPeriodId, k0.b loadEventInfo, k0.c mediaLoadData, IOException error, boolean wasCanceled) {
            this.f55748a.a(this.f55749b, error);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.upstream.l.a f55750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.media2.exoplayer.external.upstream.f0 f55751b = new androidx.media2.exoplayer.external.upstream.x();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f55752c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f55753d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        private Object f55754e;

        public d(androidx.media2.exoplayer.external.upstream.l.a dataSourceFactory) {
            this.f55750a = (androidx.media2.exoplayer.external.upstream.l.a) androidx.media2.exoplayer.external.util.a.g(dataSourceFactory);
        }

        public b1 a(Uri uri, Format format, long durationUs) {
            this.f55753d = true;
            return new b1(uri, this.f55750a, format, durationUs, this.f55751b, this.f55752c, this.f55754e);
        }

        @Deprecated
        public b1 b(Uri uri, Format format, long durationUs, @androidx.annotation.p0 Handler eventHandler, @androidx.annotation.p0 k0 eventListener) {
            b1 b1VarA = a(uri, format, durationUs);
            if (eventHandler != null && eventListener != null) {
                b1VarA.g(eventHandler, eventListener);
            }
            return b1VarA;
        }

        public d c(androidx.media2.exoplayer.external.upstream.f0 loadErrorHandlingPolicy) {
            androidx.media2.exoplayer.external.util.a.i(!this.f55753d);
            this.f55751b = loadErrorHandlingPolicy;
            return this;
        }

        @Deprecated
        public d d(int minLoadableRetryCount) {
            return c(new androidx.media2.exoplayer.external.upstream.x(minLoadableRetryCount));
        }

        public d e(Object tag) {
            androidx.media2.exoplayer.external.util.a.i(!this.f55753d);
            this.f55754e = tag;
            return this;
        }

        public d f(boolean treatLoadErrorsAsEndOfStream) {
            androidx.media2.exoplayer.external.util.a.i(!this.f55753d);
            this.f55752c = treatLoadErrorsAsEndOfStream;
            return this;
        }
    }

    @Override // androidx.media2.exoplayer.external.source.c, androidx.media2.exoplayer.external.source.z
    @androidx.annotation.p0
    public Object E() {
        return this.f55746m;
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public void a() throws IOException {
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public void c(x mediaPeriod) {
        ((a1) mediaPeriod).q();
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public x e(z.a id2, androidx.media2.exoplayer.external.upstream.b allocator, long startPositionUs) {
        return new a1(this.f55739f, this.f55740g, this.f55747n, this.f55741h, this.f55742i, this.f55743j, m(id2), this.f55744k);
    }

    @Override // androidx.media2.exoplayer.external.source.c
    protected void r(@androidx.annotation.p0 androidx.media2.exoplayer.external.upstream.q0 mediaTransferListener) {
        this.f55747n = mediaTransferListener;
        s(this.f55745l);
    }

    @Override // androidx.media2.exoplayer.external.source.c
    protected void t() {
    }

    @Deprecated
    public b1(Uri uri, androidx.media2.exoplayer.external.upstream.l.a dataSourceFactory, Format format, long durationUs) {
        this(uri, dataSourceFactory, format, durationUs, 3);
    }

    @Deprecated
    public b1(Uri uri, androidx.media2.exoplayer.external.upstream.l.a dataSourceFactory, Format format, long durationUs, int minLoadableRetryCount) {
        this(uri, dataSourceFactory, format, durationUs, new androidx.media2.exoplayer.external.upstream.x(minLoadableRetryCount), false, null);
    }

    @Deprecated
    public b1(Uri uri, androidx.media2.exoplayer.external.upstream.l.a dataSourceFactory, Format format, long durationUs, int minLoadableRetryCount, Handler eventHandler, b eventListener, int eventSourceId, boolean treatLoadErrorsAsEndOfStream) {
        this(uri, dataSourceFactory, format, durationUs, new androidx.media2.exoplayer.external.upstream.x(minLoadableRetryCount), treatLoadErrorsAsEndOfStream, null);
        if (eventHandler == null || eventListener == null) {
            return;
        }
        g(eventHandler, new c(eventListener, eventSourceId));
    }

    private b1(Uri uri, androidx.media2.exoplayer.external.upstream.l.a dataSourceFactory, Format format, long durationUs, androidx.media2.exoplayer.external.upstream.f0 loadErrorHandlingPolicy, boolean treatLoadErrorsAsEndOfStream, @androidx.annotation.p0 Object tag) {
        this.f55740g = dataSourceFactory;
        this.f55741h = format;
        this.f55742i = durationUs;
        this.f55743j = loadErrorHandlingPolicy;
        this.f55744k = treatLoadErrorsAsEndOfStream;
        this.f55746m = tag;
        this.f55739f = new androidx.media2.exoplayer.external.upstream.o(uri, 1);
        this.f55745l = new z0(durationUs, true, false, null, tag);
    }
}
