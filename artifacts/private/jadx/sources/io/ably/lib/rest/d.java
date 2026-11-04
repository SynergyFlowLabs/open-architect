package io.ably.lib.rest;

import com.google.gson.l;
import com.google.gson.o;
import io.ably.lib.http.m;
import io.ably.lib.types.b0;
import io.ably.lib.types.n;
import io.ably.lib.types.r;
import io.ably.lib.types.z;
import io.ably.lib.util.p;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes13.dex */
public class d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f287692l = "io.ably.lib.rest.d";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f287693m = "*";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f287694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.ably.lib.rest.a f287695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumC1943d f287696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e f287697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j f287698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f287699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i f287700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f287701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f287702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f287703j = Long.MAX_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f287704k = System.currentTimeMillis() - (System.nanoTime() / 1000000);

    class a implements io.ably.lib.http.i.e<Object> {
        a() {
        }

        @Override // io.ably.lib.http.i.e
        public Object a(io.ably.lib.http.i.d dVar, r rVar) throws io.ably.lib.types.a {
            if (rVar != null) {
                throw io.ably.lib.types.a.a(rVar);
            }
            try {
                String str = dVar.f287359d;
                byte[] bArr = dVar.f287361f;
                if (bArr != null && bArr.length != 0) {
                    if (str != null) {
                        if (!str.startsWith("text/plain") && !str.startsWith("application/jwt")) {
                            if (!str.startsWith("application/json")) {
                                throw io.ably.lib.types.a.a(new r("Unacceptable content type from auth callback", com.rabbitmq.client.a.f264843n, 40170));
                            }
                        }
                        return new i(new String(bArr));
                    }
                    l lVarC = p.f288248a.c(new String(bArr));
                    if (!(lVarC instanceof o)) {
                        throw io.ably.lib.types.a.a(new r("Unexpected response type from auth callback", com.rabbitmq.client.a.f264843n, 40170));
                    }
                    o oVar = (o) lVarC;
                    return oVar.W("issued") ? i.e(oVar) : k.j(oVar);
                }
                return null;
            } catch (com.google.gson.p unused) {
                throw io.ably.lib.types.a.a(new r("Unable to parse response from auth callback", com.rabbitmq.client.a.f264843n, 40170));
            }
        }
    }

    class b implements io.ably.lib.http.i.e<i> {
        b() {
        }

        @Override // io.ably.lib.http.i.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(io.ably.lib.http.i.d dVar, r rVar) throws io.ably.lib.types.a {
            if (rVar != null) {
                throw io.ably.lib.types.a.a(rVar);
            }
            try {
                return i.e((o) p.f288248a.c(new String(dVar.f287361f)));
            } catch (com.google.gson.p e10) {
                throw io.ably.lib.types.a.c(e10);
            }
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f287707a;

        static {
            int[] iArr = new int[EnumC1943d.values().length];
            f287707a = iArr;
            try {
                iArr[EnumC1943d.basic.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f287707a[EnumC1943d.token.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: io.ably.lib.rest.d$d, reason: collision with other inner class name */
    public enum EnumC1943d {
        basic,
        token
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h f287711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f287712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f287713c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f287714d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f287715e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public i f287716f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public b0[] f287717g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public b0[] f287718h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f287719i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f287720j;

        public e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public e c() {
            e eVar = new e();
            eVar.f287714d = this.f287714d;
            eVar.f287712b = this.f287712b;
            eVar.f287713c = this.f287713c;
            eVar.f287718h = this.f287718h;
            eVar.f287717g = this.f287717g;
            eVar.f287715e = this.f287715e;
            eVar.f287716f = this.f287716f;
            eVar.f287711a = this.f287711a;
            eVar.f287719i = this.f287719i;
            return eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public e d() {
            e eVar = new e();
            eVar.f287714d = this.f287714d;
            eVar.f287712b = this.f287712b;
            eVar.f287713c = this.f287713c;
            eVar.f287718h = this.f287718h;
            eVar.f287717g = this.f287717g;
            eVar.f287715e = this.f287715e;
            eVar.f287716f = this.f287716f;
            eVar.f287711a = this.f287711a;
            return eVar;
        }

        public e(String str) throws io.ably.lib.types.a {
            if (str == null) {
                throw io.ably.lib.types.a.a(new r("key string cannot be null", 40000, 400));
            }
            if (str.isEmpty()) {
                throw new IllegalArgumentException("Key string cannot be empty");
            }
            if (str.indexOf(58) > -1) {
                this.f287714d = str;
            } else {
                this.f287715e = str;
            }
        }
    }

    public interface f {
        void a(boolean z10, r rVar);
    }

    public interface g {
        void a(boolean z10, i iVar, r rVar);
    }

    public interface h {
        Object a(j jVar) throws io.ably.lib.types.a;
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f287721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f287722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f287723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f287724d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f287725e;

        public i() {
        }

        @Deprecated
        public static i c(o oVar) {
            return (i) p.f288250c.j(oVar, i.class);
        }

        public static i d(String str) {
            return (i) p.f288250c.r(str, i.class);
        }

        public static i e(o oVar) {
            return (i) p.f288250c.j(oVar, i.class);
        }

        public String a() {
            return b().toString();
        }

        public o b() {
            return (o) p.f288250c.K(this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return d.l(this.f287721a, iVar.f287721a) & d.l(this.f287724d, iVar.f287724d) & d.l(this.f287725e, iVar.f287725e) & (this.f287723c == iVar.f287723c) & (this.f287722b == iVar.f287722b);
        }

        public int hashCode() {
            return Objects.hash(this.f287721a, this.f287724d, this.f287725e, Long.valueOf(this.f287723c), Long.valueOf(this.f287722b));
        }

        public i(String str) {
            this.f287721a = str;
        }
    }

    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f287726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f287727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f287728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f287729d;

        /* JADX INFO: Access modifiers changed from: private */
        public j d() {
            j jVar = new j();
            jVar.f287726a = this.f287726a;
            jVar.f287727b = this.f287727b;
            jVar.f287728c = this.f287728c;
            jVar.f287729d = this.f287729d;
            return jVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public j e() {
            j jVar = new j();
            jVar.f287726a = this.f287726a;
            jVar.f287727b = this.f287727b;
            jVar.f287728c = this.f287728c;
            return jVar;
        }

        public Map<String, b0> c() {
            HashMap map = new HashMap();
            long j10 = this.f287726a;
            if (j10 > 0) {
                map.put("ttl", new b0("ttl", String.valueOf(j10)));
            }
            String str = this.f287727b;
            if (str != null) {
                map.put("capability", new b0("capability", str));
            }
            String str2 = this.f287728c;
            if (str2 != null) {
                map.put(io.ably.lib.realtime.l.f287647j, new b0(io.ably.lib.realtime.l.f287647j, str2));
            }
            long j11 = this.f287729d;
            if (j11 > 0) {
                map.put("timestamp", new b0("timestamp", String.valueOf(j11)));
            }
            return map;
        }

        public boolean equals(Object obj) {
            j jVar = (j) obj;
            return (this.f287726a == jVar.f287726a) & d.l(this.f287727b, jVar.f287727b) & d.l(this.f287728c, jVar.f287728c) & (this.f287729d == jVar.f287729d);
        }
    }

    public static class k extends j {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f287730e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f287731f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f287732g;

        public k() {
        }

        @Deprecated
        public static k h(o oVar) {
            return (k) p.f288250c.j(oVar, k.class);
        }

        public static k i(String str) {
            return (k) p.f288250c.r(str, k.class);
        }

        public static k j(o oVar) {
            return (k) p.f288250c.j(oVar, k.class);
        }

        @Override // io.ably.lib.rest.d.j
        public boolean equals(Object obj) {
            k kVar = (k) obj;
            return d.l(this.f287732g, kVar.f287732g) & super.equals(obj) & d.l(this.f287730e, kVar.f287730e) & d.l(this.f287731f, kVar.f287731f);
        }

        public String f() {
            return g().toString();
        }

        public o g() {
            o oVar = (o) p.f288250c.K(this);
            if (this.f287726a == 0) {
                oVar.Z("ttl");
            }
            String str = this.f287727b;
            if (str != null && str.isEmpty()) {
                oVar.Z("capability");
            }
            return oVar;
        }

        public k(j jVar) {
            this.f287726a = jVar.f287726a;
            this.f287727b = jVar.f287727b;
            this.f287728c = jVar.f287728c;
            this.f287729d = jVar.f287729d;
        }
    }

    d(io.ably.lib.rest.a aVar, n nVar) throws io.ably.lib.types.a {
        this.f287695b = aVar;
        this.f287697d = nVar;
        j jVar = nVar.L;
        this.f287698e = jVar == null ? new j() : jVar;
        String str = nVar.f288115k;
        if (str != null) {
            if (str.equals("*")) {
                throw io.ably.lib.types.a.a(new r("Disallowed wildcard clientId in ClientOptions", 400, 40000));
            }
            A(nVar.f288115k);
            this.f287698e.f287728c = nVar.f288115k;
        }
        e eVar = this.f287697d;
        if (eVar.f287714d != null && !nVar.f287720j && nVar.f287715e == null && nVar.f287716f == null && nVar.f287711a == null && nVar.f287712b == null) {
            io.ably.lib.util.k.f("Auth()", "anonymous, using basic auth");
            this.f287696c = EnumC1943d.basic;
            this.f287699f = this.f287697d.f287714d;
            A("*");
            return;
        }
        this.f287696c = EnumC1943d.token;
        String str2 = eVar.f287715e;
        if (str2 != null) {
            C(str2);
        } else {
            i iVar = eVar.f287716f;
            if (iVar != null) {
                B(iVar);
            }
        }
        e eVar2 = this.f287697d;
        if (eVar2.f287711a != null) {
            io.ably.lib.util.k.f("Auth()", "using token auth with authCallback");
            return;
        }
        String str3 = eVar2.f287712b;
        if (str3 != null) {
            m.l(str3);
            io.ably.lib.util.k.f("Auth()", "using token auth with authUrl");
        } else if (eVar2.f287714d != null) {
            io.ably.lib.util.k.f("Auth()", "using token auth with client-side signing");
        } else if (this.f287700g != null) {
            io.ably.lib.util.k.f("Auth()", "using token auth with supplied token only");
        } else {
            io.ably.lib.util.k.d("Auth()", "no authentication parameters supplied");
            throw io.ably.lib.types.a.a(new r("No authentication parameters supplied", 400, 40000));
        }
    }

    private void B(i iVar) throws io.ably.lib.types.a {
        io.ably.lib.util.k.f("TokenAuth.setTokenDetails()", "");
        A(iVar.f287725e);
        this.f287700g = iVar;
        this.f287701h = io.ably.lib.util.b.k(iVar.f287721a);
    }

    private void C(String str) throws io.ably.lib.types.a {
        io.ably.lib.util.k.f("TokenAuth.setTokenDetails()", "");
        this.f287700g = new i(str);
        this.f287701h = io.ably.lib.util.b.k(str);
    }

    private boolean D(r rVar) {
        return rVar.f288157b == 403 && rVar.f288156a == 80019;
    }

    public static long E() {
        return System.currentTimeMillis();
    }

    private boolean F(i iVar) {
        return this.f287703j == Long.MAX_VALUE || iVar.f287722b > z();
    }

    private i e(j jVar, e eVar, boolean z10) throws io.ably.lib.types.a {
        io.ably.lib.util.k.f("Auth.assertValidToken()", "");
        i iVar = this.f287700g;
        if (iVar != null) {
            if (!z10 && (iVar.f287722b == 0 || F(iVar))) {
                io.ably.lib.util.k.f("Auth.assertValidToken()", "using cached token; expires = " + this.f287700g.f287722b);
                return this.f287700g;
            }
            io.ably.lib.util.k.f("Auth.assertValidToken()", "deleting expired token");
            j();
        }
        io.ably.lib.util.k.f("Auth.assertValidToken()", "requesting new token");
        try {
            B(y(jVar, eVar));
            return this.f287700g;
        } catch (io.ably.lib.types.a e10) {
            if (D(e10.f287918a)) {
                this.f287695b.a(e10.f287918a);
            }
            throw e10;
        }
    }

    private void j() {
        io.ably.lib.util.k.f("TokenAuth.clearTokenDetails()", "");
        this.f287700g = null;
        this.f287701h = null;
        this.f287702i = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    private static String t(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(Charset.forName("UTF-8")), "HmacSHA256"));
            return new String(io.ably.lib.util.b.f(mac.doFinal(str.getBytes(Charset.forName("UTF-8")))));
        } catch (GeneralSecurityException e10) {
            io.ably.lib.util.k.e("Auth.hmac", "Unexpected exception", e10);
            return null;
        }
    }

    private static String v() {
        return String.format(Locale.ROOT, "%016d", Long.valueOf((long) (Math.random() * 1.0E16d)));
    }

    public void A(String str) throws io.ably.lib.types.a {
        if (str == null) {
            return;
        }
        String str2 = this.f287694a;
        if (str2 == null) {
            this.f287694a = str;
            this.f287695b.d(str);
        } else if (!str2.equals(str) && !"*".equals(str)) {
            throw io.ably.lib.types.a.a(new r("Unable to set different clientId from that given in options", 401, 40101));
        }
    }

    public void c(boolean z10) throws io.ably.lib.types.a {
        if (this.f287702i == null || z10) {
            if (m() == EnumC1943d.basic) {
                this.f287702i = "Basic " + io.ably.lib.util.b.k(q());
                return;
            }
            if (z10) {
                w();
            } else {
                d();
            }
            this.f287702i = "Bearer " + r();
        }
    }

    public i d() throws io.ably.lib.types.a {
        return e(this.f287698e, this.f287697d, false);
    }

    @Deprecated
    public i f(j jVar, e eVar) throws io.ably.lib.types.a {
        io.ably.lib.util.k.m(f287692l, "authorise() is deprecated and will be removed in 1.0. Please use authorize() instead");
        return g(jVar, eVar);
    }

    public i g(j jVar, e eVar) throws io.ably.lib.types.a {
        if (eVar != null) {
            this.f287697d = eVar.d();
        }
        if (jVar != null) {
            this.f287698e = jVar.e();
        }
        e eVarC = eVar == null ? this.f287697d : eVar.c();
        j jVarD = jVar == null ? this.f287698e : jVar.d();
        e eVar2 = this.f287697d;
        String str = eVar2.f287715e;
        if (str != null) {
            eVar2.f287716f = new i(str);
        }
        i iVarE = this.f287697d.f287716f;
        if (iVarE != null) {
            B(iVarE);
        } else {
            try {
                iVarE = e(jVarD, eVarC, true);
            } catch (io.ably.lib.types.a e10) {
                this.f287695b.a(e10.f287918a);
                throw e10;
            }
        }
        this.f287695b.b(iVarE.f287721a, true);
        return iVarE;
    }

    public String h(io.ably.lib.types.g gVar, boolean z10, boolean z11) throws io.ably.lib.types.a {
        String str = gVar.f288019c;
        if ("*".equals(str)) {
            throw io.ably.lib.types.a.a(new r("Invalid wildcard clientId specified in message", 400, 40000));
        }
        String str2 = this.f287694a;
        boolean z12 = str2 == null && !z11;
        if (str != null) {
            if (str.equals(str2) || "*".equals(this.f287694a) || z12) {
                return str;
            }
            throw io.ably.lib.types.a.a(new r("Incompatible clientId specified in message", 400, 40012));
        }
        if (str2 != null && !str2.equals("*")) {
            return this.f287694a;
        }
        if (!z10 && !z12) {
            throw io.ably.lib.types.a.a(new r("Invalid attempt to enter with no clientId", 400, 91000));
        }
        return null;
    }

    public void i() {
        this.f287703j = Long.MAX_VALUE;
    }

    public k k(j jVar, e eVar) throws io.ably.lib.types.a {
        e eVarC = eVar == null ? this.f287697d : eVar.c();
        j jVarD = jVar == null ? this.f287698e : jVar.d();
        jVarD.f287727b = io.ably.lib.types.j.c(jVarD.f287727b);
        k kVar = new k(jVarD);
        String str = eVarC.f287714d;
        if (str == null) {
            throw io.ably.lib.types.a.a(new r("No key specified", 401, 40101));
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length != 2) {
            throw io.ably.lib.types.a.a(new r("Invalid key specified", 401, 40101));
        }
        String str2 = strArrSplit[0];
        String str3 = strArrSplit[1];
        String str4 = kVar.f287730e;
        if (str4 == null) {
            kVar.f287730e = str2;
        } else if (!str4.equals(str2)) {
            throw io.ably.lib.types.a.a(new r("Incompatible keys specified", 401, 40102));
        }
        long j10 = kVar.f287726a;
        String strValueOf = j10 == 0 ? "" : String.valueOf(j10);
        String str5 = kVar.f287727b;
        if (str5 == null) {
            str5 = "";
        }
        if (kVar.f287728c == null) {
            kVar.f287728c = this.f287695b.f287674a.f288115k;
        }
        String str6 = kVar.f287728c;
        String str7 = str6 != null ? str6 : "";
        if (kVar.f287729d == 0) {
            if (eVarC.f287719i) {
                long j11 = this.f287704k;
                long jCurrentTimeMillis = System.currentTimeMillis() - (System.nanoTime() / 1000000);
                if (this.f287703j != Long.MAX_VALUE && Math.abs(j11 - jCurrentTimeMillis) > 500) {
                    this.f287703j = Long.MAX_VALUE;
                }
                if (this.f287703j != Long.MAX_VALUE) {
                    kVar.f287729d = E() + this.f287703j;
                    this.f287704k = jCurrentTimeMillis;
                } else {
                    long jE = this.f287695b.E();
                    kVar.f287729d = jE;
                    this.f287703j = jE - E();
                }
            } else {
                kVar.f287729d = E();
            }
        }
        kVar.f287731f = v();
        kVar.f287732g = t(kVar.f287730e + '\n' + strValueOf + '\n' + str5 + '\n' + str7 + '\n' + kVar.f287729d + '\n' + kVar.f287731f + '\n', str3);
        io.ably.lib.util.k.f("Auth.getTokenRequest()", "generated signed request");
        return kVar;
    }

    public EnumC1943d m() {
        return this.f287696c;
    }

    public e n() {
        return this.f287697d.c();
    }

    public b0[] o() throws io.ably.lib.types.a {
        int i10 = c.f287707a[this.f287696c.ordinal()];
        if (i10 == 1) {
            return new b0[]{new b0("key", this.f287697d.f287714d)};
        }
        if (i10 != 2) {
            return null;
        }
        d();
        return new b0[]{new b0("accessToken", s().f287721a)};
    }

    public String p() {
        return this.f287702i;
    }

    public String q() {
        if (this.f287696c == EnumC1943d.basic) {
            return this.f287699f;
        }
        return null;
    }

    public String r() {
        io.ably.lib.util.k.f("TokenAuth.getEncodedToken()", "");
        return this.f287701h;
    }

    public i s() {
        io.ably.lib.util.k.f("TokenAuth.getTokenDetails()", "");
        return this.f287700g;
    }

    public void u(r rVar) {
        int i10 = rVar.f288156a;
        if (i10 >= 40140 && i10 < 40150) {
            j();
        }
    }

    @Deprecated
    public i w() throws io.ably.lib.types.a {
        i iVarE = e(this.f287698e, this.f287697d, true);
        this.f287695b.b(iVarE.f287721a, false);
        return iVarE;
    }

    public void x(final g gVar) throws io.ably.lib.types.a {
        final i iVarE = e(this.f287698e, this.f287697d, true);
        this.f287695b.c(iVarE.f287721a, new f() { // from class: io.ably.lib.rest.c
            @Override // io.ably.lib.rest.d.f
            public final void a(boolean z10, r rVar) {
                gVar.a(z10, iVarE, rVar);
            }
        });
    }

    public i y(j jVar, e eVar) throws io.ably.lib.types.a {
        k kVarK;
        Object objB;
        e eVarC = eVar == null ? this.f287697d : eVar.c();
        j jVarD = jVar == null ? this.f287698e : jVar.d();
        if (jVarD.f287728c == null) {
            jVarD.f287728c = this.f287695b.f287674a.f288115k;
        }
        jVarD.f287727b = io.ably.lib.types.j.c(jVarD.f287727b);
        int i10 = 0;
        if (eVarC.f287711a != null) {
            io.ably.lib.util.k.f("Auth.requestToken()", "using token auth with auth_callback");
            try {
                Object objA = eVarC.f287711a.a(jVarD);
                if (objA instanceof String) {
                    return new i((String) objA);
                }
                if (objA instanceof i) {
                    return (i) objA;
                }
                if (!(objA instanceof k)) {
                    throw io.ably.lib.types.a.a(new r("Invalid authCallback response", 400, 40000));
                }
                kVarK = (k) objA;
            } catch (Exception e10) {
                boolean z10 = e10 instanceof z;
                if ((e10 instanceof io.ably.lib.types.a) && ((io.ably.lib.types.a) e10).f287918a.f288157b == 403) {
                    i10 = 1;
                }
                throw io.ably.lib.types.a.b(e10, new r("authCallback failed with an exception", (z10 || i10 != 0) ? 403 : 401, 80019));
            }
        } else if (eVarC.f287712b != null) {
            io.ably.lib.util.k.f("Auth.requestToken()", "using token auth with auth_url");
            try {
                a aVar = new a();
                URL urlL = m.l(this.f287697d.f287712b);
                String strO = m.o(this.f287697d.f287712b);
                String query = urlL.getQuery();
                Map<String, b0> mapC = (query == null || query.isEmpty()) ? null : m.c(query);
                Map<String, b0> mapC2 = jVarD.c();
                b0[] b0VarArr = eVarC.f287718h;
                if (b0VarArr != null) {
                    int length = b0VarArr.length;
                    while (i10 < length) {
                        b0 b0Var = b0VarArr[i10];
                        if (!mapC2.containsKey(b0Var.f287931a)) {
                            mapC2.put(b0Var.f287931a, b0Var);
                        }
                        i10++;
                    }
                }
                if ("POST".equals(eVarC.f287713c)) {
                    objB = io.ably.lib.http.j.g(this.f287695b.f287676c, strO, eVarC.f287717g, m.g(mapC), m.g(mapC2), aVar);
                } else {
                    if (mapC != null) {
                        mapC2 = m.k(mapC, mapC2);
                    }
                    objB = io.ably.lib.http.j.b(this.f287695b.f287676c, strO, eVarC.f287717g, m.g(mapC2), aVar);
                }
                if (objB == null) {
                    throw io.ably.lib.types.a.b(null, new r("Empty response received from authUrl", 401, 80019));
                }
                if (objB instanceof i) {
                    return (i) objB;
                }
                kVarK = (k) objB;
            } catch (io.ably.lib.types.a e11) {
                throw io.ably.lib.types.a.b(e11, new r("authUrl failed with an exception", e11.f287918a.f288157b, 80019));
            }
        } else {
            if (eVarC.f287714d == null) {
                throw io.ably.lib.types.a.a(new r("Auth.requestToken(): options must include valid authentication parameters", 400, 40106));
            }
            io.ably.lib.util.k.f("Auth.requestToken()", "using token auth with client-side signing");
            kVarK = k(jVarD, eVarC);
        }
        return (i) io.ably.lib.http.j.f(this.f287695b.f287675b, "/keys/" + kVarK.f287730e + "/requestToken", null, null, new m.c(kVarK.g().toString()), new b(), false);
    }

    public long z() {
        long jE = E();
        long j10 = this.f287703j;
        return j10 != Long.MAX_VALUE ? jE + j10 : jE;
    }
}
