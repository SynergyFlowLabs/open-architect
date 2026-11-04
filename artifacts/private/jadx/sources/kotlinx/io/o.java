package kotlinx.io;

import java.io.Flushable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface o extends AutoCloseable, Flushable {
    void V5(@NotNull b bVar, long j10);

    @Override // java.lang.AutoCloseable
    void close();

    void flush();
}
