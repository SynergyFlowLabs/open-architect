package kotlin.ranges;

import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.m2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
public class s {
    public static final void a(boolean z10, @NotNull Number step) {
        Intrinsics.checkNotNullParameter(step, "step");
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lkotlin/ranges/g<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @e1(version = "1.3")
    @kotlin.internal.f
    private static final boolean b(g gVar, Object obj) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return obj != null && gVar.c((Comparable) obj);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lkotlin/ranges/q<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.9")
    @kotlin.internal.f
    private static final boolean c(q qVar, Object obj) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return obj != null && qVar.c((Comparable) obj);
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @NotNull
    public static final f<Double> d(double d10, double d11) {
        return new d(d10, d11);
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @NotNull
    public static f<Float> e(float f10, float f11) {
        return new e(f10, f11);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> g<T> f(@NotNull T t10, @NotNull T that) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(that, "that");
        return new i(t10, that);
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.9")
    @NotNull
    public static final q<Double> g(double d10, double d11) {
        return new o(d10, d11);
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.9")
    @NotNull
    public static final q<Float> h(float f10, float f11) {
        return new p(f10, f11);
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.9")
    @NotNull
    public static final <T extends Comparable<? super T>> q<T> i(@NotNull T t10, @NotNull T that) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(that, "that");
        return new h(t10, that);
    }
}
