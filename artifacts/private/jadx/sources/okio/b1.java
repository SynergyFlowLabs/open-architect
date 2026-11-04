package okio;

import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface b1 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long read(@NotNull l lVar, long j10) throws IOException;

    @NotNull
    e1 timeout();
}
