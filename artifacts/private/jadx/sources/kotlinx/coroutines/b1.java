package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
class b1<T> extends a<T> implements a1<T> {
    public b1(@NotNull CoroutineContext coroutineContext, boolean z10) {
        super(coroutineContext, true, z10);
    }

    static /* synthetic */ <T> Object i2(b1<T> b1Var, kotlin.coroutines.d<? super T> dVar) throws Throwable {
        Object objH0 = b1Var.h0(dVar);
        kotlin.coroutines.intrinsics.b.l();
        return objH0;
    }

    @Override // kotlinx.coroutines.a1
    @NotNull
    public kotlinx.coroutines.selects.h<T> b1() {
        kotlinx.coroutines.selects.h<T> hVar = (kotlinx.coroutines.selects.h<T>) V0();
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.DeferredCoroutine>");
        return hVar;
    }

    @Override // kotlinx.coroutines.a1
    public T m() {
        return (T) J0();
    }

    @Override // kotlinx.coroutines.a1
    @Nullable
    public Object q(@NotNull kotlin.coroutines.d<? super T> dVar) {
        return i2(this, dVar);
    }
}
