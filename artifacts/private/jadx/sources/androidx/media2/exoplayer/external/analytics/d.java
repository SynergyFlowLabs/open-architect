package androidx.media2.exoplayer.external.analytics;

import android.view.Surface;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.m0;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.source.TrackGroupArray;
import androidx.media2.exoplayer.external.source.k0;
import androidx.media2.exoplayer.external.trackselection.p;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
@Deprecated
public abstract class d implements c {
    @Override // androidx.media2.exoplayer.external.analytics.c
    public void A(c.a aVar, k0.b bVar, k0.c cVar) {
        b.r(this, aVar, bVar, cVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void B(c.a aVar, int i10, long j10, long j11) {
        b.c(this, aVar, i10, j10, j11);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void C(c.a aVar, Metadata metadata) {
        b.x(this, aVar, metadata);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void D(c.a aVar, androidx.media2.exoplayer.external.i iVar) {
        b.z(this, aVar, iVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void F(c.a aVar, m0 m0Var) {
        b.y(this, aVar, m0Var);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void G(c.a aVar, int i10) {
        b.J(this, aVar, i10);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void H(c.a aVar, k0.b bVar, k0.c cVar) {
        b.t(this, aVar, bVar, cVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void I(c.a aVar, int i10, androidx.media2.exoplayer.external.decoder.d dVar) {
        b.e(this, aVar, i10, dVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void J(c.a aVar) {
        b.j(this, aVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void K(c.a aVar) {
        b.w(this, aVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void L(c.a aVar, boolean z10) {
        b.u(this, aVar, z10);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void M(c.a aVar, k0.b bVar, k0.c cVar) {
        b.q(this, aVar, bVar, cVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void N(c.a aVar, boolean z10, int i10) {
        b.A(this, aVar, z10, i10);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void O(c.a aVar, Surface surface) {
        b.D(this, aVar, surface);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void P(c.a aVar, boolean z10) {
        b.H(this, aVar, z10);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void Q(c.a aVar, int i10, androidx.media2.exoplayer.external.decoder.d dVar) {
        b.f(this, aVar, i10, dVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void R(c.a aVar) {
        b.l(this, aVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void b(c.a aVar, Exception exc) {
        b.n(this, aVar, exc);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void d(c.a aVar) {
        b.G(this, aVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void e(c.a aVar, int i10) {
        b.B(this, aVar, i10);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void f(c.a aVar, int i10, String str, long j10) {
        b.g(this, aVar, i10, str, j10);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void g(c.a aVar) {
        b.k(this, aVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void h(c.a aVar) {
        b.m(this, aVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void i(c.a aVar) {
        b.v(this, aVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void k(c.a aVar, int i10) {
        b.E(this, aVar, i10);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void l(c.a aVar) {
        b.F(this, aVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void m(c.a aVar, k0.c cVar) {
        b.i(this, aVar, cVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void n(c.a aVar) {
        b.C(this, aVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void o(c.a aVar, androidx.media2.exoplayer.external.audio.c cVar) {
        b.a(this, aVar, cVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void p(c.a aVar, int i10, int i11) {
        b.I(this, aVar, i10, i11);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void q(c.a aVar, int i10, long j10, long j11) {
        b.d(this, aVar, i10, j10, j11);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void r(c.a aVar, int i10) {
        b.b(this, aVar, i10);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void s(c.a aVar, k0.b bVar, k0.c cVar, IOException iOException, boolean z10) {
        b.s(this, aVar, bVar, cVar, iOException, z10);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void t(c.a aVar, int i10, int i11, int i12, float f10) {
        b.M(this, aVar, i10, i11, i12, f10);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void u(c.a aVar, TrackGroupArray trackGroupArray, p pVar) {
        b.K(this, aVar, trackGroupArray, pVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void v(c.a aVar) {
        b.o(this, aVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void w(c.a aVar, float f10) {
        b.N(this, aVar, f10);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void x(c.a aVar, int i10, long j10) {
        b.p(this, aVar, i10, j10);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void y(c.a aVar, k0.c cVar) {
        b.L(this, aVar, cVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void z(c.a aVar, int i10, Format format) {
        b.h(this, aVar, i10, format);
    }
}
