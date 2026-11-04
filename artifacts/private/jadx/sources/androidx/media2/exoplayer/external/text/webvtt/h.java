package androidx.media2.exoplayer.external.text.webvtt;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.k0;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.util.x;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f57031a = Pattern.compile("^NOTE(( |\t).*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f57032b = "WEBVTT";

    private h() {
    }

    public static Matcher a(x input) {
        String strN;
        while (true) {
            String strN2 = input.n();
            if (strN2 == null) {
                return null;
            }
            if (f57031a.matcher(strN2).matches()) {
                do {
                    strN = input.n();
                    if (strN == null) {
                        break;
                    }
                } while (!strN.isEmpty());
            } else {
                Matcher matcher = f.f56990b.matcher(strN2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(x input) {
        String strN = input.n();
        return strN != null && strN.startsWith(f57032b);
    }

    public static float c(String s10) throws NumberFormatException {
        if (!s10.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        int i10 = 3 >> 0;
        return Float.parseFloat(s10.substring(0, s10.length() - 1)) / 100.0f;
    }

    public static long d(String timestamp) throws NumberFormatException {
        String[] strArrP0 = q0.P0(timestamp, "\\.");
        long j10 = 0;
        for (String str : q0.O0(strArrP0[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(str);
        }
        long j11 = j10 * 1000;
        if (strArrP0.length == 2) {
            j11 += Long.parseLong(strArrP0[1]);
        }
        return j11 * 1000;
    }

    public static void e(x input) throws k0 {
        int iC = input.c();
        if (b(input)) {
            return;
        }
        input.Q(iC);
        String strValueOf = String.valueOf(input.n());
        throw new k0(strValueOf.length() != 0 ? "Expected WEBVTT. Got ".concat(strValueOf) : new String("Expected WEBVTT. Got "));
    }
}
