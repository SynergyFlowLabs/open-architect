package org.threeten.bp.format;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.threeten.bp.r;
import org.threeten.bp.s;

/* JADX INFO: loaded from: classes14.dex */
final class a extends cn.c implements org.threeten.bp.temporal.f, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<org.threeten.bp.temporal.j, Long> f340035a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    org.threeten.bp.chrono.j f340036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    r f340037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    org.threeten.bp.chrono.c f340038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    org.threeten.bp.i f340039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f340040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    org.threeten.bp.n f340041g;

    public a() {
    }

    private void E(org.threeten.bp.g gVar) {
        if (gVar != null) {
            z(gVar);
            for (org.threeten.bp.temporal.j jVar : this.f340035a.keySet()) {
                if ((jVar instanceof org.threeten.bp.temporal.a) && jVar.isDateBased()) {
                    try {
                        long jT = gVar.t(jVar);
                        Long l10 = this.f340035a.get(jVar);
                        if (jT != l10.longValue()) {
                            throw new org.threeten.bp.b("Conflict found: Field " + jVar + " " + jT + " differs from " + jVar + " " + l10 + " derived from " + gVar);
                        }
                    } catch (org.threeten.bp.b unused) {
                        continue;
                    }
                }
            }
        }
    }

    private void H() {
        org.threeten.bp.i iVar;
        if (this.f340035a.size() > 0) {
            org.threeten.bp.chrono.c cVar = this.f340038d;
            if (cVar != null && (iVar = this.f340039e) != null) {
                I(cVar.w(iVar));
                return;
            }
            if (cVar != null) {
                I(cVar);
                return;
            }
            org.threeten.bp.temporal.f fVar = this.f340039e;
            if (fVar != null) {
                I(fVar);
            }
        }
    }

    private void I(org.threeten.bp.temporal.f fVar) {
        Iterator<Map.Entry<org.threeten.bp.temporal.j, Long>> it = this.f340035a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<org.threeten.bp.temporal.j, Long> next = it.next();
            org.threeten.bp.temporal.j key = next.getKey();
            long jLongValue = next.getValue().longValue();
            if (fVar.q(key)) {
                try {
                    long jT = fVar.t(key);
                    if (jT != jLongValue) {
                        throw new org.threeten.bp.b("Cross check failed: " + key + " " + jT + " vs " + key + " " + jLongValue);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    private Long L(org.threeten.bp.temporal.j jVar) {
        return this.f340035a.get(jVar);
    }

    private void M(k kVar) {
        if (this.f340036b instanceof org.threeten.bp.chrono.o) {
            E(org.threeten.bp.chrono.o.f339936e.O(this.f340035a, kVar));
            return;
        }
        Map<org.threeten.bp.temporal.j, Long> map = this.f340035a;
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.H1;
        if (map.containsKey(aVar)) {
            E(org.threeten.bp.g.E0(this.f340035a.remove(aVar).longValue()));
        }
    }

    private void N() {
        if (this.f340035a.containsKey(org.threeten.bp.temporal.a.f340344m3)) {
            r rVar = this.f340037c;
            if (rVar != null) {
                O(rVar);
                return;
            }
            Long l10 = this.f340035a.get(org.threeten.bp.temporal.a.f340346n3);
            if (l10 != null) {
                O(s.X(l10.intValue()));
            }
        }
    }

    private void O(r rVar) {
        Map<org.threeten.bp.temporal.j, Long> map = this.f340035a;
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340344m3;
        org.threeten.bp.chrono.h<?> hVarU = this.f340036b.U(org.threeten.bp.f.Z(map.remove(aVar).longValue()), rVar);
        if (this.f340038d == null) {
            z(hVarU.V());
        } else {
            Z(aVar, hVarU.V());
        }
        w(org.threeten.bp.temporal.a.f340341l, hVarU.X().u0());
    }

    private void S(k kVar) {
        Map<org.threeten.bp.temporal.j, Long> map = this.f340035a;
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340354v;
        if (map.containsKey(aVar)) {
            long jLongValue = this.f340035a.remove(aVar).longValue();
            if (kVar != k.LENIENT && (kVar != k.SMART || jLongValue != 0)) {
                aVar.l(jLongValue);
            }
            org.threeten.bp.temporal.a aVar2 = org.threeten.bp.temporal.a.f340353t;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            w(aVar2, jLongValue);
        }
        Map<org.threeten.bp.temporal.j, Long> map2 = this.f340035a;
        org.threeten.bp.temporal.a aVar3 = org.threeten.bp.temporal.a.f340352s;
        if (map2.containsKey(aVar3)) {
            long jLongValue2 = this.f340035a.remove(aVar3).longValue();
            if (kVar != k.LENIENT && (kVar != k.SMART || jLongValue2 != 0)) {
                aVar3.l(jLongValue2);
            }
            w(org.threeten.bp.temporal.a.f340347o, jLongValue2 != 12 ? jLongValue2 : 0L);
        }
        k kVar2 = k.LENIENT;
        if (kVar != kVar2) {
            Map<org.threeten.bp.temporal.j, Long> map3 = this.f340035a;
            org.threeten.bp.temporal.a aVar4 = org.threeten.bp.temporal.a.f340355w;
            if (map3.containsKey(aVar4)) {
                aVar4.l(this.f340035a.get(aVar4).longValue());
            }
            Map<org.threeten.bp.temporal.j, Long> map4 = this.f340035a;
            org.threeten.bp.temporal.a aVar5 = org.threeten.bp.temporal.a.f340347o;
            if (map4.containsKey(aVar5)) {
                aVar5.l(this.f340035a.get(aVar5).longValue());
            }
        }
        Map<org.threeten.bp.temporal.j, Long> map5 = this.f340035a;
        org.threeten.bp.temporal.a aVar6 = org.threeten.bp.temporal.a.f340355w;
        if (map5.containsKey(aVar6)) {
            Map<org.threeten.bp.temporal.j, Long> map6 = this.f340035a;
            org.threeten.bp.temporal.a aVar7 = org.threeten.bp.temporal.a.f340347o;
            if (map6.containsKey(aVar7)) {
                w(org.threeten.bp.temporal.a.f340353t, (this.f340035a.remove(aVar6).longValue() * 12) + this.f340035a.remove(aVar7).longValue());
            }
        }
        Map<org.threeten.bp.temporal.j, Long> map7 = this.f340035a;
        org.threeten.bp.temporal.a aVar8 = org.threeten.bp.temporal.a.f340330f;
        if (map7.containsKey(aVar8)) {
            long jLongValue3 = this.f340035a.remove(aVar8).longValue();
            if (kVar != kVar2) {
                aVar8.l(jLongValue3);
            }
            w(org.threeten.bp.temporal.a.f340341l, jLongValue3 / 1000000000);
            w(org.threeten.bp.temporal.a.f340329e, jLongValue3 % 1000000000);
        }
        Map<org.threeten.bp.temporal.j, Long> map8 = this.f340035a;
        org.threeten.bp.temporal.a aVar9 = org.threeten.bp.temporal.a.f340333h;
        if (map8.containsKey(aVar9)) {
            long jLongValue4 = this.f340035a.remove(aVar9).longValue();
            if (kVar != kVar2) {
                aVar9.l(jLongValue4);
            }
            w(org.threeten.bp.temporal.a.f340341l, jLongValue4 / 1000000);
            w(org.threeten.bp.temporal.a.f340331g, jLongValue4 % 1000000);
        }
        Map<org.threeten.bp.temporal.j, Long> map9 = this.f340035a;
        org.threeten.bp.temporal.a aVar10 = org.threeten.bp.temporal.a.f340337j;
        if (map9.containsKey(aVar10)) {
            long jLongValue5 = this.f340035a.remove(aVar10).longValue();
            if (kVar != kVar2) {
                aVar10.l(jLongValue5);
            }
            w(org.threeten.bp.temporal.a.f340341l, jLongValue5 / 1000);
            w(org.threeten.bp.temporal.a.f340335i, jLongValue5 % 1000);
        }
        Map<org.threeten.bp.temporal.j, Long> map10 = this.f340035a;
        org.threeten.bp.temporal.a aVar11 = org.threeten.bp.temporal.a.f340341l;
        if (map10.containsKey(aVar11)) {
            long jLongValue6 = this.f340035a.remove(aVar11).longValue();
            if (kVar != kVar2) {
                aVar11.l(jLongValue6);
            }
            w(org.threeten.bp.temporal.a.f340353t, jLongValue6 / 3600);
            w(org.threeten.bp.temporal.a.f340343m, (jLongValue6 / 60) % 60);
            w(org.threeten.bp.temporal.a.f340339k, jLongValue6 % 60);
        }
        Map<org.threeten.bp.temporal.j, Long> map11 = this.f340035a;
        org.threeten.bp.temporal.a aVar12 = org.threeten.bp.temporal.a.f340345n;
        if (map11.containsKey(aVar12)) {
            long jLongValue7 = this.f340035a.remove(aVar12).longValue();
            if (kVar != kVar2) {
                aVar12.l(jLongValue7);
            }
            w(org.threeten.bp.temporal.a.f340353t, jLongValue7 / 60);
            w(org.threeten.bp.temporal.a.f340343m, jLongValue7 % 60);
        }
        if (kVar != kVar2) {
            Map<org.threeten.bp.temporal.j, Long> map12 = this.f340035a;
            org.threeten.bp.temporal.a aVar13 = org.threeten.bp.temporal.a.f340335i;
            if (map12.containsKey(aVar13)) {
                aVar13.l(this.f340035a.get(aVar13).longValue());
            }
            Map<org.threeten.bp.temporal.j, Long> map13 = this.f340035a;
            org.threeten.bp.temporal.a aVar14 = org.threeten.bp.temporal.a.f340331g;
            if (map13.containsKey(aVar14)) {
                aVar14.l(this.f340035a.get(aVar14).longValue());
            }
        }
        Map<org.threeten.bp.temporal.j, Long> map14 = this.f340035a;
        org.threeten.bp.temporal.a aVar15 = org.threeten.bp.temporal.a.f340335i;
        if (map14.containsKey(aVar15)) {
            Map<org.threeten.bp.temporal.j, Long> map15 = this.f340035a;
            org.threeten.bp.temporal.a aVar16 = org.threeten.bp.temporal.a.f340331g;
            if (map15.containsKey(aVar16)) {
                w(aVar16, (this.f340035a.remove(aVar15).longValue() * 1000) + (this.f340035a.get(aVar16).longValue() % 1000));
            }
        }
        Map<org.threeten.bp.temporal.j, Long> map16 = this.f340035a;
        org.threeten.bp.temporal.a aVar17 = org.threeten.bp.temporal.a.f340331g;
        if (map16.containsKey(aVar17)) {
            Map<org.threeten.bp.temporal.j, Long> map17 = this.f340035a;
            org.threeten.bp.temporal.a aVar18 = org.threeten.bp.temporal.a.f340329e;
            if (map17.containsKey(aVar18)) {
                w(aVar17, this.f340035a.get(aVar18).longValue() / 1000);
                this.f340035a.remove(aVar17);
            }
        }
        if (this.f340035a.containsKey(aVar15)) {
            Map<org.threeten.bp.temporal.j, Long> map18 = this.f340035a;
            org.threeten.bp.temporal.a aVar19 = org.threeten.bp.temporal.a.f340329e;
            if (map18.containsKey(aVar19)) {
                w(aVar15, this.f340035a.get(aVar19).longValue() / 1000000);
                this.f340035a.remove(aVar15);
            }
        }
        if (this.f340035a.containsKey(aVar17)) {
            w(org.threeten.bp.temporal.a.f340329e, this.f340035a.remove(aVar17).longValue() * 1000);
        } else {
            if (this.f340035a.containsKey(aVar15)) {
                w(org.threeten.bp.temporal.a.f340329e, this.f340035a.remove(aVar15).longValue() * 1000000);
            }
        }
    }

    private a T(org.threeten.bp.temporal.j jVar, long j10) {
        this.f340035a.put(jVar, Long.valueOf(j10));
        return this;
    }

    private boolean V(k kVar) {
        org.threeten.bp.temporal.j key;
        int i10 = 0;
        loop0: while (i10 < 100) {
            Iterator<Map.Entry<org.threeten.bp.temporal.j, Long>> it = this.f340035a.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    break loop0;
                }
                key = it.next().getKey();
                org.threeten.bp.temporal.f fVarF = key.f(this.f340035a, this, kVar);
                if (fVarF != null) {
                    if (fVarF instanceof org.threeten.bp.chrono.h) {
                        org.threeten.bp.chrono.h hVar = (org.threeten.bp.chrono.h) fVarF;
                        r rVar = this.f340037c;
                        if (rVar == null) {
                            this.f340037c = hVar.H();
                        } else if (!rVar.equals(hVar.H())) {
                            throw new org.threeten.bp.b("ChronoZonedDateTime must use the effective parsed zone: " + this.f340037c);
                        }
                        fVarF = hVar.W();
                    }
                    if (fVarF instanceof org.threeten.bp.chrono.c) {
                        Z(key, (org.threeten.bp.chrono.c) fVarF);
                        break;
                    }
                    if (fVarF instanceof org.threeten.bp.i) {
                        Y(key, (org.threeten.bp.i) fVarF);
                        break;
                    }
                    if (fVarF instanceof org.threeten.bp.chrono.d) {
                        org.threeten.bp.chrono.d dVar = (org.threeten.bp.chrono.d) fVarF;
                        Z(key, dVar.V());
                        Y(key, dVar.W());
                        break;
                    }
                    throw new org.threeten.bp.b("Unknown type: " + fVarF.getClass().getName());
                }
            } while (this.f340035a.containsKey(key));
            i10++;
        }
        if (i10 != 100) {
            return i10 > 0;
        }
        throw new org.threeten.bp.b("Badly written field");
    }

    private void W() {
        if (this.f340039e == null) {
            if (this.f340035a.containsKey(org.threeten.bp.temporal.a.f340344m3) || this.f340035a.containsKey(org.threeten.bp.temporal.a.f340341l) || this.f340035a.containsKey(org.threeten.bp.temporal.a.f340339k)) {
                Map<org.threeten.bp.temporal.j, Long> map = this.f340035a;
                org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340329e;
                if (map.containsKey(aVar)) {
                    long jLongValue = this.f340035a.get(aVar).longValue();
                    this.f340035a.put(org.threeten.bp.temporal.a.f340331g, Long.valueOf(jLongValue / 1000));
                    this.f340035a.put(org.threeten.bp.temporal.a.f340335i, Long.valueOf(jLongValue / 1000000));
                } else {
                    this.f340035a.put(aVar, 0L);
                    this.f340035a.put(org.threeten.bp.temporal.a.f340331g, 0L);
                    this.f340035a.put(org.threeten.bp.temporal.a.f340335i, 0L);
                }
            }
        }
    }

    private void X() {
        if (this.f340038d != null && this.f340039e != null) {
            Long l10 = this.f340035a.get(org.threeten.bp.temporal.a.f340346n3);
            if (l10 != null) {
                cn.b bVarW = this.f340038d.w(this.f340039e).w(s.X(l10.intValue()));
                org.threeten.bp.temporal.j jVar = org.threeten.bp.temporal.a.f340344m3;
                this.f340035a.put(jVar, Long.valueOf(bVarW.t(jVar)));
                return;
            }
            if (this.f340037c != null) {
                cn.b bVarW2 = this.f340038d.w(this.f340039e).w(this.f340037c);
                org.threeten.bp.temporal.j jVar2 = org.threeten.bp.temporal.a.f340344m3;
                this.f340035a.put(jVar2, Long.valueOf(bVarW2.t(jVar2)));
            }
        }
    }

    private void Y(org.threeten.bp.temporal.j jVar, org.threeten.bp.i iVar) {
        long jT0 = iVar.t0();
        Long lPut = this.f340035a.put(org.threeten.bp.temporal.a.f340330f, Long.valueOf(jT0));
        if (lPut == null || lPut.longValue() == jT0) {
            return;
        }
        throw new org.threeten.bp.b("Conflict found: " + org.threeten.bp.i.h0(lPut.longValue()) + " differs from " + iVar + " while resolving  " + jVar);
    }

    private void Z(org.threeten.bp.temporal.j jVar, org.threeten.bp.chrono.c cVar) {
        if (!this.f340036b.equals(cVar.E())) {
            throw new org.threeten.bp.b("ChronoLocalDate must use the effective parsed chronology: " + this.f340036b);
        }
        long epochDay = cVar.toEpochDay();
        Long lPut = this.f340035a.put(org.threeten.bp.temporal.a.H1, Long.valueOf(epochDay));
        if (lPut != null && lPut.longValue() != epochDay) {
            throw new org.threeten.bp.b("Conflict found: " + org.threeten.bp.g.E0(lPut.longValue()) + " differs from " + org.threeten.bp.g.E0(epochDay) + " while resolving  " + jVar);
        }
    }

    private void a0(k kVar) {
        Long l10 = 0L;
        Map<org.threeten.bp.temporal.j, Long> map = this.f340035a;
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340353t;
        Long l11 = map.get(aVar);
        Map<org.threeten.bp.temporal.j, Long> map2 = this.f340035a;
        org.threeten.bp.temporal.a aVar2 = org.threeten.bp.temporal.a.f340343m;
        Long l12 = map2.get(aVar2);
        Map<org.threeten.bp.temporal.j, Long> map3 = this.f340035a;
        org.threeten.bp.temporal.a aVar3 = org.threeten.bp.temporal.a.f340339k;
        Long l13 = map3.get(aVar3);
        Map<org.threeten.bp.temporal.j, Long> map4 = this.f340035a;
        org.threeten.bp.temporal.a aVar4 = org.threeten.bp.temporal.a.f340329e;
        Long l14 = map4.get(aVar4);
        if (l11 == null) {
            return;
        }
        if (l12 != null || (l13 == null && l14 == null)) {
            if (l12 == null || l13 != null || l14 == null) {
                if (kVar != k.LENIENT) {
                    if (kVar == k.SMART && l11.longValue() == 24 && ((l12 == null || l12.longValue() == 0) && ((l13 == null || l13.longValue() == 0) && (l14 == null || l14.longValue() == 0)))) {
                        this.f340041g = org.threeten.bp.n.A(1);
                    } else {
                        l10 = l11;
                    }
                    int iK = aVar.k(l10.longValue());
                    if (l12 != null) {
                        int iK2 = aVar2.k(l12.longValue());
                        if (l13 != null) {
                            int iK3 = aVar3.k(l13.longValue());
                            if (l14 != null) {
                                x(org.threeten.bp.i.g0(iK, iK2, iK3, aVar4.k(l14.longValue())));
                            } else {
                                x(org.threeten.bp.i.f0(iK, iK2, iK3));
                            }
                        } else if (l14 == null) {
                            x(org.threeten.bp.i.e0(iK, iK2));
                        }
                    } else if (l13 == null && l14 == null) {
                        x(org.threeten.bp.i.e0(iK, 0));
                    }
                } else {
                    long jLongValue = l11.longValue();
                    if (l12 == null) {
                        int iR = cn.d.r(cn.d.e(jLongValue, 24L));
                        x(org.threeten.bp.i.e0(cn.d.g(jLongValue, 24), 0));
                        this.f340041g = org.threeten.bp.n.A(iR);
                    } else if (l13 != null) {
                        long jL = cn.d.l(cn.d.l(cn.d.l(cn.d.o(jLongValue, 3600000000000L), cn.d.o(l12.longValue(), 60000000000L)), cn.d.o(l13.longValue(), 1000000000L)), (l14 != null ? l14 : 0L).longValue());
                        int iE = (int) cn.d.e(jL, 86400000000000L);
                        x(org.threeten.bp.i.h0(cn.d.h(jL, 86400000000000L)));
                        this.f340041g = org.threeten.bp.n.A(iE);
                    } else {
                        long jL2 = cn.d.l(cn.d.o(jLongValue, 3600L), cn.d.o(l12.longValue(), 60L));
                        int iE2 = (int) cn.d.e(jL2, 86400L);
                        x(org.threeten.bp.i.i0(cn.d.h(jL2, 86400L)));
                        this.f340041g = org.threeten.bp.n.A(iE2);
                    }
                }
                this.f340035a.remove(aVar);
                this.f340035a.remove(aVar2);
                this.f340035a.remove(aVar3);
                this.f340035a.remove(aVar4);
            }
        }
    }

    public <R> R D(org.threeten.bp.temporal.l<R> lVar) {
        return lVar.a(this);
    }

    public a U(k kVar, Set<org.threeten.bp.temporal.j> set) {
        org.threeten.bp.chrono.c cVar;
        if (set != null) {
            this.f340035a.keySet().retainAll(set);
        }
        N();
        M(kVar);
        S(kVar);
        if (V(kVar)) {
            N();
            M(kVar);
            S(kVar);
        }
        a0(kVar);
        H();
        org.threeten.bp.n nVar = this.f340041g;
        if (nVar != null && !nVar.g() && (cVar = this.f340038d) != null && this.f340039e != null) {
            this.f340038d = cVar.n(this.f340041g);
            this.f340041g = org.threeten.bp.n.f340271d;
        }
        W();
        X();
        return this;
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public <R> R d(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.g()) {
            return (R) this.f340037c;
        }
        if (lVar == org.threeten.bp.temporal.k.a()) {
            return (R) this.f340036b;
        }
        if (lVar == org.threeten.bp.temporal.k.b()) {
            org.threeten.bp.chrono.c cVar = this.f340038d;
            if (cVar != null) {
                return (R) org.threeten.bp.g.i0(cVar);
            }
            return null;
        }
        if (lVar == org.threeten.bp.temporal.k.c()) {
            return (R) this.f340039e;
        }
        if (lVar == org.threeten.bp.temporal.k.f() || lVar == org.threeten.bp.temporal.k.d()) {
            return lVar.a(this);
        }
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return null;
        }
        return lVar.a(this);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean q(org.threeten.bp.temporal.j jVar) {
        if (jVar == null) {
            return false;
        }
        if (this.f340035a.containsKey(jVar)) {
            return true;
        }
        org.threeten.bp.chrono.c cVar = this.f340038d;
        if (cVar != null && cVar.q(jVar)) {
            return true;
        }
        org.threeten.bp.i iVar = this.f340039e;
        return iVar != null && iVar.q(jVar);
    }

    @Override // org.threeten.bp.temporal.f
    public long t(org.threeten.bp.temporal.j jVar) {
        cn.d.j(jVar, "field");
        Long L = L(jVar);
        if (L != null) {
            return L.longValue();
        }
        org.threeten.bp.chrono.c cVar = this.f340038d;
        if (cVar != null && cVar.q(jVar)) {
            return this.f340038d.t(jVar);
        }
        org.threeten.bp.i iVar = this.f340039e;
        if (iVar != null && iVar.q(jVar)) {
            return this.f340039e.t(jVar);
        }
        throw new org.threeten.bp.b("Field not found: " + jVar);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("DateTimeBuilder[");
        if (this.f340035a.size() > 0) {
            sb2.append("fields=");
            sb2.append(this.f340035a);
        }
        sb2.append(", ");
        sb2.append(this.f340036b);
        sb2.append(", ");
        sb2.append(this.f340037c);
        sb2.append(", ");
        sb2.append(this.f340038d);
        sb2.append(", ");
        sb2.append(this.f340039e);
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    a w(org.threeten.bp.temporal.j jVar, long j10) {
        cn.d.j(jVar, "field");
        Long L = L(jVar);
        if (L != null && L.longValue() != j10) {
            throw new org.threeten.bp.b("Conflict found: " + jVar + " " + L + " differs from " + jVar + " " + j10 + ": " + this);
        }
        return T(jVar, j10);
    }

    void x(org.threeten.bp.i iVar) {
        this.f340039e = iVar;
    }

    void z(org.threeten.bp.chrono.c cVar) {
        this.f340038d = cVar;
    }

    public a(org.threeten.bp.temporal.j jVar, long j10) {
        w(jVar, j10);
    }
}
