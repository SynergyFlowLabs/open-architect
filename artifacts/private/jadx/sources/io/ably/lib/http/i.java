package io.ably.lib.http;

import com.google.gson.p;
import io.ably.lib.types.b0;
import io.ably.lib.types.g0;
import io.ably.lib.types.r;
import io.ably.lib.types.s;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f287342j = "io.ably.lib.http.i";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f287344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.ably.lib.types.n f287345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.ably.lib.transport.d f287346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.ably.lib.rest.d f287347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.ably.lib.util.n f287348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.ably.lib.network.k f287349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private g f287350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, String> f287351i;

    public static class a extends io.ably.lib.types.a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f287352f = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f287353c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Map<g.b, String> f287354d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Map<g.b, String> f287355e;

        public a(Throwable th2, r rVar) {
            super(th2, rVar);
        }
    }

    public interface b<T> {
        T[] a(String str, byte[] bArr) throws io.ably.lib.types.a;
    }

    public interface c {
        String getContentType();

        byte[] getEncoded();
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f287356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f287357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Map<String, List<String>> f287358c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f287359d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f287360e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte[] f287361f;

        public String a(String str) {
            Map<String, List<String>> map = this.f287358c;
            if (map == null) {
                return null;
            }
            List<String> list = map.get(str.toLowerCase(Locale.ROOT));
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            return null;
        }

        public List<String> b(String str) {
            Map<String, List<String>> map = this.f287358c;
            if (map == null) {
                return null;
            }
            return map.get(str.toLowerCase(Locale.ROOT));
        }
    }

    public interface e<T> {
        T a(d dVar, r rVar) throws io.ably.lib.types.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    static {
        int i10;
        ?? r10;
        ?? field = 0;
        try {
            field = Class.forName("android.os.Build$VERSION").getField("SDK_INT");
            i10 = field.getInt(field);
            r10 = field;
        } catch (Exception unused) {
            i10 = 0;
            r10 = field;
        }
        if (r10 == 0 || i10 >= 8) {
            return;
        }
        System.setProperty("httpCore.keepAlive", "false");
    }

    public i(io.ably.lib.types.n nVar, io.ably.lib.rest.d dVar, io.ably.lib.util.n nVar2) throws io.ably.lib.types.a {
        this.f287345c = nVar;
        this.f287347e = dVar;
        this.f287348f = nVar2;
        this.f287343a = nVar.f288118n ? "https://" : "http://";
        this.f287344b = io.ably.lib.transport.c.b(nVar);
        this.f287346d = new io.ably.lib.transport.d(nVar.f288120p, io.ably.lib.transport.c.f287845i, nVar);
        g0 g0Var = nVar.f288129y;
        if (g0Var != null) {
            if (g0Var.f288023a == null) {
                throw io.ably.lib.types.a.a(new r("Unable to configure proxy without proxy host", 40000, 400));
            }
            if (g0Var.f288024b == 0) {
                throw io.ably.lib.types.a.a(new r("Unable to configure proxy without proxy port", 40000, 400));
            }
            String str = g0Var.f288025c;
            if (str != null) {
                String str2 = g0Var.f288026d;
                if (str2 == null) {
                    throw io.ably.lib.types.a.a(new r("Unable to configure proxy without proxy password", 40000, 400));
                }
                this.f287350h = new g(str, str2, g0Var.f288028f);
            }
        }
        io.ably.lib.network.m mVarB = io.ably.lib.network.m.b();
        io.ably.lib.util.k.k(f287342j, String.format("Using %s HTTP Engine", mVarB.c().name()));
        this.f287349g = mVarB.e(new io.ably.lib.network.l(io.ably.lib.util.c.a(nVar)));
    }

    private Map<String, String> b(URL url, String str, b0[] b0VarArr, c cVar, boolean z10, boolean z11) throws io.ably.lib.types.a {
        io.ably.lib.rest.d dVar;
        HashMap map = new HashMap();
        String strC = b0.c(b0VarArr, "Authorization");
        if (strC == null && (dVar = this.f287347e) != null) {
            strC = dVar.p();
        }
        if (z10 && strC != null) {
            map.put("Authorization", strC);
        }
        if (z11 && this.f287350h.g()) {
            map.put("Proxy-Authorization", this.f287350h.d(str, url.getPath(), cVar != null ? cVar.getEncoded() : null));
        }
        int i10 = 0;
        if (b0VarArr != null) {
            int length = b0VarArr.length;
            int i11 = 0;
            while (i10 < length) {
                b0 b0Var = b0VarArr[i10];
                map.put(b0Var.f287931a, b0Var.f287932b);
                if (b0Var.f287931a.equals("Accept")) {
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            map.put("Accept", "application/json");
        }
        map.put(io.ably.lib.transport.c.f287841e, "2");
        HashMap map2 = new HashMap();
        Map<String, String> map3 = this.f287345c.S;
        if (map3 != null) {
            map2.putAll(map3);
        }
        Map<String, String> map4 = this.f287351i;
        if (map4 != null) {
            map2.putAll(map4);
        }
        map.put(io.ably.lib.transport.c.f287843g, io.ably.lib.util.a.a(map2, this.f287348f));
        String str2 = this.f287345c.f288115k;
        if (str2 != null) {
            map.put(io.ably.lib.transport.c.f287842f, io.ably.lib.util.b.k(str2));
        }
        return map;
    }

    private d c(io.ably.lib.network.n nVar) {
        io.ably.lib.network.o oVarExecute = this.f287349g.a(nVar).execute();
        d dVar = new d();
        dVar.f287356a = oVarExecute.d();
        dVar.f287357b = oVarExecute.f();
        io.ably.lib.util.k.k(f287342j, "HTTP response:");
        Map<String, List<String>> mapE = oVarExecute.e();
        dVar.f287358c = new HashMap(mapE.size(), 1.0f);
        for (Map.Entry<String, List<String>> entry : mapE.entrySet()) {
            if (entry.getKey() != null) {
                dVar.f287358c.put(entry.getKey().toLowerCase(Locale.ROOT), entry.getValue());
                if (io.ably.lib.util.k.f288243h <= 2) {
                    for (String str : entry.getValue()) {
                        io.ably.lib.util.k.k(f287342j, entry.getKey() + ": " + str);
                    }
                }
            }
        }
        if (dVar.f287356a != 204 && oVarExecute.c() != null) {
            dVar.f287359d = oVarExecute.c().c();
            byte[] bArrB = oVarExecute.c().b();
            dVar.f287361f = bArrB;
            dVar.f287360e = bArrB == null ? 0 : bArrB.length;
            if (io.ably.lib.util.k.f288243h <= 2 && bArrB != null) {
                io.ably.lib.util.k.k(f287342j, System.lineSeparator() + new String(dVar.f287361f));
            }
        }
        return dVar;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    private <T> T f(boolean z10, d dVar, e<T> eVar) throws io.ably.lib.types.a {
        r rVarD;
        List<String> listB;
        int i10 = dVar.f287356a;
        if (i10 == 0) {
            return null;
        }
        if (i10 >= 500 && i10 <= 504) {
            throw io.ably.lib.types.a.a(r.d(dVar.f287357b, i10));
        }
        if (i10 >= 200 && i10 < 300) {
            if (eVar != null) {
                return eVar.a(dVar, null);
            }
            return null;
        }
        byte[] bArr = dVar.f287361f;
        if (bArr == null || bArr.length <= 0) {
            rVarD = null;
        } else {
            String str = dVar.f287359d;
            if (str == null || !str.contains("msgpack")) {
                String str2 = new String(dVar.f287361f);
                try {
                    s sVarA = s.a(str2);
                    if (sVarA != null) {
                        rVarD = sVarA.f288160a;
                    } else {
                        rVarD = null;
                    }
                } catch (p unused) {
                    System.err.println("Error message in unexpected format: " + str2);
                }
            } else {
                try {
                    rVarD = r.c(dVar.f287361f);
                } catch (IOException unused2) {
                    System.err.println("Unable to parse msgpack error response");
                    rVarD = null;
                }
            }
        }
        if (rVarD == null) {
            String strA = dVar.a("X-Ably-ErrorCode");
            String strA2 = dVar.a("X-Ably-ErrorMessage");
            if (strA != null) {
                try {
                    rVarD = new r(strA2, dVar.f287356a, Integer.parseInt(strA));
                } catch (NumberFormatException unused3) {
                }
            }
        }
        if (dVar.f287356a == 401) {
            boolean z11 = rVarD != null && rVarD.f288156a == 40140;
            List<String> listB2 = dVar.b("WWW-Authenticate");
            if (listB2 != null && listB2.size() > 0) {
                Map<g.b, String> mapJ = g.j(listB2);
                String str3 = mapJ.get(g.b.X_ABLY_TOKEN);
                if (str3 != null) {
                    z11 |= str3.indexOf("stale") > -1;
                }
                a aVar = new a(null, rVarD);
                aVar.f287354d = mapJ;
                if (z11) {
                    aVar.f287353c = true;
                    throw aVar;
                }
                if (!z10) {
                    throw aVar;
                }
            }
        }
        if (dVar.f287356a == 407 && (listB = dVar.b("Proxy-Authenticate")) != null && !listB.isEmpty()) {
            a aVar2 = new a(null, rVarD);
            aVar2.f287355e = g.j(listB);
            throw aVar2;
        }
        if (rVarD == null) {
            rVarD = r.d(dVar.f287357b, dVar.f287356a);
        }
        io.ably.lib.util.k.d(f287342j, "Error response from server: err = " + rVarD);
        if (eVar != null) {
            return eVar.a(dVar, rVarD);
        }
        throw io.ably.lib.types.a.a(rVarD);
    }

    void a(boolean z10) throws io.ably.lib.types.a {
        this.f287347e.c(z10);
    }

    public String d() {
        return this.f287346d.c();
    }

    public String e() {
        return this.f287346d.d();
    }

    public <T> T g(URL url, String str, b0[] b0VarArr, c cVar, boolean z10, e<T> eVar) throws io.ably.lib.types.a {
        return (T) h(url, str, b0VarArr, cVar, z10, this.f287349g.b() && this.f287350h != null, eVar);
    }

    <T> T h(URL url, String str, b0[] b0VarArr, c cVar, boolean z10, boolean z11, e<T> eVar) throws io.ably.lib.types.a {
        String strSubstring;
        io.ably.lib.network.n.a aVarA = io.ably.lib.network.n.a();
        lg.a.InterfaceC2328a interfaceC2328a = null;
        aVarA.g(url).f(str).d(this.f287345c.B).e(this.f287345c.C).a(cVar != null ? new io.ably.lib.network.i(cVar.getContentType(), cVar.getEncoded()) : null);
        Map<String, String> mapB = b(url, str, b0VarArr, cVar, z10, z11);
        boolean zContainsKey = mapB.containsKey("Authorization");
        String str2 = mapB.get("Authorization");
        aVarA.c(mapB);
        io.ably.lib.network.n nVarB = aVarA.b();
        if (io.ably.lib.util.k.f288243h <= 2 && nVarB.c() != null && nVarB.c().b() != null) {
            io.ably.lib.util.k.k(f287342j, System.lineSeparator() + new String(nVarB.c().b()));
        }
        Map<String, List<String>> mapD = nVarB.d();
        if (io.ably.lib.util.k.f288243h <= 2) {
            String str3 = f287342j;
            io.ably.lib.util.k.k(str3, "HTTP request: " + url + " " + str);
            if (zContainsKey) {
                io.ably.lib.util.k.k(str3, "  Authorization: " + str2);
            }
            for (Map.Entry<String, List<String>> entry : mapD.entrySet()) {
                for (String str4 : entry.getValue()) {
                    io.ably.lib.util.k.k(f287342j, "  " + entry.getKey() + ": " + str4);
                }
            }
            if (cVar != null) {
                String str5 = f287342j;
                io.ably.lib.util.k.k(str5, "  Content-Type: " + cVar.getContentType());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("  Content-Length: ");
                sb2.append(cVar.getEncoded() != null ? cVar.getEncoded().length : 0);
                io.ably.lib.util.k.k(str5, sb2.toString());
            }
        }
        io.ably.lib.types.n nVar = this.f287345c;
        if (nVar instanceof lg.a) {
            lg.a.InterfaceC2328a interfaceC2328a2 = ((lg.a) nVar).U;
            if (interfaceC2328a2 != null) {
                strSubstring = String.valueOf(Math.random()).substring(2);
                d dVarB = interfaceC2328a2.b(strSubstring, nVarB, zContainsKey ? str2 : null, mapD, cVar);
                if (dVarB != null) {
                    return (T) f(zContainsKey, dVarB, eVar);
                }
            } else {
                strSubstring = null;
            }
            interfaceC2328a = interfaceC2328a2;
        } else {
            strSubstring = null;
        }
        try {
            d dVarC = c(nVarB);
            if (interfaceC2328a != null) {
                interfaceC2328a.a(strSubstring, str, dVarC);
            }
            return (T) f(zContainsKey, dVarC, eVar);
        } catch (io.ably.lib.network.h e10) {
            throw io.ably.lib.types.a.c(e10);
        } catch (Exception e11) {
            if (e11.getCause() instanceof IOException) {
                throw io.ably.lib.types.a.c(e11.getCause());
            }
            throw io.ably.lib.types.a.c(e11);
        }
    }

    public <T> T i(URL url, String str, b0[] b0VarArr, c cVar, e<T> eVar, boolean z10) throws io.ably.lib.types.a {
        g gVar;
        if (z10) {
            a(false);
        }
        boolean z11 = true;
        boolean z12 = true;
        while (true) {
            try {
                return (T) this.g(url, str, b0VarArr, cVar, true, eVar);
            } catch (a e10) {
                if (e10.f287354d != null && z10 && e10.f287353c && z11) {
                    this.a(true);
                    z11 = false;
                } else {
                    Map<g.b, String> map = e10.f287355e;
                    if (map == null || !z12 || (gVar = this.f287350h) == null) {
                        throw e10;
                    }
                    gVar.h(map);
                    z12 = false;
                }
            }
        }
    }

    public i j(Map<String, String> map) {
        return new i(this, map);
    }

    public void k(String str) {
        this.f287346d.e(str, false);
    }

    private i(i iVar, Map<String, String> map) {
        this.f287345c = iVar.f287345c;
        this.f287347e = iVar.f287347e;
        this.f287348f = iVar.f287348f;
        this.f287343a = iVar.f287343a;
        this.f287344b = iVar.f287344b;
        this.f287346d = iVar.f287346d;
        this.f287350h = iVar.f287350h;
        this.f287349g = iVar.f287349g;
        this.f287351i = map;
    }
}
