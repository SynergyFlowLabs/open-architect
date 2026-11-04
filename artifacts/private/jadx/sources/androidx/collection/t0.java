package androidx.collection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/LongListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LongList.kt\nandroidx/collection/MutableLongList\n*L\n1#1,972:1\n1#2:973\n673#3,2:974\n713#3,2:976\n713#3,2:978\n713#3,2:980\n713#3,2:982\n713#3,2:984\n713#3,2:986\n673#3,2:988\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/LongListKt\n*L\n905#1:974,2\n913#1:976,2\n920#1:978,2\n921#1:980,2\n931#1:982,2\n932#1:984,2\n933#1:986,2\n939#1:988,2\n*E\n"})
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final s0 f12457a = new y1(0);

    @NotNull
    public static final s0 a(int i10, @NotNull Function1<? super y1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        y1 y1Var = new y1(i10);
        builderAction.invoke(y1Var);
        return y1Var;
    }

    @NotNull
    public static final s0 b(@NotNull Function1<? super y1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        y1 y1Var = new y1(0, 1, null);
        builderAction.invoke(y1Var);
        return y1Var;
    }

    @NotNull
    public static final s0 c() {
        return f12457a;
    }

    @NotNull
    public static final s0 d() {
        return f12457a;
    }

    @NotNull
    public static final s0 e(long j10) {
        return j(j10);
    }

    @NotNull
    public static final s0 f(long j10, long j11) {
        return k(j10, j11);
    }

    @NotNull
    public static final s0 g(long j10, long j11, long j12) {
        return l(j10, j11, j12);
    }

    @NotNull
    public static final s0 h(@NotNull long... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        y1 y1Var = new y1(elements.length);
        y1Var.d0(y1Var.f12447b, elements);
        return y1Var;
    }

    @NotNull
    public static final y1 i() {
        return new y1(0, 1, null);
    }

    @NotNull
    public static final y1 j(long j10) {
        y1 y1Var = new y1(1);
        y1Var.b0(j10);
        return y1Var;
    }

    @NotNull
    public static final y1 k(long j10, long j11) {
        y1 y1Var = new y1(2);
        y1Var.b0(j10);
        y1Var.b0(j11);
        return y1Var;
    }

    @NotNull
    public static final y1 l(long j10, long j11, long j12) {
        y1 y1Var = new y1(3);
        y1Var.b0(j10);
        y1Var.b0(j11);
        y1Var.b0(j12);
        return y1Var;
    }

    @NotNull
    public static final y1 m(@NotNull long... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        y1 y1Var = new y1(elements.length);
        y1Var.d0(y1Var.f12447b, elements);
        return y1Var;
    }
}
