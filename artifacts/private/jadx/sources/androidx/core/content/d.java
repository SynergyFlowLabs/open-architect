package androidx.core.content;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.v0;
import androidx.annotation.w0;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"PrivateConstructorForUtilityClass"})
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f47486a = "ContextCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f47487b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f47488c = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f47489d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f47490e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f47491f = 4;

    @w0(21)
    static class a {
        private a() {
        }

        static File a(Context context) {
            return context.getCodeCacheDir();
        }

        static Drawable b(Context context, int i10) {
            return context.getDrawable(i10);
        }

        static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    @w0(23)
    static class b {
        private b() {
        }

        static int a(Context context, int i10) {
            return context.getColor(i10);
        }

        static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    @w0(24)
    static class c {
        private c() {
        }

        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        static File b(Context context) {
            return context.getDataDir();
        }

        static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.d$d, reason: collision with other inner class name */
    @w0(26)
    static class C0383d {
        private C0383d() {
        }

        static Intent a(Context context, @androidx.annotation.p0 BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            return ((i10 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10 & 1) : context.registerReceiver(broadcastReceiver, intentFilter, d.v(context), handler);
        }

        static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    @w0(28)
    static class e {
        private e() {
        }

        static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    @w0(30)
    static class f {
        private f() {
        }

        @NonNull
        static Context a(@NonNull Context context, @androidx.annotation.p0 String str) {
            return context.createAttributionContext(str);
        }

        static String b(Context context) {
            return context.getAttributionTag();
        }

        static Display c(Context context) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                Objects.toString(context);
                return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
            }
        }
    }

    @w0(33)
    static class g {
        private g() {
        }

        static Intent a(Context context, @androidx.annotation.p0 BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10);
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final HashMap<Class<?>, String> f47492a;

        static {
            HashMap<Class<?>, String> map = new HashMap<>();
            f47492a = map;
            map.put(SubscriptionManager.class, "telephony_subscription_service");
            map.put(UsageStatsManager.class, "usagestats");
            map.put(AppWidgetManager.class, "appwidget");
            map.put(BatteryManager.class, "batterymanager");
            map.put(CameraManager.class, "camera");
            map.put(JobScheduler.class, "jobscheduler");
            map.put(LauncherApps.class, "launcherapps");
            map.put(MediaProjectionManager.class, "media_projection");
            map.put(MediaSessionManager.class, "media_session");
            map.put(RestrictionsManager.class, "restrictions");
            map.put(TelecomManager.class, "telecom");
            map.put(TvInputManager.class, "tv_input");
            map.put(AppOpsManager.class, "appops");
            map.put(CaptioningManager.class, "captioning");
            map.put(ConsumerIrManager.class, "consumer_ir");
            map.put(PrintManager.class, "print");
            map.put(BluetoothManager.class, com.segment.analytics.kotlin.android.plugins.a.f266548p1);
            map.put(DisplayManager.class, "display");
            map.put(UserManager.class, "user");
            map.put(InputManager.class, MetricTracker.Object.INPUT);
            map.put(MediaRouter.class, "media_router");
            map.put(NsdManager.class, "servicediscovery");
            map.put(AccessibilityManager.class, "accessibility");
            map.put(AccountManager.class, "account");
            map.put(ActivityManager.class, "activity");
            map.put(AlarmManager.class, androidx.core.app.w.K0);
            map.put(AudioManager.class, "audio");
            map.put(ClipboardManager.class, "clipboard");
            map.put(ConnectivityManager.class, "connectivity");
            map.put(DevicePolicyManager.class, "device_policy");
            map.put(DownloadManager.class, "download");
            map.put(DropBoxManager.class, "dropbox");
            map.put(InputMethodManager.class, "input_method");
            map.put(KeyguardManager.class, "keyguard");
            map.put(LayoutInflater.class, "layout_inflater");
            map.put(LocationManager.class, FirebaseAnalytics.d.f120676s);
            map.put(NfcManager.class, "nfc");
            map.put(NotificationManager.class, "notification");
            map.put(PowerManager.class, "power");
            map.put(SearchManager.class, FirebaseAnalytics.c.f120629o);
            map.put(SensorManager.class, "sensor");
            map.put(StorageManager.class, "storage");
            map.put(TelephonyManager.class, "phone");
            map.put(TextServicesManager.class, "textservices");
            map.put(UiModeManager.class, "uimode");
            map.put(UsbManager.class, "usb");
            map.put(Vibrator.class, "vibrator");
            map.put(WallpaperManager.class, "wallpaper");
            map.put(WifiP2pManager.class, "wifip2p");
            map.put(WifiManager.class, com.segment.analytics.kotlin.android.plugins.a.f266549p2);
            map.put(WindowManager.class, "window");
        }

        private h() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface i {
    }

    protected d() {
    }

    @v0(expression = "context.startActivity(intent, options)")
    @Deprecated
    public static void A(@NonNull Context context, @NonNull Intent intent, @androidx.annotation.p0 Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void B(@NonNull Context context, @NonNull Intent intent) {
        C0383d.b(context, intent);
    }

    public static int a(@NonNull Context context, @NonNull String str) {
        androidx.core.util.o.e(str, "permission must be non-null");
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return androidx.core.app.c0.q(context).a() ? 0 : -1;
    }

    @NonNull
    public static Context b(@NonNull Context context, @androidx.annotation.p0 String str) {
        return Build.VERSION.SDK_INT >= 30 ? f.a(context, str) : context;
    }

    @androidx.annotation.p0
    public static Context c(@NonNull Context context) {
        return c.a(context);
    }

    private static File d(File file) {
        synchronized (f47487b) {
            try {
                if (!file.exists()) {
                    if (file.mkdirs()) {
                        return file;
                    }
                    file.getPath();
                }
                return file;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @androidx.annotation.p0
    public static String e(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return f.b(context);
        }
        return null;
    }

    @NonNull
    public static File f(@NonNull Context context) {
        return a.a(context);
    }

    @androidx.annotation.l
    public static int g(@NonNull Context context, @androidx.annotation.n int i10) {
        return b.a(context, i10);
    }

    @androidx.annotation.p0
    public static ColorStateList h(@NonNull Context context, @androidx.annotation.n int i10) {
        return androidx.core.content.res.i.f(context.getResources(), i10, context.getTheme());
    }

    @NonNull
    public static Context i(@NonNull Context context) {
        androidx.core.os.p pVarA = androidx.core.app.q.a(context);
        if (Build.VERSION.SDK_INT <= 32 && !pVarA.j()) {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            androidx.core.os.g.b(configuration, pVarA);
            context = context.createConfigurationContext(configuration);
        }
        return context;
    }

    @androidx.annotation.p0
    public static File j(@NonNull Context context) {
        return c.b(context);
    }

    @NonNull
    public static Display k(@NonNull Context context) {
        return Build.VERSION.SDK_INT >= 30 ? f.c(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @androidx.annotation.p0
    public static Drawable l(@NonNull Context context, @androidx.annotation.v int i10) {
        return a.b(context, i10);
    }

    @NonNull
    @v0(expression = "context.getExternalCacheDirs()")
    @Deprecated
    public static File[] m(@NonNull Context context) {
        return context.getExternalCacheDirs();
    }

    @NonNull
    @v0(expression = "context.getExternalFilesDirs(type)")
    @Deprecated
    public static File[] n(@NonNull Context context, @androidx.annotation.p0 String str) {
        return context.getExternalFilesDirs(str);
    }

    @NonNull
    public static Executor o(@NonNull Context context) {
        return e.a(context);
    }

    @androidx.annotation.p0
    public static File p(@NonNull Context context) {
        return a.c(context);
    }

    @NonNull
    @v0(expression = "context.getObbDirs()")
    @Deprecated
    public static File[] q(@NonNull Context context) {
        return context.getObbDirs();
    }

    @NonNull
    public static String r(@NonNull Context context, int i10) {
        return i(context).getString(i10);
    }

    @androidx.annotation.p0
    public static <T> T s(@NonNull Context context, @NonNull Class<T> cls) {
        return (T) b.b(context, cls);
    }

    @androidx.annotation.p0
    public static String t(@NonNull Context context, @NonNull Class<?> cls) {
        return b.c(context, cls);
    }

    public static boolean u(@NonNull Context context) {
        return c.c(context);
    }

    static String v(Context context) {
        String str = context.getPackageName() + f47488c;
        if (i0.d(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    @androidx.annotation.p0
    public static Intent w(@NonNull Context context, @androidx.annotation.p0 BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter, int i10) {
        return x(context, broadcastReceiver, intentFilter, null, null, i10);
    }

    @androidx.annotation.p0
    public static Intent x(@NonNull Context context, @androidx.annotation.p0 BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter, @androidx.annotation.p0 String str, @androidx.annotation.p0 Handler handler, int i10) {
        int i11 = i10 & 1;
        if (i11 != 0 && (i10 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i11 != 0) {
            i10 |= 2;
        }
        int i12 = i10;
        int i13 = i12 & 2;
        if (i13 == 0 && (i12 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i13 != 0 && (i12 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        return Build.VERSION.SDK_INT >= 33 ? g.a(context, broadcastReceiver, intentFilter, str, handler, i12) : C0383d.a(context, broadcastReceiver, intentFilter, str, handler, i12);
    }

    public static boolean y(@NonNull Context context, @NonNull Intent[] intentArr) {
        return z(context, intentArr, null);
    }

    public static boolean z(@NonNull Context context, @NonNull Intent[] intentArr, @androidx.annotation.p0 Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }
}
