package org.threeten.bp.format;

import java.util.Locale;
import org.threeten.bp.r;
import org.threeten.bp.s;

/* JADX INFO: loaded from: classes14.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.threeten.bp.temporal.f f340151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Locale f340152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f340153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f340154d;

    class a extends cn.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.threeten.bp.chrono.c f340155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ org.threeten.bp.temporal.f f340156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ org.threeten.bp.chrono.j f340157c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ r f340158d;

        a(org.threeten.bp.chrono.c cVar, org.threeten.bp.temporal.f fVar, org.threeten.bp.chrono.j jVar, r rVar) {
            this.f340155a = cVar;
            this.f340156b = fVar;
            this.f340157c = jVar;
            this.f340158d = rVar;
        }

        @Override // cn.c, org.threeten.bp.temporal.f
        public org.threeten.bp.temporal.o c(org.threeten.bp.temporal.j jVar) {
            return (this.f340155a == null || !jVar.isDateBased()) ? this.f340156b.c(jVar) : this.f340155a.c(jVar);
        }

        @Override // cn.c, org.threeten.bp.temporal.f
        public <R> R d(org.threeten.bp.temporal.l<R> lVar) {
            if (lVar == org.threeten.bp.temporal.k.a()) {
                return (R) this.f340157c;
            }
            if (lVar == org.threeten.bp.temporal.k.g()) {
                return (R) this.f340158d;
            }
            return lVar == org.threeten.bp.temporal.k.e() ? (R) this.f340156b.d(lVar) : lVar.a(this);
        }

        @Override // org.threeten.bp.temporal.f
        public boolean q(org.threeten.bp.temporal.j jVar) {
            return (this.f340155a == null || !jVar.isDateBased()) ? this.f340156b.q(jVar) : this.f340155a.q(jVar);
        }

        @Override // org.threeten.bp.temporal.f
        public long t(org.threeten.bp.temporal.j jVar) {
            return (this.f340155a == null || !jVar.isDateBased()) ? this.f340156b.t(jVar) : this.f340155a.t(jVar);
        }
    }

    g(org.threeten.bp.temporal.f fVar, c cVar) {
        this.f340151a = a(fVar, cVar);
        this.f340152b = cVar.h();
        this.f340153c = cVar.g();
    }

    private static org.threeten.bp.temporal.f a(org.threeten.bp.temporal.f fVar, c cVar) {
        org.threeten.bp.chrono.j jVarF = cVar.f();
        r rVarK = cVar.k();
        if (jVarF == null && rVarK == null) {
            return fVar;
        }
        org.threeten.bp.chrono.j jVar = (org.threeten.bp.chrono.j) fVar.d(org.threeten.bp.temporal.k.a());
        r rVar = (r) fVar.d(org.threeten.bp.temporal.k.g());
        org.threeten.bp.chrono.c cVarE = null;
        if (cn.d.c(jVar, jVarF)) {
            jVarF = null;
        }
        if (cn.d.c(rVar, rVarK)) {
            rVarK = null;
        }
        if (jVarF == null && rVarK == null) {
            return fVar;
        }
        org.threeten.bp.chrono.j jVar2 = jVarF != null ? jVarF : jVar;
        if (rVarK != null) {
            rVar = rVarK;
        }
        if (rVarK != null) {
            if (fVar.q(org.threeten.bp.temporal.a.f340344m3)) {
                if (jVar2 == null) {
                    jVar2 = org.threeten.bp.chrono.o.f339936e;
                }
                return jVar2.U(org.threeten.bp.f.E(fVar), rVarK);
            }
            r rVarD = rVarK.D();
            s sVar = (s) fVar.d(org.threeten.bp.temporal.k.d());
            if ((rVarD instanceof s) && sVar != null && !rVarD.equals(sVar)) {
                throw new org.threeten.bp.b("Invalid override zone for temporal: " + rVarK + " " + fVar);
            }
        }
        if (jVarF != null) {
            if (fVar.q(org.threeten.bp.temporal.a.H1)) {
                cVarE = jVar2.e(fVar);
            } else if (jVarF != org.threeten.bp.chrono.o.f339936e || jVar != null) {
                for (org.threeten.bp.temporal.a aVar : org.threeten.bp.temporal.a.values()) {
                    if (aVar.isDateBased() && fVar.q(aVar)) {
                        throw new org.threeten.bp.b("Invalid override chronology for temporal: " + jVarF + " " + fVar);
                    }
                }
            }
        }
        return new a(cVarE, fVar, jVar2, rVar);
    }

    void b() {
        this.f340154d--;
    }

    Locale c() {
        return this.f340152b;
    }

    i d() {
        return this.f340153c;
    }

    org.threeten.bp.temporal.f e() {
        return this.f340151a;
    }

    Long f(org.threeten.bp.temporal.j jVar) {
        try {
            return Long.valueOf(this.f340151a.t(jVar));
        } catch (org.threeten.bp.b e10) {
            if (this.f340154d > 0) {
                return null;
            }
            throw e10;
        }
    }

    <R> R g(org.threeten.bp.temporal.l<R> lVar) {
        R r10 = (R) this.f340151a.d(lVar);
        if (r10 != null || this.f340154d != 0) {
            return r10;
        }
        throw new org.threeten.bp.b("Unable to extract value: " + this.f340151a.getClass());
    }

    void h(org.threeten.bp.temporal.f fVar) {
        cn.d.j(fVar, "temporal");
        this.f340151a = fVar;
    }

    void i(Locale locale) {
        cn.d.j(locale, "locale");
        this.f340152b = locale;
    }

    void j() {
        this.f340154d++;
    }

    public String toString() {
        return this.f340151a.toString();
    }

    g(org.threeten.bp.temporal.f fVar, Locale locale, i iVar) {
        this.f340151a = fVar;
        this.f340152b = locale;
        this.f340153c = iVar;
    }
}
