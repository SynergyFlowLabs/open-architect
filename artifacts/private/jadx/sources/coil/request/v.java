package coil.request;

import androidx.annotation.l0;
import androidx.lifecycle.c0;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final coil.j f87755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final i f87756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final coil.target.d<?> f87757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final c0 f87758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final p2 f87759e;

    public v(@NotNull coil.j jVar, @NotNull i iVar, @NotNull coil.target.d<?> dVar, @NotNull c0 c0Var, @NotNull p2 p2Var) {
        this.f87755a = jVar;
        this.f87756b = iVar;
        this.f87757c = dVar;
        this.f87758d = c0Var;
        this.f87759e = p2Var;
    }

    @l0
    public final void a() {
        this.f87755a.c(this.f87756b);
    }

    @Override // coil.request.p
    public void dispose() {
        p2.a.b(this.f87759e, null, 1, null);
        coil.target.d<?> dVar = this.f87757c;
        if (dVar instanceof n0) {
            this.f87758d.g((n0) dVar);
        }
        this.f87758d.g(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull o0 o0Var) {
        coil.util.l.t(this.f87757c.getView()).a();
    }

    @Override // coil.request.p
    public void start() {
        this.f87758d.c(this);
        coil.target.d<?> dVar = this.f87757c;
        if (dVar instanceof n0) {
            coil.util.i.b(this.f87758d, (n0) dVar);
        }
        coil.util.l.t(this.f87757c.getView()).e(this);
    }

    @Override // coil.request.p
    public void t() {
        if (this.f87757c.getView().isAttachedToWindow()) {
            return;
        }
        coil.util.l.t(this.f87757c.getView()).e(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }
}
