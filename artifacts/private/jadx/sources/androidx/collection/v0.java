package androidx.collection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLongLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongLongMap.kt\nandroidx/collection/LongLongMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1034:1\n1#2:1035\n*E\n"})
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final z1 f12478a = new z1(0);

    @NotNull
    public static final u0 a(int i10, @NotNull Function1<? super z1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        z1 z1Var = new z1(i10);
        builderAction.invoke(z1Var);
        return z1Var;
    }

    @NotNull
    public static final u0 b(@NotNull Function1<? super z1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        z1 z1Var = new z1(0, 1, null);
        builderAction.invoke(z1Var);
        return z1Var;
    }

    @NotNull
    public static final u0 c() {
        return f12478a;
    }

    @NotNull
    public static final u0 d() {
        return f12478a;
    }

    @NotNull
    public static final u0 e(long j10, long j11) {
        z1 z1Var = new z1(0, 1, null);
        z1Var.k0(j10, j11);
        return z1Var;
    }

    @NotNull
    public static final u0 f(long j10, long j11, long j12, long j13) {
        z1 z1Var = new z1(0, 1, null);
        z1Var.k0(j10, j11);
        z1Var.k0(j12, j13);
        return z1Var;
    }

    @NotNull
    public static final u0 g(long j10, long j11, long j12, long j13, long j14, long j15) {
        z1 z1Var = new z1(0, 1, null);
        z1Var.k0(j10, j11);
        z1Var.k0(j12, j13);
        z1Var.k0(j14, j15);
        return z1Var;
    }

    @NotNull
    public static final u0 h(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        z1 z1Var = new z1(0, 1, null);
        z1Var.k0(j10, j11);
        z1Var.k0(j12, j13);
        z1Var.k0(j14, j15);
        z1Var.k0(j16, j17);
        return z1Var;
    }

    @NotNull
    public static final u0 i(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        z1 z1Var = new z1(0, 1, null);
        z1Var.k0(j10, j11);
        z1Var.k0(j12, j13);
        z1Var.k0(j14, j15);
        z1Var.k0(j16, j17);
        z1Var.k0(j18, j19);
        return z1Var;
    }

    @NotNull
    public static final z1 j() {
        return new z1(0, 1, null);
    }

    @NotNull
    public static final z1 k(long j10, long j11) {
        z1 z1Var = new z1(0, 1, null);
        z1Var.k0(j10, j11);
        return z1Var;
    }

    @NotNull
    public static final z1 l(long j10, long j11, long j12, long j13) {
        z1 z1Var = new z1(0, 1, null);
        z1Var.k0(j10, j11);
        z1Var.k0(j12, j13);
        return z1Var;
    }

    @NotNull
    public static final z1 m(long j10, long j11, long j12, long j13, long j14, long j15) {
        z1 z1Var = new z1(0, 1, null);
        z1Var.k0(j10, j11);
        z1Var.k0(j12, j13);
        z1Var.k0(j14, j15);
        return z1Var;
    }

    @NotNull
    public static final z1 n(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        z1 z1Var = new z1(0, 1, null);
        z1Var.k0(j10, j11);
        z1Var.k0(j12, j13);
        z1Var.k0(j14, j15);
        z1Var.k0(j16, j17);
        return z1Var;
    }

    @NotNull
    public static final z1 o(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        z1 z1Var = new z1(0, 1, null);
        z1Var.k0(j10, j11);
        z1Var.k0(j12, j13);
        z1Var.k0(j14, j15);
        z1Var.k0(j16, j17);
        z1Var.k0(j18, j19);
        return z1Var;
    }
}
