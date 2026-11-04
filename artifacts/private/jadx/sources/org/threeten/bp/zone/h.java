package org.threeten.bp.zone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.chrono.o;
import org.threeten.bp.p;
import org.threeten.bp.s;

/* JADX INFO: loaded from: classes14.dex */
class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<b> f340536a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<Object, Object> f340537b;

    class a implements Comparable<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f340538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private org.threeten.bp.j f340539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f340540c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private org.threeten.bp.d f340541d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private org.threeten.bp.i f340542e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f340543f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private f.b f340544g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f340545h;

        a(int i10, org.threeten.bp.j jVar, int i11, org.threeten.bp.d dVar, org.threeten.bp.i iVar, int i12, f.b bVar, int i13) {
            this.f340538a = i10;
            this.f340539b = jVar;
            this.f340540c = i11;
            this.f340541d = dVar;
            this.f340542e = iVar;
            this.f340543f = i12;
            this.f340544g = bVar;
            this.f340545h = i13;
        }

        private org.threeten.bp.g q() {
            int i10 = this.f340540c;
            if (i10 < 0) {
                org.threeten.bp.g gVarD0 = org.threeten.bp.g.D0(this.f340538a, this.f340539b, this.f340539b.D(o.f339936e.isLeapYear(this.f340538a)) + 1 + this.f340540c);
                org.threeten.bp.d dVar = this.f340541d;
                return dVar != null ? gVarD0.s(org.threeten.bp.temporal.h.m(dVar)) : gVarD0;
            }
            org.threeten.bp.g gVarD1 = org.threeten.bp.g.D0(this.f340538a, this.f340539b, i10);
            org.threeten.bp.d dVar2 = this.f340541d;
            return dVar2 != null ? gVarD1.s(org.threeten.bp.temporal.h.k(dVar2)) : gVarD1;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            int iCompareTo = this.f340538a - aVar.f340538a;
            if (iCompareTo == 0) {
                iCompareTo = this.f340539b.compareTo(aVar.f340539b);
            }
            if (iCompareTo == 0) {
                iCompareTo = q().compareTo(aVar.q());
            }
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            long jU0 = this.f340542e.u0() + (this.f340543f * 86400);
            long jU1 = aVar.f340542e.u0() + (aVar.f340543f * 86400);
            if (jU0 < jU1) {
                return -1;
            }
            return jU0 > jU1 ? 1 : 0;
        }

        e r(s sVar, int i10) {
            org.threeten.bp.h hVar = (org.threeten.bp.h) h.this.g(org.threeten.bp.h.H0(((org.threeten.bp.g) h.this.g(q())).K0(this.f340543f), this.f340542e));
            s sVar2 = (s) h.this.g(s.X(sVar.S() + i10));
            return new e((org.threeten.bp.h) h.this.g(this.f340544g.b(hVar, sVar, sVar2)), sVar2, (s) h.this.g(s.X(sVar.S() + this.f340545h)));
        }

        f s(s sVar, int i10) {
            org.threeten.bp.j jVar;
            if (this.f340540c < 0 && (jVar = this.f340539b) != org.threeten.bp.j.FEBRUARY) {
                this.f340540c = jVar.E() - 6;
            }
            e eVarR = r(sVar, i10);
            return new f(this.f340539b, this.f340540c, this.f340541d, this.f340542e, this.f340543f, this.f340544g, sVar, eVarR.r(), eVarR.q());
        }
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s f340547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final org.threeten.bp.h f340548b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f.b f340549c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f340550d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<a> f340551e = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f340552f = p.f340293b;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List<a> f340553g = new ArrayList();

        b(s sVar, org.threeten.bp.h hVar, f.b bVar) {
            this.f340548b = hVar;
            this.f340549c = bVar;
            this.f340547a = sVar;
        }

        void e(int i10, int i11, org.threeten.bp.j jVar, int i12, org.threeten.bp.d dVar, org.threeten.bp.i iVar, int i13, f.b bVar, int i14) {
            boolean z10;
            if (this.f340550d != null) {
                throw new IllegalStateException("Window has a fixed DST saving, so cannot have DST rules");
            }
            if (this.f340551e.size() >= 2000) {
                throw new IllegalStateException("Window has reached the maximum number of allowed rules");
            }
            if (i11 == 999999999) {
                z10 = true;
                i11 = i10;
            } else {
                z10 = false;
            }
            for (int i15 = i10; i15 <= i11; i15++) {
                a aVar = h.this.new a(i15, jVar, i12, dVar, iVar, i13, bVar, i14);
                if (z10) {
                    this.f340553g.add(aVar);
                    this.f340552f = Math.max(i10, this.f340552f);
                } else {
                    this.f340551e.add(aVar);
                }
            }
        }

        long f(int i10) {
            s sVarG = g(i10);
            return this.f340549c.b(this.f340548b, this.f340547a, sVarG).T(sVarG);
        }

        s g(int i10) {
            return s.X(this.f340547a.S() + i10);
        }

        boolean h() {
            return this.f340548b.equals(org.threeten.bp.h.f340206e) && this.f340549c == f.b.WALL && this.f340550d == null && this.f340553g.isEmpty() && this.f340551e.isEmpty();
        }

        void i(int i10) {
            if (this.f340551e.size() > 0 || this.f340553g.size() > 0) {
                throw new IllegalStateException("Window has DST rules, so cannot have fixed savings");
            }
            this.f340550d = Integer.valueOf(i10);
        }

        void j(int i10) {
            if (this.f340553g.size() == 1) {
                throw new IllegalStateException("Cannot have only one rule defined as being forever");
            }
            if (this.f340548b.equals(org.threeten.bp.h.f340206e)) {
                this.f340552f = Math.max(this.f340552f, i10) + 1;
                for (a aVar : this.f340553g) {
                    e(aVar.f340538a, this.f340552f, aVar.f340539b, aVar.f340540c, aVar.f340541d, aVar.f340542e, aVar.f340543f, aVar.f340544g, aVar.f340545h);
                    aVar.f340538a = this.f340552f + 1;
                }
                int i11 = this.f340552f;
                if (i11 == 999999999) {
                    this.f340553g.clear();
                } else {
                    this.f340552f = i11 + 1;
                }
            } else {
                int iN0 = this.f340548b.n0();
                for (a aVar2 : this.f340553g) {
                    e(aVar2.f340538a, iN0 + 1, aVar2.f340539b, aVar2.f340540c, aVar2.f340541d, aVar2.f340542e, aVar2.f340543f, aVar2.f340544g, aVar2.f340545h);
                }
                this.f340553g.clear();
                this.f340552f = p.f340294c;
            }
            Collections.sort(this.f340551e);
            Collections.sort(this.f340553g);
            if (this.f340551e.size() == 0 && this.f340550d == null) {
                this.f340550d = 0;
            }
        }

        void k(b bVar) {
            if (this.f340548b.I(bVar.f340548b)) {
                throw new IllegalStateException("Windows must be added in date-time order: " + this.f340548b + " < " + bVar.f340548b);
            }
        }
    }

    h a(int i10, int i11, org.threeten.bp.j jVar, int i12, org.threeten.bp.d dVar, org.threeten.bp.i iVar, int i13, f.b bVar, int i14) {
        cn.d.j(jVar, "month");
        cn.d.j(bVar, "timeDefinition");
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340340k3;
        aVar.l(i10);
        aVar.l(i11);
        if (i12 < -28 || i12 > 31 || i12 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (this.f340536a.isEmpty()) {
            throw new IllegalStateException("Must add a window before adding a rule");
        }
        List<b> list = this.f340536a;
        list.get(list.size() - 1).e(i10, i11, jVar, i12, dVar, iVar, i13, bVar, i14);
        return this;
    }

    public h b(int i10, int i11, org.threeten.bp.j jVar, int i12, org.threeten.bp.d dVar, org.threeten.bp.i iVar, boolean z10, f.b bVar, int i13) {
        cn.d.j(jVar, "month");
        cn.d.j(iVar, "time");
        cn.d.j(bVar, "timeDefinition");
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340340k3;
        aVar.l(i10);
        aVar.l(i11);
        if (i12 < -28 || i12 > 31 || i12 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z10 && !iVar.equals(org.threeten.bp.i.f340214g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (this.f340536a.isEmpty()) {
            throw new IllegalStateException("Must add a window before adding a rule");
        }
        List<b> list = this.f340536a;
        list.get(list.size() - 1).e(i10, i11, jVar, i12, dVar, iVar, z10 ? 1 : 0, bVar, i13);
        return this;
    }

    public h c(int i10, org.threeten.bp.j jVar, int i11, org.threeten.bp.i iVar, boolean z10, f.b bVar, int i12) {
        return b(i10, i10, jVar, i11, null, iVar, z10, bVar, i12);
    }

    public h d(org.threeten.bp.h hVar, f.b bVar, int i10) {
        cn.d.j(hVar, "transitionDateTime");
        return b(hVar.n0(), hVar.n0(), hVar.j0(), hVar.e0(), null, hVar.W(), false, bVar, i10);
    }

    public h e(s sVar, org.threeten.bp.h hVar, f.b bVar) {
        cn.d.j(sVar, "standardOffset");
        cn.d.j(hVar, "until");
        cn.d.j(bVar, "untilDefinition");
        b bVar2 = new b(sVar, hVar, bVar);
        if (this.f340536a.size() > 0) {
            List<b> list = this.f340536a;
            bVar2.k(list.get(list.size() - 1));
        }
        this.f340536a.add(bVar2);
        return this;
    }

    public h f(s sVar) {
        return e(sVar, org.threeten.bp.h.f340206e, f.b.WALL);
    }

    <T> T g(T t10) {
        if (!this.f340537b.containsKey(t10)) {
            this.f340537b.put(t10, t10);
        }
        return (T) this.f340537b.get(t10);
    }

    public h h(int i10) {
        if (this.f340536a.isEmpty()) {
            throw new IllegalStateException("Must add a window before setting the fixed savings");
        }
        List<b> list = this.f340536a;
        list.get(list.size() - 1).i(i10);
        return this;
    }

    public g i(String str) {
        return j(str, new HashMap());
    }

    g j(String str, Map<Object, Object> map) {
        b bVar;
        cn.d.j(str, "zoneId");
        this.f340537b = map;
        if (this.f340536a.isEmpty()) {
            throw new IllegalStateException("No windows have been added to the builder");
        }
        ArrayList arrayList = new ArrayList(4);
        ArrayList arrayList2 = new ArrayList(256);
        ArrayList arrayList3 = new ArrayList(2);
        int i10 = 0;
        b bVar2 = this.f340536a.get(0);
        s sVar = bVar2.f340547a;
        int iIntValue = bVar2.f340550d != null ? bVar2.f340550d.intValue() : 0;
        s sVar2 = (s) g(s.X(sVar.S() + iIntValue));
        org.threeten.bp.h hVar = (org.threeten.bp.h) g(org.threeten.bp.h.B0(p.f340293b, 1, 1, 0, 0));
        s sVar3 = sVar2;
        for (b bVar3 : this.f340536a) {
            bVar3.j(hVar.n0());
            Integer numValueOf = bVar3.f340550d;
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(i10);
                for (a aVar : bVar3.f340551e) {
                    if (aVar.r(sVar, iIntValue).toEpochSecond() > hVar.T(sVar3)) {
                        break;
                    }
                    numValueOf = Integer.valueOf(aVar.f340545h);
                }
            }
            if (!sVar.equals(bVar3.f340547a)) {
                arrayList.add(g(new e(org.threeten.bp.h.I0(hVar.T(sVar3), i10, sVar), sVar, bVar3.f340547a)));
                sVar = (s) g(bVar3.f340547a);
            }
            s sVar4 = (s) g(s.X(sVar.S() + numValueOf.intValue()));
            if (!sVar3.equals(sVar4)) {
                arrayList2.add((e) g(new e(hVar, sVar3, sVar4)));
            }
            iIntValue = numValueOf.intValue();
            for (a aVar2 : bVar3.f340551e) {
                e eVar = (e) g(aVar2.r(sVar, iIntValue));
                if (eVar.toEpochSecond() >= hVar.T(sVar3) && eVar.toEpochSecond() < bVar3.f(iIntValue)) {
                    bVar = bVar2;
                    if (!eVar.r().equals(eVar.q())) {
                        arrayList2.add(eVar);
                        iIntValue = aVar2.f340545h;
                    }
                } else {
                    bVar = bVar2;
                }
                bVar2 = bVar;
            }
            b bVar4 = bVar2;
            for (a aVar3 : bVar3.f340553g) {
                arrayList3.add((f) g(aVar3.s(sVar, iIntValue)));
                iIntValue = aVar3.f340545h;
            }
            sVar3 = (s) g(bVar3.g(iIntValue));
            i10 = 0;
            hVar = (org.threeten.bp.h) g(org.threeten.bp.h.I0(bVar3.f(iIntValue), 0, sVar3));
            bVar2 = bVar4;
        }
        return new org.threeten.bp.zone.b(bVar2.f340547a, sVar2, arrayList, arrayList2, arrayList3);
    }
}
