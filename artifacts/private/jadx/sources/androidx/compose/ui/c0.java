package androidx.compose.ui;

import androidx.compose.runtime.k7;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
public interface c0 extends CoroutineContext.Element {

    @NotNull
    public static final b F = b.f37075a;

    public static final class a {
        public static <R> R a(@NotNull c0 c0Var, R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.a.a(c0Var, r10, function2);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E b(@NotNull c0 c0Var, @NotNull CoroutineContext.b<E> bVar) {
            return (E) CoroutineContext.Element.a.b(c0Var, bVar);
        }

        @NotNull
        public static CoroutineContext c(@NotNull c0 c0Var, @NotNull CoroutineContext.b<?> bVar) {
            return CoroutineContext.Element.a.c(c0Var, bVar);
        }

        @NotNull
        public static CoroutineContext d(@NotNull c0 c0Var, @NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(c0Var, coroutineContext);
        }
    }

    public static final class b implements CoroutineContext.b<c0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f37075a = new b();

        private b() {
        }
    }

    float B0();

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    default CoroutineContext.b<?> getKey() {
        return F;
    }
}
