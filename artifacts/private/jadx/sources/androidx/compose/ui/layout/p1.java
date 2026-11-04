package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface p1 extends androidx.compose.ui.a0.c {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull p1 p1Var, @NotNull Function1<? super androidx.compose.ui.a0.c, Boolean> function1) {
            return p1.super.N(function1);
        }

        @Deprecated
        public static boolean b(@NotNull p1 p1Var, @NotNull Function1<? super androidx.compose.ui.a0.c, Boolean> function1) {
            return p1.super.X(function1);
        }

        @Deprecated
        public static <R> R c(@NotNull p1 p1Var, R r10, @NotNull Function2<? super R, ? super androidx.compose.ui.a0.c, ? extends R> function2) {
            return (R) p1.super.J(r10, function2);
        }

        @Deprecated
        public static <R> R d(@NotNull p1 p1Var, R r10, @NotNull Function2<? super androidx.compose.ui.a0.c, ? super R, ? extends R> function2) {
            return (R) p1.super.b0(r10, function2);
        }

        @Deprecated
        @NotNull
        public static androidx.compose.ui.a0 e(@NotNull p1 p1Var, @NotNull androidx.compose.ui.a0 a0Var) {
            return p1.super.B2(a0Var);
        }
    }

    void n0(@NotNull g0 g0Var);
}
