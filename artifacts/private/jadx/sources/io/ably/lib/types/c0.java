package io.ably.lib.types;

import com.facebook.internal.w0;
import java.io.IOException;
import java.lang.reflect.Type;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
public class c0 extends g implements Cloneable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f287936t = "io.ably.lib.types.c0";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a f287937s;

    public enum a {
        absent,
        present,
        enter,
        leave,
        update;

        static {
            int i10 = 2 >> 4;
        }

        public static a l(int i10) {
            return values()[i10];
        }

        public int n() {
            return ordinal();
        }
    }

    public static class b implements com.google.gson.k<a> {
        @Override // com.google.gson.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(com.google.gson.l lVar, Type type, com.google.gson.j jVar) throws com.google.gson.p {
            return a.l(lVar.s());
        }
    }

    public static class c implements com.google.gson.t<c0> {
        @Override // com.google.gson.t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.google.gson.l b(c0 c0Var, Type type, com.google.gson.s sVar) {
            com.google.gson.o oVarL = g.l(c0Var);
            a aVar = c0Var.f287937s;
            if (aVar != null) {
                oVarL.O(w0.f100156c1, Integer.valueOf(aVar.n()));
            }
            return oVarL;
        }
    }

    public c0() {
    }

    public static c0 p(com.google.gson.o oVar, l lVar) throws w {
        try {
            c0 c0Var = (c0) io.ably.lib.util.p.f288250c.j(oVar, c0.class);
            c0Var.b(lVar);
            if (c0Var.f287937s != null) {
                return c0Var;
            }
            throw w.d("Action cannot be null/empty");
        } catch (Exception e10) {
            io.ably.lib.util.k.e(c0.class.getName(), e10.getMessage(), e10);
            throw w.d(e10.getMessage());
        }
    }

    public static c0 q(String str, l lVar) throws w {
        try {
            return p((com.google.gson.o) io.ably.lib.util.p.f288250c.r(str, com.google.gson.o.class), lVar);
        } catch (Exception e10) {
            io.ably.lib.util.k.e(c0.class.getName(), e10.getMessage(), e10);
            throw w.d(e10.getMessage());
        }
    }

    public static c0[] r(com.google.gson.i iVar, l lVar) throws w {
        try {
            c0[] c0VarArr = new c0[iVar.size()];
            for (int i10 = 0; i10 < iVar.size(); i10++) {
                com.google.gson.l lVarU = iVar.U(i10);
                if (!lVarU.J()) {
                    throw new com.google.gson.p("Not all JSON elements are of type JSON Object.");
                }
                c0VarArr[i10] = p(lVarU.v(), lVar);
            }
            return c0VarArr;
        } catch (Exception e10) {
            io.ably.lib.util.k.e(c0.class.getName(), e10.getMessage(), e10);
            throw w.d(e10.getMessage());
        }
    }

    public static c0[] s(String str, l lVar) throws w {
        try {
            return r((com.google.gson.i) io.ably.lib.util.p.f288250c.r(str, com.google.gson.i.class), lVar);
        } catch (Exception e10) {
            io.ably.lib.util.k.e(c0.class.getName(), e10.getMessage(), e10);
            throw w.d(e10.getMessage());
        }
    }

    static c0 t(org.msgpack.core.o oVar) throws IOException {
        return new c0().v(oVar);
    }

    public Object clone() {
        c0 c0Var = new c0();
        c0Var.f288017a = this.f288017a;
        c0Var.f288018b = this.f288018b;
        c0Var.f288019c = this.f288019c;
        c0Var.f288020d = this.f288020d;
        c0Var.f288021e = this.f288021e;
        c0Var.f288022f = this.f288022f;
        c0Var.f287937s = this.f287937s;
        return c0Var;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{PresenceMessage");
        super.e(sb2);
        sb2.append(" action=");
        sb2.append(this.f287937s.name());
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    public String u() {
        return this.f288020d + AbstractJsonLexerKt.COLON + this.f288019c;
    }

    c0 v(org.msgpack.core.o oVar) throws IOException {
        int iB1 = oVar.b1();
        for (int i10 = 0; i10 < iB1; i10++) {
            String strIntern = oVar.h1().intern();
            org.msgpack.core.c cVarD = oVar.d();
            if (cVarD.equals(org.msgpack.core.c.f339230f)) {
                oVar.d1();
            } else if (!super.h(oVar, strIntern, cVarD)) {
                if (strIntern.equals(w0.f100156c1)) {
                    this.f287937s = a.l(oVar.T0());
                } else {
                    io.ably.lib.util.k.k(f287936t, "Unexpected field: " + strIntern);
                    oVar.a9();
                }
            }
        }
        return this;
    }

    void w(org.msgpack.core.j jVar) throws IOException {
        jVar.y(super.a() + 1);
        super.o(jVar);
        jVar.N(w0.f100156c1);
        jVar.t(this.f287937s.n());
    }

    public c0(a aVar, String str) {
        this(aVar, str, null);
    }

    public c0(a aVar, String str, Object obj) {
        this.f287937s = aVar;
        this.f288019c = str;
        this.f288022f = obj;
    }
}
