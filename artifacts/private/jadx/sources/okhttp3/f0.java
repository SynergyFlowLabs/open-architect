package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\nokhttp3/Response\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1#2:456\n*E\n"})
public final class f0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d0 f333812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c0 f333813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f333814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f333815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final t f333816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final u f333817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final g0 f333818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final f0 f333819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final f0 f333820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final f0 f333821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f333822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f333823l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private final okhttp3.internal.connection.c f333824m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private d f333825n;

    public f0(@NotNull d0 request, @NotNull c0 protocol, @NotNull String message, int i10, @Nullable t tVar, @NotNull u headers, @Nullable g0 g0Var, @Nullable f0 f0Var, @Nullable f0 f0Var2, @Nullable f0 f0Var3, long j10, long j11, @Nullable okhttp3.internal.connection.c cVar) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f333812a = request;
        this.f333813b = protocol;
        this.f333814c = message;
        this.f333815d = i10;
        this.f333816e = tVar;
        this.f333817f = headers;
        this.f333818g = g0Var;
        this.f333819h = f0Var;
        this.f333820i = f0Var2;
        this.f333821j = f0Var3;
        this.f333822k = j10;
        this.f333823l = j11;
        this.f333824m = cVar;
    }

    public static /* synthetic */ String T(f0 f0Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return f0Var.R(str, str2);
    }

    @NotNull
    public final u B0() throws IOException {
        okhttp3.internal.connection.c cVar = this.f333824m;
        if (cVar != null) {
            return cVar.v();
        }
        throw new IllegalStateException("trailers not available");
    }

    @oj.i(name = "code")
    public final int E() {
        return this.f333815d;
    }

    @oj.i(name = "exchange")
    @Nullable
    public final okhttp3.internal.connection.c H() {
        return this.f333824m;
    }

    @oj.i(name = "handshake")
    @Nullable
    public final t I() {
        return this.f333816e;
    }

    @oj.j
    @Nullable
    public final String N(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return T(this, name, null, 2, null);
    }

    @oj.j
    @Nullable
    public final String R(@NotNull String name, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strK = this.f333817f.k(name);
        return strK == null ? str : strK;
    }

    @NotNull
    public final List<String> X(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f333817f.A(name);
    }

    @oj.i(name = "headers")
    @NotNull
    public final u Y() {
        return this.f333817f;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "body", imports = {}))
    @oj.i(name = "-deprecated_body")
    @Nullable
    public final g0 a() {
        return this.f333818g;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "cacheControl", imports = {}))
    @oj.i(name = "-deprecated_cacheControl")
    @NotNull
    public final d b() {
        return t();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "cacheResponse", imports = {}))
    @oj.i(name = "-deprecated_cacheResponse")
    @Nullable
    public final f0 c() {
        return this.f333820i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        g0 g0Var = this.f333818g;
        if (g0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        g0Var.close();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "code", imports = {}))
    @oj.i(name = "-deprecated_code")
    public final int d() {
        return this.f333815d;
    }

    public final boolean d0() {
        int i10 = this.f333815d;
        if (i10 == 307 || i10 == 308) {
            return true;
        }
        switch (i10) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "handshake", imports = {}))
    @oj.i(name = "-deprecated_handshake")
    @Nullable
    public final t e() {
        return this.f333816e;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "headers", imports = {}))
    @oj.i(name = "-deprecated_headers")
    @NotNull
    public final u f() {
        return this.f333817f;
    }

    @oj.i(name = "message")
    @NotNull
    public final String f0() {
        return this.f333814c;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "message", imports = {}))
    @oj.i(name = "-deprecated_message")
    @NotNull
    public final String g() {
        return this.f333814c;
    }

    @oj.i(name = "networkResponse")
    @Nullable
    public final f0 g0() {
        return this.f333819h;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "networkResponse", imports = {}))
    @oj.i(name = "-deprecated_networkResponse")
    @Nullable
    public final f0 h() {
        return this.f333819h;
    }

    public final boolean isSuccessful() {
        int i10 = this.f333815d;
        return 200 <= i10 && i10 < 300;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "priorResponse", imports = {}))
    @oj.i(name = "-deprecated_priorResponse")
    @Nullable
    public final f0 j() {
        return this.f333821j;
    }

    @NotNull
    public final a j0() {
        return new a(this);
    }

    @NotNull
    public final g0 k0(long j10) throws IOException {
        g0 g0Var = this.f333818g;
        Intrinsics.checkNotNull(g0Var);
        okio.n nVarPeek = g0Var.source().peek();
        okio.l lVar = new okio.l();
        nVarPeek.request(j10);
        lVar.C7(nVarPeek, Math.min(j10, nVarPeek.n().size()));
        return g0.Companion.f(lVar, this.f333818g.contentType(), lVar.size());
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "protocol", imports = {}))
    @oj.i(name = "-deprecated_protocol")
    @NotNull
    public final c0 l() {
        return this.f333813b;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "receivedResponseAtMillis", imports = {}))
    @oj.i(name = "-deprecated_receivedResponseAtMillis")
    public final long m() {
        return this.f333823l;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "request", imports = {}))
    @oj.i(name = "-deprecated_request")
    @NotNull
    public final d0 o() {
        return this.f333812a;
    }

    @oj.i(name = "priorResponse")
    @Nullable
    public final f0 o0() {
        return this.f333821j;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "sentRequestAtMillis", imports = {}))
    @oj.i(name = "-deprecated_sentRequestAtMillis")
    public final long q() {
        return this.f333822k;
    }

    @oj.i(name = "body")
    @Nullable
    public final g0 r() {
        return this.f333818g;
    }

    @oj.i(name = "protocol")
    @NotNull
    public final c0 r0() {
        return this.f333813b;
    }

    @oj.i(name = "cacheControl")
    @NotNull
    public final d t() {
        d dVar = this.f333825n;
        if (dVar != null) {
            return dVar;
        }
        d dVarC = d.f333769n.c(this.f333817f);
        this.f333825n = dVarC;
        return dVarC;
    }

    @NotNull
    public String toString() {
        return "Response{protocol=" + this.f333813b + ", code=" + this.f333815d + ", message=" + this.f333814c + ", url=" + this.f333812a.q() + AbstractJsonLexerKt.END_OBJ;
    }

    @oj.i(name = "receivedResponseAtMillis")
    public final long w0() {
        return this.f333823l;
    }

    @oj.i(name = "cacheResponse")
    @Nullable
    public final f0 x() {
        return this.f333820i;
    }

    @oj.i(name = "request")
    @NotNull
    public final d0 x0() {
        return this.f333812a;
    }

    @NotNull
    public final List<h> y() {
        String str;
        u uVar = this.f333817f;
        int i10 = this.f333815d;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return CollectionsKt.emptyList();
            }
            str = "Proxy-Authenticate";
        }
        return okhttp3.internal.http.e.b(uVar, str);
    }

    @oj.i(name = "sentRequestAtMillis")
    public final long y0() {
        return this.f333822k;
    }

    @SourceDebugExtension({"SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\nokhttp3/Response$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1#2:456\n*E\n"})
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private d0 f333826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private c0 f333827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f333828c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private String f333829d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private t f333830e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private u.a f333831f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private g0 f333832g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        private f0 f333833h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        private f0 f333834i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        private f0 f333835j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f333836k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f333837l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        private okhttp3.internal.connection.c f333838m;

        public a() {
            this.f333828c = -1;
            this.f333831f = new u.a();
        }

        private final void e(f0 f0Var) {
            if (f0Var != null && f0Var.r() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private final void f(String str, f0 f0Var) {
            if (f0Var != null) {
                if (f0Var.r() != null) {
                    throw new IllegalArgumentException((str + ".body != null").toString());
                }
                if (f0Var.g0() != null) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (f0Var.x() != null) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (f0Var.o0() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        @NotNull
        public a A(@Nullable f0 f0Var) {
            e(f0Var);
            this.f333835j = f0Var;
            return this;
        }

        @NotNull
        public a B(@NotNull c0 protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.f333827b = protocol;
            return this;
        }

        @NotNull
        public a C(long j10) {
            this.f333837l = j10;
            return this;
        }

        @NotNull
        public a D(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f333831f.l(name);
            return this;
        }

        @NotNull
        public a E(@NotNull d0 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f333826a = request;
            return this;
        }

        @NotNull
        public a F(long j10) {
            this.f333836k = j10;
            return this;
        }

        public final void G(@Nullable g0 g0Var) {
            this.f333832g = g0Var;
        }

        public final void H(@Nullable f0 f0Var) {
            this.f333834i = f0Var;
        }

        public final void I(int i10) {
            this.f333828c = i10;
        }

        public final void J(@Nullable okhttp3.internal.connection.c cVar) {
            this.f333838m = cVar;
        }

        public final void K(@Nullable t tVar) {
            this.f333830e = tVar;
        }

        public final void L(@NotNull u.a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "<set-?>");
            this.f333831f = aVar;
        }

        public final void M(@Nullable String str) {
            this.f333829d = str;
        }

        public final void N(@Nullable f0 f0Var) {
            this.f333833h = f0Var;
        }

        public final void O(@Nullable f0 f0Var) {
            this.f333835j = f0Var;
        }

        public final void P(@Nullable c0 c0Var) {
            this.f333827b = c0Var;
        }

        public final void Q(long j10) {
            this.f333837l = j10;
        }

        public final void R(@Nullable d0 d0Var) {
            this.f333826a = d0Var;
        }

        public final void S(long j10) {
            this.f333836k = j10;
        }

        @NotNull
        public a a(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f333831f.b(name, value);
            return this;
        }

        @NotNull
        public a b(@Nullable g0 g0Var) {
            this.f333832g = g0Var;
            return this;
        }

        @NotNull
        public f0 c() {
            int i10 = this.f333828c;
            if (i10 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f333828c).toString());
            }
            d0 d0Var = this.f333826a;
            if (d0Var == null) {
                throw new IllegalStateException("request == null");
            }
            c0 c0Var = this.f333827b;
            if (c0Var == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f333829d;
            if (str != null) {
                return new f0(d0Var, c0Var, str, i10, this.f333830e, this.f333831f.i(), this.f333832g, this.f333833h, this.f333834i, this.f333835j, this.f333836k, this.f333837l, this.f333838m);
            }
            throw new IllegalStateException("message == null");
        }

        @NotNull
        public a d(@Nullable f0 f0Var) {
            f("cacheResponse", f0Var);
            this.f333834i = f0Var;
            return this;
        }

        @NotNull
        public a g(int i10) {
            this.f333828c = i10;
            return this;
        }

        @Nullable
        public final g0 h() {
            return this.f333832g;
        }

        @Nullable
        public final f0 i() {
            return this.f333834i;
        }

        public final int j() {
            return this.f333828c;
        }

        @Nullable
        public final okhttp3.internal.connection.c k() {
            return this.f333838m;
        }

        @Nullable
        public final t l() {
            return this.f333830e;
        }

        @NotNull
        public final u.a m() {
            return this.f333831f;
        }

        @Nullable
        public final String n() {
            return this.f333829d;
        }

        @Nullable
        public final f0 o() {
            return this.f333833h;
        }

        @Nullable
        public final f0 p() {
            return this.f333835j;
        }

        @Nullable
        public final c0 q() {
            return this.f333827b;
        }

        public final long r() {
            return this.f333837l;
        }

        @Nullable
        public final d0 s() {
            return this.f333826a;
        }

        public final long t() {
            return this.f333836k;
        }

        @NotNull
        public a u(@Nullable t tVar) {
            this.f333830e = tVar;
            return this;
        }

        @NotNull
        public a v(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f333831f.m(name, value);
            return this;
        }

        @NotNull
        public a w(@NotNull u headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f333831f = headers.s();
            return this;
        }

        public final void x(@NotNull okhttp3.internal.connection.c deferredTrailers) {
            Intrinsics.checkNotNullParameter(deferredTrailers, "deferredTrailers");
            this.f333838m = deferredTrailers;
        }

        @NotNull
        public a y(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f333829d = message;
            return this;
        }

        @NotNull
        public a z(@Nullable f0 f0Var) {
            f("networkResponse", f0Var);
            this.f333833h = f0Var;
            return this;
        }

        public a(@NotNull f0 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f333828c = -1;
            this.f333826a = response.x0();
            this.f333827b = response.r0();
            this.f333828c = response.E();
            this.f333829d = response.f0();
            this.f333830e = response.I();
            this.f333831f = response.Y().s();
            this.f333832g = response.r();
            this.f333833h = response.g0();
            this.f333834i = response.x();
            this.f333835j = response.o0();
            this.f333836k = response.y0();
            this.f333837l = response.w0();
            this.f333838m = response.H();
        }
    }
}
