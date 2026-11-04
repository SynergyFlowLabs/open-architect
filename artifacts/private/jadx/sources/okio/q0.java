package okio;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,236:1\n86#2:237\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n*L\n55#1:237\n*E\n"})
final class q0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final OutputStream f335065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final e1 f335066b;

    public q0(@NotNull OutputStream out, @NotNull e1 timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f335065a = out;
        this.f335066b = timeout;
    }

    @Override // okio.z0
    public void Ga(@NotNull l source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        i.e(source.size(), 0L, j10);
        while (j10 > 0) {
            this.f335066b.j();
            w0 w0Var = source.f335034a;
            Intrinsics.checkNotNull(w0Var);
            int iMin = (int) Math.min(j10, w0Var.f335130c - w0Var.f335129b);
            this.f335065a.write(w0Var.f335128a, w0Var.f335129b, iMin);
            w0Var.f335129b += iMin;
            long j11 = iMin;
            j10 -= j11;
            source.B0(source.size() - j11);
            if (w0Var.f335129b == w0Var.f335130c) {
                source.f335034a = w0Var.b();
                x0.d(w0Var);
            }
        }
    }

    @Override // okio.z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f335065a.close();
    }

    @Override // okio.z0, java.io.Flushable
    public void flush() throws IOException {
        this.f335065a.flush();
    }

    @Override // okio.z0
    @NotNull
    public e1 timeout() {
        return this.f335066b;
    }

    @NotNull
    public String toString() {
        return "sink(" + this.f335065a + ')';
    }
}
