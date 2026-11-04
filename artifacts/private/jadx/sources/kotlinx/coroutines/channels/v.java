package kotlinx.coroutines.channels;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.a1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.f3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f313899a = "Channel was closed";

    @a1
    @NotNull
    public static final <E, R> n0<R> J(@NotNull n0<? extends E> n0Var, @NotNull CoroutineContext coroutineContext, @NotNull Function2<? super E, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2) {
        return b0.M(n0Var, coroutineContext, function2);
    }

    @a1
    @NotNull
    public static final <E, R> n0<R> L(@NotNull n0<? extends E> n0Var, @NotNull CoroutineContext coroutineContext, @NotNull pj.n<? super Integer, ? super E, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar) {
        return b0.O(n0Var, coroutineContext, nVar);
    }

    @a1
    public static final void b(@NotNull n0<?> n0Var, @Nullable Throwable th2) {
        x.a(n0Var, th2);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @f3
    public static final <E, R> R c(@NotNull d<E> dVar, @NotNull Function1<? super n0<? extends E>, ? extends R> function1) {
        return (R) b0.e(dVar, function1);
    }

    public static final <E, R> R d(@NotNull n0<? extends E> n0Var, @NotNull Function1<? super n0<? extends E>, ? extends R> function1) {
        return (R) x.b(n0Var, function1);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @Nullable
    public static final <E> Object e(@NotNull d<E> dVar, @NotNull Function1<? super E, Unit> function1, @NotNull kotlin.coroutines.d<? super Unit> dVar2) {
        return b0.f(dVar, function1, dVar2);
    }

    @a1
    @Nullable
    public static final <E, C extends o0<? super E>> Object e0(@NotNull n0<? extends E> n0Var, @NotNull C c10, @NotNull kotlin.coroutines.d<? super C> dVar) {
        return b0.e0(n0Var, c10, dVar);
    }

    @Nullable
    public static final <E> Object f(@NotNull n0<? extends E> n0Var, @NotNull Function1<? super E, Unit> function1, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return x.c(n0Var, function1, dVar);
    }

    @a1
    @Nullable
    public static final <E, C extends Collection<? super E>> Object f0(@NotNull n0<? extends E> n0Var, @NotNull C c10, @NotNull kotlin.coroutines.d<? super C> dVar) {
        return b0.f0(n0Var, c10, dVar);
    }

    @a1
    @NotNull
    public static final Function1<Throwable, Unit> g(@NotNull n0<?> n0Var) {
        return b0.h(n0Var);
    }

    @Nullable
    public static final <E> Object g0(@NotNull n0<? extends E> n0Var, @NotNull kotlin.coroutines.d<? super List<? extends E>> dVar) {
        return x.g(n0Var, dVar);
    }

    @a1
    @NotNull
    public static final Function1<Throwable, Unit> h(@NotNull n0<?>... n0VarArr) {
        return b0.j(n0VarArr);
    }

    @a1
    @Nullable
    public static final <K, V, M extends Map<? super K, ? super V>> Object h0(@NotNull n0<? extends Pair<? extends K, ? extends V>> n0Var, @NotNull M m10, @NotNull kotlin.coroutines.d<? super M> dVar) {
        return b0.g0(n0Var, m10, dVar);
    }

    @a1
    @NotNull
    public static final <E, K> n0<E> k(@NotNull n0<? extends E> n0Var, @NotNull CoroutineContext coroutineContext, @NotNull Function2<? super E, ? super kotlin.coroutines.d<? super K>, ? extends Object> function2) {
        return b0.n(n0Var, coroutineContext, function2);
    }

    @a1
    @Nullable
    public static final <E> Object k0(@NotNull n0<? extends E> n0Var, @NotNull kotlin.coroutines.d<? super Set<E>> dVar) {
        return b0.j0(n0Var, dVar);
    }

    @NotNull
    public static final <E> Object m0(@NotNull o0<? super E> o0Var, E e10) {
        return w.b(o0Var, e10);
    }

    @a1
    @NotNull
    public static final <E, R, V> n0<V> q0(@NotNull n0<? extends E> n0Var, @NotNull n0<? extends R> n0Var2, @NotNull CoroutineContext coroutineContext, @NotNull Function2<? super E, ? super R, ? extends V> function2) {
        return b0.o0(n0Var, n0Var2, coroutineContext, function2);
    }

    @a1
    @NotNull
    public static final <E> n0<E> s(@NotNull n0<? extends E> n0Var, @NotNull CoroutineContext coroutineContext, @NotNull Function2<? super E, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2) {
        return b0.v(n0Var, coroutineContext, function2);
    }

    @a1
    @NotNull
    public static final <E> n0<E> y(@NotNull n0<? extends E> n0Var) {
        return b0.B(n0Var);
    }
}
