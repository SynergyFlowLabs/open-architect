package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface o0 extends androidx.compose.ui.a0.c {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull o0 o0Var, @NotNull Function1<? super androidx.compose.ui.a0.c, Boolean> function1) {
            return o0.super.N(function1);
        }

        @Deprecated
        public static boolean b(@NotNull o0 o0Var, @NotNull Function1<? super androidx.compose.ui.a0.c, Boolean> function1) {
            return o0.super.X(function1);
        }

        @Deprecated
        public static <R> R c(@NotNull o0 o0Var, R r10, @NotNull Function2<? super R, ? super androidx.compose.ui.a0.c, ? extends R> function2) {
            return (R) o0.super.J(r10, function2);
        }

        @Deprecated
        public static <R> R d(@NotNull o0 o0Var, R r10, @NotNull Function2<? super androidx.compose.ui.a0.c, ? super R, ? extends R> function2) {
            return (R) o0.super.b0(r10, function2);
        }

        @Deprecated
        public static int e(@NotNull o0 o0Var, @NotNull z zVar, @NotNull y yVar, int i10) {
            return o0.super.e0(zVar, yVar, i10);
        }

        @Deprecated
        public static int f(@NotNull o0 o0Var, @NotNull z zVar, @NotNull y yVar, int i10) {
            return o0.super.W(zVar, yVar, i10);
        }

        @Deprecated
        public static int g(@NotNull o0 o0Var, @NotNull z zVar, @NotNull y yVar, int i10) {
            return o0.super.k0(zVar, yVar, i10);
        }

        @Deprecated
        public static int h(@NotNull o0 o0Var, @NotNull z zVar, @NotNull y yVar, int i10) {
            return o0.super.U(zVar, yVar, i10);
        }

        @Deprecated
        @NotNull
        public static androidx.compose.ui.a0 i(@NotNull o0 o0Var, @NotNull androidx.compose.ui.a0 a0Var) {
            return o0.super.B2(a0Var);
        }
    }

    default int U(@NotNull z zVar, @NotNull y yVar, int i10) {
        return f1.f39325a.d(this, zVar, yVar, i10);
    }

    default int W(@NotNull z zVar, @NotNull y yVar, int i10) {
        return f1.f39325a.b(this, zVar, yVar, i10);
    }

    @NotNull
    b1 c(@NotNull c1 c1Var, @NotNull z0 z0Var, long j10);

    default int e0(@NotNull z zVar, @NotNull y yVar, int i10) {
        return f1.f39325a.a(this, zVar, yVar, i10);
    }

    default int k0(@NotNull z zVar, @NotNull y yVar, int i10) {
        return f1.f39325a.c(this, zVar, yVar, i10);
    }
}
