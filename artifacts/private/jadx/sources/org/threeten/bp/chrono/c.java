package org.threeten.bp.chrono;

import java.util.Comparator;

/* JADX INFO: loaded from: classes14.dex */
public abstract class c extends cn.b implements org.threeten.bp.temporal.e, org.threeten.bp.temporal.g, Comparable<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator<c> f339856a = new a();

    class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            return cn.d.b(cVar.toEpochDay(), cVar2.toEpochDay());
        }
    }

    public static c D(org.threeten.bp.temporal.f fVar) {
        cn.d.j(fVar, "temporal");
        if (fVar instanceof c) {
            return (c) fVar;
        }
        j jVar = (j) fVar.d(org.threeten.bp.temporal.k.a());
        if (jVar != null) {
            return jVar.e(fVar);
        }
        throw new org.threeten.bp.b("No Chronology found to create ChronoLocalDate: " + fVar.getClass());
    }

    public static Comparator<c> timeLineOrder() {
        return f339856a;
    }

    public abstract j E();

    public k H() {
        return E().t(l(org.threeten.bp.temporal.a.f340342l3));
    }

    public boolean I(c cVar) {
        return toEpochDay() > cVar.toEpochDay();
    }

    public boolean L(c cVar) {
        return toEpochDay() < cVar.toEpochDay();
    }

    public boolean M(c cVar) {
        return toEpochDay() == cVar.toEpochDay();
    }

    @Override // cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public c f(long j10, org.threeten.bp.temporal.m mVar) {
        return E().q(super.f(j10, mVar));
    }

    @Override // cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public c p(org.threeten.bp.temporal.i iVar) {
        return E().q(super.p(iVar));
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public abstract c v(long j10, org.threeten.bp.temporal.m mVar);

    @Override // cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public c n(org.threeten.bp.temporal.i iVar) {
        return E().q(super.n(iVar));
    }

    public abstract f U(c cVar);

    @Override // cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public c s(org.threeten.bp.temporal.g gVar) {
        return E().q(super.s(gVar));
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public abstract c o(org.threeten.bp.temporal.j jVar, long j10);

    @Override // org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e b(org.threeten.bp.temporal.e eVar) {
        return eVar.o(org.threeten.bp.temporal.a.H1, toEpochDay());
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public <R> R d(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.a()) {
            return (R) E();
        }
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return (R) org.threeten.bp.temporal.b.DAYS;
        }
        if (lVar == org.threeten.bp.temporal.k.b()) {
            return (R) org.threeten.bp.g.E0(toEpochDay());
        }
        if (lVar == org.threeten.bp.temporal.k.c() || lVar == org.threeten.bp.temporal.k.f() || lVar == org.threeten.bp.temporal.k.g() || lVar == org.threeten.bp.temporal.k.d()) {
            return null;
        }
        return (R) super.d(lVar);
    }

    @Override // org.threeten.bp.temporal.e
    public boolean e(org.threeten.bp.temporal.m mVar) {
        if (mVar instanceof org.threeten.bp.temporal.b) {
            return mVar.isDateBased();
        }
        return mVar != null && mVar.c(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && compareTo((c) obj) == 0;
    }

    public int hashCode() {
        long epochDay = toEpochDay();
        return E().hashCode() ^ ((int) (epochDay ^ (epochDay >>> 32)));
    }

    public boolean isLeapYear() {
        return E().isLeapYear(t(org.threeten.bp.temporal.a.f340340k3));
    }

    public abstract int lengthOfMonth();

    public int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    @Override // org.threeten.bp.temporal.f
    public boolean q(org.threeten.bp.temporal.j jVar) {
        if (jVar instanceof org.threeten.bp.temporal.a) {
            return jVar.isDateBased();
        }
        return jVar != null && jVar.c(this);
    }

    public long toEpochDay() {
        return t(org.threeten.bp.temporal.a.H1);
    }

    public String toString() {
        long jT = t(org.threeten.bp.temporal.a.f340338j3);
        long jT2 = t(org.threeten.bp.temporal.a.f340334h3);
        long jT3 = t(org.threeten.bp.temporal.a.f340349p0);
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(E().toString());
        sb2.append(" ");
        sb2.append(H());
        sb2.append(" ");
        sb2.append(jT);
        sb2.append(jT2 < 10 ? "-0" : "-");
        sb2.append(jT2);
        sb2.append(jT3 < 10 ? "-0" : "-");
        sb2.append(jT3);
        return sb2.toString();
    }

    public d<?> w(org.threeten.bp.i iVar) {
        return e.Z(this, iVar);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        int iB = cn.d.b(toEpochDay(), cVar.toEpochDay());
        return iB == 0 ? E().compareTo(cVar.E()) : iB;
    }

    public String z(org.threeten.bp.format.c cVar) {
        cn.d.j(cVar, "formatter");
        return cVar.d(this);
    }
}
