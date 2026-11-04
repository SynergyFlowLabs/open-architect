package io.ably.lib.types;

import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes13.dex */
public class b extends g {
    private static final String H1 = "serial";

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final String f287920g3 = "type";

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final String f287921h3 = "name";

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final String f287922i3 = "count";

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final String f287923j3 = "extras";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final String f287924p0 = "io.ably.lib.types.b";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final String f287925p1 = "action";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final String f287926p2 = "messageSerial";
    public String X;
    public Integer Y;
    public x Z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c f287927s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f287928t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f287929v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f287930w;

    public static class a implements com.google.gson.t<c>, com.google.gson.k<c> {
        @Override // com.google.gson.k
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c a(com.google.gson.l lVar, Type type, com.google.gson.j jVar) throws com.google.gson.p {
            return c.l(lVar.s());
        }

        @Override // com.google.gson.t
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public com.google.gson.l b(c cVar, Type type, com.google.gson.s sVar) {
            return new com.google.gson.r(Integer.valueOf(cVar.ordinal()));
        }
    }

    /* JADX INFO: renamed from: io.ably.lib.types.b$b, reason: collision with other inner class name */
    public static class C1946b implements com.google.gson.t<b>, com.google.gson.k<b> {
        @Override // com.google.gson.k
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b a(com.google.gson.l lVar, Type type, com.google.gson.j jVar) throws com.google.gson.p {
            if (!lVar.J()) {
                throw new com.google.gson.p("Expected an object but got \"" + lVar.getClass() + "\".");
            }
            b bVar = new b();
            try {
                bVar.g((com.google.gson.o) lVar);
                return bVar;
            } catch (w e10) {
                io.ably.lib.util.k.e(b.f287924p0, e10.getMessage(), e10);
                throw new com.google.gson.p("Failed to deserialize Message from JSON.", e10);
            }
        }

        @Override // com.google.gson.t
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public com.google.gson.l b(b bVar, Type type, com.google.gson.s sVar) {
            com.google.gson.o oVarL = g.l(bVar);
            c cVar = bVar.f287927s;
            if (cVar != null) {
                oVarL.O("action", Integer.valueOf(cVar.ordinal()));
            }
            String str = bVar.f287928t;
            if (str != null) {
                oVarL.P(b.H1, str);
            }
            String str2 = bVar.f287929v;
            if (str2 != null) {
                oVarL.P(b.f287926p2, str2);
            }
            String str3 = bVar.f287930w;
            if (str3 != null) {
                oVarL.P("type", str3);
            }
            String str4 = bVar.X;
            if (str4 != null) {
                oVarL.P("name", str4);
            }
            Integer num = bVar.Y;
            if (num != null) {
                oVarL.O(b.f287922i3, num);
            }
            x xVar = bVar.Z;
            if (xVar != null) {
                oVarL.L("extras", io.ably.lib.util.p.f288250c.K(xVar));
            }
            return oVarL;
        }
    }

    public static b q(org.msgpack.core.o oVar) throws IOException {
        return new b().r(oVar);
    }

    @Override // io.ably.lib.types.g
    protected void g(com.google.gson.o oVar) throws w {
        super.g(oVar);
        Integer numI = i(oVar, "action");
        this.f287927s = numI == null ? null : c.l(numI.intValue());
        this.f287928t = k(oVar, H1);
        this.f287929v = k(oVar, f287926p2);
        this.f287930w = k(oVar, "type");
        this.X = k(oVar, "name");
        this.Y = i(oVar, f287922i3);
        com.google.gson.l lVarS = oVar.S("extras");
        if (lVarS != null) {
            if (lVarS.J()) {
                this.Z = x.d((com.google.gson.o) lVarS);
                return;
            }
            throw w.d("Message extras is of type \"" + lVarS.getClass() + "\" when expected a JSON object.");
        }
    }

    b r(org.msgpack.core.o oVar) throws IOException {
        int iB1 = oVar.b1();
        for (int i10 = 0; i10 < iB1; i10++) {
            String strIntern = oVar.h1().intern();
            org.msgpack.core.c cVarD = oVar.d();
            if (cVarD.equals(org.msgpack.core.c.f339230f)) {
                oVar.d1();
            } else if (!super.h(oVar, strIntern, cVarD)) {
                if (strIntern.equals("action")) {
                    this.f287927s = c.l(oVar.T0());
                } else if (strIntern.equals(H1)) {
                    this.f287928t = oVar.h1();
                } else if (strIntern.equals(f287926p2)) {
                    this.f287929v = oVar.h1();
                } else if (strIntern.equals("type")) {
                    this.f287930w = oVar.h1();
                } else if (strIntern.equals("name")) {
                    this.X = oVar.h1();
                } else if (strIntern.equals(f287922i3)) {
                    this.Y = Integer.valueOf(oVar.T0());
                } else if (strIntern.equals("extras")) {
                    this.Z = x.e(oVar);
                } else {
                    io.ably.lib.util.k.k(f287924p0, "Unexpected field: " + strIntern);
                    oVar.a9();
                }
            }
        }
        return this;
    }

    void s(org.msgpack.core.j jVar) throws IOException {
        int iA = super.a();
        if (this.f287927s != null) {
            iA++;
        }
        if (this.f287928t != null) {
            iA++;
        }
        if (this.f287929v != null) {
            iA++;
        }
        if (this.f287930w != null) {
            iA++;
        }
        if (this.X != null) {
            iA++;
        }
        if (this.Y != null) {
            iA++;
        }
        if (this.Z != null) {
            iA++;
        }
        jVar.y(iA);
        super.o(jVar);
        if (this.f287927s != null) {
            jVar.N("action");
            jVar.t(this.f287927s.ordinal());
        }
        if (this.f287928t != null) {
            jVar.N(H1);
            jVar.N(this.f287928t);
        }
        if (this.f287929v != null) {
            jVar.N(f287926p2);
            jVar.N(this.f287929v);
        }
        if (this.f287930w != null) {
            jVar.N("type");
            jVar.N(this.f287930w);
        }
        if (this.X != null) {
            jVar.N("name");
            jVar.N(this.X);
        }
        if (this.Y != null) {
            jVar.N(f287922i3);
            jVar.t(this.Y.intValue());
        }
        if (this.Z != null) {
            jVar.N("extras");
            this.Z.f(jVar);
        }
    }
}
