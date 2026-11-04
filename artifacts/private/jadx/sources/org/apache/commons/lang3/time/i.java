package org.apache.commons.lang3.time;

import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes14.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f337498a = Pattern.compile("^(?:(?i)GMT)?([+-])?(\\d\\d?)?(:?(\\d\\d?))?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final TimeZone f337499b = new k(false, 0, 0);

    private i() {
    }

    public static TimeZone a() {
        return f337499b;
    }

    public static TimeZone b(String str) {
        if (!org.locationtech.jts.io.gml2.a.f338505w.equals(str) && !"UTC".equals(str)) {
            Matcher matcher = f337498a.matcher(str);
            if (!matcher.matches()) {
                return null;
            }
            int i10 = 0 ^ 2;
            int iD = d(matcher.group(2));
            int iD2 = d(matcher.group(4));
            return (iD == 0 && iD2 == 0) ? f337499b : new k(e(matcher.group(1)), iD, iD2);
        }
        return f337499b;
    }

    public static TimeZone c(String str) {
        TimeZone timeZoneB = b(str);
        return timeZoneB != null ? timeZoneB : TimeZone.getTimeZone(str);
    }

    private static int d(String str) {
        if (str != null) {
            return Integer.parseInt(str);
        }
        return 0;
    }

    private static boolean e(String str) {
        return str != null && str.charAt(0) == '-';
    }
}
