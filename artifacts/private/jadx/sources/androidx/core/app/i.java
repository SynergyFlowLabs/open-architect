package androidx.core.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"PrivateConstructorForUtilityClass"})
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f47037a = "android.support.AppLaunchChecker";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f47038b = "startedFromLauncher";

    @Deprecated
    public i() {
    }

    public static boolean a(@NonNull Context context) {
        return context.getSharedPreferences(f47037a, 0).getBoolean(f47038b, false);
    }

    public static void b(@NonNull Activity activity) {
        Intent intent;
        SharedPreferences sharedPreferences = activity.getSharedPreferences(f47037a, 0);
        if (sharedPreferences.getBoolean(f47038b, false) || (intent = activity.getIntent()) == null || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return;
        }
        if (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory(androidx.core.content.f.f47497e)) {
            sharedPreferences.edit().putBoolean(f47038b, true).apply();
        }
    }
}
