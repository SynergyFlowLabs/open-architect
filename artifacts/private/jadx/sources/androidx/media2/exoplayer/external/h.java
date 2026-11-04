package androidx.media2.exoplayer.external;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.b1;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public class h implements w0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f55239h = 5000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f55240i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f55241j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f55242k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f55243l = "DefaultRenderersFactory";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected static final int f55244m = 50;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f55245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v> f55246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f55247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f55248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f55249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f55250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.media2.exoplayer.external.mediacodec.c f55251g;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public h(Context context) {
        this.f55245a = context;
        this.f55247c = 0;
        this.f55248d = 5000L;
        this.f55251g = androidx.media2.exoplayer.external.mediacodec.c.f55390a;
    }

    @Override // androidx.media2.exoplayer.external.w0
    public t0[] a(Handler eventHandler, androidx.media2.exoplayer.external.video.u videoRendererEventListener, androidx.media2.exoplayer.external.audio.r audioRendererEventListener, androidx.media2.exoplayer.external.text.k textRendererOutput, androidx.media2.exoplayer.external.metadata.e metadataRendererOutput, @androidx.annotation.p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v> drmSessionManager) {
        androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v> rVar = drmSessionManager == null ? this.f55246b : drmSessionManager;
        ArrayList<t0> arrayList = new ArrayList<>();
        h(this.f55245a, this.f55247c, this.f55251g, rVar, this.f55249e, this.f55250f, eventHandler, videoRendererEventListener, this.f55248d, arrayList);
        c(this.f55245a, this.f55247c, this.f55251g, rVar, this.f55249e, this.f55250f, b(), eventHandler, audioRendererEventListener, arrayList);
        g(this.f55245a, textRendererOutput, eventHandler.getLooper(), this.f55247c, arrayList);
        e(this.f55245a, metadataRendererOutput, eventHandler.getLooper(), this.f55247c, arrayList);
        d(this.f55245a, this.f55247c, arrayList);
        f(this.f55245a, eventHandler, this.f55247c, arrayList);
        return (t0[]) arrayList.toArray(new t0[0]);
    }

    protected androidx.media2.exoplayer.external.audio.j[] b() {
        return new androidx.media2.exoplayer.external.audio.j[0];
    }

    protected void c(Context context, int extensionRendererMode, androidx.media2.exoplayer.external.mediacodec.c mediaCodecSelector, @androidx.annotation.p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v> drmSessionManager, boolean playClearSamplesWithoutKeys, boolean enableDecoderFallback, androidx.media2.exoplayer.external.audio.j[] audioProcessors, Handler eventHandler, androidx.media2.exoplayer.external.audio.r eventListener, ArrayList<t0> out) {
        int i10;
        int i11;
        out.add(new androidx.media2.exoplayer.external.audio.b0(context, mediaCodecSelector, drmSessionManager, playClearSamplesWithoutKeys, enableDecoderFallback, eventHandler, eventListener, new androidx.media2.exoplayer.external.audio.y(androidx.media2.exoplayer.external.audio.d.b(context), audioProcessors)));
        if (extensionRendererMode == 0) {
            return;
        }
        int size = out.size();
        if (extensionRendererMode == 2) {
            size--;
        }
        try {
            try {
                i10 = size + 1;
                try {
                    out.add(size, (t0) Class.forName("androidx.media2.exoplayer.external.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, androidx.media2.exoplayer.external.audio.r.class, androidx.media2.exoplayer.external.audio.j[].class).newInstance(eventHandler, eventListener, audioProcessors));
                    androidx.media2.exoplayer.external.util.p.h(f55243l, "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i10;
                    i10 = size;
                }
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating Opus extension", e10);
            }
        } catch (ClassNotFoundException unused2) {
        }
        try {
            try {
                i11 = i10 + 1;
                try {
                    out.add(i10, (t0) Class.forName("androidx.media2.exoplayer.external.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, androidx.media2.exoplayer.external.audio.r.class, androidx.media2.exoplayer.external.audio.j[].class).newInstance(eventHandler, eventListener, audioProcessors));
                    androidx.media2.exoplayer.external.util.p.h(f55243l, "Loaded LibflacAudioRenderer.");
                } catch (ClassNotFoundException unused3) {
                    i10 = i11;
                    i11 = i10;
                }
            } catch (ClassNotFoundException unused4) {
            }
            try {
                out.add(i11, (t0) Class.forName("androidx.media2.exoplayer.external.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, androidx.media2.exoplayer.external.audio.r.class, androidx.media2.exoplayer.external.audio.j[].class).newInstance(eventHandler, eventListener, audioProcessors));
                androidx.media2.exoplayer.external.util.p.h(f55243l, "Loaded FfmpegAudioRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e11);
            }
        } catch (Exception e12) {
            throw new RuntimeException("Error instantiating FLAC extension", e12);
        }
    }

    protected void d(Context context, int extensionRendererMode, ArrayList<t0> out) {
        out.add(new androidx.media2.exoplayer.external.video.spherical.b());
    }

    protected void e(Context context, androidx.media2.exoplayer.external.metadata.e output, Looper outputLooper, int extensionRendererMode, ArrayList<t0> out) {
        out.add(new androidx.media2.exoplayer.external.metadata.f(output, outputLooper));
    }

    protected void f(Context context, Handler eventHandler, int extensionRendererMode, ArrayList<t0> out) {
    }

    protected void g(Context context, androidx.media2.exoplayer.external.text.k output, Looper outputLooper, int extensionRendererMode, ArrayList<t0> out) {
        out.add(new androidx.media2.exoplayer.external.text.l(output, outputLooper));
    }

    protected void h(Context context, int extensionRendererMode, androidx.media2.exoplayer.external.mediacodec.c mediaCodecSelector, @androidx.annotation.p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v> drmSessionManager, boolean playClearSamplesWithoutKeys, boolean enableDecoderFallback, Handler eventHandler, androidx.media2.exoplayer.external.video.u eventListener, long allowedVideoJoiningTimeMs, ArrayList<t0> out) {
        out.add(new androidx.media2.exoplayer.external.video.d(context, mediaCodecSelector, allowedVideoJoiningTimeMs, drmSessionManager, playClearSamplesWithoutKeys, enableDecoderFallback, eventHandler, eventListener, 50));
        if (extensionRendererMode == 0) {
            return;
        }
        int size = out.size();
        if (extensionRendererMode == 2) {
            size--;
        }
        try {
            out.add(size, (t0) Class.forName("androidx.media2.exoplayer.external.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, androidx.media2.exoplayer.external.video.u.class, Integer.TYPE).newInstance(Long.valueOf(allowedVideoJoiningTimeMs), eventHandler, eventListener, 50));
            androidx.media2.exoplayer.external.util.p.h(f55243l, "Loaded LibvpxVideoRenderer.");
        } catch (ClassNotFoundException unused) {
        } catch (Exception e10) {
            throw new RuntimeException("Error instantiating VP9 extension", e10);
        }
    }

    public h i(long allowedVideoJoiningTimeMs) {
        this.f55248d = allowedVideoJoiningTimeMs;
        return this;
    }

    public h j(boolean enableDecoderFallback) {
        this.f55250f = enableDecoderFallback;
        return this;
    }

    public h k(int extensionRendererMode) {
        this.f55247c = extensionRendererMode;
        return this;
    }

    public h l(androidx.media2.exoplayer.external.mediacodec.c mediaCodecSelector) {
        this.f55251g = mediaCodecSelector;
        return this;
    }

    public h m(boolean playClearSamplesWithoutKeys) {
        this.f55249e = playClearSamplesWithoutKeys;
        return this;
    }

    @Deprecated
    public h(Context context, @androidx.annotation.p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v> drmSessionManager) {
        this(context, drmSessionManager, 0);
    }

    @Deprecated
    public h(Context context, int extensionRendererMode) {
        this(context, extensionRendererMode, 5000L);
    }

    @Deprecated
    public h(Context context, @androidx.annotation.p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v> drmSessionManager, int extensionRendererMode) {
        this(context, drmSessionManager, extensionRendererMode, 5000L);
    }

    @Deprecated
    public h(Context context, int extensionRendererMode, long allowedVideoJoiningTimeMs) {
        this(context, null, extensionRendererMode, allowedVideoJoiningTimeMs);
    }

    @Deprecated
    public h(Context context, @androidx.annotation.p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v> drmSessionManager, int extensionRendererMode, long allowedVideoJoiningTimeMs) {
        this.f55245a = context;
        this.f55247c = extensionRendererMode;
        this.f55248d = allowedVideoJoiningTimeMs;
        this.f55246b = drmSessionManager;
        this.f55251g = androidx.media2.exoplayer.external.mediacodec.c.f55390a;
    }
}
