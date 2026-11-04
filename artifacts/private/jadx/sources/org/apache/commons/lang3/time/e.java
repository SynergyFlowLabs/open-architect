package org.apache.commons.lang3.time;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.apache.commons.lang3.c0;
import org.apache.commons.lang3.z;

/* JADX INFO: loaded from: classes14.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f337396a = "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.SSS'S'";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Object f337397b = "y";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Object f337398c = "M";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Object f337399d = "d";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Object f337400e = "H";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Object f337401f = androidx.media3.exoplayer.upstream.h.f66001o;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final Object f337402g = "s";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final Object f337403h = androidx.exifinterface.media.a.S4;

    static String a(a[] aVarArr, long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10) {
        a[] aVarArr2 = aVarArr;
        StringBuilder sb2 = new StringBuilder();
        int length = aVarArr2.length;
        int i10 = 0;
        boolean z11 = false;
        while (i10 < length) {
            a aVar = aVarArr2[i10];
            Object objC = aVar.c();
            int iB = aVar.b();
            if (objC instanceof StringBuilder) {
                sb2.append(objC.toString());
                length = length;
                i10 = i10;
            } else {
                if (objC.equals(f337397b)) {
                    sb2.append(k(j10, z10, iB));
                } else {
                    if (objC.equals(f337398c)) {
                        sb2.append(k(j11, z10, iB));
                    } else if (objC.equals(f337399d)) {
                        sb2.append(k(j12, z10, iB));
                        z11 = false;
                    } else {
                        i10 = i10;
                        if (objC.equals(f337400e)) {
                            length = length;
                            sb2.append(k(j13, z10, iB));
                        } else {
                            length = length;
                            if (objC.equals(f337401f)) {
                                sb2.append(k(j14, z10, iB));
                            } else if (objC.equals(f337402g)) {
                                sb2.append(k(j15, z10, iB));
                                z11 = true;
                            } else if (objC.equals(f337403h)) {
                                if (z11) {
                                    sb2.append(k(j16, true, z10 ? Math.max(3, iB) : 3));
                                } else {
                                    sb2.append(k(j16, z10, iB));
                                }
                                z11 = false;
                            }
                        }
                        z11 = false;
                    }
                    i10++;
                    aVarArr2 = aVarArr;
                    length = length;
                }
                z11 = false;
            }
            i10++;
            aVarArr2 = aVarArr;
            length = length;
        }
        return sb2.toString();
    }

    public static String b(long j10, String str) {
        return c(j10, str, true);
    }

    public static String c(long j10, String str, boolean z10) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        c0.l(0L, Long.MAX_VALUE, j10, "durationMillis must not be negative");
        a[] aVarArrJ = j(str);
        if (a.a(aVarArrJ, f337399d)) {
            j12 = j10 / 86400000;
            j11 = j10 - (86400000 * j12);
        } else {
            j11 = j10;
            j12 = 0;
        }
        if (a.a(aVarArrJ, f337400e)) {
            long j16 = j11 / 3600000;
            j11 -= 3600000 * j16;
            j13 = j16;
        } else {
            j13 = 0;
        }
        if (a.a(aVarArrJ, f337401f)) {
            long j17 = j11 / 60000;
            j11 -= 60000 * j17;
            j14 = j17;
        } else {
            j14 = 0;
        }
        if (a.a(aVarArrJ, f337402g)) {
            j15 = j11 / 1000;
            j11 -= 1000 * j15;
        } else {
            j15 = 0;
        }
        return a(aVarArrJ, 0L, 0L, j12, j13, j14, j15, j11, z10);
    }

    public static String d(long j10) {
        return b(j10, "HH:mm:ss.SSS");
    }

    public static String e(long j10) {
        return c(j10, f337396a, false);
    }

    public static String f(long j10, boolean z10, boolean z11) {
        String strB = b(j10, "d' days 'H' hours 'm' minutes 's' seconds'");
        if (z10) {
            strB = " " + strB;
            String strE2 = z.e2(strB, " 0 days", "");
            if (strE2.length() != strB.length()) {
                String strE3 = z.e2(strE2, " 0 hours", "");
                if (strE3.length() != strE2.length()) {
                    strB = z.e2(strE3, " 0 minutes", "");
                    if (strB.length() != strB.length()) {
                        strB = z.e2(strB, " 0 seconds", "");
                    }
                } else {
                    strB = strE2;
                }
            }
            if (strB.length() != 0) {
                strB = strB.substring(1);
            }
        }
        if (z11) {
            String strE4 = z.e2(strB, " 0 seconds", "");
            if (strE4.length() != strB.length()) {
                strB = z.e2(strE4, " 0 minutes", "");
                if (strB.length() != strE4.length()) {
                    String strE5 = z.e2(strB, " 0 hours", "");
                    if (strE5.length() != strB.length()) {
                        strB = z.e2(strE5, " 0 days", "");
                    }
                } else {
                    strB = strE4;
                }
            }
        }
        return z.e2(z.e2(z.e2(z.e2(" " + strB, " 1 seconds", " 1 second"), " 1 minutes", " 1 minute"), " 1 hours", " 1 hour"), " 1 days", " 1 day").trim();
    }

    public static String g(long j10, long j11, String str) {
        return h(j10, j11, str, true, TimeZone.getDefault());
    }

    public static String h(long j10, long j11, String str, boolean z10, TimeZone timeZone) {
        int i10 = 0;
        c0.v(j10 <= j11, "startMillis must not be greater than endMillis", new Object[0]);
        a[] aVarArrJ = j(str);
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTime(new Date(j10));
        Calendar calendar2 = Calendar.getInstance(timeZone);
        calendar2.setTime(new Date(j11));
        int i11 = calendar2.get(14) - calendar.get(14);
        int i12 = calendar2.get(13) - calendar.get(13);
        int i13 = calendar2.get(12) - calendar.get(12);
        int i14 = calendar2.get(11) - calendar.get(11);
        int actualMaximum = calendar2.get(5) - calendar.get(5);
        int i15 = calendar2.get(2) - calendar.get(2);
        int i16 = calendar2.get(1) - calendar.get(1);
        while (i11 < 0) {
            i11 += 1000;
            i12--;
        }
        while (i12 < 0) {
            i12 += 60;
            i13--;
        }
        while (i13 < 0) {
            i13 += 60;
            i14--;
        }
        while (i14 < 0) {
            i14 += 24;
            actualMaximum--;
        }
        if (a.a(aVarArrJ, f337398c)) {
            while (actualMaximum < 0) {
                actualMaximum += calendar.getActualMaximum(5);
                i15--;
                calendar.add(2, 1);
            }
            while (i15 < 0) {
                i15 += 12;
                i16--;
            }
            if (!a.a(aVarArrJ, f337397b) && i16 != 0) {
                while (i16 != 0) {
                    i15 += i16 * 12;
                    i16 = 0;
                }
            }
        } else {
            if (!a.a(aVarArrJ, f337397b)) {
                int i17 = calendar2.get(1);
                if (i15 < 0) {
                    i17--;
                }
                while (calendar.get(1) != i17) {
                    int actualMaximum2 = actualMaximum + (calendar.getActualMaximum(6) - calendar.get(6));
                    if ((calendar instanceof GregorianCalendar) && calendar.get(2) == 1 && calendar.get(5) == 29) {
                        actualMaximum2++;
                    }
                    calendar.add(1, 1);
                    actualMaximum = actualMaximum2 + calendar.get(6);
                }
                i16 = 0;
            }
            while (calendar.get(2) != calendar2.get(2)) {
                actualMaximum += calendar.getActualMaximum(5);
                calendar.add(2, 1);
            }
            i15 = 0;
            while (actualMaximum < 0) {
                actualMaximum += calendar.getActualMaximum(5);
                i15--;
                calendar.add(2, 1);
            }
        }
        if (!a.a(aVarArrJ, f337399d)) {
            i14 += actualMaximum * 24;
            actualMaximum = 0;
        }
        if (!a.a(aVarArrJ, f337400e)) {
            i13 += i14 * 60;
            i14 = 0;
        }
        if (!a.a(aVarArrJ, f337401f)) {
            i12 += i13 * 60;
            i13 = 0;
        }
        if (a.a(aVarArrJ, f337402g)) {
            i10 = i12;
        } else {
            i11 += i12 * 1000;
        }
        return a(aVarArrJ, i16, i15, actualMaximum, i14, i13, i10, i11, z10);
    }

    public static String i(long j10, long j11) {
        return h(j10, j11, f337396a, false, TimeZone.getDefault());
    }

    static a[] j(String str) {
        Object obj;
        ArrayList arrayList = new ArrayList(str.length());
        boolean z10 = true | false;
        boolean z11 = false;
        StringBuilder sb2 = null;
        a aVar = null;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (!z11 || cCharAt == '\'') {
                if (cCharAt != '\'') {
                    if (cCharAt == 'H') {
                        obj = f337400e;
                    } else if (cCharAt == 'M') {
                        obj = f337398c;
                    } else if (cCharAt == 'S') {
                        obj = f337403h;
                    } else if (cCharAt == 'd') {
                        obj = f337399d;
                    } else if (cCharAt == 'm') {
                        obj = f337401f;
                    } else if (cCharAt == 's') {
                        obj = f337402g;
                    } else if (cCharAt != 'y') {
                        if (sb2 == null) {
                            sb2 = new StringBuilder();
                            arrayList.add(new a(sb2));
                        }
                        sb2.append(cCharAt);
                        obj = null;
                    } else {
                        obj = f337397b;
                    }
                } else if (z11) {
                    z11 = false;
                    sb2 = null;
                    obj = null;
                } else {
                    sb2 = new StringBuilder();
                    arrayList.add(new a(sb2));
                    z11 = true;
                    obj = null;
                }
                if (obj != null) {
                    if (aVar == null || !aVar.c().equals(obj)) {
                        aVar = new a(obj);
                        arrayList.add(aVar);
                    } else {
                        aVar.d();
                    }
                    sb2 = null;
                }
            } else {
                sb2.append(cCharAt);
            }
        }
        if (!z11) {
            return (a[]) arrayList.toArray(new a[arrayList.size()]);
        }
        throw new IllegalArgumentException("Unmatched quote in format: " + str);
    }

    private static String k(long j10, boolean z10, int i10) {
        String string = Long.toString(j10);
        return z10 ? z.r1(string, i10, org.locationtech.jts.geom.l.f338160j) : string;
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f337404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f337405b;

        a(Object obj) {
            this.f337404a = obj;
            int i10 = 6 >> 1;
            this.f337405b = 1;
        }

        static boolean a(a[] aVarArr, Object obj) {
            for (a aVar : aVarArr) {
                if (aVar.c() == obj) {
                    return true;
                }
            }
            return false;
        }

        int b() {
            return this.f337405b;
        }

        Object c() {
            return this.f337404a;
        }

        void d() {
            this.f337405b++;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f337404a.getClass() == aVar.f337404a.getClass() && this.f337405b == aVar.f337405b) {
                    Object obj2 = this.f337404a;
                    if (obj2 instanceof StringBuilder) {
                        return obj2.toString().equals(aVar.f337404a.toString());
                    }
                    if (obj2 instanceof Number) {
                        return obj2.equals(aVar.f337404a);
                    }
                    if (obj2 == aVar.f337404a) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return this.f337404a.hashCode();
        }

        public String toString() {
            return z.Q1(this.f337404a.toString(), this.f337405b);
        }

        a(Object obj, int i10) {
            this.f337404a = obj;
            this.f337405b = i10;
        }
    }
}
