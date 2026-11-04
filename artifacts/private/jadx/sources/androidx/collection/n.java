package androidx.collection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFloatFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatFloatMap.kt\nandroidx/collection/FloatFloatMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1036:1\n1#2:1037\n*E\n"})
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final j1 f12383a = new j1(0);

    @NotNull
    public static final m a(int i10, @NotNull Function1<? super j1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        j1 j1Var = new j1(i10);
        builderAction.invoke(j1Var);
        return j1Var;
    }

    @NotNull
    public static final m b(@NotNull Function1<? super j1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        j1 j1Var = new j1(0, 1, null);
        builderAction.invoke(j1Var);
        return j1Var;
    }

    @NotNull
    public static final m c() {
        return f12383a;
    }

    @NotNull
    public static final m d() {
        return f12383a;
    }

    @NotNull
    public static final m e(float f10, float f11) {
        j1 j1Var = new j1(0, 1, null);
        j1Var.k0(f10, f11);
        return j1Var;
    }

    @NotNull
    public static final m f(float f10, float f11, float f12, float f13) {
        j1 j1Var = new j1(0, 1, null);
        j1Var.k0(f10, f11);
        j1Var.k0(f12, f13);
        return j1Var;
    }

    @NotNull
    public static final m g(float f10, float f11, float f12, float f13, float f14, float f15) {
        j1 j1Var = new j1(0, 1, null);
        j1Var.k0(f10, f11);
        j1Var.k0(f12, f13);
        j1Var.k0(f14, f15);
        return j1Var;
    }

    @NotNull
    public static final m h(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        j1 j1Var = new j1(0, 1, null);
        j1Var.k0(f10, f11);
        j1Var.k0(f12, f13);
        j1Var.k0(f14, f15);
        j1Var.k0(f16, f17);
        return j1Var;
    }

    @NotNull
    public static final m i(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        j1 j1Var = new j1(0, 1, null);
        j1Var.k0(f10, f11);
        j1Var.k0(f12, f13);
        j1Var.k0(f14, f15);
        j1Var.k0(f16, f17);
        j1Var.k0(f18, f19);
        return j1Var;
    }

    @NotNull
    public static final j1 j() {
        return new j1(0, 1, null);
    }

    @NotNull
    public static final j1 k(float f10, float f11) {
        j1 j1Var = new j1(0, 1, null);
        j1Var.k0(f10, f11);
        return j1Var;
    }

    @NotNull
    public static final j1 l(float f10, float f11, float f12, float f13) {
        j1 j1Var = new j1(0, 1, null);
        j1Var.k0(f10, f11);
        j1Var.k0(f12, f13);
        return j1Var;
    }

    @NotNull
    public static final j1 m(float f10, float f11, float f12, float f13, float f14, float f15) {
        j1 j1Var = new j1(0, 1, null);
        j1Var.k0(f10, f11);
        j1Var.k0(f12, f13);
        j1Var.k0(f14, f15);
        return j1Var;
    }

    @NotNull
    public static final j1 n(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        j1 j1Var = new j1(0, 1, null);
        j1Var.k0(f10, f11);
        j1Var.k0(f12, f13);
        j1Var.k0(f14, f15);
        j1Var.k0(f16, f17);
        return j1Var;
    }

    @NotNull
    public static final j1 o(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        j1 j1Var = new j1(0, 1, null);
        j1Var.k0(f10, f11);
        j1Var.k0(f12, f13);
        j1Var.k0(f14, f15);
        j1Var.k0(f16, f17);
        j1Var.k0(f18, f19);
        return j1Var;
    }
}
