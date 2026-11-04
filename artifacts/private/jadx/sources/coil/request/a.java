package coil.request;

import androidx.lifecycle.c0;
import androidx.lifecycle.o0;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c0 f87606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final p2 f87607b;

    public a(@NotNull c0 c0Var, @NotNull p2 p2Var) {
        this.f87606a = c0Var;
        this.f87607b = p2Var;
    }

    @Override // coil.request.p
    public void complete() {
        this.f87606a.g(this);
    }

    @Override // coil.request.p
    public void dispose() {
        p2.a.b(this.f87607b, null, 1, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull o0 o0Var) {
        dispose();
    }

    @Override // coil.request.p
    public void start() {
        this.f87606a.c(this);
    }
}
