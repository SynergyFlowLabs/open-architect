package androidx.media3.exoplayer.drm;

import android.util.Pair;
import androidx.media3.common.util.b1;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f63758a = "LicenseDurationRemaining";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f63759b = "PlaybackDurationRemaining";

    private x0() {
    }

    private static long a(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    @androidx.annotation.p0
    public static Pair<Long, Long> b(m mVar) {
        Map<String, String> mapU = mVar.U();
        if (mapU == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a(mapU, "LicenseDurationRemaining")), Long.valueOf(a(mapU, "PlaybackDurationRemaining")));
    }
}
