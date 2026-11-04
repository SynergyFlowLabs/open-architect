package org.threeten.bp.chrono;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class o extends j implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o f339936e = new o();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f339937f = -1440403870442975015L;

    private o() {
    }

    private Object readResolve() {
        return f339936e;
    }

    @Override // org.threeten.bp.chrono.j
    public int I(k kVar, int i10) {
        if (kVar instanceof p) {
            return kVar == p.CE ? i10 : 1 - i10;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // org.threeten.bp.chrono.j
    public org.threeten.bp.temporal.o L(org.threeten.bp.temporal.a aVar) {
        return aVar.range();
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public org.threeten.bp.g c(int i10, int i11, int i12) {
        return org.threeten.bp.g.C0(i10, i11, i12);
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public org.threeten.bp.g d(k kVar, int i10, int i11, int i12) {
        return c(I(kVar, i10), i11, i12);
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public org.threeten.bp.g e(org.threeten.bp.temporal.f fVar) {
        return org.threeten.bp.g.i0(fVar);
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public org.threeten.bp.g f(long j10) {
        return org.threeten.bp.g.E0(j10);
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public org.threeten.bp.g k() {
        return l(org.threeten.bp.a.g());
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public org.threeten.bp.g l(org.threeten.bp.a aVar) {
        cn.d.j(aVar, "clock");
        return e(org.threeten.bp.g.A0(aVar));
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public org.threeten.bp.g n(org.threeten.bp.r rVar) {
        return l(org.threeten.bp.a.f(rVar));
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public org.threeten.bp.g o(int i10, int i11) {
        return org.threeten.bp.g.F0(i10, i11);
    }

    @Override // org.threeten.bp.chrono.j
    public List<k> eras() {
        return Arrays.asList(p.values());
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public org.threeten.bp.g p(k kVar, int i10, int i11) {
        return o(I(kVar, i10), i11);
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public p t(int i10) {
        return p.w(i10);
    }

    @Override // org.threeten.bp.chrono.j
    public String getCalendarType() {
        return "iso8601";
    }

    @Override // org.threeten.bp.chrono.j
    public String getId() {
        return androidx.exifinterface.media.a.f51488s2;
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public org.threeten.bp.h z(org.threeten.bp.temporal.f fVar) {
        return org.threeten.bp.h.d0(fVar);
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public org.threeten.bp.g O(Map<org.threeten.bp.temporal.j, Long> map, org.threeten.bp.format.k kVar) {
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.H1;
        if (map.containsKey(aVar)) {
            return org.threeten.bp.g.E0(map.remove(aVar).longValue());
        }
        org.threeten.bp.temporal.a aVar2 = org.threeten.bp.temporal.a.f340336i3;
        Long lRemove = map.remove(aVar2);
        if (lRemove != null) {
            if (kVar != org.threeten.bp.format.k.LENIENT) {
                aVar2.l(lRemove.longValue());
            }
            R(map, org.threeten.bp.temporal.a.f340334h3, cn.d.g(lRemove.longValue(), 12) + 1);
            R(map, org.threeten.bp.temporal.a.f340340k3, cn.d.e(lRemove.longValue(), 12L));
        }
        org.threeten.bp.temporal.a aVar3 = org.threeten.bp.temporal.a.f340338j3;
        Long lRemove2 = map.remove(aVar3);
        if (lRemove2 != null) {
            if (kVar != org.threeten.bp.format.k.LENIENT) {
                aVar3.l(lRemove2.longValue());
            }
            Long lRemove3 = map.remove(org.threeten.bp.temporal.a.f340342l3);
            if (lRemove3 == null) {
                org.threeten.bp.temporal.a aVar4 = org.threeten.bp.temporal.a.f340340k3;
                Long l10 = map.get(aVar4);
                if (kVar != org.threeten.bp.format.k.STRICT) {
                    R(map, aVar4, (l10 == null || l10.longValue() > 0) ? lRemove2.longValue() : cn.d.q(1L, lRemove2.longValue()));
                } else if (l10 != null) {
                    R(map, aVar4, l10.longValue() > 0 ? lRemove2.longValue() : cn.d.q(1L, lRemove2.longValue()));
                } else {
                    map.put(aVar3, lRemove2);
                }
            } else if (lRemove3.longValue() == 1) {
                R(map, org.threeten.bp.temporal.a.f340340k3, lRemove2.longValue());
            } else {
                if (lRemove3.longValue() != 0) {
                    throw new org.threeten.bp.b("Invalid value for era: " + lRemove3);
                }
                R(map, org.threeten.bp.temporal.a.f340340k3, cn.d.q(1L, lRemove2.longValue()));
            }
        } else {
            org.threeten.bp.temporal.a aVar5 = org.threeten.bp.temporal.a.f340342l3;
            if (map.containsKey(aVar5)) {
                aVar5.l(map.get(aVar5).longValue());
            }
        }
        org.threeten.bp.temporal.a aVar6 = org.threeten.bp.temporal.a.f340340k3;
        if (map.containsKey(aVar6)) {
            org.threeten.bp.temporal.a aVar7 = org.threeten.bp.temporal.a.f340334h3;
            if (map.containsKey(aVar7)) {
                org.threeten.bp.temporal.a aVar8 = org.threeten.bp.temporal.a.f340349p0;
                if (map.containsKey(aVar8)) {
                    int iK = aVar6.k(map.remove(aVar6).longValue());
                    int iR = cn.d.r(map.remove(aVar7).longValue());
                    int iR2 = cn.d.r(map.remove(aVar8).longValue());
                    if (kVar == org.threeten.bp.format.k.LENIENT) {
                        return org.threeten.bp.g.C0(iK, 1, 1).L0(cn.d.p(iR, 1)).K0(cn.d.p(iR2, 1));
                    }
                    if (kVar != org.threeten.bp.format.k.SMART) {
                        return org.threeten.bp.g.C0(iK, iR, iR2);
                    }
                    aVar8.l(iR2);
                    if (iR == 4 || iR == 6 || iR == 9 || iR == 11) {
                        iR2 = Math.min(iR2, 30);
                    } else if (iR == 2) {
                        iR2 = Math.min(iR2, org.threeten.bp.j.FEBRUARY.D(org.threeten.bp.p.O(iK)));
                    }
                    return org.threeten.bp.g.C0(iK, iR, iR2);
                }
                org.threeten.bp.temporal.a aVar9 = org.threeten.bp.temporal.a.f340351p2;
                if (map.containsKey(aVar9)) {
                    org.threeten.bp.temporal.a aVar10 = org.threeten.bp.temporal.a.Y;
                    if (map.containsKey(aVar10)) {
                        int iK2 = aVar6.k(map.remove(aVar6).longValue());
                        if (kVar == org.threeten.bp.format.k.LENIENT) {
                            return org.threeten.bp.g.C0(iK2, 1, 1).L0(cn.d.q(map.remove(aVar7).longValue(), 1L)).M0(cn.d.q(map.remove(aVar9).longValue(), 1L)).K0(cn.d.q(map.remove(aVar10).longValue(), 1L));
                        }
                        int iK3 = aVar7.k(map.remove(aVar7).longValue());
                        org.threeten.bp.g gVarK0 = org.threeten.bp.g.C0(iK2, iK3, 1).K0(((aVar9.k(map.remove(aVar9).longValue()) - 1) * 7) + (aVar10.k(map.remove(aVar10).longValue()) - 1));
                        if (kVar != org.threeten.bp.format.k.STRICT || gVarK0.l(aVar7) == iK3) {
                            return gVarK0;
                        }
                        throw new org.threeten.bp.b("Strict mode rejected date parsed to a different month");
                    }
                    org.threeten.bp.temporal.a aVar11 = org.threeten.bp.temporal.a.X;
                    if (map.containsKey(aVar11)) {
                        int iK4 = aVar6.k(map.remove(aVar6).longValue());
                        if (kVar == org.threeten.bp.format.k.LENIENT) {
                            return org.threeten.bp.g.C0(iK4, 1, 1).L0(cn.d.q(map.remove(aVar7).longValue(), 1L)).M0(cn.d.q(map.remove(aVar9).longValue(), 1L)).K0(cn.d.q(map.remove(aVar11).longValue(), 1L));
                        }
                        int iK5 = aVar7.k(map.remove(aVar7).longValue());
                        org.threeten.bp.g gVarR0 = org.threeten.bp.g.C0(iK4, iK5, 1).M0(aVar9.k(map.remove(aVar9).longValue()) - 1).s(org.threeten.bp.temporal.h.k(org.threeten.bp.d.z(aVar11.k(map.remove(aVar11).longValue()))));
                        if (kVar != org.threeten.bp.format.k.STRICT || gVarR0.l(aVar7) == iK5) {
                            return gVarR0;
                        }
                        throw new org.threeten.bp.b("Strict mode rejected date parsed to a different month");
                    }
                }
            }
            org.threeten.bp.temporal.a aVar12 = org.threeten.bp.temporal.a.f340350p1;
            if (map.containsKey(aVar12)) {
                int iK6 = aVar6.k(map.remove(aVar6).longValue());
                if (kVar == org.threeten.bp.format.k.LENIENT) {
                    return org.threeten.bp.g.F0(iK6, 1).K0(cn.d.q(map.remove(aVar12).longValue(), 1L));
                }
                return org.threeten.bp.g.F0(iK6, aVar12.k(map.remove(aVar12).longValue()));
            }
            org.threeten.bp.temporal.a aVar13 = org.threeten.bp.temporal.a.f340332g3;
            if (map.containsKey(aVar13)) {
                org.threeten.bp.temporal.a aVar14 = org.threeten.bp.temporal.a.Z;
                if (map.containsKey(aVar14)) {
                    int iK7 = aVar6.k(map.remove(aVar6).longValue());
                    if (kVar == org.threeten.bp.format.k.LENIENT) {
                        return org.threeten.bp.g.C0(iK7, 1, 1).M0(cn.d.q(map.remove(aVar13).longValue(), 1L)).K0(cn.d.q(map.remove(aVar14).longValue(), 1L));
                    }
                    org.threeten.bp.g gVarK1 = org.threeten.bp.g.C0(iK7, 1, 1).K0(((aVar13.k(map.remove(aVar13).longValue()) - 1) * 7) + (aVar14.k(map.remove(aVar14).longValue()) - 1));
                    if (kVar != org.threeten.bp.format.k.STRICT || gVarK1.l(aVar6) == iK7) {
                        return gVarK1;
                    }
                    throw new org.threeten.bp.b("Strict mode rejected date parsed to a different year");
                }
                org.threeten.bp.temporal.a aVar15 = org.threeten.bp.temporal.a.X;
                if (map.containsKey(aVar15)) {
                    int iK8 = aVar6.k(map.remove(aVar6).longValue());
                    if (kVar == org.threeten.bp.format.k.LENIENT) {
                        return org.threeten.bp.g.C0(iK8, 1, 1).M0(cn.d.q(map.remove(aVar13).longValue(), 1L)).K0(cn.d.q(map.remove(aVar15).longValue(), 1L));
                    }
                    org.threeten.bp.g gVarR1 = org.threeten.bp.g.C0(iK8, 1, 1).M0(aVar13.k(map.remove(aVar13).longValue()) - 1).s(org.threeten.bp.temporal.h.k(org.threeten.bp.d.z(aVar15.k(map.remove(aVar15).longValue()))));
                    if (kVar == org.threeten.bp.format.k.STRICT && gVarR1.l(aVar6) != iK8) {
                        throw new org.threeten.bp.b("Strict mode rejected date parsed to a different month");
                    }
                    return gVarR1;
                }
            }
        }
        return null;
    }

    @Override // org.threeten.bp.chrono.j
    public boolean isLeapYear(long j10) {
        return (3 & j10) == 0 && (j10 % 100 != 0 || j10 % 400 == 0);
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public org.threeten.bp.u U(org.threeten.bp.f fVar, org.threeten.bp.r rVar) {
        return org.threeten.bp.u.H0(fVar, rVar);
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public org.threeten.bp.u V(org.threeten.bp.temporal.f fVar) {
        return org.threeten.bp.u.g0(fVar);
    }
}
