package androidx.compose.runtime.tooling;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface m extends f {

    public static final class a {
        @Deprecated
        @Nullable
        public static m a(@NotNull m mVar, @NotNull Object obj) {
            return m.super.c(obj);
        }

        @Deprecated
        public static int b(@NotNull m mVar) {
            return m.super.V1();
        }

        @Deprecated
        @Nullable
        public static Object c(@NotNull m mVar) {
            return m.super.X1();
        }

        @Deprecated
        public static int d(@NotNull m mVar) {
            return m.super.e2();
        }
    }

    @Nullable
    String U1();

    default int V1() {
        return 0;
    }

    @Nullable
    default Object X1() {
        return null;
    }

    default int e2() {
        return 0;
    }

    @NotNull
    Iterable<Object> getData();

    @NotNull
    Object getKey();

    @Nullable
    Object w();
}
