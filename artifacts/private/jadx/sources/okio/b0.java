package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.e2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nGzipSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 GzipSource.kt\nokio/-GzipSourceExtensions\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,222:1\n1#2:223\n62#3:224\n62#3:226\n62#3:228\n62#3:229\n62#3:230\n62#3:232\n62#3:234\n204#4:225\n204#4:227\n204#4:231\n204#4:233\n89#5:235\n*S KotlinDebug\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n*L\n103#1:224\n105#1:226\n117#1:228\n118#1:229\n120#1:230\n131#1:232\n142#1:234\n104#1:225\n115#1:227\n128#1:231\n139#1:233\n185#1:235\n*E\n"})
public final class b0 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f334859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final v0 f334860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Inflater f334861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final e0 f334862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final CRC32 f334863e;

    public b0(@NotNull b1 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        v0 v0Var = new v0(source);
        this.f334860b = v0Var;
        Inflater inflater = new Inflater(true);
        this.f334861c = inflater;
        this.f334862d = new e0((n) v0Var, inflater);
        this.f334863e = new CRC32();
    }

    private final void a(String str, int i10, int i11) throws IOException {
        if (i11 == i10) {
            return;
        }
        throw new IOException(str + ": actual 0x" + StringsKt.U3(i.v(i11), 8, org.locationtech.jts.geom.l.f338160j) + " != expected 0x" + StringsKt.U3(i.v(i10), 8, org.locationtech.jts.geom.l.f338160j));
    }

    private final void b() throws IOException {
        this.f334860b.q1(10L);
        byte bI = this.f334860b.f335120b.I(3L);
        boolean z10 = ((bI >> 1) & 1) == 1;
        if (z10) {
            d(this.f334860b.f335120b, 0L, 10L);
        }
        a("ID1ID2", 8075, this.f334860b.readShort());
        this.f334860b.skip(8L);
        if (((bI >> 2) & 1) == 1) {
            this.f334860b.q1(2L);
            if (z10) {
                d(this.f334860b.f335120b, 0L, 2L);
            }
            long jB4 = this.f334860b.f335120b.B4() & e2.f312492d;
            this.f334860b.q1(jB4);
            if (z10) {
                d(this.f334860b.f335120b, 0L, jB4);
            }
            this.f334860b.skip(jB4);
        }
        if (((bI >> 3) & 1) == 1) {
            long jJ5 = this.f334860b.j5((byte) 0);
            if (jJ5 == -1) {
                throw new EOFException();
            }
            if (z10) {
                d(this.f334860b.f335120b, 0L, jJ5 + 1);
            }
            this.f334860b.skip(jJ5 + 1);
        }
        if (((bI >> 4) & 1) == 1) {
            long jJ6 = this.f334860b.j5((byte) 0);
            if (jJ6 == -1) {
                throw new EOFException();
            }
            if (z10) {
                d(this.f334860b.f335120b, 0L, jJ6 + 1);
            }
            this.f334860b.skip(jJ6 + 1);
        }
        if (z10) {
            a("FHCRC", this.f334860b.B4(), (short) this.f334863e.getValue());
            this.f334863e.reset();
        }
    }

    private final void c() throws IOException {
        a("CRC", this.f334860b.fe(), (int) this.f334863e.getValue());
        a("ISIZE", this.f334860b.fe(), (int) this.f334861c.getBytesWritten());
    }

    private final void d(l lVar, long j10, long j11) {
        w0 w0Var = lVar.f335034a;
        Intrinsics.checkNotNull(w0Var);
        while (true) {
            int i10 = w0Var.f335130c;
            int i11 = w0Var.f335129b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= (long) (i10 - i11);
            w0Var = w0Var.f335133f;
            Intrinsics.checkNotNull(w0Var);
        }
        while (j11 > 0) {
            int i12 = (int) (((long) w0Var.f335129b) + j10);
            int iMin = (int) Math.min(w0Var.f335130c - i12, j11);
            this.f334863e.update(w0Var.f335128a, i12, iMin);
            j11 -= (long) iMin;
            w0Var = w0Var.f335133f;
            Intrinsics.checkNotNull(w0Var);
            j10 = 0;
        }
    }

    @Override // okio.b1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f334862d.close();
    }

    @Override // okio.b1
    public long read(@NotNull l sink, long j10) throws IOException {
        b0 b0Var;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f334859a == 0) {
            b();
            this.f334859a = (byte) 1;
        }
        if (this.f334859a == 1) {
            long size = sink.size();
            long j11 = this.f334862d.read(sink, j10);
            if (j11 != -1) {
                d(sink, size, j11);
                return j11;
            }
            b0Var = this;
            b0Var.f334859a = (byte) 2;
        } else {
            b0Var = this;
        }
        if (b0Var.f334859a == 2) {
            b0Var.c();
            b0Var.f334859a = (byte) 3;
            if (!b0Var.f334860b.y1()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // okio.b1
    @NotNull
    public e1 timeout() {
        return this.f334860b.timeout();
    }
}
