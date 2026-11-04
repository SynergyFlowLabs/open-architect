package okio;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nDeflaterSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,135:1\n86#2:136\n*S KotlinDebug\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n*L\n38#1:136\n*E\n"})
public final class r implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m f335067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Deflater f335068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f335069c;

    public r(@NotNull m sink, @NotNull Deflater deflater) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.f335067a = sink;
        this.f335068b = deflater;
    }

    private final void a(boolean z10) throws IOException {
        w0 w0VarT0;
        int iDeflate;
        l lVarN = this.f335067a.n();
        while (true) {
            w0VarT0 = lVarN.T0(1);
            if (z10) {
                try {
                    Deflater deflater = this.f335068b;
                    byte[] bArr = w0VarT0.f335128a;
                    int i10 = w0VarT0.f335130c;
                    iDeflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
                } catch (NullPointerException e10) {
                    throw new IOException("Deflater already closed", e10);
                }
            } else {
                Deflater deflater2 = this.f335068b;
                byte[] bArr2 = w0VarT0.f335128a;
                int i11 = w0VarT0.f335130c;
                iDeflate = deflater2.deflate(bArr2, i11, 8192 - i11);
            }
            if (iDeflate > 0) {
                w0VarT0.f335130c += iDeflate;
                lVarN.B0(lVarN.size() + ((long) iDeflate));
                this.f335067a.L9();
            } else if (this.f335068b.needsInput()) {
                break;
            }
        }
        if (w0VarT0.f335129b == w0VarT0.f335130c) {
            lVarN.f335034a = w0VarT0.b();
            x0.d(w0VarT0);
        }
    }

    @Override // okio.z0
    public void Ga(@NotNull l source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        i.e(source.size(), 0L, j10);
        while (j10 > 0) {
            w0 w0Var = source.f335034a;
            Intrinsics.checkNotNull(w0Var);
            int iMin = (int) Math.min(j10, w0Var.f335130c - w0Var.f335129b);
            this.f335068b.setInput(w0Var.f335128a, w0Var.f335129b, iMin);
            boolean z10 = false & false;
            a(false);
            long j11 = iMin;
            source.B0(source.size() - j11);
            int i10 = w0Var.f335129b + iMin;
            w0Var.f335129b = i10;
            if (i10 == w0Var.f335130c) {
                source.f335034a = w0Var.b();
                x0.d(w0Var);
            }
            j10 -= j11;
        }
    }

    public final void b() throws IOException {
        this.f335068b.finish();
        a(false);
    }

    @Override // okio.z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f335069c) {
            return;
        }
        b();
        th = null;
        try {
            this.f335068b.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f335067a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f335069c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.z0, java.io.Flushable
    public void flush() throws IOException {
        a(true);
        this.f335067a.flush();
    }

    @Override // okio.z0
    @NotNull
    public e1 timeout() {
        return this.f335067a.timeout();
    }

    @NotNull
    public String toString() {
        return "DeflaterSink(" + this.f335067a + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(@NotNull z0 sink, @NotNull Deflater deflater) {
        this(l0.d(sink), deflater);
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
    }
}
