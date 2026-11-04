package io.ably.lib.types;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
public class u extends g {

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final String f288166g3 = "name";

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final String f288167h3 = "extras";

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final String f288168i3 = "connectionKey";

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final String f288169j3 = "serial";

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private static final String f288170k3 = "version";

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private static final String f288171l3 = "action";

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static final String f288172m3 = "createdAt";

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private static final String f288173n3 = "refSerial";

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private static final String f288174o3 = "refType";

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final String f288175p3 = "operation";

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private static final String f288176q3 = "summary";

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static final String f288177r3 = "io.ably.lib.types.u";
    public b H1;
    public String X;
    public v Y;
    public Long Z;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f288178p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public String f288179p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public m0 f288180p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f288181s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public x f288182t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f288183v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f288184w;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f288187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f288188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Map<String, String> f288189c;

        protected static b a(com.google.gson.o oVar) throws w {
            b bVar = new b();
            if (oVar.W(io.ably.lib.realtime.l.f287647j)) {
                bVar.f288187a = oVar.S(io.ably.lib.realtime.l.f287647j).D();
            }
            if (oVar.W("description")) {
                bVar.f288188b = oVar.S("description").D();
            }
            if (oVar.W("metadata")) {
                com.google.gson.o oVarU = oVar.U("metadata");
                bVar.f288189c = new HashMap();
                for (Map.Entry<String, com.google.gson.l> entry : oVarU.entrySet()) {
                    bVar.f288189c.put(entry.getKey(), entry.getValue().D());
                }
            }
            return bVar;
        }

        protected static b b(org.msgpack.core.o oVar) throws IOException {
            b bVar = new b();
            int iB1 = oVar.b1();
            for (int i10 = 0; i10 < iB1; i10++) {
                String strIntern = oVar.h1().intern();
                strIntern.getClass();
                switch (strIntern) {
                    case "description":
                        bVar.f288188b = oVar.h1();
                        break;
                    case "metadata":
                        int iB2 = oVar.b1();
                        bVar.f288189c = new HashMap(iB2);
                        for (int i11 = 0; i11 < iB2; i11++) {
                            bVar.f288189c.put(oVar.h1(), oVar.h1());
                        }
                        break;
                    case "clientId":
                        bVar.f288187a = oVar.h1();
                        break;
                    default:
                        oVar.a9();
                        break;
                }
            }
            return bVar;
        }

