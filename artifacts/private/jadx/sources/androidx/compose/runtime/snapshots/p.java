package androidx.compose.runtime.snapshots;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface p extends CoroutineContext.Element {

    @NotNull
    public static final b D = b.f36552a;

    public static final class a {
        public static <R> R a(@NotNull p pVar, R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.a.a(pVar, r10, function2);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E b(@NotNull p pVar, @NotNull CoroutineContext.b<E> bVar) {
            return (E) CoroutineContext.Element.a.b(pVar, bVar);
        }

        @NotNull
        public static CoroutineContext c(@NotNull p pVar, @NotNull CoroutineContext.b<?> bVar) {
            return CoroutineContext.Element.a.c(pVar, bVar);
        }

        @NotNull
        public static CoroutineContext d(@NotNull p pVar, @NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(pVar, coroutineContext);
        }
    }

    public static final class b implements CoroutineContext.b<p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f36552a = new b();

        private b() {
        }
    }
}
