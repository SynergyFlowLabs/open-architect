package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes5.dex */
public class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f123675a = "Firebase";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f123676b = "notification";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f123677c = "com.google.firebase.messaging";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f123678d = "export_to_big_query";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f123679e = "delivery_metrics_exported_to_big_query_enabled";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f123680f = 111881503;

    @androidx.annotation.l1
    static void A(String str, Bundle bundle) {
        try {
            com.google.firebase.h.p();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String strD = d(bundle);
            if (strD != null) {
                bundle2.putString("_nmid", strD);
            }
            String strE = e(bundle);
            if (strE != null) {
                bundle2.putString(e.f.f123537g, strE);
            }
            String strI = i(bundle);
            if (!TextUtils.isEmpty(strI)) {
                bundle2.putString(e.f.f123534d, strI);
            }
            String strG = g(bundle);
            if (!TextUtils.isEmpty(strG)) {
                bundle2.putString(e.f.f123540j, strG);
            }
            String strR = r(bundle);
            if (strR != null) {
                bundle2.putString(e.f.f123535e, strR);
            }
            String strL = l(bundle);
            if (strL != null) {
                try {
                    bundle2.putInt(e.f.f123538h, Integer.parseInt(strL));
                } catch (NumberFormatException unused) {
                }
            }
            String strT = t(bundle);
            if (strT != null) {
                try {
                    bundle2.putInt(e.f.f123539i, Integer.parseInt(strT));
                } catch (NumberFormatException unused2) {
                }
            }
            String strN = n(bundle);
            if (e.f.f123543m.equals(str) || e.f.f123546p.equals(str)) {
                bundle2.putString(e.f.f123541k, strN);
            }
            if (Log.isLoggable(e.f123469a, 3)) {
                bundle2.toString();
            }
            com.google.firebase.analytics.connector.a aVar = (com.google.firebase.analytics.connector.a) com.google.firebase.h.p().l(com.google.firebase.analytics.connector.a.class);
            if (aVar != null) {
                aVar.a("fcm", str, bundle2);
            }
        } catch (IllegalStateException unused3) {
        }
    }

    static void B(boolean z10) {
        com.google.firebase.h.p().n().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean(f123678d, z10).apply();
    }

    private static void C(Bundle bundle) {
        com.google.firebase.analytics.connector.a aVar;
        if (bundle == null || !"1".equals(bundle.getString(e.a.f123479g)) || (aVar = (com.google.firebase.analytics.connector.a) com.google.firebase.h.p().l(com.google.firebase.analytics.connector.a.class)) == null) {
            return;
        }
        String string = bundle.getString(e.a.f123475c);
        aVar.b("fcm", e.f.f123547q, string);
        Bundle bundle2 = new Bundle();
        bundle2.putString("source", f123675a);
        bundle2.putString("medium", f123676b);
        bundle2.putString("campaign", string);
        aVar.a("fcm", e.f.f123542l, bundle2);
    }

    public static boolean D(Intent intent) {
        if (intent == null || u(intent)) {
            return false;
        }
        return a();
    }

    public static boolean E(Intent intent) {
        if (intent != null && !u(intent)) {
            return F(intent.getExtras());
        }
        return false;
    }

    public static boolean F(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString(e.a.f123474b));
    }

    static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            com.google.firebase.h.p();
            Context contextN = com.google.firebase.h.p().n();
            SharedPreferences sharedPreferences = contextN.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains(f123678d)) {
                return sharedPreferences.getBoolean(f123678d, false);
            }
            PackageManager packageManager = contextN.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextN.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(f123679e)) {
                return applicationInfo.metaData.getBoolean(f123679e, false);
            }
            return false;
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
    }

    static com.google.firebase.messaging.reporting.a b(com.google.firebase.messaging.reporting.a.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        com.google.firebase.messaging.reporting.a.C1175a c1175aL = com.google.firebase.messaging.reporting.a.q().p(s(extras)).g(bVar).h(f(extras)).k(o()).n(com.google.firebase.messaging.reporting.a.d.ANDROID).j(m(extras)).l(k(extras));
        String strH = h(extras);
        if (strH != null) {
            c1175aL.i(strH);
        }
        String strR = r(extras);
        if (strR != null) {
            c1175aL.o(strR);
        }
        String strC = c(extras);
        if (strC != null) {
            c1175aL.e(strC);
        }
        String strI = i(extras);
        if (strI != null) {
            c1175aL.b(strI);
        }
        String strE = e(extras);
        if (strE != null) {
            c1175aL.f(strE);
        }
        long jQ = q(extras);
        if (jQ > 0) {
            c1175aL.m(jQ);
        }
        return c1175aL.a();
    }

    @androidx.annotation.p0
    static String c(Bundle bundle) {
        return bundle.getString(e.d.f123514e);
    }

    @androidx.annotation.p0
    static String d(Bundle bundle) {
        return bundle.getString(e.a.f123475c);
    }

    @androidx.annotation.p0
    static String e(Bundle bundle) {
        return bundle.getString(e.a.f123476d);
    }

    @NonNull
    static String f(Bundle bundle) {
        String string = bundle.getString(e.d.f123516g);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) com.google.android.gms.tasks.n.a(com.google.firebase.installations.j.v(com.google.firebase.h.p()).getId());
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException(e10);
        }
    }

    @androidx.annotation.p0
    static String g(Bundle bundle) {
        return bundle.getString(e.a.f123482j);
    }

    @androidx.annotation.p0
    static String h(Bundle bundle) {
        String string = bundle.getString(e.d.f123517h);
        return string == null ? bundle.getString(e.d.f123515f) : string;
    }

    @androidx.annotation.p0
    static String i(Bundle bundle) {
        return bundle.getString(e.a.f123481i);
    }

    @NonNull
    private static int j(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    static int k(Bundle bundle) {
        int iP = p(bundle);
        if (iP == 2) {
            return 5;
        }
        return iP == 1 ? 10 : 0;
    }

    @androidx.annotation.p0
    static String l(Bundle bundle) {
        return bundle.getString(e.a.f123477e);
    }

    @NonNull
    static com.google.firebase.messaging.reporting.a.c m(Bundle bundle) {
        return (bundle == null || !q0.v(bundle)) ? com.google.firebase.messaging.reporting.a.c.DATA_MESSAGE : com.google.firebase.messaging.reporting.a.c.DISPLAY_NOTIFICATION;
    }

    @NonNull
    static String n(Bundle bundle) {
        return (bundle == null || !q0.v(bundle)) ? "data" : "display";
    }

    @NonNull
    static String o() {
        return com.google.firebase.h.p().n().getPackageName();
    }

    @NonNull
    static int p(Bundle bundle) {
        String string = bundle.getString(e.d.f123521l);
        if (string == null) {
            if ("1".equals(bundle.getString(e.d.f123523n))) {
                return 2;
            }
            string = bundle.getString(e.d.f123522m);
        }
        return j(string);
    }

    @androidx.annotation.p0
    static long q(Bundle bundle) {
        if (bundle.containsKey(e.d.f123526q)) {
            try {
                return Long.parseLong(bundle.getString(e.d.f123526q));
            } catch (NumberFormatException unused) {
            }
        }
        com.google.firebase.h hVarP = com.google.firebase.h.p();
        String strM = hVarP.s().m();
        if (strM != null) {
            try {
                return Long.parseLong(strM);
            } catch (NumberFormatException unused2) {
            }
        }
        String strJ = hVarP.s().j();
        try {
            if (!strJ.startsWith("1:")) {
                return Long.parseLong(strJ);
            }
            String[] strArrSplit = strJ.split(":");
            if (strArrSplit.length < 2) {
                return 0L;
            }
            String str = strArrSplit[1];
            if (str.isEmpty()) {
                return 0L;
            }
            return Long.parseLong(str);
        } catch (NumberFormatException unused3) {
            return 0L;
        }
    }

    @androidx.annotation.p0
    static String r(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    @NonNull
    static int s(Bundle bundle) {
        Object obj = bundle.get(e.d.f123518i);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                Objects.toString(obj);
            }
        }
        return 0;
    }

    @androidx.annotation.p0
    static String t(Bundle bundle) {
        if (bundle.containsKey(e.a.f123478f)) {
            return bundle.getString(e.a.f123478f);
        }
        return null;
    }

    private static boolean u(Intent intent) {
        return FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction());
    }

    public static void v(Intent intent) {
        A(e.f.f123545o, intent.getExtras());
    }

    public static void w(Intent intent) {
        A(e.f.f123546p, intent.getExtras());
    }

    public static void x(Bundle bundle) {
        C(bundle);
        A(e.f.f123544n, bundle);
    }

    public static void y(Intent intent) {
        if (E(intent)) {
            A(e.f.f123543m, intent.getExtras());
        }
        if (D(intent)) {
            z(com.google.firebase.messaging.reporting.a.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.E());
        }
    }

    private static void z(com.google.firebase.messaging.reporting.a.b bVar, Intent intent, @androidx.annotation.p0 com.google.android.datatransport.m mVar) {
        com.google.firebase.messaging.reporting.a aVarB;
        if (mVar == null || (aVarB = b(bVar, intent)) == null) {
            return;
        }
        try {
            mVar.b(e.b.f123483a, com.google.firebase.messaging.reporting.b.class, com.google.android.datatransport.e.b("proto"), new com.google.android.datatransport.k() { // from class: com.google.firebase.messaging.m0
                @Override // com.google.android.datatransport.k
                public final Object apply(Object obj) {
                    return ((com.google.firebase.messaging.reporting.b) obj).e();
                }
            }).b(com.google.android.datatransport.f.l(com.google.firebase.messaging.reporting.b.d().b(aVarB).a(), com.google.android.datatransport.i.b(Integer.valueOf(intent.getIntExtra(e.d.f123524o, f123680f)))));
        } catch (RuntimeException unused) {
        }
    }
}
