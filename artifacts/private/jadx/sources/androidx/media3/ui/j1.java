package androidx.media3.ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class j1 implements androidx.media3.common.z0.g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f69941f = "com.android.settings.panel.action.MEDIA_OUTPUT";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f69942g = "com.android.settings.panel.extra.PACKAGE_NAME";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f69943h = "EXTRA_CLOSE_ON_CONNECT";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f69944i = "EXTRA_CONNECTION_ONLY";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f69945j = "android.bluetooth.devicepicker.extra.FILTER_TYPE";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f69946k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f69947l = "WearUnsuitableOutputPlaybackSuppressionResolverListener:WakeLock";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f69948m = TimeUnit.MINUTES.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f69949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f69950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.common.util.j f69951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private final PowerManager.WakeLock f69952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f69953e;

    public j1(Context context) {
        this(context, f69948m);
    }

    private static void L(Context context) {
        Intent intentPutExtra = new Intent(f69941f).addFlags(268435456).putExtra(f69942g, context.getPackageName());
        ComponentName componentNameL = l(context, intentPutExtra);
        if (componentNameL != null) {
            intentPutExtra.setComponent(componentNameL);
            context.startActivity(intentPutExtra);
            return;
        }
        Intent intentPutExtra2 = new Intent("android.settings.BLUETOOTH_SETTINGS").addFlags(268468224).putExtra(f69943h, true).putExtra(f69944i, true).putExtra(f69945j, 1);
        ComponentName componentNameL2 = l(context, intentPutExtra2);
        if (componentNameL2 != null) {
            intentPutExtra2.setComponent(componentNameL2);
            context.startActivity(intentPutExtra2);
        }
    }

    @androidx.annotation.p0
    private static ComponentName l(Context context, Intent intent) {
        ApplicationInfo applicationInfo;
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                return new ComponentName(activityInfo.packageName, activityInfo.name);
            }
        }
        return null;
    }

    @Override // androidx.media3.common.z0.g
    public void S(androidx.media3.common.z0 z0Var, androidx.media3.common.z0.f fVar) {
        if (androidx.media3.common.util.k1.q1(this.f69949a)) {
            if ((fVar.a(6) || fVar.a(5)) && z0Var.J() && z0Var.V1() == 3) {
                z0Var.pause();
                this.f69953e = this.f69951c.b();
                PowerManager.WakeLock wakeLock = this.f69952d;
                if (wakeLock != null && !wakeLock.isHeld()) {
                    this.f69952d.acquire(this.f69950b);
                }
                if (fVar.a(5)) {
                    L(this.f69949a);
                    return;
                }
                return;
            }
            if (!fVar.a(6) || z0Var.V1() != 0 || this.f69953e == -9223372036854775807L || this.f69951c.b() - this.f69953e >= this.f69950b) {
                return;
            }
            this.f69953e = -9223372036854775807L;
            z0Var.B();
            PowerManager.WakeLock wakeLock2 = this.f69952d;
            if (wakeLock2 != null) {
                wakeLock2.release();
            }
        }
    }

    public j1(Context context, @androidx.annotation.g0(from = 0) long j10) {
        this(context, j10, androidx.media3.common.util.j.f61520a);
    }

    @androidx.annotation.l1
    j1(Context context, @androidx.annotation.g0(from = 0) long j10, androidx.media3.common.util.j jVar) {
        PowerManager.WakeLock wakeLockNewWakeLock;
        androidx.media3.common.util.a.a(j10 >= 0);
        Context applicationContext = context.getApplicationContext();
        this.f69949a = applicationContext;
        this.f69950b = j10;
        this.f69951c = jVar;
        this.f69953e = -9223372036854775807L;
        PowerManager powerManager = (PowerManager) applicationContext.getSystemService("power");
        if (powerManager != null) {
            wakeLockNewWakeLock = powerManager.newWakeLock(1, f69947l);
            wakeLockNewWakeLock.setReferenceCounted(false);
        } else {
            wakeLockNewWakeLock = null;
        }
        this.f69952d = wakeLockNewWakeLock;
    }
}
