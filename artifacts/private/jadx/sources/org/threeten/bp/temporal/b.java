package org.threeten.bp.temporal;

/* JADX INFO: loaded from: classes14.dex */
public enum b implements m {
    NANOS("Nanos", org.threeten.bp.e.X(1)),
    MICROS("Micros", org.threeten.bp.e.X(1000)),
    MILLIS("Millis", org.threeten.bp.e.X(1000000)),
    SECONDS("Seconds", org.threeten.bp.e.Y(1)),
    MINUTES("Minutes", org.threeten.bp.e.Y(60)),
    HOURS("Hours", org.threeten.bp.e.Y(3600)),
    HALF_DAYS("HalfDays", org.threeten.bp.e.Y(43200)),
    DAYS("Days", org.threeten.bp.e.Y(86400)),
    WEEKS("Weeks", org.threeten.bp.e.Y(604800)),
    MONTHS("Months", org.threeten.bp.e.Y(2629746)),
    YEARS("Years", org.threeten.bp.e.Y(31556952)),
    DECADES("Decades", org.threeten.bp.e.Y(315569520)),
    CENTURIES("Centuries", org.threeten.bp.e.Y(3155695200L)),
    MILLENNIA("Millennia", org.threeten.bp.e.Y(31556952000L)),
    ERAS("Eras", org.threeten.bp.e.Y(31556952000000000L)),
    FOREVER("Forever", org.threeten.bp.e.Z(Long.MAX_VALUE, 999999999));


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f340377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final org.threeten.bp.e f340378b;

    b(String str, org.threeten.bp.e eVar) {
        this.f340377a = str;
        this.f340378b = eVar;
    }

    @Override // org.threeten.bp.temporal.m
    public <R extends e> R b(R r10, long j10) {
        return (R) r10.v(j10, this);
    }

    @Override // org.threeten.bp.temporal.m
    public boolean c(e eVar) {
        if (this == FOREVER) {
            return false;
        }
        if (eVar instanceof org.threeten.bp.chrono.c) {
            return isDateBased();
        }
        if ((eVar instanceof org.threeten.bp.chrono.d) || (eVar instanceof org.threeten.bp.chrono.h)) {
            return true;
        }
        try {
            eVar.v(1L, this);
            return true;
        } catch (RuntimeException unused) {
            try {
                eVar.v(-1L, this);
                return true;
            } catch (RuntimeException unused2) {
                return false;
            }
        }
    }

    @Override // org.threeten.bp.temporal.m
    public long d(e eVar, e eVar2) {
        return eVar.k(eVar2, this);
    }

    @Override // org.threeten.bp.temporal.m
    public org.threeten.bp.e getDuration() {
        return this.f340378b;
    }

    @Override // org.threeten.bp.temporal.m
    public boolean isDateBased() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    @Override // org.threeten.bp.temporal.m
    public boolean isDurationEstimated() {
        if (!isDateBased() && this != FOREVER) {
            return false;
        }
        return true;
    }

    @Override // org.threeten.bp.temporal.m
    public boolean isTimeBased() {
        return compareTo(DAYS) < 0;
    }

    @Override // java.lang.Enum, org.threeten.bp.temporal.m
    public String toString() {
        return this.f340377a;
    }
}
