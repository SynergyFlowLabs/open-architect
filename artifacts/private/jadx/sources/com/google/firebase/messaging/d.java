package com.google.firebase.messaging;

import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f123450a = "com.google.firebase.messaging.default_notification_color";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f123451b = "com.google.firebase.messaging.default_notification_icon";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f123452c = "com.google.firebase.messaging.default_notification_channel_id";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f123453d = "fcm_fallback_notification_channel";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f123454e = "fcm_fallback_notification_channel_label";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f123455f = "Misc";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f123456g = "com.google.android.c2dm.intent.RECEIVE";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f123457h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final AtomicInteger f123458i = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.core.app.w.n f123459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f123460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f123461c;

        a(androidx.core.app.w.n nVar, String str, int i10) {
            this.f123459a = nVar;
            this.f123460b = str;
            this.f123461c = i10;
        }
    }

    private d() {
    }

    @androidx.annotation.p0
    private static PendingIntent a(Context context, q0 q0Var, String str, PackageManager packageManager) {
        Intent intentF = f(str, q0Var, packageManager);
        if (intentF == null) {
            return null;
        }
        intentF.addFlags(67108864);
        intentF.putExtras(q0Var.A());
        if (q(q0Var)) {
            intentF.putExtra(e.c.E, q0Var.z());
        }
        return PendingIntent.getActivity(context, g(), intentF, l(1073741824));
    }

    @androidx.annotation.p0
    private static PendingIntent b(Context context, Context context2, q0 q0Var) {
        if (q(q0Var)) {
            return c(context, context2, new Intent(com.google.android.gms.cloudmessaging.a.C0963a.f105751b).putExtras(q0Var.z()));
        }
        return null;
    }

    private static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent(f123456g).setPackage(context2.getPackageName()).putExtra(com.google.android.gms.cloudmessaging.a.b.f105753b, intent), l(1073741824));
    }

    public static a d(Context context, Context context2, q0 q0Var, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        androidx.core.app.w.n nVar = new androidx.core.app.w.n(context2, str);
        String strN = q0Var.n(resources, packageName, e.c.f123490g);
        if (!TextUtils.isEmpty(strN)) {
            nVar.O(strN);
        }
        String strN2 = q0Var.n(resources, packageName, e.c.f123491h);
        if (!TextUtils.isEmpty(strN2)) {
            nVar.N(strN2);
            nVar.z0(new androidx.core.app.w.l().A(strN2));
        }
        nVar.t0(m(packageManager, resources, packageName, q0Var.p(e.c.f123492i), bundle));
        Uri uriN = n(packageName, q0Var, resources);
        if (uriN != null) {
            nVar.x0(uriN);
        }
        nVar.M(a(context, q0Var, packageName, packageManager));
        PendingIntent pendingIntentB = b(context, context2, q0Var);
        if (pendingIntentB != null) {
            nVar.T(pendingIntentB);
        }
        Integer numH = h(context2, q0Var.p(e.c.f123495l), bundle);
        if (numH != null) {
            nVar.I(numH.intValue());
        }
        nVar.C(!q0Var.a(e.c.f123498o));
        nVar.e0(q0Var.a(e.c.f123497n));
        String strP = q0Var.p(e.c.f123496m);
        if (strP != null) {
            nVar.B0(strP);
        }
        Integer numM = q0Var.m();
        if (numM != null) {
            nVar.k0(numM.intValue());
        }
        Integer numR = q0Var.r();
        if (numR != null) {
            nVar.G0(numR.intValue());
        }
        Integer numL = q0Var.l();
        if (numL != null) {
            nVar.h0(numL.intValue());
        }
        Long lJ = q0Var.j(e.c.f123507x);
        if (lJ != null) {
            nVar.r0(true);
            nVar.H0(lJ.longValue());
        }
        long[] jArrQ = q0Var.q();
        if (jArrQ != null) {
            nVar.F0(jArrQ);
        }
        int[] iArrE = q0Var.e();
        if (iArrE != null) {
            nVar.d0(iArrE[0], iArrE[1], iArrE[2]);
        }
        nVar.S(i(q0Var));
        return new a(nVar, o(q0Var), 0);
    }

    static a e(Context context, q0 q0Var) {
        Bundle bundleJ = j(context.getPackageManager(), context.getPackageName());
        return d(context, context, q0Var, k(context, q0Var.k(), bundleJ), bundleJ);
    }

    private static Intent f(String str, q0 q0Var, PackageManager packageManager) {
        String strP = q0Var.p(e.c.A);
        if (!TextUtils.isEmpty(strP)) {
            Intent intent = new Intent(strP);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri uriF = q0Var.f();
        if (uriF == null) {
            return packageManager.getLaunchIntentForPackage(str);
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setPackage(str);
        intent2.setData(uriF);
        return intent2;
    }

    private static int g() {
        return f123458i.incrementAndGet();
    }

    private static Integer h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
            }
        }
        int i10 = bundle.getInt(f123450a, 0);
        if (i10 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(androidx.core.content.d.g(context, i10));
        } catch (Resources.NotFoundException unused2) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int i(q0 q0Var) {
        boolean zA = q0Var.a(e.c.f123500q);
        ?? r10 = zA;
        if (q0Var.a(e.c.f123501r)) {
            r10 = (zA ? 1 : 0) | 2;
        }
        return q0Var.a(e.c.f123502s) ? r10 | 4 : r10;
    }

    private static Bundle j(PackageManager packageManager, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                return bundle;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            e10.toString();
        }
        return Bundle.EMPTY;
    }

    @androidx.annotation.l1
    @e.b(26)
    public static String k(Context context, String str, Bundle bundle) {
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str) && notificationManager.getNotificationChannel(str) != null) {
                return str;
            }
            String string = bundle.getString(f123452c);
            if (!TextUtils.isEmpty(string) && notificationManager.getNotificationChannel(string) != null) {
                return string;
            }
            if (notificationManager.getNotificationChannel(f123453d) == null) {
                int identifier = context.getResources().getIdentifier(f123454e, androidx.constraintlayout.core.motion.utils.v.b.f43988e, context.getPackageName());
                notificationManager.createNotificationChannel(new NotificationChannel(f123453d, identifier == 0 ? f123455f : context.getString(identifier), 3));
            }
            return f123453d;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int l(int i10) {
        return i10 | 67108864;
    }

    private static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
        }
        int i10 = bundle.getInt(f123451b, 0);
        if (i10 == 0 || !p(resources, i10)) {
            try {
                i10 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e10) {
                e10.toString();
            }
        }
        return (i10 == 0 || !p(resources, i10)) ? R.drawable.sym_def_app_icon : i10;
    }

    private static Uri n(String str, q0 q0Var, Resources resources) {
        String strO = q0Var.o();
        if (TextUtils.isEmpty(strO)) {
            return null;
        }
        if ("default".equals(strO) || resources.getIdentifier(strO, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + strO);
    }

    private static String o(q0 q0Var) {
        String strP = q0Var.p(e.c.f123494k);
        if (!TextUtils.isEmpty(strP)) {
            return strP;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    @e.b(26)
    private static boolean p(Resources resources, int i10) {
        return true;
    }

    static boolean q(@NonNull q0 q0Var) {
        return q0Var.a(e.a.f123474b);
    }
}
