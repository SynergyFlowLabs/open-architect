package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.z3;
import androidx.media3.exoplayer.analytics.j4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public abstract class a implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<t0.c> f64741a = new ArrayList<>(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet<t0.c> f64742b = new HashSet<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b1.a f64743c = new b1.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.t.a f64744d = new androidx.media3.exoplayer.drm.t.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private Looper f64745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private z3 f64746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private j4 f64747g;

    @Override // androidx.media3.exoplayer.source.t0
    @androidx.media3.common.util.b1
    public final void A(androidx.media3.exoplayer.drm.t tVar) {
        this.f64744d.n(tVar);
    }

    @Override // androidx.media3.exoplayer.source.t0
    @androidx.media3.common.util.b1
    public final void C(t0.c cVar, @androidx.annotation.p0 androidx.media3.datasource.r1 r1Var, j4 j4Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f64745e;
        androidx.media3.common.util.a.a(looper == null || looper == looperMyLooper);
        this.f64747g = j4Var;
        z3 z3Var = this.f64746f;
        this.f64741a.add(cVar);
        if (this.f64745e == null) {
            this.f64745e = looperMyLooper;
            this.f64742b.add(cVar);
            j0(r1Var);
        } else if (z3Var != null) {
            F(cVar);
            cVar.B(this, z3Var);
        }
    }

    @Override // androidx.media3.exoplayer.source.t0
    @androidx.media3.common.util.b1
    public final void F(t0.c cVar) {
        androidx.media3.common.util.a.g(this.f64745e);
        boolean zIsEmpty = this.f64742b.isEmpty();
        this.f64742b.add(cVar);
        if (zIsEmpty) {
            d0();
        }
    }

    @Override // androidx.media3.exoplayer.source.t0
    @androidx.media3.common.util.b1
    public final void M(t0.c cVar) {
        boolean zIsEmpty = this.f64742b.isEmpty();
        this.f64742b.remove(cVar);
        if (zIsEmpty || !this.f64742b.isEmpty()) {
            return;
        }
        a0();
    }

    protected final androidx.media3.exoplayer.drm.t.a Q(int i10, @androidx.annotation.p0 t0.b bVar) {
        return this.f64744d.o(i10, bVar);
    }

    protected final androidx.media3.exoplayer.drm.t.a S(@androidx.annotation.p0 t0.b bVar) {
        return this.f64744d.o(0, bVar);
    }

    protected final b1.a V(int i10, @androidx.annotation.p0 t0.b bVar) {
        return this.f64743c.D(i10, bVar);
    }

    @Deprecated
    protected final b1.a W(int i10, @androidx.annotation.p0 t0.b bVar, long j10) {
        return this.f64743c.D(i10, bVar);
    }

    protected final b1.a X(@androidx.annotation.p0 t0.b bVar) {
        return this.f64743c.D(0, bVar);
    }

    @Deprecated
    protected final b1.a Y(t0.b bVar, long j10) {
        androidx.media3.common.util.a.g(bVar);
        return this.f64743c.D(0, bVar);
    }

    protected void a0() {
    }

    protected void d0() {
    }

    protected final j4 e0() {
        return (j4) androidx.media3.common.util.a.k(this.f64747g);
    }

    protected final boolean f0() {
        return !this.f64742b.isEmpty();
    }

    protected final boolean h0() {
        return !this.f64741a.isEmpty();
    }

    @Override // androidx.media3.exoplayer.source.t0
    @androidx.media3.common.util.b1
    public final void i(Handler handler, b1 b1Var) {
        androidx.media3.common.util.a.g(handler);
        androidx.media3.common.util.a.g(b1Var);
        this.f64743c.h(handler, b1Var);
    }

    @Override // androidx.media3.exoplayer.source.t0
    @androidx.media3.common.util.b1
    public final void j(Handler handler, androidx.media3.exoplayer.drm.t tVar) {
        androidx.media3.common.util.a.g(handler);
        androidx.media3.common.util.a.g(tVar);
        this.f64744d.g(handler, tVar);
    }

    protected abstract void j0(@androidx.annotation.p0 androidx.media3.datasource.r1 r1Var);

    protected final void k0(z3 z3Var) {
        this.f64746f = z3Var;
        Iterator<t0.c> it = this.f64741a.iterator();
        while (it.hasNext()) {
            it.next().B(this, z3Var);
        }
    }

    protected abstract void l0();

    @Override // androidx.media3.exoplayer.source.t0
    @androidx.media3.common.util.b1
    public final void n(t0.c cVar) {
        this.f64741a.remove(cVar);
        if (!this.f64741a.isEmpty()) {
            M(cVar);
            return;
        }
        this.f64745e = null;
        this.f64746f = null;
        this.f64747g = null;
        this.f64742b.clear();
        l0();
    }

    protected final void q0(j4 j4Var) {
        this.f64747g = j4Var;
    }

    @Override // androidx.media3.exoplayer.source.t0
    @androidx.media3.common.util.b1
    public final void v(b1 b1Var) {
        this.f64743c.A(b1Var);
    }

    @Override // androidx.media3.exoplayer.source.t0
    @androidx.media3.common.util.b1
    public final void z(t0.c cVar, @androidx.annotation.p0 androidx.media3.datasource.r1 r1Var) {
        C(cVar, r1Var, j4.f63008d);
    }
}
