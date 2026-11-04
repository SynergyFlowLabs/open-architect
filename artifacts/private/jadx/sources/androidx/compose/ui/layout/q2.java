package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface q2 extends androidx.compose.ui.a0.c {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull q2 q2Var, @NotNull Function1<? super androidx.compose.ui.a0.c, Boolean> function1) {
            return q2.super.N(function1);
        }

        @Deprecated
        public static boolean b(@NotNull q2 q2Var, @NotNull Function1<? super androidx.compose.ui.a0.c, Boolean> function1) {
            return q2.super.X(function1);
        }

        @Deprecated
        public static <R> R c(@NotNull q2 q2Var, R r10, @NotNull Function2<? super R, ? super androidx.compose.ui.a0.c, ? extends R> function2) {
            return (R) q2.super.J(r10, function2);
        }

        @Deprecated
        public static <R> R d(@NotNull q2 q2Var, R r10, @NotNull Function2<? super androidx.compose.ui.a0.c, ? super R, ? extends R> function2) {
            return (R) q2.super.b0(r10, function2);
        }

        @Deprecated
        @NotNull
        public static androidx.compose.ui.a0 e(@NotNull q2 q2Var, @NotNull androidx.compose.ui.a0 a0Var) {
            return q2.super.B2(a0Var);
        }
    }

    void q6(@NotNull p2 p2Var);
}
