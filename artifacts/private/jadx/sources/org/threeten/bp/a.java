package org.threeten.bp;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a {

    /* JADX INFO: renamed from: org.threeten.bp.a$a, reason: collision with other inner class name */
    static final class C2447a extends a implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f339842c = 7430389292664866958L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f339843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final r f339844b;

        C2447a(f fVar, r rVar) {
            this.f339843a = fVar;
            this.f339844b = rVar;
        }

        @Override // org.threeten.bp.a
        public r b() {
            return this.f339844b;
        }

        @Override // org.threeten.bp.a
        public f c() {
            return this.f339843a;
        }

        @Override // org.threeten.bp.a
        public long d() {
            return this.f339843a.l0();
        }

        @Override // org.threeten.bp.a
        public boolean equals(Object obj) {
            if (obj instanceof C2447a) {
                C2447a c2447a = (C2447a) obj;
                if (this.f339843a.equals(c2447a.f339843a) && this.f339844b.equals(c2447a.f339844b)) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.threeten.bp.a
        public int hashCode() {
            return this.f339844b.hashCode() ^ this.f339843a.hashCode();
        }

        @Override // org.threeten.bp.a
        public a l(r rVar) {
            return rVar.equals(this.f339844b) ? this : new C2447a(this.f339843a, rVar);
        }

        public String toString() {
            return "FixedClock[" + this.f339843a + "," + this.f339844b + "]";
        }
    }

    static final class b extends a implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f339845c = 2007484719125426256L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f339846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f339847b;

        b(a aVar, e eVar) {
            this.f339846a = aVar;
            this.f339847b = eVar;
        }

        @Override // org.threeten.bp.a
        public r b() {
            return this.f339846a.b();
        }

        @Override // org.threeten.bp.a
        public f c() {
            return this.f339846a.c().n(this.f339847b);
        }

        @Override // org.threeten.bp.a
        public long d() {
            return cn.d.l(this.f339846a.d(), this.f339847b.s0());
        }

        @Override // org.threeten.bp.a
        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f339846a.equals(bVar.f339846a) && this.f339847b.equals(bVar.f339847b)) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.threeten.bp.a
        public int hashCode() {
            return this.f339847b.hashCode() ^ this.f339846a.hashCode();
        }

        @Override // org.threeten.bp.a
        public a l(r rVar) {
            return rVar.equals(this.f339846a.b()) ? this : new b(this.f339846a.l(rVar), this.f339847b);
        }

        public String toString() {
            return "OffsetClock[" + this.f339846a + "," + this.f339847b + "]";
        }
    }

    static final class c extends a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f339848b = 6740630888130243051L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f339849a;

        c(r rVar) {
            this.f339849a = rVar;
        }

        @Override // org.threeten.bp.a
        public r b() {
            return this.f339849a;
        }

        @Override // org.threeten.bp.a
        public f c() {
            return f.Y(d());
        }

        @Override // org.threeten.bp.a
        public long d() {
            return System.currentTimeMillis();
        }

        @Override // org.threeten.bp.a
        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return this.f339849a.equals(((c) obj).f339849a);
            }
            return false;
        }

        @Override // org.threeten.bp.a
        public int hashCode() {
            return this.f339849a.hashCode() + 1;
        }

        @Override // org.threeten.bp.a
        public a l(r rVar) {
            return rVar.equals(this.f339849a) ? this : new c(rVar);
        }

        public String toString() {
            return "SystemClock[" + this.f339849a + "]";
        }
    }

    static final class d extends a implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f339850c = 6504659149906368850L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f339851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f339852b;

        d(a aVar, long j10) {
            this.f339851a = aVar;
            this.f339852b = j10;
        }

        @Override // org.threeten.bp.a
        public r b() {
            return this.f339851a.b();
        }

        @Override // org.threeten.bp.a
        public f c() {
            if (this.f339852b % 1000000 == 0) {
                long jD = this.f339851a.d();
                return f.Y(jD - cn.d.h(jD, this.f339852b / 1000000));
            }
            f fVarC = this.f339851a.c();
            return fVarC.T(cn.d.h(fVarC.I(), this.f339852b));
        }

        @Override // org.threeten.bp.a
        public long d() {
            long jD = this.f339851a.d();
            return jD - cn.d.h(jD, this.f339852b / 1000000);
        }

        @Override // org.threeten.bp.a
        public boolean equals(Object obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f339851a.equals(dVar.f339851a) && this.f339852b == dVar.f339852b) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.threeten.bp.a
        public int hashCode() {
            int iHashCode = this.f339851a.hashCode();
            long j10 = this.f339852b;
            return ((int) (j10 ^ (j10 >>> 32))) ^ iHashCode;
        }

        @Override // org.threeten.bp.a
        public a l(r rVar) {
            return rVar.equals(this.f339851a.b()) ? this : new d(this.f339851a.l(rVar), this.f339852b);
        }

        public String toString() {
            return "TickClock[" + this.f339851a + "," + e.X(this.f339852b) + "]";
        }
    }

    protected a() {
    }

    public static a a(f fVar, r rVar) {
        cn.d.j(fVar, "fixedInstant");
        cn.d.j(rVar, "zone");
        return new C2447a(fVar, rVar);
    }

    public static a e(a aVar, e eVar) {
        cn.d.j(aVar, "baseClock");
        cn.d.j(eVar, "offsetDuration");
        return eVar.equals(e.f340012c) ? aVar : new b(aVar, eVar);
    }

    public static a f(r rVar) {
        cn.d.j(rVar, "zone");
        return new c(rVar);
    }

    public static a g() {
        return new c(r.L());
    }

    public static a h() {
        return new c(s.f340320n);
    }

    public static a i(a aVar, e eVar) {
        cn.d.j(aVar, "baseClock");
        cn.d.j(eVar, "tickDuration");
        if (eVar.w()) {
            throw new IllegalArgumentException("Tick duration must not be negative");
        }
        long jW0 = eVar.w0();
        if (jW0 % 1000000 == 0 || 1000000000 % jW0 == 0) {
            return jW0 <= 1 ? aVar : new d(aVar, jW0);
        }
        throw new IllegalArgumentException("Invalid tick duration");
    }

    public static a j(r rVar) {
        return new d(f(rVar), 60000000000L);
    }

    public static a k(r rVar) {
        return new d(f(rVar), 1000000000L);
    }

    public abstract r b();

    public abstract f c();

    public long d() {
        return c().l0();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public abstract a l(r rVar);
}
