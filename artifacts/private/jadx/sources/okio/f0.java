package okio;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/InputStreamSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,236:1\n1#2:237\n86#3:238\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/InputStreamSource\n*L\n92#1:238\n*E\n"})
class f0 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InputStream f334892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final e1 f334893b;

    public f0(@NotNull InputStream input, @NotNull e1 timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f334892a = input;
        this.f334893b = timeout;
    }

    @Override // okio.b1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f334892a.close();
    }

    @Override // okio.b1
    public long read(@NotNull l sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        try {
            this.f334893b.j();
            w0 w0VarT0 = sink.T0(1);
            int i10 = this.f334892a.read(w0VarT0.f335128a, w0VarT0.f335130c, (int) Math.min(j10, 8192 - w0VarT0.f335130c));
            if (i10 == -1) {
                if (w0VarT0.f335129b == w0VarT0.f335130c) {
                    sink.f335034a = w0VarT0.b();
                    x0.d(w0VarT0);
                }
                return -1L;
            }
            w0VarT0.f335130c += i10;
            long j11 = i10;
            sink.B0(sink.size() + j11);
            return j11;
        } catch (AssertionError e10) {
            if (l0.l(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // okio.b1
    @NotNull
    public e1 timeout() {
        return this.f334893b;
    }

    @NotNull
    public String toString() {
        return "source(" + this.f334892a + ')';
    }
}
