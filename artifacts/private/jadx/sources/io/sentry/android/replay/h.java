package io.sentry.android.replay;

import java.io.Closeable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface h extends Closeable {
    void p();

    void pause();

    void reset();

    void start();

    void stop();

    void v0(@NotNull w wVar);
}
