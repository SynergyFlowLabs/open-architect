package kotlinx.coroutines.internal;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.k2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class o0 extends kotlinx.coroutines.n0 implements kotlinx.coroutines.c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ kotlinx.coroutines.c1 f315104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.n0 f315105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f315106d;

    /* JADX WARN: Multi-variable type inference failed */
    public o0(@NotNull kotlinx.coroutines.n0 n0Var, @NotNull String str) {
        kotlinx.coroutines.c1 c1Var = n0Var instanceof kotlinx.coroutines.c1 ? (kotlinx.coroutines.c1) n0Var : null;
        this.f315104b = c1Var == null ? kotlinx.coroutines.z0.a() : c1Var;
        this.f315105c = n0Var;
        this.f315106d = str;
    }

    @Override // kotlinx.coroutines.n0
    public boolean N(@NotNull CoroutineContext coroutineContext) {
        return this.f315105c.N(coroutineContext);
    }

    @Override // kotlinx.coroutines.c1
    public void b(long j10, @NotNull kotlinx.coroutines.n<? super Unit> nVar) {
        this.f315104b.b(j10, nVar);
    }

    @Override // kotlinx.coroutines.c1
    @NotNull
    public kotlinx.coroutines.o1 d(long j10, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return this.f315104b.d(j10, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.c1
    @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object g(long j10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return this.f315104b.g(j10, dVar);
    }

    @Override // kotlinx.coroutines.n0
    public void h(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        this.f315105c.h(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.n0
    @k2
    public void j(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        this.f315105c.j(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.n0
    @NotNull
    public String toString() {
        return this.f315106d;
    }
}
