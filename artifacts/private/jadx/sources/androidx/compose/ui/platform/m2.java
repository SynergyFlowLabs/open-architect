package androidx.compose.ui.platform;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface m2 extends CoroutineContext.Element {

    @NotNull
    public static final b L = b.f40655a;

    public static final class a {
        public static <R> R a(@NotNull m2 m2Var, R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.a.a(m2Var, r10, function2);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E b(@NotNull m2 m2Var, @NotNull CoroutineContext.b<E> bVar) {
            return (E) CoroutineContext.Element.a.b(m2Var, bVar);
        }

        @Deprecated
        @NotNull
        public static CoroutineContext.b<?> c(@NotNull m2 m2Var) {
            return m2.super.getKey();
        }

        @NotNull
        public static CoroutineContext d(@NotNull m2 m2Var, @NotNull CoroutineContext.b<?> bVar) {
            return CoroutineContext.Element.a.c(m2Var, bVar);
        }

        @NotNull
        public static CoroutineContext e(@NotNull m2 m2Var, @NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(m2Var, coroutineContext);
        }
    }

    public static final class b implements CoroutineContext.b<m2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f40655a = new b();

        private b() {
        }
    }

    @Nullable
    <R> Object X(@NotNull Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super R> dVar);

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    default CoroutineContext.b<?> getKey() {
        return L;
    }
}
