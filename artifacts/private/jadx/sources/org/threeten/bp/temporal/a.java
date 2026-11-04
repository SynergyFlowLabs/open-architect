package org.threeten.bp.temporal;

import java.util.Locale;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes14.dex */
public final class a implements j {
    public static final a H1;
    public static final a X;
    public static final a Y;
    public static final a Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f340329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f340330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f340331g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final a f340332g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f340333h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final a f340334h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f340335i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final a f340336i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f340337j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final a f340338j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f340339k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final a f340340k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f340341l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public static final a f340342l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f340343m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static final a f340344m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f340345n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final a f340346n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f340347o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private static final /* synthetic */ a[] f340348o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a f340349p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final a f340350p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final a f340351p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f340352s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f340353t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f340354v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f340355w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f340356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f340357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f340358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f340359d;

    static {
        b bVar = b.NANOS;
        b bVar2 = b.SECONDS;
        a aVar = new a("NANO_OF_SECOND", 0, "NanoOfSecond", bVar, bVar2, o.k(0L, 999999999L));
        f340329e = aVar;
        b bVar3 = b.DAYS;
        a aVar2 = new a("NANO_OF_DAY", 1, "NanoOfDay", bVar, bVar3, o.k(0L, 86399999999999L));
        f340330f = aVar2;
        b bVar4 = b.MICROS;
        a aVar3 = new a("MICRO_OF_SECOND", 2, "MicroOfSecond", bVar4, bVar2, o.k(0L, 999999L));
        f340331g = aVar3;
        a aVar4 = new a("MICRO_OF_DAY", 3, "MicroOfDay", bVar4, bVar3, o.k(0L, 86399999999L));
        f340333h = aVar4;
        b bVar5 = b.MILLIS;
        a aVar5 = new a("MILLI_OF_SECOND", 4, "MilliOfSecond", bVar5, bVar2, o.k(0L, 999L));
        f340335i = aVar5;
        a aVar6 = new a("MILLI_OF_DAY", 5, "MilliOfDay", bVar5, bVar3, o.k(0L, 86399999L));
        f340337j = aVar6;
        b bVar6 = b.MINUTES;
        a aVar7 = new a("SECOND_OF_MINUTE", 6, "SecondOfMinute", bVar2, bVar6, o.k(0L, 59L));
        f340339k = aVar7;
        a aVar8 = new a("SECOND_OF_DAY", 7, "SecondOfDay", bVar2, bVar3, o.k(0L, 86399L));
        f340341l = aVar8;
        b bVar7 = b.HOURS;
        a aVar9 = new a("MINUTE_OF_HOUR", 8, "MinuteOfHour", bVar6, bVar7, o.k(0L, 59L));
        f340343m = aVar9;
        a aVar10 = new a("MINUTE_OF_DAY", 9, "MinuteOfDay", bVar6, bVar3, o.k(0L, 1439L));
        f340345n = aVar10;
        b bVar8 = b.HALF_DAYS;
        a aVar11 = new a("HOUR_OF_AMPM", 10, "HourOfAmPm", bVar7, bVar8, o.k(0L, 11L));
        f340347o = aVar11;
        a aVar12 = new a("CLOCK_HOUR_OF_AMPM", 11, "ClockHourOfAmPm", bVar7, bVar8, o.k(1L, 12L));
        f340352s = aVar12;
        a aVar13 = new a("HOUR_OF_DAY", 12, "HourOfDay", bVar7, bVar3, o.k(0L, 23L));
        f340353t = aVar13;
        a aVar14 = new a("CLOCK_HOUR_OF_DAY", 13, "ClockHourOfDay", bVar7, bVar3, o.k(1L, 24L));
        f340354v = aVar14;
        a aVar15 = new a("AMPM_OF_DAY", 14, "AmPmOfDay", bVar8, bVar3, o.k(0L, 1L));
        f340355w = aVar15;
        b bVar9 = b.WEEKS;
        a aVar16 = new a("DAY_OF_WEEK", 15, "DayOfWeek", bVar3, bVar9, o.k(1L, 7L));
        X = aVar16;
        a aVar17 = new a("ALIGNED_DAY_OF_WEEK_IN_MONTH", 16, "AlignedDayOfWeekInMonth", bVar3, bVar9, o.k(1L, 7L));
        Y = aVar17;
        a aVar18 = new a("ALIGNED_DAY_OF_WEEK_IN_YEAR", 17, "AlignedDayOfWeekInYear", bVar3, bVar9, o.k(1L, 7L));
        Z = aVar18;
        b bVar10 = b.MONTHS;
        a aVar19 = new a("DAY_OF_MONTH", 18, "DayOfMonth", bVar3, bVar10, o.l(1L, 28L, 31L));
        f340349p0 = aVar19;
        b bVar11 = b.YEARS;
        a aVar20 = new a("DAY_OF_YEAR", 19, "DayOfYear", bVar3, bVar11, o.l(1L, 365L, 366L));
        f340350p1 = aVar20;
        b bVar12 = b.FOREVER;
        a aVar21 = new a("EPOCH_DAY", 20, "EpochDay", bVar3, bVar12, o.k(-365243219162L, 365241780471L));
        H1 = aVar21;
        a aVar22 = new a("ALIGNED_WEEK_OF_MONTH", 21, "AlignedWeekOfMonth", bVar9, bVar10, o.l(1L, 4L, 5L));
        f340351p2 = aVar22;
        a aVar23 = new a("ALIGNED_WEEK_OF_YEAR", 22, "AlignedWeekOfYear", bVar9, bVar11, o.k(1L, 53L));
        f340332g3 = aVar23;
        a aVar24 = new a("MONTH_OF_YEAR", 23, "MonthOfYear", bVar10, bVar11, o.k(1L, 12L));
        f340334h3 = aVar24;
        a aVar25 = new a("PROLEPTIC_MONTH", 24, "ProlepticMonth", bVar10, bVar12, o.k(-11999999988L, 11999999999L));
        f340336i3 = aVar25;
        a aVar26 = new a("YEAR_OF_ERA", 25, "YearOfEra", bVar11, bVar12, o.l(1L, 999999999L, 1000000000L));
        f340338j3 = aVar26;
        a aVar27 = new a("YEAR", 26, "Year", bVar11, bVar12, o.k(-999999999L, 999999999L));
        f340340k3 = aVar27;
        a aVar28 = new a("ERA", 27, "Era", b.ERAS, bVar12, o.k(0L, 1L));
        f340342l3 = aVar28;
        a aVar29 = new a("INSTANT_SECONDS", 28, "InstantSeconds", bVar2, bVar12, o.k(Long.MIN_VALUE, Long.MAX_VALUE));
        f340344m3 = aVar29;
        a aVar30 = new a("OFFSET_SECONDS", 29, "OffsetSeconds", bVar2, bVar12, o.k(-64800L, 64800L));
        f340346n3 = aVar30;
        f340348o3 = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30};
    }

    private a(String str, int i10, String str2, m mVar, m mVar2, o oVar) {
        super(str, i10);
        this.f340356a = str2;
        this.f340357b = mVar;
        this.f340358c = mVar2;
        this.f340359d = oVar;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f340348o3.clone();
    }

    @Override // org.threeten.bp.temporal.j
    public <R extends e> R b(R r10, long j10) {
        return (R) r10.o(this, j10);
    }

    @Override // org.threeten.bp.temporal.j
    public boolean c(f fVar) {
        return fVar.q(this);
    }

    @Override // org.threeten.bp.temporal.j
    public o d(f fVar) {
        return fVar.c(this);
    }

    @Override // org.threeten.bp.temporal.j
    public long e(f fVar) {
        return fVar.t(this);
    }

    @Override // org.threeten.bp.temporal.j
    public f f(Map<j, Long> map, f fVar, org.threeten.bp.format.k kVar) {
        return null;
    }

    @Override // org.threeten.bp.temporal.j
    public m getBaseUnit() {
        return this.f340357b;
    }

    @Override // org.threeten.bp.temporal.j
    public String getDisplayName(Locale locale) {
        cn.d.j(locale, "locale");
        return toString();
    }

    @Override // org.threeten.bp.temporal.j
    public m getRangeUnit() {
        return this.f340358c;
    }

    @Override // org.threeten.bp.temporal.j
    public boolean isDateBased() {
        return ordinal() >= X.ordinal() && ordinal() <= f340342l3.ordinal();
    }

    @Override // org.threeten.bp.temporal.j
    public boolean isTimeBased() {
        return ordinal() < X.ordinal();
    }

    public int k(long j10) {
        return range().a(j10, this);
    }

    public long l(long j10) {
        return range().b(j10, this);
    }

    @Override // org.threeten.bp.temporal.j
    public o range() {
        return this.f340359d;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f340356a;
    }
}
