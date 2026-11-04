package androidx.compose.animation.core;

import androidx.compose.animation.core.w;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface g<T, V extends w> {

    public static final class a {
        @Deprecated
        public static <T, V extends w> boolean a(@NotNull g<T, V> gVar, long j10) {
            return g.super.d(j10);
        }
    }

    boolean b();

    T c();

    default boolean d(long j10) {
        return j10 >= e();
    }

    long e();

    @NotNull
    z3<T, V> f();

    T g(long j10);

    @NotNull
    V i(long j10);
}
