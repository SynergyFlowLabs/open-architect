package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlinx.coroutines.channels.o0;
import kotlinx.coroutines.k2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@k2
public final class a0<T> implements kotlinx.coroutines.flow.j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final o0<T> f314481a;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(@NotNull o0<? super T> o0Var) {
        this.f314481a = o0Var;
    }

    @Override // kotlinx.coroutines.flow.j
    @Nullable
    public Object emit(T t10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = this.f314481a.G(t10, dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }
}
