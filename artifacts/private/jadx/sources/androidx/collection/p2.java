package androidx.collection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nObjectFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectFloatMap.kt\nandroidx/collection/ObjectFloatMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1051:1\n1#2:1052\n*E\n"})
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final e2<Object> f12428a = new e2<>(0);

    @NotNull
    public static final <K> o2<K> a(int i10, @NotNull Function1<? super e2<K>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        e2 e2Var = new e2(i10);
        builderAction.invoke(e2Var);
        return e2Var;
    }

    @NotNull
    public static final <K> o2<K> b(@NotNull Function1<? super e2<K>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        e2 e2Var = new e2(0, 1, null);
        builderAction.invoke(e2Var);
        return e2Var;
    }

    @NotNull
    public static final <K> o2<K> c() {
        e2<Object> e2Var = f12428a;
        Intrinsics.checkNotNull(e2Var, "null cannot be cast to non-null type androidx.collection.ObjectFloatMap<K of androidx.collection.ObjectFloatMapKt.emptyObjectFloatMap>");
        return e2Var;
    }

    @NotNull
    public static final <K> e2<K> d() {
        return new e2<>(0, 1, null);
    }

    @NotNull
    public static final <K> e2<K> e(K k10, float f10) {
        e2<K> e2Var = new e2<>(0, 1, null);
        e2Var.l0(k10, f10);
        return e2Var;
    }

    @NotNull
    public static final <K> e2<K> f(K k10, float f10, K k11, float f11) {
        e2<K> e2Var = new e2<>(0, 1, null);
        e2Var.l0(k10, f10);
        e2Var.l0(k11, f11);
        return e2Var;
    }

    @NotNull
    public static final <K> e2<K> g(K k10, float f10, K k11, float f11, K k12, float f12) {
        e2<K> e2Var = new e2<>(0, 1, null);
        e2Var.l0(k10, f10);
        e2Var.l0(k11, f11);
        e2Var.l0(k12, f12);
        return e2Var;
    }

    @NotNull
    public static final <K> e2<K> h(K k10, float f10, K k11, float f11, K k12, float f12, K k13, float f13) {
        e2<K> e2Var = new e2<>(0, 1, null);
        e2Var.l0(k10, f10);
        e2Var.l0(k11, f11);
        e2Var.l0(k12, f12);
        e2Var.l0(k13, f13);
        return e2Var;
    }

    @NotNull
    public static final <K> e2<K> i(K k10, float f10, K k11, float f11, K k12, float f12, K k13, float f13, K k14, float f14) {
        e2<K> e2Var = new e2<>(0, 1, null);
        e2Var.l0(k10, f10);
        e2Var.l0(k11, f11);
        e2Var.l0(k12, f12);
        e2Var.l0(k13, f13);
        e2Var.l0(k14, f14);
        return e2Var;
    }

    @NotNull
    public static final <K> o2<K> j() {
        e2<Object> e2Var = f12428a;
        Intrinsics.checkNotNull(e2Var, "null cannot be cast to non-null type androidx.collection.ObjectFloatMap<K of androidx.collection.ObjectFloatMapKt.objectFloatMap>");
        return e2Var;
    }

    @NotNull
    public static final <K> o2<K> k(K k10, float f10) {
        e2 e2Var = new e2(0, 1, null);
        e2Var.l0(k10, f10);
        return e2Var;
    }

    @NotNull
    public static final <K> o2<K> l(K k10, float f10, K k11, float f11) {
        e2 e2Var = new e2(0, 1, null);
        e2Var.l0(k10, f10);
        e2Var.l0(k11, f11);
        return e2Var;
    }

    @NotNull
    public static final <K> o2<K> m(K k10, float f10, K k11, float f11, K k12, float f12) {
        e2 e2Var = new e2(0, 1, null);
        e2Var.l0(k10, f10);
        e2Var.l0(k11, f11);
        e2Var.l0(k12, f12);
        return e2Var;
    }

    @NotNull
    public static final <K> o2<K> n(K k10, float f10, K k11, float f11, K k12, float f12, K k13, float f13) {
        e2 e2Var = new e2(0, 1, null);
        e2Var.l0(k10, f10);
        e2Var.l0(k11, f11);
        e2Var.l0(k12, f12);
        e2Var.l0(k13, f13);
        return e2Var;
    }

    @NotNull
    public static final <K> o2<K> o(K k10, float f10, K k11, float f11, K k12, float f12, K k13, float f13, K k14, float f14) {
        e2 e2Var = new e2(0, 1, null);
        e2Var.l0(k10, f10);
        e2Var.l0(k11, f11);
        e2Var.l0(k12, f12);
        e2Var.l0(k13, f13);
        e2Var.l0(k14, f14);
        return e2Var;
    }
}
