package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class q1 extends v2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final o1 f315204e;

    public q1(@NotNull o1 o1Var) {
        this.f315204e = o1Var;
    }

    @Override // kotlinx.coroutines.v2
    public boolean D() {
        return false;
    }

    @Override // kotlinx.coroutines.v2
    public void E(@Nullable Throwable th2) {
        this.f315204e.dispose();
    }
}
