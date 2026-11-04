package kotlin.coroutines;

import kotlin.e1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@e1(version = "1.3")
public interface e extends CoroutineContext.Element {

    @NotNull
    public static final b K2 = b.f312448a;

    public static final class a {
        public static <R> R a(@NotNull e eVar, R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) CoroutineContext.Element.a.a(eVar, r10, operation);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E b(@NotNull e eVar, @NotNull CoroutineContext.b<E> key) {
            E e10;
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof kotlin.coroutines.b)) {
                if (e.K2 != key) {
                    return null;
                }
                Intrinsics.checkNotNull(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            }
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            if (!bVar.a(eVar.getKey()) || (e10 = (E) bVar.b(eVar)) == null) {
                return null;
            }
            return e10;
        }

        @NotNull
        public static CoroutineContext c(@NotNull e eVar, @NotNull CoroutineContext.b<?> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof kotlin.coroutines.b)) {
                return e.K2 == key ? h.f312451a : eVar;
            }
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : h.f312451a;
        }

        @NotNull
        public static CoroutineContext d(@NotNull e eVar, @NotNull CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return CoroutineContext.Element.a.d(eVar, context);
        }

        public static void e(@NotNull e eVar, @NotNull d<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "continuation");
        }
    }

    public static final class b implements CoroutineContext.b<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f312448a = new b();

        private b() {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b<E> bVar);

    @NotNull
    <T> d<T> k0(@NotNull d<? super T> dVar);

    void l(@NotNull d<?> dVar);

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    CoroutineContext minusKey(@NotNull CoroutineContext.b<?> bVar);
}
