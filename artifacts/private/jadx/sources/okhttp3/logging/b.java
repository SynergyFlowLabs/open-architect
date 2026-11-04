package okhttp3.logging;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import oj.j;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.e;
import okhttp3.f0;
import okhttp3.r;
import okhttp3.t;
import okhttp3.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final okhttp3.logging.a.b f334712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f334713d;

    public static class a implements r.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final okhttp3.logging.a.b f334714a;

        /* JADX WARN: Multi-variable type inference failed */
        @j
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // okhttp3.r.c
        @NotNull
        public r a(@NotNull e call) {
            Intrinsics.checkNotNullParameter(call, "call");
            return new b(this.f334714a, null);
        }

        @j
        public a(@NotNull okhttp3.logging.a.b logger) {
            Intrinsics.checkNotNullParameter(logger, "logger");
            this.f334714a = logger;
        }

        public /* synthetic */ a(okhttp3.logging.a.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? okhttp3.logging.a.b.f334710b : bVar);
        }
    }

    public /* synthetic */ b(okhttp3.logging.a.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    private final void D(String str) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f334713d);
        this.f334712c.a(AbstractJsonLexerKt.BEGIN_LIST + millis + " ms] " + str);
    }

    @Override // okhttp3.r
    public void A(@NotNull e call, @NotNull f0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        D("satisfactionFailure: " + response);
    }

    @Override // okhttp3.r
    public void B(@NotNull e call, @Nullable t tVar) {
        Intrinsics.checkNotNullParameter(call, "call");
        D("secureConnectEnd: " + tVar);
    }

    @Override // okhttp3.r
    public void C(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
        D("secureConnectStart");
    }

    @Override // okhttp3.r
    public void a(@NotNull e call, @NotNull f0 cachedResponse) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
        D("cacheConditionalHit: " + cachedResponse);
    }

    @Override // okhttp3.r
    public void b(@NotNull e call, @NotNull f0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        D("cacheHit: " + response);
    }

    @Override // okhttp3.r
    public void c(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
        D("cacheMiss");
    }

    @Override // okhttp3.r
    public void d(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
        D("callEnd");
    }

    @Override // okhttp3.r
    public void e(@NotNull e call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        D("callFailed: " + ioe);
    }

    @Override // okhttp3.r
    public void f(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f334713d = System.nanoTime();
        D("callStart: " + call.request());
    }

    @Override // okhttp3.r
    public void g(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
        D("canceled");
    }

    @Override // okhttp3.r
    public void h(@NotNull e call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable c0 c0Var) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        D("connectEnd: " + c0Var);
    }

    @Override // okhttp3.r
    public void i(@NotNull e call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable c0 c0Var, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        D("connectFailed: " + c0Var + ' ' + ioe);
    }

    @Override // okhttp3.r
    public void j(@NotNull e call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        D("connectStart: " + inetSocketAddress + ' ' + proxy);
    }

    @Override // okhttp3.r
    public void k(@NotNull e call, @NotNull okhttp3.j connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
        D("connectionAcquired: " + connection);
    }

    @Override // okhttp3.r
    public void l(@NotNull e call, @NotNull okhttp3.j connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
        D("connectionReleased");
    }

    @Override // okhttp3.r
    public void m(@NotNull e call, @NotNull String domainName, @NotNull List<? extends InetAddress> inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
        D("dnsEnd: " + inetAddressList);
    }

    @Override // okhttp3.r
    public void n(@NotNull e call, @NotNull String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        D("dnsStart: " + domainName);
    }

    @Override // okhttp3.r
    public void o(@NotNull e call, @NotNull v url, @NotNull List<? extends Proxy> proxies) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
        D("proxySelectEnd: " + proxies);
    }

    @Override // okhttp3.r
    public void p(@NotNull e call, @NotNull v url) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        D("proxySelectStart: " + url);
    }

    @Override // okhttp3.r
    public void q(@NotNull e call, long j10) {
        Intrinsics.checkNotNullParameter(call, "call");
        D("requestBodyEnd: byteCount=" + j10);
    }

    @Override // okhttp3.r
    public void r(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
        D("requestBodyStart");
    }

    @Override // okhttp3.r
    public void s(@NotNull e call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        D("requestFailed: " + ioe);
    }

    @Override // okhttp3.r
    public void t(@NotNull e call, @NotNull d0 request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
        D("requestHeadersEnd");
    }

    @Override // okhttp3.r
    public void u(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
        D("requestHeadersStart");
    }

    @Override // okhttp3.r
    public void v(@NotNull e call, long j10) {
        Intrinsics.checkNotNullParameter(call, "call");
        D("responseBodyEnd: byteCount=" + j10);
    }

    @Override // okhttp3.r
    public void w(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
        D("responseBodyStart");
    }

    @Override // okhttp3.r
    public void x(@NotNull e call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        D("responseFailed: " + ioe);
    }

    @Override // okhttp3.r
    public void y(@NotNull e call, @NotNull f0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        D("responseHeadersEnd: " + response);
    }

    @Override // okhttp3.r
    public void z(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
        D("responseHeadersStart");
    }

    private b(okhttp3.logging.a.b bVar) {
        this.f334712c = bVar;
    }
}
