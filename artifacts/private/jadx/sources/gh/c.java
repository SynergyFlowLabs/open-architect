package gh;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import ih.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class c {
    @Nullable
    public static final Bundle a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)) : context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNull(applicationInfo);
            return applicationInfo.metaData;
        } catch (Exception e10) {
            e.a.b(eh.d.f274883c.w(), "Failed to get ApplicationInfo with error: " + e10.getMessage(), null, null, 6, null);
            return null;
        }
    }
}
