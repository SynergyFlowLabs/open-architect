package com.google.api.client.util;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f116124d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final TimeZone f116125e = TimeZone.getTimeZone(org.apache.commons.lang3.time.m.f337525a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f116126f = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d+)?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f116127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f116128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f116129c;

    public p(Date date, TimeZone timeZone) {
        this(false, date.getTime(), timeZone == null ? null : Integer.valueOf(timeZone.getOffset(date.getTime()) / 60000));
    }

    private static void a(StringBuilder sb2, int i10, int i11) {
        if (i10 < 0) {
            sb2.append(org.apache.commons.codec.language.l.f335457d);
            i10 = -i10;
        }
        int i12 = i10;
        while (i12 > 0) {
            i12 /= 10;
            i11--;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            sb2.append(org.locationtech.jts.geom.l.f338160j);
        }
        if (i10 != 0) {
            sb2.append(i10);
        }
    }

    public static p e(String str) throws NumberFormatException {
        int i10;
        int i11;
        int i12;
        int i13;
        Integer numValueOf;
        int i14;
        Matcher matcher = f116126f.matcher(str);
        if (!matcher.matches()) {
            throw new NumberFormatException("Invalid date/time format: " + str);
        }
        int i15 = Integer.parseInt(matcher.group(1));
        int i16 = Integer.parseInt(matcher.group(2)) - 1;
        int i17 = Integer.parseInt(matcher.group(3));
        boolean z10 = matcher.group(4) != null;
        String strGroup = matcher.group(9);
        boolean z11 = strGroup != null;
        if (z11 && !z10) {
            throw new NumberFormatException("Invalid date/time format, cannot specify time zone shift without specifying time: " + str);
        }
        if (z10) {
            int i18 = Integer.parseInt(matcher.group(5));
            i12 = Integer.parseInt(matcher.group(6));
            i13 = Integer.parseInt(matcher.group(7));
            if (matcher.group(8) != null) {
                i10 = (int) (((double) Integer.parseInt(matcher.group(8).substring(1))) / Math.pow(10.0d, matcher.group(8).substring(1).length() - 3));
            } else {
                i10 = 0;
            }
            i11 = i18;
        } else {
            z10 = z10;
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f116125e);
        gregorianCalendar.set(i15, i16, i17, i11, i12, i13);
        gregorianCalendar.set(14, i10);
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        if (z10 && z11) {
            if (Character.toUpperCase(strGroup.charAt(0)) == 'Z') {
                i14 = 0;
            } else {
                int i19 = (Integer.parseInt(matcher.group(11)) * 60) + Integer.parseInt(matcher.group(12));
                if (matcher.group(10).charAt(0) == '-') {
                    i19 = -i19;
                }
                i14 = i19;
                timeInMillis -= ((long) i14) * 60000;
            }
            numValueOf = Integer.valueOf(i14);
        } else {
            numValueOf = null;
        }
        return new p(!z10, timeInMillis, numValueOf);
    }

    public int b() {
        return this.f116129c;
    }

    public long c() {
        return this.f116127a;
    }

    public boolean d() {
        return this.f116128b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f116128b == pVar.f116128b && this.f116127a == pVar.f116127a && this.f116129c == pVar.f116129c;
    }

    public String f() {
        StringBuilder sb2 = new StringBuilder();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f116125e);
        gregorianCalendar.setTimeInMillis(this.f116127a + (((long) this.f116129c) * 60000));
        a(sb2, gregorianCalendar.get(1), 4);
        sb2.append(org.apache.commons.codec.language.l.f335457d);
        a(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append(org.apache.commons.codec.language.l.f335457d);
        a(sb2, gregorianCalendar.get(5), 2);
        if (!this.f116128b) {
            sb2.append(org.locationtech.jts.geom.l.f338158h);
            a(sb2, gregorianCalendar.get(11), 2);
            sb2.append(AbstractJsonLexerKt.COLON);
            a(sb2, gregorianCalendar.get(12), 2);
            sb2.append(AbstractJsonLexerKt.COLON);
            a(sb2, gregorianCalendar.get(13), 2);
            if (gregorianCalendar.isSet(14)) {
                sb2.append('.');
                a(sb2, gregorianCalendar.get(14), 3);
            }
            int i10 = this.f116129c;
            if (i10 == 0) {
                sb2.append('Z');
            } else {
                if (i10 > 0) {
                    sb2.append('+');
                } else {
                    sb2.append(org.apache.commons.codec.language.l.f335457d);
                    i10 = -i10;
                }
                a(sb2, i10 / 60, 2);
                sb2.append(AbstractJsonLexerKt.COLON);
                a(sb2, i10 % 60, 2);
            }
        }
        return sb2.toString();
    }

    public int hashCode() {
        return Arrays.hashCode(new long[]{this.f116127a, this.f116128b ? 1L : 0L, this.f116129c});
    }

    public String toString() {
        return f();
    }

    public p(long j10) {
        this(false, j10, null);
    }

    public p(Date date) {
        this(date.getTime());
    }

    public p(long j10, int i10) {
        this(false, j10, Integer.valueOf(i10));
    }

    public p(boolean z10, long j10, Integer num) {
        int offset;
        this.f116128b = z10;
        this.f116127a = j10;
        if (z10) {
            offset = 0;
        } else {
            offset = num == null ? TimeZone.getDefault().getOffset(j10) / 60000 : num.intValue();
        }
        this.f116129c = offset;
    }

    public p(String str) {
        p pVarE = e(str);
        this.f116128b = pVarE.f116128b;
        this.f116127a = pVarE.f116127a;
        this.f116129c = pVarE.f116129c;
    }
}
