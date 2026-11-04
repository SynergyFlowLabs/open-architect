package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f123782a = "firebase_messaging_notification_delegation_enabled";

    private t0() {
    }

    public static /* synthetic */ void a(Context context, boolean z10, com.google.android.gms.tasks.l lVar) {
        try {
            if (!b(context)) {
                context.getPackageName();
                lVar.e(null);
                return;
            }
            v0.e(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z10) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate(null);
            }
            lVar.e(null);
        } catch (Throwable th2) {
            lVar.e(null);
            throw th2;
        }
    }

    private static boolean b(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    @androidx.annotation.m1
    static void c(Context context) {
        if (v0.c(context)) {
            return;
        }
        e(new androidx.media3.exoplayer.offline.b(), context, f(context));
    }

    static boolean d(Context context) {
        if (!com.google.android.gms.common.util.v.p()) {
            return false;
        }
        if (b(context)) {
            return "com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate());
        }
        context.getPackageName();
        return false;
    }

    @e.b(29)
    static Task<Void> e(Executor executor, final Context context, final boolean z10) {
        if (!com.google.android.gms.common.util.v.p()) {
            return com.google.android.gms.tasks.n.g(null);
        }
        final com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l();
        executor.execute(new Runnable() { // from class: com.google.firebase.messaging.s0
            @Override // java.lang.Runnable
            public final void run() {
                t0.a(context, z10, lVar);
            }
        });
        return lVar.a();
    }

    private static boolean f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(f123782a)) {
                return applicationInfo.metaData.getBoolean(f123782a);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return true;
    }
}
