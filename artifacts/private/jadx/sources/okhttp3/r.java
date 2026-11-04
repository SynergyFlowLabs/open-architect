package okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f334752a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final r f334753b = new a();

    public static final class a extends r {
        a() {
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public interface c {
        @NotNull
        r a(@NotNull e eVar);
    }

    public void A(@NotNull e call, @NotNull f0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void B(@NotNull e call, @Nullable t tVar) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void C(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void a(@NotNull e call, @NotNull f0 cachedResponse) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
    }

    public void b(@NotNull e call, @NotNull f0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void c(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void d(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void e(@NotNull e call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void f(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void g(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void h(@NotNull e call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable c0 c0Var) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void i(@NotNull e call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable c0 c0Var, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void j(@NotNull e call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void k(@NotNull e call, @NotNull j connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void l(@NotNull e call, @NotNull j connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void m(@NotNull e call, @NotNull String domainName, @NotNull List<InetAddress> inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
    }

    public void n(@NotNull e call, @NotNull String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
    }

    public void o(@NotNull e call, @NotNull v url, @NotNull List<Proxy> proxies) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
    }

    public void p(@NotNull e call, @NotNull v url) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    public void q(@NotNull e call, long j10) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void r(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void s(@NotNull e call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void t(@NotNull e call, @NotNull d0 request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
    }

    public void u(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void v(@NotNull e call, long j10) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void w(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void x(@NotNull e call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void y(@NotNull e call, @NotNull f0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void z(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }
}
