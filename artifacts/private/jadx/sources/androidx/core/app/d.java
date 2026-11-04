package androidx.core.app;

import android.app.ActivityManager;
import androidx.annotation.NonNull;
import androidx.annotation.v0;

/* JADX INFO: loaded from: classes2.dex */
public final class d {
    private d() {
    }

    @v0(expression = "activityManager.isLowRamDevice()")
    @Deprecated
    public static boolean a(@NonNull ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }
}
