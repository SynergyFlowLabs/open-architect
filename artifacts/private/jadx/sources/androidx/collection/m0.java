package androidx.collection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nIntSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSet.kt\nandroidx/collection/IntSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,884:1\n1#2:885\n*E\n"})
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final u1 f12353a = new u1(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final int[] f12354b = new int[0];

    @NotNull
    public static final l0 a(int i10, @NotNull Function1<? super u1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        u1 u1Var = new u1(i10);
        builderAction.invoke(u1Var);
        return u1Var;
    }

    @NotNull
    public static final l0 b(@NotNull Function1<? super u1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        u1 u1Var = new u1(0, 1, null);
        builderAction.invoke(u1Var);
        return u1Var;
    }

    @NotNull
    public static final l0 c() {
        return f12353a;
    }

    @NotNull
    public static final int[] d() {
        return f12354b;
    }

    public static final int e(int i10) {
        int iHashCode = Integer.hashCode(i10) * b3.f12150j;
        return iHashCode ^ (iHashCode << 16);
    }

    @NotNull
    public static final l0 f() {
        return f12353a;
    }

    @NotNull
    public static final l0 g(int i10) {
        return l(i10);
    }

    @NotNull
    public static final l0 h(int i10, int i11) {
        return m(i10, i11);
    }

    @NotNull
    public static final l0 i(int i10, int i11, int i12) {
        return n(i10, i11, i12);
    }

    @NotNull
    public static final l0 j(@NotNull int... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        u1 u1Var = new u1(elements.length);
        u1Var.W(elements);
        return u1Var;
    }

    @NotNull
    public static final u1 k() {
        return new u1(0, 1, null);
    }

    @NotNull
    public static final u1 l(int i10) {
        u1 u1Var = new u1(1);
        u1Var.U(i10);
        return u1Var;
    }

    @NotNull
    public static final u1 m(int i10, int i11) {
        u1 u1Var = new u1(2);
        u1Var.U(i10);
        u1Var.U(i11);
        return u1Var;
    }

    @NotNull
    public static final u1 n(int i10, int i11, int i12) {
        u1 u1Var = new u1(3);
        u1Var.U(i10);
        u1Var.U(i11);
        u1Var.U(i12);
        return u1Var;
    }

    @NotNull
    public static final u1 o(@NotNull int... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        u1 u1Var = new u1(elements.length);
        u1Var.W(elements);
        return u1Var;
    }
}
