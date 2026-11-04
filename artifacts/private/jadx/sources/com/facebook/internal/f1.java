package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Looper;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f1 f99837a = new f1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f99838b = f1.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f99839c = "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f99840d = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f99841e = "A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f99842f = "com.facebook.app.FacebookContentProvider";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f99843g = "fbconnect://cct.";

    private f1() {
    }

    @oj.n
    public static final void a(@NotNull Collection<String> container, @NotNull String name) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        for (String str : container) {
            if (str == null) {
                throw new NullPointerException("Container '" + name + "' cannot contain null values");
            }
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException(("Container '" + name + "' cannot contain empty values").toString());
            }
        }
    }

    @oj.n
    public static final <T> void b(@NotNull Collection<? extends T> container, @NotNull String name) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator<? extends T> it = container.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("Container '" + name + "' cannot contain null values");
            }
        }
    }

    @oj.n
    @NotNull
    public static final String c() {
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        String strO = com.facebook.g0.o();
        if (strO != null) {
            return strO;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.");
    }

    @oj.n
    public static final boolean d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return n(context, "android.permission.BLUETOOTH") && n(context, "android.permission.BLUETOOTH_ADMIN");
    }

    @oj.n
    public static final boolean e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return n(context, "android.permission.CHANGE_WIFI_STATE");
    }

    @oj.n
    @NotNull
    public static final String f() {
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        String strV = com.facebook.g0.v();
        if (strV != null) {
            return strV;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token. Please follow https://developers.facebook.com/docs/android/getting-started/#client-access-token to get the token and fill it in AndroidManifest.xml");
    }

    @oj.n
    public static final void g(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strC = c();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            String strStringPlus = Intrinsics.stringPlus(f99842f, strC);
            if (packageManager.resolveContentProvider(strStringPlus, 0) == null) {
                q1 q1Var = q1.f312784a;
                String str = String.format(f99841e, Arrays.copyOf(new Object[]{strStringPlus}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
                throw new IllegalStateException(str.toString());
            }
        }
    }

    @oj.n
    public static final boolean h(@NotNull Context context, @NotNull String redirectURI) {
        List<ResolveInfo> listQueryIntentActivities;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(redirectURI, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(redirectURI));
            listQueryIntentActivities = packageManager.queryIntentActivities(intent, 64);
        } else {
            listQueryIntentActivities = null;
        }
        if (listQueryIntentActivities == null) {
            return false;
        }
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (!Intrinsics.areEqual(activityInfo.name, "com.facebook.CustomTabActivity") || !Intrinsics.areEqual(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z10 = true;
        }
        return z10;
    }

    @oj.n
    public static final void i(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        j(context, true);
    }

    @oj.n
    @e.a({"WrongConstant"})
    public static final void j(@NotNull Context context, boolean z10) {
        ActivityInfo activityInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            } catch (PackageManager.NameNotFoundException unused) {
                activityInfo = null;
            }
        } else {
            activityInfo = null;
        }
        if (activityInfo == null && z10) {
            throw new IllegalStateException(f99840d);
        }
    }

    @oj.n
    public static final void k(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = 5 ^ 1;
        l(context, true);
    }

    @oj.n
    public static final void l(@NotNull Context context, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1 && z10) {
            throw new IllegalStateException(f99839c);
        }
    }

    @oj.n
    public static final boolean m(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return n(context, "android.permission.ACCESS_COARSE_LOCATION") || n(context, "android.permission.ACCESS_FINE_LOCATION");
    }

    @oj.n
    public static final boolean n(@NotNull Context context, @NotNull String permission) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return context.checkCallingOrSelfPermission(permission) == 0;
    }

    @oj.n
    public static final boolean o(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return n(context, "android.permission.ACCESS_WIFI_STATE");
    }

    @oj.n
    public static final void p(@NotNull String arg, @NotNull String name) {
        Intrinsics.checkNotNullParameter(arg, "arg");
        Intrinsics.checkNotNullParameter(name, "name");
        if (arg.length() > 0) {
            return;
        }
        throw new IllegalArgumentException(("Argument '" + name + "' cannot be empty").toString());
    }

    @oj.n
    public static final <T> void q(@NotNull Collection<? extends T> container, @NotNull String name) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        if (container.isEmpty()) {
            throw new IllegalArgumentException(("Container '" + name + "' cannot be empty").toString());
        }
    }

    @oj.n
    public static final <T> void r(@NotNull Collection<? extends T> container, @NotNull String name) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        b(container, name);
        q(container, name);
    }

    @oj.n
    public static final void s(@Nullable Object obj, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (obj != null) {
            return;
        }
        throw new NullPointerException("Argument '" + name + "' cannot be null");
    }

    @oj.n
    @NotNull
    public static final String t(@Nullable String str, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (str != null && str.length() > 0) {
            return str;
        }
        throw new IllegalArgumentException(("Argument '" + name + "' cannot be null or empty").toString());
    }

    @oj.n
    public static final void u(@Nullable Object obj, @NotNull String name, @NotNull Object... values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        int length = values.length;
        int i10 = 0;
        while (i10 < length) {
            Object obj2 = values[i10];
            i10++;
            if (Intrinsics.areEqual(obj2, obj)) {
                return;
            }
        }
        throw new IllegalArgumentException("Argument '" + name + "' was not one of the allowed values");
    }

    @oj.n
    public static final void v() {
        if (!Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            throw new com.facebook.u("This method should be called from the UI thread");
        }
    }

    @oj.n
    public static final void w() {
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        if (!com.facebook.g0.N()) {
            throw new com.facebook.h0("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}
