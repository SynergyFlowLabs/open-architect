package androidx.media2.exoplayer.external;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.media2.exoplayer.external.trackselection.DefaultTrackSelector;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface j extends o0 {
    void J0(@androidx.annotation.p0 x0 seekParameters);

    void M0(androidx.media2.exoplayer.external.source.z mediaSource);

    void W(boolean foregroundMode);

    void Z();

    Looper p0();

    x0 r();

    void y0(androidx.media2.exoplayer.external.source.z mediaSource, boolean resetPosition, boolean resetState);

    q0 z0(q0.b target);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t0[] f55281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.media2.exoplayer.external.util.c f55282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.media2.exoplayer.external.trackselection.r f55283c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f0 f55284d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.media2.exoplayer.external.upstream.d f55285e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Looper f55286f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private androidx.media2.exoplayer.external.analytics.a f55287g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f55288h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f55289i;

        public a(Context context, t0... renderers) {
            DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(context);
            f fVar = new f();
            androidx.media2.exoplayer.external.upstream.r rVarL = androidx.media2.exoplayer.external.upstream.r.l(context);
            Looper looperQ = androidx.media2.exoplayer.external.util.q0.Q();
            androidx.media2.exoplayer.external.util.c cVar = androidx.media2.exoplayer.external.util.c.f57511a;
            this(renderers, defaultTrackSelector, fVar, rVarL, looperQ, new androidx.media2.exoplayer.external.analytics.a(cVar), true, cVar);
        }

        public j a() {
            androidx.media2.exoplayer.external.util.a.i(!this.f55289i);
            this.f55289i = true;
            return new s(this.f55281a, this.f55283c, this.f55284d, this.f55285e, this.f55282b, this.f55286f);
        }

        public a b(androidx.media2.exoplayer.external.analytics.a analyticsCollector) {
            androidx.media2.exoplayer.external.util.a.i(!this.f55289i);
            this.f55287g = analyticsCollector;
            return this;
        }

        public a c(androidx.media2.exoplayer.external.upstream.d bandwidthMeter) {
            androidx.media2.exoplayer.external.util.a.i(!this.f55289i);
            this.f55285e = bandwidthMeter;
            return this;
        }

        @l1
        public a d(androidx.media2.exoplayer.external.util.c clock) {
            androidx.media2.exoplayer.external.util.a.i(!this.f55289i);
            this.f55282b = clock;
            return this;
        }

        public a e(f0 loadControl) {
            androidx.media2.exoplayer.external.util.a.i(!this.f55289i);
            this.f55284d = loadControl;
            return this;
        }

        public a f(Looper looper) {
            androidx.media2.exoplayer.external.util.a.i(!this.f55289i);
            this.f55286f = looper;
            return this;
        }

        public a g(androidx.media2.exoplayer.external.trackselection.r trackSelector) {
            androidx.media2.exoplayer.external.util.a.i(!this.f55289i);
            this.f55283c = trackSelector;
            return this;
        }

        public a h(boolean useLazyPreparation) {
            androidx.media2.exoplayer.external.util.a.i(!this.f55289i);
            this.f55288h = useLazyPreparation;
            return this;
        }

        public a(t0[] renderers, androidx.media2.exoplayer.external.trackselection.r trackSelector, f0 loadControl, androidx.media2.exoplayer.external.upstream.d bandwidthMeter, Looper looper, androidx.media2.exoplayer.external.analytics.a analyticsCollector, boolean useLazyPreparation, androidx.media2.exoplayer.external.util.c clock) {
            androidx.media2.exoplayer.external.util.a.a(renderers.length > 0);
            this.f55281a = renderers;
            this.f55283c = trackSelector;
            this.f55284d = loadControl;
            this.f55285e = bandwidthMeter;
            this.f55286f = looper;
            this.f55287g = analyticsCollector;
            this.f55288h = useLazyPreparation;
            this.f55282b = clock;
        }
    }
}
