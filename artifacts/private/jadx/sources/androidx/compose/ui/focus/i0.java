package androidx.compose.ui.focus;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.l(message = "Use FocusRequesterModifierNode instead")
public interface i0 extends androidx.compose.ui.a0.c {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull i0 i0Var, @NotNull Function1<? super androidx.compose.ui.a0.c, Boolean> function1) {
            return i0.super.N(function1);
        }

        @Deprecated
        public static boolean b(@NotNull i0 i0Var, @NotNull Function1<? super androidx.compose.ui.a0.c, Boolean> function1) {
            return i0.super.X(function1);
        }

        @Deprecated
        public static <R> R c(@NotNull i0 i0Var, R r10, @NotNull Function2<? super R, ? super androidx.compose.ui.a0.c, ? extends R> function2) {
            return (R) i0.super.J(r10, function2);
        }

        @Deprecated
        public static <R> R d(@NotNull i0 i0Var, R r10, @NotNull Function2<? super androidx.compose.ui.a0.c, ? super R, ? extends R> function2) {
            return (R) i0.super.b0(r10, function2);
        }

        @Deprecated
        @NotNull
        public static androidx.compose.ui.a0 e(@NotNull i0 i0Var, @NotNull androidx.compose.ui.a0 a0Var) {
            return i0.super.B2(a0Var);
        }
    }

    @NotNull
    g0 n1();
}
