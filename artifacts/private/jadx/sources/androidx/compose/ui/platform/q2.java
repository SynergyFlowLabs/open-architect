package androidx.compose.ui.platform;

import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface q2 {

    public static final class a {
        @Deprecated
        @NotNull
        public static Sequence<i4> a(@NotNull q2 q2Var) {
            return q2.super.f();
        }

        @Deprecated
        @Nullable
        public static String b(@NotNull q2 q2Var) {
            return q2.super.h();
        }

        @Deprecated
        @Nullable
        public static Object c(@NotNull q2 q2Var) {
            return q2.super.b();
        }
    }

    @Nullable
    default Object b() {
        return null;
    }

    @NotNull
    default Sequence<i4> f() {
        return kotlin.sequences.o.g();
    }

    @Nullable
    default String h() {
        return null;
    }
}
