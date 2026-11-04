package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import java.util.Collection;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class w6 {
    @NotNull
    public static final <T> SnapshotStateList<T> A(@NotNull Collection<? extends T> collection) {
        return d7.l(collection);
    }

    @NotNull
    public static final <K, V> androidx.compose.runtime.snapshots.l0<K, V> B(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        return d7.m(iterable);
    }

    @o
    @NotNull
    public static final <T extends R, R> n7<R> a(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, R r10, @Nullable CoroutineContext coroutineContext, @Nullable c0 c0Var, int i10, int i11) {
        return z6.b(iVar, r10, coroutineContext, c0Var, i10, i11);
    }

    @o
    @NotNull
    public static final <T> n7<T> b(@NotNull kotlinx.coroutines.flow.z0<? extends T> z0Var, @Nullable CoroutineContext coroutineContext, @Nullable c0 c0Var, int i10, int i11) {
        return z6.c(z0Var, coroutineContext, c0Var, i10, i11);
    }

    @NotNull
    public static final androidx.compose.runtime.collection.d<r1> c() {
        return x6.b();
    }

    @androidx.compose.runtime.snapshots.v0
    @NotNull
    public static final <T> n7<T> d(@NotNull u6<T> u6Var, @NotNull Function0<? extends T> function0) {
        return x6.c(u6Var, function0);
    }

    @androidx.compose.runtime.snapshots.v0
    @NotNull
    public static final <T> n7<T> e(@NotNull Function0<? extends T> function0) {
        return x6.d(function0);
    }

    public static final <T> T f(@NotNull n7<? extends T> n7Var, @Nullable Object obj, @NotNull kotlin.reflect.o<?> oVar) {
        return (T) d7.a(n7Var, obj, oVar);
    }

    @androidx.compose.runtime.snapshots.v0
    @NotNull
    public static final <T> SnapshotStateList<T> g() {
        return d7.b();
    }

    @androidx.compose.runtime.snapshots.v0
    @NotNull
    public static final <T> SnapshotStateList<T> h(@NotNull T... tArr) {
        return d7.c(tArr);
    }

    @androidx.compose.runtime.snapshots.v0
    @NotNull
    public static final <K, V> androidx.compose.runtime.snapshots.l0<K, V> i() {
        return d7.d();
    }

    @androidx.compose.runtime.snapshots.v0
    @NotNull
    public static final <K, V> androidx.compose.runtime.snapshots.l0<K, V> j(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        return d7.e(pairArr);
    }

    @androidx.compose.runtime.snapshots.v0
    @NotNull
    public static final <T> n3<T> k(T t10, @NotNull u6<T> u6Var) {
        return d7.f(t10, u6Var);
    }

    @androidx.compose.runtime.snapshots.v0
    @NotNull
    public static final <T> SnapshotStateSet<T> m() {
        return d7.h();
    }

    @androidx.compose.runtime.snapshots.v0
    @NotNull
    public static final <T> SnapshotStateSet<T> n(@NotNull T... tArr) {
        return d7.i(tArr);
    }

    @NotNull
    public static final <T> u6<T> o() {
        return c7.a();
    }

    public static final <R> void p(@NotNull r1 r1Var, @NotNull Function0<? extends R> function0) {
        x6.f(r1Var, function0);
    }

    @o
    @NotNull
    public static final <T> n7<T> q(T t10, @Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull Function2<? super k4<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @Nullable c0 c0Var, int i10) {
        return y6.a(t10, obj, obj2, obj3, function2, c0Var, i10);
    }

    @o
    @NotNull
    public static final <T> n7<T> r(T t10, @Nullable Object obj, @Nullable Object obj2, @NotNull Function2<? super k4<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @Nullable c0 c0Var, int i10) {
        return y6.b(t10, obj, obj2, function2, c0Var, i10);
    }

    @o
    @NotNull
    public static final <T> n7<T> s(T t10, @Nullable Object obj, @NotNull Function2<? super k4<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @Nullable c0 c0Var, int i10) {
        return y6.c(t10, obj, function2, c0Var, i10);
    }

    @o
    @NotNull
    public static final <T> n7<T> t(T t10, @NotNull Function2<? super k4<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @Nullable c0 c0Var, int i10) {
        return y6.d(t10, function2, c0Var, i10);
    }

    @o
    @NotNull
    public static final <T> n7<T> u(T t10, @NotNull Object[] objArr, @NotNull Function2<? super k4<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @Nullable c0 c0Var, int i10) {
        return y6.e(t10, objArr, function2, c0Var, i10);
    }

    @NotNull
    public static final <T> u6<T> v() {
        return c7.b();
    }

    @o
    @NotNull
    public static final <T> n7<T> w(T t10, @Nullable c0 c0Var, int i10) {
        return d7.j(t10, c0Var, i10);
    }

    public static final <T> void x(@NotNull n3<T> n3Var, @Nullable Object obj, @NotNull kotlin.reflect.o<?> oVar, T t10) {
        d7.k(n3Var, obj, oVar, t10);
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> y(@NotNull Function0<? extends T> function0) {
        return z6.e(function0);
    }

    @NotNull
    public static final <T> u6<T> z() {
        return c7.c();
    }
}
