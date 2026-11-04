package org.threeten.bp.temporal;

/* JADX INFO: loaded from: classes14.dex */
public final class h {

    private static final class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f340409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f340410b;

        @Override // org.threeten.bp.temporal.g
        public e b(e eVar) {
            if (this.f340409a >= 0) {
                e eVarO = eVar.o(org.threeten.bp.temporal.a.f340349p0, 1L);
                return eVarO.v(((long) (((this.f340410b - eVarO.l(org.threeten.bp.temporal.a.X)) + 7) % 7)) + ((((long) this.f340409a) - 1) * 7), org.threeten.bp.temporal.b.DAYS);
            }
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340349p0;
            e eVarO2 = eVar.o(aVar, eVar.c(aVar).d());
            long jL = this.f340410b - eVarO2.l(org.threeten.bp.temporal.a.X);
            if (jL == 0) {
                jL = 0;
            } else if (jL > 0) {
                jL -= 7;
            }
            return eVarO2.v(jL - ((((long) (-this.f340409a)) - 1) * 7), org.threeten.bp.temporal.b.DAYS);
        }

        private b(int i10, org.threeten.bp.d dVar) {
            this.f340409a = i10;
            this.f340410b = dVar.getValue();
        }
    }

    private static class c implements g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final c f340411b = new c(0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final c f340412c = new c(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final c f340413d = new c(2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final c f340414e = new c(3);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final c f340415f = new c(4);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final c f340416g = new c(5);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f340417a;

        private c(int i10) {
            this.f340417a = i10;
        }

        @Override // org.threeten.bp.temporal.g
        public e b(e eVar) {
            int i10 = this.f340417a;
            if (i10 == 0) {
                return eVar.o(org.threeten.bp.temporal.a.f340349p0, 1L);
            }
            if (i10 == 1) {
                org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340349p0;
                return eVar.o(aVar, eVar.c(aVar).d());
            }
            if (i10 == 2) {
                return eVar.o(org.threeten.bp.temporal.a.f340349p0, 1L).v(1L, org.threeten.bp.temporal.b.MONTHS);
            }
            if (i10 == 3) {
                return eVar.o(org.threeten.bp.temporal.a.f340350p1, 1L);
            }
            if (i10 == 4) {
                org.threeten.bp.temporal.a aVar2 = org.threeten.bp.temporal.a.f340350p1;
                return eVar.o(aVar2, eVar.c(aVar2).d());
            }
            if (i10 == 5) {
                return eVar.o(org.threeten.bp.temporal.a.f340350p1, 1L).v(1L, org.threeten.bp.temporal.b.YEARS);
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    private static final class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f340418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f340419b;

        @Override // org.threeten.bp.temporal.g
        public e b(e eVar) {
            int iL = eVar.l(org.threeten.bp.temporal.a.X);
            int i10 = this.f340418a;
            if (i10 < 2 && iL == this.f340419b) {
                return eVar;
            }
            if ((i10 & 1) == 0) {
                int i11 = iL - this.f340419b;
                return eVar.v(i11 >= 0 ? 7 - i11 : -i11, org.threeten.bp.temporal.b.DAYS);
            }
            int i12 = this.f340419b - iL;
            return eVar.f(i12 >= 0 ? 7 - i12 : -i12, org.threeten.bp.temporal.b.DAYS);
        }

        private d(int i10, org.threeten.bp.d dVar) {
            cn.d.j(dVar, "dayOfWeek");
            this.f340418a = i10;
            this.f340419b = dVar.getValue();
        }
    }

    private h() {
    }

    public static g a(int i10, org.threeten.bp.d dVar) {
        cn.d.j(dVar, "dayOfWeek");
        return new b(i10, dVar);
    }

    public static g b() {
        return c.f340411b;
    }

    public static g c() {
        return c.f340413d;
    }

    public static g d() {
        return c.f340416g;
    }

    public static g e() {
        return c.f340414e;
    }

    public static g f(org.threeten.bp.d dVar) {
        cn.d.j(dVar, "dayOfWeek");
        return new b(1, dVar);
    }

    public static g g() {
        return c.f340412c;
    }

    public static g h() {
        return c.f340415f;
    }

    public static g i(org.threeten.bp.d dVar) {
        cn.d.j(dVar, "dayOfWeek");
        return new b(-1, dVar);
    }

    public static g j(org.threeten.bp.d dVar) {
        return new d(2, dVar);
    }

    public static g k(org.threeten.bp.d dVar) {
        return new d(0, dVar);
    }

    public static g l(org.threeten.bp.d dVar) {
        return new d(3, dVar);
    }

    public static g m(org.threeten.bp.d dVar) {
        return new d(1, dVar);
    }
}
