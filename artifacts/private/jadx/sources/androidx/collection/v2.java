package androidx.collection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nObjectLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectLongMap.kt\nandroidx/collection/ObjectLongMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1051:1\n1#2:1052\n*E\n"})
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final h2<Object> f12492a = new h2<>(0);

    @NotNull
    public static final <K> u2<K> a(int i10, @NotNull Function1<? super h2<K>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        h2 h2Var = new h2(i10);
        builderAction.invoke(h2Var);
        return h2Var;
    }

    @NotNull
    public static final <K> u2<K> b(@NotNull Function1<? super h2<K>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        h2 h2Var = new h2(0, 1, null);
        builderAction.invoke(h2Var);
        return h2Var;
    }

    @NotNull
    public static final <K> u2<K> c() {
        h2<Object> h2Var = f12492a;
        Intrinsics.checkNotNull(h2Var, "null cannot be cast to non-null type androidx.collection.ObjectLongMap<K of androidx.collection.ObjectLongMapKt.emptyObjectLongMap>");
        return h2Var;
    }

    @NotNull
    public static final <K> h2<K> d() {
        return new h2<>(0, 1, null);
    }

    @NotNull
    public static final <K> h2<K> e(K k10, long j10) {
        h2<K> h2Var = new h2<>(0, 1, null);
        h2Var.l0(k10, j10);
        return h2Var;
    }

    @NotNull
    public static final <K> h2<K> f(K k10, long j10, K k11, long j11) {
        h2<K> h2Var = new h2<>(0, 1, null);
        h2Var.l0(k10, j10);
        h2Var.l0(k11, j11);
        return h2Var;
    }

    @NotNull
    public static final <K> h2<K> g(K k10, long j10, K k11, long j11, K k12, long j12) {
        h2<K> h2Var = new h2<>(0, 1, null);
        h2Var.l0(k10, j10);
        h2Var.l0(k11, j11);
        h2Var.l0(k12, j12);
        return h2Var;
    }

    @NotNull
    public static final <K> h2<K> h(K k10, long j10, K k11, long j11, K k12, long j12, K k13, long j13) {
        h2<K> h2Var = new h2<>(0, 1, null);
        h2Var.l0(k10, j10);
        h2Var.l0(k11, j11);
        h2Var.l0(k12, j12);
        h2Var.l0(k13, j13);
        return h2Var;
    }

    @NotNull
    public static final <K> h2<K> i(K k10, long j10, K k11, long j11, K k12, long j12, K k13, long j13, K k14, long j14) {
        h2<K> h2Var = new h2<>(0, 1, null);
        h2Var.l0(k10, j10);
        h2Var.l0(k11, j11);
        h2Var.l0(k12, j12);
        h2Var.l0(k13, j13);
        h2Var.l0(k14, j14);
        return h2Var;
    }

    @NotNull
    public static final <K> u2<K> j() {
        h2<Object> h2Var = f12492a;
        Intrinsics.checkNotNull(h2Var, "null cannot be cast to non-null type androidx.collection.ObjectLongMap<K of androidx.collection.ObjectLongMapKt.objectLongMap>");
        return h2Var;
    }

    @NotNull
    public static final <K> u2<K> k(K k10, long j10) {
        h2 h2Var = new h2(0, 1, null);
        h2Var.l0(k10, j10);
        return h2Var;
    }

    @NotNull
    public static final <K> u2<K> l(K k10, long j10, K k11, long j11) {
        boolean z10 = false | false;
        h2 h2Var = new h2(0, 1, null);
        h2Var.l0(k10, j10);
        h2Var.l0(k11, j11);
        return h2Var;
    }

    @NotNull
    public static final <K> u2<K> m(K k10, long j10, K k11, long j11, K k12, long j12) {
        h2 h2Var = new h2(0, 1, null);
        h2Var.l0(k10, j10);
        h2Var.l0(k11, j11);
        h2Var.l0(k12, j12);
        return h2Var;
    }

    @NotNull
    public static final <K> u2<K> n(K k10, long j10, K k11, long j11, K k12, long j12, K k13, long j13) {
        h2 h2Var = new h2(0, 1, null);
        h2Var.l0(k10, j10);
        h2Var.l0(k11, j11);
        h2Var.l0(k12, j12);
        h2Var.l0(k13, j13);
        return h2Var;
    }

    @NotNull
    public static final <K> u2<K> o(K k10, long j10, K k11, long j11, K k12, long j12, K k13, long j13, K k14, long j14) {
        h2 h2Var = new h2(0, 1, null);
        h2Var.l0(k10, j10);
        h2Var.l0(k11, j11);
        h2Var.l0(k12, j12);
        h2Var.l0(k13, j13);
        h2Var.l0(k14, j14);
        return h2Var;
    }
}
