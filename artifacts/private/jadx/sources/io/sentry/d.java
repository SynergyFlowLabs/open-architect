package io.sentry;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.b
public final class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    static final String f305298i = "UTF-8";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    static final String f305301l = "sentry-";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<String, String> f305303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f305304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Double f305305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Double f305306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f305307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f305308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f305309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    final ILogger f305310h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    static final Integer f305299j = 8192;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    static final Integer f305300k = 64;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final c f305302m = new c();

    @lm.a.c
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f305311a = "sentry-trace_id";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f305312b = "sentry-public_key";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f305313c = "sentry-release";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f305314d = "sentry-user_id";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f305315e = "sentry-environment";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f305316f = "sentry-transaction";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f305317g = "sentry-sample_rate";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f305318h = "sentry-sample_rand";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f305319i = "sentry-sampled";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f305320j = "sentry-replay_id";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final List<String> f305321k = Arrays.asList(f305311a, f305312b, f305313c, f305314d, f305315e, f305316f, f305317g, f305318h, f305319i, f305320j);
    }

    private static class c extends ThreadLocal<DecimalFormat> {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DecimalFormat initialValue() {
            return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT));
        }
    }

    @lm.a.c
    public d(@NotNull ILogger iLogger) {
        this(new ConcurrentHashMap(), null, null, null, true, false, iLogger);
    }

    @Nullable
    private static Double B(@Nullable fa faVar) {
        if (faVar == null) {
            return null;
        }
        return faVar.c();
    }

    @Nullable
    private static Double C(@Nullable fa faVar) {
        if (faVar == null) {
            return null;
        }
        return faVar.d();
    }

    @Nullable
    private static String D(@Nullable Double d10) {
        if (io.sentry.util.d0.h(d10, false)) {
            return f305302m.get().format(d10);
        }
        return null;
    }

    @Nullable
    private static Boolean E(@Nullable fa faVar) {
        if (faVar == null) {
            return null;
        }
        return faVar.e();
    }

    @Nullable
    private static Double T(@Nullable String str) {
        if (str != null) {
            try {
                double d10 = Double.parseDouble(str);
                if (io.sentry.util.d0.h(Double.valueOf(d10), false)) {
                    return Double.valueOf(d10);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    private static String a(@NotNull String str) throws UnsupportedEncodingException {
        return URLDecoder.decode(str, "UTF-8");
    }

    private String b(@NotNull String str) throws UnsupportedEncodingException {
        return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
    }

    @lm.a.c
    @NotNull
    public static d e(@NotNull z5 z5Var, @Nullable String str, @NotNull n8 n8Var) {
        d dVar = new d(n8Var.getLogger());
        p9 p9VarO = z5Var.E().o();
        dVar.N(p9VarO != null ? p9VarO.p().toString() : null);
        dVar.H(n8Var.retrieveParsedDsn().c());
        dVar.I(z5Var.M());
        dVar.G(z5Var.H());
        dVar.O(str);
        dVar.L(null);
        dVar.M(null);
        dVar.K(null);
        Object objC = z5Var.E().c("replay_id");
        if (objC != null && !objC.toString().equals(io.sentry.protocol.v.f306474b.toString())) {
            dVar.J(objC.toString());
            z5Var.E().u("replay_id");
        }
        dVar.d();
        return dVar;
    }

    @NotNull
    public static d f(@Nullable String str) {
        return h(str, false, h5.q().b().getLogger());
    }

    @lm.a.c
    @NotNull
    public static d g(String str, @NotNull ILogger iLogger) {
        return h(str, false, iLogger);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    @lm.a.c
    @NotNull
    public static d h(@Nullable String str, boolean z10, @NotNull ILogger iLogger) {
        boolean z11;
        Double dT;
        Double dT2;
        String strG;
        boolean z12;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        if (str != null) {
            try {
                String[] strArrSplit = str.split(",", -1);
                int length = strArrSplit.length;
                int i11 = 0;
                boolean z13 = false;
                dT = null;
                dT2 = null;
                while (i11 < length) {
                    try {
                        String str2 = strArrSplit[i11];
                        if (str2.trim().startsWith(f305301l)) {
                            try {
                                int iIndexOf = str2.indexOf("=");
                                String strTrim = str2.substring(i10, iIndexOf).trim();
                                String strA = a(strTrim);
                                String strA2 = a(str2.substring(iIndexOf + 1).trim());
                                if (b.f305317g.equals(strA)) {
                                    dT = T(strA2);
                                } else if (b.f305318h.equals(strA)) {
                                    dT2 = T(strA2);
                                } else {
                                    concurrentHashMap.put(strA, strA2);
                                }
                                if (!b.f305318h.equalsIgnoreCase(strTrim)) {
                                    z13 = true;
                                }
                            } catch (Throwable th2) {
                                iLogger.b(y7.ERROR, th2, "Unable to decode baggage key value pair %s", str2);
                            }
                        } else if (z10) {
                            arrayList.add(str2.trim());
                        }
                        i11++;
                        i10 = 0;
                    } catch (Throwable th3) {
                        th = th3;
                        z12 = z13;
                        iLogger.b(y7.ERROR, th, "Unable to decode baggage header %s", str);
                        z11 = z12;
                        if (arrayList.isEmpty()) {
                            strG = null;
                        } else {
                            strG = io.sentry.util.h0.g(",", arrayList);
                        }
                        return new d(concurrentHashMap, dT, dT2, strG, true, z11, iLogger);
                    }
                }
                z11 = z13;
            } catch (Throwable th4) {
                th = th4;
                z12 = false;
                dT = null;
                dT2 = null;
            }
        } else {
            z11 = false;
            dT = null;
            dT2 = null;
        }
        if (arrayList.isEmpty()) {
            strG = null;
        } else {
            strG = io.sentry.util.h0.g(",", arrayList);
        }
        return new d(concurrentHashMap, dT, dT2, strG, true, z11, iLogger);
    }

    @NotNull
    public static d i(@Nullable List<String> list) {
        return k(list, false, h5.q().b().getLogger());
    }

    @lm.a.c
    @NotNull
    public static d j(@Nullable List<String> list, @NotNull ILogger iLogger) {
        return k(list, false, iLogger);
    }

    @lm.a.c
    @NotNull
    public static d k(@Nullable List<String> list, boolean z10, @NotNull ILogger iLogger) {
        return list != null ? h(io.sentry.util.h0.g(",", list), z10, iLogger) : h(null, z10, iLogger);
    }

    private static boolean y(@Nullable io.sentry.protocol.f0 f0Var) {
        return (f0Var == null || io.sentry.protocol.f0.URL.equals(f0Var)) ? false : true;
    }

    @lm.a.c
    public boolean A() {
        return this.f305309g;
    }

    @lm.a.c
    public void F(@NotNull String str, @Nullable String str2) {
        if (this.f305308f) {
            if (str2 == null) {
                this.f305303a.remove(str);
            } else {
                this.f305303a.put(str, str2);
            }
        }
    }

    @lm.a.c
    public void G(@Nullable String str) {
        F(b.f305315e, str);
    }

    @lm.a.c
    public void H(@Nullable String str) {
        F(b.f305312b, str);
    }

    @lm.a.c
    public void I(@Nullable String str) {
        F(b.f305313c, str);
    }

    @lm.a.c
    public void J(@Nullable String str) {
        F(b.f305320j, str);
    }

    @lm.a.c
    public void K(@Nullable Double d10) {
        if (z()) {
            this.f305306d = d10;
        }
    }

    @lm.a.c
    public void L(@Nullable Double d10) {
        if (z()) {
            this.f305305c = d10;
        }
    }

    @lm.a.c
    public void M(@Nullable String str) {
        F(b.f305319i, str);
    }

    @lm.a.c
    public void N(@Nullable String str) {
        F(b.f305311a, str);
    }

    @lm.a.c
    public void O(@Nullable String str) {
        F(b.f305316f, str);
    }

    @lm.a.c
    public void P(@Nullable String str) {
        F(b.f305314d, str);
    }

    @lm.a.c
    public void Q(@Nullable fa faVar) {
        if (faVar == null) {
            return;
        }
        M(io.sentry.util.h0.l(E(faVar)));
        if (faVar.c() != null) {
            K(B(faVar));
        }
        if (faVar.d() != null) {
            c(C(faVar));
        }
    }

    @lm.a.c
    public void R(@NotNull g1 g1Var, @NotNull n8 n8Var) {
        m4 m4VarC0 = g1Var.c0();
        io.sentry.protocol.v vVarT = g1Var.t();
        N(m4VarC0.i().toString());
        H(n8Var.retrieveParsedDsn().c());
        I(n8Var.getRelease());
        G(n8Var.getEnvironment());
        if (!io.sentry.protocol.v.f306474b.equals(vVarT)) {
            J(vVarT.toString());
        }
        O(null);
        L(null);
        M(null);
    }

    @lm.a.c
    public void S(@NotNull io.sentry.protocol.v vVar, @Nullable io.sentry.protocol.v vVar2, @NotNull n8 n8Var, @Nullable fa faVar, @Nullable String str, @Nullable io.sentry.protocol.f0 f0Var) {
        N(vVar.toString());
        H(n8Var.retrieveParsedDsn().c());
        I(n8Var.getRelease());
        G(n8Var.getEnvironment());
        if (!y(f0Var)) {
            str = null;
        }
        O(str);
        if (vVar2 != null && !io.sentry.protocol.v.f306474b.equals(vVar2)) {
            J(vVar2.toString());
        }
        L(C(faVar));
        M(io.sentry.util.h0.l(E(faVar)));
        K(B(faVar));
    }

    @NotNull
    public String U(@Nullable String str) {
        String str2;
        int iE;
        StringBuilder sb2 = new StringBuilder();
        if (str == null || str.isEmpty()) {
            str2 = "";
            iE = 0;
        } else {
            sb2.append(str);
            iE = io.sentry.util.h0.e(str, AbstractJsonLexerKt.COMMA) + 1;
            str2 = ",";
        }
        m1 m1VarA = this.f305304b.a();
        try {
            TreeSet<String> treeSet = new TreeSet(Collections.list(this.f305303a.keys()));
            if (m1VarA != null) {
                m1VarA.close();
            }
            treeSet.add(b.f305317g);
            treeSet.add(b.f305318h);
            for (String str3 : treeSet) {
                String strD = b.f305317g.equals(str3) ? D(this.f305305c) : b.f305318h.equals(str3) ? D(this.f305306d) : this.f305303a.get(str3);
                if (strD != null) {
                    Integer num = f305300k;
                    if (iE >= num.intValue()) {
                        this.f305310h.c(y7.ERROR, "Not adding baggage value %s as the total number of list members would exceed the maximum of %s.", str3, num);
                    } else {
                        try {
                            String str4 = str2 + b(str3) + "=" + b(strD);
                            int length = sb2.length() + str4.length();
                            Integer num2 = f305299j;
                            if (length > num2.intValue()) {
                                this.f305310h.c(y7.ERROR, "Not adding baggage value %s as the total header value length would exceed the maximum of %s.", str3, num2);
                            } else {
                                iE++;
                                sb2.append(str4);
                                str2 = ",";
                            }
                        } catch (Throwable th2) {
                            this.f305310h.b(y7.ERROR, th2, "Unable to encode baggage key value pair (key=%s,value=%s).", str3, strD);
                        }
                    }
                }
            }
            return sb2.toString();
        } catch (Throwable th3) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @lm.a.c
    @Nullable
    public da V() {
        String strU = u();
        String strP = p();
        String strN = n();
        if (strU == null || strN == null) {
            return null;
        }
        io.sentry.protocol.v vVar = new io.sentry.protocol.v(strU);
        io.sentry.protocol.v vVar2 = null;
        String strO = o();
        String strM = m();
        String strX = x();
        String strV = v();
        String strD = D(r());
        String strS = s();
        if (strP != null) {
            vVar2 = new io.sentry.protocol.v(strP);
        }
        da daVar = new da(vVar, strN, strO, strM, strX, strV, strD, strS, vVar2, D(q()));
        daVar.setUnknown(w());
        return daVar;
    }

    @lm.a.c
    public void c(@Nullable Double d10) {
        this.f305305c = d10;
    }

    @lm.a.c
    public void d() {
        this.f305308f = false;
    }

    @lm.a.c
    @Nullable
    public String l(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.f305303a.get(str);
    }

    @lm.a.c
    @Nullable
    public String m() {
        return l(b.f305315e);
    }

    @lm.a.c
    @Nullable
    public String n() {
        return l(b.f305312b);
    }

    @lm.a.c
    @Nullable
    public String o() {
        return l(b.f305313c);
    }

    @lm.a.c
    @Nullable
    public String p() {
        return l(b.f305320j);
    }

    @lm.a.c
    @Nullable
    public Double q() {
        return this.f305306d;
    }

    @lm.a.c
    @Nullable
    public Double r() {
        return this.f305305c;
    }

    @lm.a.c
    @Nullable
    public String s() {
        return l(b.f305319i);
    }

    @Nullable
    public String t() {
        return this.f305307e;
    }

    @lm.a.c
    @Nullable
    public String u() {
        return l(b.f305311a);
    }

    @lm.a.c
    @Nullable
    public String v() {
        return l(b.f305316f);
    }

    @lm.a.c
    @NotNull
    public Map<String, Object> w() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        m1 m1VarA = this.f305304b.a();
        try {
            for (Map.Entry<String, String> entry : this.f305303a.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!b.f305321k.contains(key) && value != null) {
                    concurrentHashMap.put(key.replaceFirst(f305301l, ""), value);
                }
            }
            if (m1VarA != null) {
                m1VarA.close();
            }
            return concurrentHashMap;
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @lm.a.c
    @Nullable
    public String x() {
        return l(b.f305314d);
    }

    @lm.a.c
    public boolean z() {
        return this.f305308f;
    }

    @lm.a.c
    public d(@NotNull d dVar) {
        this(dVar.f305303a, dVar.f305305c, dVar.f305306d, dVar.f305307e, dVar.f305308f, dVar.f305309g, dVar.f305310h);
    }

    @lm.a.c
    public d(@NotNull ConcurrentHashMap<String, String> concurrentHashMap, @Nullable Double d10, @Nullable Double d11, @Nullable String str, boolean z10, boolean z11, @NotNull ILogger iLogger) {
        this.f305304b = new io.sentry.util.a();
        this.f305303a = concurrentHashMap;
        this.f305305c = d10;
        this.f305306d = d11;
        this.f305310h = iLogger;
        this.f305307e = str;
        this.f305308f = z10;
        this.f305309g = z11;
    }
}
