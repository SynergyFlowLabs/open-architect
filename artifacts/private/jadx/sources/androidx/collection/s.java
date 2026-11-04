package androidx.collection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FloatList.kt\nandroidx/collection/MutableFloatList\n*L\n1#1,976:1\n1#2:977\n675#3,2:978\n715#3,2:980\n715#3,2:982\n715#3,2:984\n715#3,2:986\n715#3,2:988\n715#3,2:990\n675#3,2:992\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatListKt\n*L\n909#1:978,2\n917#1:980,2\n924#1:982,2\n925#1:984,2\n935#1:986,2\n936#1:988,2\n937#1:990,2\n943#1:992,2\n*E\n"})
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final r f12445a = new l1(0);

    @NotNull
    public static final r a(int i10, @NotNull Function1<? super l1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        l1 l1Var = new l1(i10);
        builderAction.invoke(l1Var);
        return l1Var;
    }

    @NotNull
    public static final r b(@NotNull Function1<? super l1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        l1 l1Var = new l1(0, 1, null);
        builderAction.invoke(l1Var);
        return l1Var;
    }

    @NotNull
    public static final r c() {
        return f12445a;
    }

    @NotNull
    public static final r d() {
        return f12445a;
    }

    @NotNull
    public static final r e(float f10) {
        return j(f10);
    }

    @NotNull
    public static final r f(float f10, float f11) {
        return k(f10, f11);
    }

    @NotNull
    public static final r g(float f10, float f11, float f12) {
        return l(f10, f11, f12);
    }

    @NotNull
    public static final r h(@NotNull float... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        l1 l1Var = new l1(elements.length);
        l1Var.d0(l1Var.f12442b, elements);
        return l1Var;
    }

    @NotNull
    public static final l1 i() {
        return new l1(0, 1, null);
    }

    @NotNull
    public static final l1 j(float f10) {
        l1 l1Var = new l1(1);
        l1Var.b0(f10);
        return l1Var;
    }

    @NotNull
    public static final l1 k(float f10, float f11) {
        l1 l1Var = new l1(2);
        l1Var.b0(f10);
        l1Var.b0(f11);
        return l1Var;
    }

    @NotNull
    public static final l1 l(float f10, float f11, float f12) {
        l1 l1Var = new l1(3);
        l1Var.b0(f10);
        l1Var.b0(f11);
        l1Var.b0(f12);
        return l1Var;
    }

    @NotNull
    public static final l1 m(@NotNull float... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        l1 l1Var = new l1(elements.length);
        l1Var.d0(l1Var.f12442b, elements);
        return l1Var;
    }
}
