package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class n0<T> extends a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<j<? super T>, kotlin.coroutines.d<? super Unit>, Object> f314725a;

    /* JADX WARN: Multi-variable type inference failed */
    public n0(@NotNull Function2<? super j<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        this.f314725a = function2;
    }

    @Override // kotlinx.coroutines.flow.a
    @Nullable
    public Object c(@NotNull j<? super T> jVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objInvoke = this.f314725a.invoke(jVar, dVar);
        return objInvoke == kotlin.coroutines.intrinsics.b.l() ? objInvoke : Unit.f312394a;
    }
}
