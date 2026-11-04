package androidx.compose.ui.focus;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.l(message = "Use Modifier.focusProperties() instead")
public interface t extends androidx.compose.ui.a0.c {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull t tVar, @NotNull Function1<? super androidx.compose.ui.a0.c, Boolean> function1) {
            return t.super.N(function1);
        }

        @Deprecated
        public static boolean b(@NotNull t tVar, @NotNull Function1<? super androidx.compose.ui.a0.c, Boolean> function1) {
            return t.super.X(function1);
        }

        @Deprecated
        public static <R> R c(@NotNull t tVar, R r10, @NotNull Function2<? super R, ? super androidx.compose.ui.a0.c, ? extends R> function2) {
            return (R) t.super.J(r10, function2);
        }

        @Deprecated
        public static <R> R d(@NotNull t tVar, R r10, @NotNull Function2<? super androidx.compose.ui.a0.c, ? super R, ? extends R> function2) {
            return (R) t.super.b0(r10, function2);
        }

        @Deprecated
        @NotNull
        public static androidx.compose.ui.a0 e(@NotNull t tVar, @NotNull androidx.compose.ui.a0 a0Var) {
            return t.super.B2(a0Var);
        }
    }

    void A3(@NotNull s sVar);
}
