package org.threeten.bp.chrono;

import java.util.Comparator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.threeten.bp.chrono.c;

/* JADX INFO: loaded from: classes14.dex */
public abstract class h<D extends c> extends cn.b implements org.threeten.bp.temporal.e, Comparable<h<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Comparator<h<?>> f339879a = new a();

    class a implements Comparator<h<?>> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(h<?> hVar, h<?> hVar2) {
            int iB = cn.d.b(hVar.toEpochSecond(), hVar2.toEpochSecond());
            return iB == 0 ? cn.d.b(hVar.X().t0(), hVar2.X().t0()) : iB;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f339880a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.a.values().length];
            f339880a = iArr;
            try {
                iArr[org.threeten.bp.temporal.a.f340344m3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f339880a[org.threeten.bp.temporal.a.f340346n3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static Comparator<h<?>> timeLineOrder() {
        return f339879a;
    }

    public static h<?> z(org.threeten.bp.temporal.f fVar) {
        cn.d.j(fVar, "temporal");
        if (fVar instanceof h) {
            return (h) fVar;
        }
        j jVar = (j) fVar.d(org.threeten.bp.temporal.k.a());
        if (jVar != null) {
            return jVar.V(fVar);
        }
        throw new org.threeten.bp.b("No Chronology found to create ChronoZonedDateTime: " + fVar.getClass());
    }

    public j D() {
        return V().E();
    }

    public abstract org.threeten.bp.s E();

    public abstract org.threeten.bp.r H();

    public boolean I(h<?> hVar) {
        long epochSecond = toEpochSecond();
        long epochSecond2 = hVar.toEpochSecond();
        return epochSecond > epochSecond2 || (epochSecond == epochSecond2 && X().N() > hVar.X().N());
    }

    public boolean L(h<?> hVar) {
        long epochSecond = toEpochSecond();
        long epochSecond2 = hVar.toEpochSecond();
        if (epochSecond >= epochSecond2) {
            return epochSecond == epochSecond2 && X().N() < hVar.X().N();
        }
        return true;
    }

    public boolean M(h<?> hVar) {
        return toEpochSecond() == hVar.toEpochSecond() && X().N() == hVar.X().N();
    }

    @Override // cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public h<D> f(long j10, org.threeten.bp.temporal.m mVar) {
        return V().E().s(super.f(j10, mVar));
    }

    @Override // cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public h<D> p(org.threeten.bp.temporal.i iVar) {
        return V().E().s(super.p(iVar));
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public abstract h<D> v(long j10, org.threeten.bp.temporal.m mVar);

    @Override // cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public h<D> n(org.threeten.bp.temporal.i iVar) {
        return V().E().s(super.n(iVar));
    }

    public org.threeten.bp.f U() {
        return org.threeten.bp.f.a0(toEpochSecond(), X().N());
    }

    public D V() {
        return (D) W().V();
    }

    public abstract d<D> W();

    public org.threeten.bp.i X() {
        return W().W();
    }

    @Override // cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public h<D> s(org.threeten.bp.temporal.g gVar) {
        return V().E().s(super.s(gVar));
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public abstract h<D> o(org.threeten.bp.temporal.j jVar, long j10);

    public abstract h<D> a0();

    @Override // cn.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.o c(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.d(this);
        }
        if (jVar != org.threeten.bp.temporal.a.f340344m3 && jVar != org.threeten.bp.temporal.a.f340346n3) {
            return W().c(jVar);
        }
        return jVar.range();
    }

    public abstract h<D> c0();

    @Override // cn.c, org.threeten.bp.temporal.f
    public <R> R d(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.g() || lVar == org.threeten.bp.temporal.k.f()) {
            return (R) H();
        }
        if (lVar == org.threeten.bp.temporal.k.a()) {
            return (R) V().E();
        }
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return (R) org.threeten.bp.temporal.b.NANOS;
        }
        if (lVar == org.threeten.bp.temporal.k.d()) {
            return (R) E();
        }
        if (lVar == org.threeten.bp.temporal.k.b()) {
            return (R) org.threeten.bp.g.E0(V().toEpochDay());
        }
        return lVar == org.threeten.bp.temporal.k.c() ? (R) X() : (R) super.d(lVar);
    }

    public abstract h<D> d0(org.threeten.bp.r rVar);

    public abstract h<D> e0(org.threeten.bp.r rVar);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && compareTo((h) obj) == 0;
    }

    public int hashCode() {
        return Integer.rotateLeft(H().hashCode(), 3) ^ (W().hashCode() ^ E().hashCode());
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public int l(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return super.l(jVar);
        }
        int i10 = b.f339880a[((org.threeten.bp.temporal.a) jVar).ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? W().l(jVar) : E().S();
        }
        throw new org.threeten.bp.temporal.n("Field too large for an int: " + jVar);
    }

    @Override // org.threeten.bp.temporal.f
    public long t(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.e(this);
        }
        int i10 = b.f339880a[((org.threeten.bp.temporal.a) jVar).ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? W().t(jVar) : E().S();
        }
        return toEpochSecond();
    }

    public long toEpochSecond() {
        return ((V().toEpochDay() * 86400) + ((long) X().u0())) - ((long) E().S());
    }

    public String toString() {
        String str = W().toString() + E().toString();
        if (E() == H()) {
            return str;
        }
        return str + AbstractJsonLexerKt.BEGIN_LIST + H().toString() + AbstractJsonLexerKt.END_LIST;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int compareTo(h<?> hVar) {
        int iB = cn.d.b(toEpochSecond(), hVar.toEpochSecond());
        return (iB == 0 && (iB = X().N() - hVar.X().N()) == 0 && (iB = W().compareTo(hVar.W())) == 0 && (iB = H().getId().compareTo(hVar.H().getId())) == 0) ? V().E().compareTo(hVar.V().E()) : iB;
    }

    public String x(org.threeten.bp.format.c cVar) {
        cn.d.j(cVar, "formatter");
        return cVar.d(this);
    }
}
