package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class i<T> extends h<T, T> {
    public /* synthetic */ i(kotlinx.coroutines.flow.i iVar, CoroutineContext coroutineContext, int i10, kotlinx.coroutines.channels.j jVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, (i11 & 2) != 0 ? kotlin.coroutines.h.f312451a : coroutineContext, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? kotlinx.coroutines.channels.j.SUSPEND : jVar);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @NotNull
    protected e<T> h(@NotNull CoroutineContext coroutineContext, int i10, @NotNull kotlinx.coroutines.channels.j jVar) {
        return new i(this.f314520d, coroutineContext, i10, jVar);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @NotNull
    public kotlinx.coroutines.flow.i<T> j() {
        return (kotlinx.coroutines.flow.i<T>) this.f314520d;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlinx.coroutines.flow.internal.h
    @Nullable
    protected Object r(@NotNull kotlinx.coroutines.flow.j<? super T> jVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objCollect = this.f314520d.collect((kotlinx.coroutines.flow.j<? super S>) jVar, dVar);
        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
    }

    public i(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull CoroutineContext coroutineContext, int i10, @NotNull kotlinx.coroutines.channels.j jVar) {
        super(iVar, coroutineContext, i10, jVar);
    }
}
