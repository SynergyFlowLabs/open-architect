package okhttp3.internal.http2;

import io.sentry.k4;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.u;
import okio.b1;
import okio.e1;
import okio.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n1#2:689\n615#3,4:690\n615#3,4:694\n563#3:698\n615#3,4:699\n615#3,4:703\n563#3:707\n563#3:708\n615#3,4:709\n563#3:713\n557#3:714\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream\n*L\n176#1:690,4\n255#1:694,4\n263#1:698\n274#1:699,4\n281#1:703,4\n295#1:707\n305#1:708\n491#1:709,4\n637#1:713\n657#1:714\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final a f334438o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f334439p = 16384;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f334440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f f334441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f334442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f334443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f334444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f334445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final ArrayDeque<u> f334446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f334447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final c f334448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final b f334449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final d f334450k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final d f334451l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private okhttp3.internal.http2.b f334452m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private IOException f334453n;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n1#2:689\n615#3,4:690\n615#3,4:694\n563#3:698\n563#3:699\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSource\n*L\n407#1:690,4\n418#1:694,4\n458#1:698\n480#1:699\n*E\n"})
    public final class c implements b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f334459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f334460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final okio.l f334461c = new okio.l();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final okio.l f334462d = new okio.l();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private u f334463e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f334464f;

        public c(long j10, boolean z10) {
            this.f334459a = j10;
            this.f334460b = z10;
        }

        private final void l(long j10) {
            i iVar = i.this;
            if (jk.f.f307490h && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
            i.this.h().J1(j10);
        }

        public final boolean a() {
            return this.f334464f;
        }

        public final boolean b() {
            return this.f334460b;
        }

        @NotNull
        public final okio.l c() {
            return this.f334462d;
        }

        @Override // okio.b1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            i iVar = i.this;
            synchronized (iVar) {
                try {
                    this.f334464f = true;
                    size = this.f334462d.size();
                    this.f334462d.c();
                    Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type java.lang.Object");
                    iVar.notifyAll();
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (size > 0) {
                l(size);
            }
            i.this.b();
        }

        @NotNull
        public final okio.l d() {
            return this.f334461c;
        }

        @Nullable
        public final u e() {
            return this.f334463e;
        }

        public final void f(@NotNull okio.n source, long j10) throws IOException {
            boolean z10;
            boolean z11;
            Intrinsics.checkNotNullParameter(source, "source");
            i iVar = i.this;
            if (jk.f.f307490h && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
            long j11 = j10;
            while (j11 > 0) {
                synchronized (i.this) {
                    z10 = this.f334460b;
                    z11 = this.f334462d.size() + j11 > this.f334459a;
                    Unit unit = Unit.f312394a;
                }
                if (z11) {
                    source.skip(j11);
                    i.this.f(okhttp3.internal.http2.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    source.skip(j11);
                    return;
                }
                long j12 = source.read(this.f334461c, j11);
                if (j12 == -1) {
                    throw new EOFException();
                }
                j11 -= j12;
                i iVar2 = i.this;
                synchronized (iVar2) {
                    try {
                        if (this.f334464f) {
                            this.f334461c.c();
                        } else {
                            boolean z12 = this.f334462d.size() == 0;
                            this.f334462d.Ma(this.f334461c);
                            if (z12) {
                                Intrinsics.checkNotNull(iVar2, "null cannot be cast to non-null type java.lang.Object");
                                iVar2.notifyAll();
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            l(j10);
        }

        public final void g(boolean z10) {
            this.f334464f = z10;
        }

        public final void h(boolean z10) {
            this.f334460b = z10;
        }

        public final void j(@Nullable u uVar) {
            this.f334463e = uVar;
        }

        @Override // okio.b1
        public long read(@NotNull okio.l sink, long j10) throws IOException {
            IOException iOExceptionJ;
            boolean z10;
            long j11;
            Intrinsics.checkNotNullParameter(sink, "sink");
            long j12 = 0;
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            while (true) {
                i iVar = i.this;
                synchronized (iVar) {
                    iVar.n().A();
                    try {
                        if (iVar.i() == null || this.f334460b) {
                            iOExceptionJ = null;
                        } else {
                            iOExceptionJ = iVar.j();
                            if (iOExceptionJ == null) {
                                okhttp3.internal.http2.b bVarI = iVar.i();
                                Intrinsics.checkNotNull(bVarI);
                                iOExceptionJ = new n(bVarI);
                            }
                        }
                        if (this.f334464f) {
                            throw new IOException("stream closed");
                        }
                        z10 = false;
                        if (this.f334462d.size() > j12) {
                            okio.l lVar = this.f334462d;
                            j11 = lVar.read(sink, Math.min(j10, lVar.size()));
                            iVar.E(iVar.m() + j11);
                            long jM = iVar.m() - iVar.l();
                            if (iOExceptionJ == null && jM >= iVar.h().f0().e() / 2) {
                                iVar.h().i2(iVar.k(), jM);
                                iVar.D(iVar.m());
                            }
                        } else {
                            if (!this.f334460b && iOExceptionJ == null) {
                                iVar.J();
                                z10 = true;
                            }
                            j11 = -1;
                        }
                        iVar.n().I();
                        Unit unit = Unit.f312394a;
                    } catch (Throwable th2) {
                        iVar.n().I();
                        throw th2;
                    }
                    throw th;
                }
                if (!z10) {
                    if (j11 != -1) {
                        return j11;
                    }
                    if (iOExceptionJ == null) {
                        return -1L;
                    }
                    throw iOExceptionJ;
                }
                j12 = 0;
            }
        }

        @Override // okio.b1
        @NotNull
        public e1 timeout() {
            return i.this.n();
        }
    }

    public final class d extends okio.j {
        public d() {
        }

        @Override // okio.j
        @NotNull
        protected IOException C(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException(k4.f305718l3);
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // okio.j
        protected void G() {
            i.this.f(okhttp3.internal.http2.b.CANCEL);
            i.this.h().j1();
        }

        public final void I() throws IOException {
            if (B()) {
                throw C(null);
            }
        }
    }

    public i(int i10, @NotNull f connection, boolean z10, boolean z11, @Nullable u uVar) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f334440a = i10;
        this.f334441b = connection;
        this.f334445f = connection.g0().e();
        ArrayDeque<u> arrayDeque = new ArrayDeque<>();
        this.f334446g = arrayDeque;
        this.f334448i = new c(connection.f0().e(), z11);
        this.f334449j = new b(z10);
        this.f334450k = new d();
        this.f334451l = new d();
        if (uVar == null) {
            if (!v()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (v()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(uVar);
        }
    }

    private final boolean e(okhttp3.internal.http2.b bVar, IOException iOException) {
        if (jk.f.f307490h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f334452m != null) {
                    return false;
                }
                this.f334452m = bVar;
                this.f334453n = iOException;
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                if (this.f334448i.b() && this.f334449j.c()) {
                    return false;
                }
                Unit unit = Unit.f312394a;
                this.f334441b.h1(this.f334440a);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void A(@NotNull okhttp3.internal.http2.b errorCode) {
        try {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            if (this.f334452m == null) {
                this.f334452m = errorCode;
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
            }
        } finally {
        }
    }

    public final void B(@Nullable okhttp3.internal.http2.b bVar) {
        this.f334452m = bVar;
    }

    public final void C(@Nullable IOException iOException) {
        this.f334453n = iOException;
    }

    public final void D(long j10) {
        this.f334443d = j10;
    }

    public final void E(long j10) {
        this.f334442c = j10;
    }

    public final void F(long j10) {
        this.f334445f = j10;
    }

    public final void G(long j10) {
        this.f334444e = j10;
    }

    @NotNull
    public final synchronized u H() throws IOException {
        u uVarRemoveFirst;
        this.f334450k.A();
        while (this.f334446g.isEmpty() && this.f334452m == null) {
            try {
                J();
            } catch (Throwable th2) {
                this.f334450k.I();
                throw th2;
            }
        }
        this.f334450k.I();
        if (this.f334446g.isEmpty()) {
            Throwable nVar = this.f334453n;
            if (nVar == null) {
                okhttp3.internal.http2.b bVar = this.f334452m;
                Intrinsics.checkNotNull(bVar);
                nVar = new n(bVar);
            }
            throw nVar;
        }
        uVarRemoveFirst = this.f334446g.removeFirst();
        Intrinsics.checkNotNullExpressionValue(uVarRemoveFirst, "headersQueue.removeFirst()");
        return uVarRemoveFirst;
    }

    @NotNull
    public final synchronized u I() throws IOException {
        u uVarE;
        try {
            if (!this.f334448i.b() || !this.f334448i.d().y1() || !this.f334448i.c().y1()) {
                if (this.f334452m == null) {
                    throw new IllegalStateException("too early; can't read the trailers yet");
                }
                Throwable nVar = this.f334453n;
                if (nVar == null) {
                    okhttp3.internal.http2.b bVar = this.f334452m;
                    Intrinsics.checkNotNull(bVar);
                    nVar = new n(bVar);
                }
                throw nVar;
            }
            uVarE = this.f334448i.e();
            if (uVarE == null) {
                uVarE = jk.f.f307484b;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return uVarE;
    }

    public final void J() throws InterruptedIOException {
        try {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void K(@NotNull List<okhttp3.internal.http2.c> responseHeaders, boolean z10, boolean z11) throws IOException {
        boolean z12;
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        if (jk.f.f307490h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            z12 = true;
            try {
                this.f334447h = true;
                if (z10) {
                    this.f334449j.f(true);
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z11) {
            synchronized (this.f334441b) {
                if (this.f334441b.B0() < this.f334441b.y0()) {
                    z12 = false;
                }
            }
            z11 = z12;
        }
        this.f334441b.T1(this.f334440a, z10, responseHeaders);
        if (z11) {
            this.f334441b.flush();
        }
    }

    @NotNull
    public final e1 L() {
        return this.f334451l;
    }

    public final void a(long j10) {
        this.f334445f += j10;
        if (j10 > 0) {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void b() throws IOException {
        boolean z10;
        boolean zW;
        if (jk.f.f307490h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z10 = !this.f334448i.b() && this.f334448i.a() && (this.f334449j.c() || this.f334449j.b());
                zW = w();
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            d(okhttp3.internal.http2.b.CANCEL, null);
        } else {
            if (!zW) {
                this.f334441b.h1(this.f334440a);
            }
        }
    }

    public final void c() throws Throwable {
        if (this.f334449j.b()) {
            throw new IOException("stream closed");
        }
        if (this.f334449j.c()) {
            throw new IOException("stream finished");
        }
        if (this.f334452m != null) {
            Throwable nVar = this.f334453n;
            if (nVar == null) {
                okhttp3.internal.http2.b bVar = this.f334452m;
                Intrinsics.checkNotNull(bVar);
                nVar = new n(bVar);
            }
            throw nVar;
        }
    }

    public final void d(@NotNull okhttp3.internal.http2.b rstStatusCode, @Nullable IOException iOException) throws IOException {
        Intrinsics.checkNotNullParameter(rstStatusCode, "rstStatusCode");
        if (e(rstStatusCode, iOException)) {
            this.f334441b.e2(this.f334440a, rstStatusCode);
        }
    }

    public final void f(@NotNull okhttp3.internal.http2.b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (e(errorCode, null)) {
            this.f334441b.f2(this.f334440a, errorCode);
        }
    }

    public final void g(@NotNull u trailers) {
        Intrinsics.checkNotNullParameter(trailers, "trailers");
        synchronized (this) {
            try {
                if (this.f334449j.c()) {
                    throw new IllegalStateException("already finished");
                }
                if (trailers.size() == 0) {
                    throw new IllegalArgumentException("trailers.size() == 0");
                }
                this.f334449j.g(trailers);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public final f h() {
        return this.f334441b;
    }

    @Nullable
    public final synchronized okhttp3.internal.http2.b i() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f334452m;
    }

    @Nullable
    public final IOException j() {
        return this.f334453n;
    }

    public final int k() {
        return this.f334440a;
    }

    public final long l() {
        return this.f334443d;
    }

    public final long m() {
        return this.f334442c;
    }

    @NotNull
    public final d n() {
        return this.f334450k;
    }

    @NotNull
    public final z0 o() {
        synchronized (this) {
            try {
                if (!this.f334447h && !v()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f334449j;
    }

    @NotNull
    public final b p() {
        return this.f334449j;
    }

    @NotNull
    public final b1 q() {
        return this.f334448i;
    }

    @NotNull
    public final c r() {
        return this.f334448i;
    }

    public final long s() {
        return this.f334445f;
    }

    public final long t() {
        return this.f334444e;
    }

    @NotNull
    public final d u() {
        return this.f334451l;
    }

    public final boolean v() {
        return this.f334441b.R() == ((this.f334440a & 1) == 1);
    }

    public final synchronized boolean w() {
        try {
            if (this.f334452m != null) {
                return false;
            }
            if (this.f334448i.b() || this.f334448i.a()) {
                if ((this.f334449j.c() || this.f334449j.b()) && this.f334447h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NotNull
    public final e1 x() {
        return this.f334450k;
    }

    public final void y(@NotNull okio.n source, int i10) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!jk.f.f307490h || !Thread.holdsLock(this)) {
            this.f334448i.f(source, i10);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void z(@NotNull u headers, boolean z10) {
        boolean zW;
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (jk.f.f307490h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f334447h && z10) {
                    this.f334448i.j(headers);
                } else {
                    this.f334447h = true;
                    this.f334446g.add(headers);
                }
                if (z10) {
                    this.f334448i.h(true);
                }
                zW = w();
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zW) {
            return;
        }
        this.f334441b.h1(this.f334440a);
    }

    @SourceDebugExtension({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSink\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n615#2,4:689\n615#2,4:693\n615#2,4:697\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSink\n*L\n528#1:689,4\n573#1:693,4\n589#1:697,4\n*E\n"})
    public final class b implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f334454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final okio.l f334455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private u f334456c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f334457d;

        public b(boolean z10) {
            this.f334454a = z10;
            this.f334455b = new okio.l();
        }

        private final void a(boolean z10) throws IOException {
            long jMin;
            boolean z11;
            i iVar = i.this;
            synchronized (iVar) {
                try {
                    iVar.u().A();
                    while (iVar.t() >= iVar.s() && !this.f334454a && !this.f334457d && iVar.i() == null) {
                        try {
                            iVar.J();
                        } catch (Throwable th2) {
                            iVar.u().I();
                            throw th2;
                        }
                    }
                    iVar.u().I();
                    iVar.c();
                    jMin = Math.min(iVar.s() - iVar.t(), this.f334455b.size());
                    iVar.G(iVar.t() + jMin);
                    z11 = z10 && jMin == this.f334455b.size();
                    Unit unit = Unit.f312394a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            i.this.u().A();
            try {
                i.this.h().O1(i.this.k(), z11, this.f334455b, jMin);
                i.this.u().I();
            } catch (Throwable th4) {
                i.this.u().I();
                throw th4;
            }
        }

        @Override // okio.z0
        public void Ga(@NotNull okio.l source, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            i iVar = i.this;
            if (jk.f.f307490h && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
            this.f334455b.Ga(source, j10);
            while (this.f334455b.size() >= 16384) {
                a(false);
            }
        }

        public final boolean b() {
            return this.f334457d;
        }

        public final boolean c() {
            return this.f334454a;
        }

        @Override // okio.z0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            i iVar = i.this;
            if (jk.f.f307490h && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
            i iVar2 = i.this;
            synchronized (iVar2) {
                try {
                    if (this.f334457d) {
                        return;
                    }
                    boolean z10 = iVar2.i() == null;
                    Unit unit = Unit.f312394a;
                    if (!i.this.p().f334454a) {
                        boolean z11 = this.f334455b.size() > 0;
                        if (this.f334456c != null) {
                            while (this.f334455b.size() > 0) {
                                a(false);
                            }
                            f fVarH = i.this.h();
                            int iK = i.this.k();
                            u uVar = this.f334456c;
                            Intrinsics.checkNotNull(uVar);
                            fVarH.T1(iK, z10, jk.f.b0(uVar));
                        } else if (z11) {
                            while (this.f334455b.size() > 0) {
                                a(true);
                            }
                        } else if (z10) {
                            i.this.h().O1(i.this.k(), true, null, 0L);
                        }
                    }
                    synchronized (i.this) {
                        try {
                            this.f334457d = true;
                            Unit unit2 = Unit.f312394a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    i.this.h().flush();
                    i.this.b();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Nullable
        public final u d() {
            return this.f334456c;
        }

        public final void e(boolean z10) {
            this.f334457d = z10;
        }

        public final void f(boolean z10) {
            this.f334454a = z10;
        }

        @Override // okio.z0, java.io.Flushable
        public void flush() throws IOException {
            i iVar = i.this;
            if (jk.f.f307490h && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
            i iVar2 = i.this;
            synchronized (iVar2) {
                try {
                    iVar2.c();
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            while (this.f334455b.size() > 0) {
                a(false);
                i.this.h().flush();
            }
        }

        public final void g(@Nullable u uVar) {
            this.f334456c = uVar;
        }

        @Override // okio.z0
        @NotNull
        public e1 timeout() {
            return i.this.u();
        }

        public /* synthetic */ b(i iVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }
    }
}
