package androidx.collection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/IntListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntList.kt\nandroidx/collection/MutableIntList\n*L\n1#1,968:1\n1#2:969\n672#3,2:970\n712#3,2:972\n712#3,2:974\n712#3,2:976\n712#3,2:978\n712#3,2:980\n712#3,2:982\n672#3,2:984\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/IntListKt\n*L\n902#1:970,2\n910#1:972,2\n917#1:974,2\n918#1:976,2\n927#1:978,2\n928#1:980,2\n929#1:982,2\n935#1:984,2\n*E\n"})
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final f0 f12242a = new r1(0);

    @NotNull
    public static final f0 a(int i10, @NotNull Function1<? super r1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        r1 r1Var = new r1(i10);
        builderAction.invoke(r1Var);
        return r1Var;
    }

    @NotNull
    public static final f0 b(@NotNull Function1<? super r1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        r1 r1Var = new r1(0, 1, null);
        builderAction.invoke(r1Var);
        return r1Var;
    }

    @NotNull
    public static final f0 c() {
        return f12242a;
    }

    @NotNull
    public static final f0 d() {
        return f12242a;
    }

    @NotNull
    public static final f0 e(int i10) {
        return j(i10);
    }

    @NotNull
    public static final f0 f(int i10, int i11) {
        return k(i10, i11);
    }

    @NotNull
    public static final f0 g(int i10, int i11, int i12) {
        return l(i10, i11, i12);
    }

    @NotNull
    public static final f0 h(@NotNull int... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        r1 r1Var = new r1(elements.length);
        r1Var.d0(r1Var.f12216b, elements);
        return r1Var;
    }

    @NotNull
    public static final r1 i() {
        return new r1(0, 1, null);
    }

    @NotNull
    public static final r1 j(int i10) {
        r1 r1Var = new r1(1);
        r1Var.b0(i10);
        return r1Var;
    }

    @NotNull
    public static final r1 k(int i10, int i11) {
        r1 r1Var = new r1(2);
        r1Var.b0(i10);
        r1Var.b0(i11);
        return r1Var;
    }

    @NotNull
    public static final r1 l(int i10, int i11, int i12) {
        r1 r1Var = new r1(3);
        r1Var.b0(i10);
        r1Var.b0(i11);
        r1Var.b0(i12);
        return r1Var;
    }

    @NotNull
    public static final r1 m(@NotNull int... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        r1 r1Var = new r1(elements.length);
        r1Var.d0(r1Var.f12216b, elements);
        return r1Var;
    }
}
