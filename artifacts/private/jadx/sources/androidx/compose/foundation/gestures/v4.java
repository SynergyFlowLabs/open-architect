package androidx.compose.foundation.gestures;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface v4 {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull v4 v4Var) {
            return v4.super.k();
        }

        @Deprecated
        public static boolean b(@NotNull v4 v4Var) {
            return v4.super.f();
        }

        @Deprecated
        public static boolean c(@NotNull v4 v4Var) {
            return v4.super.g();
        }

        @Deprecated
        public static boolean d(@NotNull v4 v4Var) {
            return v4.super.j();
        }
    }

    static /* synthetic */ Object h(v4 v4Var, androidx.compose.foundation.q3 q3Var, Function2 function2, kotlin.coroutines.d dVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
        if ((i10 & 1) != 0) {
            q3Var = androidx.compose.foundation.q3.Default;
        }
        return v4Var.c(q3Var, function2, dVar);
    }

    boolean a();

    float b(float f10);

    @Nullable
    Object c(@NotNull androidx.compose.foundation.q3 q3Var, @NotNull Function2<? super z3, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    default boolean f() {
        return true;
    }

    default boolean g() {
        return false;
    }

    default boolean j() {
        return false;
    }

    default boolean k() {
        return true;
    }
}
