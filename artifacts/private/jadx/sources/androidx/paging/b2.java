package androidx.paging;

import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b2 {
    @androidx.annotation.j
    @oj.i(name = "filter")
    @NotNull
    public static final <T> x1<T> a(@NotNull x1<T> x1Var, @NotNull Executor executor, @NotNull Function1<? super T, Boolean> function1) {
        return d2.a(x1Var, executor, function1);
    }

    @androidx.annotation.j
    @NotNull
    public static final <T, R> x1<R> c(@NotNull x1<T> x1Var, @NotNull Executor executor, @NotNull Function1<? super T, ? extends Iterable<? extends R>> function1) {
        return d2.b(x1Var, executor, function1);
    }

    @oj.j
    @androidx.annotation.j
    @NotNull
    public static final <T> x1<T> e(@NotNull x1<T> x1Var, @NotNull f3 f3Var, @NotNull T t10) {
        return c2.c(x1Var, f3Var, t10);
    }

    @oj.j
    @androidx.annotation.j
    @NotNull
    public static final <T> x1<T> f(@NotNull x1<T> x1Var, @NotNull T t10) {
        return c2.d(x1Var, t10);
    }

    @oj.j
    @androidx.annotation.j
    @NotNull
    public static final <T> x1<T> h(@NotNull x1<T> x1Var, @NotNull f3 f3Var, @NotNull T t10) {
        return c2.f(x1Var, f3Var, t10);
    }

    @oj.j
    @androidx.annotation.j
    @NotNull
    public static final <T> x1<T> i(@NotNull x1<T> x1Var, @NotNull T t10) {
        return c2.g(x1Var, t10);
    }

    @oj.j
    @androidx.annotation.j
    @NotNull
    public static final <R, T extends R> x1<R> k(@NotNull x1<T> x1Var, @NotNull f3 f3Var, @NotNull Executor executor, @NotNull Function2<? super T, ? super T, ? extends R> function2) {
        return d2.c(x1Var, f3Var, executor, function2);
    }

    @oj.j
    @androidx.annotation.j
    @NotNull
    public static final <R, T extends R> x1<R> m(@NotNull x1<T> x1Var, @NotNull Executor executor, @NotNull Function2<? super T, ? super T, ? extends R> function2) {
        return d2.d(x1Var, executor, function2);
    }

    @androidx.annotation.j
    @NotNull
    public static final <T, R> x1<R> p(@NotNull x1<T> x1Var, @NotNull Executor executor, @NotNull Function1<? super T, ? extends R> function1) {
        return d2.f(x1Var, executor, function1);
    }

    @NotNull
    public static final <T, R> x1<R> r(@NotNull x1<T> x1Var, @NotNull Function2<? super g1<T>, ? super kotlin.coroutines.d<? super g1<R>>, ? extends Object> function2) {
        return c2.l(x1Var, function2);
    }
}
