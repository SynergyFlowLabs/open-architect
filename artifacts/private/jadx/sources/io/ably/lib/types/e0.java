package io.ably.lib.types;

import com.appsflyer.AppsFlyerProperties;
import com.facebook.internal.w0;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class e0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f287954r = "io.ably.lib.types.e0";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f287955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f287956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f287957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f287958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f287959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f287960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f287961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f287962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Long f287963i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f287964j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u[] f287965k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c0[] f287966l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public o f287967m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c f287968n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Map<String, String> f287969o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public io.ably.lib.types.b[] f287970p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @com.google.gson.annotations.b(mg.f.class)
    @Nullable
    public Object[] f287971q;

    public enum a {
        heartbeat,
        ack,
        nack,
        connect,
        connected,
        disconnect,
        disconnected,
        close,
        closed,
        error,
        attach,
        attached,
        detach,
        detached,
        presence,
        message,
        sync,
        auth,
        activate,
        object,
        object_sync,
        annotation;

        public static a l(int i10) {
            return values()[i10];
        }

        public int n() {
            return ordinal();
        }
    }

    public static class b implements com.google.gson.t<a>, com.google.gson.k<a> {
        @Override // com.google.gson.k
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(com.google.gson.l lVar, Type type, com.google.gson.j jVar) throws com.google.gson.p {
            return a.l(lVar.s());
        }

        @Override // com.google.gson.t
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public com.google.gson.l b(a aVar, Type type, com.google.gson.s sVar) {
            return new com.google.gson.r(Integer.valueOf(aVar.n()));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f287992a;

        private c() {
        }

        static c a(org.msgpack.core.o oVar) throws IOException {
            return new c().b(oVar);
        }

        c b(org.msgpack.core.o oVar) throws IOException {
            int iB1 = oVar.b1();
            for (int i10 = 0; i10 < iB1; i10++) {
                String strIntern = oVar.h1().intern();
                if (oVar.d().equals(org.msgpack.core.c.f339230f)) {
                    oVar.d1();
                } else {
                    strIntern.getClass();
                    if (strIntern.equals("accessToken")) {
                        this.f287992a = oVar.h1();
                    } else {
                        io.ably.lib.util.k.k(e0.f287954r, "Unexpected field: " + strIntern);
                        oVar.a9();
                    }
                }
            }
            return this;
        }

        void c(org.msgpack.core.j jVar) throws IOException {
            jVar.y(this.f287992a != null ? 1 : 0);
            if (this.f287992a != null) {
                jVar.N("accessToken");
                jVar.N(this.f287992a);
            }
        }

        public c(String str) {
            this.f287992a = str;
        }
    }

    public enum d {
        has_presence(0),
        has_backlog(1),
        resumed(2),
        attach_resume(5),
        has_objects(7),
        presence(16),
        publish(17),
        subscribe(18),
        presence_subscribe(19),
        annotation_publish(21),
        annotation_subscribe(22),
        object_subscribe(24),
        object_publish(25);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f288007a;

        d(int i10) {
            this.f288007a = 1 << i10;
        }

        public int l() {
            return this.f288007a;
        }
    }

    public e0() {
    }

    public static boolean b(e0 e0Var) {
        a aVar = e0Var.f287955a;
        return aVar == a.message || aVar == a.presence || aVar == a.object || aVar == a.annotation;
    }

    static e0 c(org.msgpack.core.o oVar) throws IOException {
        return new e0().e(oVar);
    }

    public boolean d(d dVar) {
        return (this.f287956b & dVar.l()) == dVar.l();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    e0 e(org.msgpack.core.o oVar) throws IOException {
        int iB1 = oVar.b1();
        for (int i10 = 0; i10 < iB1; i10++) {
            String strIntern = oVar.h1().intern();
            if (!oVar.d().equals(org.msgpack.core.c.f339230f)) {
                strIntern.getClass();
                byte b10 = -1;
                switch (strIntern.hashCode()) {
                    case -1487721259:
                        if (strIntern.equals("msgSerial")) {
                            b10 = 0;
                        }
                        break;
                    case -1422950858:
                        if (strIntern.equals(w0.f100156c1)) {
                            b10 = 1;
                        }
                        break;
                    case -1276666629:
                        if (strIntern.equals("presence")) {
                            b10 = 2;
                        }
                        break;
                    case -995427962:
                        if (strIntern.equals("params")) {
                            b10 = 3;
                        }
                        break;
                    case -961709276:
                        if (strIntern.equals("annotations")) {
                            b10 = 4;
                        }
                        break;
                    case -513224031:
                        if (strIntern.equals("connectionKey")) {
                            b10 = 5;
                        }
                        break;
                    case -462094004:
                        if (strIntern.equals("messages")) {
                            b10 = 6;
                        }
                        break;
                    case 3355:
                        if (strIntern.equals("id")) {
                            b10 = 7;
                        }
                        break;
                    case 3005864:
                        if (strIntern.equals("auth")) {
                            b10 = 8;
                        }
                        break;
                    case 55126294:
                        if (strIntern.equals("timestamp")) {
                            b10 = 9;
                        }
                        break;
                    case 94851343:
                        if (strIntern.equals("count")) {
                            b10 = 10;
                        }
                        break;
                    case 96784904:
                        if (strIntern.equals("error")) {
                            b10 = 11;
                        }
                        break;
                    case 97513095:
                        if (strIntern.equals("flags")) {
                            b10 = com.google.common.base.c.f116461n;
                        }
                        break;
                    case 109757585:
                        if (strIntern.equals("state")) {
                            b10 = com.google.common.base.c.f116462o;
                        }
                        break;
                    case 321402244:
                        if (strIntern.equals("connectionDetails")) {
                            b10 = com.google.common.base.c.f116463p;
                        }
                        break;
                    case 738950403:
                        if (strIntern.equals(AppsFlyerProperties.CHANNEL)) {
                            b10 = com.google.common.base.c.f116464q;
                        }
                        break;
                    case 1423136983:
                        if (strIntern.equals("channelSerial")) {
                            b10 = com.google.common.base.c.f116465r;
                        }
                        break;
                    case 1923106969:
                        if (strIntern.equals(io.ably.lib.realtime.l.f287648k)) {
                            b10 = 17;
                        }
                        break;
                }
                switch (b10) {
                    case 0:
                        this.f287963i = Long.valueOf(oVar.U0());
                        break;
                    case 1:
                        this.f287955a = a.l(oVar.T0());
                        break;
                    case 2:
                        this.f287966l = d0.h(oVar);
                        break;
                    case 3:
                        this.f287969o = y.l(oVar);
                        break;
                    case 4:
                        this.f287970p = io.ably.lib.types.d.g(oVar);
                        break;
                    case 5:
                        oVar.h1();
                        break;
                    case 6:
                        this.f287965k = y.k(oVar);
                        break;
                    case 7:
                        this.f287959e = oVar.h1();
                        break;
                    case 8:
                        this.f287968n = c.a(oVar);
                        break;
                    case 9:
                        this.f287964j = oVar.U0();
                        break;
                    case 10:
                        this.f287957c = oVar.T0();
                        break;
                    case 11:
                        this.f287958d = r.a(oVar);
                        break;
                    case 12:
                        this.f287956b = oVar.T0();
                        break;
                    case 13:
                        mg.g gVarA = mg.e.a();
                        if (gVarA != null) {
                            this.f287971q = gVarA.a(oVar);
                        } else {
                            io.ably.lib.util.k.m(f287954r, "Skipping 'state' field msgpack deserialization because ObjectsSerializer not found");
                            oVar.a9();
                        }
                        break;
                    case 14:
                        this.f287967m = o.a(oVar);
                        break;
                    case 15:
                        this.f287960f = oVar.h1();
                        break;
                    case 16:
                        this.f287961g = oVar.h1();
                        break;
                    case 17:
                        this.f287962h = oVar.h1();
                        break;
                    default:
                        io.ably.lib.util.k.k(f287954r, "Unexpected field: " + strIntern);
                        oVar.a9();
                        break;
                }
            } else {
                oVar.d1();
            }
        }
        return this;
    }

    public void f(d dVar) {
        this.f287956b = dVar.l() | this.f287956b;
    }

    public void g(int i10) {
        this.f287956b = i10 | this.f287956b;
    }

    void h(org.msgpack.core.j jVar) throws IOException {
        int i10 = this.f287960f != null ? 2 : 1;
        if (this.f287963i != null) {
            i10++;
        }
        if (this.f287965k != null) {
            i10++;
        }
        if (this.f287966l != null) {
            i10++;
        }
        if (this.f287968n != null) {
            i10++;
        }
        if (this.f287956b != 0) {
            i10++;
        }
        if (this.f287969o != null) {
            i10++;
        }
        if (this.f287961g != null) {
            i10++;
        }
        if (this.f287970p != null) {
            i10++;
        }
        if (this.f287971q != null && mg.e.a() != null) {
            i10++;
        }
        jVar.y(i10);
        jVar.N(w0.f100156c1);
        jVar.t(this.f287955a.n());
        if (this.f287960f != null) {
            jVar.N(AppsFlyerProperties.CHANNEL);
            jVar.N(this.f287960f);
        }
        if (this.f287963i != null) {
            jVar.N("msgSerial");
            jVar.x(this.f287963i.longValue());
        }
        if (this.f287965k != null) {
            jVar.N("messages");
            y.o(this.f287965k, jVar);
        }
        if (this.f287966l != null) {
            jVar.N("presence");
            d0.i(this.f287966l, jVar);
        }
        if (this.f287968n != null) {
            jVar.N("auth");
            this.f287968n.c(jVar);
        }
        if (this.f287956b != 0) {
            jVar.N("flags");
            jVar.t(this.f287956b);
        }
        if (this.f287969o != null) {
            jVar.N("params");
            y.m(this.f287969o, jVar);
        }
        if (this.f287961g != null) {
            jVar.N("channelSerial");
            jVar.N(this.f287961g);
        }
        if (this.f287970p != null) {
            jVar.N("annotations");
            io.ably.lib.types.d.h(this.f287970p, jVar);
        }
        if (this.f287971q != null) {
            mg.g gVarA = mg.e.a();
            if (gVarA != null) {
                jVar.N("state");
                gVarA.c(this.f287971q, jVar);
                return;
            }
            io.ably.lib.util.k.m(f287954r, "Skipping 'state' field msgpack serialization because ObjectsSerializer not found");
        }
    }

    public e0(a aVar) {
        this.f287955a = aVar;
    }

    public e0(a aVar, String str) {
        this.f287955a = aVar;
        this.f287960f = str;
    }
}
