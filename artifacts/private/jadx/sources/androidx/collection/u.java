package androidx.collection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFloatLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatLongMap.kt\nandroidx/collection/FloatLongMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1036:1\n1#2:1037\n*E\n"})
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final m1 f12461a = new m1(0);

    @NotNull
    public static final t a(int i10, @NotNull Function1<? super m1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        m1 m1Var = new m1(i10);
        builderAction.invoke(m1Var);
        return m1Var;
    }

    @NotNull
    public static final t b(@NotNull Function1<? super m1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        m1 m1Var = new m1(0, 1, null);
        builderAction.invoke(m1Var);
        return m1Var;
    }

    @NotNull
    public static final t c() {
        return f12461a;
    }

    @NotNull
    public static final t d() {
        return f12461a;
    }

    @NotNull
    public static final t e(float f10, long j10) {
        m1 m1Var = new m1(0, 1, null);
        m1Var.k0(f10, j10);
        return m1Var;
    }

    @NotNull
    public static final t f(float f10, long j10, float f11, long j11) {
        m1 m1Var = new m1(0, 1, null);
        m1Var.k0(f10, j10);
        m1Var.k0(f11, j11);
        return m1Var;
    }

    @NotNull
    public static final t g(float f10, long j10, float f11, long j11, float f12, long j12) {
        m1 m1Var = new m1(0, 1, null);
        m1Var.k0(f10, j10);
        m1Var.k0(f11, j11);
        m1Var.k0(f12, j12);
        return m1Var;
    }

    @NotNull
    public static final t h(float f10, long j10, float f11, long j11, float f12, long j12, float f13, long j13) {
        m1 m1Var = new m1(0, 1, null);
        m1Var.k0(f10, j10);
        m1Var.k0(f11, j11);
        m1Var.k0(f12, j12);
        m1Var.k0(f13, j13);
        return m1Var;
    }

    @NotNull
    public static final t i(float f10, long j10, float f11, long j11, float f12, long j12, float f13, long j13, float f14, long j14) {
        m1 m1Var = new m1(0, 1, null);
        m1Var.k0(f10, j10);
        m1Var.k0(f11, j11);
        m1Var.k0(f12, j12);
        m1Var.k0(f13, j13);
        m1Var.k0(f14, j14);
        return m1Var;
    }

    @NotNull
    public static final m1 j() {
        return new m1(0, 1, null);
    }

    @NotNull
    public static final m1 k(float f10, long j10) {
        m1 m1Var = new m1(0, 1, null);
        m1Var.k0(f10, j10);
        return m1Var;
    }

    @NotNull
    public static final m1 l(float f10, long j10, float f11, long j11) {
        m1 m1Var = new m1(0, 1, null);
        m1Var.k0(f10, j10);
        m1Var.k0(f11, j11);
        return m1Var;
    }

    @NotNull
    public static final m1 m(float f10, long j10, float f11, long j11, float f12, long j12) {
        m1 m1Var = new m1(0, 1, null);
        m1Var.k0(f10, j10);
        m1Var.k0(f11, j11);
        m1Var.k0(f12, j12);
        return m1Var;
    }

    @NotNull
    public static final m1 n(float f10, long j10, float f11, long j11, float f12, long j12, float f13, long j13) {
        m1 m1Var = new m1(0, 1, null);
        m1Var.k0(f10, j10);
        m1Var.k0(f11, j11);
        m1Var.k0(f12, j12);
        m1Var.k0(f13, j13);
        return m1Var;
    }

    @NotNull
    public static final m1 o(float f10, long j10, float f11, long j11, float f12, long j12, float f13, long j13, float f14, long j14) {
        m1 m1Var = new m1(0, 1, null);
        m1Var.k0(f10, j10);
        m1Var.k0(f11, j11);
        m1Var.k0(f12, j12);
        m1Var.k0(f13, j13);
        m1Var.k0(f14, j14);
        return m1Var;
    }
}
