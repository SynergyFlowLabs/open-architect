package io.ably.lib.transport;

import com.devtodev.google.BuildConfig;
import io.ably.lib.types.n;
import io.ably.lib.types.r;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes13.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f287863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f287864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f287865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f287866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f287867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f287868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f287869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b f287870h = new b();

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f287871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f287872b;

        private b() {
        }

        public void a() {
            this.f287871a = null;
            this.f287872b = 0L;
        }

        public String b() {
            return this.f287871a;
        }

        public String c() {
            long j10 = this.f287872b;
            if (j10 > 0 && j10 <= System.currentTimeMillis()) {
                a();
            }
            return this.f287871a;
        }

        public boolean d(String str) {
            String str2 = this.f287871a;
            if (str2 == null) {
                return str == null;
            }
            return str2.equals(str);
        }

        public void e(String str, long j10) {
            this.f287871a = str;
            this.f287872b = j10;
        }
    }

    public d(String str, String str2, n nVar) throws io.ably.lib.types.a {
        String str3;
        this.f287865c = str2;
        this.f287868f = nVar.J;
        boolean z10 = true;
        boolean z11 = (str == null || str.equalsIgnoreCase(str2)) ? false : true;
        String[] strArrA = nVar.H;
        if (nVar.J) {
            if (strArrA != null) {
                throw io.ably.lib.types.a.a(new r("fallbackHosts and fallbackHostsUseDefault cannot both be set", 40000, 400));
            }
            if (nVar.f288122r != 0 || nVar.f288123s != 0) {
                throw io.ably.lib.types.a.a(new r("fallbackHostsUseDefault cannot be set when port or tlsPort are set", 40000, 400));
            }
            strArrA = c.f287844h;
        }
        String str4 = nVar.f288130z;
        if (str4 != null && !str4.isEmpty() && !BuildConfig.FLAVOR_default.equalsIgnoreCase(nVar.f288130z)) {
            z10 = false;
        }
        if (!z11 && strArrA == null && nVar.f288122r == 0 && nVar.f288123s == 0) {
            strArrA = z10 ? c.f287844h : c.a(nVar.f288130z);
        }
        if (z11) {
            this.f287863a = str;
            if (nVar.f288130z != null) {
                throw io.ably.lib.types.a.a(new r("cannot set both restHost/realtimeHost and environment options", 40000, 400));
            }
        } else {
            if (z10) {
                str3 = str2;
            } else {
                str3 = nVar.f288130z + "-" + str2;
            }
            this.f287863a = str3;
        }
        this.f287864b = this.f287863a.equalsIgnoreCase(str2);
        this.f287867e = Arrays.equals(c.f287844h, strArrA);
        String[] strArr = strArrA == null ? new String[0] : (String[]) strArrA.clone();
        this.f287866d = strArr;
        Collections.shuffle(Arrays.asList(strArr));
        this.f287869g = nVar.K;
    }

    public synchronized int a(String str) {
        try {
            if (this.f287866d == null) {
                return 0;
            }
            if (!str.equals(this.f287863a) && !str.equals(this.f287870h.b())) {
                String[] strArr = this.f287866d;
                return (strArr.length - Arrays.asList(strArr).indexOf(str)) - 1;
            }
            return this.f287866d.length;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized String b(String str) {
        int i10;
        if (this.f287866d == null) {
            return null;
        }
        if (str.equals(this.f287863a)) {
            if (!this.f287864b && !this.f287868f && this.f287867e) {
                return null;
            }
            i10 = 0;
        } else {
            if (str.equals(this.f287870h.c())) {
                this.f287870h.a();
                return this.f287863a;
            }
            int iIndexOf = Arrays.asList(this.f287866d).indexOf(str);
            if (iIndexOf < 0) {
                return null;
            }
            i10 = iIndexOf + 1;
        }
        String[] strArr = this.f287866d;
        if (i10 >= strArr.length) {
            return null;
        }
        return strArr[i10];
    }

    public synchronized String c() {
        String strC;
        try {
            strC = this.f287870h.c();
            if (strC == null) {
                strC = this.f287863a;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return strC;
    }

    public String d() {
        return this.f287863a;
    }

    public synchronized void e(String str, boolean z10) {
        try {
            if (this.f287870h.d(str)) {
                return;
            }
            if (str.equals(this.f287863a)) {
                this.f287870h.a();
            } else {
                this.f287870h.e(str, z10 ? System.currentTimeMillis() + this.f287869g : 0L);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
