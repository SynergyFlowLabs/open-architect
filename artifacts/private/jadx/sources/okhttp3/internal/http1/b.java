package okhttp3.internal.http1;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.internal.http.i;
import okhttp3.internal.http.k;
import okhttp3.u;
import okhttp3.v;
import okio.b1;
import okio.e1;
import okio.l;
import okio.m;
import okio.n;
import okio.z;
import okio.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
public final class b implements okhttp3.internal.http.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final d f334214j = new d(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f334215k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f334216l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f334217m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f334218n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f334219o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f334220p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f334221q = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f334222r = 6;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final b0 f334223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final okhttp3.internal.connection.f f334224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final n f334225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final m f334226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f334227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final okhttp3.internal.http1.a f334228h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private u f334229i;

    private abstract class a implements b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final z f334230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f334231b;

        public a() {
            this.f334230a = new z(b.this.f334225e.timeout());
        }

        protected final boolean a() {
            return this.f334231b;
        }

        @NotNull
        protected final z b() {
            return this.f334230a;
        }

        public final void c() {
            if (b.this.f334227g == 6) {
                return;
            }
            if (b.this.f334227g == 5) {
                b.this.r(this.f334230a);
                b.this.f334227g = 6;
            } else {
                throw new IllegalStateException("state: " + b.this.f334227g);
            }
        }

        protected final void d(boolean z10) {
            this.f334231b = z10;
        }

        @Override // okio.b1
        public long read(@NotNull l sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return b.this.f334225e.read(sink, j10);
            } catch (IOException e10) {
                b.this.C0().E();
                c();
                throw e10;
            }
        }

        @Override // okio.b1
        @NotNull
        public e1 timeout() {
            return this.f334230a;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.http1.b$b, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    private final class C2361b implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final z f334233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f334234b;

        public C2361b() {
            this.f334233a = new z(b.this.f334226f.timeout());
        }

        @Override // okio.z0
        public void Ga(@NotNull l source, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f334234b) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            if (j10 == 0) {
                return;
            }
            b.this.f334226f.q7(j10);
            b.this.f334226f.pa("\r\n");
            b.this.f334226f.Ga(source, j10);
            b.this.f334226f.pa("\r\n");
        }

        @Override // okio.z0, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f334234b) {
                return;
            }
            this.f334234b = true;
            b.this.f334226f.pa("0\r\n\r\n");
            b.this.r(this.f334233a);
            b.this.f334227g = 3;
        }

        @Override // okio.z0, java.io.Flushable
        public synchronized void flush() {
            try {
                if (this.f334234b) {
                    return;
                }
                b.this.f334226f.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // okio.z0
        @NotNull
        public e1 timeout() {
            return this.f334233a;
        }
    }

    @SourceDebugExtension({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    private final class c extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final v f334236d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f334237e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f334238f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b f334239g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull b bVar, v url) {
            super();
            Intrinsics.checkNotNullParameter(url, "url");
            this.f334239g = bVar;
            this.f334236d = url;
            this.f334237e = -1L;
            this.f334238f = true;
        }

        private final void e() throws IOException {
            if (this.f334237e != -1) {
                this.f334239g.f334225e.lb();
            }
            try {
                this.f334237e = this.f334239g.f334225e.J8();
                String string = StringsKt.E5(this.f334239g.f334225e.lb()).toString();
                if (this.f334237e < 0 || (string.length() > 0 && !StringsKt.u2(string, ";", false, 2, null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f334237e + string + '\"');
                }
                if (this.f334237e == 0) {
                    this.f334238f = false;
                    b bVar = this.f334239g;
                    bVar.f334229i = bVar.f334228h.b();
                    b0 b0Var = this.f334239g.f334223c;
                    Intrinsics.checkNotNull(b0Var);
                    okhttp3.n nVarP = b0Var.P();
                    v vVar = this.f334236d;
                    u uVar = this.f334239g.f334229i;
                    Intrinsics.checkNotNull(uVar);
                    okhttp3.internal.http.e.g(nVarP, vVar, uVar);
                    c();
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // okio.b1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.f334238f && !jk.f.w(this, 100, TimeUnit.MILLISECONDS)) {
                this.f334239g.C0().E();
                c();
            }
            d(true);
        }

        @Override // okhttp3.internal.http1.b.a, okio.b1
        public long read(@NotNull l sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (a()) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            if (!this.f334238f) {
                return -1L;
            }
            long j11 = this.f334237e;
            if (j11 == 0 || j11 == -1) {
                e();
                if (!this.f334238f) {
                    return -1L;
                }
            }
            long j12 = super.read(sink, Math.min(j10, this.f334237e));
            if (j12 != -1) {
                this.f334237e -= j12;
                return j12;
            }
            this.f334239g.C0().E();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            c();
            throw protocolException;
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @SourceDebugExtension({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    private final class e extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f334240d;

        public e(long j10) {
            super();
            this.f334240d = j10;
            if (j10 == 0) {
                c();
            }
        }

        @Override // okio.b1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.f334240d != 0 && !jk.f.w(this, 100, TimeUnit.MILLISECONDS)) {
                b.this.C0().E();
                c();
            }
            d(true);
        }

        @Override // okhttp3.internal.http1.b.a, okio.b1
        public long read(@NotNull l sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (a()) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            long j11 = this.f334240d;
            if (j11 == 0) {
                return -1L;
            }
            long j12 = super.read(sink, Math.min(j11, j10));
            if (j12 == -1) {
                b.this.C0().E();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                c();
                throw protocolException;
            }
            long j13 = this.f334240d - j12;
            this.f334240d = j13;
            if (j13 == 0) {
                c();
            }
            return j12;
        }
    }

    @SourceDebugExtension({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    private final class f implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final z f334242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f334243b;

        public f() {
            this.f334242a = new z(b.this.f334226f.timeout());
        }

        @Override // okio.z0
        public void Ga(@NotNull l source, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f334243b) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            jk.f.n(source.size(), 0L, j10);
            b.this.f334226f.Ga(source, j10);
        }

        @Override // okio.z0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f334243b) {
                return;
            }
            this.f334243b = true;
            b.this.r(this.f334242a);
            b.this.f334227g = 3;
        }

        @Override // okio.z0, java.io.Flushable
        public void flush() throws IOException {
            if (this.f334243b) {
                return;
            }
            b.this.f334226f.flush();
        }

        @Override // okio.z0
        @NotNull
        public e1 timeout() {
            return this.f334242a;
        }
    }

    @SourceDebugExtension({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    private final class g extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f334245d;

        public g() {
            super();
        }

        @Override // okio.b1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (!this.f334245d) {
                c();
            }
            d(true);
        }

        @Override // okhttp3.internal.http1.b.a, okio.b1
        public long read(@NotNull l sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (a()) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            if (this.f334245d) {
                return -1L;
            }
            long j11 = super.read(sink, j10);
            if (j11 != -1) {
                return j11;
            }
            this.f334245d = true;
            c();
            return -1L;
        }
    }

    public b(@Nullable b0 b0Var, @NotNull okhttp3.internal.connection.f connection, @NotNull n source, @NotNull m sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f334223c = b0Var;
        this.f334224d = connection;
        this.f334225e = source;
        this.f334226f = sink;
        this.f334228h = new okhttp3.internal.http1.a(source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(z zVar) {
        e1 e1VarN = zVar.n();
        zVar.o(e1.f334887f);
        e1VarN.c();
        e1VarN.d();
    }

    private final boolean s(d0 d0Var) {
        return StringsKt.N1("chunked", d0Var.i(com.google.common.net.d.M0), true);
    }

    private final boolean t(f0 f0Var) {
        return StringsKt.N1("chunked", f0.T(f0Var, com.google.common.net.d.M0, null, 2, null), true);
    }

    private final z0 v() {
        if (this.f334227g == 1) {
            this.f334227g = 2;
            return new C2361b();
        }
        throw new IllegalStateException(("state: " + this.f334227g).toString());
    }

    private final b1 w(v vVar) {
        if (this.f334227g == 4) {
            this.f334227g = 5;
            return new c(this, vVar);
        }
        throw new IllegalStateException(("state: " + this.f334227g).toString());
    }

    private final b1 x(long j10) {
        if (this.f334227g == 4) {
            this.f334227g = 5;
            return new e(j10);
        }
        throw new IllegalStateException(("state: " + this.f334227g).toString());
    }

    private final z0 y() {
        if (this.f334227g == 1) {
            this.f334227g = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f334227g).toString());
    }

    private final b1 z() {
        if (this.f334227g == 4) {
            this.f334227g = 5;
            C0().E();
            return new g();
        }
        throw new IllegalStateException(("state: " + this.f334227g).toString());
    }

    public final void A(@NotNull f0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        long jA = jk.f.A(response);
        if (jA == -1) {
            return;
        }
        b1 b1VarX = x(jA);
        jk.f.X(b1VarX, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        b1VarX.close();
    }

    public final void B(@NotNull u headers, @NotNull String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        if (this.f334227g != 0) {
            throw new IllegalStateException(("state: " + this.f334227g).toString());
        }
        this.f334226f.pa(requestLine).pa("\r\n");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f334226f.pa(headers.n(i10)).pa(": ").pa(headers.w(i10)).pa("\r\n");
        }
        this.f334226f.pa("\r\n");
        this.f334227g = 1;
    }

    @Override // okhttp3.internal.http.d
    @NotNull
    public okhttp3.internal.connection.f C0() {
        return this.f334224d;
    }

    @Override // okhttp3.internal.http.d
    @NotNull
    public b1 a(@NotNull f0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!okhttp3.internal.http.e.c(response)) {
            return x(0L);
        }
        if (t(response)) {
            return w(response.x0().q());
        }
        long jA = jk.f.A(response);
        return jA != -1 ? x(jA) : z();
    }

    @Override // okhttp3.internal.http.d
    @NotNull
    public z0 b(@NotNull d0 request, long j10) throws ProtocolException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request.f() != null && request.f().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (s(request)) {
            return v();
        }
        if (j10 != -1) {
            return y();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // okhttp3.internal.http.d
    public void c() throws IOException {
        this.f334226f.flush();
    }

    @Override // okhttp3.internal.http.d
    public void cancel() {
        C0().i();
    }

    @Override // okhttp3.internal.http.d
    public void d() {
        this.f334226f.flush();
    }

    @Override // okhttp3.internal.http.d
    public long e(@NotNull f0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!okhttp3.internal.http.e.c(response)) {
            return 0L;
        }
        if (t(response)) {
            return -1L;
        }
        return jk.f.A(response);
    }

    @Override // okhttp3.internal.http.d
    public void f(@NotNull d0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        i iVar = i.f334198a;
        Proxy.Type type = C0().b().e().type();
        Intrinsics.checkNotNullExpressionValue(type, "connection.route().proxy.type()");
        B(request.k(), iVar.a(request, type));
    }

    @Override // okhttp3.internal.http.d
    @Nullable
    public f0.a g(boolean z10) {
        int i10 = this.f334227g;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.f334227g).toString());
        }
        try {
            k kVarB = k.f334202d.b(this.f334228h.c());
            f0.a aVarW = new f0.a().B(kVarB.f334207a).g(kVarB.f334208b).y(kVarB.f334209c).w(this.f334228h.b());
            if (z10 && kVarB.f334208b == 100) {
                return null;
            }
            int i11 = kVarB.f334208b;
            if (i11 == 100) {
                this.f334227g = 3;
                return aVarW;
            }
            if (102 > i11 || i11 >= 200) {
                this.f334227g = 4;
                return aVarW;
            }
            this.f334227g = 3;
            return aVarW;
        } catch (EOFException e10) {
            throw new IOException("unexpected end of stream on " + C0().b().d().w().V(), e10);
        }
    }

    @Override // okhttp3.internal.http.d
    @NotNull
    public u h() {
        if (this.f334227g != 6) {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        u uVar = this.f334229i;
        return uVar == null ? jk.f.f307484b : uVar;
    }

    public final boolean u() {
        return this.f334227g == 6;
    }
}
