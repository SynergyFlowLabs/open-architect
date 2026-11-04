package org.threeten.bp.temporal;

import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ConcurrentMap<String, p> f340433h = new ConcurrentHashMap(4, 0.75f, 2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p f340434i = new p(org.threeten.bp.d.MONDAY, 4);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p f340435j = f(org.threeten.bp.d.SUNDAY, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f340436k = -1177360819670808121L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.threeten.bp.d f340437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f340438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient j f340439c = a.l(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient j f340440d = a.n(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient j f340441e = a.p(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient j f340442f = a.o(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient j f340443g = a.m(this);

    static class a implements j {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final o f340444f = o.k(1, 7);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final o f340445g = o.m(0, 1, 4, 6);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final o f340446h = o.m(0, 1, 52, 54);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final o f340447i = o.l(1, 52, 53);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final o f340448j = org.threeten.bp.temporal.a.f340340k3.range();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f340449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p f340450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final m f340451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final m f340452d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final o f340453e;

        private a(String str, p pVar, m mVar, m mVar2, o oVar) {
            this.f340449a = str;
            this.f340450b = pVar;
            this.f340451c = mVar;
            this.f340452d = mVar2;
            this.f340453e = oVar;
        }

        private int a(int i10, int i11) {
            return ((i10 + 7) + (i11 - 1)) / 7;
        }

        private int g(f fVar, int i10) {
            return cn.d.f(fVar.l(org.threeten.bp.temporal.a.X) - i10, 7) + 1;
        }

        private int h(f fVar) {
            int iF = cn.d.f(fVar.l(org.threeten.bp.temporal.a.X) - this.f340450b.c().getValue(), 7) + 1;
            int iL = fVar.l(org.threeten.bp.temporal.a.f340340k3);
            long jK = k(fVar, iF);
            if (jK == 0) {
                return iL - 1;
            }
            if (jK < 53) {
                return iL;
            }
            return jK >= ((long) a(r(fVar.l(org.threeten.bp.temporal.a.f340350p1), iF), (org.threeten.bp.p.O((long) iL) ? 366 : 365) + this.f340450b.d())) ? iL + 1 : iL;
        }

        private int i(f fVar) {
            int iF = cn.d.f(fVar.l(org.threeten.bp.temporal.a.X) - this.f340450b.c().getValue(), 7) + 1;
            long jK = k(fVar, iF);
            if (jK == 0) {
                return ((int) k(org.threeten.bp.chrono.j.v(fVar).e(fVar).f(1L, b.WEEKS), iF)) + 1;
            }
            if (jK >= 53) {
                int iA = a(r(fVar.l(org.threeten.bp.temporal.a.f340350p1), iF), (org.threeten.bp.p.O((long) fVar.l(org.threeten.bp.temporal.a.f340340k3)) ? 366 : 365) + this.f340450b.d());
                if (jK >= iA) {
                    return (int) (jK - ((long) (iA - 1)));
                }
            }
            return (int) jK;
        }

        private long j(f fVar, int i10) {
            int iL = fVar.l(org.threeten.bp.temporal.a.f340349p0);
            return a(r(iL, i10), iL);
        }

        private long k(f fVar, int i10) {
            int iL = fVar.l(org.threeten.bp.temporal.a.f340350p1);
            return a(r(iL, i10), iL);
        }

        static a l(p pVar) {
            return new a("DayOfWeek", pVar, b.DAYS, b.WEEKS, f340444f);
        }

        static a m(p pVar) {
            return new a("WeekBasedYear", pVar, c.f340383e, b.FOREVER, f340448j);
        }

        static a n(p pVar) {
            return new a("WeekOfMonth", pVar, b.WEEKS, b.MONTHS, f340445g);
        }

        static a o(p pVar) {
            return new a("WeekOfWeekBasedYear", pVar, b.WEEKS, c.f340383e, f340447i);
        }

        static a p(p pVar) {
            return new a("WeekOfYear", pVar, b.WEEKS, b.YEARS, f340446h);
        }

        private o q(f fVar) {
            int iF = cn.d.f(fVar.l(org.threeten.bp.temporal.a.X) - this.f340450b.c().getValue(), 7) + 1;
            long jK = k(fVar, iF);
            if (jK == 0) {
                return q(org.threeten.bp.chrono.j.v(fVar).e(fVar).f(2L, b.WEEKS));
            }
            int iA = a(r(fVar.l(org.threeten.bp.temporal.a.f340350p1), iF), (org.threeten.bp.p.O((long) fVar.l(org.threeten.bp.temporal.a.f340340k3)) ? 366 : 365) + this.f340450b.d());
            return jK >= ((long) iA) ? q(org.threeten.bp.chrono.j.v(fVar).e(fVar).v(2L, b.WEEKS)) : o.k(1L, iA - 1);
        }

        private int r(int i10, int i11) {
            int iF = cn.d.f(i10 - i11, 7);
            return iF + 1 > this.f340450b.d() ? 7 - iF : -iF;
        }

        @Override // org.threeten.bp.temporal.j
        public <R extends e> R b(R r10, long j10) {
            int iA = this.f340453e.a(j10, this);
            int iL = r10.l(this);
            if (iA == iL) {
                return r10;
            }
            if (this.f340452d != b.FOREVER) {
                return (R) r10.v(iA - iL, this.f340451c);
            }
            int iL2 = r10.l(this.f340450b.f340442f);
            long j11 = (long) ((j10 - ((long) iL)) * 52.1775d);
            b bVar = b.WEEKS;
            e eVarV = r10.v(j11, bVar);
            if (eVarV.l(this) > iA) {
                return (R) eVarV.f(eVarV.l(this.f340450b.f340442f), bVar);
            }
            if (eVarV.l(this) < iA) {
                eVarV = eVarV.v(2L, bVar);
            }
            R r11 = (R) eVarV.v(iL2 - eVarV.l(this.f340450b.f340442f), bVar);
            return r11.l(this) > iA ? (R) r11.f(1L, bVar) : r11;
        }

        @Override // org.threeten.bp.temporal.j
        public boolean c(f fVar) {
            if (!fVar.q(org.threeten.bp.temporal.a.X)) {
                return false;
            }
            m mVar = this.f340452d;
            if (mVar == b.WEEKS) {
                return true;
            }
            if (mVar == b.MONTHS) {
                return fVar.q(org.threeten.bp.temporal.a.f340349p0);
            }
            if (mVar == b.YEARS) {
                return fVar.q(org.threeten.bp.temporal.a.f340350p1);
            }
            if (mVar == c.f340383e || mVar == b.FOREVER) {
                return fVar.q(org.threeten.bp.temporal.a.H1);
            }
            return false;
        }

        @Override // org.threeten.bp.temporal.j
        public o d(f fVar) {
            org.threeten.bp.temporal.a aVar;
            m mVar = this.f340452d;
            if (mVar == b.WEEKS) {
                return this.f340453e;
            }
            if (mVar == b.MONTHS) {
                aVar = org.threeten.bp.temporal.a.f340349p0;
            } else {
                if (mVar != b.YEARS) {
                    if (mVar == c.f340383e) {
                        return q(fVar);
                    }
                    if (mVar == b.FOREVER) {
                        return fVar.c(org.threeten.bp.temporal.a.f340340k3);
                    }
                    throw new IllegalStateException("unreachable");
                }
                aVar = org.threeten.bp.temporal.a.f340350p1;
            }
            int iR = r(fVar.l(aVar), cn.d.f(fVar.l(org.threeten.bp.temporal.a.X) - this.f340450b.c().getValue(), 7) + 1);
            o oVarC = fVar.c(aVar);
            return o.k(a(iR, (int) oVarC.e()), a(iR, (int) oVarC.d()));
        }

        @Override // org.threeten.bp.temporal.j
        public long e(f fVar) {
            int iH;
            int iF = cn.d.f(fVar.l(org.threeten.bp.temporal.a.X) - this.f340450b.c().getValue(), 7) + 1;
            m mVar = this.f340452d;
            if (mVar == b.WEEKS) {
                return iF;
            }
            if (mVar == b.MONTHS) {
                int iL = fVar.l(org.threeten.bp.temporal.a.f340349p0);
                iH = a(r(iL, iF), iL);
            } else if (mVar == b.YEARS) {
                int iL2 = fVar.l(org.threeten.bp.temporal.a.f340350p1);
                iH = a(r(iL2, iF), iL2);
            } else if (mVar == c.f340383e) {
                iH = i(fVar);
            } else {
                if (mVar != b.FOREVER) {
                    throw new IllegalStateException("unreachable");
                }
                iH = h(fVar);
            }
            return iH;
        }

        @Override // org.threeten.bp.temporal.j
        public f f(Map<j, Long> map, f fVar, org.threeten.bp.format.k kVar) {
            long jA;
            org.threeten.bp.chrono.c cVarC;
            long jA2;
            org.threeten.bp.chrono.c cVarC2;
            long jA3;
            int iG;
            long jK;
            int value = this.f340450b.c().getValue();
            if (this.f340452d == b.WEEKS) {
                map.put(org.threeten.bp.temporal.a.X, Long.valueOf(cn.d.f((value - 1) + (this.f340453e.a(map.remove(this).longValue(), this) - 1), 7) + 1));
                return null;
            }
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.X;
            if (!map.containsKey(aVar)) {
                return null;
            }
            if (this.f340452d == b.FOREVER) {
                if (!map.containsKey(this.f340450b.f340442f)) {
                    return null;
                }
                org.threeten.bp.chrono.j jVarV = org.threeten.bp.chrono.j.v(fVar);
                int iF = cn.d.f(aVar.k(map.get(aVar).longValue()) - value, 7) + 1;
                int iA = range().a(map.get(this).longValue(), this);
                if (kVar == org.threeten.bp.format.k.LENIENT) {
                    cVarC2 = jVarV.c(iA, 1, this.f340450b.d());
                    jA3 = map.get(this.f340450b.f340442f).longValue();
                    iG = g(cVarC2, value);
                    jK = k(cVarC2, iG);
                } else {
                    cVarC2 = jVarV.c(iA, 1, this.f340450b.d());
                    jA3 = this.f340450b.f340442f.range().a(map.get(this.f340450b.f340442f).longValue(), this.f340450b.f340442f);
                    iG = g(cVarC2, value);
                    jK = k(cVarC2, iG);
                }
                org.threeten.bp.chrono.c cVarV = cVarC2.v(((jA3 - jK) * 7) + ((long) (iF - iG)), b.DAYS);
                if (kVar == org.threeten.bp.format.k.STRICT && cVarV.t(this) != map.get(this).longValue()) {
                    throw new org.threeten.bp.b("Strict mode rejected date parsed to a different year");
                }
                map.remove(this);
                map.remove(this.f340450b.f340442f);
                map.remove(aVar);
                return cVarV;
            }
            org.threeten.bp.temporal.a aVar2 = org.threeten.bp.temporal.a.f340340k3;
            if (!map.containsKey(aVar2)) {
                return null;
            }
            int iF2 = cn.d.f(aVar.k(map.get(aVar).longValue()) - value, 7) + 1;
            int iK = aVar2.k(map.get(aVar2).longValue());
            org.threeten.bp.chrono.j jVarV2 = org.threeten.bp.chrono.j.v(fVar);
            m mVar = this.f340452d;
            b bVar = b.MONTHS;
            if (mVar != bVar) {
                if (mVar != b.YEARS) {
                    throw new IllegalStateException("unreachable");
                }
                long jLongValue = map.remove(this).longValue();
                org.threeten.bp.chrono.c cVarC3 = jVarV2.c(iK, 1, 1);
                if (kVar == org.threeten.bp.format.k.LENIENT) {
                    int iG2 = g(cVarC3, value);
                    jA = ((jLongValue - k(cVarC3, iG2)) * 7) + ((long) (iF2 - iG2));
                } else {
                    int iG3 = g(cVarC3, value);
                    jA = ((long) (iF2 - iG3)) + ((((long) this.f340453e.a(jLongValue, this)) - k(cVarC3, iG3)) * 7);
                }
                org.threeten.bp.chrono.c cVarV2 = cVarC3.v(jA, b.DAYS);
                if (kVar == org.threeten.bp.format.k.STRICT && cVarV2.t(aVar2) != map.get(aVar2).longValue()) {
                    throw new org.threeten.bp.b("Strict mode rejected date parsed to a different year");
                }
                map.remove(this);
                map.remove(aVar2);
                map.remove(aVar);
                return cVarV2;
            }
            org.threeten.bp.temporal.a aVar3 = org.threeten.bp.temporal.a.f340334h3;
            if (!map.containsKey(aVar3)) {
                return null;
            }
            long jLongValue2 = map.remove(this).longValue();
            if (kVar == org.threeten.bp.format.k.LENIENT) {
                cVarC = jVarV2.c(iK, 1, 1).v(map.get(aVar3).longValue() - 1, bVar);
                int iG4 = g(cVarC, value);
                jA2 = ((jLongValue2 - j(cVarC, iG4)) * 7) + ((long) (iF2 - iG4));
            } else {
                cVarC = jVarV2.c(iK, aVar3.k(map.get(aVar3).longValue()), 8);
                int iG5 = g(cVarC, value);
                jA2 = ((long) (iF2 - iG5)) + ((((long) this.f340453e.a(jLongValue2, this)) - j(cVarC, iG5)) * 7);
            }
            org.threeten.bp.chrono.c cVarV3 = cVarC.v(jA2, b.DAYS);
            if (kVar == org.threeten.bp.format.k.STRICT && cVarV3.t(aVar3) != map.get(aVar3).longValue()) {
                throw new org.threeten.bp.b("Strict mode rejected date parsed to a different month");
            }
            map.remove(this);
            map.remove(aVar2);
            map.remove(aVar3);
            map.remove(aVar);
            return cVarV3;
        }

        @Override // org.threeten.bp.temporal.j
        public m getBaseUnit() {
            return this.f340451c;
        }

        @Override // org.threeten.bp.temporal.j
        public String getDisplayName(Locale locale) {
            cn.d.j(locale, "locale");
            return this.f340452d == b.YEARS ? "Week" : toString();
        }

        @Override // org.threeten.bp.temporal.j
        public m getRangeUnit() {
            return this.f340452d;
        }

        @Override // org.threeten.bp.temporal.j
        public boolean isDateBased() {
            return true;
        }

        @Override // org.threeten.bp.temporal.j
        public boolean isTimeBased() {
            return false;
        }

        @Override // org.threeten.bp.temporal.j
        public o range() {
            return this.f340453e;
        }

        public String toString() {
            return this.f340449a + "[" + this.f340450b.toString() + "]";
        }
    }

    private p(org.threeten.bp.d dVar, int i10) {
        cn.d.j(dVar, "firstDayOfWeek");
        if (i10 < 1 || i10 > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f340437a = dVar;
        this.f340438b = i10;
    }

    public static p e(Locale locale) {
        cn.d.j(locale, "locale");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(new Locale(locale.getLanguage(), locale.getCountry()));
        return f(org.threeten.bp.d.SUNDAY.D(gregorianCalendar.getFirstDayOfWeek() - 1), gregorianCalendar.getMinimalDaysInFirstWeek());
    }

    public static p f(org.threeten.bp.d dVar, int i10) {
        String str = dVar.toString() + i10;
        ConcurrentMap<String, p> concurrentMap = f340433h;
        p pVar = concurrentMap.get(str);
        if (pVar != null) {
            return pVar;
        }
        concurrentMap.putIfAbsent(str, new p(dVar, i10));
        return concurrentMap.get(str);
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return f(this.f340437a, this.f340438b);
        } catch (IllegalArgumentException e10) {
            throw new InvalidObjectException("Invalid WeekFields" + e10.getMessage());
        }
    }

    public j b() {
        return this.f340439c;
    }

    public org.threeten.bp.d c() {
        return this.f340437a;
    }

    public int d() {
        return this.f340438b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && hashCode() == obj.hashCode();
    }

    public j g() {
        return this.f340443g;
    }

    public j h() {
        return this.f340440d;
    }

    public int hashCode() {
        return (this.f340437a.ordinal() * 7) + this.f340438b;
    }

    public j i() {
        return this.f340442f;
    }

    public j j() {
        return this.f340441e;
    }

    public String toString() {
        return "WeekFields[" + this.f340437a + AbstractJsonLexerKt.COMMA + this.f340438b + AbstractJsonLexerKt.END_LIST;
    }
}
