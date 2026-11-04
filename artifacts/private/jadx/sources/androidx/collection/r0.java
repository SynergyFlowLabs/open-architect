package androidx.collection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLongIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongIntMap.kt\nandroidx/collection/LongIntMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1034:1\n1#2:1035\n*E\n"})
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final x1 f12443a = new x1(0);

    @NotNull
    public static final q0 a(int i10, @NotNull Function1<? super x1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        x1 x1Var = new x1(i10);
        builderAction.invoke(x1Var);
        return x1Var;
    }

    @NotNull
    public static final q0 b(@NotNull Function1<? super x1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        x1 x1Var = new x1(0, 1, null);
        builderAction.invoke(x1Var);
        return x1Var;
    }

    @NotNull
    public static final q0 c() {
        return f12443a;
    }

    @NotNull
    public static final q0 d() {
        return f12443a;
    }

    @NotNull
    public static final q0 e(long j10, int i10) {
        x1 x1Var = new x1(0, 1, null);
        x1Var.k0(j10, i10);
        return x1Var;
    }

    @NotNull
    public static final q0 f(long j10, int i10, long j11, int i11) {
        x1 x1Var = new x1(0, 1, null);
        x1Var.k0(j10, i10);
        x1Var.k0(j11, i11);
        return x1Var;
    }

    @NotNull
    public static final q0 g(long j10, int i10, long j11, int i11, long j12, int i12) {
        x1 x1Var = new x1(0, 1, null);
        x1Var.k0(j10, i10);
        x1Var.k0(j11, i11);
        x1Var.k0(j12, i12);
        return x1Var;
    }

    @NotNull
    public static final q0 h(long j10, int i10, long j11, int i11, long j12, int i12, long j13, int i13) {
        x1 x1Var = new x1(0, 1, null);
        x1Var.k0(j10, i10);
        x1Var.k0(j11, i11);
        x1Var.k0(j12, i12);
        x1Var.k0(j13, i13);
        return x1Var;
    }

    @NotNull
    public static final q0 i(long j10, int i10, long j11, int i11, long j12, int i12, long j13, int i13, long j14, int i14) {
        x1 x1Var = new x1(0, 1, null);
        x1Var.k0(j10, i10);
        x1Var.k0(j11, i11);
        x1Var.k0(j12, i12);
        x1Var.k0(j13, i13);
        x1Var.k0(j14, i14);
        return x1Var;
    }

    @NotNull
    public static final x1 j() {
        return new x1(0, 1, null);
    }

    @NotNull
    public static final x1 k(long j10, int i10) {
        boolean z10 = false & false;
        x1 x1Var = new x1(0, 1, null);
        x1Var.k0(j10, i10);
        return x1Var;
    }

    @NotNull
    public static final x1 l(long j10, int i10, long j11, int i11) {
        int i12 = 1 >> 0;
        x1 x1Var = new x1(0, 1, null);
        x1Var.k0(j10, i10);
        x1Var.k0(j11, i11);
        return x1Var;
    }

    @NotNull
    public static final x1 m(long j10, int i10, long j11, int i11, long j12, int i12) {
        x1 x1Var = new x1(0, 1, null);
        x1Var.k0(j10, i10);
        x1Var.k0(j11, i11);
        x1Var.k0(j12, i12);
        return x1Var;
    }

    @NotNull
    public static final x1 n(long j10, int i10, long j11, int i11, long j12, int i12, long j13, int i13) {
        x1 x1Var = new x1(0, 1, null);
        x1Var.k0(j10, i10);
        x1Var.k0(j11, i11);
        x1Var.k0(j12, i12);
        x1Var.k0(j13, i13);
        return x1Var;
    }

    @NotNull
    public static final x1 o(long j10, int i10, long j11, int i11, long j12, int i12, long j13, int i13, long j14, int i14) {
        x1 x1Var = new x1(0, 1, null);
        x1Var.k0(j10, i10);
        x1Var.k0(j11, i11);
        x1Var.k0(j12, i12);
        x1Var.k0(j13, i13);
        x1Var.k0(j14, i14);
        return x1Var;
    }
}
