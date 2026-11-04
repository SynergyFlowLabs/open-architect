package com.google.firebase.remoteconfig.internal;

import androidx.annotation.l1;
import androidx.annotation.p0;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public class p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @l1(otherwise = 3)
    public static final Charset f124589e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Pattern f124590f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final Pattern f124591g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<com.google.android.gms.common.util.d<String, h>> f124592a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f124593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f124594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f124595d;

    public p(Executor executor, g gVar, g gVar2) {
        this.f124593b = executor;
        this.f124594c = gVar;
        this.f124595d = gVar2;
    }

    private void c(final String str, final h hVar) {
        if (hVar == null) {
            return;
        }
        synchronized (this.f124592a) {
            try {
                for (final com.google.android.gms.common.util.d<String, h> dVar : this.f124592a) {
                    this.f124593b.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            dVar.accept(str, hVar);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @p0
    private static h g(g gVar) {
        return gVar.g();
    }

    @p0
    private static Double i(g gVar, String str) {
        h hVarG = g(gVar);
        if (hVarG == null) {
            return null;
        }
        try {
            return Double.valueOf(hVarG.g().getDouble(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static Set<String> j(g gVar) {
        HashSet hashSet = new HashSet();
        h hVarG = g(gVar);
        if (hVarG != null) {
            Iterator<String> itKeys = hVarG.g().keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }

    private static TreeSet<String> l(String str, h hVar) {
        TreeSet<String> treeSet = new TreeSet<>();
        Iterator<String> itKeys = hVar.g().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next.startsWith(str)) {
                treeSet.add(next);
            }
        }
        return treeSet;
    }

    @p0
    private static Long n(g gVar, String str) {
        h hVarG = g(gVar);
        if (hVarG == null) {
            return null;
        }
        try {
            return Long.valueOf(hVarG.g().getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @p0
    private static String p(g gVar, String str) {
        h hVarG = g(gVar);
        if (hVarG == null) {
            return null;
        }
        try {
            return hVarG.g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void r(String str, String str2) {
        String.format("No value of type '%s' exists for parameter key '%s'.", str2, str);
    }

    public void b(com.google.android.gms.common.util.d<String, h> dVar) {
        synchronized (this.f124592a) {
            this.f124592a.add(dVar);
        }
    }

    public Map<String, com.google.firebase.remoteconfig.y> d() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(j(this.f124594c));
        hashSet.addAll(j(this.f124595d));
        HashMap map = new HashMap();
        for (String str : hashSet) {
            map.put(str, q(str));
        }
        return map;
    }

    public boolean e(String str) {
        String strP = p(this.f124594c, str);
        int i10 = (7 | 1) ^ 0;
        if (strP != null) {
            if (f124590f.matcher(strP).matches()) {
                c(str, g(this.f124594c));
                return true;
            }
            if (f124591g.matcher(strP).matches()) {
                c(str, g(this.f124594c));
                return false;
            }
        }
        String strP2 = p(this.f124595d, str);
        if (strP2 != null) {
            if (f124590f.matcher(strP2).matches()) {
                return true;
            }
            if (f124591g.matcher(strP2).matches()) {
                return false;
            }
        }
        r(str, "Boolean");
        return false;
    }

    public byte[] f(String str) {
        String strP = p(this.f124594c, str);
        if (strP != null) {
            c(str, g(this.f124594c));
            return strP.getBytes(f124589e);
        }
        String strP2 = p(this.f124595d, str);
        if (strP2 != null) {
            return strP2.getBytes(f124589e);
        }
        r(str, "ByteArray");
        return com.google.firebase.remoteconfig.r.f124765r;
    }

    public double h(String str) {
        Double dI = i(this.f124594c, str);
        if (dI != null) {
            c(str, g(this.f124594c));
            return dI.doubleValue();
        }
        Double dI2 = i(this.f124595d, str);
        if (dI2 != null) {
            return dI2.doubleValue();
        }
        r(str, "Double");
        return 0.0d;
    }

    public Set<String> k(String str) {
        if (str == null) {
            str = "";
        }
        TreeSet treeSet = new TreeSet();
        h hVarG = g(this.f124594c);
        if (hVarG != null) {
            treeSet.addAll(l(str, hVarG));
        }
        h hVarG2 = g(this.f124595d);
        if (hVarG2 != null) {
            treeSet.addAll(l(str, hVarG2));
        }
        return treeSet;
    }

    public long m(String str) {
        Long lN = n(this.f124594c, str);
        if (lN != null) {
            c(str, g(this.f124594c));
            return lN.longValue();
        }
        Long lN2 = n(this.f124595d, str);
        if (lN2 != null) {
            return lN2.longValue();
        }
        r(str, "Long");
        return 0L;
    }

    public String o(String str) {
        String strP = p(this.f124594c, str);
        if (strP != null) {
            c(str, g(this.f124594c));
            return strP;
        }
        String strP2 = p(this.f124595d, str);
        if (strP2 != null) {
            return strP2;
        }
        r(str, "String");
        return "";
    }

    public com.google.firebase.remoteconfig.y q(String str) {
        String strP = p(this.f124594c, str);
        if (strP != null) {
            c(str, g(this.f124594c));
            return new y(strP, 2);
        }
        String strP2 = p(this.f124595d, str);
        if (strP2 != null) {
            return new y(strP2, 1);
        }
        r(str, "FirebaseRemoteConfigValue");
        return new y("", 0);
    }
}
