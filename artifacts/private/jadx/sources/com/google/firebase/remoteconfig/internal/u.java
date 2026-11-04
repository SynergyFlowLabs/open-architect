package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import androidx.annotation.l1;
import androidx.annotation.m1;
import androidx.annotation.p0;
import com.google.firebase.remoteconfig.e0;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l1
    public static final long f124654f = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f124656h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @l1
    static final int f124657i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f124658j = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f124660l = "fetch_timeout_in_seconds";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f124661m = "minimum_fetch_interval_in_seconds";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f124662n = "last_fetch_status";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f124663o = "last_fetch_time_in_millis";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f124664p = "last_fetch_etag";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f124665q = "backoff_end_time_in_millis";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f124666r = "num_failed_fetches";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f124667s = "last_template_version";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f124668t = "num_failed_realtime_streams";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f124669u = "realtime_backoff_end_time_in_millis";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f124670v = 250;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f124671w = 500;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f124672x = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f124673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f124674b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f124675c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f124676d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f124677e = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final Date f124655g = new Date(-1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @l1
    static final Date f124659k = new Date(-1);

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f124678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Date f124679b;

        a(int i10, Date date) {
            this.f124678a = i10;
            this.f124679b = date;
        }

        Date a() {
            return this.f124679b;
        }

        int b() {
            return this.f124678a;
        }
    }

    @l1
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f124680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Date f124681b;

        @l1
        public b(int i10, Date date) {
            this.f124680a = i10;
            this.f124681b = date;
        }

        Date a() {
            return this.f124681b;
        }

        int b() {
            return this.f124680a;
        }
    }

    public u(SharedPreferences sharedPreferences) {
        this.f124673a = sharedPreferences;
    }

    @m1
    public void a() {
        synchronized (this.f124674b) {
            this.f124673a.edit().clear().commit();
        }
    }

    a b() {
        a aVar;
        synchronized (this.f124675c) {
            aVar = new a(this.f124673a.getInt(f124666r, 0), new Date(this.f124673a.getLong(f124665q, -1L)));
        }
        return aVar;
    }

    public Map<String, String> c() {
        try {
            JSONObject jSONObject = new JSONObject(this.f124673a.getString(e0.b.f124464y2, "{}"));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public long d() {
        return this.f124673a.getLong(f124660l, 60L);
    }

    public com.google.firebase.remoteconfig.v e() {
        x xVarA;
        synchronized (this.f124674b) {
            try {
                long j10 = this.f124673a.getLong(f124663o, -1L);
                int i10 = this.f124673a.getInt(f124662n, 0);
                xVarA = x.d().c(i10).d(j10).b(new com.google.firebase.remoteconfig.x.b().f(this.f124673a.getLong(f124660l, 60L)).g(this.f124673a.getLong(f124661m, n.f124564j)).c()).a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xVarA;
    }

    @p0
    String f() {
        return this.f124673a.getString(f124664p, null);
    }

    int g() {
        return this.f124673a.getInt(f124662n, 0);
    }

    Date h() {
        return new Date(this.f124673a.getLong(f124663o, -1L));
    }

    long i() {
        return this.f124673a.getLong(f124667s, 0L);
    }

    public long j() {
        return this.f124673a.getLong(f124661m, n.f124564j);
    }

    @l1
    public b k() {
        b bVar;
        synchronized (this.f124676d) {
            bVar = new b(this.f124673a.getInt(f124668t, 0), new Date(this.f124673a.getLong(f124669u, -1L)));
        }
        return bVar;
    }

    void l() {
        n(0, f124659k);
    }

    void m() {
        t(0, f124659k);
    }

    void n(int i10, Date date) {
        synchronized (this.f124675c) {
            try {
                this.f124673a.edit().putInt(f124666r, i10).putLong(f124665q, date.getTime()).apply();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @m1
    public void o(com.google.firebase.remoteconfig.x xVar) {
        synchronized (this.f124674b) {
            this.f124673a.edit().putLong(f124660l, xVar.a()).putLong(f124661m, xVar.b()).commit();
        }
    }

    public void p(com.google.firebase.remoteconfig.x xVar) {
        synchronized (this.f124674b) {
            this.f124673a.edit().putLong(f124660l, xVar.a()).putLong(f124661m, xVar.b()).apply();
        }
    }

    public void q(Map<String, String> map) {
        synchronized (this.f124677e) {
            try {
                Map<String, String> mapC = c();
                boolean z10 = false;
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (key.length() <= 250 && (value == null || value.length() <= 500)) {
                        boolean z11 = true;
                        if (value != null) {
                            z10 |= !Objects.equals(mapC.put(key, value), value);
                        } else {
                            if (mapC.remove(key) == null) {
                                z11 = false;
                            }
                            z10 |= z11;
                        }
                    }
                    String.format("Invalid custom signal: Custom signal keys must be %d characters or less, and values must be %d characters or less.", 250, 500);
                    return;
                }
                if (z10) {
                    if (mapC.size() > 100) {
                        String.format("Invalid custom signal: Too many custom signals provided. The maximum allowed is %d.", 100);
                    } else {
                        this.f124673a.edit().putString(e0.b.f124464y2, new JSONObject(mapC).toString()).commit();
                        Objects.toString(c().keySet());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void r(String str) {
        synchronized (this.f124674b) {
            try {
                this.f124673a.edit().putString(f124664p, str).apply();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void s(long j10) {
        synchronized (this.f124674b) {
            try {
                this.f124673a.edit().putLong(f124667s, j10).apply();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void t(int i10, Date date) {
        synchronized (this.f124676d) {
            try {
                this.f124673a.edit().putInt(f124668t, i10).putLong(f124669u, date.getTime()).apply();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void u() {
        synchronized (this.f124674b) {
            this.f124673a.edit().putInt(f124662n, 1).apply();
        }
    }

    void v(Date date) {
        synchronized (this.f124674b) {
            this.f124673a.edit().putInt(f124662n, -1).putLong(f124663o, date.getTime()).apply();
        }
    }

    void w() {
        synchronized (this.f124674b) {
            try {
                this.f124673a.edit().putInt(f124662n, 2).apply();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
