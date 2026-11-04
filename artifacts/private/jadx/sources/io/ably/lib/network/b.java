package io.ably.lib.network;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes13.dex */
public class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f287427a;

    public b(l lVar) {
        this.f287427a = lVar;
    }

    @Override // io.ably.lib.network.k
    public j a(n nVar) {
        return new a(nVar, b() ? new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.f287427a.c().d(), this.f287427a.c().g())) : Proxy.NO_PROXY);
    }

    @Override // io.ably.lib.network.k
    public boolean b() {
        if (this.f287427a.c() == null) {
            return false;
        }
        int i10 = 1 << 1;
        return true;
    }
}
