package androidx.compose.ui.focus;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.l(message = "Use FocusEventModifierNode instead")
public interface h extends androidx.compose.ui.a0.c {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull h hVar, @NotNull Function1<? super androidx.compose.ui.a0.c, Boolean> function1) {
            return h.super.N(function1);
        }

        @Deprecated
        public static boolean b(@NotNull h hVar, @NotNull Function1<? super androidx.compose.ui.a0.c, Boolean> function1) {
            return h.super.X(function1);
        }

        @Deprecated
        public static <R> R c(@NotNull h hVar, R r10, @NotNull Function2<? super R, ? super androidx.compose.ui.a0.c, ? extends R> function2) {
            return (R) h.super.J(r10, function2);
        }

        @Deprecated
        public static <R> R d(@NotNull h hVar, R r10, @NotNull Function2<? super androidx.compose.ui.a0.c, ? super R, ? extends R> function2) {
            return (R) h.super.b0(r10, function2);
        }

        @Deprecated
        @NotNull
        public static androidx.compose.ui.a0 e(@NotNull h hVar, @NotNull androidx.compose.ui.a0 a0Var) {
            return h.super.B2(a0Var);
        }
    }

    void Z(@NotNull p0 p0Var);
}
