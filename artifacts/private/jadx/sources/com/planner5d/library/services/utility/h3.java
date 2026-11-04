package com.planner5d.library.services.utility;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.CursorWindow;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StatFs;
import android.util.DisplayMetrics;
import androidx.media2.session.SessionCommand;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.vr.sdk.base.GvrView;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Integer f225258a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f225260c = "sCursorWindowSize";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f225261d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f225259b = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReference<Boolean> f225262e = new AtomicReference<>(null);

    private h3() {
    }

    public static int A(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    private static int B(Context context) {
        return context.getResources().getConfiguration().screenLayout & 15;
    }

    public static int C(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        return Math.max(configuration.screenWidthDp, configuration.screenHeightDp);
    }

    public static int D(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        return Math.min(configuration.screenWidthDp, configuration.screenHeightDp);
    }

    public static int[] E(Context context) {
        return F(context.getResources());
    }

    public static int[] F(Resources resources) {
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
    }

    public static int G(Context context) {
        int[] iArrE = E(context);
        return Math.max(iArrE[0], iArrE[1]);
    }

    public static int H(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static Uri I(Context context) {
        return Uri.parse("market://details?id=" + (context == null ? com.planner5d.planner5d.n.f264530b : context.getApplicationContext().getPackageName()));
    }

    public static boolean J(@fj.g Context context) {
        return ((ActivityManager) context.getSystemService(ActivityManager.class)).isBackgroundRestricted();
    }

    public static boolean K(File file) throws Exception {
        return r(file) > 16777216;
    }

    public static boolean L(Context context) {
        return (context == null || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(4) == null) ? false : true;
    }

    private static boolean M() {
        return !e0.h(PackageInfo.CREATOR.getClass().getName(), "MD5").equals("4400f07a7ae6c282e30ae2df53968c22");
    }

    public static boolean N(Context context) {
        Boolean bool = f225262e.get();
        if (bool == null) {
            bool = Boolean.FALSE;
            if (!R() && (Y(context) || X(context))) {
                try {
                    new GvrView(context);
                    bool = Boolean.TRUE;
                } catch (UnsatisfiedLinkError unused) {
                }
            }
            f225262e.set(bool);
        }
        return bool.booleanValue();
    }

    public static boolean O() {
        return n().contains("arm");
    }

    public static boolean P() {
        return O() && n().contains("v7a");
    }

    public static boolean Q() {
        return n().contains("x86");
    }

    public static boolean R() {
        return n().contains("x86_64");
    }

    public static boolean S(Context context) {
        Integer numT = T(context);
        return numT != null && numT.intValue() == 0;
    }

    public static Integer T(Context context) {
        try {
            return Integer.valueOf(com.google.android.gms.common.f.x().j(context));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean U(@androidx.annotation.p0 Context context) {
        return context != null && context.getResources().getBoolean(o2.d.f225963g);
    }

    public static boolean V(Context context, int i10) {
        return context.getResources().getConfiguration().screenHeightDp > i10;
    }

    public static boolean W(Context context) {
        return context.getResources().getConfiguration().orientation == 1;
    }

    public static boolean X(Context context) {
        return B(context) == 3;
    }

    public static boolean Y(Context context) {
        return B(context) == 2;
    }

    public static boolean Z(Context context, int i10) {
        return context.getResources().getConfiguration().screenWidthDp > i10;
    }

    public static String a() {
        return "android " + l0();
    }

    public static boolean a0(Context context) {
        return B(context) == 4;
    }

    public static boolean b(@fj.g Context context, @fj.g Intent intent) {
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    private static boolean b0() {
        Scanner scanner = null;
        try {
            Scanner scanner2 = new Scanner(new File("/proc/cpuinfo"));
            while (scanner2.hasNextLine()) {
                try {
                    String strNextLine = scanner2.nextLine();
                    if (strNextLine != null) {
                        String lowerCase = strNextLine.toLowerCase();
                        if (lowerCase.contains("placeholder") && lowerCase.contains("hardware")) {
                            scanner2.close();
                            return true;
                        }
                    }
                } catch (Throwable unused) {
                    scanner = scanner2;
                    if (scanner != null) {
                        scanner.close();
                    }
                }
            }
            scanner2.close();
        } catch (Throwable unused2) {
        }
        return false;
    }

    public static String c() {
        return Build.BRAND + " (" + Build.MANUFACTURER + ") " + Build.DEVICE + ", model: " + Build.MODEL + " (" + Build.PRODUCT + ")";
    }

    private static HttpURLConnection c0(String str, int i10, int i11) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setConnectTimeout(i10);
        httpURLConnection.setReadTimeout(i11);
        return httpURLConnection;
    }

    public static <T> T d(Callable<T> callable) throws Throwable {
        T tCall;
        synchronized (f225259b) {
            try {
                i0(true);
                try {
                    tCall = callable.call();
                    i0(false);
                } catch (Throwable th2) {
                    i0(false);
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return tCall;
    }

    public static HttpURLConnection d0(String str) throws IOException {
        return c0(str, 8000, androidx.core.view.accessibility.j.f48528u0);
    }

    @androidx.annotation.p0
    public static Activity e(@androidx.annotation.p0 Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return e(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static HttpURLConnection e0(String str) throws IOException {
        return c0(str, 10000, SessionCommand.X);
    }

    public static String f(Context context) {
        return context.getResources().getConfiguration().getLocales().get(0).getLanguage();
    }

    public static void f0(@fj.g Context context, @fj.g Intent intent) {
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    public static String g(Context context) {
        return f(context) + "_" + o();
    }

    public static void g0(Activity activity) {
        if (activity != null) {
            f0(activity, new Intent("android.intent.action.VIEW", I(activity)));
        }
    }

    public static String h(Context context) {
        PackageInfo packageInfoY = y(context);
        return packageInfoY == null ? com.planner5d.library.model.payments.a.f222474i : packageInfoY.packageName;
    }

    public static void h0(Context context, PendingIntent pendingIntent, long j10) {
        AlarmManager alarmManager = (AlarmManager) androidx.core.content.d.s(context, AlarmManager.class);
        if (alarmManager != null) {
            alarmManager.setWindow(1, System.currentTimeMillis() + j10, 900000L, pendingIntent);
        }
    }

    @fj.g
    public static byte[] i(@fj.g Context context) throws IllegalStateException, NoSuchAlgorithmException, PackageManager.NameNotFoundException {
        Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
        if (signatureArr == null || signatureArr.length == 0) {
            throw new IllegalStateException("The app has no signatures");
        }
        byte[] bArrI = e0.i(signatureArr[signatureArr.length - 1].toByteArray(), "SHA");
        if (M()) {
            l.a(bArrI, 3);
        }
        return bArrI;
    }

    private static void i0(boolean z10) {
        Integer num = f225258a;
        if (num == null) {
            num = (Integer) q2.d(null, CursorWindow.class, f225260c);
            f225258a = num;
        }
        if (z10) {
            num = 6291456;
        }
        q2.f(null, CursorWindow.class, f225260c, Integer.valueOf(num == null ? 1024 : num.intValue()));
    }

    public static int j(Context context) {
        PackageInfo packageInfoY = y(context);
        if (packageInfoY == null) {
            return 0;
        }
        return packageInfoY.versionCode;
    }

    public static void j0(Activity activity, Class<? extends Activity> cls, Bundle bundle) {
        k0(activity, cls.getName(), bundle);
    }

    public static String k(Context context) {
        return j(context) + "_" + l(context);
    }

    public static void k0(Activity activity, String str, Bundle bundle) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(activity.getPackageName(), str));
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        activity.startActivity(intent);
    }

    public static String l(Context context) {
        PackageInfo packageInfoY = y(context);
        return packageInfoY == null ? com.planner5d.library.model.payments.a.f222474i : packageInfoY.versionName;
    }

    public static String l0() {
        return System.getProperty("os.version") + ":" + Build.VERSION.INCREMENTAL + ":" + Build.VERSION.SDK_INT + ":" + Build.VERSION.RELEASE;
    }

    public static long m() {
        return Runtime.getRuntime().maxMemory();
    }

    public static String n() {
        if (f225261d == null) {
            String lowerCase = Build.CPU_ABI.toLowerCase();
            if (lowerCase.contains("arm") && b0()) {
                return "x86";
            }
            f225261d = lowerCase;
        }
        return f225261d;
    }

    public static String o() {
        return Locale.getDefault().getCountry();
    }

    public static String p() {
        return Locale.getDefault().getLanguage();
    }

    public static String q() {
        return p() + "_" + o();
    }

    public static long r(File file) throws Exception {
        return new StatFs(file.getAbsolutePath()).getAvailableBytes();
    }

    public static long s(File file) {
        return new StatFs(file.getAbsolutePath()).getTotalBytes();
    }

    public static Long t(Context context) {
        PackageInfo packageInfoY = y(context);
        return Long.valueOf(packageInfoY == null ? 0L : packageInfoY.firstInstallTime);
    }

    public static String u(@fj.g Activity activity, com.planner5d.library.services.r rVar) {
        return v(activity, rVar.f224891a);
    }

    private static String v(@fj.g Activity activity, String str) {
        Bundle bundle;
        try {
            PackageManager packageManager = activity.getPackageManager();
            if (packageManager != null && (bundle = packageManager.getActivityInfo(activity.getComponentName(), 128).metaData) != null && bundle.containsKey(str)) {
                return bundle.getString(str);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return activity.getIntent().getStringExtra(str);
    }

    public static String w() {
        return "android";
    }

    public static int x() {
        return Build.VERSION.SDK_INT;
    }

    private static PackageInfo y(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    @e.a({"DiscouragedApi"})
    public static int z(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, context.getPackageName());
    }
}
