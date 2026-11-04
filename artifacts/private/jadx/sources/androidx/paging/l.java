package androidx.paging;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class l<T> implements kotlinx.coroutines.flow.j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.channels.o0<T> f72347a;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@NotNull kotlinx.coroutines.channels.o0<? super T> channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.f72347a = channel;
    }

    @NotNull
    public final kotlinx.coroutines.channels.o0<T> a() {
        return this.f72347a;
    }

    @Override // kotlinx.coroutines.flow.j
    @Nullable
    public Object emit(T t10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = this.f72347a.G(t10, dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }
}
