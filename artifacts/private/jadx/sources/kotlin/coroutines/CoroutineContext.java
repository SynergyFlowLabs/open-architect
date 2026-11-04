package kotlin.coroutines;

import kotlin.e1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@e1(version = "1.3")
public interface CoroutineContext {

    public interface Element extends CoroutineContext {

        public static final class a {
            public static <R> R a(@NotNull Element element, R r10, @NotNull Function2<? super R, ? super Element, ? extends R> operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return operation.invoke(r10, element);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public static <E extends Element> E b(@NotNull Element element, @NotNull b<E> key) {
                Intrinsics.checkNotNullParameter(key, "key");
                if (!Intrinsics.areEqual(element.getKey(), key)) {
                    return null;
                }
                Intrinsics.checkNotNull(element, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return element;
            }

            @NotNull
            public static CoroutineContext c(@NotNull Element element, @NotNull b<?> key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return Intrinsics.areEqual(element.getKey(), key) ? h.f312451a : element;
            }

            @NotNull
            public static CoroutineContext d(@NotNull Element element, @NotNull CoroutineContext context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return a.a(element, context);
            }
        }

        @Override // kotlin.coroutines.CoroutineContext
        <R> R fold(R r10, @NotNull Function2<? super R, ? super Element, ? extends R> function2);

        @Override // kotlin.coroutines.CoroutineContext
        @Nullable
        <E extends Element> E get(@NotNull b<E> bVar);

        @NotNull
        b<?> getKey();

        @Override // kotlin.coroutines.CoroutineContext
        @NotNull
        CoroutineContext minusKey(@NotNull b<?> bVar);
    }

    public static final class a {

        /* JADX INFO: renamed from: kotlin.coroutines.CoroutineContext$a$a, reason: collision with other inner class name */
        static final class C2250a extends l0 implements Function2<CoroutineContext, Element, CoroutineContext> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2250a f312437a = new C2250a();

            C2250a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final CoroutineContext invoke(CoroutineContext acc, Element element) {
                Intrinsics.checkNotNullParameter(acc, "acc");
                Intrinsics.checkNotNullParameter(element, "element");
                CoroutineContext coroutineContextMinusKey = acc.minusKey(element.getKey());
                h hVar = h.f312451a;
                if (coroutineContextMinusKey == hVar) {
                    return element;
                }
                e.b bVar = e.K2;
                e eVar = (e) coroutineContextMinusKey.get(bVar);
                if (eVar == null) {
                    return new c(coroutineContextMinusKey, element);
                }
                CoroutineContext coroutineContextMinusKey2 = coroutineContextMinusKey.minusKey(bVar);
                return coroutineContextMinusKey2 == hVar ? new c(element, eVar) : new c(new c(coroutineContextMinusKey2, element), eVar);
            }
        }

        @NotNull
        public static CoroutineContext a(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context == h.f312451a ? coroutineContext : (CoroutineContext) context.fold(coroutineContext, C2250a.f312437a);
        }
    }

    public interface b<E extends Element> {
    }

    <R> R fold(R r10, @NotNull Function2<? super R, ? super Element, ? extends R> function2);

    @Nullable
    <E extends Element> E get(@NotNull b<E> bVar);

    @NotNull
    CoroutineContext minusKey(@NotNull b<?> bVar);

    @NotNull
    CoroutineContext plus(@NotNull CoroutineContext coroutineContext);
}
