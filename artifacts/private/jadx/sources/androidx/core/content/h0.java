package androidx.core.content;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.w0;
import androidx.core.os.t0;
import com.google.common.util.concurrent.t1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final String f47499a = "PackageManagerCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47500b = "android.intent.action.AUTO_REVOKE_PERMISSIONS";

    @w0(30)
    private static class a {
        private a() {
        }

        static boolean a(@NonNull Context context) {
            return !context.getPackageManager().isAutoRevokeWhitelisted();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface b {
    }

    private h0() {
    }

    @b1({b1.a.LIBRARY})
    public static boolean a(@NonNull PackageManager packageManager) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 >= 30) || ((i10 < 30) && (b(packageManager) != null));
    }

    @b1({b1.a.LIBRARY})
    @androidx.annotation.p0
    public static String b(@NonNull PackageManager packageManager) {
        String str = null;
        Iterator<ResolveInfo> it = packageManager.queryIntentActivities(new Intent(f47500b).setData(Uri.fromParts(io.sentry.protocol.z.b.f306542i, "com.example", null)), 0).iterator();
        while (it.hasNext()) {
            String str2 = it.next().activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    return str;
                }
                str = str2;
            }
        }
        return str;
    }

    @NonNull
    public static t1<Integer> c(@NonNull Context context) {
        androidx.concurrent.futures.e<Integer> eVarN = androidx.concurrent.futures.e.N();
        if (!t0.a(context)) {
            eVarN.E(0);
            return eVarN;
        }
        if (!a(context.getPackageManager())) {
            eVarN.E(1);
            return eVarN;
        }
        int i10 = context.getApplicationInfo().targetSdkVersion;
        if (i10 < 30) {
            eVarN.E(0);
            return eVarN;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            if (a.a(context)) {
                eVarN.E(Integer.valueOf(i10 >= 31 ? 5 : 4));
                return eVarN;
            }
            eVarN.E(2);
            return eVarN;
        }
        if (i11 == 30) {
            eVarN.E(Integer.valueOf(a.a(context) ? 4 : 2));
            return eVarN;
        }
        final n0 n0Var = new n0(context);
        eVarN.m0(new Runnable() { // from class: androidx.core.content.g0
            @Override // java.lang.Runnable
            public final void run() {
                n0Var.b();
            }
        }, Executors.newSingleThreadExecutor());
        n0Var.a(eVarN);
        return eVarN;
    }
}
