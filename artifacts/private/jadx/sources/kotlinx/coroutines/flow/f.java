package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
class f<T> extends kotlinx.coroutines.flow.internal.e<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<kotlinx.coroutines.channels.l0<? super T>, kotlin.coroutines.d<? super Unit>, Object> f314198d;

    public /* synthetic */ f(Function2 function2, CoroutineContext coroutineContext, int i10, kotlinx.coroutines.channels.j jVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i11 & 2) != 0 ? kotlin.coroutines.h.f312451a : coroutineContext, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? kotlinx.coroutines.channels.j.SUSPEND : jVar);
    }

    static /* synthetic */ <T> Object n(f<T> fVar, kotlinx.coroutines.channels.l0<? super T> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
        Object objInvoke = ((f) fVar).f314198d.invoke(l0Var, dVar);
        return objInvoke == kotlin.coroutines.intrinsics.b.l() ? objInvoke : Unit.f312394a;
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @Nullable
    protected Object g(@NotNull kotlinx.coroutines.channels.l0<? super T> l0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return n(this, l0Var, dVar);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @NotNull
    protected kotlinx.coroutines.flow.internal.e<T> h(@NotNull CoroutineContext coroutineContext, int i10, @NotNull kotlinx.coroutines.channels.j jVar) {
        return new f(this.f314198d, coroutineContext, i10, jVar);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @NotNull
    public String toString() {
        return "block[" + this.f314198d + "] -> " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull Function2<? super kotlinx.coroutines.channels.l0<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull CoroutineContext coroutineContext, int i10, @NotNull kotlinx.coroutines.channels.j jVar) {
        super(coroutineContext, i10, jVar);
        this.f314198d = function2;
    }
}
