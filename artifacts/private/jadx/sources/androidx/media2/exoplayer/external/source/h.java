package androidx.media2.exoplayer.external.source;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public abstract class h<T> extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<T, b> f55897f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private Handler f55898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media2.exoplayer.external.upstream.q0 f55899h;

    private final class a implements k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f55900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private k0.a f55901b;

        public a(T id2) {
            int i10 = 6 >> 0;
            this.f55901b = h.this.m(null);
            this.f55900a = id2;
        }

        private boolean a(int childWindowIndex, @androidx.annotation.p0 z.a childMediaPeriodId) {
            z.a aVarW;
            if (childMediaPeriodId != null) {
                aVarW = h.this.w(this.f55900a, childMediaPeriodId);
                if (aVarW == null) {
                    return false;
                }
            } else {
                aVarW = null;
            }
            int iY = h.this.y(this.f55900a, childWindowIndex);
            k0.a aVar = this.f55901b;
            if (aVar.f56235a != iY || !androidx.media2.exoplayer.external.util.q0.b(aVar.f56236b, aVarW)) {
                this.f55901b = h.this.l(iY, aVarW, 0L);
            }
            return true;
        }

        private k0.c b(k0.c mediaLoadData) {
            long jX = h.this.x(this.f55900a, mediaLoadData.f56252f);
            long jX2 = h.this.x(this.f55900a, mediaLoadData.f56253g);
            return (jX == mediaLoadData.f56252f && jX2 == mediaLoadData.f56253g) ? mediaLoadData : new k0.c(mediaLoadData.f56247a, mediaLoadData.f56248b, mediaLoadData.f56249c, mediaLoadData.f56250d, mediaLoadData.f56251e, jX, jX2);
        }

        @Override // androidx.media2.exoplayer.external.source.k0
        public void M(int windowIndex, @androidx.annotation.p0 z.a mediaPeriodId, k0.b loadEventData, k0.c mediaLoadData, IOException error, boolean wasCanceled) {
            if (a(windowIndex, mediaPeriodId)) {
                this.f55901b.t(loadEventData, b(mediaLoadData), error, wasCanceled);
            }
        }

        @Override // androidx.media2.exoplayer.external.source.k0
        public void N(int windowIndex, @androidx.annotation.p0 z.a mediaPeriodId, k0.c mediaLoadData) {
            if (a(windowIndex, mediaPeriodId)) {
                this.f55901b.F(b(mediaLoadData));
            }
        }

        @Override // androidx.media2.exoplayer.external.source.k0
        public void R(int windowIndex, z.a mediaPeriodId) {
            if (a(windowIndex, mediaPeriodId)) {
                this.f55901b.C();
            }
        }

        @Override // androidx.media2.exoplayer.external.source.k0
        public void S(int windowIndex, @androidx.annotation.p0 z.a mediaPeriodId, k0.c mediaLoadData) {
            if (a(windowIndex, mediaPeriodId)) {
                this.f55901b.d(b(mediaLoadData));
            }
        }

        @Override // androidx.media2.exoplayer.external.source.k0
        public void h(int windowIndex, z.a mediaPeriodId) {
            if (a(windowIndex, mediaPeriodId) && h.this.D((z.a) androidx.media2.exoplayer.external.util.a.g(this.f55901b.f56236b))) {
                this.f55901b.z();
            }
        }

        @Override // androidx.media2.exoplayer.external.source.k0
        public void i(int windowIndex, @androidx.annotation.p0 z.a mediaPeriodId, k0.b loadEventData, k0.c mediaLoadData) {
            if (a(windowIndex, mediaPeriodId)) {
                this.f55901b.n(loadEventData, b(mediaLoadData));
            }
        }

        @Override // androidx.media2.exoplayer.external.source.k0
        public void r(int windowIndex, z.a mediaPeriodId) {
            if (a(windowIndex, mediaPeriodId) && h.this.D((z.a) androidx.media2.exoplayer.external.util.a.g(this.f55901b.f56236b))) {
                this.f55901b.A();
            }
        }

        @Override // androidx.media2.exoplayer.external.source.k0
        public void t(int windowIndex, @androidx.annotation.p0 z.a mediaPeriodId, k0.b loadEventData, k0.c mediaLoadData) {
            if (a(windowIndex, mediaPeriodId)) {
                this.f55901b.w(loadEventData, b(mediaLoadData));
            }
        }

        @Override // androidx.media2.exoplayer.external.source.k0
        public void y(int windowIndex, @androidx.annotation.p0 z.a mediaPeriodId, k0.b loadEventData, k0.c mediaLoadData) {
            if (a(windowIndex, mediaPeriodId)) {
                this.f55901b.q(loadEventData, b(mediaLoadData));
            }
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z f55903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final z.b f55904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k0 f55905c;

        public b(z mediaSource, z.b caller, k0 eventListener) {
            this.f55903a = mediaSource;
            this.f55904b = caller;
            this.f55905c = eventListener;
        }
    }

    protected h() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public abstract void z(T id2, z mediaSource, androidx.media2.exoplayer.external.z0 timeline);

    protected final void B(final T id2, z mediaSource) {
        androidx.media2.exoplayer.external.util.a.a(!this.f55897f.containsKey(id2));
        z.b bVar = new z.b(this, id2) { // from class: androidx.media2.exoplayer.external.source.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final h f55889a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Object f55890b;

            {
                this.f55889a = this;
                this.f55890b = id2;
            }

            @Override // androidx.media2.exoplayer.external.source.z.b
            public void c(z zVar, androidx.media2.exoplayer.external.z0 z0Var) {
                this.f55889a.z(this.f55890b, zVar, z0Var);
            }
        };
        a aVar = new a(id2);
        this.f55897f.put(id2, new b(mediaSource, bVar, aVar));
        mediaSource.g((Handler) androidx.media2.exoplayer.external.util.a.g(this.f55898g), aVar);
        mediaSource.b(bVar, this.f55899h);
        if (q()) {
            return;
        }
        mediaSource.d(bVar);
    }

    protected final void C(T id2) {
        b bVar = (b) androidx.media2.exoplayer.external.util.a.g(this.f55897f.remove(id2));
        bVar.f55903a.f(bVar.f55904b);
        bVar.f55903a.i(bVar.f55905c);
    }

    protected boolean D(z.a mediaPeriodId) {
        return true;
    }

    @Override // androidx.media2.exoplayer.external.source.z
    @androidx.annotation.i
    public void a() throws IOException {
        Iterator<b> it = this.f55897f.values().iterator();
        while (it.hasNext()) {
            it.next().f55903a.a();
        }
    }

    @Override // androidx.media2.exoplayer.external.source.c
    @androidx.annotation.i
    protected void o() {
        for (b bVar : this.f55897f.values()) {
            bVar.f55903a.d(bVar.f55904b);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.c
    @androidx.annotation.i
    protected void p() {
        for (b bVar : this.f55897f.values()) {
            bVar.f55903a.j(bVar.f55904b);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.c
    @androidx.annotation.i
    protected void r(@androidx.annotation.p0 androidx.media2.exoplayer.external.upstream.q0 mediaTransferListener) {
        this.f55899h = mediaTransferListener;
        this.f55898g = new Handler();
    }

    @Override // androidx.media2.exoplayer.external.source.c
    @androidx.annotation.i
    protected void t() {
        for (b bVar : this.f55897f.values()) {
            bVar.f55903a.f(bVar.f55904b);
            bVar.f55903a.i(bVar.f55905c);
        }
        this.f55897f.clear();
    }

    protected final void u(final T id2) {
        b bVar = (b) androidx.media2.exoplayer.external.util.a.g(this.f55897f.get(id2));
        bVar.f55903a.d(bVar.f55904b);
    }

    protected final void v(final T id2) {
        b bVar = (b) androidx.media2.exoplayer.external.util.a.g(this.f55897f.get(id2));
        bVar.f55903a.j(bVar.f55904b);
    }

    @androidx.annotation.p0
    protected z.a w(T id2, z.a mediaPeriodId) {
        return mediaPeriodId;
    }

    protected long x(@androidx.annotation.p0 T id2, long mediaTimeMs) {
        return mediaTimeMs;
    }

    protected int y(T id2, int windowIndex) {
        return windowIndex;
    }
}
