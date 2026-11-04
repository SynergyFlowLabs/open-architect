package org.threeten.bp;

import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
public enum d implements org.threeten.bp.temporal.f, org.threeten.bp.temporal.g {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<d> f340009h = new org.threeten.bp.temporal.l<d>() { // from class: org.threeten.bp.d.a
        @Override // org.threeten.bp.temporal.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(org.threeten.bp.temporal.f fVar) {
            return d.w(fVar);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final d[] f340010i = values();

    public static d w(org.threeten.bp.temporal.f fVar) {
        if (fVar instanceof d) {
            return (d) fVar;
        }
        try {
            return z(fVar.l(org.threeten.bp.temporal.a.X));
        } catch (b e10) {
            throw new b("Unable to obtain DayOfWeek from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName(), e10);
        }
    }

    public static d z(int i10) {
        if (i10 >= 1 && i10 <= 7) {
            return f340010i[i10 - 1];
        }
        throw new b("Invalid value for DayOfWeek: " + i10);
    }

    public d D(long j10) {
        return f340010i[(ordinal() + (((int) (j10 % 7)) + 7)) % 7];
    }

    @Override // org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e b(org.threeten.bp.temporal.e eVar) {
        return eVar.o(org.threeten.bp.temporal.a.X, getValue());
    }

    @Override // org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.o c(org.threeten.bp.temporal.j jVar) {
        if (jVar == org.threeten.bp.temporal.a.X) {
            return jVar.range();
        }
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.d(this);
        }
        throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
    }

    @Override // org.threeten.bp.temporal.f
    public <R> R d(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return (R) org.threeten.bp.temporal.b.DAYS;
        }
        if (lVar != org.threeten.bp.temporal.k.b() && lVar != org.threeten.bp.temporal.k.c() && lVar != org.threeten.bp.temporal.k.a() && lVar != org.threeten.bp.temporal.k.f() && lVar != org.threeten.bp.temporal.k.g() && lVar != org.threeten.bp.temporal.k.d()) {
            return lVar.a(this);
        }
        return null;
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // org.threeten.bp.temporal.f
    public int l(org.threeten.bp.temporal.j jVar) {
        return jVar == org.threeten.bp.temporal.a.X ? getValue() : c(jVar).a(t(jVar), jVar);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean q(org.threeten.bp.temporal.j jVar) {
        boolean z10 = false;
        if (jVar instanceof org.threeten.bp.temporal.a) {
            return jVar == org.threeten.bp.temporal.a.X;
        }
        return jVar != null && jVar.c(this);
    }

    public String r(org.threeten.bp.format.o oVar, Locale locale) {
        return new org.threeten.bp.format.d().r(org.threeten.bp.temporal.a.X, oVar).Q(locale).d(this);
    }

    @Override // org.threeten.bp.temporal.f
    public long t(org.threeten.bp.temporal.j jVar) {
        if (jVar == org.threeten.bp.temporal.a.X) {
            return getValue();
        }
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.e(this);
        }
        throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
    }

    public d x(long j10) {
        return D(-(j10 % 7));
    }
}