        void c(org.msgpack.core.j jVar) throws IOException {
            int i10 = this.f288187a != null ? 1 : 0;
            if (this.f288188b != null) {
                i10++;
            }
            if (this.f288189c != null) {
                i10++;
            }
            jVar.y(i10);
            if (this.f288187a != null) {
                jVar.N(io.ably.lib.realtime.l.f287647j);
                jVar.N(this.f288187a);
            }
            if (this.f288188b != null) {
                jVar.N("description");
                jVar.N(this.f288188b);
            }
            if (this.f288189c != null) {
                jVar.N("metadata");
                jVar.y(this.f288189c.size());
                for (Map.Entry<String, String> entry : this.f288189c.entrySet()) {
                    jVar.N(entry.getKey());
                    jVar.N(entry.getValue());
                }
            }
        }
    }

    public static class c implements com.google.gson.t<u>, com.google.gson.k<u> {
        @Override // com.google.gson.k
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public u a(com.google.gson.l lVar, Type type, com.google.gson.j jVar) throws com.google.gson.p {
            if (!(lVar instanceof com.google.gson.o)) {
                throw new com.google.gson.p("Expected an object but got \"" + lVar.getClass() + "\".");
            }
            u uVar = new u();
            try {
                uVar.g((com.google.gson.o) lVar);
                return uVar;
            } catch (w e10) {
                io.ably.lib.util.k.e(u.class.getName(), e10.getMessage(), e10);
                throw new com.google.gson.p("Failed to deserialize Message from JSON.", e10);
            }
        }

        @Override // com.google.gson.t
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public com.google.gson.l b(u uVar, Type type, com.google.gson.s sVar) {
            com.google.gson.o oVarL = g.l(uVar);
            String str = uVar.f288181s;
            if (str != null) {
                oVarL.P("name", str);
            }
            x xVar = uVar.f288182t;
            if (xVar != null) {
                oVarL.L("extras", io.ably.lib.util.p.f288250c.K(xVar));
            }
            String str2 = uVar.f288183v;
            if (str2 != null) {
                oVarL.P(u.f288168i3, str2);
            }
            String str3 = uVar.f288184w;
            if (str3 != null) {
                oVarL.P(u.f288169j3, str3);
            }
            String str4 = uVar.X;
            if (str4 != null) {
                oVarL.P("version", str4);
            }
            v vVar = uVar.Y;
            if (vVar != null) {
                oVarL.O("action", Integer.valueOf(vVar.ordinal()));
            }
            Long l10 = uVar.Z;
            if (l10 != null) {
                oVarL.O(u.f288172m3, l10);
            }
            String str5 = uVar.f288178p0;
            if (str5 != null) {
                oVarL.P(u.f288173n3, str5);
            }
            String str6 = uVar.f288179p1;
            if (str6 != null) {
                oVarL.P(u.f288174o3, str6);
            }
            b bVar = uVar.H1;
            if (bVar != null) {
                oVarL.L(u.f288175p3, io.ably.lib.util.p.f288250c.K(bVar));
            }
            m0 m0Var = uVar.f288180p2;
            if (m0Var != null) {
                oVarL.L(u.f288176q3, m0Var.j());
            }
            return oVarL;
        }
    }

    public u() {
    }

    public static u p(com.google.gson.o oVar, l lVar) throws w {
        try {
            u uVar = (u) io.ably.lib.util.p.f288250c.j(oVar, u.class);
            uVar.b(lVar);
            return uVar;
        } catch (Exception e10) {
            io.ably.lib.util.k.e(u.class.getName(), e10.getMessage(), e10);
            throw w.d(e10.getMessage());
        }
    }

    public static u q(String str, l lVar) throws w {
        try {
            return p(((com.google.gson.o) io.ably.lib.util.p.f288250c.r(str, com.google.gson.o.class)).v(), lVar);
        } catch (Exception e10) {
            io.ably.lib.util.k.e(u.class.getName(), e10.getMessage(), e10);
            throw w.d(e10.getMessage());
        }
    }

    public static u[] r(com.google.gson.i iVar, l lVar) throws w {
        try {
            u[] uVarArr = new u[iVar.size()];
            for (int i10 = 0; i10 < iVar.size(); i10++) {
                com.google.gson.l lVarU = iVar.U(i10);
                if (!lVarU.J()) {
                    throw new com.google.gson.p("Not all JSON elements are of type JSON Object.");
                }
                uVarArr[i10] = p(lVarU.v(), lVar);
            }
            return uVarArr;
        } catch (Exception e10) {
            io.ably.lib.util.k.e(u.class.getName(), e10.getMessage(), e10);
            throw w.d(e10.getMessage());
        }
    }

    public static u[] s(String str, l lVar) throws w {
        try {
            return r((com.google.gson.i) io.ably.lib.util.p.f288250c.r(str, com.google.gson.i.class), lVar);
        } catch (Exception e10) {
            io.ably.lib.util.k.e(u.class.getName(), e10.getMessage(), e10);
            throw w.d(e10.getMessage());
        }
    }

    static u t(org.msgpack.core.o oVar) throws IOException {
        return new u().u(oVar);
    }

    @Override // io.ably.lib.types.g
    protected void g(com.google.gson.o oVar) throws w {
        super.g(oVar);
        this.f288181s = k(oVar, "name");
        com.google.gson.l lVarS = oVar.S("extras");
        if (lVarS != null) {
            if (!(lVarS instanceof com.google.gson.o)) {
                throw w.d("Message extras is of type \"" + lVarS.getClass() + "\" when expected a JSON object.");
            }
            this.f288182t = x.d((com.google.gson.o) lVarS);
        }
        this.f288183v = k(oVar, f288168i3);
        this.f288184w = k(oVar, f288169j3);
        this.X = k(oVar, "version");
        Integer numI = i(oVar, "action");
        this.Y = numI == null ? null : v.l(numI.intValue());
        this.Z = j(oVar, f288172m3);
        this.f288178p0 = k(oVar, f288173n3);
        this.f288179p1 = k(oVar, f288174o3);
        com.google.gson.l lVarS2 = oVar.S(f288175p3);
        if (lVarS2 != null) {
            if (!lVarS2.J()) {
                throw w.d("Message operation is of type \"" + lVarS2.getClass() + "\" when expected a JSON object.");
            }
            this.H1 = b.a(lVarS2.v());
        }
        com.google.gson.l lVarS3 = oVar.S(f288176q3);
        if (lVarS3 != null) {
            if (lVarS3.J()) {
                this.f288180p2 = m0.h(lVarS3.v());
                return;
            }
            throw w.d("Message summary is of type \"" + lVarS3.getClass() + "\" when expected a JSON object.");
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{Message");
        super.e(sb2);
        if (this.f288181s != null) {
            sb2.append(" name=");
            sb2.append(this.f288181s);
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    u u(org.msgpack.core.o oVar) throws IOException {
        int iB1 = oVar.b1();
        for (int i10 = 0; i10 < iB1; i10++) {
            String strIntern = oVar.h1().intern();
            org.msgpack.core.c cVarD = oVar.d();
            if (cVarD.equals(org.msgpack.core.c.f339230f)) {
                oVar.d1();
            } else if (!super.h(oVar, strIntern, cVarD)) {
                if (strIntern.equals("name")) {
                    this.f288181s = oVar.h1();
                } else if (strIntern.equals("extras")) {
                    this.f288182t = x.e(oVar);
                } else if (strIntern.equals(f288168i3)) {
                    this.f288183v = oVar.h1();
                } else if (strIntern.equals(f288169j3)) {
                    this.f288184w = oVar.h1();
                } else if (strIntern.equals("version")) {
                    this.X = oVar.h1();
                } else if (strIntern.equals("action")) {
                    this.Y = v.l(oVar.T0());
                } else if (strIntern.equals(f288172m3)) {
                    this.Z = Long.valueOf(oVar.U0());
                } else if (strIntern.equals(f288173n3)) {
                    this.f288178p0 = oVar.h1();
                } else if (strIntern.equals(f288174o3)) {
                    this.f288179p1 = oVar.h1();
                } else if (strIntern.equals(f288175p3)) {
                    this.H1 = b.b(oVar);
                } else if (strIntern.equals(f288176q3)) {
                    this.f288180p2 = m0.i(oVar);
                } else {
                    io.ably.lib.util.k.k(f288177r3, "Unexpected field: " + strIntern);
                    oVar.a9();
                }
            }
        }
        return this;
    }

    void v(org.msgpack.core.j jVar) throws IOException {
        int iA = super.a();
        if (this.f288181s != null) {
            iA++;
        }
        if (this.f288182t != null) {
            iA++;
        }
        if (this.f288183v != null) {
            iA++;
        }
        if (this.f288184w != null) {
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
        if (this.f288178p0 != null) {
            iA++;
        }
        if (this.f288179p1 != null) {
            iA++;
        }
        if (this.H1 != null) {
            iA++;
        }
        if (this.f288180p2 != null) {
            iA++;
        }
        jVar.y(iA);
        super.o(jVar);
        if (this.f288181s != null) {
            jVar.N("name");
            jVar.N(this.f288181s);
        }
        if (this.f288182t != null) {
            jVar.N("extras");
            this.f288182t.f(jVar);
        }
        if (this.f288183v != null) {
            jVar.N(f288168i3);
            jVar.N(this.f288183v);
        }
        if (this.f288184w != null) {
            jVar.N(f288169j3);
            jVar.N(this.f288184w);
        }
        if (this.X != null) {
            jVar.N("version");
            jVar.N(this.X);
        }
        if (this.Y != null) {
            jVar.N("action");
            jVar.t(this.Y.ordinal());
        }
        if (this.Z != null) {
            jVar.N(f288172m3);
            jVar.x(this.Z.longValue());
        }
        if (this.f288178p0 != null) {
            jVar.N(f288173n3);
            jVar.N(this.f288178p0);
        }
        if (this.f288179p1 != null) {
            jVar.N(f288174o3);
            jVar.N(this.f288179p1);
        }
        if (this.H1 != null) {
            jVar.N(f288175p3);
            this.H1.c(jVar);
        }
        if (this.f288180p2 != null) {
            jVar.N(f288176q3);
            this.f288180p2.k(jVar);
        }
    }

    public u(String str, Object obj) {
        this(str, obj, null, null);
    }

    public u(String str, Object obj, String str2) {
        this(str, obj, str2, null);
    }

    public u(String str, Object obj, x xVar) {
        this(str, obj, null, xVar);
    }

    public u(String str, Object obj, String str2, x xVar) {
        this.f288181s = str;
        this.f288019c = str2;
        this.f288022f = obj;
        this.f288182t = xVar;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String[] f288185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public u[] f288186b;

        public a(String str, u[] uVarArr) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("A Batch spec cannot have an empty set of channels");
            }
            if (uVarArr == null || uVarArr.length == 0) {
                throw new IllegalArgumentException("A Batch spec cannot have an empty set of messages");
            }
            this.f288185a = new String[]{str};
            this.f288186b = uVarArr;
        }

        public void a(org.msgpack.core.j jVar) throws IOException {
            jVar.y(2);
            jVar.N("channels");
            jVar.g(this.f288185a.length);
            for (String str : this.f288185a) {
                jVar.N(str);
            }
            jVar.N("messages");
            y.o(this.f288186b, jVar);
        }

        public a(String[] strArr, u[] uVarArr) {
            if (strArr != null && strArr.length != 0) {
                if (uVarArr != null && uVarArr.length != 0) {
                    this.f288185a = strArr;
                    this.f288186b = uVarArr;
                    return;
                }
                throw new IllegalArgumentException("A Batch spec cannot have an empty set of messages");
            }
            throw new IllegalArgumentException("A Batch spec cannot have an empty set of channels");
        }

        public a(Collection<String> collection, Collection<u> collection2) {
            this((String[]) collection.toArray(new String[0]), (u[]) collection2.toArray(new u[0]));
        }
    }
}
