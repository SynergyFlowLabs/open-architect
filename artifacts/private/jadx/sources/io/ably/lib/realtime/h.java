package io.ably.lib.realtime;

import io.ably.lib.types.j0;
import io.ably.lib.types.r;
import io.ably.lib.util.n;

/* JADX INFO: loaded from: classes13.dex */
public class h extends io.ably.lib.util.g<i, k> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f287611j = "io.ably.lib.realtime.h";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f287612c = j.initialized;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f287613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f287614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public String f287615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f287616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final a f287617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final io.ably.lib.transport.b f287618i;

    h(a aVar, io.ably.lib.transport.b.g gVar, n nVar, mg.b bVar) throws io.ably.lib.types.a {
        this.f287617h = aVar;
        this.f287618i = new io.ably.lib.transport.b(aVar, this, gVar, nVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.ably.lib.util.g
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void a(k kVar, i iVar, Object... objArr) {
        try {
            kVar.c((k.a) objArr[0]);
        } catch (Throwable th2) {
            io.ably.lib.util.k.e(f287611j, "Unexpected exception calling ConnectionStateListener", th2);
        }
    }

    public void k() {
        this.f287614e = null;
        this.f287615f = null;
        this.f287618i.K();
    }

    public void l() {
        this.f287618i.M();
    }

    public String m() {
        j jVar;
        String str = this.f287614e;
        if (str == null || str.isEmpty() || (jVar = this.f287612c) == j.closing || jVar == j.closed || jVar == j.failed || jVar == j.suspended) {
            return null;
        }
        return new j0(this.f287614e, this.f287618i.f287792w, this.f287617h.d0()).b();
    }

    @Deprecated
    public void n(j jVar, k.a aVar) {
        super.b(jVar.l(), aVar);
    }

    public void o(r rVar) {
        if (this.f287612c == j.connected) {
            b(i.update, k.a.a(rVar));
        }
    }

    @Deprecated
    public void p(j jVar, k kVar) {
        super.g(jVar.l(), kVar);
    }

    public void q(k.a aVar) {
        j jVar = aVar.f287641c;
        this.f287612c = jVar;
        this.f287613d = aVar.f287643e;
        n(jVar, aVar);
    }

    @Deprecated
    public void r(j jVar, k kVar) {
        super.i(jVar.l(), kVar);
    }

    public void s(g gVar) {
        this.f287618i.m0(gVar);
    }
}
