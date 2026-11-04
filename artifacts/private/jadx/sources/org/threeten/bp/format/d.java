package org.threeten.bp.format;

import androidx.collection.g3;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final org.threeten.bp.temporal.l<org.threeten.bp.r> f340068h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map<Character, org.threeten.bp.temporal.j> f340069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final Comparator<String> f340070j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f340071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f340072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<h> f340073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f340074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f340075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private char f340076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f340077g;

    class a implements org.threeten.bp.temporal.l<org.threeten.bp.r> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public org.threeten.bp.r a(org.threeten.bp.temporal.f fVar) {
            org.threeten.bp.r rVar = (org.threeten.bp.r) fVar.d(org.threeten.bp.temporal.k.g());
            if (rVar == null || (rVar instanceof org.threeten.bp.s)) {
                return null;
            }
            return rVar;
        }
    }

    class b extends org.threeten.bp.format.h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ org.threeten.bp.format.n.b f340078b;

        b(org.threeten.bp.format.n.b bVar) {
            this.f340078b = bVar;
        }

        @Override // org.threeten.bp.format.h
        public String c(org.threeten.bp.temporal.j jVar, long j10, org.threeten.bp.format.o oVar, Locale locale) {
            return this.f340078b.a(j10, oVar);
        }

        @Override // org.threeten.bp.format.h
        public Iterator<Map.Entry<String, Long>> d(org.threeten.bp.temporal.j jVar, org.threeten.bp.format.o oVar, Locale locale) {
            return this.f340078b.b(oVar);
        }
    }

    class c implements Comparator<String> {
        c() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.length() == str2.length() ? str.compareTo(str2) : str.length() - str2.length();
        }
    }

    /* JADX INFO: renamed from: org.threeten.bp.format.d$d, reason: collision with other inner class name */
    static /* synthetic */ class C2449d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f340080a;

        static {
            int[] iArr = new int[org.threeten.bp.format.l.values().length];
            f340080a = iArr;
            try {
                iArr[org.threeten.bp.format.l.EXCEEDS_PAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f340080a[org.threeten.bp.format.l.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f340080a[org.threeten.bp.format.l.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f340080a[org.threeten.bp.format.l.NOT_NEGATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static final class e implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f340081a;

        e(char c10) {
            this.f340081a = c10;
        }

        @Override // org.threeten.bp.format.d.h
        public int b(org.threeten.bp.format.e eVar, CharSequence charSequence, int i10) {
            if (i10 == charSequence.length()) {
                return ~i10;
            }
            return !eVar.c(this.f340081a, charSequence.charAt(i10)) ? ~i10 : i10 + 1;
        }

        @Override // org.threeten.bp.format.d.h
        public boolean c(org.threeten.bp.format.g gVar, StringBuilder sb2) {
            sb2.append(this.f340081a);
            return true;
        }

        public String toString() {
            if (this.f340081a == '\'') {
                return "''";
            }
            return "'" + this.f340081a + "'";
        }
    }

    static final class f implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final org.threeten.bp.format.o f340082a;

        f(org.threeten.bp.format.o oVar) {
            this.f340082a = oVar;
        }

        @Override // org.threeten.bp.format.d.h
        public int b(org.threeten.bp.format.e eVar, CharSequence charSequence, int i10) {
            org.threeten.bp.format.e eVar2;
            CharSequence charSequence2;
            int i11;
            if (i10 < 0 || i10 > charSequence.length()) {
                throw new IndexOutOfBoundsException();
            }
            org.threeten.bp.chrono.j jVar = null;
            int i12 = -1;
            for (org.threeten.bp.chrono.j jVar2 : org.threeten.bp.chrono.j.getAvailableChronologies()) {
                String id2 = jVar2.getId();
                int length = id2.length();
                if (length > i12) {
                    eVar2 = eVar;
                    charSequence2 = charSequence;
                    i11 = i10;
                    if (eVar2.v(charSequence2, i11, id2, 0, length)) {
                        jVar = jVar2;
                        i12 = length;
                    }
                } else {
                    eVar2 = eVar;
                    charSequence2 = charSequence;
                    i11 = i10;
                }
                eVar = eVar2;
                charSequence = charSequence2;
                i10 = i11;
            }
            org.threeten.bp.format.e eVar3 = eVar;
            int i13 = i10;
            if (jVar == null) {
                return ~i13;
            }
            eVar3.q(jVar);
            return i13 + i12;
        }

        @Override // org.threeten.bp.format.d.h
        public boolean c(org.threeten.bp.format.g gVar, StringBuilder sb2) {
            org.threeten.bp.chrono.j jVar = (org.threeten.bp.chrono.j) gVar.g(org.threeten.bp.temporal.k.a());
            if (jVar == null) {
                return false;
            }
            if (this.f340082a == null) {
                sb2.append(jVar.getId());
            } else {
                try {
                    sb2.append(ResourceBundle.getBundle("org.threeten.bp.format.ChronologyText", gVar.c(), d.class.getClassLoader()).getString(jVar.getId()));
                } catch (MissingResourceException unused) {
                    sb2.append(jVar.getId());
                }
            }
            return true;
        }
    }

    static final class g implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h[] f340083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f340084b;

        g(List<h> list, boolean z10) {
            this((h[]) list.toArray(new h[list.size()]), z10);
        }

        public g a(boolean z10) {
            return z10 == this.f340084b ? this : new g(this.f340083a, z10);
        }

        @Override // org.threeten.bp.format.d.h
        public int b(org.threeten.bp.format.e eVar, CharSequence charSequence, int i10) {
            if (!this.f340084b) {
                for (h hVar : this.f340083a) {
                    i10 = hVar.b(eVar, charSequence, i10);
                    if (i10 < 0) {
                        return i10;
                    }
                }
                return i10;
            }
            eVar.u();
            int iB = i10;
            for (h hVar2 : this.f340083a) {
                iB = hVar2.b(eVar, charSequence, iB);
                if (iB < 0) {
                    eVar.g(false);
                    return i10;
                }
            }
            eVar.g(true);
            return iB;
        }

        @Override // org.threeten.bp.format.d.h
        public boolean c(org.threeten.bp.format.g gVar, StringBuilder sb2) {
            int length = sb2.length();
            if (this.f340084b) {
                gVar.j();
            }
            try {
                for (h hVar : this.f340083a) {
                    if (!hVar.c(gVar, sb2)) {
                        sb2.setLength(length);
                        if (this.f340084b) {
                            gVar.b();
                        }
                        return true;
                    }
                }
                if (this.f340084b) {
                    gVar.b();
                }
                return true;
            } catch (Throwable th2) {
                if (this.f340084b) {
                    gVar.b();
                }
                throw th2;
            }
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            if (this.f340083a != null) {
                sb2.append(this.f340084b ? "[" : "(");
                for (h hVar : this.f340083a) {
                    sb2.append(hVar);
                }
                sb2.append(this.f340084b ? "]" : ")");
            }
            return sb2.toString();
        }

        g(h[] hVarArr, boolean z10) {
            this.f340083a = hVarArr;
            this.f340084b = z10;
        }
    }

    interface h {
        int b(org.threeten.bp.format.e eVar, CharSequence charSequence, int i10);

        boolean c(org.threeten.bp.format.g gVar, StringBuilder sb2);
    }

    static class i implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final org.threeten.bp.temporal.j f340085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f340086b;

        i(org.threeten.bp.temporal.j jVar, long j10) {
            this.f340085a = jVar;
            this.f340086b = j10;
        }

        @Override // org.threeten.bp.format.d.h
        public int b(org.threeten.bp.format.e eVar, CharSequence charSequence, int i10) {
            if (eVar.j(this.f340085a) != null) {
                return i10;
            }
            eVar.r(this.f340085a, this.f340086b, i10, i10);
            return i10;
        }

        @Override // org.threeten.bp.format.d.h
        public boolean c(org.threeten.bp.format.g gVar, StringBuilder sb2) {
            return true;
        }
    }

    static final class j implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final org.threeten.bp.temporal.j f340087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f340088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f340089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f340090d;

        j(org.threeten.bp.temporal.j jVar, int i10, int i11, boolean z10) {
            cn.d.j(jVar, "field");
            if (!jVar.range().g()) {
                throw new IllegalArgumentException("Field must have a fixed set of values: " + jVar);
            }
            if (i10 < 0 || i10 > 9) {
                throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i10);
            }
            if (i11 < 1 || i11 > 9) {
                throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i11);
            }
            if (i11 >= i10) {
                this.f340087a = jVar;
                this.f340088b = i10;
                this.f340089c = i11;
                this.f340090d = z10;
                return;
            }
            throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
        }

        private long a(BigDecimal bigDecimal) {
            org.threeten.bp.temporal.o oVarRange = this.f340087a.range();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(oVarRange.e());
            return bigDecimal.multiply(BigDecimal.valueOf(oVarRange.d()).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact();
        }

        private BigDecimal d(long j10) {
            org.threeten.bp.temporal.o oVarRange = this.f340087a.range();
            oVarRange.b(j10, this.f340087a);
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(oVarRange.e());
            BigDecimal bigDecimalDivide = BigDecimal.valueOf(j10).subtract(bigDecimalValueOf).divide(BigDecimal.valueOf(oVarRange.d()).subtract(bigDecimalValueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
            BigDecimal bigDecimal = BigDecimal.ZERO;
            return bigDecimalDivide.compareTo(bigDecimal) == 0 ? bigDecimal : bigDecimalDivide.stripTrailingZeros();
        }

        @Override // org.threeten.bp.format.d.h
        public int b(org.threeten.bp.format.e eVar, CharSequence charSequence, int i10) {
            int i11 = 0;
            int i12 = eVar.m() ? this.f340088b : 0;
            int i13 = eVar.m() ? this.f340089c : 9;
            int length = charSequence.length();
            if (i10 != length) {
                if (this.f340090d) {
                    if (charSequence.charAt(i10) == eVar.k().e()) {
                        i10++;
                    } else if (i12 > 0) {
                        return ~i10;
                    }
                }
                int i14 = i10;
                int i15 = i12 + i14;
                if (i15 > length) {
                    return ~i14;
                }
                int iMin = Math.min(i13 + i14, length);
                int i16 = i14;
                while (i16 < iMin) {
                    int i17 = i16 + 1;
                    int iB = eVar.k().b(charSequence.charAt(i16));
                    if (iB < 0) {
                        if (i17 >= i15) {
                            break;
                        }
                        return ~i14;
                    }
                    i11 = (i11 * 10) + iB;
                    i16 = i17;
                }
                return eVar.r(this.f340087a, a(new BigDecimal(i11).movePointLeft(i16 - i14)), i14, i16);
            }
            if (i12 > 0) {
                return ~i10;
            }
            return i10;
        }

        @Override // org.threeten.bp.format.d.h
        public boolean c(org.threeten.bp.format.g gVar, StringBuilder sb2) {
            Long lF = gVar.f(this.f340087a);
            if (lF == null) {
                return false;
            }
            org.threeten.bp.format.i iVarD = gVar.d();
            BigDecimal bigDecimalD = d(lF.longValue());
            if (bigDecimalD.scale() != 0) {
                String strA = iVarD.a(bigDecimalD.setScale(Math.min(Math.max(bigDecimalD.scale(), this.f340088b), this.f340089c), RoundingMode.FLOOR).toPlainString().substring(2));
                if (this.f340090d) {
                    sb2.append(iVarD.e());
                }
                sb2.append(strA);
                return true;
            }
            if (this.f340088b <= 0) {
                return true;
            }
            if (this.f340090d) {
                sb2.append(iVarD.e());
            }
            for (int i10 = 0; i10 < this.f340088b; i10++) {
                sb2.append(iVarD.h());
            }
            return true;
        }

        public String toString() {
            return "Fraction(" + this.f340087a + "," + this.f340088b + "," + this.f340089c + (this.f340090d ? ",DecimalPoint" : "") + ")";
        }
    }

    static final class k implements h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f340091b = 315569520000L;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f340092c = 62167219200L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f340093a;

        k(int i10) {
            this.f340093a = i10;
        }

        @Override // org.threeten.bp.format.d.h
        public int b(org.threeten.bp.format.e eVar, CharSequence charSequence, int i10) {
            int i11;
            int i12;
            org.threeten.bp.format.e eVarE = eVar.e();
            int i13 = this.f340093a;
            int i14 = 0;
            int i15 = i13 < 0 ? 0 : i13;
            if (i13 < 0) {
                i13 = 9;
            }
            d dVarH = new d().a(org.threeten.bp.format.c.f340042h).h(org.locationtech.jts.geom.l.f338158h);
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340353t;
            d dVarH2 = dVarH.u(aVar, 2).h(AbstractJsonLexerKt.COLON);
            org.threeten.bp.temporal.a aVar2 = org.threeten.bp.temporal.a.f340343m;
            d dVarH3 = dVarH2.u(aVar2, 2).h(AbstractJsonLexerKt.COLON);
            org.threeten.bp.temporal.a aVar3 = org.threeten.bp.temporal.a.f340339k;
            d dVarU = dVarH3.u(aVar3, 2);
            org.threeten.bp.temporal.a aVar4 = org.threeten.bp.temporal.a.f340329e;
            int iB = dVarU.d(aVar4, i15, i13, true).h('Z').P().C(false).b(eVarE, charSequence, i10);
            if (iB < 0) {
                return iB;
            }
            long jLongValue = eVarE.j(org.threeten.bp.temporal.a.f340340k3).longValue();
            int iIntValue = eVarE.j(org.threeten.bp.temporal.a.f340334h3).intValue();
            int iIntValue2 = eVarE.j(org.threeten.bp.temporal.a.f340349p0).intValue();
            int iIntValue3 = eVarE.j(aVar).intValue();
            int iIntValue4 = eVarE.j(aVar2).intValue();
            Long lJ = eVarE.j(aVar3);
            Long lJ2 = eVarE.j(aVar4);
            int iIntValue5 = lJ != null ? lJ.intValue() : 0;
            int iIntValue6 = lJ2 != null ? lJ2.intValue() : 0;
            int i16 = ((int) jLongValue) % 10000;
            if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
                i11 = 0;
                i12 = iIntValue5;
                i14 = 1;
            } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
                eVar.s();
                i12 = 59;
                i11 = iIntValue3;
            } else {
                i11 = iIntValue3;
                i12 = iIntValue5;
            }
            try {
                return eVar.r(aVar4, iIntValue6, i10, eVar.r(org.threeten.bp.temporal.a.f340344m3, cn.d.o(jLongValue / 10000, f340091b) + org.threeten.bp.h.D0(i16, iIntValue, iIntValue2, i11, iIntValue4, i12, 0).O0(i14).T(org.threeten.bp.s.f340320n), i10, iB));
            } catch (RuntimeException unused) {
                return ~i10;
            }
        }

        @Override // org.threeten.bp.format.d.h
        public boolean c(org.threeten.bp.format.g gVar, StringBuilder sb2) {
            Long lF = gVar.f(org.threeten.bp.temporal.a.f340344m3);
            org.threeten.bp.temporal.f fVarE = gVar.e();
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340329e;
            Long lValueOf = fVarE.q(aVar) ? Long.valueOf(gVar.e().t(aVar)) : 0L;
            int i10 = 0;
            if (lF == null) {
                return false;
            }
            long jLongValue = lF.longValue();
            int iK = aVar.k(lValueOf.longValue());
            if (jLongValue >= -62167219200L) {
                long j10 = jLongValue - 253402300800L;
                long jE = cn.d.e(j10, f340091b) + 1;
                org.threeten.bp.h hVarI0 = org.threeten.bp.h.I0(cn.d.h(j10, f340091b) - f340092c, 0, org.threeten.bp.s.f340320n);
                if (jE > 0) {
                    sb2.append('+');
                    sb2.append(jE);
                }
                sb2.append(hVarI0);
                if (hVarI0.m0() == 0) {
                    sb2.append(":00");
                }
            } else {
                long j11 = jLongValue + f340092c;
                long j12 = j11 / f340091b;
                long j13 = j11 % f340091b;
                org.threeten.bp.h hVarI1 = org.threeten.bp.h.I0(j13 - f340092c, 0, org.threeten.bp.s.f340320n);
                int length = sb2.length();
                sb2.append(hVarI1);
                if (hVarI1.m0() == 0) {
                    sb2.append(":00");
                }
                if (j12 < 0) {
                    if (hVarI1.n0() == -10000) {
                        sb2.replace(length, length + 2, Long.toString(j12 - 1));
                    } else if (j13 == 0) {
                        sb2.insert(length, j12);
                    } else {
                        sb2.insert(length + 1, Math.abs(j12));
                    }
                }
            }
            int i11 = this.f340093a;
            if (i11 == -2) {
                if (iK != 0) {
                    sb2.append('.');
                    if (iK % 1000000 == 0) {
                        sb2.append(Integer.toString((iK / 1000000) + 1000).substring(1));
                    } else if (iK % 1000 == 0) {
                        sb2.append(Integer.toString((iK / 1000) + 1000000).substring(1));
                    } else {
                        sb2.append(Integer.toString(iK + 1000000000).substring(1));
                    }
                }
            } else if (i11 > 0 || (i11 == -1 && iK > 0)) {
                sb2.append('.');
                int i12 = 100000000;
                while (true) {
                    int i13 = this.f340093a;
                    if ((i13 != -1 || iK <= 0) && i10 >= i13) {
                        break;
                    }
                    int i14 = iK / i12;
                    sb2.append((char) (i14 + 48));
                    iK -= i14 * i12;
                    i12 /= 10;
                    i10++;
                }
            }
            sb2.append('Z');
            return true;
        }

        public String toString() {
            return "Instant()";
        }
    }

    static final class l implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final org.threeten.bp.format.o f340094a;

        public l(org.threeten.bp.format.o oVar) {
            this.f340094a = oVar;
        }

        @Override // org.threeten.bp.format.d.h
        public int b(org.threeten.bp.format.e eVar, CharSequence charSequence, int i10) {
            char cCharAt;
            if (!eVar.v(charSequence, i10, org.apache.commons.lang3.time.m.f337525a, 0, 3)) {
                return ~i10;
            }
            int i11 = i10 + 3;
            if (this.f340094a == org.threeten.bp.format.o.FULL) {
                return new o("", "+HH:MM:ss").b(eVar, charSequence, i11);
            }
            int length = charSequence.length();
            if (i11 == length) {
                return eVar.r(org.threeten.bp.temporal.a.f340346n3, 0L, i11, i11);
            }
            char cCharAt2 = charSequence.charAt(i11);
            if (cCharAt2 != '+' && cCharAt2 != '-') {
                return eVar.r(org.threeten.bp.temporal.a.f340346n3, 0L, i11, i11);
            }
            int i12 = cCharAt2 == '-' ? -1 : 1;
            if (i11 == length) {
                return ~i11;
            }
            int i13 = i10 + 4;
            char cCharAt3 = charSequence.charAt(i13);
            if (cCharAt3 < '0' || cCharAt3 > '9') {
                return ~i13;
            }
            int i14 = i10 + 5;
            int i15 = cCharAt3 - org.locationtech.jts.geom.l.f338160j;
            if (i14 != length && (cCharAt = charSequence.charAt(i14)) >= '0' && cCharAt <= '9') {
                i15 = (i15 * 10) + (cCharAt - org.locationtech.jts.geom.l.f338160j);
                if (i15 > 23) {
                    return ~i14;
                }
                i14 = i10 + 6;
            }
            if (i14 == length || charSequence.charAt(i14) != ':') {
                return eVar.r(org.threeten.bp.temporal.a.f340346n3, i12 * 3600 * i15, i14, i14);
            }
            int i16 = i14 + 1;
            int i17 = length - 2;
            if (i16 > i17) {
                return ~i16;
            }
            char cCharAt4 = charSequence.charAt(i16);
            if (cCharAt4 >= '0' && cCharAt4 <= '9') {
                int i18 = i14 + 2;
                int i19 = cCharAt4 - org.locationtech.jts.geom.l.f338160j;
                char cCharAt5 = charSequence.charAt(i18);
                if (cCharAt5 < '0' || cCharAt5 > '9') {
                    return ~i18;
                }
                int i20 = i14 + 3;
                int i21 = (i19 * 10) + (cCharAt5 - org.locationtech.jts.geom.l.f338160j);
                if (i21 > 59) {
                    return ~i20;
                }
                if (i20 != length && charSequence.charAt(i20) == ':') {
                    int i22 = i14 + 4;
                    if (i22 > i17) {
                        return ~i22;
                    }
                    char cCharAt6 = charSequence.charAt(i22);
                    if (cCharAt6 < '0' || cCharAt6 > '9') {
                        return ~i22;
                    }
                    int i23 = i14 + 5;
                    int i24 = cCharAt6 - org.locationtech.jts.geom.l.f338160j;
                    char cCharAt7 = charSequence.charAt(i23);
                    if (cCharAt7 < '0' || cCharAt7 > '9') {
                        return ~i23;
                    }
                    int i25 = i14 + 6;
                    int i26 = (i24 * 10) + (cCharAt7 - org.locationtech.jts.geom.l.f338160j);
                    return i26 > 59 ? ~i25 : eVar.r(org.threeten.bp.temporal.a.f340346n3, i12 * ((i15 * 3600) + (i21 * 60) + i26), i25, i25);
                }
                return eVar.r(org.threeten.bp.temporal.a.f340346n3, i12 * ((i15 * 3600) + (i21 * 60)), i20, i20);
            }
            return ~i16;
        }

        @Override // org.threeten.bp.format.d.h
        public boolean c(org.threeten.bp.format.g gVar, StringBuilder sb2) {
            Long lF = gVar.f(org.threeten.bp.temporal.a.f340346n3);
            if (lF == null) {
                return false;
            }
            sb2.append(org.apache.commons.lang3.time.m.f337525a);
            if (this.f340094a == org.threeten.bp.format.o.FULL) {
                return new o("", "+HH:MM:ss").c(gVar, sb2);
            }
            int iR = cn.d.r(lF.longValue());
            if (iR == 0) {
                return true;
            }
            int iAbs = Math.abs((iR / 3600) % 100);
            int iAbs2 = Math.abs((iR / 60) % 60);
            int iAbs3 = Math.abs(iR % 60);
            sb2.append(iR < 0 ? "-" : org.slf4j.h.f339615a3);
            sb2.append(iAbs);
            if (iAbs2 <= 0 && iAbs3 <= 0) {
                return true;
            }
            sb2.append(":");
            sb2.append((char) ((iAbs2 / 10) + 48));
            sb2.append((char) ((iAbs2 % 10) + 48));
            if (iAbs3 <= 0) {
                return true;
            }
            sb2.append(":");
            sb2.append((char) ((iAbs3 / 10) + 48));
            sb2.append((char) ((iAbs3 % 10) + 48));
            return true;
        }
    }

    static final class m implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final org.threeten.bp.format.j f340095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final org.threeten.bp.format.j f340096b;

        m(org.threeten.bp.format.j jVar, org.threeten.bp.format.j jVar2) {
            this.f340095a = jVar;
            this.f340096b = jVar2;
        }

        private org.threeten.bp.format.c a(Locale locale, org.threeten.bp.chrono.j jVar) {
            return org.threeten.bp.format.b.c().b(this.f340095a, this.f340096b, jVar, locale);
        }

        @Override // org.threeten.bp.format.d.h
        public int b(org.threeten.bp.format.e eVar, CharSequence charSequence, int i10) {
            return a(eVar.i(), eVar.h()).C(false).b(eVar, charSequence, i10);
        }

        @Override // org.threeten.bp.format.d.h
        public boolean c(org.threeten.bp.format.g gVar, StringBuilder sb2) {
            return a(gVar.c(), org.threeten.bp.chrono.j.v(gVar.e())).C(false).c(gVar, sb2);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Localized(");
            Object obj = this.f340095a;
            if (obj == null) {
                obj = "";
            }
            sb2.append(obj);
            sb2.append(",");
            org.threeten.bp.format.j jVar = this.f340096b;
            sb2.append(jVar != null ? jVar : "");
            sb2.append(")");
            return sb2.toString();
        }
    }

    static class n implements h {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int[] f340097f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.threeten.bp.temporal.j f340098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f340099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f340100c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final org.threeten.bp.format.l f340101d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f340102e;

        /* synthetic */ n(org.threeten.bp.temporal.j jVar, int i10, int i11, org.threeten.bp.format.l lVar, int i12, a aVar) {
            this(jVar, i10, i11, lVar, i12);
        }

        long a(org.threeten.bp.format.g gVar, long j10) {
            return j10;
        }

        @Override // org.threeten.bp.format.d.h
        public int b(org.threeten.bp.format.e eVar, CharSequence charSequence, int i10) {
            int i11;
            boolean z10;
            boolean z11;
            BigInteger bigIntegerDivide;
            long j10;
            int i12;
            long j11;
            boolean z12;
            int length = charSequence.length();
            if (i10 == length) {
                return ~i10;
            }
            char cCharAt = charSequence.charAt(i10);
            int i13 = 0;
            boolean z13 = true;
            if (cCharAt == eVar.k().g()) {
                if (!this.f340101d.b(true, eVar.m(), this.f340099b == this.f340100c)) {
                    return ~i10;
                }
                i11 = i10 + 1;
                z10 = false;
                z11 = true;
            } else if (cCharAt == eVar.k().f()) {
                if (!this.f340101d.b(false, eVar.m(), this.f340099b == this.f340100c)) {
                    return ~i10;
                }
                i11 = i10 + 1;
                z11 = false;
                z10 = true;
            } else {
                if (this.f340101d == org.threeten.bp.format.l.ALWAYS && eVar.m()) {
                    return ~i10;
                }
                i11 = i10;
                z10 = false;
                z11 = false;
            }
            int i14 = (eVar.m() || d(eVar)) ? this.f340099b : 1;
            int i15 = i11 + i14;
            if (i15 > length) {
                return ~i11;
            }
            int iMax = ((eVar.m() || d(eVar)) ? this.f340100c : 9) + Math.max(this.f340102e, 0);
            while (true) {
                bigIntegerDivide = null;
                if (i13 >= 2) {
                    j10 = 0;
                    i12 = i11;
                    j11 = 0;
                    break;
                }
                int iMin = Math.min(iMax + i11, length);
                int i16 = i11;
                j11 = 0;
                while (true) {
                    if (i16 >= iMin) {
                        z12 = z13;
                        j10 = 0;
                        break;
                    }
                    int i17 = i16 + 1;
                    z12 = z13;
                    j10 = 0;
                    int iB = eVar.k().b(charSequence.charAt(i16));
                    if (iB < 0) {
                        if (i16 >= i15) {
                            break;
                        }
                        return ~i11;
                    }
                    if (i17 - i11 > 18) {
                        if (bigIntegerDivide == null) {
                            bigIntegerDivide = BigInteger.valueOf(j11);
                        }
                        bigIntegerDivide = bigIntegerDivide.multiply(BigInteger.TEN).add(BigInteger.valueOf(iB));
                    } else {
                        j11 = (j11 * 10) + ((long) iB);
                    }
                    i16 = i17;
                    z13 = z12;
                }
                int i18 = this.f340102e;
                if (i18 <= 0 || i13 != 0) {
                    i12 = i16;
                    break;
                }
                iMax = Math.max(i14, (i16 - i11) - i18);
                i13++;
                z13 = z12;
            }
            if (z10) {
                if (bigIntegerDivide != null) {
                    if (bigIntegerDivide.equals(BigInteger.ZERO) && eVar.m()) {
                        return ~(i11 - 1);
                    }
                    bigIntegerDivide = bigIntegerDivide.negate();
                } else {
                    if (j11 == j10 && eVar.m()) {
                        return ~(i11 - 1);
                    }
                    j11 = -j11;
                }
            } else if (this.f340101d == org.threeten.bp.format.l.EXCEEDS_PAD && eVar.m()) {
                int i19 = i12 - i11;
                if (z11) {
                    if (i19 <= this.f340099b) {
                        return ~(i11 - 1);
                    }
                } else if (i19 > this.f340099b) {
                    return ~i11;
                }
            }
            long j12 = j11;
            if (bigIntegerDivide == null) {
                return e(eVar, j12, i11, i12);
            }
            if (bigIntegerDivide.bitLength() > 63) {
                bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
                i12--;
            }
            return e(eVar, bigIntegerDivide.longValue(), i11, i12);
        }

        @Override // org.threeten.bp.format.d.h
        public boolean c(org.threeten.bp.format.g gVar, StringBuilder sb2) {
            Long lF = gVar.f(this.f340098a);
            if (lF == null) {
                return false;
            }
            long jA = a(gVar, lF.longValue());
            org.threeten.bp.format.i iVarD = gVar.d();
            String string = jA == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jA));
            if (string.length() > this.f340100c) {
                throw new org.threeten.bp.b("Field " + this.f340098a + " cannot be printed as the value " + jA + " exceeds the maximum print width of " + this.f340100c);
            }
            String strA = iVarD.a(string);
            if (jA >= 0) {
                int i10 = C2449d.f340080a[this.f340101d.ordinal()];
                if (i10 == 1) {
                    int i11 = this.f340099b;
                    if (i11 < 19 && jA >= f340097f[i11]) {
                        sb2.append(iVarD.g());
                    }
                } else if (i10 == 2) {
                    sb2.append(iVarD.g());
                }
            } else {
                int i12 = C2449d.f340080a[this.f340101d.ordinal()];
                if (i12 == 1 || i12 == 2 || i12 == 3) {
                    sb2.append(iVarD.f());
                } else if (i12 == 4) {
                    throw new org.threeten.bp.b("Field " + this.f340098a + " cannot be printed as the value " + jA + " cannot be negative according to the SignStyle");
                }
            }
            for (int i13 = 0; i13 < this.f340099b - strA.length(); i13++) {
                sb2.append(iVarD.h());
            }
            sb2.append(strA);
            return true;
        }

        boolean d(org.threeten.bp.format.e eVar) {
            int i10 = this.f340102e;
            if (i10 != -1) {
                return i10 > 0 && this.f340099b == this.f340100c && this.f340101d == org.threeten.bp.format.l.NOT_NEGATIVE;
            }
            return true;
        }

        int e(org.threeten.bp.format.e eVar, long j10, int i10, int i11) {
            return eVar.r(this.f340098a, j10, i10, i11);
        }

        n f() {
            return this.f340102e == -1 ? this : new n(this.f340098a, this.f340099b, this.f340100c, this.f340101d, -1);
        }

        n g(int i10) {
            return new n(this.f340098a, this.f340099b, this.f340100c, this.f340101d, this.f340102e + i10);
        }

        public String toString() {
            int i10 = this.f340099b;
            if (i10 == 1 && this.f340100c == 19 && this.f340101d == org.threeten.bp.format.l.NORMAL) {
                return "Value(" + this.f340098a + ")";
            }
            if (i10 == this.f340100c && this.f340101d == org.threeten.bp.format.l.NOT_NEGATIVE) {
                return "Value(" + this.f340098a + "," + this.f340099b + ")";
            }
            return "Value(" + this.f340098a + "," + this.f340099b + "," + this.f340100c + "," + this.f340101d + ")";
        }

        n(org.threeten.bp.temporal.j jVar, int i10, int i11, org.threeten.bp.format.l lVar) {
            this.f340098a = jVar;
            this.f340099b = i10;
            this.f340100c = i11;
            this.f340101d = lVar;
            this.f340102e = 0;
        }

        private n(org.threeten.bp.temporal.j jVar, int i10, int i11, org.threeten.bp.format.l lVar, int i12) {
            this.f340098a = jVar;
            this.f340099b = i10;
            this.f340100c = i11;
            this.f340101d = lVar;
            this.f340102e = i12;
        }
    }

    static final class o implements h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final String[] f340103c = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final o f340104d = new o(org.locationtech.jts.io.gml2.a.f338505w, "+HH:MM:ss");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final o f340105e = new o(com.facebook.appevents.p.f99189d0, "+HH:MM:ss");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f340106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f340107b;

        o(String str, String str2) {
            cn.d.j(str, "noOffsetText");
            cn.d.j(str2, "pattern");
            this.f340106a = str;
            this.f340107b = a(str2);
        }

        private int a(String str) {
            int i10 = 0;
            while (true) {
                String[] strArr = f340103c;
                if (i10 >= strArr.length) {
                    throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
                }
                if (strArr[i10].equals(str)) {
                    return i10;
                }
                i10++;
            }
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0033  */
        /* JADX WARN: Code duplicated, block: B:18:0x0035  */
        private boolean d(int[] iArr, int i10, CharSequence charSequence, boolean z10) {
            char cCharAt;
            int i11;
            int i12;
            int i13 = this.f340107b;
            if ((i13 + 3) / 2 < i10) {
                return false;
            }
            int i14 = iArr[0];
            if (i13 % 2 == 0 && i10 > 1) {
                int i15 = i14 + 1;
                if (i15 <= charSequence.length() && charSequence.charAt(i14) == ':') {
                    i14 = i15;
                    if (i14 + 2 > charSequence.length()) {
                        int i16 = i14 + 1;
                        cCharAt = charSequence.charAt(i14);
                        i11 = i14 + 2;
                        char cCharAt2 = charSequence.charAt(i16);
                        if (cCharAt >= '0') {
                            iArr[i10] = i12;
                            iArr[0] = i11;
                            return false;
                        }
                    }
                }
            } else if (i14 + 2 > charSequence.length()) {
                int i17 = i14 + 1;
                cCharAt = charSequence.charAt(i14);
                i11 = i14 + 2;
                char cCharAt3 = charSequence.charAt(i17);
                if (cCharAt >= '0' && cCharAt <= '9' && cCharAt3 >= '0' && cCharAt3 <= '9' && (i12 = ((cCharAt - org.locationtech.jts.geom.l.f338160j) * 10) + (cCharAt3 - org.locationtech.jts.geom.l.f338160j)) >= 0 && i12 <= 59) {
                    iArr[i10] = i12;
                    iArr[0] = i11;
                    return false;
                }
            }
            return z10;
        }

        @Override // org.threeten.bp.format.d.h
        public int b(org.threeten.bp.format.e eVar, CharSequence charSequence, int i10) {
            int length = charSequence.length();
            int length2 = this.f340106a.length();
            if (length2 == 0) {
                if (i10 == length) {
                    return eVar.r(org.threeten.bp.temporal.a.f340346n3, 0L, i10, i10);
                }
            } else {
                if (i10 == length) {
                    return ~i10;
                }
                if (eVar.v(charSequence, i10, this.f340106a, 0, length2)) {
                    return eVar.r(org.threeten.bp.temporal.a.f340346n3, 0L, i10, i10 + length2);
                }
            }
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt == '+' || cCharAt == '-') {
                int i11 = cCharAt == '-' ? -1 : 1;
                int[] iArr = new int[4];
                iArr[0] = i10 + 1;
                if (!d(iArr, 1, charSequence, true)) {
                    if (!d(iArr, 2, charSequence, this.f340107b >= 3) && !d(iArr, 3, charSequence, false)) {
                        return eVar.r(org.threeten.bp.temporal.a.f340346n3, ((long) i11) * ((((long) iArr[1]) * 3600) + (((long) iArr[2]) * 60) + ((long) iArr[3])), i10, iArr[0]);
                    }
                }
            }
            return length2 == 0 ? eVar.r(org.threeten.bp.temporal.a.f340346n3, 0L, i10, i10 + length2) : ~i10;
        }

        @Override // org.threeten.bp.format.d.h
        public boolean c(org.threeten.bp.format.g gVar, StringBuilder sb2) {
            Long lF = gVar.f(org.threeten.bp.temporal.a.f340346n3);
            if (lF == null) {
                return false;
            }
            int iR = cn.d.r(lF.longValue());
            if (iR == 0) {
                sb2.append(this.f340106a);
            } else {
                int iAbs = Math.abs((iR / 3600) % 100);
                int iAbs2 = Math.abs((iR / 60) % 60);
                int iAbs3 = Math.abs(iR % 60);
                int length = sb2.length();
                sb2.append(iR < 0 ? "-" : org.slf4j.h.f339615a3);
                sb2.append((char) ((iAbs / 10) + 48));
                sb2.append((char) ((iAbs % 10) + 48));
                int i10 = this.f340107b;
                if (i10 >= 3 || (i10 >= 1 && iAbs2 > 0)) {
                    sb2.append(i10 % 2 == 0 ? ":" : "");
                    sb2.append((char) ((iAbs2 / 10) + 48));
                    sb2.append((char) ((iAbs2 % 10) + 48));
                    iAbs += iAbs2;
                    int i11 = this.f340107b;
                    if (i11 >= 7 || (i11 >= 5 && iAbs3 > 0)) {
                        sb2.append(i11 % 2 == 0 ? ":" : "");
                        sb2.append((char) ((iAbs3 / 10) + 48));
                        sb2.append((char) ((iAbs3 % 10) + 48));
                        iAbs += iAbs3;
                    }
                }
                if (iAbs == 0) {
                    sb2.setLength(length);
                    sb2.append(this.f340106a);
                }
            }
            return true;
        }

        public String toString() {
            return "Offset(" + f340103c[this.f340107b] + ",'" + this.f340106a.replace("'", "''") + "')";
        }
    }

    static final class p implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f340108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f340109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final char f340110c;

        p(h hVar, int i10, char c10) {
            this.f340108a = hVar;
            this.f340109b = i10;
            this.f340110c = c10;
        }

        @Override // org.threeten.bp.format.d.h
        public int b(org.threeten.bp.format.e eVar, CharSequence charSequence, int i10) {
            boolean zM = eVar.m();
            boolean zL = eVar.l();
            if (i10 > charSequence.length()) {
                throw new IndexOutOfBoundsException();
            }
            if (i10 == charSequence.length()) {
                return ~i10;
            }
            int length = this.f340109b + i10;
            if (length > charSequence.length()) {
                if (zM) {
                    return ~i10;
                }
                length = charSequence.length();
            }
            int i11 = i10;
            while (i11 < length) {
                if (!zL) {
                    if (!eVar.c(charSequence.charAt(i11), this.f340110c)) {
                        break;
                    }
                    i11++;
                } else {
                    if (charSequence.charAt(i11) != this.f340110c) {
                        break;
                    }
                    i11++;
                }
            }
            int iB = this.f340108a.b(eVar, charSequence.subSequence(0, length), i11);
            return (iB == length || !zM) ? iB : ~(i10 + i11);
        }

        @Override // org.threeten.bp.format.d.h
        public boolean c(org.threeten.bp.format.g gVar, StringBuilder sb2) {
            int length = sb2.length();
            if (!this.f340108a.c(gVar, sb2)) {
                return false;
            }
            int length2 = sb2.length() - length;
            if (length2 <= this.f340109b) {
                for (int i10 = 0; i10 < this.f340109b - length2; i10++) {
                    sb2.insert(length, this.f340110c);
                }
                return true;
            }
            throw new org.threeten.bp.b("Cannot print as output of " + length2 + " characters exceeds pad width of " + this.f340109b);
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Pad(");
            sb2.append(this.f340108a);
            sb2.append(",");
            sb2.append(this.f340109b);
            if (this.f340110c == ' ') {
                str = ")";
            } else {
                str = ",'" + this.f340110c + "')";
            }
            sb2.append(str);
            return sb2.toString();
        }
    }

    enum r implements h {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        @Override // org.threeten.bp.format.d.h
        public int b(org.threeten.bp.format.e eVar, CharSequence charSequence, int i10) {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                eVar.n(true);
                return i10;
            }
            if (iOrdinal == 1) {
                eVar.n(false);
                return i10;
            }
            if (iOrdinal == 2) {
                eVar.t(true);
                return i10;
            }
            if (iOrdinal != 3) {
                return i10;
            }
            eVar.t(false);
            return i10;
        }

        @Override // org.threeten.bp.format.d.h
        public boolean c(org.threeten.bp.format.g gVar, StringBuilder sb2) {
            return true;
        }

        @Override // java.lang.Enum
        public String toString() {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                return "ParseCaseSensitive(true)";
            }
            if (iOrdinal == 1) {
                return "ParseCaseSensitive(false)";
            }
            if (iOrdinal == 2) {
                return "ParseStrict(true)";
            }
            if (iOrdinal == 3) {
                return "ParseStrict(false)";
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    static final class s implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f340119a;

        s(String str) {
            this.f340119a = str;
        }

        @Override // org.threeten.bp.format.d.h
        public int b(org.threeten.bp.format.e eVar, CharSequence charSequence, int i10) {
            if (i10 > charSequence.length() || i10 < 0) {
                throw new IndexOutOfBoundsException();
            }
            String str = this.f340119a;
            return !eVar.v(charSequence, i10, str, 0, str.length()) ? ~i10 : i10 + this.f340119a.length();
        }

        @Override // org.threeten.bp.format.d.h
        public boolean c(org.threeten.bp.format.g gVar, StringBuilder sb2) {
            sb2.append(this.f340119a);
            return true;
        }

        public String toString() {
            return "'" + this.f340119a.replace("'", "''") + "'";
        }
    }

    static final class t implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final org.threeten.bp.temporal.j f340120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final org.threeten.bp.format.o f340121b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final org.threeten.bp.format.h f340122c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile n f340123d;

        t(org.threeten.bp.temporal.j jVar, org.threeten.bp.format.o oVar, org.threeten.bp.format.h hVar) {
            this.f340120a = jVar;
            this.f340121b = oVar;
            this.f340122c = hVar;
        }

        private n a() {
            if (this.f340123d == null) {
                this.f340123d = new n(this.f340120a, 1, 19, org.threeten.bp.format.l.NORMAL);
            }
            return this.f340123d;
        }

        @Override // org.threeten.bp.format.d.h
        public int b(org.threeten.bp.format.e eVar, CharSequence charSequence, int i10) {
            org.threeten.bp.format.e eVar2;
            CharSequence charSequence2;
            int i11;
            int length = charSequence.length();
            if (i10 < 0 || i10 > length) {
                throw new IndexOutOfBoundsException();
            }
            Iterator<Map.Entry<String, Long>> itD = this.f340122c.d(this.f340120a, eVar.m() ? this.f340121b : null, eVar.i());
            if (itD != null) {
                while (itD.hasNext()) {
                    Map.Entry<String, Long> next = itD.next();
                    String key = next.getKey();
                    org.threeten.bp.format.e eVar3 = eVar;
                    CharSequence charSequence3 = charSequence;
                    int i12 = i10;
                    if (eVar3.v(key, 0, charSequence3, i12, key.length())) {
                        return eVar3.r(this.f340120a, next.getValue().longValue(), i12, i12 + key.length());
                    }
                    eVar = eVar3;
                    charSequence = charSequence3;
                    i10 = i12;
                }
                eVar2 = eVar;
                charSequence2 = charSequence;
                i11 = i10;
                if (eVar2.m()) {
                    return ~i11;
                }
            } else {
                eVar2 = eVar;
                charSequence2 = charSequence;
                i11 = i10;
            }
            return a().b(eVar2, charSequence2, i11);
        }

        @Override // org.threeten.bp.format.d.h
        public boolean c(org.threeten.bp.format.g gVar, StringBuilder sb2) {
            Long lF = gVar.f(this.f340120a);
            if (lF == null) {
                return false;
            }
            String strC = this.f340122c.c(this.f340120a, lF.longValue(), this.f340121b, gVar.c());
            if (strC == null) {
                return a().c(gVar, sb2);
            }
            sb2.append(strC);
            return true;
        }

        public String toString() {
            if (this.f340121b == org.threeten.bp.format.o.FULL) {
                return "Text(" + this.f340120a + ")";
            }
            return "Text(" + this.f340120a + "," + this.f340121b + ")";
        }
    }

    static final class u implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f340124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f340125b;

        public u(char c10, int i10) {
            this.f340124a = c10;
            this.f340125b = i10;
        }

        private h a(org.threeten.bp.temporal.p pVar) {
            char c10 = this.f340124a;
            if (c10 == 'W') {
                return new n(pVar.h(), 1, 2, org.threeten.bp.format.l.NOT_NEGATIVE);
            }
            if (c10 == 'Y') {
                if (this.f340125b == 2) {
                    return new q(pVar.g(), 2, 2, 0, q.f340111i);
                }
                org.threeten.bp.temporal.j jVarG = pVar.g();
                int i10 = this.f340125b;
                return new n(jVarG, i10, 19, i10 < 4 ? org.threeten.bp.format.l.NORMAL : org.threeten.bp.format.l.EXCEEDS_PAD, -1, null);
            }
            if (c10 != 'c' && c10 != 'e') {
                if (c10 != 'w') {
                    return null;
                }
                return new n(pVar.i(), this.f340125b, 2, org.threeten.bp.format.l.NOT_NEGATIVE);
            }
            return new n(pVar.b(), this.f340125b, 2, org.threeten.bp.format.l.NOT_NEGATIVE);
        }

        @Override // org.threeten.bp.format.d.h
        public int b(org.threeten.bp.format.e eVar, CharSequence charSequence, int i10) {
            return a(org.threeten.bp.temporal.p.e(eVar.i())).b(eVar, charSequence, i10);
        }

        @Override // org.threeten.bp.format.d.h
        public boolean c(org.threeten.bp.format.g gVar, StringBuilder sb2) {
            return a(org.threeten.bp.temporal.p.e(gVar.c())).c(gVar, sb2);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Localized(");
            char c10 = this.f340124a;
            if (c10 == 'Y') {
                int i10 = this.f340125b;
                if (i10 == 1) {
                    sb2.append("WeekBasedYear");
                } else if (i10 == 2) {
                    sb2.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
                } else {
                    sb2.append("WeekBasedYear,");
                    sb2.append(this.f340125b);
                    sb2.append(",");
                    sb2.append(19);
                    sb2.append(",");
                    sb2.append(this.f340125b < 4 ? org.threeten.bp.format.l.NORMAL : org.threeten.bp.format.l.EXCEEDS_PAD);
                }
            } else {
                if (c10 == 'c' || c10 == 'e') {
                    sb2.append("DayOfWeek");
                } else if (c10 == 'w') {
                    sb2.append("WeekOfWeekBasedYear");
                } else if (c10 == 'W') {
                    sb2.append("WeekOfMonth");
                }
                sb2.append(",");
                sb2.append(this.f340125b);
            }
            sb2.append(")");
            return sb2.toString();
        }
    }

    static final class v implements h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static volatile Map.Entry<Integer, a> f340126c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final org.threeten.bp.temporal.l<org.threeten.bp.r> f340127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f340128b;

        private static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final int f340129a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Map<CharSequence, a> f340130b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Map<String, a> f340131c;

            /* synthetic */ a(int i10, a aVar) {
                this(i10);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void c(String str) {
                int length = str.length();
                int i10 = this.f340129a;
                if (length == i10) {
                    this.f340130b.put(str, null);
                    this.f340131c.put(str.toLowerCase(Locale.ENGLISH), null);
                    return;
                }
                if (length > i10) {
                    String strSubstring = str.substring(0, i10);
                    a aVar = this.f340130b.get(strSubstring);
                    if (aVar == null) {
                        aVar = new a(length);
                        this.f340130b.put(strSubstring, aVar);
                        this.f340131c.put(strSubstring.toLowerCase(Locale.ENGLISH), aVar);
                    }
                    aVar.c(str);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public a d(CharSequence charSequence, boolean z10) {
                return z10 ? this.f340130b.get(charSequence) : this.f340131c.get(charSequence.toString().toLowerCase(Locale.ENGLISH));
            }

            private a(int i10) {
                this.f340130b = new HashMap();
                this.f340131c = new HashMap();
                this.f340129a = i10;
            }
        }

        v(org.threeten.bp.temporal.l<org.threeten.bp.r> lVar, String str) {
            this.f340127a = lVar;
            this.f340128b = str;
        }

        private org.threeten.bp.r a(Set<String> set, String str, boolean z10) {
            if (str == null) {
                return null;
            }
            if (z10) {
                return set.contains(str) ? org.threeten.bp.r.E(str) : null;
            }
            for (String str2 : set) {
                if (str2.equalsIgnoreCase(str)) {
                    return org.threeten.bp.r.E(str2);
                }
            }
            return null;
        }

        private int d(org.threeten.bp.format.e eVar, CharSequence charSequence, int i10, int i11) {
            String upperCase = charSequence.subSequence(i10, i11).toString().toUpperCase();
            org.threeten.bp.format.e eVarE = eVar.e();
            if (i11 < charSequence.length() && eVar.c(charSequence.charAt(i11), 'Z')) {
                eVar.p(org.threeten.bp.r.I(upperCase, org.threeten.bp.s.f340320n));
                return i11;
            }
            int iB = o.f340104d.b(eVarE, charSequence, i11);
            if (iB < 0) {
                eVar.p(org.threeten.bp.r.I(upperCase, org.threeten.bp.s.f340320n));
                return i11;
            }
            eVar.p(org.threeten.bp.r.I(upperCase, org.threeten.bp.s.X((int) eVarE.j(org.threeten.bp.temporal.a.f340346n3).longValue())));
            return iB;
        }

        private static a e(Set<String> set) {
            ArrayList arrayList = new ArrayList(set);
            Collections.sort(arrayList, d.f340070j);
            a aVar = new a(((String) arrayList.get(0)).length(), null);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                aVar.c((String) it.next());
            }
            return aVar;
        }

        @Override // org.threeten.bp.format.d.h
        public int b(org.threeten.bp.format.e eVar, CharSequence charSequence, int i10) {
            int i11;
            int i12;
            int length = charSequence.length();
            if (i10 > length) {
                throw new IndexOutOfBoundsException();
            }
            if (i10 == length) {
                return ~i10;
            }
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt != '+' && cCharAt != '-') {
                int i13 = i10 + 2;
                if (length >= i13) {
                    char cCharAt2 = charSequence.charAt(i10 + 1);
                    if (eVar.c(cCharAt, 'U') && eVar.c(cCharAt2, org.locationtech.jts.geom.l.f338158h)) {
                        int i14 = i10 + 3;
                        return (length < i14 || !eVar.c(charSequence.charAt(i13), 'C')) ? d(eVar, charSequence, i10, i13) : d(eVar, charSequence, i10, i14);
                    }
                    if (eVar.c(cCharAt, 'G') && length >= (i12 = i10 + 3) && eVar.c(cCharAt2, ni.f.f333370g) && eVar.c(charSequence.charAt(i13), org.locationtech.jts.geom.l.f338158h)) {
                        return d(eVar, charSequence, i10, i12);
                    }
                }
                Set<String> setA = org.threeten.bp.zone.k.a();
                int size = setA.size();
                Map.Entry<Integer, a> simpleImmutableEntry = f340126c;
                if (simpleImmutableEntry == null || simpleImmutableEntry.getKey().intValue() != size) {
                    synchronized (this) {
                        try {
                            simpleImmutableEntry = f340126c;
                            if (simpleImmutableEntry == null || simpleImmutableEntry.getKey().intValue() != size) {
                                simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry<>(Integer.valueOf(size), e(setA));
                                f340126c = simpleImmutableEntry;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                a value = simpleImmutableEntry.getValue();
                String str = null;
                String str2 = null;
                while (value != null && (i11 = value.f340129a + i10) <= length) {
                    String string = charSequence.subSequence(i10, i11).toString();
                    value = value.d(string, eVar.l());
                    str2 = str;
                    str = string;
                }
                org.threeten.bp.r rVarA = a(setA, str, eVar.l());
                if (rVarA == null) {
                    rVarA = a(setA, str2, eVar.l());
                    if (rVarA == null) {
                        if (!eVar.c(cCharAt, 'Z')) {
                            return ~i10;
                        }
                        eVar.p(org.threeten.bp.s.f340320n);
                        return i10 + 1;
                    }
                    str = str2;
                }
                eVar.p(rVarA);
                return i10 + str.length();
            }
            org.threeten.bp.format.e eVarE = eVar.e();
            int iB = o.f340104d.b(eVarE, charSequence, i10);
            if (iB < 0) {
                return iB;
            }
            eVar.p(org.threeten.bp.s.X((int) eVarE.j(org.threeten.bp.temporal.a.f340346n3).longValue()));
            return iB;
        }

        @Override // org.threeten.bp.format.d.h
        public boolean c(org.threeten.bp.format.g gVar, StringBuilder sb2) {
            org.threeten.bp.r rVar = (org.threeten.bp.r) gVar.g(this.f340127a);
            if (rVar == null) {
                return false;
            }
            sb2.append(rVar.getId());
            return true;
        }

        public String toString() {
            return this.f340128b;
        }
    }

    static final class w implements h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Comparator<String> f340132b = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final org.threeten.bp.format.o f340133a;

        class a implements Comparator<String> {
            a() {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(String str, String str2) {
                int length = str2.length() - str.length();
                return length == 0 ? str.compareTo(str2) : length;
            }
        }

        w(org.threeten.bp.format.o oVar) {
            this.f340133a = (org.threeten.bp.format.o) cn.d.j(oVar, "textStyle");
        }

        private int a(org.threeten.bp.format.e eVar, CharSequence charSequence, int i10, String str) {
            int length = str.length();
            int i11 = i10 + length;
            if (i11 >= charSequence.length()) {
                eVar.p(org.threeten.bp.r.E(str));
                return i11;
            }
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt != '+' && cCharAt != '-') {
                eVar.p(org.threeten.bp.r.E(str));
                return i11;
            }
            org.threeten.bp.format.e eVarE = eVar.e();
            try {
                int iB = o.f340105e.b(eVarE, charSequence, i11);
                if (iB < 0) {
                    eVar.p(org.threeten.bp.r.E(str));
                    return i11;
                }
                org.threeten.bp.s sVarX = org.threeten.bp.s.X((int) eVarE.j(org.threeten.bp.temporal.a.f340346n3).longValue());
                eVar.p(length == 0 ? sVarX : org.threeten.bp.r.I(str, sVarX));
                return iB;
            } catch (org.threeten.bp.b unused) {
                return ~i10;
            }
        }

        @Override // org.threeten.bp.format.d.h
        public int b(org.threeten.bp.format.e eVar, CharSequence charSequence, int i10) {
            int length = charSequence.length();
            if (i10 > length) {
                throw new IndexOutOfBoundsException();
            }
            if (i10 == length) {
                return ~i10;
            }
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt == '+' || cCharAt == '-') {
                return i10 + 6 > length ? ~i10 : a(eVar, charSequence, i10, "");
            }
            if (eVar.v(charSequence, i10, org.apache.commons.lang3.time.m.f337525a, 0, 3)) {
                return a(eVar, charSequence, i10, org.apache.commons.lang3.time.m.f337525a);
            }
            if (eVar.v(charSequence, i10, "UTC", 0, 3)) {
                return a(eVar, charSequence, i10, "UTC");
            }
            if (eVar.v(charSequence, i10, "UT", 0, 2)) {
                return a(eVar, charSequence, i10, "UT");
            }
            TreeMap treeMap = new TreeMap(f340132b);
            for (String str : org.threeten.bp.r.x()) {
                treeMap.put(str, str);
                TimeZone timeZone = TimeZone.getTimeZone(str);
                int i11 = this.f340133a.k() == org.threeten.bp.format.o.FULL ? 1 : 0;
                String displayName = timeZone.getDisplayName(false, i11, eVar.i());
                if (str.startsWith("Etc/") || (!displayName.startsWith("GMT+") && !displayName.startsWith("GMT+"))) {
                    treeMap.put(displayName, str);
                }
                String displayName2 = timeZone.getDisplayName(true, i11, eVar.i());
                if (str.startsWith("Etc/") || (!displayName2.startsWith("GMT+") && !displayName2.startsWith("GMT+"))) {
                    treeMap.put(displayName2, str);
                }
            }
            for (Map.Entry entry : treeMap.entrySet()) {
                String str2 = (String) entry.getKey();
                if (eVar.v(charSequence, i10, str2, 0, str2.length())) {
                    eVar.p(org.threeten.bp.r.E((String) entry.getValue()));
                    return i10 + str2.length();
                }
            }
            if (cCharAt != 'Z') {
                return ~i10;
            }
            eVar.p(org.threeten.bp.s.f340320n);
            return i10 + 1;
        }

        @Override // org.threeten.bp.format.d.h
        public boolean c(org.threeten.bp.format.g gVar, StringBuilder sb2) {
            boolean zI;
            org.threeten.bp.r rVar = (org.threeten.bp.r) gVar.g(org.threeten.bp.temporal.k.g());
            if (rVar == null) {
                return false;
            }
            if (rVar.D() instanceof org.threeten.bp.s) {
                sb2.append(rVar.getId());
                return true;
            }
            org.threeten.bp.temporal.f fVarE = gVar.e();
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340344m3;
            if (fVarE.q(aVar)) {
                zI = rVar.z().i(org.threeten.bp.f.Z(fVarE.t(aVar)));
            } else {
                zI = false;
            }
            sb2.append(TimeZone.getTimeZone(rVar.getId()).getDisplayName(zI, this.f340133a.k() == org.threeten.bp.format.o.FULL ? 1 : 0, gVar.c()));
            return true;
        }

        public String toString() {
            return "ZoneText(" + this.f340133a + ")";
        }
    }

    static {
        HashMap map = new HashMap();
        f340069i = map;
        map.put('G', org.threeten.bp.temporal.a.f340342l3);
        map.put('y', org.threeten.bp.temporal.a.f340338j3);
        map.put(Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), org.threeten.bp.temporal.a.f340340k3);
        org.threeten.bp.temporal.j jVar = org.threeten.bp.temporal.c.f340380b;
        map.put('Q', jVar);
        map.put('q', jVar);
        Character chValueOf = Character.valueOf(ni.f.f333370g);
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340334h3;
        map.put(chValueOf, aVar);
        map.put('L', aVar);
        map.put('D', org.threeten.bp.temporal.a.f340350p1);
        map.put(Character.valueOf(ni.f.f333369f), org.threeten.bp.temporal.a.f340349p0);
        map.put(Character.valueOf(org.locationtech.jts.geom.l.f338157g), org.threeten.bp.temporal.a.Y);
        org.threeten.bp.temporal.a aVar2 = org.threeten.bp.temporal.a.X;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', org.threeten.bp.temporal.a.f340355w);
        map.put('H', org.threeten.bp.temporal.a.f340353t);
        map.put('k', org.threeten.bp.temporal.a.f340354v);
        map.put('K', org.threeten.bp.temporal.a.f340347o);
        map.put(Character.valueOf(ni.f.f333368e), org.threeten.bp.temporal.a.f340352s);
        map.put(Character.valueOf(ni.f.f333367d), org.threeten.bp.temporal.a.f340343m);
        map.put(Character.valueOf(ni.f.f333366c), org.threeten.bp.temporal.a.f340339k);
        org.threeten.bp.temporal.a aVar3 = org.threeten.bp.temporal.a.f340329e;
        map.put('S', aVar3);
        map.put('A', org.threeten.bp.temporal.a.f340337j);
        map.put('n', aVar3);
        map.put('N', org.threeten.bp.temporal.a.f340330f);
        f340070j = new c();
    }

    public d() {
        this.f340071a = this;
        this.f340073c = new ArrayList();
        this.f340077g = -1;
        this.f340072b = null;
        this.f340074d = false;
    }

    public static String D(org.threeten.bp.format.j jVar, org.threeten.bp.format.j jVar2, org.threeten.bp.chrono.j jVar3, Locale locale) {
        DateFormat timeInstance;
        cn.d.j(locale, "locale");
        cn.d.j(jVar3, "chrono");
        if (jVar == null && jVar2 == null) {
            throw new IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
        }
        if (jVar != null) {
            timeInstance = jVar2 != null ? DateFormat.getDateTimeInstance(jVar.ordinal(), jVar2.ordinal(), locale) : DateFormat.getDateInstance(jVar.ordinal(), locale);
        } else {
            timeInstance = DateFormat.getTimeInstance(jVar2.ordinal(), locale);
        }
        if (timeInstance instanceof SimpleDateFormat) {
            return ((SimpleDateFormat) timeInstance).toPattern();
        }
        throw new IllegalArgumentException("Unable to determine pattern");
    }

    /* JADX WARN: Code duplicated, block: B:122:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:124:0x01d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:127:0x01d8  */
    /* JADX WARN: Instruction removed from duplicated block: B:127:0x01d8, please report this as an issue */
    private void L(char c10, int i10, org.threeten.bp.temporal.j jVar) {
        int i11 = 5 >> 3;
        if (c10 != 'Q') {
            if (c10 == 'S') {
                d(org.threeten.bp.temporal.a.f340329e, i10, i10, false);
                return;
            }
            if (c10 == 'a') {
                if (i10 == 1) {
                    r(jVar, org.threeten.bp.format.o.SHORT);
                    return;
                }
                throw new IllegalArgumentException("Too many pattern letters: " + c10);
            }
            if (c10 != 'h' && c10 != 'k' && c10 != 'm') {
                if (c10 != 'q') {
                    if (c10 != 's') {
                        if (c10 == 'u' || c10 == 'y') {
                            if (i10 == 2) {
                                x(jVar, 2, 2, q.f340111i);
                                return;
                            } else if (i10 < 4) {
                                v(jVar, i10, 19, org.threeten.bp.format.l.NORMAL);
                                return;
                            } else {
                                v(jVar, i10, 19, org.threeten.bp.format.l.EXCEEDS_PAD);
                                return;
                            }
                        }
                        switch (c10) {
                            case com.planner5d.library.engine.input.f.b.V /* 68 */:
                                if (i10 == 1) {
                                    t(jVar);
                                    return;
                                } else {
                                    if (i10 <= 3) {
                                        u(jVar, i10);
                                        return;
                                    }
                                    throw new IllegalArgumentException("Too many pattern letters: " + c10);
                                }
                            case com.planner5d.library.engine.input.f.b.f160708m0 /* 69 */:
                            case 'G':
                                if (i10 == 1 || i10 == 2 || i10 == 3) {
                                    r(jVar, org.threeten.bp.format.o.SHORT);
                                    return;
                                }
                                if (i10 == 4) {
                                    r(jVar, org.threeten.bp.format.o.FULL);
                                    return;
                                } else {
                                    if (i10 == 5) {
                                        r(jVar, org.threeten.bp.format.o.NARROW);
                                        return;
                                    }
                                    throw new IllegalArgumentException("Too many pattern letters: " + c10);
                                }
                            case 'F':
                                if (i10 == 1) {
                                    t(jVar);
                                    return;
                                }
                                throw new IllegalArgumentException("Too many pattern letters: " + c10);
                            default:
                                switch (c10) {
                                    case 'K':
                                        break;
                                    case 'L':
                                        break;
                                    case com.planner5d.library.engine.input.f.b.f160716p /* 77 */:
                                        break;
                                    default:
                                        switch (c10) {
                                            case 'c':
                                                if (i10 == 1) {
                                                    g(new u('c', i10));
                                                    return;
                                                }
                                                if (i10 == 2) {
                                                    throw new IllegalArgumentException("Invalid number of pattern letters: " + c10);
                                                }
                                                if (i10 == 3) {
                                                    r(jVar, org.threeten.bp.format.o.SHORT_STANDALONE);
                                                    return;
                                                }
                                                if (i10 == 4) {
                                                    r(jVar, org.threeten.bp.format.o.FULL_STANDALONE);
                                                    return;
                                                } else {
                                                    if (i10 == 5) {
                                                        r(jVar, org.threeten.bp.format.o.NARROW_STANDALONE);
                                                        return;
                                                    }
                                                    throw new IllegalArgumentException("Too many pattern letters: " + c10);
                                                }
                                            case 'd':
                                                break;
                                            case 'e':
                                                if (i10 == 1 || i10 == 2) {
                                                    g(new u('e', i10));
                                                    return;
                                                }
                                                if (i10 == 3) {
                                                    r(jVar, org.threeten.bp.format.o.SHORT);
                                                    return;
                                                }
                                                if (i10 == 4) {
                                                    r(jVar, org.threeten.bp.format.o.FULL);
                                                    return;
                                                } else {
                                                    if (i10 == 5) {
                                                        r(jVar, org.threeten.bp.format.o.NARROW);
                                                        return;
                                                    }
                                                    throw new IllegalArgumentException("Too many pattern letters: " + c10);
                                                }
                                            default:
                                                if (i10 == 1) {
                                                    t(jVar);
                                                    return;
                                                } else {
                                                    u(jVar, i10);
                                                    return;
                                                }
                                        }
                                        break;
                                }
                            case 'H':
                                if (i10 == 1) {
                                    t(jVar);
                                    return;
                                } else {
                                    if (i10 == 2) {
                                        u(jVar, i10);
                                        return;
                                    }
                                    throw new IllegalArgumentException("Too many pattern letters: " + c10);
                                }
                        }
                    }
                }
                if (i10 == 1) {
                    t(jVar);
                    return;
                }
                if (i10 == 2) {
                    u(jVar, 2);
                    return;
                }
                if (i10 == 3) {
                    r(jVar, org.threeten.bp.format.o.SHORT_STANDALONE);
                    return;
                }
                if (i10 == 4) {
                    r(jVar, org.threeten.bp.format.o.FULL_STANDALONE);
                    return;
                } else {
                    if (i10 == 5) {
                        r(jVar, org.threeten.bp.format.o.NARROW_STANDALONE);
                        return;
                    }
                    throw new IllegalArgumentException("Too many pattern letters: " + c10);
                }
            }
            if (i10 == 1) {
                t(jVar);
                return;
            } else {
                if (i10 == 2) {
                    u(jVar, i10);
                    return;
                }
                throw new IllegalArgumentException("Too many pattern letters: " + c10);
            }
        }
        if (i10 == 1) {
            t(jVar);
            return;
        }
        if (i10 == 2) {
            u(jVar, 2);
            return;
        }
        if (i10 == 3) {
            r(jVar, org.threeten.bp.format.o.SHORT);
            return;
        }
        if (i10 == 4) {
            r(jVar, org.threeten.bp.format.o.FULL);
        } else {
            if (i10 == 5) {
                r(jVar, org.threeten.bp.format.o.NARROW);
                return;
            }
            throw new IllegalArgumentException("Too many pattern letters: " + c10);
        }
    }

    private void N(String str) {
        int i10;
        int i11 = 0;
        while (i11 < str.length()) {
            char cCharAt = str.charAt(i11);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                int i12 = i11 + 1;
                while (i12 < str.length() && str.charAt(i12) == cCharAt) {
                    i12++;
                }
                int i13 = i12 - i11;
                if (cCharAt == 'p') {
                    if (i12 >= str.length() || (((cCharAt = str.charAt(i12)) < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z'))) {
                        i10 = i13;
                        i13 = 0;
                    } else {
                        int i14 = i12 + 1;
                        while (i14 < str.length() && str.charAt(i14) == cCharAt) {
                            i14++;
                        }
                        i10 = i14 - i12;
                        i12 = i14;
                    }
                    if (i13 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: " + str);
                    }
                    G(i13);
                    i13 = i10;
                }
                org.threeten.bp.temporal.j jVar = f340069i.get(Character.valueOf(cCharAt));
                if (jVar != null) {
                    L(cCharAt, i13, jVar);
                } else if (cCharAt == 'z') {
                    if (i13 > 4) {
                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                    }
                    if (i13 == 4) {
                        B(org.threeten.bp.format.o.FULL);
                    } else {
                        B(org.threeten.bp.format.o.SHORT);
                    }
                } else if (cCharAt != 'V') {
                    String str2 = "+0000";
                    int i15 = 5 ^ 5;
                    if (cCharAt == 'Z') {
                        if (i13 < 4) {
                            l("+HHMM", "+0000");
                        } else if (i13 == 4) {
                            k(org.threeten.bp.format.o.FULL);
                        } else {
                            if (i13 != 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            l("+HH:MM:ss", org.locationtech.jts.io.gml2.a.f338505w);
                        }
                    } else if (cCharAt == 'O') {
                        if (i13 == 1) {
                            k(org.threeten.bp.format.o.SHORT);
                        } else {
                            if (i13 != 4) {
                                throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + cCharAt);
                            }
                            k(org.threeten.bp.format.o.FULL);
                        }
                    } else if (cCharAt == 'X') {
                        if (i13 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        l(o.f340103c[i13 + (i13 == 1 ? 0 : 1)], org.locationtech.jts.io.gml2.a.f338505w);
                    } else if (cCharAt == 'x') {
                        if (i13 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        if (i13 == 1) {
                            str2 = "+00";
                        } else if (i13 % 2 != 0) {
                            str2 = "+00:00";
                        }
                        l(o.f340103c[i13 + (i13 == 1 ? 0 : 1)], str2);
                    } else if (cCharAt == 'W') {
                        if (i13 > 1) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        g(new u('W', i13));
                    } else if (cCharAt == 'w') {
                        if (i13 > 2) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        g(new u('w', i13));
                    } else {
                        if (cCharAt != 'Y') {
                            throw new IllegalArgumentException("Unknown pattern letter: " + cCharAt);
                        }
                        g(new u(ni.f.f333371h, i13));
                    }
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("Pattern letter count must be 2: " + cCharAt);
                    }
                    y();
                }
                i11 = i12 - 1;
            } else if (cCharAt == '\'') {
                int i16 = i11 + 1;
                int i17 = i16;
                while (i17 < str.length()) {
                    if (str.charAt(i17) == '\'') {
                        int i18 = i17 + 1;
                        if (i18 >= str.length() || str.charAt(i18) != '\'') {
                            break;
                        } else {
                            i17 = i18;
                        }
                    }
                    i17++;
                }
                if (i17 >= str.length()) {
                    throw new IllegalArgumentException("Pattern ends with an incomplete string literal: " + str);
                }
                String strSubstring = str.substring(i16, i17);
                if (strSubstring.length() == 0) {
                    h('\'');
                } else {
                    i(strSubstring.replace("''", "'"));
                }
                i11 = i17;
            } else if (cCharAt == '[') {
                F();
            } else if (cCharAt == ']') {
                if (this.f340071a.f340072b == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                E();
            } else {
                if (cCharAt == '{' || cCharAt == '}' || cCharAt == '#') {
                    throw new IllegalArgumentException("Pattern includes reserved character: '" + cCharAt + "'");
                }
                h(cCharAt);
            }
            i11++;
        }
    }

    private int g(h hVar) {
        cn.d.j(hVar, "pp");
        d dVar = this.f340071a;
        int i10 = dVar.f340075e;
        if (i10 > 0) {
            if (hVar != null) {
                hVar = new p(hVar, i10, dVar.f340076f);
            }
            d dVar2 = this.f340071a;
            dVar2.f340075e = 0;
            dVar2.f340076f = (char) 0;
        }
        this.f340071a.f340073c.add(hVar);
        d dVar3 = this.f340071a;
        dVar3.f340077g = -1;
        return dVar3.f340073c.size() - 1;
    }

    private d s(n nVar) {
        n nVarF;
        d dVar = this.f340071a;
        int i10 = dVar.f340077g;
        if (i10 < 0 || !(dVar.f340073c.get(i10) instanceof n)) {
            this.f340071a.f340077g = g(nVar);
            return this;
        }
        d dVar2 = this.f340071a;
        int i11 = dVar2.f340077g;
        n nVar2 = (n) dVar2.f340073c.get(i11);
        int i12 = nVar.f340099b;
        int i13 = nVar.f340100c;
        if (i12 == i13 && nVar.f340101d == org.threeten.bp.format.l.NOT_NEGATIVE) {
            nVarF = nVar2.g(i13);
            g(nVar.f());
            this.f340071a.f340077g = i11;
        } else {
            nVarF = nVar2.f();
            this.f340071a.f340077g = g(nVar);
        }
        this.f340071a.f340073c.set(i11, nVarF);
        return this;
    }

    public d A() {
        g(new v(f340068h, "ZoneRegionId()"));
        return this;
    }

    public d B(org.threeten.bp.format.o oVar) {
        g(new w(oVar));
        return this;
    }

    public d C(org.threeten.bp.format.o oVar, Set<org.threeten.bp.r> set) {
        cn.d.j(set, "preferredZones");
        g(new w(oVar));
        return this;
    }

    public d E() {
        d dVar = this.f340071a;
        if (dVar.f340072b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (dVar.f340073c.size() <= 0) {
            this.f340071a = this.f340071a.f340072b;
            return this;
        }
        d dVar2 = this.f340071a;
        g gVar = new g(dVar2.f340073c, dVar2.f340074d);
        this.f340071a = this.f340071a.f340072b;
        g(gVar);
        return this;
    }

    public d F() {
        d dVar = this.f340071a;
        dVar.f340077g = -1;
        this.f340071a = new d(dVar, true);
        return this;
    }

    public d G(int i10) {
        return H(i10, ' ');
    }

    public d H(int i10, char c10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("The pad width must be at least one but was " + i10);
        }
        d dVar = this.f340071a;
        dVar.f340075e = i10;
        dVar.f340076f = c10;
        dVar.f340077g = -1;
        return this;
    }

    public d I() {
        g(r.INSENSITIVE);
        return this;
    }

    public d J() {
        g(r.SENSITIVE);
        return this;
    }

    public d K(org.threeten.bp.temporal.j jVar, long j10) {
        cn.d.j(jVar, "field");
        g(new i(jVar, j10));
        return this;
    }

    public d M() {
        g(r.LENIENT);
        return this;
    }

    public d O() {
        g(r.STRICT);
        return this;
    }

    public org.threeten.bp.format.c P() {
        return Q(Locale.getDefault());
    }

    public org.threeten.bp.format.c Q(Locale locale) {
        cn.d.j(locale, "locale");
        while (this.f340071a.f340072b != null) {
            E();
        }
        return new org.threeten.bp.format.c(new g(this.f340073c, false), locale, org.threeten.bp.format.i.f340161e, org.threeten.bp.format.k.SMART, null, null, null);
    }

    org.threeten.bp.format.c R(org.threeten.bp.format.k kVar) {
        return P().I(kVar);
    }

    public d a(org.threeten.bp.format.c cVar) {
        cn.d.j(cVar, "formatter");
        g(cVar.C(false));
        return this;
    }

    public d b() {
        g(new f(null));
        return this;
    }

    public d c(org.threeten.bp.format.o oVar) {
        cn.d.j(oVar, "textStyle");
        g(new f(oVar));
        return this;
    }

    public d d(org.threeten.bp.temporal.j jVar, int i10, int i11, boolean z10) {
        g(new j(jVar, i10, i11, z10));
        return this;
    }

    public d e() {
        g(new k(-2));
        return this;
    }

    public d f(int i10) {
        if (i10 >= -1 && i10 <= 9) {
            g(new k(i10));
            return this;
        }
        throw new IllegalArgumentException("Invalid fractional digits: " + i10);
    }

    public d h(char c10) {
        g(new e(c10));
        return this;
    }

    public d i(String str) {
        cn.d.j(str, "literal");
        if (str.length() > 0) {
            if (str.length() == 1) {
                g(new e(str.charAt(0)));
                return this;
            }
            g(new s(str));
        }
        return this;
    }

    public d j(org.threeten.bp.format.j jVar, org.threeten.bp.format.j jVar2) {
        if (jVar == null && jVar2 == null) {
            throw new IllegalArgumentException("Either the date or time style must be non-null");
        }
        g(new m(jVar, jVar2));
        return this;
    }

    public d k(org.threeten.bp.format.o oVar) {
        cn.d.j(oVar, "style");
        if (oVar != org.threeten.bp.format.o.FULL && oVar != org.threeten.bp.format.o.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        g(new l(oVar));
        return this;
    }

    public d l(String str, String str2) {
        g(new o(str2, str));
        return this;
    }

    public d m() {
        g(o.f340104d);
        return this;
    }

    public d n(org.threeten.bp.format.c cVar) {
        cn.d.j(cVar, "formatter");
        g(cVar.C(true));
        return this;
    }

    public d o(String str) {
        cn.d.j(str, "pattern");
        N(str);
        return this;
    }

    public d p(org.threeten.bp.temporal.j jVar) {
        return r(jVar, org.threeten.bp.format.o.FULL);
    }

    public d q(org.threeten.bp.temporal.j jVar, Map<Long, String> map) {
        cn.d.j(jVar, "field");
        cn.d.j(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        org.threeten.bp.format.o oVar = org.threeten.bp.format.o.FULL;
        g(new t(jVar, oVar, new b(new org.threeten.bp.format.n.b(Collections.singletonMap(oVar, linkedHashMap)))));
        return this;
    }

    public d r(org.threeten.bp.temporal.j jVar, org.threeten.bp.format.o oVar) {
        cn.d.j(jVar, "field");
        cn.d.j(oVar, "textStyle");
        g(new t(jVar, oVar, org.threeten.bp.format.h.b()));
        return this;
    }

    public d t(org.threeten.bp.temporal.j jVar) {
        cn.d.j(jVar, "field");
        s(new n(jVar, 1, 19, org.threeten.bp.format.l.NORMAL));
        return this;
    }

    public d u(org.threeten.bp.temporal.j jVar, int i10) {
        cn.d.j(jVar, "field");
        if (i10 >= 1 && i10 <= 19) {
            s(new n(jVar, i10, i10, org.threeten.bp.format.l.NOT_NEGATIVE));
            return this;
        }
        throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i10);
    }

    public d v(org.threeten.bp.temporal.j jVar, int i10, int i11, org.threeten.bp.format.l lVar) {
        if (i10 == i11 && lVar == org.threeten.bp.format.l.NOT_NEGATIVE) {
            return u(jVar, i11);
        }
        cn.d.j(jVar, "field");
        cn.d.j(lVar, "signStyle");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i10);
        }
        if (i11 < 1 || i11 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i11);
        }
        if (i11 >= i10) {
            s(new n(jVar, i10, i11, lVar));
            return this;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
    }

    public d w(org.threeten.bp.temporal.j jVar, int i10, int i11, int i12) {
        cn.d.j(jVar, "field");
        s(new q(jVar, i10, i11, i12, null));
        return this;
    }

    public d x(org.threeten.bp.temporal.j jVar, int i10, int i11, org.threeten.bp.chrono.c cVar) {
        cn.d.j(jVar, "field");
        cn.d.j(cVar, "baseDate");
        s(new q(jVar, i10, i11, 0, cVar));
        return this;
    }

    public d y() {
        g(new v(org.threeten.bp.temporal.k.g(), "ZoneId()"));
        return this;
    }

    public d z() {
        g(new v(org.threeten.bp.temporal.k.f(), "ZoneOrOffsetId()"));
        return this;
    }

    private d(d dVar, boolean z10) {
        this.f340071a = this;
        this.f340073c = new ArrayList();
        this.f340077g = -1;
        this.f340072b = dVar;
        this.f340074d = z10;
    }

    static final class q extends n {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final org.threeten.bp.g f340111i = org.threeten.bp.g.C0(2000, 1, 1);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f340112g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final org.threeten.bp.chrono.c f340113h;

        q(org.threeten.bp.temporal.j jVar, int i10, int i11, int i12, org.threeten.bp.chrono.c cVar) {
            super(jVar, i10, i11, org.threeten.bp.format.l.NOT_NEGATIVE);
            if (i10 < 1 || i10 > 10) {
                throw new IllegalArgumentException("The width must be from 1 to 10 inclusive but was " + i10);
            }
            if (i11 < 1 || i11 > 10) {
                throw new IllegalArgumentException("The maxWidth must be from 1 to 10 inclusive but was " + i11);
            }
            if (i11 < i10) {
                throw new IllegalArgumentException("The maxWidth must be greater than the width");
            }
            if (cVar == null) {
                long j10 = i12;
                if (!jVar.range().j(j10)) {
                    throw new IllegalArgumentException("The base value must be within the range of the field");
                }
                if (j10 + ((long) n.f340097f[i10]) > g3.f12256c) {
                    throw new org.threeten.bp.b("Unable to add printer-parser as the range exceeds the capacity of an int");
                }
            }
            this.f340112g = i12;
            this.f340113h = cVar;
        }

        @Override // org.threeten.bp.format.d.n
        long a(org.threeten.bp.format.g gVar, long j10) {
            long jAbs = Math.abs(j10);
            int iL = this.f340112g;
            if (this.f340113h != null) {
                iL = org.threeten.bp.chrono.j.v(gVar.e()).e(this.f340113h).l(this.f340098a);
            }
            if (j10 >= iL) {
                int i10 = n.f340097f[this.f340099b];
                if (j10 < iL + i10) {
                    return jAbs % ((long) i10);
                }
            }
            return jAbs % ((long) n.f340097f[this.f340100c]);
        }

        @Override // org.threeten.bp.format.d.n
        boolean d(org.threeten.bp.format.e eVar) {
            if (eVar.m()) {
                return super.d(eVar);
            }
            return false;
        }

        @Override // org.threeten.bp.format.d.n
        int e(org.threeten.bp.format.e eVar, long j10, int i10, int i11) {
            q qVar;
            org.threeten.bp.format.e eVar2;
            int iL = this.f340112g;
            if (this.f340113h != null) {
                iL = eVar.h().e(this.f340113h).l(this.f340098a);
                qVar = this;
                eVar2 = eVar;
                eVar2.b(qVar, j10, i10, i11);
            } else {
                qVar = this;
                eVar2 = eVar;
            }
            int i12 = i11 - i10;
            int i13 = qVar.f340099b;
            if (i12 == i13 && j10 >= 0) {
                long j11 = n.f340097f[i13];
                long j12 = iL;
                long j13 = j12 - (j12 % j11);
                j10 = iL > 0 ? j13 + j10 : j13 - j10;
                if (j10 < j12) {
                    j10 += j11;
                }
            }
            return eVar2.r(qVar.f340098a, j10, i10, i11);
        }

        @Override // org.threeten.bp.format.d.n
        n f() {
            return this.f340102e == -1 ? this : new q(this.f340098a, this.f340099b, this.f340100c, this.f340112g, this.f340113h, -1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.threeten.bp.format.d.n
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public q g(int i10) {
            return new q(this.f340098a, this.f340099b, this.f340100c, this.f340112g, this.f340113h, this.f340102e + i10);
        }

        @Override // org.threeten.bp.format.d.n
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ReducedValue(");
            sb2.append(this.f340098a);
            sb2.append(",");
            sb2.append(this.f340099b);
            sb2.append(",");
            sb2.append(this.f340100c);
            sb2.append(",");
            Object objValueOf = this.f340113h;
            if (objValueOf == null) {
                objValueOf = Integer.valueOf(this.f340112g);
            }
            sb2.append(objValueOf);
            sb2.append(")");
            return sb2.toString();
        }

        private q(org.threeten.bp.temporal.j jVar, int i10, int i11, int i12, org.threeten.bp.chrono.c cVar, int i13) {
            super(jVar, i10, i11, org.threeten.bp.format.l.NOT_NEGATIVE, i13, null);
            this.f340112g = i12;
            this.f340113h = cVar;
        }
    }
}
