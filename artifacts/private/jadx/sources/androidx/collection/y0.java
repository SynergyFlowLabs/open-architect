package androidx.collection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLongObjectMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongObjectMap.kt\nandroidx/collection/LongObjectMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1017:1\n1#2:1018\n*E\n"})
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final a2 f12518a = new a2(0);

    @NotNull
    public static final <V> x0<V> a(int i10, @NotNull Function1<? super a2<V>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        a2 a2Var = new a2(i10);
        builderAction.invoke(a2Var);
        return a2Var;
    }

    @NotNull
    public static final <V> x0<V> b(@NotNull Function1<? super a2<V>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        a2 a2Var = new a2(0, 1, null);
        builderAction.invoke(a2Var);
        return a2Var;
    }

    @NotNull
    public static final <V> x0<V> c() {
        a2 a2Var = f12518a;
        Intrinsics.checkNotNull(a2Var, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        return a2Var;
    }

    @NotNull
    public static final <V> x0<V> d() {
        a2 a2Var = f12518a;
        Intrinsics.checkNotNull(a2Var, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.longObjectMapOf>");
        return a2Var;
    }

    @NotNull
    public static final <V> x0<V> e(long j10, V v10) {
        a2 a2Var = new a2(0, 1, null);
        a2Var.j0(j10, v10);
        return a2Var;
    }

    @NotNull
    public static final <V> x0<V> f(long j10, V v10, long j11, V v11) {
        a2 a2Var = new a2(0, 1, null);
        a2Var.j0(j10, v10);
        a2Var.j0(j11, v11);
        return a2Var;
    }

    @NotNull
    public static final <V> x0<V> g(long j10, V v10, long j11, V v11, long j12, V v12) {
        a2 a2Var = new a2(0, 1, null);
        a2Var.j0(j10, v10);
        a2Var.j0(j11, v11);
        a2Var.j0(j12, v12);
        return a2Var;
    }

    @NotNull
    public static final <V> x0<V> h(long j10, V v10, long j11, V v11, long j12, V v12, long j13, V v13) {
        a2 a2Var = new a2(0, 1, null);
        a2Var.j0(j10, v10);
        a2Var.j0(j11, v11);
        a2Var.j0(j12, v12);
        a2Var.j0(j13, v13);
        return a2Var;
    }

    @NotNull
    public static final <V> x0<V> i(long j10, V v10, long j11, V v11, long j12, V v12, long j13, V v13, long j14, V v14) {
        a2 a2Var = new a2(0, 1, null);
        a2Var.j0(j10, v10);
        a2Var.j0(j11, v11);
        a2Var.j0(j12, v12);
        a2Var.j0(j13, v13);
        a2Var.j0(j14, v14);
        return a2Var;
    }

    @NotNull
    public static final <V> a2<V> j() {
        return new a2<>(0, 1, null);
    }

    @NotNull
    public static final <V> a2<V> k(long j10, V v10) {
        a2<V> a2Var = new a2<>(0, 1, null);
        a2Var.j0(j10, v10);
        return a2Var;
    }

    @NotNull
    public static final <V> a2<V> l(long j10, V v10, long j11, V v11) {
        a2<V> a2Var = new a2<>(0, 1, null);
        a2Var.j0(j10, v10);
        a2Var.j0(j11, v11);
        return a2Var;
    }

    @NotNull
    public static final <V> a2<V> m(long j10, V v10, long j11, V v11, long j12, V v12) {
        int i10 = 2 | 0;
        a2<V> a2Var = new a2<>(0, 1, null);
        a2Var.j0(j10, v10);
        a2Var.j0(j11, v11);
        a2Var.j0(j12, v12);
        return a2Var;
    }

    @NotNull
    public static final <V> a2<V> n(long j10, V v10, long j11, V v11, long j12, V v12, long j13, V v13) {
        a2<V> a2Var = new a2<>(0, 1, null);
        a2Var.j0(j10, v10);
        a2Var.j0(j11, v11);
        a2Var.j0(j12, v12);
        a2Var.j0(j13, v13);
        return a2Var;
    }

    @NotNull
    public static final <V> a2<V> o(long j10, V v10, long j11, V v11, long j12, V v12, long j13, V v13, long j14, V v14) {
        a2<V> a2Var = new a2<>(0, 1, null);
        a2Var.j0(j10, v10);
        a2Var.j0(j11, v11);
        a2Var.j0(j12, v12);
        a2Var.j0(j13, v13);
        a2Var.j0(j14, v14);
        return a2Var;
    }
}
