package androidx.media2.exoplayer.external;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.source.TrackGroupArray;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f55592a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f55593b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f55594c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f55595d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f55596e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f55597f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f55598g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f55599h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f55600i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f55601j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f55602k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f55603l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f55604m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f55605n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f55606o = 2;

    public interface a {
        void B0(androidx.media2.exoplayer.external.audio.c audioAttributes, boolean handleAudioFocus);

        void L0(androidx.media2.exoplayer.external.audio.i listener);

        androidx.media2.exoplayer.external.audio.c e();

        void f(float audioVolume);

        int getAudioSessionId();

        void h(androidx.media2.exoplayer.external.audio.v auxEffectInfo);

        float k0();

        void l0(androidx.media2.exoplayer.external.audio.i listener);

        void n();

        @Deprecated
        void o(androidx.media2.exoplayer.external.audio.c audioAttributes);
    }

    @Deprecated
    public static abstract class b implements d {
        @Override // androidx.media2.exoplayer.external.o0.d
        public void A(int i10) {
            p0.e(this, i10);
        }

        @Override // androidx.media2.exoplayer.external.o0.d
        public void C(boolean z10, int i10) {
            p0.d(this, z10, i10);
        }

        @Override // androidx.media2.exoplayer.external.o0.d
        public void D(z0 timeline, @androidx.annotation.p0 Object manifest, int reason) {
            h(timeline, manifest);
        }

        @Override // androidx.media2.exoplayer.external.o0.d
        public void F() {
            p0.g(this);
        }

        @Override // androidx.media2.exoplayer.external.o0.d
        public void G(z0 timeline, int reason) {
            D(timeline, timeline.r() == 1 ? timeline.n(0, new z0.c()).f57960b : null, reason);
        }

        @Override // androidx.media2.exoplayer.external.o0.d
        public void H(TrackGroupArray trackGroupArray, androidx.media2.exoplayer.external.trackselection.p pVar) {
            p0.k(this, trackGroupArray, pVar);
        }

        @Override // androidx.media2.exoplayer.external.o0.d
        public void K(androidx.media2.exoplayer.external.i iVar) {
            p0.c(this, iVar);
        }

        @Override // androidx.media2.exoplayer.external.o0.d
        public void f(m0 m0Var) {
            p0.b(this, m0Var);
        }

        @Deprecated
        public void h(z0 timeline, @androidx.annotation.p0 Object manifest) {
        }

        @Override // androidx.media2.exoplayer.external.o0.d
        public void j(boolean z10) {
            p0.a(this, z10);
        }

        @Override // androidx.media2.exoplayer.external.o0.d
        public void n(boolean z10) {
            p0.h(this, z10);
        }

        @Override // androidx.media2.exoplayer.external.o0.d
        public void x(int i10) {
            p0.f(this, i10);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public interface d {
        void A(int reason);

        void C(boolean playWhenReady, int playbackState);

        @Deprecated
        void D(z0 timeline, @androidx.annotation.p0 Object manifest, int reason);

        void F();

        void G(z0 timeline, int reason);

        void H(TrackGroupArray trackGroups, androidx.media2.exoplayer.external.trackselection.p trackSelections);

        void K(androidx.media2.exoplayer.external.i error);

        void f(m0 playbackParameters);

        void j(boolean isLoading);

        void n(boolean shuffleModeEnabled);

        void x(int repeatMode);
    }

    public interface e {
        void k(androidx.media2.exoplayer.external.metadata.e output);

        void q(androidx.media2.exoplayer.external.metadata.e output);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    public interface h {
        void a(androidx.media2.exoplayer.external.text.k listener);

        void g(androidx.media2.exoplayer.external.text.k listener);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface i {
    }

    public interface j {
        void C0(androidx.media2.exoplayer.external.video.i listener);

        void F0(androidx.media2.exoplayer.external.video.l listener);

        void G0(androidx.media2.exoplayer.external.video.spherical.a listener);

        void H0(androidx.media2.exoplayer.external.video.spherical.a listener);

        void I0(androidx.media2.exoplayer.external.video.i listener);

        void K0(androidx.media2.exoplayer.external.video.l listener);

        void b(int videoScalingMode);

        void f0(TextureView textureView);

        void i(@androidx.annotation.p0 Surface surface);

        void j(SurfaceView surfaceView);

        void l(SurfaceHolder surfaceHolder);

        void m(SurfaceHolder surfaceHolder);

        void m0();

        void p(TextureView textureView);

        void r0(SurfaceView surfaceView);

        int s();

        void u(Surface surface);
    }

    @androidx.annotation.p0
    a A0();

    int C();

    void D(int repeatMode);

    void D0(d listener);

    int E();

    @androidx.annotation.p0
    androidx.media2.exoplayer.external.i E0();

    void F(long positionMs);

    int H();

    TrackGroupArray I();

    boolean J();

    void K(boolean shuffleModeEnabled);

    void L(boolean reset);

    int M();

    long N();

    int O();

    int P();

    void Q(int windowIndex);

    long R();

    int S();

    boolean T();

    void U();

    boolean X();

    int Y();

    void b0(boolean playWhenReady);

    m0 c();

    z0 c0();

    boolean d();

    Looper d0();

    androidx.media2.exoplayer.external.trackselection.p g0();

    long getCurrentPosition();

    long getDuration();

    boolean hasNext();

    boolean hasPrevious();

    int i0(int index);

    void j0(int windowIndex, long positionMs);

    long n0();

    void next();

    int o0();

    void previous();

    int q0();

    void release();

    boolean s0();

    void stop();

    @androidx.annotation.p0
    Object t0();

    @androidx.annotation.p0
    j u0();

    long v();

    @androidx.annotation.p0
    e v0();

    void w(@androidx.annotation.p0 m0 playbackParameters);

    void w0(d listener);

    boolean x();

    @androidx.annotation.p0
    h x0();

    long y();

    @androidx.annotation.p0
    Object z();
}
