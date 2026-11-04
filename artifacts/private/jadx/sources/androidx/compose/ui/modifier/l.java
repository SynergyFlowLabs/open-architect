package androidx.compose.ui.modifier;

import androidx.compose.runtime.k7;
import androidx.compose.ui.a0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@k7
public interface l<T> extends a0.c {

    public static final class a {
        @Deprecated
        public static <T> boolean a(@NotNull l<T> lVar, @NotNull Function1<? super a0.c, Boolean> function1) {
            return l.super.N(function1);
        }

        @Deprecated
        public static <T> boolean b(@NotNull l<T> lVar, @NotNull Function1<? super a0.c, Boolean> function1) {
            return l.super.X(function1);
        }

        @Deprecated
        public static <T, R> R c(@NotNull l<T> lVar, R r10, @NotNull Function2<? super R, ? super a0.c, ? extends R> function2) {
            return (R) l.super.J(r10, function2);
        }

        @Deprecated
        public static <T, R> R d(@NotNull l<T> lVar, R r10, @NotNull Function2<? super a0.c, ? super R, ? extends R> function2) {
            return (R) l.super.b0(r10, function2);
        }

        @Deprecated
        @NotNull
        public static <T> a0 e(@NotNull l<T> lVar, @NotNull a0 a0Var) {
            return l.super.B2(a0Var);
        }
    }

    @NotNull
    p<T> getKey();

    T getValue();
}
