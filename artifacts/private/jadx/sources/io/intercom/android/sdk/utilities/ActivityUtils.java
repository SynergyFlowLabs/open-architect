package io.intercom.android.sdk.utilities;

import android.app.Activity;
import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.Intercom;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class ActivityUtils {
    public static final int $stable;

    @NotNull
    public static final ActivityUtils INSTANCE = new ActivityUtils();

    @NotNull
    private static final String[] INTERCOM_PACKAGES;
    private static final String PACKAGE_NAME;

    static {
        String name = Intercom.class.getPackage().getName();
        PACKAGE_NAME = name;
        INTERCOM_PACKAGES = new String[]{name};
        $stable = 8;
    }

    private ActivityUtils() {
    }

    @n
    public static final boolean isHostActivity(@Nullable Activity activity) {
        if (activity == null) {
            return false;
        }
        ActivityUtils activityUtils = INSTANCE;
        String name = activity.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return activityUtils.isInHostAppPackage(name);
    }

    private final boolean isInHostAppPackage(String str) {
        for (String str2 : INTERCOM_PACKAGES) {
            Intrinsics.checkNotNull(str2);
            if (StringsKt.u2(str, str2, false, 2, null)) {
                return false;
            }
        }
        return true;
    }
}
