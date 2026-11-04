package okhttp3.internal.connection;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.h0;
import okhttp3.r;
import okhttp3.v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f334162i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final okhttp3.a f334163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final h f334164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final okhttp3.e f334165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final r f334166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private List<? extends Proxy> f334167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f334168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private List<? extends InetSocketAddress> f334169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final List<h0> f334170h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a(@NotNull InetSocketAddress inetSocketAddress) {
            Intrinsics.checkNotNullParameter(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                Intrinsics.checkNotNullExpressionValue(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            Intrinsics.checkNotNullExpressionValue(hostAddress, "address.hostAddress");
            return hostAddress;
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<h0> f334171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f334172b;

        public b(@NotNull List<h0> routes) {
            Intrinsics.checkNotNullParameter(routes, "routes");
            this.f334171a = routes;
        }

        @NotNull
        public final List<h0> a() {
            return this.f334171a;
        }

        public final boolean b() {
            return this.f334172b < this.f334171a.size();
        }

        @NotNull
        public final h0 c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List<h0> list = this.f334171a;
            int i10 = this.f334172b;
            this.f334172b = i10 + 1;
            return list.get(i10);
        }
    }

    public j(@NotNull okhttp3.a address, @NotNull h routeDatabase, @NotNull okhttp3.e call, @NotNull r eventListener) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f334163a = address;
        this.f334164b = routeDatabase;
        this.f334165c = call;
        this.f334166d = eventListener;
        this.f334167e = CollectionsKt.emptyList();
        this.f334169g = CollectionsKt.emptyList();
        this.f334170h = new ArrayList();
        f(address.w(), address.r());
    }

    private final boolean b() {
        return this.f334168f < this.f334167e.size();
    }

    private final Proxy d() throws IOException {
        if (b()) {
            List<? extends Proxy> list = this.f334167e;
            int i10 = this.f334168f;
            this.f334168f = i10 + 1;
            Proxy proxy = list.get(i10);
            e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f334163a.w().F() + "; exhausted proxy configurations: " + this.f334167e);
    }

    private final void e(Proxy proxy) throws IOException {
        String strF;
        int iN;
        List<InetAddress> listListOf;
        ArrayList arrayList = new ArrayList();
        this.f334169g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strF = this.f334163a.w().F();
            iN = this.f334163a.w().N();
        } else {
            SocketAddress proxyAddress = proxy.address();
            if (!(proxyAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass()).toString());
            }
            a aVar = f334162i;
            Intrinsics.checkNotNullExpressionValue(proxyAddress, "proxyAddress");
            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
            strF = aVar.a(inetSocketAddress);
            iN = inetSocketAddress.getPort();
        }
        if (1 > iN || iN >= 65536) {
            throw new SocketException("No route to " + strF + AbstractJsonLexerKt.COLON + iN + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strF, iN));
            return;
        }
        if (jk.f.k(strF)) {
            listListOf = CollectionsKt.listOf(InetAddress.getByName(strF));
        } else {
            this.f334166d.n(this.f334165c, strF);
            List<InetAddress> listA = this.f334163a.n().a(strF);
            if (listA.isEmpty()) {
                throw new UnknownHostException(this.f334163a.n() + " returned no addresses for " + strF);
            }
            this.f334166d.m(this.f334165c, strF, listA);
            listListOf = listA;
        }
        Iterator<InetAddress> it = listListOf.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress(it.next(), iN));
        }
    }

    private final void f(v vVar, Proxy proxy) {
        this.f334166d.p(this.f334165c, vVar);
        List<Proxy> listG = g(proxy, vVar, this);
        this.f334167e = listG;
        this.f334168f = 0;
        this.f334166d.o(this.f334165c, vVar, listG);
    }

    private static final List<Proxy> g(Proxy proxy, v vVar, j jVar) {
        if (proxy != null) {
            return CollectionsKt.listOf(proxy);
        }
        URI uriZ = vVar.Z();
        if (uriZ.getHost() == null) {
            return jk.f.C(Proxy.NO_PROXY);
        }
        List<Proxy> proxiesOrNull = jVar.f334163a.t().select(uriZ);
        List<Proxy> list = proxiesOrNull;
        if (list != null && !list.isEmpty()) {
            Intrinsics.checkNotNullExpressionValue(proxiesOrNull, "proxiesOrNull");
            return jk.f.h0(proxiesOrNull);
        }
        return jk.f.C(Proxy.NO_PROXY);
    }

    public final boolean a() {
        return b() || !this.f334170h.isEmpty();
    }

    @NotNull
    public final b c() throws IOException {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy proxyD = d();
            Iterator<? extends InetSocketAddress> it = this.f334169g.iterator();
            while (it.hasNext()) {
                h0 h0Var = new h0(this.f334163a, proxyD, it.next());
                if (this.f334164b.c(h0Var)) {
                    this.f334170h.add(h0Var);
                } else {
                    arrayList.add(h0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            CollectionsKt.addAll(arrayList, this.f334170h);
            this.f334170h.clear();
        }
        return new b(arrayList);
    }
}
