package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface o0 extends CoroutineContext.Element {

    @NotNull
    public static final b L2 = b.f315185a;

    public static final class a {
        public static <R> R a(@NotNull o0 o0Var, R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.a.a(o0Var, r10, function2);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E b(@NotNull o0 o0Var, @NotNull CoroutineContext.b<E> bVar) {
            return (E) CoroutineContext.Element.a.b(o0Var, bVar);
        }

        @NotNull
        public static CoroutineContext c(@NotNull o0 o0Var, @NotNull CoroutineContext.b<?> bVar) {
            return CoroutineContext.Element.a.c(o0Var, bVar);
        }

        @NotNull
        public static CoroutineContext d(@NotNull o0 o0Var, @NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(o0Var, coroutineContext);
        }
    }

    public static final class b implements CoroutineContext.b<o0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f315185a = new b();

        private b() {
        }
    }

    void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2);
}
