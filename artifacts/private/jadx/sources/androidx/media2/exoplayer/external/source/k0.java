package androidx.media2.exoplayer.external.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.media2.exoplayer.external.Format;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public interface k0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f56235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        public final z.a f56236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0519a> f56237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f56238d;

        /* JADX INFO: renamed from: androidx.media2.exoplayer.external.source.k0$a$a, reason: collision with other inner class name */
        private static final class C0519a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Handler f56239a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final k0 f56240b;

            public C0519a(Handler handler, k0 listener) {
                this.f56239a = handler;
                this.f56240b = listener;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        private void B(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }

        private long b(long mediaTimeUs) {
            long jC = androidx.media2.exoplayer.external.c.c(mediaTimeUs);
            if (jC == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f56238d + jC;
        }

        public void A() {
            final z.a aVar = (z.a) androidx.media2.exoplayer.external.util.a.g(this.f56236b);
            for (C0519a c0519a : this.f56237c) {
                final k0 k0Var = c0519a.f56240b;
                B(c0519a.f56239a, new Runnable(this, k0Var, aVar) { // from class: androidx.media2.exoplayer.external.source.c0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final k0.a f55760a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final k0 f55761b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private final z.a f55762c;

                    {
                        this.f55760a = this;
                        this.f55761b = k0Var;
                        this.f55762c = aVar;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.f55760a.k(this.f55761b, this.f55762c);
                    }
                });
            }
        }

        public void C() {
            final z.a aVar = (z.a) androidx.media2.exoplayer.external.util.a.g(this.f56236b);
            for (C0519a c0519a : this.f56237c) {
                final k0 k0Var = c0519a.f56240b;
                B(c0519a.f56239a, new Runnable(this, k0Var, aVar) { // from class: androidx.media2.exoplayer.external.source.h0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final k0.a f55906a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final k0 f55907b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private final z.a f55908c;

                    {
                        this.f55906a = this;
                        this.f55907b = k0Var;
                        this.f55908c = aVar;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.f55906a.l(this.f55907b, this.f55908c);
                    }
                });
            }
        }

        public void D(k0 eventListener) {
            for (C0519a c0519a : this.f56237c) {
                if (c0519a.f56240b == eventListener) {
                    this.f56237c.remove(c0519a);
                }
            }
        }

        public void E(int trackType, long mediaStartTimeUs, long mediaEndTimeUs) {
            F(new c(1, trackType, null, 3, null, b(mediaStartTimeUs), b(mediaEndTimeUs)));
        }

        public void F(final c mediaLoadData) {
            final z.a aVar = (z.a) androidx.media2.exoplayer.external.util.a.g(this.f56236b);
            for (C0519a c0519a : this.f56237c) {
                final k0 k0Var = c0519a.f56240b;
                B(c0519a.f56239a, new Runnable(this, k0Var, aVar, mediaLoadData) { // from class: androidx.media2.exoplayer.external.source.i0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final k0.a f56227a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final k0 f56228b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private final z.a f56229c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private final k0.c f56230d;

                    {
                        this.f56227a = this;
                        this.f56228b = k0Var;
                        this.f56229c = aVar;
                        this.f56230d = mediaLoadData;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.f56227a.m(this.f56228b, this.f56229c, this.f56230d);
                    }
                });
            }
        }

        @androidx.annotation.j
        public a G(int windowIndex, @androidx.annotation.p0 z.a mediaPeriodId, long mediaTimeOffsetMs) {
            return new a(this.f56237c, windowIndex, mediaPeriodId, mediaTimeOffsetMs);
        }

        public void a(Handler handler, k0 eventListener) {
            androidx.media2.exoplayer.external.util.a.a((handler == null || eventListener == null) ? false : true);
            this.f56237c.add(new C0519a(handler, eventListener));
        }

        public void c(int trackType, @androidx.annotation.p0 Format trackFormat, int trackSelectionReason, @androidx.annotation.p0 Object trackSelectionData, long mediaTimeUs) {
            d(new c(1, trackType, trackFormat, trackSelectionReason, trackSelectionData, b(mediaTimeUs), -9223372036854775807L));
        }

        public void d(final c mediaLoadData) {
            for (C0519a c0519a : this.f56237c) {
                final k0 k0Var = c0519a.f56240b;
                B(c0519a.f56239a, new Runnable(this, k0Var, mediaLoadData) { // from class: androidx.media2.exoplayer.external.source.j0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final k0.a f56231a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final k0 f56232b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private final k0.c f56233c;

                    {
                        this.f56231a = this;
                        this.f56232b = k0Var;
                        this.f56233c = mediaLoadData;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.f56231a.e(this.f56232b, this.f56233c);
                    }
                });
            }
        }

        final /* synthetic */ void e(k0 k0Var, c cVar) {
            k0Var.S(this.f56235a, this.f56236b, cVar);
        }

        final /* synthetic */ void f(k0 k0Var, b bVar, c cVar) {
            k0Var.i(this.f56235a, this.f56236b, bVar, cVar);
        }

        final /* synthetic */ void g(k0 k0Var, b bVar, c cVar) {
            k0Var.y(this.f56235a, this.f56236b, bVar, cVar);
        }

        final /* synthetic */ void h(k0 k0Var, b bVar, c cVar, IOException iOException, boolean z10) {
            k0Var.M(this.f56235a, this.f56236b, bVar, cVar, iOException, z10);
        }

        final /* synthetic */ void i(k0 k0Var, b bVar, c cVar) {
            k0Var.t(this.f56235a, this.f56236b, bVar, cVar);
        }

        final /* synthetic */ void j(k0 k0Var, z.a aVar) {
            k0Var.h(this.f56235a, aVar);
        }

        final /* synthetic */ void k(k0 k0Var, z.a aVar) {
            k0Var.r(this.f56235a, aVar);
        }

        final /* synthetic */ void l(k0 k0Var, z.a aVar) {
            k0Var.R(this.f56235a, aVar);
        }

        final /* synthetic */ void m(k0 k0Var, z.a aVar, c cVar) {
            k0Var.N(this.f56235a, aVar, cVar);
        }

        public void n(final b loadEventInfo, final c mediaLoadData) {
            for (C0519a c0519a : this.f56237c) {
                final k0 k0Var = c0519a.f56240b;
                B(c0519a.f56239a, new Runnable(this, k0Var, loadEventInfo, mediaLoadData) { // from class: androidx.media2.exoplayer.external.source.f0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final k0.a f55885a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final k0 f55886b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private final k0.b f55887c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private final k0.c f55888d;

                    {
                        this.f55885a = this;
                        this.f55886b = k0Var;
                        this.f55887c = loadEventInfo;
                        this.f55888d = mediaLoadData;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.f55885a.f(this.f55886b, this.f55887c, this.f55888d);
                    }
                });
            }
        }

        public void o(androidx.media2.exoplayer.external.upstream.o dataSpec, Uri uri, Map<String, List<String>> responseHeaders, int dataType, int trackType, @androidx.annotation.p0 Format trackFormat, int trackSelectionReason, @androidx.annotation.p0 Object trackSelectionData, long mediaStartTimeUs, long mediaEndTimeUs, long elapsedRealtimeMs, long loadDurationMs, long bytesLoaded) {
            n(new b(dataSpec, uri, responseHeaders, elapsedRealtimeMs, loadDurationMs, bytesLoaded), new c(dataType, trackType, trackFormat, trackSelectionReason, trackSelectionData, b(mediaStartTimeUs), b(mediaEndTimeUs)));
        }

        public void p(androidx.media2.exoplayer.external.upstream.o dataSpec, Uri uri, Map<String, List<String>> responseHeaders, int dataType, long elapsedRealtimeMs, long loadDurationMs, long bytesLoaded) {
            o(dataSpec, uri, responseHeaders, dataType, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, elapsedRealtimeMs, loadDurationMs, bytesLoaded);
        }

        public void q(final b loadEventInfo, final c mediaLoadData) {
            for (C0519a c0519a : this.f56237c) {
                final k0 k0Var = c0519a.f56240b;
                B(c0519a.f56239a, new Runnable(this, k0Var, loadEventInfo, mediaLoadData) { // from class: androidx.media2.exoplayer.external.source.e0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final k0.a f55861a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final k0 f55862b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private final k0.b f55863c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private final k0.c f55864d;

                    {
                        this.f55861a = this;
                        this.f55862b = k0Var;
                        this.f55863c = loadEventInfo;
                        this.f55864d = mediaLoadData;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.f55861a.g(this.f55862b, this.f55863c, this.f55864d);
                    }
                });
            }
        }

        public void r(androidx.media2.exoplayer.external.upstream.o dataSpec, Uri uri, Map<String, List<String>> responseHeaders, int dataType, int trackType, @androidx.annotation.p0 Format trackFormat, int trackSelectionReason, @androidx.annotation.p0 Object trackSelectionData, long mediaStartTimeUs, long mediaEndTimeUs, long elapsedRealtimeMs, long loadDurationMs, long bytesLoaded) {
            q(new b(dataSpec, uri, responseHeaders, elapsedRealtimeMs, loadDurationMs, bytesLoaded), new c(dataType, trackType, trackFormat, trackSelectionReason, trackSelectionData, b(mediaStartTimeUs), b(mediaEndTimeUs)));
        }

        public void s(androidx.media2.exoplayer.external.upstream.o dataSpec, Uri uri, Map<String, List<String>> responseHeaders, int dataType, long elapsedRealtimeMs, long loadDurationMs, long bytesLoaded) {
            r(dataSpec, uri, responseHeaders, dataType, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, elapsedRealtimeMs, loadDurationMs, bytesLoaded);
        }

        public void t(final b loadEventInfo, final c mediaLoadData, final IOException error, final boolean wasCanceled) {
            for (C0519a c0519a : this.f56237c) {
                final k0 k0Var = c0519a.f56240b;
                B(c0519a.f56239a, new Runnable(this, k0Var, loadEventInfo, mediaLoadData, error, wasCanceled) { // from class: androidx.media2.exoplayer.external.source.g0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final k0.a f55891a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final k0 f55892b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private final k0.b f55893c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private final k0.c f55894d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private final IOException f55895e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private final boolean f55896f;

                    {
                        this.f55891a = this;
                        this.f55892b = k0Var;
                        this.f55893c = loadEventInfo;
                        this.f55894d = mediaLoadData;
                        this.f55895e = error;
                        this.f55896f = wasCanceled;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.f55891a.h(this.f55892b, this.f55893c, this.f55894d, this.f55895e, this.f55896f);
                    }
                });
            }
        }

        public void u(androidx.media2.exoplayer.external.upstream.o dataSpec, Uri uri, Map<String, List<String>> responseHeaders, int dataType, int trackType, @androidx.annotation.p0 Format trackFormat, int trackSelectionReason, @androidx.annotation.p0 Object trackSelectionData, long mediaStartTimeUs, long mediaEndTimeUs, long elapsedRealtimeMs, long loadDurationMs, long bytesLoaded, IOException error, boolean wasCanceled) {
            t(new b(dataSpec, uri, responseHeaders, elapsedRealtimeMs, loadDurationMs, bytesLoaded), new c(dataType, trackType, trackFormat, trackSelectionReason, trackSelectionData, b(mediaStartTimeUs), b(mediaEndTimeUs)), error, wasCanceled);
        }

        public void v(androidx.media2.exoplayer.external.upstream.o dataSpec, Uri uri, Map<String, List<String>> responseHeaders, int dataType, long elapsedRealtimeMs, long loadDurationMs, long bytesLoaded, IOException error, boolean wasCanceled) {
            u(dataSpec, uri, responseHeaders, dataType, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, elapsedRealtimeMs, loadDurationMs, bytesLoaded, error, wasCanceled);
        }

        public void w(final b loadEventInfo, final c mediaLoadData) {
            for (C0519a c0519a : this.f56237c) {
                final k0 k0Var = c0519a.f56240b;
                B(c0519a.f56239a, new Runnable(this, k0Var, loadEventInfo, mediaLoadData) { // from class: androidx.media2.exoplayer.external.source.d0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final k0.a f55848a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final k0 f55849b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private final k0.b f55850c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private final k0.c f55851d;

                    {
                        this.f55848a = this;
                        this.f55849b = k0Var;
                        this.f55850c = loadEventInfo;
                        this.f55851d = mediaLoadData;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.f55848a.i(this.f55849b, this.f55850c, this.f55851d);
                    }
                });
            }
        }

        public void x(androidx.media2.exoplayer.external.upstream.o dataSpec, int dataType, int trackType, @androidx.annotation.p0 Format trackFormat, int trackSelectionReason, @androidx.annotation.p0 Object trackSelectionData, long mediaStartTimeUs, long mediaEndTimeUs, long elapsedRealtimeMs) {
            w(new b(dataSpec, dataSpec.f57370a, Collections.EMPTY_MAP, elapsedRealtimeMs, 0L, 0L), new c(dataType, trackType, trackFormat, trackSelectionReason, trackSelectionData, b(mediaStartTimeUs), b(mediaEndTimeUs)));
        }

        public void y(androidx.media2.exoplayer.external.upstream.o dataSpec, int dataType, long elapsedRealtimeMs) {
            x(dataSpec, dataType, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, elapsedRealtimeMs);
        }

        public void z() {
            final z.a aVar = (z.a) androidx.media2.exoplayer.external.util.a.g(this.f56236b);
            for (C0519a c0519a : this.f56237c) {
                final k0 k0Var = c0519a.f56240b;
                B(c0519a.f56239a, new Runnable(this, k0Var, aVar) { // from class: androidx.media2.exoplayer.external.source.b0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final k0.a f55736a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final k0 f55737b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private final z.a f55738c;

                    {
                        this.f55736a = this;
                        this.f55737b = k0Var;
                        this.f55738c = aVar;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.f55736a.j(this.f55737b, this.f55738c);
                    }
                });
            }
        }

        private a(CopyOnWriteArrayList<C0519a> listenerAndHandlers, int windowIndex, @androidx.annotation.p0 z.a mediaPeriodId, long mediaTimeOffsetMs) {
            this.f56237c = listenerAndHandlers;
            this.f56235a = windowIndex;
            this.f56236b = mediaPeriodId;
            this.f56238d = mediaTimeOffsetMs;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media2.exoplayer.external.upstream.o f56241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f56242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<String, List<String>> f56243c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f56244d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f56245e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f56246f;

        public b(androidx.media2.exoplayer.external.upstream.o dataSpec, Uri uri, Map<String, List<String>> responseHeaders, long elapsedRealtimeMs, long loadDurationMs, long bytesLoaded) {
            this.f56241a = dataSpec;
            this.f56242b = uri;
            this.f56243c = responseHeaders;
            this.f56244d = elapsedRealtimeMs;
            this.f56245e = loadDurationMs;
            this.f56246f = bytesLoaded;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f56247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f56248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        public final Format f56249c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f56250d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        public final Object f56251e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f56252f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f56253g;

        public c(int dataType, int trackType, @androidx.annotation.p0 Format trackFormat, int trackSelectionReason, @androidx.annotation.p0 Object trackSelectionData, long mediaStartTimeMs, long mediaEndTimeMs) {
            this.f56247a = dataType;
            this.f56248b = trackType;
            this.f56249c = trackFormat;
            this.f56250d = trackSelectionReason;
            this.f56251e = trackSelectionData;
            this.f56252f = mediaStartTimeMs;
            this.f56253g = mediaEndTimeMs;
        }
    }

    void M(int windowIndex, @androidx.annotation.p0 z.a mediaPeriodId, b loadEventInfo, c mediaLoadData, IOException error, boolean wasCanceled);

    void N(int windowIndex, z.a mediaPeriodId, c mediaLoadData);

    void R(int windowIndex, z.a mediaPeriodId);

    void S(int windowIndex, @androidx.annotation.p0 z.a mediaPeriodId, c mediaLoadData);

    void h(int windowIndex, z.a mediaPeriodId);

    void i(int windowIndex, @androidx.annotation.p0 z.a mediaPeriodId, b loadEventInfo, c mediaLoadData);

    void r(int windowIndex, z.a mediaPeriodId);

    void t(int windowIndex, @androidx.annotation.p0 z.a mediaPeriodId, b loadEventInfo, c mediaLoadData);

    void y(int windowIndex, @androidx.annotation.p0 z.a mediaPeriodId, b loadEventInfo, c mediaLoadData);
}
