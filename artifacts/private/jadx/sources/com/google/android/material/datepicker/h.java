package com.google.android.material.datepicker;

import android.content.Context;
import androidx.annotation.p0;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
class h {
    private h() {
    }

    static androidx.core.util.p<String, String> a(@p0 Long l10, @p0 Long l11) {
        return b(l10, l11, null);
    }

    static androidx.core.util.p<String, String> b(@p0 Long l10, @p0 Long l11, @p0 SimpleDateFormat simpleDateFormat) {
        if (l10 == null && l11 == null) {
            return androidx.core.util.p.a(null, null);
        }
        if (l10 == null) {
            return androidx.core.util.p.a(null, d(l11.longValue(), simpleDateFormat));
        }
        if (l11 == null) {
            return androidx.core.util.p.a(d(l10.longValue(), simpleDateFormat), null);
        }
        Calendar calendarV = v.v();
        Calendar calendarX = v.x();
        calendarX.setTimeInMillis(l10.longValue());
        Calendar calendarX2 = v.x();
        calendarX2.setTimeInMillis(l11.longValue());
        if (simpleDateFormat != null) {
            return androidx.core.util.p.a(simpleDateFormat.format(new Date(l10.longValue())), simpleDateFormat.format(new Date(l11.longValue())));
        }
        if (calendarX.get(1) == calendarX2.get(1)) {
            return calendarX.get(1) == calendarV.get(1) ? androidx.core.util.p.a(g(l10.longValue(), Locale.getDefault()), g(l11.longValue(), Locale.getDefault())) : androidx.core.util.p.a(g(l10.longValue(), Locale.getDefault()), n(l11.longValue(), Locale.getDefault()));
        }
        return androidx.core.util.p.a(n(l10.longValue(), Locale.getDefault()), n(l11.longValue(), Locale.getDefault()));
    }

    static String c(long j10) {
        return d(j10, null);
    }

    static String d(long j10, @p0 SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j10));
        }
        return q(j10) ? f(j10) : m(j10);
    }

    static String e(Context context, long j10, boolean z10, boolean z11, boolean z12) {
        String strJ = j(j10);
        if (z10) {
            strJ = String.format(context.getString(r6.a.m.I1), strJ);
        }
        if (z11) {
            return String.format(context.getString(r6.a.m.B1), strJ);
        }
        return z12 ? String.format(context.getString(r6.a.m.f360989n1), strJ) : strJ;
    }

    static String f(long j10) {
        return g(j10, Locale.getDefault());
    }

    static String g(long j10, Locale locale) {
        return v.c(locale).format(new Date(j10));
    }

    static String h(long j10) {
        return i(j10, Locale.getDefault());
    }

    static String i(long j10, Locale locale) {
        return v.p(locale).format(new Date(j10));
    }

    static String j(long j10) {
        return q(j10) ? h(j10) : o(j10);
    }

    static String k(Context context, int i10) {
        return v.v().get(1) == i10 ? String.format(context.getString(r6.a.m.f361004s1), Integer.valueOf(i10)) : String.format(context.getString(r6.a.m.f361007t1), Integer.valueOf(i10));
    }

    static String l(long j10) {
        return v.A(Locale.getDefault()).format(new Date(j10));
    }

    static String m(long j10) {
        return n(j10, Locale.getDefault());
    }

    static String n(long j10, Locale locale) {
        return v.z(locale).format(new Date(j10));
    }

    static String o(long j10) {
        return p(j10, Locale.getDefault());
    }

    static String p(long j10, Locale locale) {
        return v.B(locale).format(new Date(j10));
    }

    private static boolean q(long j10) {
        Calendar calendarV = v.v();
        Calendar calendarX = v.x();
        calendarX.setTimeInMillis(j10);
        return calendarV.get(1) == calendarX.get(1);
    }
}
