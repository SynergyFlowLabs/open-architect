package org.locationtech.jts.simplify;

import java.util.HashMap;
import java.util.Map;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.q;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f339028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h f339029b = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f339030c;

    static class a implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        i f339031a;

        a(i iVar) {
            this.f339031a = iVar;
        }

        @Override // org.locationtech.jts.geom.q
        public void a(n nVar) {
            if (nVar instanceof v) {
                v vVar = (v) nVar;
                if (vVar.v0()) {
                    return;
                }
                this.f339031a.f339030c.put(vVar, new f(vVar, vVar.X0() ? 4 : 2));
            }
        }
    }

    static class b extends org.locationtech.jts.geom.util.j {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map f339032g;

        public b(Map map) {
            this.f339032g = map;
        }

        @Override // org.locationtech.jts.geom.util.j
        protected org.locationtech.jts.geom.e e(org.locationtech.jts.geom.e eVar, n nVar) {
            if (eVar.size() == 0) {
                return null;
            }
            return nVar instanceof v ? b(((f) this.f339032g.get(nVar)).h()) : super.e(eVar, nVar);
        }
    }

    public i(n nVar) {
        this.f339028a = nVar;
    }

    public static n d(n nVar, double d10) {
        i iVar = new i(nVar);
        iVar.c(d10);
        return iVar.b();
    }

    public n b() {
        if (this.f339028a.v0()) {
            return this.f339028a.w();
        }
        this.f339030c = new HashMap();
        this.f339028a.d(new a(this));
        this.f339029b.b(this.f339030c.values());
        return new b(this.f339030c).d(this.f339028a);
    }

    public void c(double d10) {
        if (d10 < 0.0d) {
            throw new IllegalArgumentException("Tolerance must be non-negative");
        }
        this.f339029b.a(d10);
    }
}
