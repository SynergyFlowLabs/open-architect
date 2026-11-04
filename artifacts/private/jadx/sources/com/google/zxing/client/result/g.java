package com.google.zxing.client.result;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends q {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f130184m = Pattern.compile("P(?:(\\d+)W)?(?:(\\d+)D)?(?:T(?:(\\d+)H)?(?:(\\d+)M)?(?:(\\d+)S)?)?");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long[] f130185n = {com.planner5d.library.services.utility.i0.f225269f, 86400000, 3600000, 60000, 1000};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Pattern f130186o = Pattern.compile("[0-9]{8}(T[0-9]{6}Z?)?");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f130187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f130188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f130189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f130190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f130191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f130192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f130193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String[] f130194i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f130195j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final double f130196k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final double f130197l;

    public g(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, String str7, double d10, double d11) {
        super(r.CALENDAR);
        this.f130187b = str;
        try {
            long jS = s(str2);
            this.f130188c = jS;
            if (str3 == null) {
                long jU = u(str4);
                this.f130190e = jU < 0 ? -1L : jS + jU;
            } else {
                try {
                    this.f130190e = s(str3);
                } catch (ParseException e10) {
                    throw new IllegalArgumentException(e10.toString());
                }
            }
            int length = str2.length();
            boolean z10 = false;
            this.f130189d = length == 8;
            if (str3 != null && str3.length() == 8) {
                z10 = true;
            }
            this.f130191f = z10;
            this.f130192g = str5;
            this.f130193h = str6;
            this.f130194i = strArr;
            this.f130195j = str7;
            this.f130196k = d10;
            this.f130197l = d11;
        } catch (ParseException e11) {
            throw new IllegalArgumentException(e11.toString());
        }
    }

    private static String e(boolean z10, long j10) {
        if (j10 < 0) {
            return null;
        }
        return (z10 ? DateFormat.getDateInstance(2) : DateFormat.getDateTimeInstance(2, 2)).format(Long.valueOf(j10));
    }

    private static long s(String str) throws ParseException {
        if (!f130186o.matcher(str).matches()) {
            throw new ParseException(str, 0);
        }
        if (str.length() == 8) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(org.apache.commons.lang3.time.m.f337525a));
            return simpleDateFormat.parse(str).getTime();
        }
        if (str.length() != 16 || str.charAt(15) != 'Z') {
            return t(str);
        }
        long jT = t(str.substring(0, 15));
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        long j10 = jT + ((long) gregorianCalendar.get(15));
        gregorianCalendar.setTime(new Date(j10));
        return j10 + ((long) gregorianCalendar.get(16));
    }

    private static long t(String str) throws ParseException {
        return new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH).parse(str).getTime();
    }

    private static long u(CharSequence charSequence) {
        if (charSequence == null) {
            return -1L;
        }
        Matcher matcher = f130184m.matcher(charSequence);
        if (!matcher.matches()) {
            return -1L;
        }
        long j10 = 0;
        int i10 = 0;
        while (true) {
            long[] jArr = f130185n;
            if (i10 >= jArr.length) {
                return j10;
            }
            int i11 = i10 + 1;
            String strGroup = matcher.group(i11);
            if (strGroup != null) {
                j10 += jArr[i10] * ((long) Integer.parseInt(strGroup));
            }
            i10 = i11;
        }
    }

    @Override // com.google.zxing.client.result.q
    public String a() {
        StringBuilder sb2 = new StringBuilder(100);
        q.c(this.f130187b, sb2);
        q.c(e(this.f130189d, this.f130188c), sb2);
        q.c(e(this.f130191f, this.f130190e), sb2);
        q.c(this.f130192g, sb2);
        q.c(this.f130193h, sb2);
        q.d(this.f130194i, sb2);
        q.c(this.f130195j, sb2);
        return sb2.toString();
    }

    public String[] f() {
        return this.f130194i;
    }

    public String g() {
        return this.f130195j;
    }

    @Deprecated
    public Date h() {
        if (this.f130190e < 0) {
            return null;
        }
        return new Date(this.f130190e);
    }

    public long i() {
        return this.f130190e;
    }

    public double j() {
        return this.f130196k;
    }

    public String k() {
        return this.f130192g;
    }

    public double l() {
        return this.f130197l;
    }

    public String m() {
        return this.f130193h;
    }

    @Deprecated
    public Date n() {
        return new Date(this.f130188c);
    }

    public long o() {
        return this.f130188c;
    }

    public String p() {
        return this.f130187b;
    }

    public boolean q() {
        return this.f130191f;
    }

    public boolean r() {
        return this.f130189d;
    }
}
