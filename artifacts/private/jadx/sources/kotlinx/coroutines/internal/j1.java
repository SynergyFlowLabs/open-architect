package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.r3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class j1<T> implements r3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f315081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ThreadLocal<T> f315082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final CoroutineContext.b<?> f315083c;

    public j1(T t10, @NotNull ThreadLocal<T> threadLocal) {
        this.f315081a = t10;
        this.f315082b = threadLocal;
        this.f315083c = new k1(threadLocal);
    }

    @Override // kotlinx.coroutines.r3
    public void I(@NotNull CoroutineContext coroutineContext, T t10) {
        this.f315082b.set(t10);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) r3.a.a(this, r10, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b<E> bVar) {
        if (!Intrinsics.areEqual(getKey(), bVar)) {
            return null;
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
        return this;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public CoroutineContext.b<?> getKey() {
        return this.f315083c;
    }

    @Override // kotlinx.coroutines.r3
    public T l1(@NotNull CoroutineContext coroutineContext) {
        T t10 = this.f315082b.get();
        this.f315082b.set(this.f315081a);
        return t10;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.b<?> bVar) {
        if (Intrinsics.areEqual(getKey(), bVar)) {
            this = (j1<T>) kotlin.coroutines.h.f312451a;
        }
        return this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return r3.a.d(this, coroutineContext);
    }

    @NotNull
    public String toString() {
        return "ThreadLocal(value=" + this.f315081a + ", threadLocal = " + this.f315082b + ')';
    }
}
