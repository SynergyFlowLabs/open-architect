package androidx.collection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nIntIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntIntMap.kt\nandroidx/collection/IntIntMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1034:1\n1#2:1035\n*E\n"})
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final q1 f12175a = new q1(0);

    @NotNull
    public static final c0 a(int i10, @NotNull Function1<? super q1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        q1 q1Var = new q1(i10);
        builderAction.invoke(q1Var);
        return q1Var;
    }

    @NotNull
    public static final c0 b(@NotNull Function1<? super q1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        q1 q1Var = new q1(0, 1, null);
        builderAction.invoke(q1Var);
        return q1Var;
    }

    @NotNull
    public static final c0 c() {
        return f12175a;
    }

    @NotNull
    public static final c0 d() {
        return f12175a;
    }

    @NotNull
    public static final c0 e(int i10, int i11) {
        q1 q1Var = new q1(0, 1, null);
        q1Var.k0(i10, i11);
        return q1Var;
    }

    @NotNull
    public static final c0 f(int i10, int i11, int i12, int i13) {
        q1 q1Var = new q1(0, 1, null);
        q1Var.k0(i10, i11);
        q1Var.k0(i12, i13);
        return q1Var;
    }

    @NotNull
    public static final c0 g(int i10, int i11, int i12, int i13, int i14, int i15) {
        q1 q1Var = new q1(0, 1, null);
        q1Var.k0(i10, i11);
        q1Var.k0(i12, i13);
        q1Var.k0(i14, i15);
        return q1Var;
    }

    @NotNull
    public static final c0 h(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        q1 q1Var = new q1(0, 1, null);
        q1Var.k0(i10, i11);
        q1Var.k0(i12, i13);
        q1Var.k0(i14, i15);
        q1Var.k0(i16, i17);
        return q1Var;
    }

    @NotNull
    public static final c0 i(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        q1 q1Var = new q1(0, 1, null);
        q1Var.k0(i10, i11);
        q1Var.k0(i12, i13);
        q1Var.k0(i14, i15);
        q1Var.k0(i16, i17);
        q1Var.k0(i18, i19);
        return q1Var;
    }

    @NotNull
    public static final q1 j() {
        return new q1(0, 1, null);
    }

    @NotNull
    public static final q1 k(int i10, int i11) {
        q1 q1Var = new q1(0, 1, null);
        q1Var.k0(i10, i11);
        return q1Var;
    }

    @NotNull
    public static final q1 l(int i10, int i11, int i12, int i13) {
        q1 q1Var = new q1(0, 1, null);
        q1Var.k0(i10, i11);
        q1Var.k0(i12, i13);
        return q1Var;
    }

    @NotNull
    public static final q1 m(int i10, int i11, int i12, int i13, int i14, int i15) {
        q1 q1Var = new q1(0, 1, null);
        q1Var.k0(i10, i11);
        q1Var.k0(i12, i13);
        q1Var.k0(i14, i15);
        return q1Var;
    }

    @NotNull
    public static final q1 n(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        q1 q1Var = new q1(0, 1, null);
        q1Var.k0(i10, i11);
        q1Var.k0(i12, i13);
        q1Var.k0(i14, i15);
        q1Var.k0(i16, i17);
        return q1Var;
    }

    @NotNull
    public static final q1 o(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        q1 q1Var = new q1(0, 1, null);
        q1Var.k0(i10, i11);
        q1Var.k0(i12, i13);
        q1Var.k0(i14, i15);
        q1Var.k0(i16, i17);
        q1Var.k0(i18, i19);
        return q1Var;
    }
}
