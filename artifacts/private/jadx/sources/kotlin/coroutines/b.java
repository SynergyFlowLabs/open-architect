package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext.Element;
import kotlin.e1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@s
@e1(version = "1.3")
public abstract class b<B extends CoroutineContext.Element, E extends B> implements CoroutineContext.b<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<CoroutineContext.Element, E> f312438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final CoroutineContext.b<?> f312439b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.coroutines.CoroutineContext$b<?>] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.jvm.functions.Function1<? super kotlin.coroutines.CoroutineContext$Element, ? extends E extends B>, kotlin.jvm.functions.Function1<kotlin.coroutines.CoroutineContext$Element, E extends B>] */
    public b(@NotNull CoroutineContext.b<B> baseKey, @NotNull Function1<? super CoroutineContext.Element, ? extends E> safeCast) {
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        this.f312438a = safeCast;
        this.f312439b = baseKey instanceof b ? (CoroutineContext.b<B>) ((b) baseKey).f312439b : baseKey;
    }

    public final boolean a(@NotNull CoroutineContext.b<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return key == this || this.f312439b == key;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/coroutines/CoroutineContext$Element;)TE; */
    @Nullable
    public final CoroutineContext.Element b(@NotNull CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return (CoroutineContext.Element) this.f312438a.invoke(element);
    }
}
