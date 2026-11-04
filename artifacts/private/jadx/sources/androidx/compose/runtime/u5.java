package androidx.compose.runtime;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
public final class u5<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c0 f36719a;

    private /* synthetic */ u5(c0 c0Var) {
        this.f36719a = c0Var;
    }

    public static final /* synthetic */ u5 a(c0 c0Var) {
        return new u5(c0Var);
    }

    @NotNull
    public static <T> c0 b(@NotNull c0 c0Var) {
        return c0Var;
    }

    public static boolean c(c0 c0Var, Object obj) {
        return (obj instanceof u5) && Intrinsics.areEqual(c0Var, ((u5) obj).h());
    }

    public static final boolean d(c0 c0Var, c0 c0Var2) {
        return Intrinsics.areEqual(c0Var, c0Var2);
    }

    @kotlin.a1
    public static /* synthetic */ void e() {
    }

    public static int f(c0 c0Var) {
        return c0Var.hashCode();
    }

    public static String g(c0 c0Var) {
        return "SkippableUpdater(composer=" + c0Var + ')';
    }

    public static final void i(c0 c0Var, @NotNull Function1<? super y7<T>, Unit> function1) {
        c0Var.h0(509942095);
        function1.invoke(y7.c(y7.d(c0Var)));
        c0Var.w0();
    }

    public boolean equals(Object obj) {
        return c(this.f36719a, obj);
    }

    public final /* synthetic */ c0 h() {
        return this.f36719a;
    }

    public int hashCode() {
        return f(this.f36719a);
    }

    public String toString() {
        return g(this.f36719a);
    }
}
