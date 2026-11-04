package androidx.collection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nObjectIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectIntMap.kt\nandroidx/collection/ObjectIntMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1051:1\n1#2:1052\n*E\n"})
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final f2<Object> f12444a = new f2<>(0);

    @NotNull
    public static final <K> q2<K> a(int i10, @NotNull Function1<? super f2<K>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        f2 f2Var = new f2(i10);
        builderAction.invoke(f2Var);
        return f2Var;
    }

    @NotNull
    public static final <K> q2<K> b(@NotNull Function1<? super f2<K>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        f2 f2Var = new f2(0, 1, null);
        builderAction.invoke(f2Var);
        return f2Var;
    }

    @NotNull
    public static final <K> q2<K> c() {
        f2<Object> f2Var = f12444a;
        Intrinsics.checkNotNull(f2Var, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        return f2Var;
    }

    @NotNull
    public static final <K> f2<K> d() {
        return new f2<>(0, 1, null);
    }

    @NotNull
    public static final <K> f2<K> e(K k10, int i10) {
        f2<K> f2Var = new f2<>(0, 1, null);
        f2Var.l0(k10, i10);
        return f2Var;
    }

    @NotNull
    public static final <K> f2<K> f(K k10, int i10, K k11, int i11) {
        f2<K> f2Var = new f2<>(0, 1, null);
        f2Var.l0(k10, i10);
        f2Var.l0(k11, i11);
        return f2Var;
    }

    @NotNull
    public static final <K> f2<K> g(K k10, int i10, K k11, int i11, K k12, int i12) {
        f2<K> f2Var = new f2<>(0, 1, null);
        f2Var.l0(k10, i10);
        f2Var.l0(k11, i11);
        f2Var.l0(k12, i12);
        return f2Var;
    }

    @NotNull
    public static final <K> f2<K> h(K k10, int i10, K k11, int i11, K k12, int i12, K k13, int i13) {
        f2<K> f2Var = new f2<>(0, 1, null);
        f2Var.l0(k10, i10);
        f2Var.l0(k11, i11);
        f2Var.l0(k12, i12);
        f2Var.l0(k13, i13);
        return f2Var;
    }

    @NotNull
    public static final <K> f2<K> i(K k10, int i10, K k11, int i11, K k12, int i12, K k13, int i13, K k14, int i14) {
        f2<K> f2Var = new f2<>(0, 1, null);
        f2Var.l0(k10, i10);
        f2Var.l0(k11, i11);
        f2Var.l0(k12, i12);
        f2Var.l0(k13, i13);
        f2Var.l0(k14, i14);
        return f2Var;
    }

    @NotNull
    public static final <K> q2<K> j() {
        f2<Object> f2Var = f12444a;
        Intrinsics.checkNotNull(f2Var, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.objectIntMap>");
        return f2Var;
    }

    @NotNull
    public static final <K> q2<K> k(K k10, int i10) {
        f2 f2Var = new f2(0, 1, null);
        f2Var.l0(k10, i10);
        return f2Var;
    }

    @NotNull
    public static final <K> q2<K> l(K k10, int i10, K k11, int i11) {
        int i12 = 4 ^ 0;
        f2 f2Var = new f2(0, 1, null);
        f2Var.l0(k10, i10);
        f2Var.l0(k11, i11);
        return f2Var;
    }

    @NotNull
    public static final <K> q2<K> m(K k10, int i10, K k11, int i11, K k12, int i12) {
        f2 f2Var = new f2(0, 1, null);
        f2Var.l0(k10, i10);
        f2Var.l0(k11, i11);
        f2Var.l0(k12, i12);
        return f2Var;
    }

    @NotNull
    public static final <K> q2<K> n(K k10, int i10, K k11, int i11, K k12, int i12, K k13, int i13) {
        f2 f2Var = new f2(0, 1, null);
        f2Var.l0(k10, i10);
        f2Var.l0(k11, i11);
        f2Var.l0(k12, i12);
        f2Var.l0(k13, i13);
        return f2Var;
    }

    @NotNull
    public static final <K> q2<K> o(K k10, int i10, K k11, int i11, K k12, int i12, K k13, int i13, K k14, int i14) {
        f2 f2Var = new f2(0, 1, null);
        f2Var.l0(k10, i10);
        f2Var.l0(k11, i11);
        f2Var.l0(k12, i12);
        f2Var.l0(k13, i13);
        f2Var.l0(k14, i14);
        return f2Var;
    }
}
