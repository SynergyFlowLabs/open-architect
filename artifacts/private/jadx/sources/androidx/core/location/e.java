package androidx.core.location;

import android.location.Location;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class e {
    public static final double a(@NotNull Location location) {
        return location.getLatitude();
    }

    public static final double b(@NotNull Location location) {
        return location.getLongitude();
    }
}
