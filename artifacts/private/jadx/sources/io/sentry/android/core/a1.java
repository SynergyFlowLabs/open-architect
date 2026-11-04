package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import io.sentry.ILogger;
import io.sentry.n8;
import io.sentry.y7;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e.a({"NewApi"})
    @NotNull
    private static final io.sentry.android.core.util.a<PackageInfo> f304044a = new io.sentry.android.core.util.a<>(new io.sentry.android.core.util.a.InterfaceC2205a() { // from class: io.sentry.android.core.v0
        @Override // io.sentry.android.core.util.a.InterfaceC2205a
        public final Object a(Context context) {
            return a1.d(context);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final io.sentry.android.core.util.a<PackageInfo> f304045b = new io.sentry.android.core.util.a<>(new io.sentry.android.core.util.a.InterfaceC2205a() { // from class: io.sentry.android.core.w0
        @Override // io.sentry.android.core.util.a.InterfaceC2205a
        public final Object a(Context context) {
            return a1.b(context);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final io.sentry.android.core.util.a<String> f304046c = new io.sentry.android.core.util.a<>(new io.sentry.android.core.util.a.InterfaceC2205a() { // from class: io.sentry.android.core.x0
        @Override // io.sentry.android.core.util.a.InterfaceC2205a
        public final Object a(Context context) {
            return a1.a(context);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e.a({"NewApi"})
    @NotNull
    private static final io.sentry.android.core.util.a<ApplicationInfo> f304047d = new io.sentry.android.core.util.a<>(new io.sentry.android.core.util.a.InterfaceC2205a() { // from class: io.sentry.android.core.y0
        @Override // io.sentry.android.core.util.a.InterfaceC2205a
        public final Object a(Context context) {
            return a1.c(context);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final io.sentry.android.core.util.a<ApplicationInfo> f304048e = new io.sentry.android.core.util.a<>(new io.sentry.android.core.util.a.InterfaceC2205a() { // from class: io.sentry.android.core.z0
        @Override // io.sentry.android.core.util.a.InterfaceC2205a
        public final Object a(Context context) {
            return a1.e(context);
        }
    });

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f304049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final String f304050b;

        public a(boolean z10, @Nullable String str) {
            this.f304049a = z10;
            this.f304050b = str;
        }

        @NotNull
        public Map<String, String> a() {
            HashMap map = new HashMap();
            map.put("isSideLoaded", String.valueOf(this.f304049a));
            String str = this.f304050b;
            if (str != null) {
                map.put("installerStore", str);
            }
            return map;
        }

        @Nullable
        public String b() {
            return this.f304050b;
        }

        public boolean c() {
            return this.f304049a;
        }
    }

    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final String f304051c = "com.android.vending.splits.required";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f304052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f304053b;

        public b(boolean z10, String[] strArr) {
            this.f304052a = z10;
            this.f304053b = strArr;
        }

        @Nullable
        public String[] a() {
            return this.f304053b;
        }

        public boolean b() {
            return this.f304052a;
        }
    }

    private a1() {
    }

    public static /* synthetic */ String a(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            if (i10 != 0) {
                return context.getString(i10);
            }
            CharSequence charSequence = applicationInfo.nonLocalizedLabel;
            return charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ PackageInfo b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ ApplicationInfo c(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ PackageInfo d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ ApplicationInfo e(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable unused) {
            return null;
        }
    }

    @lm.a.c
    public static boolean f(@NotNull Context context) {
        if (context.getPackageName().endsWith(".test")) {
            try {
                Iterator<ActivityManager.AppTask> it = ((ActivityManager) context.getSystemService("activity")).getAppTasks().iterator();
                while (it.hasNext()) {
                    ComponentName component = it.next().getTaskInfo().baseIntent.getComponent();
                    if (component != null && component.getClassName().equals("androidx.compose.ui.tooling.PreviewActivity")) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @NotNull
    public static Context g(@NotNull Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    @e.a({"NewApi"})
    @Nullable
    static ApplicationInfo h(@NotNull Context context, @NotNull u0 u0Var) {
        return u0Var.d() >= 33 ? f304047d.a(context) : f304048e.a(context);
    }

    @Nullable
    static String i(@NotNull Context context) {
        return f304046c.a(context);
    }

    @NotNull
    static String[] j() {
        return Build.SUPPORTED_ABIS;
    }

    @Nullable
    static DisplayMetrics k(@NotNull Context context, @NotNull ILogger iLogger) {
        try {
            return context.getResources().getDisplayMetrics();
        } catch (Throwable th2) {
            iLogger.a(y7.ERROR, "Error getting DisplayMetrics.", th2);
            return null;
        }
    }

    @Nullable
    static String l(@NotNull ILogger iLogger) {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th2) {
            iLogger.a(y7.ERROR, "Error getting device family.", th2);
            return null;
        }
    }

    @Nullable
    static String m(@NotNull ILogger iLogger) {
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (!file.canRead()) {
            return property;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                return line;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            iLogger.a(y7.ERROR, "Exception while attempting to read kernel information", e10);
            return property;
        }
    }

    @Nullable
    static ActivityManager.MemoryInfo n(@NotNull Context context, @NotNull ILogger iLogger) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            iLogger.c(y7.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th2) {
            iLogger.a(y7.ERROR, "Error getting MemoryInfo.", th2);
            return null;
        }
    }

    @e.a({"NewApi"})
    @Nullable
    static PackageInfo o(@NotNull Context context, int i10, @NotNull ILogger iLogger, @NotNull u0 u0Var) {
        try {
            return u0Var.d() >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(i10)) : context.getPackageManager().getPackageInfo(context.getPackageName(), i10);
        } catch (Throwable th2) {
            iLogger.a(y7.ERROR, "Error getting package info.", th2);
            return null;
        }
    }

    @Nullable
    static PackageInfo p(@NotNull Context context, @NotNull u0 u0Var) {
        return u0Var.d() >= 33 ? f304044a.a(context) : f304045b.a(context);
    }

    @e.a({"NewApi"})
    @NotNull
    static String q(@NotNull PackageInfo packageInfo, @NotNull u0 u0Var) {
        return u0Var.d() >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : r(packageInfo);
    }

    @NotNull
    private static String r(@NotNull PackageInfo packageInfo) {
        return Integer.toString(packageInfo.versionCode);
    }

    @Nullable
    static String s(@NotNull PackageInfo packageInfo) {
        return packageInfo.versionName;
    }

    @lm.a.c
    public static boolean t() {
        boolean z10 = false;
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                z10 = true;
            }
        } catch (Throwable unused) {
        }
        return z10;
    }

    @Nullable
    static Intent u(@NotNull Context context, @NotNull n8 n8Var, @Nullable BroadcastReceiver broadcastReceiver, @NotNull IntentFilter intentFilter, @Nullable Handler handler) {
        return v(context, new u0(n8Var.getLogger()), broadcastReceiver, intentFilter, handler);
    }

    @e.a({"NewApi", "UnspecifiedRegisterReceiverFlag"})
    @Nullable
    static Intent v(@NotNull Context context, @NotNull u0 u0Var, @Nullable BroadcastReceiver broadcastReceiver, @NotNull IntentFilter intentFilter, @Nullable Handler handler) {
        return u0Var.d() >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, null, handler, 4) : context.registerReceiver(broadcastReceiver, intentFilter, null, handler);
    }

    @lm.n
    static void w() {
        f304044a.b();
        f304045b.b();
        f304046c.b();
        f304047d.b();
        f304048e.b();
    }

    @Nullable
    static a x(@NotNull Context context, @NotNull ILogger iLogger, @NotNull u0 u0Var) {
        String str;
        try {
            PackageInfo packageInfoP = p(context, u0Var);
            PackageManager packageManager = context.getPackageManager();
            if (packageInfoP != null && packageManager != null) {
                str = packageInfoP.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    return new a(installerPackageName == null, installerPackageName);
                } catch (IllegalArgumentException unused) {
                    iLogger.c(y7.DEBUG, "%s package isn't installed.", str);
                    return null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        return null;
    }

    @Nullable
    static b y(@NotNull Context context, @NotNull u0 u0Var) {
        Bundle bundle;
        ApplicationInfo applicationInfoH = h(context, u0Var);
        PackageInfo packageInfoP = p(context, u0Var);
        if (packageInfoP == null) {
            return null;
        }
        return new b((applicationInfoH == null || (bundle = applicationInfoH.metaData) == null) ? false : bundle.getBoolean("com.android.vending.splits.required"), packageInfoP.splitNames);
    }

    static void z(@NotNull PackageInfo packageInfo, @NotNull u0 u0Var, @Nullable h1 h1Var, @NotNull io.sentry.protocol.a aVar) {
        aVar.z(packageInfo.packageName);
        aVar.C(packageInfo.versionName);
        aVar.y(q(packageInfo, u0Var));
        HashMap map = new HashMap();
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                String str = strArr[i10];
                map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i10] & 2) == 2 ? "granted" : "not_granted");
            }
        }
        aVar.G(map);
        if (h1Var != null) {
            try {
                b bVarM = h1Var.m();
                if (bVarM != null) {
                    aVar.H(Boolean.valueOf(bVarM.b()));
                    if (bVarM.a() != null) {
                        aVar.I(Arrays.asList(bVarM.a()));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
