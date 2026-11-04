package kotlinx.coroutines;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class y<T> extends w2 implements x<T> {
    public y(@Nullable p2 p2Var) {
        super(true);
        q1(p2Var);
    }

    @Override // kotlinx.coroutines.x
    public boolean R(T t10) {
        return z1(t10);
    }

    @Override // kotlinx.coroutines.w2
    public boolean X0() {
        return true;
    }

    @Override // kotlinx.coroutines.a1
    @NotNull
    public kotlinx.coroutines.selects.h<T> b1() {
        kotlinx.coroutines.selects.h<T> hVar = (kotlinx.coroutines.selects.h<T>) V0();
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>");
        return hVar;
    }

    @Override // kotlinx.coroutines.x
    public boolean f(@NotNull Throwable th2) {
        return z1(new c0(th2, false, 2, null));
    }

    @Override // kotlinx.coroutines.a1
    public T m() {
        return (T) J0();
    }

    @Override // kotlinx.coroutines.a1
    @Nullable
    public Object q(@NotNull kotlin.coroutines.d<? super T> dVar) throws Throwable {
        Object objH0 = h0(dVar);
        kotlin.coroutines.intrinsics.b.l();
        return objH0;
    }
}
