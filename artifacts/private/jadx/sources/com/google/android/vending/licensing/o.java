package com.google.android.vending.licensing;

import android.content.Context;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

/* JADX INFO: loaded from: classes4.dex */
public class o implements k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f115086k = "ServerManagedPolicy";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f115087l = "com.android.vending.licensing.ServerManagedPolicy";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f115088m = "lastResponse";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f115089n = "validityTimestamp";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f115090o = "retryUntil";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f115091p = "maxRetries";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f115092q = "retryCount";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f115093r = "0";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f115094s = "0";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f115095t = "0";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f115096u = "0";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f115097v = 60000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f115098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f115099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f115100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f115101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f115102h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f115103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private l f115104j;

    public o(Context context, j jVar) {
        l lVar = new l(context.getSharedPreferences(f115087l, 0), jVar);
        this.f115104j = lVar;
        this.f115103i = Integer.parseInt(lVar.b(f115088m, Integer.toString(k.f115074c)));
        this.f115098d = Long.parseLong(this.f115104j.b(f115089n, com.facebook.appevents.p.f99189d0));
        this.f115099e = Long.parseLong(this.f115104j.b(f115090o, com.facebook.appevents.p.f99189d0));
        this.f115100f = Long.parseLong(this.f115104j.b(f115091p, com.facebook.appevents.p.f99189d0));
        this.f115101g = Long.parseLong(this.f115104j.b(f115092q, com.facebook.appevents.p.f99189d0));
    }

    private Map<String, String> c(String str) {
        HashMap map = new HashMap();
        try {
            for (NameValuePair nameValuePair : URLEncodedUtils.parse(new URI(com.planner5d.library.model.payments.a.f222474i + str), "UTF-8")) {
                map.put(nameValuePair.getName(), nameValuePair.getValue());
            }
        } catch (URISyntaxException unused) {
        }
        return map;
    }

    private void h(int i10) {
        this.f115102h = System.currentTimeMillis();
        this.f115103i = i10;
        this.f115104j.c(f115088m, Integer.toString(i10));
    }

    private void i(String str) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            lValueOf = 0L;
            str = com.facebook.appevents.p.f99189d0;
        }
        this.f115100f = lValueOf.longValue();
        this.f115104j.c(f115091p, str);
    }

    private void j(long j10) {
        this.f115101g = j10;
        this.f115104j.c(f115092q, Long.toString(j10));
    }

    private void k(String str) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            lValueOf = 0L;
            str = com.facebook.appevents.p.f99189d0;
        }
        this.f115099e = lValueOf.longValue();
        this.f115104j.c(f115090o, str);
    }

    private void l(String str) {
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
        this.f115098d = lValueOf.longValue();
        this.f115104j.c(f115089n, str);
    }

    @Override // com.google.android.vending.licensing.k
    public void a(int i10, n nVar) {
        if (i10 != 291) {
            j(0L);
        } else {
            j(this.f115101g + 1);
        }
        if (i10 == 256) {
            Map<String, String> mapC = c(nVar.f115085g);
            this.f115103i = i10;
            l(mapC.get("VT"));
            k(mapC.get("GT"));
            i(mapC.get("GR"));
        } else if (i10 == 561) {
            l(com.facebook.appevents.p.f99189d0);
            k(com.facebook.appevents.p.f99189d0);
            i(com.facebook.appevents.p.f99189d0);
        }
        h(i10);
        this.f115104j.a();
    }

    @Override // com.google.android.vending.licensing.k
    public boolean b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i10 = this.f115103i;
        if (i10 == 256) {
            if (jCurrentTimeMillis <= this.f115098d) {
                return true;
            }
        } else if (i10 == 291 && jCurrentTimeMillis < this.f115102h + 60000) {
            return jCurrentTimeMillis <= this.f115099e || this.f115101g <= this.f115100f;
        }
        return false;
    }

    public long d() {
        return this.f115100f;
    }

    public long e() {
        return this.f115101g;
    }

    public long f() {
        return this.f115099e;
    }

    public long g() {
        return this.f115098d;
    }
}
