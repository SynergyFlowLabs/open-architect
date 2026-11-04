package com.google.android.vending.licensing;

import android.content.Context;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

/* JADX INFO: loaded from: classes4.dex */
public class b implements k {
    public static final int A = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f114992n = "APKExpansionPolicy";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f114993o = "com.android.vending.licensing.APKExpansionPolicy";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f114994p = "lastResponse";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f114995q = "validityTimestamp";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f114996r = "retryUntil";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f114997s = "maxRetries";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f114998t = "retryCount";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f114999u = "0";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f115000v = "0";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f115001w = "0";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f115002x = "0";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final long f115003y = 60000;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f115004z = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f115005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f115006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f115007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f115008g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f115010i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private l f115011j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f115009h = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Vector<String> f115012k = new Vector<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Vector<String> f115013l = new Vector<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Vector<Long> f115014m = new Vector<>();

    public b(Context context, j jVar) {
        l lVar = new l(context.getSharedPreferences(f114993o, 0), jVar);
        this.f115011j = lVar;
        this.f115010i = Integer.parseInt(lVar.b(f114994p, Integer.toString(k.f115074c)));
        this.f115005d = Long.parseLong(this.f115011j.b(f114995q, com.facebook.appevents.p.f99189d0));
        this.f115006e = Long.parseLong(this.f115011j.b(f114996r, com.facebook.appevents.p.f99189d0));
        this.f115007f = Long.parseLong(this.f115011j.b(f114997s, com.facebook.appevents.p.f99189d0));
        this.f115008g = Long.parseLong(this.f115011j.b(f114998t, com.facebook.appevents.p.f99189d0));
    }

    private Map<String, String> c(String str) {
        HashMap map = new HashMap();
        try {
            for (NameValuePair nameValuePair : URLEncodedUtils.parse(new URI(com.planner5d.library.model.payments.a.f222474i + str), "UTF-8")) {
                String name = nameValuePair.getName();
                int i10 = 0;
                while (map.containsKey(name)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(nameValuePair.getName());
                    i10++;
                    sb2.append(i10);
                    name = sb2.toString();
                }
                map.put(name, nameValuePair.getValue());
            }
        } catch (URISyntaxException unused) {
        }
        return map;
    }

    private void p(int i10) {
        this.f115009h = System.currentTimeMillis();
        this.f115010i = i10;
        this.f115011j.c(f114994p, Integer.toString(i10));
    }

    private void q(String str) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            lValueOf = 0L;
            str = com.facebook.appevents.p.f99189d0;
        }
        this.f115007f = lValueOf.longValue();
        this.f115011j.c(f114997s, str);
    }

    private void r(long j10) {
        this.f115008g = j10;
        this.f115011j.c(f114998t, Long.toString(j10));
    }

    private void s(String str) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            lValueOf = 0L;
            str = com.facebook.appevents.p.f99189d0;
        }
        this.f115006e = lValueOf.longValue();
        this.f115011j.c(f114996r, str);
    }

    private void t(String str) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
            Long lValueOf2 = Long.valueOf(jCurrentTimeMillis);
            String string = Long.toString(jCurrentTimeMillis);
            lValueOf = lValueOf2;
            str = string;
        }
        this.f115005d = lValueOf.longValue();
        this.f115011j.c(f114995q, str);
    }

    @Override // com.google.android.vending.licensing.k
    public void a(int i10, n nVar) {
        if (i10 != 291) {
            r(0L);
        } else {
            r(this.f115008g + 1);
        }
        if (i10 == 256) {
            Map<String, String> mapC = c(nVar.f115085g);
            this.f115010i = i10;
            t(Long.toString(System.currentTimeMillis() + 60000));
            for (String str : mapC.keySet()) {
                if (str.equals("VT")) {
                    t(mapC.get(str));
                } else if (str.equals("GT")) {
                    s(mapC.get(str));
                } else if (str.equals("GR")) {
                    q(mapC.get(str));
                } else if (str.startsWith("FILE_URL")) {
                    o(Integer.parseInt(str.substring(8)) - 1, mapC.get(str));
                } else if (str.startsWith("FILE_NAME")) {
                    m(Integer.parseInt(str.substring(9)) - 1, mapC.get(str));
                } else if (str.startsWith("FILE_SIZE")) {
                    n(Integer.parseInt(str.substring(9)) - 1, Long.parseLong(mapC.get(str)));
                }
            }
        } else if (i10 == 561) {
            t(com.facebook.appevents.p.f99189d0);
            s(com.facebook.appevents.p.f99189d0);
            q(com.facebook.appevents.p.f99189d0);
        }
        p(i10);
        this.f115011j.a();
    }

    @Override // com.google.android.vending.licensing.k
    public boolean b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i10 = this.f115010i;
        if (i10 == 256) {
            if (jCurrentTimeMillis <= this.f115005d) {
                return true;
            }
        } else if (i10 == 291 && jCurrentTimeMillis < this.f115009h + 60000) {
            return jCurrentTimeMillis <= this.f115006e || this.f115008g <= this.f115007f;
        }
        return false;
    }

    public String d(int i10) {
        if (i10 < this.f115013l.size()) {
            return this.f115013l.elementAt(i10);
        }
        return null;
    }

    public long e(int i10) {
        if (i10 < this.f115014m.size()) {
            return this.f115014m.elementAt(i10).longValue();
        }
        return -1L;
    }

    public String f(int i10) {
        if (i10 < this.f115012k.size()) {
            return this.f115012k.elementAt(i10);
        }
        return null;
    }

    public int g() {
        return this.f115012k.size();
    }

    public long h() {
        return this.f115007f;
    }

    public long i() {
        return this.f115008g;
    }

    public long j() {
        return this.f115006e;
    }

    public long k() {
        return this.f115005d;
    }

    public void l() {
        this.f115011j.c(f114994p, Integer.toString(k.f115074c));
        s(com.facebook.appevents.p.f99189d0);
        q(com.facebook.appevents.p.f99189d0);
        r(Long.parseLong(com.facebook.appevents.p.f99189d0));
        t(com.facebook.appevents.p.f99189d0);
        this.f115011j.a();
    }

    public void m(int i10, String str) {
        if (i10 >= this.f115013l.size()) {
            this.f115013l.setSize(i10 + 1);
        }
        this.f115013l.set(i10, str);
    }

    public void n(int i10, long j10) {
        if (i10 >= this.f115014m.size()) {
            this.f115014m.setSize(i10 + 1);
        }
        this.f115014m.set(i10, Long.valueOf(j10));
    }

    public void o(int i10, String str) {
        if (i10 >= this.f115012k.size()) {
            this.f115012k.setSize(i10 + 1);
        }
        this.f115012k.set(i10, str);
    }
}
