package androidx.collection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFloatIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatIntMap.kt\nandroidx/collection/FloatIntMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1034:1\n1#2:1035\n*E\n"})
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final k1 f12429a = new k1(0);

    @NotNull
    public static final p a(int i10, @NotNull Function1<? super k1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        k1 k1Var = new k1(i10);
        builderAction.invoke(k1Var);
        return k1Var;
    }

    @NotNull
    public static final p b(@NotNull Function1<? super k1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        k1 k1Var = new k1(0, 1, null);
        builderAction.invoke(k1Var);
        return k1Var;
    }

    @NotNull
    public static final p c() {
        return f12429a;
    }

    @NotNull
    public static final p d() {
        return f12429a;
    }

    @NotNull
    public static final p e(float f10, int i10) {
        k1 k1Var = new k1(0, 1, null);
        k1Var.k0(f10, i10);
        return k1Var;
    }

    @NotNull
    public static final p f(float f10, int i10, float f11, int i11) {
        k1 k1Var = new k1(0, 1, null);
        k1Var.k0(f10, i10);
        k1Var.k0(f11, i11);
        return k1Var;
    }

    @NotNull
    public static final p g(float f10, int i10, float f11, int i11, float f12, int i12) {
        k1 k1Var = new k1(0, 1, null);
        k1Var.k0(f10, i10);
        k1Var.k0(f11, i11);
        k1Var.k0(f12, i12);
        return k1Var;
    }

    @NotNull
    public static final p h(float f10, int i10, float f11, int i11, float f12, int i12, float f13, int i13) {
        k1 k1Var = new k1(0, 1, null);
        k1Var.k0(f10, i10);
        k1Var.k0(f11, i11);
        k1Var.k0(f12, i12);
        k1Var.k0(f13, i13);
        return k1Var;
    }

    @NotNull
    public static final p i(float f10, int i10, float f11, int i11, float f12, int i12, float f13, int i13, float f14, int i14) {
        int i15 = 4 & 0;
        k1 k1Var = new k1(0, 1, null);
        k1Var.k0(f10, i10);
        k1Var.k0(f11, i11);
        k1Var.k0(f12, i12);
        k1Var.k0(f13, i13);
        k1Var.k0(f14, i14);
        return k1Var;
    }

    @NotNull
    public static final k1 j() {
        return new k1(0, 1, null);
    }

    @NotNull
    public static final k1 k(float f10, int i10) {
        k1 k1Var = new k1(0, 1, null);
        k1Var.k0(f10, i10);
        return k1Var;
    }

    @NotNull
    public static final k1 l(float f10, int i10, float f11, int i11) {
        k1 k1Var = new k1(0, 1, null);
        k1Var.k0(f10, i10);
        k1Var.k0(f11, i11);
        return k1Var;
    }

    @NotNull
    public static final k1 m(float f10, int i10, float f11, int i11, float f12, int i12) {
        k1 k1Var = new k1(0, 1, null);
        k1Var.k0(f10, i10);
        k1Var.k0(f11, i11);
        k1Var.k0(f12, i12);
        return k1Var;
    }

    @NotNull
    public static final k1 n(float f10, int i10, float f11, int i11, float f12, int i12, float f13, int i13) {
        k1 k1Var = new k1(0, 1, null);
        k1Var.k0(f10, i10);
        k1Var.k0(f11, i11);
        k1Var.k0(f12, i12);
        k1Var.k0(f13, i13);
        return k1Var;
    }

    @NotNull
    public static final k1 o(float f10, int i10, float f11, int i11, float f12, int i12, float f13, int i13, float f14, int i14) {
        k1 k1Var = new k1(0, 1, null);
        k1Var.k0(f10, i10);
        k1Var.k0(f11, i11);
        k1Var.k0(f12, i12);
        k1Var.k0(f13, i13);
        k1Var.k0(f14, i14);
        return k1Var;
    }
}
