package com.google.android.gms.common.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.apps.common.proguard.SideEffectFree;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private static Boolean f106942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private static Boolean f106943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private static Boolean f106944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private static Boolean f106945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private static Boolean f106946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private static Boolean f106947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private static Boolean f106948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private static Boolean f106949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private static Boolean f106950i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private static Boolean f106951j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private static Boolean f106952k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private static Boolean f106953l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private static Boolean f106954m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private static Boolean f106955n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private static Boolean f106956o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private static Boolean f106957p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    private static Boolean f106958q;

    private l() {
    }

    @g6.a
    public static boolean a(@NonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f106953l == null) {
            boolean z10 = false;
            if (v.n() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f106953l = Boolean.valueOf(z10);
        }
        return f106953l.booleanValue();
    }

    @g6.a
    public static boolean b(@NonNull Context context) {
        if (f106956o == null) {
            boolean z10 = false;
            if (v.q() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z10 = true;
            }
            f106956o = Boolean.valueOf(z10);
        }
        return f106956o.booleanValue();
    }

    @g6.a
    public static boolean c(@NonNull Context context) {
        if (f106945d == null) {
            boolean z10 = false;
            if (v.q() && context.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle")) {
                z10 = true;
            }
            f106945d = Boolean.valueOf(z10);
        }
        return f106945d.booleanValue();
    }

    @g6.a
    public static boolean d(@NonNull Context context) {
        if (f106949h == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z10 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z10 = true;
            }
            f106949h = Boolean.valueOf(z10);
        }
        return f106949h.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    @g6.a
    public static boolean e(@NonNull Context context) {
        if (f106942a == null) {
            boolean z10 = true;
            if (!c(context)) {
                if (i(context) || m(context) || q(context)) {
                    z10 = false;
                } else {
                    if (f106952k == null) {
                        f106952k = Boolean.valueOf(context.getPackageManager().hasSystemFeature("org.chromium.arc"));
                    }
                    if (f106952k.booleanValue() || a(context) || k(context)) {
                        z10 = false;
                    } else {
                        if (f106955n == null) {
                            f106955n = Boolean.valueOf(context.getPackageManager().hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE"));
                        }
                        if (f106955n.booleanValue() || b(context) || o(context)) {
                            z10 = false;
                        } else {
                            if (f106958q == null) {
                                f106958q = Boolean.valueOf(context.getPackageManager().hasSystemFeature("com.google.desktop.gms"));
                            }
                            if (f106958q.booleanValue()) {
                                z10 = false;
                            }
                        }
                    }
                }
            }
            f106942a = Boolean.valueOf(z10);
        }
        return f106942a.booleanValue();
    }

    @g6.a
    public static boolean f(@NonNull Context context) {
        ActivityManager activityManager;
        boolean z10 = false;
        if (context == null) {
            return false;
        }
        if (f106943b == null) {
            if (e(context)) {
                if (f106950i == null && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
                    f106950i = Boolean.valueOf(activityManager.isLowRamDevice());
                }
                if (com.google.android.gms.common.internal.u.b(f106950i, Boolean.TRUE)) {
                    z10 = true;
                }
            }
            f106943b = Boolean.valueOf(z10);
        }
        return f106943b.booleanValue();
    }

    @g6.a
    public static boolean g(@NonNull Context context) {
        return r(context.getResources());
    }

    @e.b(21)
    @g6.a
    public static boolean h(@NonNull Context context) {
        return p(context);
    }

    @g6.a
    public static boolean i(@NonNull Context context) {
        return j(context.getResources());
    }

    @g6.a
    public static boolean j(@NonNull Resources resources) {
        if (resources == null) {
            return false;
        }
        if (f106944c == null) {
            f106944c = Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || r(resources));
        }
        return f106944c.booleanValue();
    }

    @g6.a
    public static boolean k(@NonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f106954m == null) {
            boolean z10 = true;
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback") && !packageManager.hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE")) {
                z10 = false;
            }
            f106954m = Boolean.valueOf(z10);
        }
        return f106954m.booleanValue();
    }

    @g6.a
    public static boolean l() {
        int i10 = com.google.android.gms.common.k.f106704a;
        return "user".equals(Build.TYPE);
    }

    @SideEffectFree
    @e.b(20)
    @g6.a
    public static boolean m(@NonNull Context context) {
        return s(context.getPackageManager());
    }

    @e.b(26)
    @g6.a
    public static boolean n(@NonNull Context context) {
        if (!m(context) || v.m()) {
            return p(context) && (!v.n() || v.q());
        }
        return true;
    }

    @g6.a
    public static boolean o(@NonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f106957p == null) {
            f106957p = Boolean.valueOf(packageManager.hasSystemFeature("android.software.xr.immersive"));
        }
        return f106957p.booleanValue();
    }

    @e.b(21)
    public static boolean p(@NonNull Context context) {
        if (f106948g == null) {
            f106948g = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f106948g.booleanValue();
    }

    public static boolean q(@NonNull Context context) {
        if (f106951j == null) {
            f106951j = Boolean.valueOf(v.n() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
        }
        return f106951j.booleanValue();
    }

    public static boolean r(@NonNull Resources resources) {
        boolean z10 = false;
        if (resources == null) {
            return false;
        }
        if (f106946e == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z10 = true;
            }
            f106946e = Boolean.valueOf(z10);
        }
        return f106946e.booleanValue();
    }

    @SideEffectFree
    @e.b(20)
    public static boolean s(@NonNull PackageManager packageManager) {
        if (f106947f == null) {
            f106947f = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f106947f.booleanValue();
    }
}
