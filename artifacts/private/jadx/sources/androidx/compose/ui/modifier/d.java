package androidx.compose.ui.modifier;

import androidx.compose.runtime.k7;
import androidx.compose.ui.a0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@k7
public interface d extends a0.c {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull d dVar, @NotNull Function1<? super a0.c, Boolean> function1) {
            return d.super.N(function1);
        }

        @Deprecated
        public static boolean b(@NotNull d dVar, @NotNull Function1<? super a0.c, Boolean> function1) {
            return d.super.X(function1);
        }

        @Deprecated
        public static <R> R c(@NotNull d dVar, R r10, @NotNull Function2<? super R, ? super a0.c, ? extends R> function2) {
            return (R) d.super.J(r10, function2);
        }

        @Deprecated
        public static <R> R d(@NotNull d dVar, R r10, @NotNull Function2<? super a0.c, ? super R, ? extends R> function2) {
            return (R) d.super.b0(r10, function2);
        }

        @Deprecated
        @NotNull
        public static a0 e(@NotNull d dVar, @NotNull a0 a0Var) {
            return d.super.B2(a0Var);
        }
    }

    void c7(@NotNull n nVar);
}
