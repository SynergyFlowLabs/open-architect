package androidx.compose.runtime;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class y2 implements m5, kotlinx.coroutines.o0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f36807e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f36808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> f36809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f36810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.p2 f36811d;

    /* JADX WARN: Multi-variable type inference failed */
    public y2(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        this.f36808a = coroutineContext;
        this.f36809b = function2;
        this.f36810c = kotlinx.coroutines.t0.a(coroutineContext.plus(coroutineContext.get(androidx.compose.runtime.tooling.j.f36691b) != null ? this : kotlin.coroutines.h.f312451a));
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) kotlinx.coroutines.o0.a.a(this, r10, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b<E> bVar) {
        return (E) kotlinx.coroutines.o0.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public CoroutineContext.b<?> getKey() {
        return kotlinx.coroutines.o0.L2;
    }

    @Override // kotlinx.coroutines.o0
    public void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) throws Throwable {
        androidx.compose.runtime.tooling.j jVar = (androidx.compose.runtime.tooling.j) coroutineContext.get(androidx.compose.runtime.tooling.j.f36691b);
        if (jVar != null) {
            jVar.a(th2, this);
        }
        kotlinx.coroutines.o0 o0Var = (kotlinx.coroutines.o0) this.f36808a.get(kotlinx.coroutines.o0.L2);
        if (o0Var == null) {
            throw th2;
        }
        o0Var.handleException(coroutineContext, th2);
    }

    @Override // androidx.compose.runtime.m5
    public void i() {
        kotlinx.coroutines.p2 p2Var = this.f36811d;
        if (p2Var != null) {
            kotlinx.coroutines.u2.j(p2Var, "Old job was still running!", null, 2, null);
        }
        this.f36811d = kotlinx.coroutines.k.f(this.f36810c, null, null, this.f36809b, 3, null);
    }

    @Override // androidx.compose.runtime.m5
    public void j() {
        kotlinx.coroutines.p2 p2Var = this.f36811d;
        if (p2Var != null) {
            p2Var.e(new a3());
        }
        this.f36811d = null;
    }

    @Override // androidx.compose.runtime.m5
    public void k() {
        kotlinx.coroutines.p2 p2Var = this.f36811d;
        if (p2Var != null) {
            p2Var.e(new a3());
        }
        this.f36811d = null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.b<?> bVar) {
        return kotlinx.coroutines.o0.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return kotlinx.coroutines.o0.a.d(this, coroutineContext);
    }
}
