package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface e2 extends androidx.compose.ui.a0.c {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull e2 e2Var, @NotNull Function1<? super androidx.compose.ui.a0.c, Boolean> function1) {
            return e2.super.N(function1);
        }

        @Deprecated
        public static boolean b(@NotNull e2 e2Var, @NotNull Function1<? super androidx.compose.ui.a0.c, Boolean> function1) {
            return e2.super.X(function1);
        }

        @Deprecated
        public static <R> R c(@NotNull e2 e2Var, R r10, @NotNull Function2<? super R, ? super androidx.compose.ui.a0.c, ? extends R> function2) {
            return (R) e2.super.J(r10, function2);
        }

        @Deprecated
        public static <R> R d(@NotNull e2 e2Var, R r10, @NotNull Function2<? super androidx.compose.ui.a0.c, ? super R, ? extends R> function2) {
            return (R) e2.super.b0(r10, function2);
        }

        @Deprecated
        @NotNull
        public static androidx.compose.ui.a0 e(@NotNull e2 e2Var, @NotNull androidx.compose.ui.a0 a0Var) {
            return e2.super.B2(a0Var);
        }
    }

    @Nullable
    Object V(@NotNull androidx.compose.ui.unit.d dVar, @Nullable Object obj);
}
