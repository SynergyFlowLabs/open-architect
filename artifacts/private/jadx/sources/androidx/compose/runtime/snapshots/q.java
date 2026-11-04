package androidx.compose.runtime.snapshots;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.r3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class q implements p, r3<m> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36554b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m f36555a;

    public q(@NotNull m mVar) {
        this.f36555a = mVar;
    }

    @Override // kotlinx.coroutines.r3
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void I(@NotNull CoroutineContext coroutineContext, @Nullable m mVar) {
        this.f36555a.K(mVar);
    }

    @Override // kotlinx.coroutines.r3
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m l1(@NotNull CoroutineContext coroutineContext) {
        return this.f36555a.J();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) p.a.a(this, r10, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b<E> bVar) {
        return (E) p.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public CoroutineContext.b<?> getKey() {
        return p.D;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.b<?> bVar) {
        return p.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return p.a.d(this, coroutineContext);
    }
}
