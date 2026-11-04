package androidx.media2.exoplayer.external.drm;

import android.util.Pair;
import androidx.annotation.b1;
import androidx.annotation.p0;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f53835a = "LicenseDurationRemaining";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f53836b = "PlaybackDurationRemaining";

    private f0() {
    }

    private static long a(Map<String, String> keyStatus, String property) {
        if (keyStatus == null) {
            return -9223372036854775807L;
        }
        try {
            String str = keyStatus.get(property);
            if (str != null) {
                return Long.parseLong(str);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    @p0
    public static Pair<Long, Long> b(p<?> drmSession) {
        Map<String, String> mapU = drmSession.U();
        if (mapU == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a(mapU, "LicenseDurationRemaining")), Long.valueOf(a(mapU, "PlaybackDurationRemaining")));
    }
}
