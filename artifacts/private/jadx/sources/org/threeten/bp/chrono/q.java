package org.threeten.bp.chrono;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class q extends j implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f339943g = 459996390165777884L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map<String, String[]> f339944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map<String, String[]> f339945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Map<String, String[]> f339946j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f339947k = "en";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f339948l = "ja";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Locale f339941e = new Locale(f339948l, "JP", "JP");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f339942f = new q();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f339949a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.a.values().length];
            f339949a = iArr;
            try {
                iArr[org.threeten.bp.temporal.a.f340349p0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f339949a[org.threeten.bp.temporal.a.X.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f339949a[org.threeten.bp.temporal.a.f340333h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f339949a[org.threeten.bp.temporal.a.f340331g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f339949a[org.threeten.bp.temporal.a.f340353t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f339949a[org.threeten.bp.temporal.a.f340347o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f339949a[org.threeten.bp.temporal.a.f340345n.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f339949a[org.threeten.bp.temporal.a.f340343m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f339949a[org.threeten.bp.temporal.a.f340341l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f339949a[org.threeten.bp.temporal.a.f340339k.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f339949a[org.threeten.bp.temporal.a.f340337j.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f339949a[org.threeten.bp.temporal.a.f340335i.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f339949a[org.threeten.bp.temporal.a.f340330f.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f339949a[org.threeten.bp.temporal.a.f340329e.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f339949a[org.threeten.bp.temporal.a.f340354v.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f339949a[org.threeten.bp.temporal.a.f340352s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f339949a[org.threeten.bp.temporal.a.H1.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f339949a[org.threeten.bp.temporal.a.f340336i3.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f339949a[org.threeten.bp.temporal.a.f340342l3.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f339949a[org.threeten.bp.temporal.a.f340340k3.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f339949a[org.threeten.bp.temporal.a.f340338j3.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f339949a[org.threeten.bp.temporal.a.f340334h3.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f339949a[org.threeten.bp.temporal.a.f340350p1.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f339944h = map;
        HashMap map2 = new HashMap();
        f339945i = map2;
        HashMap map3 = new HashMap();
        f339946j = map3;
        map.put(f339947k, new String[]{com.facebook.internal.a.f99697t, "K", "M", androidx.exifinterface.media.a.f51379e5, androidx.exifinterface.media.a.S4, "H"});
        map.put(f339948l, new String[]{com.facebook.internal.a.f99697t, "K", "M", androidx.exifinterface.media.a.f51379e5, androidx.exifinterface.media.a.S4, "H"});
        map2.put(f339947k, new String[]{com.facebook.internal.a.f99697t, "K", "M", androidx.exifinterface.media.a.f51379e5, androidx.exifinterface.media.a.S4, "H"});
        map2.put(f339948l, new String[]{com.facebook.internal.a.f99697t, "慶", "明", "大", "昭", "平"});
        map3.put(f339947k, new String[]{com.facebook.internal.a.f99697t, "Keio", "Meiji", "Taisho", "Showa", "Heisei"});
        map3.put(f339948l, new String[]{com.facebook.internal.a.f99697t, "慶応", "明治", "大正", "昭和", "平成"});
    }

    private q() {
    }

    private r i0(Map<org.threeten.bp.temporal.j, Long> map, org.threeten.bp.format.k kVar, s sVar, int i10) {
        if (kVar != org.threeten.bp.format.k.LENIENT) {
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340350p1;
            return p(sVar, i10, L(aVar).a(map.remove(aVar).longValue(), aVar));
        }
        int iR0 = (sVar.I().r0() + i10) - 1;
        return o(iR0, 1).c0(cn.d.q(map.remove(org.threeten.bp.temporal.a.f340350p1).longValue(), 1L), org.threeten.bp.temporal.b.DAYS);
    }

    private r j0(Map<org.threeten.bp.temporal.j, Long> map, org.threeten.bp.format.k kVar, s sVar, int i10) {
        if (kVar == org.threeten.bp.format.k.LENIENT) {
            int iR0 = (sVar.I().r0() + i10) - 1;
            return c(iR0, 1, 1).c0(cn.d.q(map.remove(org.threeten.bp.temporal.a.f340334h3).longValue(), 1L), org.threeten.bp.temporal.b.MONTHS).c0(cn.d.q(map.remove(org.threeten.bp.temporal.a.f340349p0).longValue(), 1L), org.threeten.bp.temporal.b.DAYS);
        }
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340334h3;
        int iA = L(aVar).a(map.remove(aVar).longValue(), aVar);
        org.threeten.bp.temporal.a aVar2 = org.threeten.bp.temporal.a.f340349p0;
        int iA2 = L(aVar2).a(map.remove(aVar2).longValue(), aVar2);
        if (kVar != org.threeten.bp.format.k.SMART) {
            return d(sVar, i10, iA, iA2);
        }
        if (i10 < 1) {
            throw new org.threeten.bp.b("Invalid YearOfEra: " + i10);
        }
        int iR1 = (sVar.I().r0() + i10) - 1;
        if (iA2 > 28) {
            iA2 = Math.min(iA2, c(iR1, iA, 1).lengthOfMonth());
        }
        r rVarC = c(iR1, iA, iA2);
        if (rVarC.H() != sVar) {
            if (Math.abs(rVarC.H().getValue() - sVar.getValue()) > 1) {
                throw new org.threeten.bp.b("Invalid Era/YearOfEra: " + sVar + " " + i10);
            }
            if (rVarC.l(org.threeten.bp.temporal.a.f340338j3) != 1 && i10 != 1) {
                throw new org.threeten.bp.b("Invalid Era/YearOfEra: " + sVar + " " + i10);
            }
        }
        return rVarC;
    }

    private Object readResolve() {
        return f339942f;
    }

    @Override // org.threeten.bp.chrono.j
    public int I(k kVar, int i10) {
        if (!(kVar instanceof s)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        s sVar = (s) kVar;
        int iR0 = (sVar.I().r0() + i10) - 1;
        org.threeten.bp.temporal.o.k(1L, (sVar.w().r0() - sVar.I().r0()) + 1).b(i10, org.threeten.bp.temporal.a.f340338j3);
        return iR0;
    }

    @Override // org.threeten.bp.chrono.j
    public org.threeten.bp.temporal.o L(org.threeten.bp.temporal.a aVar) {
        int[] iArr = a.f339949a;
        switch (iArr[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return aVar.range();
            default:
                Calendar calendar = Calendar.getInstance(f339941e);
                int i10 = 0;
                switch (iArr[aVar.ordinal()]) {
                    case 19:
                        s[] sVarArrM = s.M();
                        return org.threeten.bp.temporal.o.k(sVarArrM[0].getValue(), sVarArrM[sVarArrM.length - 1].getValue());
                    case 20:
                        s[] sVarArrM2 = s.M();
                        return org.threeten.bp.temporal.o.k(r.f339951g.r0(), sVarArrM2[sVarArrM2.length - 1].w().r0());
                    case 21:
                        s[] sVarArrM3 = s.M();
                        int iR0 = (sVarArrM3[sVarArrM3.length - 1].w().r0() - sVarArrM3[sVarArrM3.length - 1].I().r0()) + 1;
                        int iMin = Integer.MAX_VALUE;
                        while (i10 < sVarArrM3.length) {
                            iMin = Math.min(iMin, (sVarArrM3[i10].w().r0() - sVarArrM3[i10].I().r0()) + 1);
                            i10++;
                        }
                        return org.threeten.bp.temporal.o.m(1L, 6L, iMin, iR0);
                    case 22:
                        return org.threeten.bp.temporal.o.m(calendar.getMinimum(2) + 1, calendar.getGreatestMinimum(2) + 1, calendar.getLeastMaximum(2) + 1, calendar.getMaximum(2) + 1);
                    case 23:
                        s[] sVarArrM4 = s.M();
                        int iMin2 = 366;
                        while (i10 < sVarArrM4.length) {
                            iMin2 = Math.min(iMin2, (sVarArrM4[i10].I().lengthOfYear() - sVarArrM4[i10].I().n0()) + 1);
                            i10++;
                        }
                        return org.threeten.bp.temporal.o.l(1L, iMin2, 366L);
                    default:
                        throw new UnsupportedOperationException("Unimplementable field: " + aVar);
                }
        }
    }

    @Override // org.threeten.bp.chrono.j
    public h<r> U(org.threeten.bp.f fVar, org.threeten.bp.r rVar) {
        return super.U(fVar, rVar);
    }

    @Override // org.threeten.bp.chrono.j
    public h<r> V(org.threeten.bp.temporal.f fVar) {
        return super.V(fVar);
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public r c(int i10, int i11, int i12) {
        return new r(org.threeten.bp.g.C0(i10, i11, i12));
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public r d(k kVar, int i10, int i11, int i12) {
        if (kVar instanceof s) {
            return r.s0((s) kVar, i10, i11, i12);
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public r e(org.threeten.bp.temporal.f fVar) {
        return fVar instanceof r ? (r) fVar : new r(org.threeten.bp.g.i0(fVar));
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public r f(long j10) {
        return new r(org.threeten.bp.g.E0(j10));
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public r k() {
        return (r) super.k();
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public r l(org.threeten.bp.a aVar) {
        cn.d.j(aVar, "clock");
        return (r) super.l(aVar);
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public r n(org.threeten.bp.r rVar) {
        return (r) super.n(rVar);
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public r o(int i10, int i11) {
        org.threeten.bp.g gVarF0 = org.threeten.bp.g.F0(i10, i11);
        return c(i10, gVarF0.p0(), gVarF0.l0());
    }

    @Override // org.threeten.bp.chrono.j
    public List<k> eras() {
        return Arrays.asList(s.M());
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public r p(k kVar, int i10, int i11) {
        if (kVar instanceof s) {
            return r.t0((s) kVar, i10, i11);
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public s t(int i10) {
        return s.z(i10);
    }

    @Override // org.threeten.bp.chrono.j
    public String getCalendarType() {
        return "japanese";
    }

    @Override // org.threeten.bp.chrono.j
    public String getId() {
        return "Japanese";
    }

    @Override // org.threeten.bp.chrono.j
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public r O(Map<org.threeten.bp.temporal.j, Long> map, org.threeten.bp.format.k kVar) {
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
        org.threeten.bp.temporal.a aVar3 = org.threeten.bp.temporal.a.f340342l3;
        Long l10 = map.get(aVar3);
        s sVarT = l10 != null ? t(L(aVar3).a(l10.longValue(), aVar3)) : null;
        org.threeten.bp.temporal.a aVar4 = org.threeten.bp.temporal.a.f340338j3;
        Long l11 = map.get(aVar4);
        if (l11 != null) {
            int iA = L(aVar4).a(l11.longValue(), aVar4);
            if (sVarT == null && kVar != org.threeten.bp.format.k.STRICT && !map.containsKey(org.threeten.bp.temporal.a.f340340k3)) {
                List<k> listEras = eras();
                sVarT = (s) listEras.get(listEras.size() - 1);
            }
            if (sVarT != null && map.containsKey(org.threeten.bp.temporal.a.f340334h3) && map.containsKey(org.threeten.bp.temporal.a.f340349p0)) {
                map.remove(aVar3);
                map.remove(aVar4);
                return j0(map, kVar, sVarT, iA);
            }
            if (sVarT != null && map.containsKey(org.threeten.bp.temporal.a.f340350p1)) {
                map.remove(aVar3);
                map.remove(aVar4);
                return i0(map, kVar, sVarT, iA);
            }
        }
        org.threeten.bp.temporal.a aVar5 = org.threeten.bp.temporal.a.f340340k3;
        if (map.containsKey(aVar5)) {
            org.threeten.bp.temporal.a aVar6 = org.threeten.bp.temporal.a.f340334h3;
            if (map.containsKey(aVar6)) {
                org.threeten.bp.temporal.a aVar7 = org.threeten.bp.temporal.a.f340349p0;
                if (map.containsKey(aVar7)) {
                    int iK = aVar5.k(map.remove(aVar5).longValue());
                    if (kVar == org.threeten.bp.format.k.LENIENT) {
                        return c(iK, 1, 1).e0(cn.d.q(map.remove(aVar6).longValue(), 1L)).d0(cn.d.q(map.remove(aVar7).longValue(), 1L));
                    }
                    int iA2 = L(aVar6).a(map.remove(aVar6).longValue(), aVar6);
                    int iA3 = L(aVar7).a(map.remove(aVar7).longValue(), aVar7);
                    if (kVar == org.threeten.bp.format.k.SMART && iA3 > 28) {
                        iA3 = Math.min(iA3, c(iK, iA2, 1).lengthOfMonth());
                    }
                    return c(iK, iA2, iA3);
                }
                org.threeten.bp.temporal.a aVar8 = org.threeten.bp.temporal.a.f340351p2;
                if (map.containsKey(aVar8)) {
                    org.threeten.bp.temporal.a aVar9 = org.threeten.bp.temporal.a.Y;
                    if (map.containsKey(aVar9)) {
                        int iK2 = aVar5.k(map.remove(aVar5).longValue());
                        if (kVar == org.threeten.bp.format.k.LENIENT) {
                            return c(iK2, 1, 1).c0(cn.d.q(map.remove(aVar6).longValue(), 1L), org.threeten.bp.temporal.b.MONTHS).c0(cn.d.q(map.remove(aVar8).longValue(), 1L), org.threeten.bp.temporal.b.WEEKS).c0(cn.d.q(map.remove(aVar9).longValue(), 1L), org.threeten.bp.temporal.b.DAYS);
                        }
                        int iK3 = aVar6.k(map.remove(aVar6).longValue());
                        r rVarU0 = c(iK2, iK3, 1).c0(((aVar8.k(map.remove(aVar8).longValue()) - 1) * 7) + (aVar9.k(map.remove(aVar9).longValue()) - 1), org.threeten.bp.temporal.b.DAYS);
                        if (kVar != org.threeten.bp.format.k.STRICT || rVarU0.l(aVar6) == iK3) {
                            return rVarU0;
                        }
                        throw new org.threeten.bp.b("Strict mode rejected date parsed to a different month");
                    }
                    org.threeten.bp.temporal.a aVar10 = org.threeten.bp.temporal.a.X;
                    if (map.containsKey(aVar10)) {
                        int iK4 = aVar5.k(map.remove(aVar5).longValue());
                        if (kVar == org.threeten.bp.format.k.LENIENT) {
                            return c(iK4, 1, 1).c0(cn.d.q(map.remove(aVar6).longValue(), 1L), org.threeten.bp.temporal.b.MONTHS).c0(cn.d.q(map.remove(aVar8).longValue(), 1L), org.threeten.bp.temporal.b.WEEKS).c0(cn.d.q(map.remove(aVar10).longValue(), 1L), org.threeten.bp.temporal.b.DAYS);
                        }
                        int iK5 = aVar6.k(map.remove(aVar6).longValue());
                        r rVarB0 = c(iK4, iK5, 1).c0(aVar8.k(map.remove(aVar8).longValue()) - 1, org.threeten.bp.temporal.b.WEEKS).s(org.threeten.bp.temporal.h.k(org.threeten.bp.d.z(aVar10.k(map.remove(aVar10).longValue()))));
                        if (kVar != org.threeten.bp.format.k.STRICT || rVarB0.l(aVar6) == iK5) {
                            return rVarB0;
                        }
                        throw new org.threeten.bp.b("Strict mode rejected date parsed to a different month");
                    }
                }
            }
            org.threeten.bp.temporal.a aVar11 = org.threeten.bp.temporal.a.f340350p1;
            if (map.containsKey(aVar11)) {
                int iK6 = aVar5.k(map.remove(aVar5).longValue());
                if (kVar == org.threeten.bp.format.k.LENIENT) {
                    return o(iK6, 1).d0(cn.d.q(map.remove(aVar11).longValue(), 1L));
                }
                return o(iK6, aVar11.k(map.remove(aVar11).longValue()));
            }
            org.threeten.bp.temporal.a aVar12 = org.threeten.bp.temporal.a.f340332g3;
            if (map.containsKey(aVar12)) {
                org.threeten.bp.temporal.a aVar13 = org.threeten.bp.temporal.a.Z;
                if (map.containsKey(aVar13)) {
                    int iK7 = aVar5.k(map.remove(aVar5).longValue());
                    if (kVar == org.threeten.bp.format.k.LENIENT) {
                        return c(iK7, 1, 1).c0(cn.d.q(map.remove(aVar12).longValue(), 1L), org.threeten.bp.temporal.b.WEEKS).c0(cn.d.q(map.remove(aVar13).longValue(), 1L), org.threeten.bp.temporal.b.DAYS);
                    }
                    r rVarW0 = c(iK7, 1, 1).d0(((aVar12.k(map.remove(aVar12).longValue()) - 1) * 7) + (aVar13.k(map.remove(aVar13).longValue()) - 1));
                    if (kVar != org.threeten.bp.format.k.STRICT || rVarW0.l(aVar5) == iK7) {
                        return rVarW0;
                    }
                    throw new org.threeten.bp.b("Strict mode rejected date parsed to a different year");
                }
                org.threeten.bp.temporal.a aVar14 = org.threeten.bp.temporal.a.X;
                if (map.containsKey(aVar14)) {
                    int iK8 = aVar5.k(map.remove(aVar5).longValue());
                    if (kVar == org.threeten.bp.format.k.LENIENT) {
                        return c(iK8, 1, 1).c0(cn.d.q(map.remove(aVar12).longValue(), 1L), org.threeten.bp.temporal.b.WEEKS).c0(cn.d.q(map.remove(aVar14).longValue(), 1L), org.threeten.bp.temporal.b.DAYS);
                    }
                    r rVarB1 = c(iK8, 1, 1).c0(aVar12.k(map.remove(aVar12).longValue()) - 1, org.threeten.bp.temporal.b.WEEKS).s(org.threeten.bp.temporal.h.k(org.threeten.bp.d.z(aVar14.k(map.remove(aVar14).longValue()))));
                    if (kVar != org.threeten.bp.format.k.STRICT || rVarB1.l(aVar5) == iK8) {
                        return rVarB1;
                    }
                    throw new org.threeten.bp.b("Strict mode rejected date parsed to a different month");
                }
            }
        }
        return null;
    }

    @Override // org.threeten.bp.chrono.j
    public boolean isLeapYear(long j10) {
        return o.f339936e.isLeapYear(j10);
    }

    @Override // org.threeten.bp.chrono.j
    public d<r> z(org.threeten.bp.temporal.f fVar) {
        return super.z(fVar);
    }
}
