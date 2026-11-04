package androidx.collection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFloatSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatSet.kt\nandroidx/collection/FloatSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,886:1\n1#2:887\n*E\n"})
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final o1 f12516a = new o1(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final float[] f12517b = new float[0];

    @NotNull
    public static final x a(int i10, @NotNull Function1<? super o1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        o1 o1Var = new o1(i10);
        builderAction.invoke(o1Var);
        return o1Var;
    }

    @NotNull
    public static final x b(@NotNull Function1<? super o1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        o1 o1Var = new o1(0, 1, null);
        builderAction.invoke(o1Var);
        return o1Var;
    }

    @NotNull
    public static final x c() {
        return f12516a;
    }

    @NotNull
    public static final x d() {
        return f12516a;
    }

    @NotNull
    public static final x e(float f10) {
        return l(f10);
    }

    @NotNull
    public static final x f(float f10, float f11) {
        return m(f10, f11);
    }

    @NotNull
    public static final x g(float f10, float f11, float f12) {
        return n(f10, f11, f12);
    }

    @NotNull
    public static final x h(@NotNull float... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        o1 o1Var = new o1(elements.length);
        o1Var.W(elements);
        return o1Var;
    }

    @NotNull
    public static final float[] i() {
        return f12517b;
    }

    public static final int j(float f10) {
        int iHashCode = Float.hashCode(f10) * b3.f12150j;
        return iHashCode ^ (iHashCode << 16);
    }

    @NotNull
    public static final o1 k() {
        return new o1(0, 1, null);
    }

    @NotNull
    public static final o1 l(float f10) {
        o1 o1Var = new o1(1);
        o1Var.U(f10);
        return o1Var;
    }

    @NotNull
    public static final o1 m(float f10, float f11) {
        o1 o1Var = new o1(2);
        o1Var.U(f10);
        o1Var.U(f11);
        return o1Var;
    }

    @NotNull
    public static final o1 n(float f10, float f11, float f12) {
        int i10 = 3 & 3;
        o1 o1Var = new o1(3);
        o1Var.U(f10);
        o1Var.U(f11);
        o1Var.U(f12);
        return o1Var;
    }

    @NotNull
    public static final o1 o(@NotNull float... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        o1 o1Var = new o1(elements.length);
        o1Var.W(elements);
        return o1Var;
    }
}
