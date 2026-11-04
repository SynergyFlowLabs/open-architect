package androidx.media2.exoplayer.external.source;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public abstract class c implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<z.b> f55755a = new ArrayList<>(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet<z.b> f55756b = new HashSet<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k0.a f55757c = new k0.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private Looper f55758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media2.exoplayer.external.z0 f55759e;

    @Override // androidx.media2.exoplayer.external.source.z
    public Object E() {
        return y.a(this);
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public final void b(z.b caller, @androidx.annotation.p0 androidx.media2.exoplayer.external.upstream.q0 mediaTransferListener) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f55758d;
        androidx.media2.exoplayer.external.util.a.a(looper == null || looper == looperMyLooper);
        androidx.media2.exoplayer.external.z0 z0Var = this.f55759e;
        this.f55755a.add(caller);
        if (this.f55758d == null) {
            this.f55758d = looperMyLooper;
            this.f55756b.add(caller);
            r(mediaTransferListener);
        } else if (z0Var != null) {
            j(caller);
            caller.c(this, z0Var);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public final void d(z.b caller) {
        boolean zIsEmpty = this.f55756b.isEmpty();
        this.f55756b.remove(caller);
        if (zIsEmpty || !this.f55756b.isEmpty()) {
            return;
        }
        o();
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public final void f(z.b caller) {
        this.f55755a.remove(caller);
        if (!this.f55755a.isEmpty()) {
            d(caller);
            return;
        }
        this.f55758d = null;
        this.f55759e = null;
        this.f55756b.clear();
        t();
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public final void g(Handler handler, k0 eventListener) {
        this.f55757c.a(handler, eventListener);
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public final void i(k0 eventListener) {
        this.f55757c.D(eventListener);
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public final void j(z.b caller) {
        androidx.media2.exoplayer.external.util.a.g(this.f55758d);
        boolean zIsEmpty = this.f55756b.isEmpty();
        this.f55756b.add(caller);
        if (zIsEmpty) {
            p();
        }
    }

    protected final k0.a l(int windowIndex, @androidx.annotation.p0 z.a mediaPeriodId, long mediaTimeOffsetMs) {
        return this.f55757c.G(windowIndex, mediaPeriodId, mediaTimeOffsetMs);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final k0.a m(@androidx.annotation.p0 z.a mediaPeriodId) {
        return this.f55757c.G(0, mediaPeriodId, 0L);
    }

    protected final k0.a n(z.a mediaPeriodId, long mediaTimeOffsetMs) {
        androidx.media2.exoplayer.external.util.a.a(mediaPeriodId != null);
        return this.f55757c.G(0, mediaPeriodId, mediaTimeOffsetMs);
    }

    protected void o() {
    }

    protected void p() {
    }

    protected final boolean q() {
        return !this.f55756b.isEmpty();
    }

    protected abstract void r(@androidx.annotation.p0 androidx.media2.exoplayer.external.upstream.q0 mediaTransferListener);

    protected final void s(androidx.media2.exoplayer.external.z0 timeline) {
        this.f55759e = timeline;
        Iterator<z.b> it = this.f55755a.iterator();
        while (it.hasNext()) {
            it.next().c(this, timeline);
        }
    }

    protected abstract void t();
}
