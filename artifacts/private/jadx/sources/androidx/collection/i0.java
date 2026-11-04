package androidx.collection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nIntLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntLongMap.kt\nandroidx/collection/IntLongMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1034:1\n1#2:1035\n*E\n"})
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final s1 f12278a = new s1(0);

    @NotNull
    public static final h0 a(int i10, @NotNull Function1<? super s1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        s1 s1Var = new s1(i10);
        builderAction.invoke(s1Var);
        return s1Var;
    }

    @NotNull
    public static final h0 b(@NotNull Function1<? super s1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        s1 s1Var = new s1(0, 1, null);
        builderAction.invoke(s1Var);
        return s1Var;
    }

    @NotNull
    public static final h0 c() {
        return f12278a;
    }

    @NotNull
    public static final h0 d() {
        return f12278a;
    }

    @NotNull
    public static final h0 e(int i10, long j10) {
        s1 s1Var = new s1(0, 1, null);
        s1Var.k0(i10, j10);
        return s1Var;
    }

    @NotNull
    public static final h0 f(int i10, long j10, int i11, long j11) {
        boolean z10 = false | false;
        s1 s1Var = new s1(0, 1, null);
        s1Var.k0(i10, j10);
        s1Var.k0(i11, j11);
        return s1Var;
    }

    @NotNull
    public static final h0 g(int i10, long j10, int i11, long j11, int i12, long j12) {
        s1 s1Var = new s1(0, 1, null);
        s1Var.k0(i10, j10);
        s1Var.k0(i11, j11);
        s1Var.k0(i12, j12);
        return s1Var;
    }

    @NotNull
    public static final h0 h(int i10, long j10, int i11, long j11, int i12, long j12, int i13, long j13) {
        s1 s1Var = new s1(0, 1, null);
        s1Var.k0(i10, j10);
        s1Var.k0(i11, j11);
        s1Var.k0(i12, j12);
        s1Var.k0(i13, j13);
        return s1Var;
    }

    @NotNull
    public static final h0 i(int i10, long j10, int i11, long j11, int i12, long j12, int i13, long j13, int i14, long j14) {
        s1 s1Var = new s1(0, 1, null);
        s1Var.k0(i10, j10);
        s1Var.k0(i11, j11);
        s1Var.k0(i12, j12);
        s1Var.k0(i13, j13);
        s1Var.k0(i14, j14);
        return s1Var;
    }

    @NotNull
    public static final s1 j() {
        return new s1(0, 1, null);
    }

    @NotNull
    public static final s1 k(int i10, long j10) {
        s1 s1Var = new s1(0, 1, null);
        s1Var.k0(i10, j10);
        return s1Var;
    }

    @NotNull
    public static final s1 l(int i10, long j10, int i11, long j11) {
        s1 s1Var = new s1(0, 1, null);
        s1Var.k0(i10, j10);
        s1Var.k0(i11, j11);
        return s1Var;
    }

    @NotNull
    public static final s1 m(int i10, long j10, int i11, long j11, int i12, long j12) {
        s1 s1Var = new s1(0, 1, null);
        s1Var.k0(i10, j10);
        s1Var.k0(i11, j11);
        s1Var.k0(i12, j12);
        return s1Var;
    }

    @NotNull
    public static final s1 n(int i10, long j10, int i11, long j11, int i12, long j12, int i13, long j13) {
        s1 s1Var = new s1(0, 1, null);
        s1Var.k0(i10, j10);
        s1Var.k0(i11, j11);
        s1Var.k0(i12, j12);
        s1Var.k0(i13, j13);
        return s1Var;
    }

    @NotNull
    public static final s1 o(int i10, long j10, int i11, long j11, int i12, long j12, int i13, long j13, int i14, long j14) {
        s1 s1Var = new s1(0, 1, null);
        s1Var.k0(i10, j10);
        s1Var.k0(i11, j11);
        s1Var.k0(i12, j12);
        s1Var.k0(i13, j13);
        s1Var.k0(i14, j14);
        return s1Var;
    }
}
