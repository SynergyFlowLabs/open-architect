package androidx.media3.datasource;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62499a = "HttpUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f62500b = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f62501c = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    private g1() {
    }

    @androidx.annotation.p0
    public static String a(long j10, long j11) {
        if (j10 == 0 && j11 == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("bytes=");
        sb2.append(j10);
        sb2.append("-");
        if (j11 != -1) {
            sb2.append((j10 + j11) - 1);
        }
        return sb2.toString();
    }

    public static long b(@androidx.annotation.p0 String str, @androidx.annotation.p0 String str2) {
        long jMax;
        if (TextUtils.isEmpty(str)) {
            jMax = -1;
        } else {
            try {
                jMax = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                androidx.media3.common.util.z.d(f62499a, "Unexpected Content-Length [" + str + "]");
                jMax = -1;
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            Matcher matcher = f62500b.matcher(str2);
            if (matcher.matches()) {
                try {
                    long j10 = (Long.parseLong((String) androidx.media3.common.util.a.g(matcher.group(2))) - Long.parseLong((String) androidx.media3.common.util.a.g(matcher.group(1)))) + 1;
                    if (jMax < 0) {
                        jMax = j10;
                    } else if (jMax != j10) {
                        androidx.media3.common.util.z.n(f62499a, "Inconsistent headers [" + str + "] [" + str2 + "]");
                        jMax = Math.max(jMax, j10);
                    }
                } catch (NumberFormatException unused2) {
                    androidx.media3.common.util.z.d(f62499a, "Unexpected Content-Range [" + str2 + "]");
                }
            }
        }
        return jMax;
    }

    public static long c(@androidx.annotation.p0 String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f62501c.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) androidx.media3.common.util.a.g(matcher.group(1)));
        }
        return -1L;
    }
}
