package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class UtilsKt {
    @NotNull
    public static final Locale getLocaleCompat(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        Intrinsics.checkNotNull(locale);
        return locale;
    }

    public static final int getRegionCode(@NotNull Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getInteger(i10);
    }

    public static final int getServerRegionFromManifest(@NotNull Context context) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null) {
            return bundle.getInt("io.intercom.android.sdk.server.region");
        }
        return 0;
    }

    @Nullable
    public static final String readHostFromManifest(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                return bundle.getString("io.intercom.android.sdk.host");
            }
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
