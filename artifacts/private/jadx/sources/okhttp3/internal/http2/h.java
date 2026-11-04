package okhttp3.internal.http2;

import androidx.collection.g3;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.r;
import okio.b1;
import okio.e1;
import okio.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f334426e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final Logger f334427f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final okio.n f334428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f334429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b f334430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final d.a f334431d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Logger a() {
            return h.f334427f;
        }

        public final int b(int i10, int i11, int i12) throws IOException {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i12 + " > remaining length " + i10);
        }

        private a() {
        }
    }

    public static final class b implements b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final okio.n f334432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f334433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f334434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f334435d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f334436e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f334437f;

        public b(@NotNull okio.n source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f334432a = source;
        }

        private final void f() throws IOException {
            int i10 = this.f334435d;
            int iV = jk.f.V(this.f334432a);
            this.f334436e = iV;
            this.f334433b = iV;
            int iD = jk.f.d(this.f334432a.readByte(), 255);
            this.f334434c = jk.f.d(this.f334432a.readByte(), 255);
            a aVar = h.f334426e;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(e.f334306a.c(true, this.f334435d, this.f334433b, iD, this.f334434c));
            }
            int i11 = this.f334432a.readInt() & Integer.MAX_VALUE;
            this.f334435d = i11;
            if (iD == 9) {
                if (i11 != i10) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iD + " != TYPE_CONTINUATION");
            }
        }

        public final int a() {
            return this.f334434c;
        }

        public final int b() {
            return this.f334436e;
        }

        public final int c() {
            return this.f334433b;
        }

        @Override // okio.b1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public final int d() {
            return this.f334437f;
        }

        public final int e() {
            return this.f334435d;
        }

        public final void g(int i10) {
            this.f334434c = i10;
        }

        public final void h(int i10) {
            this.f334436e = i10;
        }

        public final void j(int i10) {
            this.f334433b = i10;
        }

        public final void l(int i10) {
            this.f334437f = i10;
        }

        public final void m(int i10) {
            this.f334435d = i10;
        }

        @Override // okio.b1
        public long read(@NotNull okio.l sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            while (true) {
                int i10 = this.f334436e;
                if (i10 != 0) {
                    long j11 = this.f334432a.read(sink, Math.min(j10, i10));
                    if (j11 == -1) {
                        return -1L;
                    }
                    this.f334436e -= (int) j11;
                    return j11;
                }
                this.f334432a.skip(this.f334437f);
                this.f334437f = 0;
                if ((this.f334434c & 4) != 0) {
                    return -1L;
                }
                f();
            }
        }

        @Override // okio.b1
        @NotNull
        public e1 timeout() {
            return this.f334432a.timeout();
        }
    }

    public interface c {
        void Q(int i10, int i11, @NotNull List<okhttp3.internal.http2.c> list) throws IOException;

        void W(boolean z10, int i10, int i11);

        void c(int i10, @NotNull okhttp3.internal.http2.b bVar);

        void c0(int i10, long j10);

        void d(int i10, @NotNull okhttp3.internal.http2.b bVar, @NotNull o oVar);

        void d0(int i10, @NotNull String str, @NotNull o oVar, @NotNull String str2, int i11, long j10);

        void e0();

        void f(boolean z10, @NotNull m mVar);

        void f0(int i10, int i11, int i12, boolean z10);

        void i(boolean z10, int i10, int i11, @NotNull List<okhttp3.internal.http2.c> list);

        void k(boolean z10, int i10, @NotNull okio.n nVar, int i11) throws IOException;
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(Http2::class.java.name)");
        f334427f = logger;
    }

    public h(@NotNull okio.n source, boolean z10) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f334428a = source;
        this.f334429b = z10;
        b bVar = new b(source);
        this.f334430c = bVar;
        this.f334431d = new d.a(bVar, 4096, 0, 4, null);
    }

    private final void d(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        if ((i11 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iD = (i11 & 8) != 0 ? jk.f.d(this.f334428a.readByte(), 255) : 0;
        cVar.k(z10, i12, this.f334428a, f334426e.b(i10, i11, iD));
        this.f334428a.skip(iD);
    }

    private final void e(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i10);
        }
        if (i12 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i13 = this.f334428a.readInt();
        int i14 = this.f334428a.readInt();
        int i15 = i10 - 8;
        okhttp3.internal.http2.b bVarA = okhttp3.internal.http2.b.f334247b.a(i14);
        if (bVarA == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i14);
        }
        o oVarE5 = o.f335048f;
        if (i15 > 0) {
            oVarE5 = this.f334428a.E5(i15);
        }
        cVar.d(i13, bVarA, oVarE5);
    }

    private final List<okhttp3.internal.http2.c> f(int i10, int i11, int i12, int i13) throws IOException {
        this.f334430c.h(i10);
        b bVar = this.f334430c;
        bVar.j(bVar.b());
        this.f334430c.l(i11);
        this.f334430c.g(i12);
        this.f334430c.m(i13);
        this.f334431d.l();
        return this.f334431d.e();
    }

    private final void g(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        int iD = (i11 & 8) != 0 ? jk.f.d(this.f334428a.readByte(), 255) : 0;
        if ((i11 & 32) != 0) {
            j(cVar, i12);
            i10 -= 5;
        }
        cVar.i(z10, i12, -1, f(f334426e.b(i10, i11, iD), iD, i11, i12));
    }

    private final void h(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i10);
        }
        if (i12 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        cVar.W((i11 & 1) != 0, this.f334428a.readInt(), this.f334428a.readInt());
    }

    private final void j(c cVar, int i10) throws IOException {
        int i11 = this.f334428a.readInt();
        cVar.f0(i10, i11 & Integer.MAX_VALUE, jk.f.d(this.f334428a.readByte(), 255) + 1, (Integer.MIN_VALUE & i11) != 0);
    }

    private final void l(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 == 5) {
            if (i12 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            j(cVar, i12);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i10 + " != 5");
        }
    }

    private final void m(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iD = (i11 & 8) != 0 ? jk.f.d(this.f334428a.readByte(), 255) : 0;
        cVar.Q(i12, this.f334428a.readInt() & Integer.MAX_VALUE, f(f334426e.b(i10 - 4, i11, iD), iD, i11, i12));
    }

    private final void o(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i10 + " != 4");
        }
        if (i12 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i13 = this.f334428a.readInt();
        okhttp3.internal.http2.b bVarA = okhttp3.internal.http2.b.f334247b.a(i13);
        if (bVarA != null) {
            cVar.c(i12, bVarA);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i13);
    }

    private final void q(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i11 & 1) != 0) {
            if (i10 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            cVar.e0();
            return;
        }
        if (i10 % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i10);
        }
        m mVar = new m();
        kotlin.ranges.j jVarB1 = r.B1(r.W1(0, i10), 6);
        int iL = jVarB1.l();
        int iM = jVarB1.m();
        int iN = jVarB1.n();
        if ((iN > 0 && iL <= iM) || (iN < 0 && iM <= iL)) {
            while (true) {
                int iE = jk.f.e(this.f334428a.readShort(), 65535);
                int i13 = this.f334428a.readInt();
                if (iE != 2) {
                    if (iE == 3) {
                        iE = 4;
                    } else if (iE != 4) {
                        if (iE == 5 && (i13 < 16384 || i13 > 16777215)) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i13);
                        }
                    } else {
                        if (i13 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iE = 7;
                    }
                } else if (i13 != 0 && i13 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                mVar.k(iE, i13);
                if (iL != iM) {
                    iL += iN;
                }
            }
        }
        cVar.f(false, mVar);
    }

    private final void r(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i10);
        }
        long jF = jk.f.f(this.f334428a.readInt(), g3.f12256c);
        if (jF == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        cVar.c0(i12, jF);
    }

    public final boolean b(boolean z10, @NotNull c handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        try {
            this.f334428a.q1(9L);
            int iV = jk.f.V(this.f334428a);
            if (iV > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iV);
            }
            int iD = jk.f.d(this.f334428a.readByte(), 255);
            int iD2 = jk.f.d(this.f334428a.readByte(), 255);
            int i10 = this.f334428a.readInt() & Integer.MAX_VALUE;
            Logger logger = f334427f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.f334306a.c(true, i10, iV, iD, iD2));
            }
            if (z10 && iD != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + e.f334306a.b(iD));
            }
            switch (iD) {
                case 0:
                    d(handler, iV, iD2, i10);
                    break;
                case 1:
                    g(handler, iV, iD2, i10);
                    break;
                case 2:
                    l(handler, iV, iD2, i10);
                    break;
                case 3:
                    o(handler, iV, iD2, i10);
                    break;
                case 4:
                    q(handler, iV, iD2, i10);
                    break;
                case 5:
                    m(handler, iV, iD2, i10);
                    break;
                case 6:
                    h(handler, iV, iD2, i10);
                    break;
                case 7:
                    e(handler, iV, iD2, i10);
                    break;
                case 8:
                    r(handler, iV, iD2, i10);
                    break;
                default:
                    this.f334428a.skip(iV);
                    break;
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void c(@NotNull c handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (!this.f334429b) {
            okio.n nVar = this.f334428a;
            o oVar = e.f334307b;
            o oVarE5 = nVar.E5(oVar.v0());
            Logger logger = f334427f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(jk.f.y("<< CONNECTION " + oVarE5.N(), new Object[0]));
            }
            if (!Intrinsics.areEqual(oVar, oVarE5)) {
                throw new IOException("Expected a connection header but was " + oVarE5.G0());
            }
        } else if (!b(true, handler)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f334428a.close();
    }
}
