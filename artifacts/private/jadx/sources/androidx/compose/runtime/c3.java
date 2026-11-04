package androidx.compose.runtime;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface c3 extends CoroutineContext.Element {

    @NotNull
    public static final b C = b.f35330a;

    public static final class a {
        public static <R> R a(@NotNull c3 c3Var, R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.a.a(c3Var, r10, function2);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E b(@NotNull c3 c3Var, @NotNull CoroutineContext.b<E> bVar) {
            return (E) CoroutineContext.Element.a.b(c3Var, bVar);
        }

        @Deprecated
        @NotNull
        public static CoroutineContext.b<?> c(@NotNull c3 c3Var) {
            return c3.super.getKey();
        }

        @NotNull
        public static CoroutineContext d(@NotNull c3 c3Var, @NotNull CoroutineContext.b<?> bVar) {
            return CoroutineContext.Element.a.c(c3Var, bVar);
        }

        @NotNull
        public static CoroutineContext e(@NotNull c3 c3Var, @NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(c3Var, coroutineContext);
        }
    }

    public static final class b implements CoroutineContext.b<c3> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f35330a = new b();

        private b() {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    default CoroutineContext.b<?> getKey() {
        return C;
    }

    @Nullable
    <R> Object y(@NotNull Function1<? super Long, ? extends R> function1, @NotNull kotlin.coroutines.d<? super R> dVar);
}
