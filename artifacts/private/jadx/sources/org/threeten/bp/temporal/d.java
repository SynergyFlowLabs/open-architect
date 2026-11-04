package org.threeten.bp.temporal;

import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f340397a = a.f340400f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f340398b = a.f340401g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f340399c = a.f340402h;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    private static final class a implements j {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f340400f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f340401g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f340402h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ a[] f340403i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f340404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m f340405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final m f340406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final o f340407d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f340408e;

        static {
            b bVar = b.DAYS;
            b bVar2 = b.FOREVER;
            a aVar = new a("JULIAN_DAY", 0, "JulianDay", bVar, bVar2, 2440588L);
            f340400f = aVar;
            a aVar2 = new a("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", bVar, bVar2, 40587L);
            f340401g = aVar2;
            a aVar3 = new a("RATA_DIE", 2, "RataDie", bVar, bVar2, 719163L);
            f340402h = aVar3;
            f340403i = new a[]{aVar, aVar2, aVar3};
        }

        private a(String str, int i10, String str2, m mVar, m mVar2, long j10) {
            super(str, i10);
            this.f340404a = str2;
            this.f340405b = mVar;
            this.f340406c = mVar2;
            this.f340407d = o.k((-365243219162L) + j10, 365241780471L + j10);
            this.f340408e = j10;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f340403i.clone();
        }

        @Override // org.threeten.bp.temporal.j
        public <R extends e> R b(R r10, long j10) {
            if (range().j(j10)) {
                return (R) r10.o(org.threeten.bp.temporal.a.H1, cn.d.q(j10, this.f340408e));
            }
            throw new org.threeten.bp.b("Invalid value: " + this.f340404a + " " + j10);
        }

        @Override // org.threeten.bp.temporal.j
        public boolean c(f fVar) {
            return fVar.q(org.threeten.bp.temporal.a.H1);
        }

        @Override // org.threeten.bp.temporal.j
        public o d(f fVar) {
            if (c(fVar)) {
                return range();
            }
            throw new n("Unsupported field: " + this);
        }

        @Override // org.threeten.bp.temporal.j
        public long e(f fVar) {
            return fVar.t(org.threeten.bp.temporal.a.H1) + this.f340408e;
        }

        @Override // org.threeten.bp.temporal.j
        public f f(Map<j, Long> map, f fVar, org.threeten.bp.format.k kVar) {
            return org.threeten.bp.chrono.j.v(fVar).f(cn.d.q(map.remove(this).longValue(), this.f340408e));
        }

        @Override // org.threeten.bp.temporal.j
        public m getBaseUnit() {
            return this.f340405b;
        }

        @Override // org.threeten.bp.temporal.j
        public String getDisplayName(Locale locale) {
            cn.d.j(locale, "locale");
            return toString();
        }

        @Override // org.threeten.bp.temporal.j
        public m getRangeUnit() {
            return this.f340406c;
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
            return this.f340407d;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f340404a;
        }
    }
}
