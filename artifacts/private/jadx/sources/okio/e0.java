package okio;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nInflaterSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,132:1\n1#2:133\n86#3:134\n*S KotlinDebug\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n*L\n66#1:134\n*E\n"})
public final class e0 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n f334882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Inflater f334883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f334884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f334885d;

    public e0(@NotNull n source, @NotNull Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f334882a = source;
        this.f334883b = inflater;
    }

    private final void c() throws IOException {
        int i10 = this.f334884c;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f334883b.getRemaining();
        this.f334884c -= remaining;
        this.f334882a.skip(remaining);
    }

    public final long a(@NotNull l sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f334885d) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        if (j10 == 0) {
            return 0L;
        }
        try {
            w0 w0VarT0 = sink.T0(1);
            int iMin = (int) Math.min(j10, 8192 - w0VarT0.f335130c);
            b();
            int iInflate = this.f334883b.inflate(w0VarT0.f335128a, w0VarT0.f335130c, iMin);
            c();
            if (iInflate > 0) {
                w0VarT0.f335130c += iInflate;
                long j11 = iInflate;
                sink.B0(sink.size() + j11);
                return j11;
            }
            if (w0VarT0.f335129b == w0VarT0.f335130c) {
                sink.f335034a = w0VarT0.b();
                x0.d(w0VarT0);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    public final boolean b() throws IOException {
        if (!this.f334883b.needsInput()) {
            return false;
        }
        if (this.f334882a.y1()) {
            return true;
        }
        w0 w0Var = this.f334882a.n().f335034a;
        Intrinsics.checkNotNull(w0Var);
        int i10 = w0Var.f335130c;
        int i11 = w0Var.f335129b;
        int i12 = i10 - i11;
        this.f334884c = i12;
        this.f334883b.setInput(w0Var.f335128a, i11, i12);
        return false;
    }

    @Override // okio.b1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f334885d) {
            return;
        }
        this.f334883b.end();
        this.f334885d = true;
        this.f334882a.close();
    }

    @Override // okio.b1
    public long read(@NotNull l sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            long jA = a(sink, j10);
            if (jA > 0) {
                return jA;
            }
            if (!this.f334883b.finished() && !this.f334883b.needsDictionary()) {
            }
            return -1L;
        } while (!this.f334882a.y1());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // okio.b1
    @NotNull
    public e1 timeout() {
        return this.f334882a.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e0(@NotNull b1 source, @NotNull Inflater inflater) {
        this(l0.e(source), inflater);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
    }
}
