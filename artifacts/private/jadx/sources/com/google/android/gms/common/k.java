package com.google.android.gms.common;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import com.google.android.gms.common.internal.n1;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.gms.common.internal.a0
@g6.a
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @g6.a
    @Deprecated
    public static final int f106704a = 12451000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @g6.a
    @Deprecated
    public static final String f106705b = "com.google.android.gms";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    @g6.a
    public static final String f106706c = "com.google.android.play.games";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    @g6.a
    public static final String f106707d = "com.google.android.gsf";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    @g6.a
    public static final String f106708e = "com.android.vending";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @g6.a
    static final int f106709f = 39789;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @g6.a
    static final int f106710g = 10436;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f106712i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @l1
    static boolean f106713j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @g6.a
    @Deprecated
    static final AtomicBoolean f106711h = new AtomicBoolean();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final AtomicBoolean f106714k = new AtomicBoolean();

    @g6.a
    k() {
    }

    @g6.a
    @Deprecated
    public static void a(@NonNull Context context) {
        if (f106711h.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(f106710g);
            }
        } catch (SecurityException unused) {
        }
    }

    @com.google.android.gms.common.internal.a0
    @g6.a
    public static void b() {
        f106714k.set(true);
    }

    @g6.a
    @Deprecated
    public static void c(@NonNull Context context, int i10) throws i, h {
        int iK = g.i().k(context, i10);
        if (iK != 0) {
            Intent intentE = g.i().e(context, iK, "e");
            if (intentE != null) {
                throw new i(iK, "Google Play Services not available", intentE);
            }
            throw new h(iK);
        }
    }

    @com.google.android.gms.common.internal.a0
    @g6.a
    @Deprecated
    public static int d(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    @com.google.android.gms.common.internal.a0
    @g6.a
    @Deprecated
    public static int e(@NonNull Context context) {
        com.google.android.gms.common.internal.w.x(true);
        return com.google.android.gms.common.util.e.a(context, context.getPackageName());
    }

    @androidx.annotation.p0
    @g6.a
    @Deprecated
    public static PendingIntent f(int i10, @NonNull Context context, int i11) {
        return g.i().f(context, i10, i11);
    }

    @NonNull
    @g6.a
    @Deprecated
    public static String g(int i10) {
        return ConnectionResult.p2(i10);
    }

    @g6.a
    @Deprecated
    @androidx.annotation.p0
    @com.google.android.gms.common.internal.a0
    public static Intent h(int i10) {
        return g.i().e(null, i10, null);
    }

    @androidx.annotation.p0
    @g6.a
    public static Context i(@NonNull Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @androidx.annotation.p0
    @g6.a
    public static Resources j(@NonNull Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @com.google.android.gms.common.internal.a0
    @g6.a
    public static boolean k(@NonNull Context context) {
        if (!f106713j) {
            try {
                PackageInfo packageInfoF = com.google.android.gms.common.wrappers.d.a(context).f("com.google.android.gms", 134217792);
                l.a(context);
                if (packageInfoF == null || l.e(packageInfoF, false) || !l.e(packageInfoF, true)) {
                    f106712i = false;
                } else {
                    f106712i = true;
                }
                f106713j = true;
            } catch (PackageManager.NameNotFoundException unused) {
                f106713j = true;
            } catch (Throwable th2) {
                f106713j = true;
                throw th2;
            }
        }
        return f106712i || !com.google.android.gms.common.util.l.l();
    }

    @com.google.android.gms.common.internal.n
    @g6.a
    @Deprecated
    public static int l(@NonNull Context context) {
        return m(context, f106704a);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:59:0x010a  */
    /* JADX WARN: Code duplicated, block: B:60:0x010c  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @g6.a
    @Deprecated
    public static int m(@NonNull Context context, int i10) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        try {
            context.getResources().getString(r.b.f106810a);
        } catch (Throwable unused) {
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f106714k.get()) {
            int iA = n1.a(context);
            if (iA == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (iA != f106704a) {
                throw new GooglePlayServicesIncorrectManifestValueException(iA);
            }
        }
        int i11 = 1;
        boolean z10 = (com.google.android.gms.common.util.l.n(context) || com.google.android.gms.common.util.l.q(context)) ? false : true;
        com.google.android.gms.common.internal.w.a(i10 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z10) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 134225984);
            } catch (PackageManager.NameNotFoundException unused2) {
                String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing.");
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 134217792);
            l.a(context);
            if (l.e(packageInfo2, true)) {
                if (z10) {
                    com.google.android.gms.common.internal.w.r(packageInfo);
                    if (!l.e(packageInfo, true)) {
                        String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid.");
                    } else if (!z10 && packageInfo != null && !packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services.");
                    } else if (com.google.android.gms.common.util.e0.a(packageInfo2.versionCode) < com.google.android.gms.common.util.e0.a(i10)) {
                        i11 = 2;
                    } else {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e10) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e10);
                            }
                        }
                        if (!applicationInfo.enabled) {
                            return 0;
                        }
                        i11 = 3;
                    }
                } else {
                    if (!z10) {
                    }
                    if (com.google.android.gms.common.util.e0.a(packageInfo2.versionCode) < com.google.android.gms.common.util.e0.a(i10)) {
                        i11 = 2;
                    } else {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        }
                        if (!applicationInfo.enabled) {
                            return 0;
                        }
                        i11 = 3;
                    }
                }
                return i11;
            }
            String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid.");
            i11 = 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            String.valueOf(packageName).concat(" requires Google Play services, but they are missing.");
        }
        return i11;
    }

    @g6.a
    @Deprecated
    public static boolean n(@NonNull Context context, int i10) {
        return com.google.android.gms.common.util.c0.a(context, i10);
    }

    @com.google.android.gms.common.internal.a0
    @g6.a
    @Deprecated
    public static boolean o(@NonNull Context context, int i10) {
        if (i10 == 18) {
            return true;
        }
        if (i10 == 1) {
            return u(context, "com.google.android.gms");
        }
        return false;
    }

    @com.google.android.gms.common.internal.a0
    @g6.a
    @Deprecated
    public static boolean p(@NonNull Context context, int i10) {
        if (i10 == 9) {
            return u(context, "com.android.vending");
        }
        return false;
    }

    @e.b(18)
    @g6.a
    public static boolean q(@NonNull Context context) {
        Object systemService = context.getSystemService("user");
        com.google.android.gms.common.internal.w.r(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && com.facebook.internal.z0.P.equals(applicationRestrictions.getString("restricted_profile"));
    }

    @com.google.android.gms.common.internal.a0
    @g6.a
    @Deprecated
    public static boolean r(@NonNull Context context) {
        return com.google.android.gms.common.util.l.h(context);
    }

    @g6.a
    @Deprecated
    public static boolean s(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 9;
    }

    @e.b(19)
    @g6.a
    @Deprecated
    public static boolean t(@NonNull Context context, int i10, @NonNull String str) {
        return com.google.android.gms.common.util.c0.b(context, i10, str);
    }

    @e.b(21)
    static boolean u(Context context, String str) throws PackageManager.NameNotFoundException {
        boolean zEquals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (zEquals) {
                return applicationInfo.enabled;
            }
            if (applicationInfo.enabled && !q(context)) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
    }
}
