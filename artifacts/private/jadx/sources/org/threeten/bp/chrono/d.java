package org.threeten.bp.chrono;

import java.util.Comparator;
import org.threeten.bp.chrono.c;

/* JADX INFO: loaded from: classes14.dex */
public abstract class d<D extends c> extends cn.b implements org.threeten.bp.temporal.e, org.threeten.bp.temporal.g, Comparable<d<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator<d<?>> f339857a = new a();

    class a implements Comparator<d<?>> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d<?> dVar, d<?> dVar2) {
            int iB = cn.d.b(dVar.V().toEpochDay(), dVar2.V().toEpochDay());
            return iB == 0 ? cn.d.b(dVar.W().t0(), dVar2.W().t0()) : iB;
        }
    }

    public static d<?> D(org.threeten.bp.temporal.f fVar) {
        cn.d.j(fVar, "temporal");
        if (fVar instanceof d) {
            return (d) fVar;
        }
        j jVar = (j) fVar.d(org.threeten.bp.temporal.k.a());
        if (jVar != null) {
            return jVar.z(fVar);
        }
        throw new org.threeten.bp.b("No Chronology found to create ChronoLocalDateTime: " + fVar.getClass());
    }

    public static Comparator<d<?>> timeLineOrder() {
        return f339857a;
    }

    public j E() {
        return V().E();
    }

    public boolean H(d<?> dVar) {
        long epochDay = V().toEpochDay();
        long epochDay2 = dVar.V().toEpochDay();
        return epochDay > epochDay2 || (epochDay == epochDay2 && W().t0() > dVar.W().t0());
    }

    public boolean I(d<?> dVar) {
        long epochDay = V().toEpochDay();
        long epochDay2 = dVar.V().toEpochDay();
        if (epochDay >= epochDay2) {
            return epochDay == epochDay2 && W().t0() < dVar.W().t0();
        }
        return true;
    }

    public boolean L(d<?> dVar) {
        return W().t0() == dVar.W().t0() && V().toEpochDay() == dVar.V().toEpochDay();
    }

    @Override // cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public d<D> f(long j10, org.threeten.bp.temporal.m mVar) {
        return V().E().r(super.f(j10, mVar));
    }

    @Override // cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public d<D> p(org.threeten.bp.temporal.i iVar) {
        return V().E().r(super.p(iVar));
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public abstract d<D> v(long j10, org.threeten.bp.temporal.m mVar);

    @Override // cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public d<D> n(org.threeten.bp.temporal.i iVar) {
        return V().E().r(super.n(iVar));
    }

    public long T(org.threeten.bp.s sVar) {
        cn.d.j(sVar, androidx.constraintlayout.core.motion.utils.v.c.R);
        return ((V().toEpochDay() * 86400) + ((long) W().u0())) - ((long) sVar.S());
    }

    public org.threeten.bp.f U(org.threeten.bp.s sVar) {
        return org.threeten.bp.f.a0(T(sVar), W().N());
    }

    public abstract D V();

    public abstract org.threeten.bp.i W();

    @Override // cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public d<D> s(org.threeten.bp.temporal.g gVar) {
        return V().E().r(super.s(gVar));
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public abstract d<D> o(org.threeten.bp.temporal.j jVar, long j10);

    @Override // org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e b(org.threeten.bp.temporal.e eVar) {
        return eVar.o(org.threeten.bp.temporal.a.H1, V().toEpochDay()).o(org.threeten.bp.temporal.a.f340330f, W().t0());
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public <R> R d(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.a()) {
            return (R) E();
        }
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return (R) org.threeten.bp.temporal.b.NANOS;
        }
        if (lVar == org.threeten.bp.temporal.k.b()) {
            return (R) org.threeten.bp.g.E0(V().toEpochDay());
        }
        if (lVar == org.threeten.bp.temporal.k.c()) {
            return (R) W();
        }
        if (lVar == org.threeten.bp.temporal.k.f() || lVar == org.threeten.bp.temporal.k.g() || lVar == org.threeten.bp.temporal.k.d()) {
            return null;
        }
        return (R) super.d(lVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && compareTo((d) obj) == 0;
    }

    public int hashCode() {
        return W().hashCode() ^ V().hashCode();
    }

    public String toString() {
        return V().toString() + org.locationtech.jts.geom.l.f338158h + W().toString();
    }

    public abstract h<D> w(org.threeten.bp.r rVar);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public int compareTo(d<?> dVar) {
        int iCompareTo = V().compareTo(dVar.V());
        return (iCompareTo == 0 && (iCompareTo = W().compareTo(dVar.W())) == 0) ? E().compareTo(dVar.E()) : iCompareTo;
    }

    public String z(org.threeten.bp.format.c cVar) {
        cn.d.j(cVar, "formatter");
        return cVar.d(this);
    }
}
