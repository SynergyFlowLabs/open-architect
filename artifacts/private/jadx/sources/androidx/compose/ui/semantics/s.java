package androidx.compose.ui.semantics;

import kotlin.b1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface s extends androidx.compose.ui.a0.c {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull s sVar, @NotNull Function1<? super androidx.compose.ui.a0.c, Boolean> function1) {
            return s.super.N(function1);
        }

        @Deprecated
        public static boolean b(@NotNull s sVar, @NotNull Function1<? super androidx.compose.ui.a0.c, Boolean> function1) {
            return s.super.X(function1);
        }

        @Deprecated
        public static <R> R c(@NotNull s sVar, R r10, @NotNull Function2<? super R, ? super androidx.compose.ui.a0.c, ? extends R> function2) {
            return (R) s.super.J(r10, function2);
        }

        @Deprecated
        public static <R> R d(@NotNull s sVar, R r10, @NotNull Function2<? super androidx.compose.ui.a0.c, ? super R, ? extends R> function2) {
            return (R) s.super.b0(r10, function2);
        }

        @Deprecated
        public static int e(@NotNull s sVar) {
            return s.super.getId();
        }

        @kotlin.l(message = "SemanticsModifier.id is now unused and has been set to a fixed value. Retrieve the id from LayoutInfo instead.", replaceWith = @b1(expression = "", imports = {}))
        public static /* synthetic */ void f() {
        }

        @Deprecated
        @NotNull
        public static androidx.compose.ui.a0 g(@NotNull s sVar, @NotNull androidx.compose.ui.a0 a0Var) {
            return s.super.B2(a0Var);
        }
    }

    default int getId() {
        return -1;
    }

    @NotNull
    SemanticsConfiguration q0();
}
