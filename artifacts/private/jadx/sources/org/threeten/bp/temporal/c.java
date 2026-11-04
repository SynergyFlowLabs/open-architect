package org.threeten.bp.temporal;

import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f340379a = b.f340386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f340380b = b.f340387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f340381c = b.f340388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f340382d = b.f340389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f340383e = EnumC2452c.WEEK_BASED_YEARS;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f340384f = EnumC2452c.QUARTER_YEARS;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f340385a;

        static {
            int[] iArr = new int[EnumC2452c.values().length];
            f340385a = iArr;
            try {
                iArr[EnumC2452c.WEEK_BASED_YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f340385a[EnumC2452c.QUARTER_YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f340386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f340387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f340388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f340389d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int[] f340390e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ b[] f340391f;

        final enum a extends b {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // org.threeten.bp.temporal.j
            public <R extends e> R b(R r10, long j10) {
                long jE = e(r10);
                range().b(j10, this);
                org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340350p1;
                return (R) r10.o(aVar, r10.t(aVar) + (j10 - jE));
            }

            @Override // org.threeten.bp.temporal.j
            public boolean c(f fVar) {
                return fVar.q(org.threeten.bp.temporal.a.f340350p1) && fVar.q(org.threeten.bp.temporal.a.f340334h3) && fVar.q(org.threeten.bp.temporal.a.f340340k3) && b.w(fVar);
            }

            @Override // org.threeten.bp.temporal.j
            public o d(f fVar) {
                if (!fVar.q(this)) {
                    throw new n("Unsupported field: DayOfQuarter");
                }
                long jT = fVar.t(b.f340387b);
                if (jT == 1) {
                    return org.threeten.bp.chrono.o.f339936e.isLeapYear(fVar.t(org.threeten.bp.temporal.a.f340340k3)) ? o.k(1L, 91L) : o.k(1L, 90L);
                }
                if (jT == 2) {
                    return o.k(1L, 91L);
                }
                return (jT == 3 || jT == 4) ? o.k(1L, 92L) : range();
            }

            @Override // org.threeten.bp.temporal.j
            public long e(f fVar) {
                if (!fVar.q(this)) {
                    throw new n("Unsupported field: DayOfQuarter");
                }
                return fVar.l(org.threeten.bp.temporal.a.f340350p1) - b.f340390e[((fVar.l(org.threeten.bp.temporal.a.f340334h3) - 1) / 3) + (org.threeten.bp.chrono.o.f339936e.isLeapYear(fVar.t(org.threeten.bp.temporal.a.f340340k3)) ? 4 : 0)];
            }

            @Override // org.threeten.bp.temporal.c.b, org.threeten.bp.temporal.j
            public f f(Map<j, Long> map, f fVar, org.threeten.bp.format.k kVar) {
                org.threeten.bp.g gVarK0;
                org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340340k3;
                Long l10 = map.get(aVar);
                j jVar = b.f340387b;
                Long l11 = map.get(jVar);
                if (l10 == null || l11 == null) {
                    return null;
                }
                int iK = aVar.k(l10.longValue());
                long jLongValue = map.get(b.f340386a).longValue();
                if (kVar == org.threeten.bp.format.k.LENIENT) {
                    gVarK0 = org.threeten.bp.g.C0(iK, 1, 1).L0(cn.d.n(cn.d.q(l11.longValue(), 1L), 3)).K0(cn.d.q(jLongValue, 1L));
                } else {
                    int iA = jVar.range().a(l11.longValue(), jVar);
                    if (kVar == org.threeten.bp.format.k.STRICT) {
                        int i10 = 91;
                        if (iA == 1) {
                            if (!org.threeten.bp.chrono.o.f339936e.isLeapYear(iK)) {
                                i10 = 90;
                            }
                        } else if (iA != 2) {
                            i10 = 92;
                        }
                        o.k(1L, i10).b(jLongValue, this);
                    } else {
                        range().b(jLongValue, this);
                    }
                    gVarK0 = org.threeten.bp.g.C0(iK, ((iA - 1) * 3) + 1, 1).K0(jLongValue - 1);
                }
                map.remove(this);
                map.remove(aVar);
                map.remove(jVar);
                return gVarK0;
            }

            @Override // org.threeten.bp.temporal.j
            public m getBaseUnit() {
                return org.threeten.bp.temporal.b.DAYS;
            }

            @Override // org.threeten.bp.temporal.j
            public m getRangeUnit() {
                return c.f340384f;
            }

            @Override // org.threeten.bp.temporal.j
            public o range() {
                return o.l(1L, 90L, 92L);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "DayOfQuarter";
            }
        }

        /* JADX INFO: renamed from: org.threeten.bp.temporal.c$b$b, reason: collision with other inner class name */
        final enum C2450b extends b {
            C2450b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // org.threeten.bp.temporal.j
            public <R extends e> R b(R r10, long j10) {
                long jE = e(r10);
                range().b(j10, this);
                org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340334h3;
                return (R) r10.o(aVar, r10.t(aVar) + ((j10 - jE) * 3));
            }

            @Override // org.threeten.bp.temporal.j
            public boolean c(f fVar) {
                return fVar.q(org.threeten.bp.temporal.a.f340334h3) && b.w(fVar);
            }

            @Override // org.threeten.bp.temporal.j
            public o d(f fVar) {
                return range();
            }

            @Override // org.threeten.bp.temporal.j
            public long e(f fVar) {
                if (fVar.q(this)) {
                    return (fVar.t(org.threeten.bp.temporal.a.f340334h3) + 2) / 3;
                }
                throw new n("Unsupported field: QuarterOfYear");
            }

            @Override // org.threeten.bp.temporal.j
            public m getBaseUnit() {
                return c.f340384f;
            }

            @Override // org.threeten.bp.temporal.j
            public m getRangeUnit() {
                return org.threeten.bp.temporal.b.YEARS;
            }

            @Override // org.threeten.bp.temporal.j
            public o range() {
                return o.k(1L, 4L);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "QuarterOfYear";
            }
        }

        /* JADX INFO: renamed from: org.threeten.bp.temporal.c$b$c, reason: collision with other inner class name */
        final enum C2451c extends b {
            C2451c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // org.threeten.bp.temporal.j
            public <R extends e> R b(R r10, long j10) {
                range().b(j10, this);
                return (R) r10.v(cn.d.q(j10, e(r10)), org.threeten.bp.temporal.b.WEEKS);
            }

            @Override // org.threeten.bp.temporal.j
            public boolean c(f fVar) {
                return fVar.q(org.threeten.bp.temporal.a.H1) && b.w(fVar);
            }

            @Override // org.threeten.bp.temporal.j
            public o d(f fVar) {
                if (fVar.q(this)) {
                    return b.v(org.threeten.bp.g.i0(fVar));
                }
                throw new n("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // org.threeten.bp.temporal.j
            public long e(f fVar) {
                if (fVar.q(this)) {
                    return b.r(org.threeten.bp.g.i0(fVar));
                }
                throw new n("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // org.threeten.bp.temporal.c.b, org.threeten.bp.temporal.j
            public f f(Map<j, Long> map, f fVar, org.threeten.bp.format.k kVar) {
                org.threeten.bp.g gVarS0;
                long j10;
                j jVar = b.f340389d;
                Long l10 = map.get(jVar);
                org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.X;
                Long l11 = map.get(aVar);
                if (l10 == null || l11 == null) {
                    return null;
                }
                int iA = jVar.range().a(l10.longValue(), jVar);
                long jLongValue = map.get(b.f340388c).longValue();
                if (kVar == org.threeten.bp.format.k.LENIENT) {
                    long jLongValue2 = l11.longValue();
                    if (jLongValue2 > 7) {
                        long j11 = jLongValue2 - 1;
                        j10 = j11 / 7;
                        jLongValue2 = (j11 % 7) + 1;
                    } else if (jLongValue2 < 1) {
                        j10 = (jLongValue2 / 7) - 1;
                        jLongValue2 = (jLongValue2 % 7) + 7;
                    } else {
                        j10 = 0;
                    }
                    gVarS0 = org.threeten.bp.g.C0(iA, 1, 4).M0(jLongValue - 1).M0(j10).o(aVar, jLongValue2);
                } else {
                    int iK = aVar.k(l11.longValue());
                    if (kVar == org.threeten.bp.format.k.STRICT) {
                        b.v(org.threeten.bp.g.C0(iA, 1, 4)).b(jLongValue, this);
                    } else {
                        range().b(jLongValue, this);
                    }
                    gVarS0 = org.threeten.bp.g.C0(iA, 1, 4).M0(jLongValue - 1).o(aVar, iK);
                }
                map.remove(this);
                map.remove(jVar);
                map.remove(aVar);
                return gVarS0;
            }

            @Override // org.threeten.bp.temporal.j
            public m getBaseUnit() {
                return org.threeten.bp.temporal.b.WEEKS;
            }

            @Override // org.threeten.bp.temporal.c.b, org.threeten.bp.temporal.j
            public String getDisplayName(Locale locale) {
                cn.d.j(locale, "locale");
                return "Week";
            }

            @Override // org.threeten.bp.temporal.j
            public m getRangeUnit() {
                return c.f340383e;
            }

            @Override // org.threeten.bp.temporal.j
            public o range() {
                return o.l(1L, 52L, 53L);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "WeekOfWeekBasedYear";
            }
        }

        final enum d extends b {
            d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // org.threeten.bp.temporal.j
            public <R extends e> R b(R r10, long j10) {
                if (!c(r10)) {
                    throw new n("Unsupported field: WeekBasedYear");
                }
                int iA = range().a(j10, b.f340389d);
                org.threeten.bp.g gVarI0 = org.threeten.bp.g.i0(r10);
                org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.X;
                int iL = gVarI0.l(aVar);
                int iR = b.r(gVarI0);
                if (iR == 53 && b.t(iA) == 52) {
                    iR = 52;
                }
                org.threeten.bp.g gVarC0 = org.threeten.bp.g.C0(iA, 1, 4);
                return (R) r10.s(gVarC0.K0((iL - gVarC0.l(aVar)) + ((iR - 1) * 7)));
            }

            @Override // org.threeten.bp.temporal.j
            public boolean c(f fVar) {
                return fVar.q(org.threeten.bp.temporal.a.H1) && b.w(fVar);
            }

            @Override // org.threeten.bp.temporal.j
            public o d(f fVar) {
                return org.threeten.bp.temporal.a.f340340k3.range();
            }

            @Override // org.threeten.bp.temporal.j
            public long e(f fVar) {
                if (fVar.q(this)) {
                    return b.s(org.threeten.bp.g.i0(fVar));
                }
                throw new n("Unsupported field: WeekBasedYear");
            }

            @Override // org.threeten.bp.temporal.j
            public m getBaseUnit() {
                return c.f340383e;
            }

            @Override // org.threeten.bp.temporal.j
            public m getRangeUnit() {
                return org.threeten.bp.temporal.b.FOREVER;
            }

            @Override // org.threeten.bp.temporal.j
            public o range() {
                return org.threeten.bp.temporal.a.f340340k3.range();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "WeekBasedYear";
            }
        }

        static {
            a aVar = new a("DAY_OF_QUARTER", 0);
            f340386a = aVar;
            C2450b c2450b = new C2450b("QUARTER_OF_YEAR", 1);
            f340387b = c2450b;
            C2451c c2451c = new C2451c("WEEK_OF_WEEK_BASED_YEAR", 2);
            f340388c = c2451c;
            d dVar = new d("WEEK_BASED_YEAR", 3);
            f340389d = dVar;
            f340391f = new b[]{aVar, c2450b, c2451c, dVar};
            f340390e = new int[]{0, 90, 181, com.badlogic.gdx.utils.compression.lzma.a.A, 0, 91, 182, 274};
        }

        private b(String str, int i10) {
            super(str, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int r(org.threeten.bp.g gVar) {
            int iOrdinal = gVar.m0().ordinal();
            int iN0 = gVar.n0() - 1;
            int i10 = (3 - iOrdinal) + iN0;
            int i11 = i10 - ((i10 / 7) * 7);
            int i12 = i11 - 3;
            if (i12 < -3) {
                i12 = i11 + 4;
            }
            if (iN0 < i12) {
                return (int) v(gVar.U0(180).x0(1L)).d();
            }
            int i13 = ((iN0 - i12) / 7) + 1;
            if (i13 != 53 || i12 == -3 || (i12 == -2 && gVar.isLeapYear())) {
                return i13;
            }
            return 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static int s(org.threeten.bp.g gVar) {
            int iR0 = gVar.r0();
            int iN0 = gVar.n0();
            if (iN0 <= 3) {
                boolean z10 = 2 ^ (-2);
                if (iN0 - gVar.m0().ordinal() < -2) {
                    return iR0 - 1;
                }
            } else if (iN0 >= 363) {
                if (((iN0 - 363) - (gVar.isLeapYear() ? 1 : 0)) - gVar.m0().ordinal() >= 0) {
                    iR0++;
                }
            }
            return iR0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int t(int i10) {
            org.threeten.bp.g gVarC0 = org.threeten.bp.g.C0(i10, 1, 1);
            if (gVarC0.m0() != org.threeten.bp.d.THURSDAY && (gVarC0.m0() != org.threeten.bp.d.WEDNESDAY || !gVarC0.isLeapYear())) {
                return 52;
            }
            return 53;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static o v(org.threeten.bp.g gVar) {
            return o.k(1L, t(s(gVar)));
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f340391f.clone();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean w(f fVar) {
            return org.threeten.bp.chrono.j.v(fVar).equals(org.threeten.bp.chrono.o.f339936e);
        }

        @Override // org.threeten.bp.temporal.j
        public f f(Map<j, Long> map, f fVar, org.threeten.bp.format.k kVar) {
            return null;
        }

        @Override // org.threeten.bp.temporal.j
        public String getDisplayName(Locale locale) {
            cn.d.j(locale, "locale");
            return toString();
        }

        @Override // org.threeten.bp.temporal.j
        public boolean isDateBased() {
            return true;
        }

        @Override // org.threeten.bp.temporal.j
        public boolean isTimeBased() {
            return false;
        }

        /* synthetic */ b(String str, int i10, a aVar) {
            this(str, i10);
        }
    }

    /* JADX INFO: renamed from: org.threeten.bp.temporal.c$c, reason: collision with other inner class name */
    private enum EnumC2452c implements m {
        WEEK_BASED_YEARS("WeekBasedYears", org.threeten.bp.e.Y(31556952)),
        QUARTER_YEARS("QuarterYears", org.threeten.bp.e.Y(7889238));


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f340395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final org.threeten.bp.e f340396b;

        EnumC2452c(String str, org.threeten.bp.e eVar) {
            this.f340395a = str;
            this.f340396b = eVar;
        }

        @Override // org.threeten.bp.temporal.m
        public <R extends e> R b(R r10, long j10) {
            int i10 = a.f340385a[ordinal()];
            if (i10 == 1) {
                j jVar = c.f340382d;
                return (R) r10.o(jVar, cn.d.l(r10.l(jVar), j10));
            }
            if (i10 == 2) {
                return (R) r10.v(j10 / 256, org.threeten.bp.temporal.b.YEARS).v((j10 % 256) * 3, org.threeten.bp.temporal.b.MONTHS);
            }
            throw new IllegalStateException("Unreachable");
        }

        @Override // org.threeten.bp.temporal.m
        public boolean c(e eVar) {
            return eVar.q(org.threeten.bp.temporal.a.H1);
        }

        @Override // org.threeten.bp.temporal.m
        public long d(e eVar, e eVar2) {
            int i10 = a.f340385a[ordinal()];
            if (i10 == 1) {
                j jVar = c.f340382d;
                return cn.d.q(eVar2.t(jVar), eVar.t(jVar));
            }
            if (i10 == 2) {
                return eVar.k(eVar2, org.threeten.bp.temporal.b.MONTHS) / 3;
            }
            throw new IllegalStateException("Unreachable");
        }

        @Override // org.threeten.bp.temporal.m
        public org.threeten.bp.e getDuration() {
            return this.f340396b;
        }

        @Override // org.threeten.bp.temporal.m
        public boolean isDateBased() {
            return true;
        }

        @Override // org.threeten.bp.temporal.m
        public boolean isDurationEstimated() {
            return true;
        }

        @Override // org.threeten.bp.temporal.m
        public boolean isTimeBased() {
            return false;
        }

        @Override // java.lang.Enum, org.threeten.bp.temporal.m
        public String toString() {
            return this.f340395a;
        }
    }

    private c() {
        throw new AssertionError("Not instantiable");
    }
}
