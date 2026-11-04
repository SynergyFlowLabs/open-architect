package io.ably.lib.transport;

import com.facebook.AuthenticationTokenClaims;
import io.ably.lib.types.n;

/* JADX INFO: loaded from: classes13.dex */
public class c {
    public static final int A = 64;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f287837a = "2";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f287839c = "v";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f287840d = "agent";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f287841e = "X-Ably-Version";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f287842f = "X-Ably-ClientId";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f287843g = "Ably-Agent";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f287845i = "rest.ably.io";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f287846j = "realtime.ably.io";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f287847k = 80;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f287848l = 443;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f287862z = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f287838b = String.format("%s/%s", "ably-java", "1.3.0");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f287844h = {"A.ably-realtime.com", "B.ably-realtime.com", "C.ably-realtime.com", "D.ably-realtime.com", "E.ably-realtime.com"};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f287849m = 15000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f287850n = 15000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f287851o = 15000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f287852p = 4000;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f287853q = 10000;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f287854r = 15000;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static long f287855s = 10000;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static long f287856t = 30000;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static long f287857u = AuthenticationTokenClaims.Z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static long f287858v = 20000;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static int f287859w = 65536;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static long f287860x = 120000;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final e.b f287861y = new i.a();

    public static String[] a(String str) {
        return new String[]{str + "-a-fallback.ably-realtime.com", str + "-b-fallback.ably-realtime.com", str + "-c-fallback.ably-realtime.com", str + "-d-fallback.ably-realtime.com", str + "-e-fallback.ably-realtime.com"};
    }

    public static int b(n nVar) {
        if (nVar.f288118n) {
            int i10 = nVar.f288123s;
            if (i10 != 0) {
                return i10;
            }
            return 443;
        }
        int i11 = nVar.f288122r;
        if (i11 != 0) {
            return i11;
        }
        return 80;
    }
}
