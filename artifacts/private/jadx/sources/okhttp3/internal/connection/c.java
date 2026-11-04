package okhttp3.internal.connection;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.r;
import okhttp3.u;
import okio.b1;
import okio.l;
import okio.l0;
import okio.x;
import okio.y;
import okio.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final e f334074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final r f334075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final d f334076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final okhttp3.internal.http.d f334077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f334078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f334079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final f f334080g;

    @SourceDebugExtension({"SMAP\nExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exchange.kt\nokhttp3/internal/connection/Exchange$RequestBodySink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"})
    private final class a extends x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f334081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f334082c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f334083d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f334084e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c f334085f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull c cVar, z0 delegate, long j10) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f334085f = cVar;
            this.f334081b = j10;
        }

        private final <E extends IOException> E c(E e10) {
            if (this.f334082c) {
                return e10;
            }
            this.f334082c = true;
            return (E) this.f334085f.a(this.f334083d, false, true, e10);
        }

        @Override // okio.x, okio.z0
        public void Ga(@NotNull l source, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f334084e) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            long j11 = this.f334081b;
            if (j11 != -1 && this.f334083d + j10 > j11) {
                throw new ProtocolException("expected " + this.f334081b + " bytes but received " + (this.f334083d + j10));
            }
            try {
                super.Ga(source, j10);
                this.f334083d += j10;
            } catch (IOException e10) {
                throw c(e10);
            }
        }

        @Override // okio.x, okio.z0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f334084e) {
                return;
            }
            this.f334084e = true;
            long j10 = this.f334081b;
            if (j10 != -1 && this.f334083d != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                c(null);
            } catch (IOException e10) {
                throw c(e10);
            }
        }

        @Override // okio.x, okio.z0, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                throw c(e10);
            }
        }
    }

    @SourceDebugExtension({"SMAP\nExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exchange.kt\nokhttp3/internal/connection/Exchange$ResponseBodySource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"})
    public final class b extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f334086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f334087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f334088c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f334089d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f334090e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c f334091f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull c cVar, b1 delegate, long j10) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f334091f = cVar;
            this.f334086a = j10;
            this.f334088c = true;
            if (j10 == 0) {
                int i10 = 4 >> 0;
                a(null);
            }
        }

        public final <E extends IOException> E a(E e10) {
            if (this.f334089d) {
                return e10;
            }
            this.f334089d = true;
            if (e10 == null && this.f334088c) {
                this.f334088c = false;
                this.f334091f.i().w(this.f334091f.g());
            }
            return (E) this.f334091f.a(this.f334087b, true, false, e10);
        }

        @Override // okio.y, okio.b1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f334090e) {
                return;
            }
            this.f334090e = true;
            try {
                super.close();
                a(null);
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // okio.y, okio.b1
        public long read(@NotNull l sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.f334090e) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            try {
                long j11 = delegate().read(sink, j10);
                if (this.f334088c) {
                    this.f334088c = false;
                    this.f334091f.i().w(this.f334091f.g());
                }
                if (j11 == -1) {
                    a(null);
                    return -1L;
                }
                long j12 = this.f334087b + j11;
                long j13 = this.f334086a;
                if (j13 != -1 && j12 > j13) {
                    throw new ProtocolException("expected " + this.f334086a + " bytes but received " + j12);
                }
                this.f334087b = j12;
                if (j12 == j13) {
                    a(null);
                }
                return j11;
            } catch (IOException e10) {
                throw a(e10);
            }
        }
    }

    public c(@NotNull e call, @NotNull r eventListener, @NotNull d finder, @NotNull okhttp3.internal.http.d codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f334074a = call;
        this.f334075b = eventListener;
        this.f334076c = finder;
        this.f334077d = codec;
        this.f334080g = codec.C0();
    }

    private final void u(IOException iOException) {
        this.f334079f = true;
        this.f334076c.h(iOException);
        this.f334077d.C0().L(this.f334074a, iOException);
    }

    public final <E extends IOException> E a(long j10, boolean z10, boolean z11, E e10) {
        if (e10 != null) {
            u(e10);
        }
        if (z11) {
            if (e10 != null) {
                this.f334075b.s(this.f334074a, e10);
            } else {
                this.f334075b.q(this.f334074a, j10);
            }
        }
        if (z10) {
            if (e10 != null) {
                this.f334075b.x(this.f334074a, e10);
            } else {
                this.f334075b.v(this.f334074a, j10);
            }
        }
        return (E) this.f334074a.t(this, z11, z10, e10);
    }

    public final void b() {
        this.f334077d.cancel();
    }

    @NotNull
    public final z0 c(@NotNull d0 request, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f334078e = z10;
        e0 e0VarF = request.f();
        Intrinsics.checkNotNull(e0VarF);
        long jContentLength = e0VarF.contentLength();
        this.f334075b.r(this.f334074a);
        return new a(this, this.f334077d.b(request, jContentLength), jContentLength);
    }

    public final void d() {
        this.f334077d.cancel();
        this.f334074a.t(this, true, true, null);
    }

    public final void e() throws IOException {
        try {
            this.f334077d.d();
        } catch (IOException e10) {
            this.f334075b.s(this.f334074a, e10);
            u(e10);
            throw e10;
        }
    }

    public final void f() throws IOException {
        try {
            this.f334077d.c();
        } catch (IOException e10) {
            this.f334075b.s(this.f334074a, e10);
            u(e10);
            throw e10;
        }
    }

    @NotNull
    public final e g() {
        return this.f334074a;
    }

    @NotNull
    public final f h() {
        return this.f334080g;
    }

    @NotNull
    public final r i() {
        return this.f334075b;
    }

    @NotNull
    public final d j() {
        return this.f334076c;
    }

    public final boolean k() {
        return this.f334079f;
    }

    public final boolean l() {
        return !Intrinsics.areEqual(this.f334076c.d().w().F(), this.f334080g.b().d().w().F());
    }

    public final boolean m() {
        return this.f334078e;
    }

    @NotNull
    public final okhttp3.internal.ws.e.d n() throws SocketException {
        this.f334074a.B();
        return this.f334077d.C0().C(this);
    }

    public final void o() {
        this.f334077d.C0().E();
    }

    public final void p() {
        this.f334074a.t(this, true, false, null);
    }

    @NotNull
    public final g0 q(@NotNull f0 response) throws IOException {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String strT = f0.T(response, "Content-Type", null, 2, null);
            long jE = this.f334077d.e(response);
            return new okhttp3.internal.http.h(strT, jE, l0.e(new b(this, this.f334077d.a(response), jE)));
        } catch (IOException e10) {
            this.f334075b.x(this.f334074a, e10);
            u(e10);
            throw e10;
        }
    }

    @Nullable
    public final f0.a r(boolean z10) throws IOException {
        try {
            f0.a aVarG = this.f334077d.g(z10);
            if (aVarG == null) {
                return aVarG;
            }
            aVarG.x(this);
            return aVarG;
        } catch (IOException e10) {
            this.f334075b.x(this.f334074a, e10);
            u(e10);
            throw e10;
        }
    }

    public final void s(@NotNull f0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f334075b.y(this.f334074a, response);
    }

    public final void t() {
        this.f334075b.z(this.f334074a);
    }

    @NotNull
    public final u v() throws IOException {
        return this.f334077d.h();
    }

    public final void w() {
        a(-1L, true, true, null);
    }

    public final void x(@NotNull d0 request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            this.f334075b.u(this.f334074a);
            this.f334077d.f(request);
            this.f334075b.t(this.f334074a, request);
        } catch (IOException e10) {
            this.f334075b.s(this.f334074a, e10);
            u(e10);
            throw e10;
        }
    }
}
