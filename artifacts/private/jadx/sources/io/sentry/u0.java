package io.sentry;

import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public interface u0 extends Closeable {

    public enum a {
        UNKNOWN,
        CONNECTED,
        DISCONNECTED,
        NO_PERMISSION
    }

    public interface b {
        void h(@NotNull a aVar);
    }

    @NotNull
    a L3();

    boolean Pd(@NotNull b bVar);

    void T7(@NotNull b bVar);

    @Nullable
    String k2();
}
