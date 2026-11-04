package okio;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class y implements b1 {

    @NotNull
    private final b1 delegate;

    public y(@NotNull b1 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @kotlin.b1(expression = "delegate", imports = {}))
    @oj.i(name = "-deprecated_delegate")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final b1 m1617deprecated_delegate() {
        return this.delegate;
    }

    @Override // okio.b1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @oj.i(name = "delegate")
    @NotNull
    public final b1 delegate() {
        return this.delegate;
    }

    @Override // okio.b1
    public long read(@NotNull l sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return this.delegate.read(sink, j10);
    }

    @Override // okio.b1
    @NotNull
    public e1 timeout() {
        return this.delegate.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
