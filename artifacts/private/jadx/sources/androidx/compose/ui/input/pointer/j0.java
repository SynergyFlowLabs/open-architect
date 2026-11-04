package androidx.compose.ui.input.pointer;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface j0 extends androidx.compose.ui.a0.c {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull j0 j0Var, @NotNull Function1<? super androidx.compose.ui.a0.c, Boolean> function1) {
            return j0.super.N(function1);
        }

        @Deprecated
        public static boolean b(@NotNull j0 j0Var, @NotNull Function1<? super androidx.compose.ui.a0.c, Boolean> function1) {
            return j0.super.X(function1);
        }

        @Deprecated
        public static <R> R c(@NotNull j0 j0Var, R r10, @NotNull Function2<? super R, ? super androidx.compose.ui.a0.c, ? extends R> function2) {
            return (R) j0.super.J(r10, function2);
        }

        @Deprecated
        public static <R> R d(@NotNull j0 j0Var, R r10, @NotNull Function2<? super androidx.compose.ui.a0.c, ? super R, ? extends R> function2) {
            return (R) j0.super.b0(r10, function2);
        }

        @Deprecated
        @NotNull
        public static androidx.compose.ui.a0 e(@NotNull j0 j0Var, @NotNull androidx.compose.ui.a0 a0Var) {
            return j0.super.B2(a0Var);
        }
    }

    @NotNull
    i0 z7();
}
