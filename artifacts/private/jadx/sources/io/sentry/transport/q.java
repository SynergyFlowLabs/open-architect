package io.sentry.transport;

import io.sentry.g6;
import io.sentry.n0;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface q extends Closeable {
    void H2(@NotNull g6 g6Var, @NotNull n0 n0Var) throws IOException;

    default boolean L() {
        return true;
    }

    void i(boolean z10) throws IOException;

    @Nullable
    a0 i0();

    default void oe(@NotNull g6 g6Var) throws IOException {
        H2(g6Var, new n0());
    }

    void w(long j10);
}
