package androidx.collection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDoubleList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoubleList.kt\nandroidx/collection/DoubleListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DoubleList.kt\nandroidx/collection/MutableDoubleList\n*L\n1#1,983:1\n1#2:984\n678#3,2:985\n718#3,2:987\n718#3,2:989\n718#3,2:991\n718#3,2:993\n718#3,2:995\n718#3,2:997\n678#3,2:999\n*S KotlinDebug\n*F\n+ 1 DoubleList.kt\nandroidx/collection/DoubleListKt\n*L\n912#1:985,2\n920#1:987,2\n927#1:989,2\n928#1:991,2\n942#1:993,2\n943#1:995,2\n944#1:997,2\n950#1:999,2\n*E\n"})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final i f12300a = new h1(0);

    @NotNull
    public static final i a(int i10, @NotNull Function1<? super h1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        h1 h1Var = new h1(i10);
        builderAction.invoke(h1Var);
        return h1Var;
    }

    @NotNull
    public static final i b(@NotNull Function1<? super h1, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        int i10 = 2 ^ 1;
        h1 h1Var = new h1(0, 1, null);
        builderAction.invoke(h1Var);
        return h1Var;
    }

    @NotNull
    public static final i c() {
        return f12300a;
    }

    @NotNull
    public static final i d(double d10) {
        return j(d10);
    }

    @NotNull
    public static final i e(double d10, double d11) {
        return k(d10, d11);
    }

    @NotNull
    public static final i f(double d10, double d11, double d12) {
        return l(d10, d11, d12);
    }

    @NotNull
    public static final i g(@NotNull double... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        h1 h1Var = new h1(elements.length);
        h1Var.d0(h1Var.f12277b, elements);
        return h1Var;
    }

    @NotNull
    public static final i h() {
        return f12300a;
    }

    @NotNull
    public static final h1 i() {
        int i10 = 6 << 1;
        return new h1(0, 1, null);
    }

    @NotNull
    public static final h1 j(double d10) {
        h1 h1Var = new h1(1);
        h1Var.b0(d10);
        return h1Var;
    }

    @NotNull
    public static final h1 k(double d10, double d11) {
        h1 h1Var = new h1(2);
        h1Var.b0(d10);
        h1Var.b0(d11);
        return h1Var;
    }

    @NotNull
    public static final h1 l(double d10, double d11, double d12) {
        h1 h1Var = new h1(3);
        h1Var.b0(d10);
        h1Var.b0(d11);
        h1Var.b0(d12);
        return h1Var;
    }

    @NotNull
    public static final h1 m(@NotNull double... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        h1 h1Var = new h1(elements.length);
        h1Var.d0(h1Var.f12277b, elements);
        return h1Var;
    }
}
