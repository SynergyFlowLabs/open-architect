package okio;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nGzipSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n+ 2 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,152:1\n51#2:153\n1#3:154\n86#4:155\n*S KotlinDebug\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n*L\n62#1:153\n130#1:155\n*E\n"})
public final class a0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final u0 f334853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Deflater f334854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final r f334855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f334856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final CRC32 f334857e;

    public a0(@NotNull z0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        u0 u0Var = new u0(sink);
        this.f334853a = u0Var;
        Deflater deflater = new Deflater(okio.internal.o.b(), true);
        this.f334854b = deflater;
        this.f334855c = new r((m) u0Var, deflater);
        this.f334857e = new CRC32();
        l lVar = u0Var.f335112b;
        lVar.writeShort(8075);
        lVar.writeByte(8);
        lVar.writeByte(0);
        lVar.writeInt(0);
        lVar.writeByte(0);
        lVar.writeByte(0);
    }

    private final void c(l lVar, long j10) {
        w0 w0Var = lVar.f335034a;
        Intrinsics.checkNotNull(w0Var);
        while (j10 > 0) {
            int iMin = (int) Math.min(j10, w0Var.f335130c - w0Var.f335129b);
            this.f334857e.update(w0Var.f335128a, w0Var.f335129b, iMin);
            j10 -= (long) iMin;
            w0Var = w0Var.f335133f;
            Intrinsics.checkNotNull(w0Var);
        }
    }

    private final void d() {
        this.f334853a.f6((int) this.f334857e.getValue());
        this.f334853a.f6((int) this.f334854b.getBytesRead());
    }

    @Override // okio.z0
    public void Ga(@NotNull l source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (j10 == 0) {
            return;
        }
        c(source, j10);
        this.f334855c.Ga(source, j10);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @kotlin.b1(expression = "deflater", imports = {}))
    @oj.i(name = "-deprecated_deflater")
    @NotNull
    public final Deflater a() {
        return this.f334854b;
    }

    @oj.i(name = "deflater")
    @NotNull
    public final Deflater b() {
        return this.f334854b;
    }

    @Override // okio.z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f334856d) {
            return;
        }
        this.f334855c.b();
        d();
        th = null;
        try {
            this.f334854b.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f334853a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f334856d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.z0, java.io.Flushable
    public void flush() throws IOException {
        this.f334855c.flush();
    }

    @Override // okio.z0
    @NotNull
    public e1 timeout() {
        return this.f334853a.timeout();
    }
}
