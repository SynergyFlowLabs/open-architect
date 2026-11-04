package org.apache.commons.lang3.time;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.c0;

/* JADX INFO: loaded from: classes14.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f337378a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f337379b = 60000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f337380c = 3600000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f337381d = 86400000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f337382e = 1001;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[][] f337383f = {new int[]{14}, new int[]{13}, new int[]{12}, new int[]{11, 10}, new int[]{5, 5, 9}, new int[]{2, 1001}, new int[]{1}, new int[]{0}};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f337384g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f337385h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f337386i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f337387j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f337388k = 5;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f337389l = 6;

    static class a implements Iterator<Calendar> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Calendar f337390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Calendar f337391b;

        a(Calendar calendar, Calendar calendar2) {
            this.f337390a = calendar2;
            this.f337391b = calendar;
            calendar.add(5, -1);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Calendar next() {
            if (this.f337391b.equals(this.f337390a)) {
                throw new NoSuchElementException();
            }
            this.f337391b.add(5, 1);
            return (Calendar) this.f337391b.clone();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f337391b.before(this.f337390a);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private enum b {
        TRUNCATE,
        ROUND,
        CEILING
    }

    public static boolean A(Calendar calendar, Calendar calendar2) {
        if (calendar == null || calendar2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        return calendar.getTime().getTime() == calendar2.getTime().getTime();
    }

    public static boolean B(Date date, Date date2) {
        if (date == null || date2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        return date.getTime() == date2.getTime();
    }

    public static boolean C(Calendar calendar, Calendar calendar2) {
        if (calendar == null || calendar2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        return calendar.get(14) == calendar2.get(14) && calendar.get(13) == calendar2.get(13) && calendar.get(12) == calendar2.get(12) && calendar.get(11) == calendar2.get(11) && calendar.get(6) == calendar2.get(6) && calendar.get(1) == calendar2.get(1) && calendar.get(0) == calendar2.get(0) && calendar.getClass() == calendar2.getClass();
    }

    public static Iterator<?> D(Object obj, int i10) {
        if (obj == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        if (obj instanceof Date) {
            return F((Date) obj, i10);
        }
        if (obj instanceof Calendar) {
            return E((Calendar) obj, i10);
        }
        throw new ClassCastException("Could not iterate based on " + obj);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    /* JADX WARN: Code duplicated, block: B:26:0x0085  */
    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0096 A[LOOP:0: B:31:0x0090->B:33:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a2 A[LOOP:1: B:34:0x009a->B:36:0x00a2, LOOP_END] */
    public static Iterator<Calendar> E(Calendar calendar, int i10) {
        Calendar calendarZ;
        Calendar calendarZ2;
        int i11;
        if (calendar == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        int i12 = 2;
        i12 = 1;
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
                calendarZ = Z(calendar, 5);
                calendarZ2 = Z(calendar, 5);
                if (i10 == 2) {
                    i11 = 1;
                } else if (i10 == 3) {
                    i12 = calendar.get(7);
                    i11 = i12 - 1;
                } else if (i10 != 4) {
                    i11 = 7;
                } else {
                    int i13 = calendar.get(7) - 3;
                    i11 = calendar.get(7) + 3;
                    i12 = i13;
                }
                if (i12 < 1) {
                    i12 += 7;
                }
                if (i12 > 7) {
                    i12 -= 7;
                }
                if (i11 < 1) {
                    i11 += 7;
                }
                if (i11 > 7) {
                    i11 -= 7;
                }
                while (calendarZ.get(7) != i12) {
                    calendarZ.add(5, -1);
                }
                while (calendarZ2.get(7) != i11) {
                    calendarZ2.add(5, 1);
                }
                return new a(calendarZ, calendarZ2);
            case 5:
            case 6:
                Calendar calendarZ3 = Z(calendar, 2);
                Calendar calendar2 = (Calendar) calendarZ3.clone();
                calendar2.add(2, 1);
                calendar2.add(5, -1);
                int i14 = 3 & 6;
                if (i10 == 6) {
                    calendarZ2 = calendar2;
                    calendarZ = calendarZ3;
                    i11 = 1;
                    if (i12 < 1) {
                        i12 += 7;
                    }
                    if (i12 > 7) {
                        i12 -= 7;
                    }
                    if (i11 < 1) {
                        i11 += 7;
                    }
                    if (i11 > 7) {
                        i11 -= 7;
                    }
                    while (calendarZ.get(7) != i12) {
                        calendarZ.add(5, -1);
                    }
                    while (calendarZ2.get(7) != i11) {
                        calendarZ2.add(5, 1);
                    }
                    return new a(calendarZ, calendarZ2);
                }
                calendarZ2 = calendar2;
                calendarZ = calendarZ3;
                i11 = 7;
                if (i12 < 1) {
                    i12 += 7;
                }
                if (i12 > 7) {
                    i12 -= 7;
                }
                if (i11 < 1) {
                    i11 += 7;
                }
                if (i11 > 7) {
                    i11 -= 7;
                }
                while (calendarZ.get(7) != i12) {
                    calendarZ.add(5, -1);
                }
                while (calendarZ2.get(7) != i11) {
                    calendarZ2.add(5, 1);
                }
                return new a(calendarZ, calendarZ2);
            default:
                throw new IllegalArgumentException("The range style " + i10 + " is not valid.");
        }
    }

    public static Iterator<Calendar> F(Date date, int i10) {
        g0(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return E(calendar, i10);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00d2  */
    private static void G(Calendar calendar, int i10, b bVar) {
        char c10;
        int i11;
        boolean z10;
        if (calendar.get(1) > 280000000) {
            throw new ArithmeticException("Calendar value too large for accurate calculations");
        }
        if (i10 == 14) {
            return;
        }
        Date time = calendar.getTime();
        long time2 = time.getTime();
        int i12 = calendar.get(14);
        b bVar2 = b.TRUNCATE;
        if (bVar2 == bVar || i12 < 500) {
            time2 -= (long) i12;
        }
        boolean z11 = i10 == 13;
        int i13 = calendar.get(13);
        if (!z11 && (bVar2 == bVar || i13 < 30)) {
            time2 -= ((long) i13) * 1000;
        }
        if (i10 == 12) {
            z11 = true;
        }
        int i14 = calendar.get(12);
        if (!z11 && (bVar2 == bVar || i14 < 30)) {
            time2 -= ((long) i14) * 60000;
        }
        if (time.getTime() != time2) {
            time.setTime(time2);
            calendar.setTime(time);
        }
        boolean z12 = false;
        for (int[] iArr : f337383f) {
            for (int i15 : iArr) {
                if (i15 == i10) {
                    if (bVar == b.CEILING || (bVar == b.ROUND && z12)) {
                        if (i10 == 1001) {
                            if (calendar.get(5) == 1) {
                                calendar.add(5, 15);
                                return;
                            } else {
                                calendar.add(5, -15);
                                calendar.add(2, 1);
                                return;
                            }
                        }
                        if (i10 != 9) {
                            calendar.add(iArr[0], 1);
                            return;
                        } else if (calendar.get(11) == 0) {
                            calendar.add(11, 12);
                            return;
                        } else {
                            calendar.add(11, -12);
                            calendar.add(5, 1);
                            return;
                        }
                    }
                    return;
                }
            }
            if (i10 != 9) {
                if (i10 == 1001 && iArr[0] == 5) {
                    int i16 = calendar.get(5);
                    int i17 = i16 - 1;
                    if (i17 >= 15) {
                        i17 = i16 - 16;
                    }
                    int i18 = i17;
                    z12 = i17 > 7;
                    i11 = i18;
                    z10 = true;
                    c10 = '\f';
                } else {
                    c10 = '\f';
                    i11 = 0;
                    z10 = false;
                }
            } else if (iArr[0] == 11) {
                int i19 = calendar.get(11);
                c10 = '\f';
                if (i19 >= 12) {
                    i19 -= 12;
                }
                int i20 = i19;
                z12 = i20 >= 6;
                i11 = i20;
                z10 = true;
            } else {
                c10 = '\f';
                i11 = 0;
                z10 = false;
            }
            if (!z10) {
                int actualMinimum = calendar.getActualMinimum(iArr[0]);
                int actualMaximum = calendar.getActualMaximum(iArr[0]);
                int i21 = calendar.get(iArr[0]) - actualMinimum;
                z12 = i21 > (actualMaximum - actualMinimum) / 2;
                i11 = i21;
            }
            if (i11 != 0) {
                int i22 = iArr[0];
                calendar.set(i22, calendar.get(i22) - i11);
            }
        }
        throw new IllegalArgumentException("The field " + i10 + " is not supported");
    }

    public static Date H(String str, Locale locale, String... strArr) throws ParseException {
        return L(str, locale, strArr, true);
    }

    public static Date I(String str, String... strArr) throws ParseException {
        return H(str, null, strArr);
    }

    public static Date J(String str, Locale locale, String... strArr) throws ParseException {
        return L(str, locale, strArr, false);
    }

    public static Date K(String str, String... strArr) throws ParseException {
        return J(str, null, strArr);
    }

    private static Date L(String str, Locale locale, String[] strArr, boolean z10) throws ParseException {
        if (str == null || strArr == null) {
            throw new IllegalArgumentException("Date and Patterns must not be null");
        }
        TimeZone timeZone = TimeZone.getDefault();
        if (locale == null) {
            locale = Locale.getDefault();
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        calendar.setLenient(z10);
        for (String str2 : strArr) {
            g gVar = new g(str2, timeZone, locale);
            calendar.clear();
            try {
                if (gVar.i(str, parsePosition, calendar) && parsePosition.getIndex() == str.length()) {
                    return calendar.getTime();
                }
            } catch (IllegalArgumentException unused) {
            }
            parsePosition.setIndex(0);
        }
        int i10 = 2 | (-1);
        throw new ParseException("Unable to parse the date: " + str, -1);
    }

    public static Calendar M(Calendar calendar, int i10) {
        if (calendar == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar2 = (Calendar) calendar.clone();
        G(calendar2, i10, b.ROUND);
        return calendar2;
    }

    public static Date N(Object obj, int i10) {
        if (obj == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        if (obj instanceof Date) {
            return O((Date) obj, i10);
        }
        if (obj instanceof Calendar) {
            return M((Calendar) obj, i10).getTime();
        }
        throw new ClassCastException("Could not round " + obj);
    }

    public static Date O(Date date, int i10) {
        g0(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        G(calendar, i10, b.ROUND);
        return calendar.getTime();
    }

    private static Date P(Date date, int i10, int i11) {
        g0(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setLenient(false);
        calendar.setTime(date);
        calendar.set(i10, i11);
        return calendar.getTime();
    }

    public static Date Q(Date date, int i10) {
        return P(date, 5, i10);
    }

    public static Date R(Date date, int i10) {
        return P(date, 11, i10);
    }

    public static Date S(Date date, int i10) {
        return P(date, 14, i10);
    }

    public static Date T(Date date, int i10) {
        return P(date, 12, i10);
    }

    public static Date U(Date date, int i10) {
        return P(date, 2, i10);
    }

    public static Date V(Date date, int i10) {
        return P(date, 13, i10);
    }

    public static Date W(Date date, int i10) {
        return P(date, 1, i10);
    }

    public static Calendar X(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static Calendar Y(Date date, TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTime(date);
        return calendar;
    }

    public static Calendar Z(Calendar calendar, int i10) {
        if (calendar == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar2 = (Calendar) calendar.clone();
        G(calendar2, i10, b.TRUNCATE);
        return calendar2;
    }

    private static Date a(Date date, int i10, int i11) {
        g0(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(i10, i11);
        return calendar.getTime();
    }

    public static Date a0(Object obj, int i10) {
        if (obj == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        if (obj instanceof Date) {
            return b0((Date) obj, i10);
        }
        if (obj instanceof Calendar) {
            return Z((Calendar) obj, i10).getTime();
        }
        throw new ClassCastException("Could not truncate " + obj);
    }

    public static Date b(Date date, int i10) {
        return a(date, 5, i10);
    }

    public static Date b0(Date date, int i10) {
        g0(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        G(calendar, i10, b.TRUNCATE);
        return calendar.getTime();
    }

    public static Date c(Date date, int i10) {
        return a(date, 11, i10);
    }

    public static int c0(Calendar calendar, Calendar calendar2, int i10) {
        return Z(calendar, i10).compareTo(Z(calendar2, i10));
    }

    public static Date d(Date date, int i10) {
        return a(date, 14, i10);
    }

    public static int d0(Date date, Date date2, int i10) {
        return b0(date, i10).compareTo(b0(date2, i10));
    }

    public static Date e(Date date, int i10) {
        return a(date, 12, i10);
    }

    public static boolean e0(Calendar calendar, Calendar calendar2, int i10) {
        return c0(calendar, calendar2, i10) == 0;
    }

    public static Date f(Date date, int i10) {
        return a(date, 2, i10);
    }

    public static boolean f0(Date date, Date date2, int i10) {
        return d0(date, date2, i10) == 0;
    }

    public static Date g(Date date, int i10) {
        return a(date, 13, i10);
    }

    private static void g0(Date date) {
        c0.v(date != null, "The date must not be null", new Object[0]);
    }

    public static Date h(Date date, int i10) {
        return a(date, 3, i10);
    }

    public static Date i(Date date, int i10) {
        return a(date, 1, i10);
    }

    public static Calendar j(Calendar calendar, int i10) {
        if (calendar == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar2 = (Calendar) calendar.clone();
        G(calendar2, i10, b.CEILING);
        return calendar2;
    }

    public static Date k(Object obj, int i10) {
        if (obj == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        if (obj instanceof Date) {
            return l((Date) obj, i10);
        }
        if (obj instanceof Calendar) {
            return j((Calendar) obj, i10).getTime();
        }
        throw new ClassCastException("Could not find ceiling of for type: " + obj.getClass());
    }

    public static Date l(Date date, int i10) {
        g0(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        G(calendar, i10, b.CEILING);
        return calendar.getTime();
    }

    private static long m(Calendar calendar, int i10, TimeUnit timeUnit) {
        long jConvert;
        if (calendar == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        int i11 = timeUnit == timeUnit2 ? 0 : 1;
        if (i10 != 1) {
            jConvert = i10 != 2 ? 0L : timeUnit.convert(calendar.get(5) - i11, timeUnit2);
        } else {
            jConvert = timeUnit.convert(calendar.get(6) - i11, timeUnit2);
        }
        if (i10 == 1 || i10 == 2 || i10 == 5 || i10 == 6) {
            jConvert += timeUnit.convert(calendar.get(11), TimeUnit.HOURS);
        } else {
            switch (i10) {
                case 11:
                    break;
                case 12:
                    jConvert += timeUnit.convert(calendar.get(13), TimeUnit.SECONDS);
                case 13:
                    return jConvert + timeUnit.convert(calendar.get(14), TimeUnit.MILLISECONDS);
                case 14:
                    return jConvert;
                default:
                    throw new IllegalArgumentException("The fragment " + i10 + " is not supported");
            }
        }
        jConvert += timeUnit.convert(calendar.get(12), TimeUnit.MINUTES);
        jConvert += timeUnit.convert(calendar.get(13), TimeUnit.SECONDS);
        return jConvert + timeUnit.convert(calendar.get(14), TimeUnit.MILLISECONDS);
    }

    private static long n(Date date, int i10, TimeUnit timeUnit) {
        g0(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return m(calendar, i10, timeUnit);
    }

    public static long o(Calendar calendar, int i10) {
        return m(calendar, i10, TimeUnit.DAYS);
    }

    public static long p(Date date, int i10) {
        return n(date, i10, TimeUnit.DAYS);
    }

    public static long q(Calendar calendar, int i10) {
        return m(calendar, i10, TimeUnit.HOURS);
    }

    public static long r(Date date, int i10) {
        return n(date, i10, TimeUnit.HOURS);
    }

    public static long s(Calendar calendar, int i10) {
        return m(calendar, i10, TimeUnit.MILLISECONDS);
    }

    public static long t(Date date, int i10) {
        return n(date, i10, TimeUnit.MILLISECONDS);
    }

    public static long u(Calendar calendar, int i10) {
        return m(calendar, i10, TimeUnit.MINUTES);
    }

    public static long v(Date date, int i10) {
        return n(date, i10, TimeUnit.MINUTES);
    }

    public static long w(Calendar calendar, int i10) {
        return m(calendar, i10, TimeUnit.SECONDS);
    }

    public static long x(Date date, int i10) {
        return n(date, i10, TimeUnit.SECONDS);
    }

    public static boolean y(Calendar calendar, Calendar calendar2) {
        if (calendar == null || calendar2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        return calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    public static boolean z(Date date, Date date2) {
        if (date == null || date2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return y(calendar, calendar2);
    }
}
