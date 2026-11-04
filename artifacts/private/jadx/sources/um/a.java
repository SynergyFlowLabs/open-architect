package um;

import org.locationtech.jts.geom.h;
import org.locationtech.jts.geom.n;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f381281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f381282b = new e();

    /* JADX INFO: renamed from: um.a$a, reason: collision with other inner class name */
    public static class C2517a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f381283a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e f381284b = new e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n f381285c;

        public C2517a(n nVar) {
            this.f381285c = nVar;
        }

        @Override // org.locationtech.jts.geom.h
        public void a(org.locationtech.jts.geom.e eVar, int i10) {
            if (i10 == 0) {
                return;
            }
            org.locationtech.jts.geom.a aVarW4 = eVar.w4(i10 - 1);
            org.locationtech.jts.geom.a aVarW5 = eVar.w4(i10);
            org.locationtech.jts.geom.a aVar = new org.locationtech.jts.geom.a((aVarW4.f338092a + aVarW5.f338092a) / 2.0d, (aVarW4.f338093b + aVarW5.f338093b) / 2.0d);
            this.f381284b.d();
            d.a(this.f381285c, aVar, this.f381284b);
            this.f381283a.h(this.f381284b);
        }

        @Override // org.locationtech.jts.geom.h
        public boolean b() {
            return false;
        }

        public e c() {
            return this.f381283a;
        }

        @Override // org.locationtech.jts.geom.h
        public boolean isDone() {
            return false;
        }
    }

    public static class b implements org.locationtech.jts.geom.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f381286a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e f381287b = new e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n f381288c;

        public b(n nVar) {
            this.f381288c = nVar;
        }

        @Override // org.locationtech.jts.geom.c
        public void a(org.locationtech.jts.geom.a aVar) {
            this.f381287b.d();
            d.a(this.f381288c, aVar, this.f381287b);
            this.f381286a.h(this.f381287b);
        }

        public e b() {
            return this.f381286a;
        }
    }

    public a(n nVar) {
        this.f381281a = nVar;
    }

    private void a(n nVar) {
        C2517a c2517a = new C2517a(this.f381281a);
        nVar.c(c2517a);
        this.f381282b.h(c2517a.c());
    }

    private void b(n nVar) {
        b bVar = new b(this.f381281a);
        nVar.b(bVar);
        this.f381282b.h(bVar.b());
    }

    public double c(n nVar) {
        b(nVar);
        a(nVar);
        return this.f381282b.c();
    }

    public e d() {
        return this.f381282b;
    }
}
