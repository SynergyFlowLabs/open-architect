package okio;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
final class k implements z0 {
    @Override // okio.z0
    public void Ga(@NotNull l source, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        source.skip(j10);
    }

    @Override // okio.z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.z0, java.io.Flushable
    public void flush() {
    }

    @Override // okio.z0
    @NotNull
    public e1 timeout() {
        return e1.f334887f;
    }
}
