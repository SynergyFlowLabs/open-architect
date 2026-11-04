package io.ably.lib.rest;

import com.google.gson.l;
import com.google.gson.o;
import io.ably.lib.types.r;
import io.ably.lib.util.j;
import io.ably.lib.util.p;
import io.intercom.android.sdk.metrics.MetricTracker;

/* JADX INFO: loaded from: classes13.dex */
public class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static p.b<g> f287742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static io.ably.lib.http.i.e<g> f287743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static io.ably.lib.http.i.b<g> f287744i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f287745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f287746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f287747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f287748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f287749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f287750f;

    class a implements p.b<g> {
        a() {
        }

        @Override // io.ably.lib.util.p.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(l lVar) {
            return g.a((o) lVar);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o f287751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f287752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public r f287753c;

        public enum a {
            ACTIVE("ACTIVE"),
            FAILING("FAILING"),
            FAILED("FAILED");


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f287758a;

            a(String str) {
                this.f287758a = str;
            }

            public static a l(String str) {
                for (a aVar : values()) {
                    if (aVar.f287758a.equals(str)) {
                        return aVar;
                    }
                }
                return null;
            }

            public static a n(int i10) {
                a[] aVarArrValues = values();
                if (i10 < 0 || i10 >= aVarArrValues.length) {
                    return null;
                }
                return aVarArrValues[i10];
            }

            public int o() {
                a[] aVarArrValues = values();
                for (int i10 = 0; i10 < aVarArrValues.length; i10++) {
                    if (this == aVarArrValues[i10]) {
                        return i10;
                    }
                }
                return -1;
            }
        }

        public o a() {
            o oVar = new o();
            oVar.L("recipient", this.f287751a);
            return oVar;
        }
    }

    static {
        a aVar = new a();
        f287742g = aVar;
        f287743h = new p.d(g.class, aVar);
        f287744i = new p.c(g[].class, f287742g);
    }

    public static g a(o oVar) {
        return (g) p.f288250c.j(oVar, g.class);
    }

    private static void b(o oVar) {
        l lVarS;
        l lVarS2 = oVar.S(MetricTracker.Place.PUSH);
        if (lVarS2 == null || (lVarS = lVarS2.v().S("recipient")) == null) {
            return;
        }
        lVarS2.v().L("recipient", j.a().a("transportType", lVarS.v().S("transportType")).a("deviceToken", lVarS.v().S("deviceToken")).a("registrationToken", lVarS.v().S("registrationToken")).b());
    }

    public o c() {
        return j.a().a(MetricTracker.Place.PUSH, j.a().a("recipient", this.f287750f.f287751a)).b();
    }

    public o d() {
        o oVar = new o();
        oVar.P("id", this.f287745a);
        oVar.P("platform", this.f287746b);
        oVar.P("formFactor", this.f287747c);
        oVar.P(io.ably.lib.realtime.l.f287647j, this.f287748d);
        o oVar2 = this.f287749e;
        if (oVar2 != null) {
            oVar.L("metadata", oVar2);
        }
        b bVar = this.f287750f;
        if (bVar != null) {
            oVar.L(MetricTracker.Place.PUSH, bVar.a());
        }
        return oVar;
    }

    public boolean equals(Object obj) {
        o oVar;
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        o oVarD = d();
        o oVarD2 = gVar.d();
        oVarD.Z("deviceSecret");
        oVarD2.Z("deviceSecret");
        b(oVarD);
        b(oVarD2);
        o oVar2 = this.f287749e;
        if ((oVar2 == null || oVar2.entrySet().isEmpty()) && ((oVar = gVar.f287749e) == null || oVar.entrySet().isEmpty())) {
            oVarD.Z("metadata");
            oVarD2.Z("metadata");
        }
        return oVarD.equals(oVarD2);
    }

    public String toString() {
        return d().toString();
    }
}
