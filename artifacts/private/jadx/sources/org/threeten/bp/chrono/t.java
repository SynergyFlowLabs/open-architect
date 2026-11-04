package org.threeten.bp.chrono;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class t extends j implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f339968e = new t();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f339969f = 1039765215346859963L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f339970g = 1911;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f339971a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.a.values().length];
            f339971a = iArr;
            try {
                iArr[org.threeten.bp.temporal.a.f340336i3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f339971a[org.threeten.bp.temporal.a.f340338j3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f339971a[org.threeten.bp.temporal.a.f340340k3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private t() {
    }

    private Object readResolve() {
        return f339968e;
    }

    @Override // org.threeten.bp.chrono.j
    public int I(k kVar, int i10) {
        if (kVar instanceof v) {
            return kVar == v.ROC ? i10 : 1 - i10;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // org.threeten.bp.chrono.j
    public org.threeten.bp.temporal.o L(org.threeten.bp.temporal.a aVar) {
        int i10 = a.f339971a[aVar.ordinal()];
        if (i10 == 1) {
            org.threeten.bp.temporal.o oVarRange = org.threeten.bp.temporal.a.f340336i3.range();
            return org.threeten.bp.temporal.o.k(oVarRange.e() - 22932, oVarRange.d() - 22932);
        }
        if (i10 == 2) {
            org.threeten.bp.temporal.o oVarRange2 = org.threeten.bp.temporal.a.f340340k3.range();
            return org.threeten.bp.temporal.o.l(1L, oVarRange2.d() - 1911, (-oVarRange2.e()) + 1912);
        }
        if (i10 != 3) {
            return aVar.range();
        }
        org.threeten.bp.temporal.o oVarRange3 = org.threeten.bp.temporal.a.f340340k3.range();
        return org.threeten.bp.temporal.o.k(oVarRange3.e() - 1911, oVarRange3.d() - 1911);
    }

    @Override // org.threeten.bp.chrono.j
    public h<u> U(org.threeten.bp.f fVar, org.threeten.bp.r rVar) {
        return super.U(fVar, rVar);
    }

    @Override // org.threeten.bp.chrono.j
    public h<u> V(org.threeten.bp.temporal.f fVar) {
        return super.V(fVar);
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public u c(int i10, int i11, int i12) {
        return new u(org.threeten.bp.g.C0(i10 + f339970g, i11, i12));
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public u d(k kVar, int i10, int i11, int i12) {
        return (u) super.d(kVar, i10, i11, i12);
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public u e(org.threeten.bp.temporal.f fVar) {
        return fVar instanceof u ? (u) fVar : new u(org.threeten.bp.g.i0(fVar));
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public u f(long j10) {
        return new u(org.threeten.bp.g.E0(j10));
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public u k() {
        return (u) super.k();
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public u l(org.threeten.bp.a aVar) {
        cn.d.j(aVar, "clock");
        return (u) super.l(aVar);
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public u n(org.threeten.bp.r rVar) {
        return (u) super.n(rVar);
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public u o(int i10, int i11) {
        return new u(org.threeten.bp.g.F0(i10 + f339970g, i11));
    }

    @Override // org.threeten.bp.chrono.j
    public List<k> eras() {
        return Arrays.asList(v.values());
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public u p(k kVar, int i10, int i11) {
        return (u) super.p(kVar, i10, i11);
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public v t(int i10) {
        return v.w(i10);
    }

    @Override // org.threeten.bp.chrono.j
    public String getCalendarType() {
        return "roc";
    }

    @Override // org.threeten.bp.chrono.j
    public String getId() {
        return "Minguo";
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public u O(Map<org.threeten.bp.temporal.j, Long> map, org.threeten.bp.format.k kVar) {
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.H1;
        if (map.containsKey(aVar)) {
            return f(map.remove(aVar).longValue());
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
                    if (kVar == org.threeten.bp.format.k.LENIENT) {
                        return c(iK, 1, 1).e0(cn.d.q(map.remove(aVar7).longValue(), 1L)).d0(cn.d.q(map.remove(aVar8).longValue(), 1L));
                    }
                    int iA = L(aVar7).a(map.remove(aVar7).longValue(), aVar7);
                    int iA2 = L(aVar8).a(map.remove(aVar8).longValue(), aVar8);
                    if (kVar == org.threeten.bp.format.k.SMART && iA2 > 28) {
                        iA2 = Math.min(iA2, c(iK, iA, 1).lengthOfMonth());
                    }
                    return c(iK, iA, iA2);
                }
                org.threeten.bp.temporal.a aVar9 = org.threeten.bp.temporal.a.f340351p2;
                if (map.containsKey(aVar9)) {
                    org.threeten.bp.temporal.a aVar10 = org.threeten.bp.temporal.a.Y;
                    if (map.containsKey(aVar10)) {
                        int iK2 = aVar6.k(map.remove(aVar6).longValue());
                        if (kVar == org.threeten.bp.format.k.LENIENT) {
                            return c(iK2, 1, 1).c0(cn.d.q(map.remove(aVar7).longValue(), 1L), org.threeten.bp.temporal.b.MONTHS).c0(cn.d.q(map.remove(aVar9).longValue(), 1L), org.threeten.bp.temporal.b.WEEKS).c0(cn.d.q(map.remove(aVar10).longValue(), 1L), org.threeten.bp.temporal.b.DAYS);
                        }
                        int iK3 = aVar7.k(map.remove(aVar7).longValue());
                        u uVarS0 = c(iK2, iK3, 1).c0(((aVar9.k(map.remove(aVar9).longValue()) - 1) * 7) + (aVar10.k(map.remove(aVar10).longValue()) - 1), org.threeten.bp.temporal.b.DAYS);
                        if (kVar == org.threeten.bp.format.k.STRICT && uVarS0.l(aVar7) != iK3) {
                            throw new org.threeten.bp.b("Strict mode rejected date parsed to a different month");
                        }
                        return uVarS0;
                    }
                    org.threeten.bp.temporal.a aVar11 = org.threeten.bp.temporal.a.X;
                    if (map.containsKey(aVar11)) {
                        int iK4 = aVar6.k(map.remove(aVar6).longValue());
                        if (kVar == org.threeten.bp.format.k.LENIENT) {
                            return c(iK4, 1, 1).c0(cn.d.q(map.remove(aVar7).longValue(), 1L), org.threeten.bp.temporal.b.MONTHS).c0(cn.d.q(map.remove(aVar9).longValue(), 1L), org.threeten.bp.temporal.b.WEEKS).c0(cn.d.q(map.remove(aVar11).longValue(), 1L), org.threeten.bp.temporal.b.DAYS);
                        }
                        int iK5 = aVar7.k(map.remove(aVar7).longValue());
                        u uVarZ0 = c(iK4, iK5, 1).c0(aVar9.k(map.remove(aVar9).longValue()) - 1, org.threeten.bp.temporal.b.WEEKS).s(org.threeten.bp.temporal.h.k(org.threeten.bp.d.z(aVar11.k(map.remove(aVar11).longValue()))));
                        if (kVar != org.threeten.bp.format.k.STRICT || uVarZ0.l(aVar7) == iK5) {
                            return uVarZ0;
                        }
                        throw new org.threeten.bp.b("Strict mode rejected date parsed to a different month");
                    }
                }
            }
            org.threeten.bp.temporal.a aVar12 = org.threeten.bp.temporal.a.f340350p1;
            if (map.containsKey(aVar12)) {
                int iK6 = aVar6.k(map.remove(aVar6).longValue());
                if (kVar == org.threeten.bp.format.k.LENIENT) {
                    return o(iK6, 1).d0(cn.d.q(map.remove(aVar12).longValue(), 1L));
                }
                return o(iK6, aVar12.k(map.remove(aVar12).longValue()));
            }
            org.threeten.bp.temporal.a aVar13 = org.threeten.bp.temporal.a.f340332g3;
            if (map.containsKey(aVar13)) {
                org.threeten.bp.temporal.a aVar14 = org.threeten.bp.temporal.a.Z;
                if (map.containsKey(aVar14)) {
                    int iK7 = aVar6.k(map.remove(aVar6).longValue());
                    if (kVar == org.threeten.bp.format.k.LENIENT) {
                        return c(iK7, 1, 1).c0(cn.d.q(map.remove(aVar13).longValue(), 1L), org.threeten.bp.temporal.b.WEEKS).c0(cn.d.q(map.remove(aVar14).longValue(), 1L), org.threeten.bp.temporal.b.DAYS);
                    }
                    u uVarU0 = c(iK7, 1, 1).d0(((aVar13.k(map.remove(aVar13).longValue()) - 1) * 7) + (aVar14.k(map.remove(aVar14).longValue()) - 1));
                    if (kVar != org.threeten.bp.format.k.STRICT || uVarU0.l(aVar6) == iK7) {
                        return uVarU0;
                    }
                    throw new org.threeten.bp.b("Strict mode rejected date parsed to a different year");
                }
                org.threeten.bp.temporal.a aVar15 = org.threeten.bp.temporal.a.X;
                if (map.containsKey(aVar15)) {
                    int iK8 = aVar6.k(map.remove(aVar6).longValue());
                    if (kVar == org.threeten.bp.format.k.LENIENT) {
                        return c(iK8, 1, 1).c0(cn.d.q(map.remove(aVar13).longValue(), 1L), org.threeten.bp.temporal.b.WEEKS).c0(cn.d.q(map.remove(aVar15).longValue(), 1L), org.threeten.bp.temporal.b.DAYS);
                    }
                    u uVarZ1 = c(iK8, 1, 1).c0(aVar13.k(map.remove(aVar13).longValue()) - 1, org.threeten.bp.temporal.b.WEEKS).s(org.threeten.bp.temporal.h.k(org.threeten.bp.d.z(aVar15.k(map.remove(aVar15).longValue()))));
                    if (kVar != org.threeten.bp.format.k.STRICT || uVarZ1.l(aVar6) == iK8) {
                        return uVarZ1;
                    }
                    throw new org.threeten.bp.b("Strict mode rejected date parsed to a different month");
                }
            }
        }
        return null;
    }

    @Override // org.threeten.bp.chrono.j
    public boolean isLeapYear(long j10) {
        return o.f339936e.isLeapYear(j10 + 1911);
    }

    @Override // org.threeten.bp.chrono.j
    public d<u> z(org.threeten.bp.temporal.f fVar) {
        return super.z(fVar);
    }
}
