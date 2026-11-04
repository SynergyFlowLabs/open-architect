package androidx.collection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nIntFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntFloatMap.kt\nandroidx/collection/IntFloatMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1034:1\n1#2:1035\n*E\n"})
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final p1 f12135a = new p1(0);

    @NotNull
    public static final a0 a(int i10, @NotNull Function1<? super p1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        p1 p1Var = new p1(i10);
        builderAction.invoke(p1Var);
        return p1Var;
    }

    @NotNull
    public static final a0 b(@NotNull Function1<? super p1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        p1 p1Var = new p1(0, 1, null);
        builderAction.invoke(p1Var);
        return p1Var;
    }

    @NotNull
    public static final a0 c() {
        return f12135a;
    }

    @NotNull
    public static final a0 d() {
        return f12135a;
    }

    @NotNull
    public static final a0 e(int i10, float f10) {
        p1 p1Var = new p1(0, 1, null);
        p1Var.k0(i10, f10);
        return p1Var;
    }

    @NotNull
    public static final a0 f(int i10, float f10, int i11, float f11) {
        p1 p1Var = new p1(0, 1, null);
        p1Var.k0(i10, f10);
        p1Var.k0(i11, f11);
        return p1Var;
    }

    @NotNull
    public static final a0 g(int i10, float f10, int i11, float f11, int i12, float f12) {
        p1 p1Var = new p1(0, 1, null);
        p1Var.k0(i10, f10);
        p1Var.k0(i11, f11);
        p1Var.k0(i12, f12);
        return p1Var;
    }

    @NotNull
    public static final a0 h(int i10, float f10, int i11, float f11, int i12, float f12, int i13, float f13) {
        p1 p1Var = new p1(0, 1, null);
        p1Var.k0(i10, f10);
        p1Var.k0(i11, f11);
        p1Var.k0(i12, f12);
        p1Var.k0(i13, f13);
        return p1Var;
    }

    @NotNull
    public static final a0 i(int i10, float f10, int i11, float f11, int i12, float f12, int i13, float f13, int i14, float f14) {
        p1 p1Var = new p1(0, 1, null);
        p1Var.k0(i10, f10);
        p1Var.k0(i11, f11);
        p1Var.k0(i12, f12);
        p1Var.k0(i13, f13);
        p1Var.k0(i14, f14);
        return p1Var;
    }

    @NotNull
    public static final p1 j() {
        boolean z10 = true | false;
        return new p1(0, 1, null);
    }

    @NotNull
    public static final p1 k(int i10, float f10) {
        p1 p1Var = new p1(0, 1, null);
        p1Var.k0(i10, f10);
        return p1Var;
    }

    @NotNull
    public static final p1 l(int i10, float f10, int i11, float f11) {
        p1 p1Var = new p1(0, 1, null);
        p1Var.k0(i10, f10);
        p1Var.k0(i11, f11);
        return p1Var;
    }

    @NotNull
    public static final p1 m(int i10, float f10, int i11, float f11, int i12, float f12) {
        p1 p1Var = new p1(0, 1, null);
        p1Var.k0(i10, f10);
        p1Var.k0(i11, f11);
        p1Var.k0(i12, f12);
        return p1Var;
    }

    @NotNull
    public static final p1 n(int i10, float f10, int i11, float f11, int i12, float f12, int i13, float f13) {
        p1 p1Var = new p1(0, 1, null);
        p1Var.k0(i10, f10);
        p1Var.k0(i11, f11);
        p1Var.k0(i12, f12);
        p1Var.k0(i13, f13);
        return p1Var;
    }

    @NotNull
    public static final p1 o(int i10, float f10, int i11, float f11, int i12, float f12, int i13, float f13, int i14, float f14) {
        p1 p1Var = new p1(0, 1, null);
        p1Var.k0(i10, f10);
        p1Var.k0(i11, f11);
        p1Var.k0(i12, f12);
        p1Var.k0(i13, f13);
        p1Var.k0(i14, f14);
        return p1Var;
    }
}
