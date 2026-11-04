package okhttp3;

import com.superwall.sdk.network.Api;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final q f333647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final SocketFactory f333648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final SSLSocketFactory f333649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final HostnameVerifier f333650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final g f333651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final b f333652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final Proxy f333653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final ProxySelector f333654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final v f333655i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final List<c0> f333656j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final List<l> f333657k;

    public a(@NotNull String uriHost, int i10, @NotNull q dns, @NotNull SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable g gVar, @NotNull b proxyAuthenticator, @Nullable Proxy proxy, @NotNull List<? extends c0> protocols, @NotNull List<l> connectionSpecs, @NotNull ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.f333647a = dns;
        this.f333648b = socketFactory;
        this.f333649c = sSLSocketFactory;
        this.f333650d = hostnameVerifier;
        this.f333651e = gVar;
        this.f333652f = proxyAuthenticator;
        this.f333653g = proxy;
        this.f333654h = proxySelector;
        this.f333655i = new v.a().M(sSLSocketFactory != null ? Api.scheme : "http").x(uriHost).D(i10).h();
        this.f333656j = jk.f.h0(protocols);
        this.f333657k = jk.f.h0(connectionSpecs);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "certificatePinner", imports = {}))
    @oj.i(name = "-deprecated_certificatePinner")
    @Nullable
    public final g a() {
        return this.f333651e;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "connectionSpecs", imports = {}))
    @oj.i(name = "-deprecated_connectionSpecs")
    @NotNull
    public final List<l> b() {
        return this.f333657k;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "dns", imports = {}))
    @oj.i(name = "-deprecated_dns")
    @NotNull
    public final q c() {
        return this.f333647a;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "hostnameVerifier", imports = {}))
    @oj.i(name = "-deprecated_hostnameVerifier")
    @Nullable
    public final HostnameVerifier d() {
        return this.f333650d;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "protocols", imports = {}))
    @oj.i(name = "-deprecated_protocols")
    @NotNull
    public final List<c0> e() {
        return this.f333656j;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (Intrinsics.areEqual(this.f333655i, aVar.f333655i) && o(aVar)) {
                return true;
            }
        }
        return false;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "proxy", imports = {}))
    @oj.i(name = "-deprecated_proxy")
    @Nullable
    public final Proxy f() {
        return this.f333653g;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "proxyAuthenticator", imports = {}))
    @oj.i(name = "-deprecated_proxyAuthenticator")
    @NotNull
    public final b g() {
        return this.f333652f;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "proxySelector", imports = {}))
    @oj.i(name = "-deprecated_proxySelector")
    @NotNull
    public final ProxySelector h() {
        return this.f333654h;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f333655i.hashCode()) * 31) + this.f333647a.hashCode()) * 31) + this.f333652f.hashCode()) * 31) + this.f333656j.hashCode()) * 31) + this.f333657k.hashCode()) * 31) + this.f333654h.hashCode()) * 31) + Objects.hashCode(this.f333653g)) * 31) + Objects.hashCode(this.f333649c)) * 31) + Objects.hashCode(this.f333650d)) * 31) + Objects.hashCode(this.f333651e);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "socketFactory", imports = {}))
    @oj.i(name = "-deprecated_socketFactory")
    @NotNull
    public final SocketFactory i() {
        return this.f333648b;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "sslSocketFactory", imports = {}))
    @oj.i(name = "-deprecated_sslSocketFactory")
    @Nullable
    public final SSLSocketFactory j() {
        return this.f333649c;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "url", imports = {}))
    @oj.i(name = "-deprecated_url")
    @NotNull
    public final v k() {
        return this.f333655i;
    }

    @oj.i(name = "certificatePinner")
    @Nullable
    public final g l() {
        return this.f333651e;
    }

    @oj.i(name = "connectionSpecs")
    @NotNull
    public final List<l> m() {
        return this.f333657k;
    }

    @oj.i(name = "dns")
    @NotNull
    public final q n() {
        return this.f333647a;
    }

    public final boolean o(@NotNull a that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.areEqual(this.f333647a, that.f333647a) && Intrinsics.areEqual(this.f333652f, that.f333652f) && Intrinsics.areEqual(this.f333656j, that.f333656j) && Intrinsics.areEqual(this.f333657k, that.f333657k) && Intrinsics.areEqual(this.f333654h, that.f333654h) && Intrinsics.areEqual(this.f333653g, that.f333653g) && Intrinsics.areEqual(this.f333649c, that.f333649c) && Intrinsics.areEqual(this.f333650d, that.f333650d) && Intrinsics.areEqual(this.f333651e, that.f333651e) && this.f333655i.N() == that.f333655i.N();
    }

    @oj.i(name = "hostnameVerifier")
    @Nullable
    public final HostnameVerifier p() {
        return this.f333650d;
    }

    @oj.i(name = "protocols")
    @NotNull
    public final List<c0> q() {
        return this.f333656j;
    }

    @oj.i(name = "proxy")
    @Nullable
    public final Proxy r() {
        return this.f333653g;
    }

    @oj.i(name = "proxyAuthenticator")
    @NotNull
    public final b s() {
        return this.f333652f;
    }

    @oj.i(name = "proxySelector")
    @NotNull
    public final ProxySelector t() {
        return this.f333654h;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2;
        Object obj;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Address{");
        sb3.append(this.f333655i.F());
        sb3.append(AbstractJsonLexerKt.COLON);
        sb3.append(this.f333655i.N());
        sb3.append(", ");
        if (this.f333653g != null) {
            sb2 = new StringBuilder();
            sb2.append("proxy=");
            obj = this.f333653g;
        } else {
            sb2 = new StringBuilder();
            sb2.append("proxySelector=");
            obj = this.f333654h;
        }
        sb2.append(obj);
        sb3.append(sb2.toString());
        sb3.append(AbstractJsonLexerKt.END_OBJ);
        return sb3.toString();
    }

    @oj.i(name = "socketFactory")
    @NotNull
    public final SocketFactory u() {
        return this.f333648b;
    }

    @oj.i(name = "sslSocketFactory")
    @Nullable
    public final SSLSocketFactory v() {
        return this.f333649c;
    }

    @oj.i(name = "url")
    @NotNull
    public final v w() {
        return this.f333655i;
    }
}
