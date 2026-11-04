package androidx.media3.extractor.text.webvtt;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.o0;
import androidx.media3.common.v0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f68970a = Pattern.compile("^NOTE([ \t].*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f68971b = "WEBVTT";

    private h() {
    }

    @p0
    public static Matcher a(o0 o0Var) {
        String strU;
        while (true) {
            String strU2 = o0Var.u();
            if (strU2 == null) {
                return null;
            }
            if (f68970a.matcher(strU2).matches()) {
                do {
                    strU = o0Var.u();
                    if (strU == null) {
                        break;
                    }
                } while (!strU.isEmpty());
            } else {
                Matcher matcher = e.f68919f.matcher(strU2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(o0 o0Var) {
        String strU = o0Var.u();
        return strU != null && strU.startsWith(f68971b);
    }

    public static float c(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) {
        String[] strArrM2 = k1.m2(str, "\\.");
        long j10 = 0;
        for (String str2 : k1.l2(strArrM2[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrM2.length == 2) {
            String strTrim = strArrM2[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: " + strTrim);
            }
            j11 += Long.parseLong(strTrim);
        }
        return j11 * 1000;
    }

    public static void e(o0 o0Var) throws v0 {
        int iF = o0Var.f();
        if (b(o0Var)) {
            return;
        }
        o0Var.a0(iF);
        throw v0.a("Expected WEBVTT. Got " + o0Var.u(), null);
    }
}
