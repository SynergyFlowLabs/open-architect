package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.v0;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f47162a = "NavUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f47163b = "android.support.PARENT_ACTIVITY";

    private s() {
    }

    @androidx.annotation.p0
    public static Intent a(@NonNull Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String strD = d(activity);
        if (strD == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, strD);
        try {
            return e(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @androidx.annotation.p0
    public static Intent b(@NonNull Context context, @NonNull ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strE = e(context, componentName);
        if (strE == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strE);
        return e(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    @androidx.annotation.p0
    public static Intent c(@NonNull Context context, @NonNull Class<?> cls) throws PackageManager.NameNotFoundException {
        String strE = e(context, new ComponentName(context, cls));
        if (strE == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(context, strE);
        return e(context, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
    }

    @androidx.annotation.p0
    public static String d(@NonNull Activity activity) {
        try {
            return e(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @androidx.annotation.p0
    public static String e(@NonNull Context context, @NonNull ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 269222528);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle != null && (string = bundle.getString(f47163b)) != null) {
            if (string.charAt(0) != '.') {
                return string;
            }
            return context.getPackageName() + string;
        }
        return null;
    }

    public static void f(@NonNull Activity activity) {
        Intent intentA = a(activity);
        if (intentA != null) {
            g(activity, intentA);
            return;
        }
        throw new IllegalArgumentException("Activity " + activity.getClass().getSimpleName() + " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
    }

    @v0(expression = "sourceActivity.navigateUpTo(upIntent)")
    @Deprecated
    public static void g(@NonNull Activity activity, @NonNull Intent intent) {
        activity.navigateUpTo(intent);
    }

    @v0(expression = "sourceActivity.shouldUpRecreateTask(targetIntent)")
    @Deprecated
    public static boolean h(@NonNull Activity activity, @NonNull Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
}
