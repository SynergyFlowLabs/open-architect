package kotlinx.io;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
final class i implements o {
    @Override // kotlinx.io.o
    public void V5(@NotNull b source, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        source.skip(j10);
    }

    @Override // kotlinx.io.o, java.lang.AutoCloseable
    public void close() {
    }

    @Override // kotlinx.io.o, java.io.Flushable
    public void flush() {
    }
}
