package org.threeten.bp.chrono;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
final class g extends f implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f339874e = 275618735781L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f339875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f339876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f339877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f339878d;

    public g(j jVar, int i10, int i11, int i12) {
        this.f339875a = jVar;
        this.f339876b = i10;
        this.f339877c = i11;
        this.f339878d = i12;
    }

    @Override // org.threeten.bp.chrono.f, org.threeten.bp.temporal.i
    public org.threeten.bp.temporal.e b(org.threeten.bp.temporal.e eVar) {
        cn.d.j(eVar, "temporal");
        j jVar = (j) eVar.d(org.threeten.bp.temporal.k.a());
        if (jVar != null && !this.f339875a.equals(jVar)) {
            throw new org.threeten.bp.b("Invalid chronology, required: " + this.f339875a.getId() + ", but was: " + jVar.getId());
        }
        int i10 = this.f339876b;
        if (i10 != 0) {
            eVar = eVar.f(i10, org.threeten.bp.temporal.b.YEARS);
        }
        int i11 = this.f339877c;
        if (i11 != 0) {
            eVar = eVar.f(i11, org.threeten.bp.temporal.b.MONTHS);
        }
        int i12 = this.f339878d;
        return i12 != 0 ? eVar.f(i12, org.threeten.bp.temporal.b.DAYS) : eVar;
    }

    @Override // org.threeten.bp.chrono.f, org.threeten.bp.temporal.i
    public org.threeten.bp.temporal.e c(org.threeten.bp.temporal.e eVar) {
        cn.d.j(eVar, "temporal");
        j jVar = (j) eVar.d(org.threeten.bp.temporal.k.a());
        if (jVar != null && !this.f339875a.equals(jVar)) {
            throw new org.threeten.bp.b("Invalid chronology, required: " + this.f339875a.getId() + ", but was: " + jVar.getId());
        }
        int i10 = this.f339876b;
        if (i10 != 0) {
            eVar = eVar.v(i10, org.threeten.bp.temporal.b.YEARS);
        }
        int i11 = this.f339877c;
        if (i11 != 0) {
            eVar = eVar.v(i11, org.threeten.bp.temporal.b.MONTHS);
        }
        int i12 = this.f339878d;
        return i12 != 0 ? eVar.v(i12, org.threeten.bp.temporal.b.DAYS) : eVar;
    }

    @Override // org.threeten.bp.chrono.f, org.threeten.bp.temporal.i
    public long d(org.threeten.bp.temporal.m mVar) {
        int i10;
        if (mVar == org.threeten.bp.temporal.b.YEARS) {
            i10 = this.f339876b;
        } else if (mVar == org.threeten.bp.temporal.b.MONTHS) {
            i10 = this.f339877c;
        } else {
            if (mVar != org.threeten.bp.temporal.b.DAYS) {
                throw new org.threeten.bp.temporal.n("Unsupported unit: " + mVar);
            }
            i10 = this.f339878d;
        }
        return i10;
    }

    @Override // org.threeten.bp.chrono.f
    public j e() {
        return this.f339875a;
    }

    @Override // org.threeten.bp.chrono.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f339876b == gVar.f339876b && this.f339877c == gVar.f339877c && this.f339878d == gVar.f339878d && this.f339875a.equals(gVar.f339875a)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.threeten.bp.chrono.f, org.threeten.bp.temporal.i
    public List<org.threeten.bp.temporal.m> getUnits() {
        return Collections.unmodifiableList(Arrays.asList(org.threeten.bp.temporal.b.YEARS, org.threeten.bp.temporal.b.MONTHS, org.threeten.bp.temporal.b.DAYS));
    }

    @Override // org.threeten.bp.chrono.f
    public f h(org.threeten.bp.temporal.i iVar) {
        if (iVar instanceof g) {
            g gVar = (g) iVar;
            if (gVar.e().equals(e())) {
                return new g(this.f339875a, cn.d.p(this.f339876b, gVar.f339876b), cn.d.p(this.f339877c, gVar.f339877c), cn.d.p(this.f339878d, gVar.f339878d));
            }
        }
        throw new org.threeten.bp.b("Unable to subtract amount: " + iVar);
    }

    @Override // org.threeten.bp.chrono.f
    public int hashCode() {
        return this.f339875a.hashCode() + Integer.rotateLeft(this.f339876b, 16) + Integer.rotateLeft(this.f339877c, 8) + this.f339878d;
    }

    @Override // org.threeten.bp.chrono.f
    public f i(int i10) {
        return new g(this.f339875a, cn.d.m(this.f339876b, i10), cn.d.m(this.f339877c, i10), cn.d.m(this.f339878d, i10));
    }

    @Override // org.threeten.bp.chrono.f
    public f k() {
        j jVar = this.f339875a;
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340334h3;
        if (!jVar.L(aVar).g()) {
            return this;
        }
        long jD = (this.f339875a.L(aVar).d() - this.f339875a.L(aVar).e()) + 1;
        long j10 = (((long) this.f339876b) * jD) + ((long) this.f339877c);
        return new g(this.f339875a, cn.d.r(j10 / jD), cn.d.r(j10 % jD), this.f339878d);
    }

    @Override // org.threeten.bp.chrono.f
    public f l(org.threeten.bp.temporal.i iVar) {
        if (iVar instanceof g) {
            g gVar = (g) iVar;
            if (gVar.e().equals(e())) {
                return new g(this.f339875a, cn.d.k(this.f339876b, gVar.f339876b), cn.d.k(this.f339877c, gVar.f339877c), cn.d.k(this.f339878d, gVar.f339878d));
            }
        }
        throw new org.threeten.bp.b("Unable to add amount: " + iVar);
    }

    @Override // org.threeten.bp.chrono.f
    public String toString() {
        if (g()) {
            return this.f339875a + " P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f339875a);
        sb2.append(' ');
        sb2.append('P');
        int i10 = this.f339876b;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append(ni.f.f333371h);
        }
        int i11 = this.f339877c;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append(ni.f.f333370g);
        }
        int i12 = this.f339878d;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('D');
        }
        return sb2.toString();
    }
}
