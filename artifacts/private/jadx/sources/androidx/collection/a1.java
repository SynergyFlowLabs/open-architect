package androidx.collection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLongSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSet.kt\nandroidx/collection/LongSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,885:1\n1#2:886\n*E\n"})
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final b2 f12127a = new b2(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final long[] f12128b = new long[0];

    @NotNull
    public static final z0 a(int i10, @NotNull Function1<? super b2, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        b2 b2Var = new b2(i10);
        builderAction.invoke(b2Var);
        return b2Var;
    }

    @NotNull
    public static final z0 b(@NotNull Function1<? super b2, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        b2 b2Var = new b2(0, 1, null);
        builderAction.invoke(b2Var);
        return b2Var;
    }

    @NotNull
    public static final z0 c() {
        return f12127a;
    }

    @NotNull
    public static final long[] d() {
        return f12128b;
    }

    public static final int e(long j10) {
        int iHashCode = Long.hashCode(j10) * b3.f12150j;
        return iHashCode ^ (iHashCode << 16);
    }

    @NotNull
    public static final z0 f() {
        return f12127a;
    }

    @NotNull
    public static final z0 g(long j10) {
        return l(j10);
    }

    @NotNull
    public static final z0 h(long j10, long j11) {
        return m(j10, j11);
    }

    @NotNull
    public static final z0 i(long j10, long j11, long j12) {
        return n(j10, j11, j12);
    }

    @NotNull
    public static final z0 j(@NotNull long... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        b2 b2Var = new b2(elements.length);
        b2Var.W(elements);
        return b2Var;
    }

    @NotNull
    public static final b2 k() {
        return new b2(0, 1, null);
    }

    @NotNull
    public static final b2 l(long j10) {
        b2 b2Var = new b2(1);
        b2Var.U(j10);
        return b2Var;
    }

    @NotNull
    public static final b2 m(long j10, long j11) {
        b2 b2Var = new b2(2);
        b2Var.U(j10);
        b2Var.U(j11);
        return b2Var;
    }

    @NotNull
    public static final b2 n(long j10, long j11, long j12) {
        b2 b2Var = new b2(3);
        b2Var.U(j10);
        b2Var.U(j11);
        b2Var.U(j12);
        return b2Var;
    }

    @NotNull
    public static final b2 o(@NotNull long... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        b2 b2Var = new b2(elements.length);
        b2Var.W(elements);
        return b2Var;
    }
}
