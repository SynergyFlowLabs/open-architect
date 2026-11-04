package androidx.collection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFloatObjectMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatObjectMap.kt\nandroidx/collection/FloatObjectMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1017:1\n1#2:1018\n*E\n"})
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final n1 f12493a = new n1(0);

    @NotNull
    public static final <V> v<V> a(int i10, @NotNull Function1<? super n1<V>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        n1 n1Var = new n1(i10);
        builderAction.invoke(n1Var);
        return n1Var;
    }

    @NotNull
    public static final <V> v<V> b(@NotNull Function1<? super n1<V>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        n1 n1Var = new n1(0, 1, null);
        builderAction.invoke(n1Var);
        return n1Var;
    }

    @NotNull
    public static final <V> v<V> c() {
        n1 n1Var = f12493a;
        Intrinsics.checkNotNull(n1Var, "null cannot be cast to non-null type androidx.collection.FloatObjectMap<V of androidx.collection.FloatObjectMapKt.emptyFloatObjectMap>");
        return n1Var;
    }

    @NotNull
    public static final <V> v<V> d() {
        n1 n1Var = f12493a;
        Intrinsics.checkNotNull(n1Var, "null cannot be cast to non-null type androidx.collection.FloatObjectMap<V of androidx.collection.FloatObjectMapKt.floatObjectMapOf>");
        return n1Var;
    }

    @NotNull
    public static final <V> v<V> e(float f10, V v10) {
        n1 n1Var = new n1(0, 1, null);
        n1Var.j0(f10, v10);
        return n1Var;
    }

    @NotNull
    public static final <V> v<V> f(float f10, V v10, float f11, V v11) {
        n1 n1Var = new n1(0, 1, null);
        n1Var.j0(f10, v10);
        n1Var.j0(f11, v11);
        return n1Var;
    }

    @NotNull
    public static final <V> v<V> g(float f10, V v10, float f11, V v11, float f12, V v12) {
        n1 n1Var = new n1(0, 1, null);
        n1Var.j0(f10, v10);
        n1Var.j0(f11, v11);
        n1Var.j0(f12, v12);
        return n1Var;
    }

    @NotNull
    public static final <V> v<V> h(float f10, V v10, float f11, V v11, float f12, V v12, float f13, V v13) {
        n1 n1Var = new n1(0, 1, null);
        n1Var.j0(f10, v10);
        n1Var.j0(f11, v11);
        n1Var.j0(f12, v12);
        n1Var.j0(f13, v13);
        return n1Var;
    }

    @NotNull
    public static final <V> v<V> i(float f10, V v10, float f11, V v11, float f12, V v12, float f13, V v13, float f14, V v14) {
        n1 n1Var = new n1(0, 1, null);
        n1Var.j0(f10, v10);
        n1Var.j0(f11, v11);
        n1Var.j0(f12, v12);
        n1Var.j0(f13, v13);
        n1Var.j0(f14, v14);
        return n1Var;
    }

    @NotNull
    public static final <V> n1<V> j() {
        return new n1<>(0, 1, null);
    }

    @NotNull
    public static final <V> n1<V> k(float f10, V v10) {
        n1<V> n1Var = new n1<>(0, 1, null);
        n1Var.j0(f10, v10);
        return n1Var;
    }

    @NotNull
    public static final <V> n1<V> l(float f10, V v10, float f11, V v11) {
        n1<V> n1Var = new n1<>(0, 1, null);
        n1Var.j0(f10, v10);
        n1Var.j0(f11, v11);
        return n1Var;
    }

    @NotNull
    public static final <V> n1<V> m(float f10, V v10, float f11, V v11, float f12, V v12) {
        n1<V> n1Var = new n1<>(0, 1, null);
        n1Var.j0(f10, v10);
        n1Var.j0(f11, v11);
        n1Var.j0(f12, v12);
        return n1Var;
    }

    @NotNull
    public static final <V> n1<V> n(float f10, V v10, float f11, V v11, float f12, V v12, float f13, V v13) {
        n1<V> n1Var = new n1<>(0, 1, null);
        n1Var.j0(f10, v10);
        n1Var.j0(f11, v11);
        n1Var.j0(f12, v12);
        n1Var.j0(f13, v13);
        return n1Var;
    }

    @NotNull
    public static final <V> n1<V> o(float f10, V v10, float f11, V v11, float f12, V v12, float f13, V v13, float f14, V v14) {
        n1<V> n1Var = new n1<>(0, 1, null);
        n1Var.j0(f10, v10);
        n1Var.j0(f11, v11);
        n1Var.j0(f12, v12);
        n1Var.j0(f13, v13);
        n1Var.j0(f14, v14);
        return n1Var;
    }
}
