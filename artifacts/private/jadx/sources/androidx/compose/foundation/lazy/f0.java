package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.q3;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface f0 {

    public static final class a {
        @Deprecated
        public static int a(@NotNull f0 f0Var) {
            return f0.super.b();
        }

        @Deprecated
        public static int b(@NotNull f0 f0Var) {
            return f0.super.f();
        }

        @Deprecated
        public static int c(@NotNull f0 f0Var) {
            return f0.super.g();
        }

        @Deprecated
        @NotNull
        public static q3 d(@NotNull f0 f0Var) {
            return f0.super.getOrientation();
        }

        @Deprecated
        public static boolean e(@NotNull f0 f0Var) {
            return f0.super.i();
        }

        @Deprecated
        public static long f(@NotNull f0 f0Var) {
            return f0.super.a();
        }
    }

    default long a() {
        return androidx.compose.ui.unit.u.f42720b.a();
    }

    default int b() {
        return 0;
    }

    int c();

    int d();

    int e();

    default int f() {
        return 0;
    }

    default int g() {
        return 0;
    }

    @NotNull
    default q3 getOrientation() {
        return q3.Vertical;
    }

    @NotNull
    List<v> h();

    default boolean i() {
        return false;
    }
}
