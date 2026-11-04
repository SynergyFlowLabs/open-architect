package com.google.vr.cardboard;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.view.Window;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f126805a = "a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f126806b;

    /* JADX INFO: renamed from: com.google.vr.cardboard.a$a, reason: collision with other inner class name */
    class DialogInterfaceOnClickListenerC1232a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f126807a;

        DialogInterfaceOnClickListenerC1232a(Context context) {
            this.f126807a = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("market://details?id=com.google.vr.vrcore"));
            intent.setPackage("com.android.vending");
            try {
                this.f126807a.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                String unused2 = a.f126805a;
            }
        }
    }

    class b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f126808a;

        b(Context context) {
            this.f126808a = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            this.f126808a.startActivity(new Intent("android.settings.VR_LISTENER_SETTINGS"));
        }
    }

    class c implements DialogInterface.OnClickListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    private a() {
    }

    private static int b(Context context) {
        Iterator<ApplicationInfo> it = context.getPackageManager().getInstalledApplications(0).iterator();
        while (it.hasNext()) {
            if (it.next().packageName.equals("com.google.vr.vrcore")) {
                String string = Settings.Secure.getString(context.getContentResolver(), "enabled_vr_listeners");
                return (string == null || !string.contains(new ComponentName("com.google.vr.vrcore", "com.google.vr.vrcore.common.VrCoreListenerService").flattenToString())) ? -2 : 0;
            }
        }
        return -1;
    }

    private static boolean c(Context context, int i10) {
        if (n.a()) {
            return true;
        }
        if (i10 == -1) {
            l(context, s.f.f126898m, s.f.f126899n, new DialogInterfaceOnClickListenerC1232a(context));
            return false;
        }
        if (i10 != -2) {
            return true;
        }
        l(context, s.f.f126897l, s.f.f126900o, new b(context));
        return false;
    }

    private static boolean d() {
        return true;
    }

    private static boolean e() {
        if (f126806b < 25) {
            "NMR1".equals(Build.VERSION.CODENAME);
        }
        return true;
    }

    private static boolean f(Context context) {
        return d() && context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance");
    }

    public static boolean g(Context context) {
        return d() && context.getPackageManager().hasSystemFeature("android.software.vr.mode");
    }

    public static boolean h(Activity activity, boolean z10) {
        Window window;
        if (!d() || !((PowerManager) activity.getSystemService("power")).isSustainedPerformanceModeSupported() || (window = activity.getWindow()) == null) {
            return false;
        }
        window.setSustainedPerformanceMode(z10);
        return true;
    }

    public static boolean i(Activity activity, boolean z10) {
        return j(activity, z10, 1);
    }

    public static boolean j(Activity activity, boolean z10, int i10) {
        if (!g(activity)) {
            d();
            return false;
        }
        try {
            activity.setVrModeEnabled(z10, new ComponentName("com.google.vr.vrcore", "com.google.vr.vrcore.common.VrCoreListenerService"));
            return true;
        } catch (PackageManager.NameNotFoundException e10) {
            new StringBuilder(String.valueOf(e10).length() + 25);
            if ((i10 & 1) != 0 && f(activity)) {
                c(activity, b(activity));
            }
            return false;
        } catch (UnsupportedOperationException e11) {
            new StringBuilder(String.valueOf(e11).length() + 23);
            return false;
        }
    }

    public static void k(int i10) {
        if (d()) {
            try {
                try {
                    ActivityManager.class.getMethod("setVrThread", Integer.TYPE).invoke(null, Integer.valueOf(i10));
                } catch (IllegalAccessException | RuntimeException | InvocationTargetException e10) {
                    new StringBuilder(String.valueOf(e10).length() + 30);
                }
            } catch (NoSuchMethodException | RuntimeException e11) {
                if (e()) {
                    new StringBuilder(String.valueOf(e11).length() + 38);
                } else {
                    new StringBuilder(String.valueOf(e11).length() + 38);
                }
            }
        }
    }

    private static void l(Context context, int i10, int i11, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context, s.g.f126909a);
        builder.setMessage(i10).setTitle(s.f.f126896k).setPositiveButton(i11, onClickListener).setNegativeButton(s.f.f126887b, new c());
        builder.create().show();
    }
}
