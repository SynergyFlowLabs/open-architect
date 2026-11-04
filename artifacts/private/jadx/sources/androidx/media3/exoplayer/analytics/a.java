package androidx.media3.exoplayer.analytics;

import android.os.Looper;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public interface a extends androidx.media3.common.z0.g, androidx.media3.exoplayer.source.b1, androidx.media3.exoplayer.upstream.d.a, androidx.media3.exoplayer.drm.t {
    void D(Object obj, long j10);

    void G(androidx.media3.common.w wVar, @androidx.annotation.p0 androidx.media3.exoplayer.k kVar);

    void H(androidx.media3.exoplayer.j jVar);

    void I(int i10, long j10, long j11);

    void J(List<androidx.media3.exoplayer.source.t0.b> list, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar);

    void T(b bVar);

    void Z(b bVar);

    void b(String str, long j10, long j11);

    void c(int i10, long j10);

    void c0(androidx.media3.common.z0 z0Var, Looper looper);

    void d(String str, long j10, long j11);

    void e(androidx.media3.exoplayer.audio.x.a aVar);

    void f(androidx.media3.exoplayer.audio.x.a aVar);

    void h(Exception exc);

    void i0();

    void k(String str);

    void m(String str);

    void o(androidx.media3.exoplayer.j jVar);

    void p(androidx.media3.exoplayer.j jVar);

    void q(androidx.media3.common.w wVar, @androidx.annotation.p0 androidx.media3.exoplayer.k kVar);

    void r(androidx.media3.exoplayer.j jVar);

    void release();

    void s(Exception exc);

    void t(long j10, int i10);

    void u0(int i10, int i11, boolean z10);

    void w(long j10);

    void y(Exception exc);
}
