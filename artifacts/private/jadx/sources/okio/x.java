package okio;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class x implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final z0 f335135a;

    public x(@NotNull z0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f335135a = delegate;
    }

    @Override // okio.z0
    public void Ga(@NotNull l source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f335135a.Ga(source, j10);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @kotlin.b1(expression = "delegate", imports = {}))
    @oj.i(name = "-deprecated_delegate")
    @NotNull
    public final z0 a() {
        return this.f335135a;
    }

    @oj.i(name = "delegate")
    @NotNull
    public final z0 b() {
        return this.f335135a;
    }

    @Override // okio.z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f335135a.close();
    }

    @Override // okio.z0, java.io.Flushable
    public void flush() throws IOException {
        this.f335135a.flush();
    }

    @Override // okio.z0
    @NotNull
    public e1 timeout() {
        return this.f335135a.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.f335135a + ')';
    }
}
