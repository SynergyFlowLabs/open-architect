package androidx.collection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLongFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongFloatMap.kt\nandroidx/collection/LongFloatMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1036:1\n1#2:1037\n*E\n"})
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final w1 f12426a = new w1(0);

    @NotNull
    public static final o0 a(int i10, @NotNull Function1<? super w1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        w1 w1Var = new w1(i10);
        builderAction.invoke(w1Var);
        return w1Var;
    }

    @NotNull
    public static final o0 b(@NotNull Function1<? super w1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        w1 w1Var = new w1(0, 1, null);
        builderAction.invoke(w1Var);
        return w1Var;
    }

    @NotNull
    public static final o0 c() {
        return f12426a;
    }

    @NotNull
    public static final o0 d() {
        return f12426a;
    }

    @NotNull
    public static final o0 e(long j10, float f10) {
        w1 w1Var = new w1(0, 1, null);
        w1Var.k0(j10, f10);
        return w1Var;
    }

    @NotNull
    public static final o0 f(long j10, float f10, long j11, float f11) {
        int i10 = 7 << 0;
        w1 w1Var = new w1(0, 1, null);
        w1Var.k0(j10, f10);
        w1Var.k0(j11, f11);
        return w1Var;
    }

    @NotNull
    public static final o0 g(long j10, float f10, long j11, float f11, long j12, float f12) {
        w1 w1Var = new w1(0, 1, null);
        w1Var.k0(j10, f10);
        w1Var.k0(j11, f11);
        w1Var.k0(j12, f12);
        return w1Var;
    }

    @NotNull
    public static final o0 h(long j10, float f10, long j11, float f11, long j12, float f12, long j13, float f13) {
        w1 w1Var = new w1(0, 1, null);
        w1Var.k0(j10, f10);
        w1Var.k0(j11, f11);
        w1Var.k0(j12, f12);
        w1Var.k0(j13, f13);
        return w1Var;
    }

    @NotNull
    public static final o0 i(long j10, float f10, long j11, float f11, long j12, float f12, long j13, float f13, long j14, float f14) {
        w1 w1Var = new w1(0, 1, null);
        w1Var.k0(j10, f10);
        w1Var.k0(j11, f11);
        w1Var.k0(j12, f12);
        w1Var.k0(j13, f13);
        w1Var.k0(j14, f14);
        return w1Var;
    }

    @NotNull
    public static final w1 j() {
        return new w1(0, 1, null);
    }

    @NotNull
    public static final w1 k(long j10, float f10) {
        w1 w1Var = new w1(0, 1, null);
        w1Var.k0(j10, f10);
        return w1Var;
    }

    @NotNull
    public static final w1 l(long j10, float f10, long j11, float f11) {
        w1 w1Var = new w1(0, 1, null);
        w1Var.k0(j10, f10);
        w1Var.k0(j11, f11);
        return w1Var;
    }

    @NotNull
    public static final w1 m(long j10, float f10, long j11, float f11, long j12, float f12) {
        w1 w1Var = new w1(0, 1, null);
        w1Var.k0(j10, f10);
        w1Var.k0(j11, f11);
        w1Var.k0(j12, f12);
        return w1Var;
    }

    @NotNull
    public static final w1 n(long j10, float f10, long j11, float f11, long j12, float f12, long j13, float f13) {
        w1 w1Var = new w1(0, 1, null);
        w1Var.k0(j10, f10);
        w1Var.k0(j11, f11);
        w1Var.k0(j12, f12);
        w1Var.k0(j13, f13);
        return w1Var;
    }

    @NotNull
    public static final w1 o(long j10, float f10, long j11, float f11, long j12, float f12, long j13, float f13, long j14, float f14) {
        w1 w1Var = new w1(0, 1, null);
        w1Var.k0(j10, f10);
        w1Var.k0(j11, f11);
        w1Var.k0(j12, f12);
        w1Var.k0(j13, f13);
        w1Var.k0(j14, f14);
        return w1Var;
    }
}
