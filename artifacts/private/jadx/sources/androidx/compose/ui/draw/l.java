package androidx.compose.ui.draw;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface l extends m {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull l lVar, @NotNull Function1<? super androidx.compose.ui.a0.c, Boolean> function1) {
            return l.super.N(function1);
        }

        @Deprecated
        public static boolean b(@NotNull l lVar, @NotNull Function1<? super androidx.compose.ui.a0.c, Boolean> function1) {
            return l.super.X(function1);
        }

        @Deprecated
        public static <R> R c(@NotNull l lVar, R r10, @NotNull Function2<? super R, ? super androidx.compose.ui.a0.c, ? extends R> function2) {
            return (R) l.super.J(r10, function2);
        }

        @Deprecated
        public static <R> R d(@NotNull l lVar, R r10, @NotNull Function2<? super androidx.compose.ui.a0.c, ? super R, ? extends R> function2) {
            return (R) l.super.b0(r10, function2);
        }

        @Deprecated
        @NotNull
        public static androidx.compose.ui.a0 e(@NotNull l lVar, @NotNull androidx.compose.ui.a0 a0Var) {
            return l.super.B2(a0Var);
        }
    }

    void j3(@NotNull f fVar);
}
