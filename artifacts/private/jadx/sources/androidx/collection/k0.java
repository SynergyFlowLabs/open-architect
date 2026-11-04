package androidx.collection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nIntObjectMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntObjectMap.kt\nandroidx/collection/IntObjectMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1017:1\n1#2:1018\n*E\n"})
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final t1 f12324a = new t1(0);

    @NotNull
    public static final <V> j0<V> a(int i10, @NotNull Function1<? super t1<V>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        t1 t1Var = new t1(i10);
        builderAction.invoke(t1Var);
        return t1Var;
    }

    @NotNull
    public static final <V> j0<V> b(@NotNull Function1<? super t1<V>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        t1 t1Var = new t1(0, 1, null);
        builderAction.invoke(t1Var);
        return t1Var;
    }

    @NotNull
    public static final <V> j0<V> c() {
        t1 t1Var = f12324a;
        Intrinsics.checkNotNull(t1Var, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
        return t1Var;
    }

    @NotNull
    public static final <V> j0<V> d() {
        t1 t1Var = f12324a;
        Intrinsics.checkNotNull(t1Var, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        return t1Var;
    }

    @NotNull
    public static final <V> j0<V> e(int i10, V v10) {
        t1 t1Var = new t1(0, 1, null);
        t1Var.j0(i10, v10);
        return t1Var;
    }

    @NotNull
    public static final <V> j0<V> f(int i10, V v10, int i11, V v11) {
        t1 t1Var = new t1(0, 1, null);
        t1Var.j0(i10, v10);
        t1Var.j0(i11, v11);
        return t1Var;
    }

    @NotNull
    public static final <V> j0<V> g(int i10, V v10, int i11, V v11, int i12, V v12) {
        t1 t1Var = new t1(0, 1, null);
        t1Var.j0(i10, v10);
        t1Var.j0(i11, v11);
        t1Var.j0(i12, v12);
        return t1Var;
    }

    @NotNull
    public static final <V> j0<V> h(int i10, V v10, int i11, V v11, int i12, V v12, int i13, V v13) {
        t1 t1Var = new t1(0, 1, null);
        t1Var.j0(i10, v10);
        t1Var.j0(i11, v11);
        t1Var.j0(i12, v12);
        t1Var.j0(i13, v13);
        return t1Var;
    }

    @NotNull
    public static final <V> j0<V> i(int i10, V v10, int i11, V v11, int i12, V v12, int i13, V v13, int i14, V v14) {
        t1 t1Var = new t1(0, 1, null);
        t1Var.j0(i10, v10);
        t1Var.j0(i11, v11);
        t1Var.j0(i12, v12);
        t1Var.j0(i13, v13);
        t1Var.j0(i14, v14);
        return t1Var;
    }

    @NotNull
    public static final <V> t1<V> j() {
        return new t1<>(0, 1, null);
    }

    @NotNull
    public static final <V> t1<V> k(int i10, V v10) {
        t1<V> t1Var = new t1<>(0, 1, null);
        t1Var.j0(i10, v10);
        return t1Var;
    }

    @NotNull
    public static final <V> t1<V> l(int i10, V v10, int i11, V v11) {
        t1<V> t1Var = new t1<>(0, 1, null);
        t1Var.j0(i10, v10);
        t1Var.j0(i11, v11);
        return t1Var;
    }

    @NotNull
    public static final <V> t1<V> m(int i10, V v10, int i11, V v11, int i12, V v12) {
        t1<V> t1Var = new t1<>(0, 1, null);
        t1Var.j0(i10, v10);
        t1Var.j0(i11, v11);
        t1Var.j0(i12, v12);
        return t1Var;
    }

    @NotNull
    public static final <V> t1<V> n(int i10, V v10, int i11, V v11, int i12, V v12, int i13, V v13) {
        t1<V> t1Var = new t1<>(0, 1, null);
        t1Var.j0(i10, v10);
        t1Var.j0(i11, v11);
        t1Var.j0(i12, v12);
        t1Var.j0(i13, v13);
        return t1Var;
    }

    @NotNull
    public static final <V> t1<V> o(int i10, V v10, int i11, V v11, int i12, V v12, int i13, V v13, int i14, V v14) {
        t1<V> t1Var = new t1<>(0, 1, null);
        t1Var.j0(i10, v10);
        t1Var.j0(i11, v11);
        t1Var.j0(i12, v12);
        t1Var.j0(i13, v13);
        t1Var.j0(i14, v14);
        return t1Var;
    }
}
