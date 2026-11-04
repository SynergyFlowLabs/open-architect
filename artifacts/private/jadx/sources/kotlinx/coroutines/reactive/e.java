package kotlinx.coroutines.reactive;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reactivestreams.u;
import org.reactivestreams.v;

/* JADX INFO: loaded from: classes12.dex */
final class e<T> implements u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.i<T> f315241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f315242b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull CoroutineContext coroutineContext) {
        this.f315241a = iVar;
        this.f315242b = coroutineContext;
    }

    @Override // org.reactivestreams.u
    public void e(@Nullable v<? super T> vVar) {
        vVar.getClass();
        vVar.l(new h(this.f315241a, vVar, this.f315242b));
    }
}
