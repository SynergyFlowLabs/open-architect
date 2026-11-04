package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import java.util.Collection;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,337:1\n1#2:338\n1282#3,6:339\n*S KotlinDebug\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n336#1:339,6\n*E\n"})
final /* synthetic */ class d7 {
    public static final <T> T a(@NotNull n7<? extends T> n7Var, @Nullable Object obj, @NotNull kotlin.reflect.o<?> oVar) {
        return n7Var.getValue();
    }

    @androidx.compose.runtime.snapshots.v0
    @NotNull
    public static final <T> SnapshotStateList<T> b() {
        return new SnapshotStateList<>();
    }

    @androidx.compose.runtime.snapshots.v0
    @NotNull
    public static final <T> SnapshotStateList<T> c(@NotNull T... tArr) {
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(ArraysKt.toList(tArr));
        return snapshotStateList;
    }

    @androidx.compose.runtime.snapshots.v0
    @NotNull
    public static final <K, V> androidx.compose.runtime.snapshots.l0<K, V> d() {
        return new androidx.compose.runtime.snapshots.l0<>();
    }

    @androidx.compose.runtime.snapshots.v0
    @NotNull
    public static final <K, V> androidx.compose.runtime.snapshots.l0<K, V> e(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        androidx.compose.runtime.snapshots.l0<K, V> l0Var = new androidx.compose.runtime.snapshots.l0<>();
        l0Var.putAll(MapsKt.toMap(pairArr));
        return l0Var;
    }

    @androidx.compose.runtime.snapshots.v0
    @NotNull
    public static final <T> n3<T> f(T t10, @NotNull u6<T> u6Var) {
        return e7.a(t10, u6Var);
    }

    public static /* synthetic */ n3 g(Object obj, u6 u6Var, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            u6Var = w6.z();
        }
        return w6.k(obj, u6Var);
    }

    @androidx.compose.runtime.snapshots.v0
    @NotNull
    public static final <T> SnapshotStateSet<T> h() {
        return new SnapshotStateSet<>();
    }

    @androidx.compose.runtime.snapshots.v0
    @NotNull
    public static final <T> SnapshotStateSet<T> i(@NotNull T... tArr) {
        SnapshotStateSet<T> snapshotStateSet = new SnapshotStateSet<>();
        snapshotStateSet.addAll(ArraysKt.toSet(tArr));
        return snapshotStateSet;
    }

    @o
    @NotNull
    public static final <T> n7<T> j(T t10, @Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(-1058319986, i10, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:335)");
        }
        Object objI0 = c0Var.i0();
        if (objI0 == c0.f35327a.a()) {
            objI0 = g(t10, null, 2, null);
            c0Var.Y(objI0);
        }
        n3 n3Var = (n3) objI0;
        n3Var.setValue(t10);
        if (m0.l0()) {
            m0.z0();
        }
        return n3Var;
    }

    public static final <T> void k(@NotNull n3<T> n3Var, @Nullable Object obj, @NotNull kotlin.reflect.o<?> oVar, T t10) {
        n3Var.setValue(t10);
    }

    @NotNull
    public static final <T> SnapshotStateList<T> l(@NotNull Collection<? extends T> collection) {
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(collection);
        return snapshotStateList;
    }

    @NotNull
    public static final <K, V> androidx.compose.runtime.snapshots.l0<K, V> m(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        androidx.compose.runtime.snapshots.l0<K, V> l0Var = new androidx.compose.runtime.snapshots.l0<>();
        l0Var.putAll(MapsKt.toMap(iterable));
        return l0Var;
    }
}
