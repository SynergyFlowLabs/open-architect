package io.grpc.internal;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
class h2 implements io.grpc.g2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Logger f289238d = Logger.getLogger(h2.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f289239e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.google.common.base.s0<ProxySelector> f289240f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    private static final String f289241g = "GRPC_PROXY_EXP";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f289242h = "https";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.base.s0<ProxySelector> f289243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f289244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f289245c;

    class a implements c {
        a() {
        }

        @Override // io.grpc.internal.h2.c
        public PasswordAuthentication a(String str, InetAddress inetAddress, int i10, String str2, String str3, String str4) {
            URL url;
            try {
                url = new URL(str2, str, i10, "");
            } catch (MalformedURLException unused) {
                h2.f289238d.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{str2, str});
                url = null;
            }
            return Authenticator.requestPasswordAuthentication(str, inetAddress, i10, str2, str3, str4, url, Authenticator.RequestorType.PROXY);
        }
    }

    class b implements com.google.common.base.s0<ProxySelector> {
        b() {
        }

        @Override // com.google.common.base.s0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ProxySelector get() {
            return ProxySelector.getDefault();
        }
    }

    interface c {
        PasswordAuthentication a(String str, InetAddress inetAddress, int i10, String str2, String str3, String str4);
    }

    public h2() {
        this(f289240f, f289239e, System.getenv(f289241g));
    }

    private io.grpc.f2 c(InetSocketAddress inetSocketAddress) throws IOException {
        try {
            try {
                URI uri = new URI("https", null, v0.l(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                ProxySelector proxySelector = this.f289243a.get();
                if (proxySelector == null) {
                    f289238d.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> listSelect = proxySelector.select(uri);
                if (listSelect.size() > 1) {
                    f289238d.warning("More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = listSelect.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
                PasswordAuthentication passwordAuthenticationA = this.f289244b.a(v0.l(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort(), "https", "", null);
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                io.grpc.q0.b bVarC = io.grpc.q0.e().d(inetSocketAddress).c(inetSocketAddress2);
                if (passwordAuthenticationA == null) {
                    return bVarC.a();
                }
                return bVarC.e(passwordAuthenticationA.getUserName()).b(passwordAuthenticationA.getPassword() != null ? new String(passwordAuthenticationA.getPassword()) : null).a();
            } catch (URISyntaxException e10) {
                f289238d.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e10);
                return null;
            }
        } catch (Throwable th2) {
            f289238d.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th2);
            return null;
        }
    }

    private static InetSocketAddress d(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(":", 2);
        int i10 = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 80;
        f289238d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        return new InetSocketAddress(strArrSplit[0], i10);
    }

    @Override // io.grpc.g2
    @fj.h
    public io.grpc.f2 a(SocketAddress socketAddress) throws IOException {
        if (socketAddress instanceof InetSocketAddress) {
            return this.f289245c != null ? io.grpc.q0.e().c(this.f289245c).d((InetSocketAddress) socketAddress).a() : c((InetSocketAddress) socketAddress);
        }
        return null;
    }

    @com.google.common.annotations.e
    h2(com.google.common.base.s0<ProxySelector> s0Var, c cVar, @fj.h String str) {
        this.f289243a = (com.google.common.base.s0) com.google.common.base.j0.E(s0Var);
        this.f289244b = (c) com.google.common.base.j0.E(cVar);
        if (str != null) {
            this.f289245c = d(str);
        } else {
            this.f289245c = null;
        }
    }
}
