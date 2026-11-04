package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f77261a = androidx.work.v.i("PackageManagerHelper");

    private r() {
    }

    private static int a(@NonNull Context context, @NonNull String className) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, className));
    }

    private static boolean b(int setting, boolean defaults) {
        if (setting == 0) {
            return defaults;
        }
        return setting == 1;
    }

    public static boolean c(@NonNull Context context, @NonNull Class<?> klazz) {
        return b(a(context, klazz.getName()), false);
    }

    public static boolean d(@NonNull Context context, @NonNull String className) {
        return a(context, className) == 1;
    }

    public static void e(@NonNull Context context, @NonNull Class<?> klazz, boolean enabled) {
        try {
            if (enabled == b(a(context, klazz.getName()), false)) {
                androidx.work.v.e().a(f77261a, "Skipping component enablement for " + klazz.getName());
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, klazz.getName()), enabled ? 1 : 2, 1);
            androidx.work.v vVarE = androidx.work.v.e();
            String str = f77261a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(klazz.getName());
            sb2.append(" ");
            sb2.append(enabled ? "enabled" : "disabled");
            vVarE.a(str, sb2.toString());
        } catch (Exception e10) {
            androidx.work.v vVarE2 = androidx.work.v.e();
            String str2 = f77261a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(klazz.getName());
            sb3.append("could not be ");
            sb3.append(enabled ? "enabled" : "disabled");
            vVarE2.b(str2, sb3.toString(), e10);
        }
    }
}
