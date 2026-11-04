package androidx.media2.exoplayer.external;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.trackselection.DefaultTrackSelector;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
@Deprecated
public final class k {
    private k() {
    }

    @Deprecated
    public static j a(Context context, t0[] renderers, androidx.media2.exoplayer.external.trackselection.r trackSelector) {
        return b(context, renderers, trackSelector, new f());
    }

    @Deprecated
    public static j b(Context context, t0[] renderers, androidx.media2.exoplayer.external.trackselection.r trackSelector, f0 loadControl) {
        return c(context, renderers, trackSelector, loadControl, androidx.media2.exoplayer.external.util.q0.Q());
    }

    @Deprecated
    public static j c(Context context, t0[] renderers, androidx.media2.exoplayer.external.trackselection.r trackSelector, f0 loadControl, Looper looper) {
        return d(context, renderers, trackSelector, loadControl, androidx.media2.exoplayer.external.upstream.r.l(context), looper);
    }

    @Deprecated
    public static j d(Context context, t0[] renderers, androidx.media2.exoplayer.external.trackselection.r trackSelector, f0 loadControl, androidx.media2.exoplayer.external.upstream.d bandwidthMeter, Looper looper) {
        return new s(renderers, trackSelector, loadControl, bandwidthMeter, androidx.media2.exoplayer.external.util.c.f57511a, looper);
    }

    @Deprecated
    public static y0 e(Context context) {
        return o(context, new DefaultTrackSelector(context));
    }

    @Deprecated
    public static y0 f(Context context, w0 renderersFactory, androidx.media2.exoplayer.external.trackselection.r trackSelector) {
        return g(context, renderersFactory, trackSelector, new f());
    }

    @Deprecated
    public static y0 g(Context context, w0 renderersFactory, androidx.media2.exoplayer.external.trackselection.r trackSelector, f0 loadControl) {
        return i(context, renderersFactory, trackSelector, loadControl, null, androidx.media2.exoplayer.external.util.q0.Q());
    }

    @Deprecated
    public static y0 h(Context context, w0 renderersFactory, androidx.media2.exoplayer.external.trackselection.r trackSelector, f0 loadControl, @androidx.annotation.p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v> drmSessionManager) {
        return i(context, renderersFactory, trackSelector, loadControl, drmSessionManager, androidx.media2.exoplayer.external.util.q0.Q());
    }

    @Deprecated
    public static y0 i(Context context, w0 renderersFactory, androidx.media2.exoplayer.external.trackselection.r trackSelector, f0 loadControl, @androidx.annotation.p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v> drmSessionManager, Looper looper) {
        return k(context, renderersFactory, trackSelector, loadControl, drmSessionManager, new androidx.media2.exoplayer.external.analytics.a(androidx.media2.exoplayer.external.util.c.f57511a), looper);
    }

    @Deprecated
    public static y0 j(Context context, w0 renderersFactory, androidx.media2.exoplayer.external.trackselection.r trackSelector, f0 loadControl, @androidx.annotation.p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v> drmSessionManager, androidx.media2.exoplayer.external.analytics.a analyticsCollector) {
        return k(context, renderersFactory, trackSelector, loadControl, drmSessionManager, analyticsCollector, androidx.media2.exoplayer.external.util.q0.Q());
    }

    @Deprecated
    public static y0 k(Context context, w0 renderersFactory, androidx.media2.exoplayer.external.trackselection.r trackSelector, f0 loadControl, @androidx.annotation.p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v> drmSessionManager, androidx.media2.exoplayer.external.analytics.a analyticsCollector, Looper looper) {
        return m(context, renderersFactory, trackSelector, loadControl, drmSessionManager, androidx.media2.exoplayer.external.upstream.r.l(context), analyticsCollector, looper);
    }

    @Deprecated
    public static y0 l(Context context, w0 renderersFactory, androidx.media2.exoplayer.external.trackselection.r trackSelector, f0 loadControl, @androidx.annotation.p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v> drmSessionManager, androidx.media2.exoplayer.external.upstream.d bandwidthMeter) {
        return m(context, renderersFactory, trackSelector, loadControl, drmSessionManager, bandwidthMeter, new androidx.media2.exoplayer.external.analytics.a(androidx.media2.exoplayer.external.util.c.f57511a), androidx.media2.exoplayer.external.util.q0.Q());
    }

    @Deprecated
    public static y0 m(Context context, w0 renderersFactory, androidx.media2.exoplayer.external.trackselection.r trackSelector, f0 loadControl, @androidx.annotation.p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v> drmSessionManager, androidx.media2.exoplayer.external.upstream.d bandwidthMeter, androidx.media2.exoplayer.external.analytics.a analyticsCollector, Looper looper) {
        return new y0(context, renderersFactory, trackSelector, loadControl, drmSessionManager, bandwidthMeter, analyticsCollector, androidx.media2.exoplayer.external.util.c.f57511a, looper);
    }

    @Deprecated
    public static y0 n(Context context, w0 renderersFactory, androidx.media2.exoplayer.external.trackselection.r trackSelector, @androidx.annotation.p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v> drmSessionManager) {
        return h(context, renderersFactory, trackSelector, new f(), drmSessionManager);
    }

    @Deprecated
    public static y0 o(Context context, androidx.media2.exoplayer.external.trackselection.r trackSelector) {
        return f(context, new h(context), trackSelector);
    }

    @Deprecated
    public static y0 p(Context context, androidx.media2.exoplayer.external.trackselection.r trackSelector, f0 loadControl) {
        return g(context, new h(context), trackSelector, loadControl);
    }

    @Deprecated
    public static y0 q(Context context, androidx.media2.exoplayer.external.trackselection.r trackSelector, f0 loadControl, @androidx.annotation.p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v> drmSessionManager) {
        return h(context, new h(context), trackSelector, loadControl, drmSessionManager);
    }

    @Deprecated
    public static y0 r(Context context, androidx.media2.exoplayer.external.trackselection.r trackSelector, f0 loadControl, @androidx.annotation.p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v> drmSessionManager, int extensionRendererMode) {
        return h(context, new h(context).k(extensionRendererMode), trackSelector, loadControl, drmSessionManager);
    }

    @Deprecated
    public static y0 s(Context context, androidx.media2.exoplayer.external.trackselection.r trackSelector, f0 loadControl, @androidx.annotation.p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v> drmSessionManager, int extensionRendererMode, long allowedVideoJoiningTimeMs) {
        return h(context, new h(context).k(extensionRendererMode).i(allowedVideoJoiningTimeMs), trackSelector, loadControl, drmSessionManager);
    }
}
