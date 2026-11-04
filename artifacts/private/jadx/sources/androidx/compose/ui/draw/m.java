package androidx.compose.ui.draw;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface m extends androidx.compose.ui.a0.c {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull m mVar, @NotNull Function1<? super androidx.compose.ui.a0.c, Boolean> function1) {
            return m.super.N(function1);
        }

        @Deprecated
        public static boolean b(@NotNull m mVar, @NotNull Function1<? super androidx.compose.ui.a0.c, Boolean> function1) {
            return m.super.X(function1);
        }

        @Deprecated
        public static <R> R c(@NotNull m mVar, R r10, @NotNull Function2<? super R, ? super androidx.compose.ui.a0.c, ? extends R> function2) {
            return (R) m.super.J(r10, function2);
        }

        @Deprecated
        public static <R> R d(@NotNull m mVar, R r10, @NotNull Function2<? super androidx.compose.ui.a0.c, ? super R, ? extends R> function2) {
            return (R) m.super.b0(r10, function2);
        }

        @Deprecated
        @NotNull
        public static androidx.compose.ui.a0 e(@NotNull m mVar, @NotNull androidx.compose.ui.a0 a0Var) {
            return m.super.B2(a0Var);
        }
    }

    void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar);
}
