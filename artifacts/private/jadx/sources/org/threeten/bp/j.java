package org.threeten.bp;

import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
public enum j implements org.threeten.bp.temporal.f, org.threeten.bp.temporal.g {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<j> f340246m = new org.threeten.bp.temporal.l<j>() { // from class: org.threeten.bp.j.a
        @Override // org.threeten.bp.temporal.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(org.threeten.bp.temporal.f fVar) {
            return j.z(fVar);
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final j[] f340247n = values();

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f340249a;

        static {
            int[] iArr = new int[j.values().length];
            f340249a = iArr;
            try {
                iArr[j.FEBRUARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f340249a[j.APRIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f340249a[j.JUNE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f340249a[j.SEPTEMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f340249a[j.NOVEMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f340249a[j.JANUARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f340249a[j.MARCH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f340249a[j.MAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f340249a[j.JULY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f340249a[j.AUGUST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f340249a[j.OCTOBER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f340249a[j.DECEMBER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static j L(int i10) {
        if (i10 >= 1 && i10 <= 12) {
            return f340247n[i10 - 1];
        }
        throw new org.threeten.bp.b("Invalid value for MonthOfYear: " + i10);
    }

    public static j z(org.threeten.bp.temporal.f fVar) {
        if (fVar instanceof j) {
            return (j) fVar;
        }
        try {
            if (!org.threeten.bp.chrono.o.f339936e.equals(org.threeten.bp.chrono.j.v(fVar))) {
                fVar = g.i0(fVar);
            }
            return L(fVar.l(org.threeten.bp.temporal.a.f340334h3));
        } catch (org.threeten.bp.b e10) {
            throw new org.threeten.bp.b("Unable to obtain Month from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName(), e10);
        }
    }

    public int D(boolean z10) {
        int i10 = b.f340249a[ordinal()];
        if (i10 != 1) {
            return (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31;
        }
        return z10 ? 29 : 28;
    }

    public int E() {
        int i10 = b.f340249a[ordinal()];
        if (i10 != 1) {
            return (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31;
        }
        return 29;
    }

    public int H() {
        int i10 = b.f340249a[ordinal()];
        if (i10 != 1) {
            return (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31;
        }
        return 28;
    }

    public j I(long j10) {
        return M(-(j10 % 12));
    }

    public j M(long j10) {
        return f340247n[(ordinal() + (((int) (j10 % 12)) + 12)) % 12];
    }

    @Override // org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e b(org.threeten.bp.temporal.e eVar) {
        if (org.threeten.bp.chrono.j.v(eVar).equals(org.threeten.bp.chrono.o.f339936e)) {
            return eVar.o(org.threeten.bp.temporal.a.f340334h3, getValue());
        }
        throw new org.threeten.bp.b("Adjustment only supported on ISO date-time");
    }

    @Override // org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.o c(org.threeten.bp.temporal.j jVar) {
        if (jVar == org.threeten.bp.temporal.a.f340334h3) {
            return jVar.range();
        }
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.d(this);
        }
        throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
    }

    @Override // org.threeten.bp.temporal.f
    public <R> R d(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.a()) {
            return (R) org.threeten.bp.chrono.o.f339936e;
        }
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return (R) org.threeten.bp.temporal.b.MONTHS;
        }
        if (lVar != org.threeten.bp.temporal.k.b() && lVar != org.threeten.bp.temporal.k.c() && lVar != org.threeten.bp.temporal.k.f() && lVar != org.threeten.bp.temporal.k.g() && lVar != org.threeten.bp.temporal.k.d()) {
            return lVar.a(this);
        }
        return null;
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // org.threeten.bp.temporal.f
    public int l(org.threeten.bp.temporal.j jVar) {
        return jVar == org.threeten.bp.temporal.a.f340334h3 ? getValue() : c(jVar).a(t(jVar), jVar);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean q(org.threeten.bp.temporal.j jVar) {
        if (jVar instanceof org.threeten.bp.temporal.a) {
            return jVar == org.threeten.bp.temporal.a.f340334h3;
        }
        return jVar != null && jVar.c(this);
    }

    public String r(org.threeten.bp.format.o oVar, Locale locale) {
        return new org.threeten.bp.format.d().r(org.threeten.bp.temporal.a.f340334h3, oVar).Q(locale).d(this);
    }

    @Override // org.threeten.bp.temporal.f
    public long t(org.threeten.bp.temporal.j jVar) {
        if (jVar == org.threeten.bp.temporal.a.f340334h3) {
            return getValue();
        }
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.e(this);
        }
        throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
    }

    public int w(boolean z10) {
        switch (b.f340249a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z10 ? 1 : 0) + 91;
            case 3:
                return (z10 ? 1 : 0) + 152;
            case 4:
                return (z10 ? 1 : 0) + 244;
            case 5:
                return (z10 ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z10 ? 1 : 0) + 60;
            case 8:
                return (z10 ? 1 : 0) + 121;
            case 9:
                return (z10 ? 1 : 0) + 182;
            case 10:
                return (z10 ? 1 : 0) + 213;
            case 11:
                return (z10 ? 1 : 0) + 274;
            default:
                return (z10 ? 1 : 0) + 335;
        }
    }

    public j x() {
        return f340247n[(ordinal() / 3) * 3];
    }
}
