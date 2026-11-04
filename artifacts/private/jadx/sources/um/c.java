package um;

import java.io.PrintStream;
import org.locationtech.jts.geom.b0;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.m;
import org.locationtech.jts.geom.n;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f381302h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final double f381303i = 0.012d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f381304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f381305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n f381306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f381307d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f381308e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private org.locationtech.jts.geom.a f381309f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private n f381310g = null;

    public c(n nVar, double d10, n nVar2) {
        this.f381304a = nVar;
        this.f381305b = d10;
        this.f381306c = nVar2;
    }

    private void a() {
        double dX = this.f381304a.X();
        double dX2 = this.f381306c.X();
        double d10 = this.f381305b;
        if (d10 > 0.0d && dX > dX2) {
            this.f381307d = false;
            this.f381308e = "Area of positive buffer is smaller than input";
            this.f381310g = this.f381306c;
        }
        if (d10 < 0.0d && dX < dX2) {
            this.f381307d = false;
            this.f381308e = "Area of negative buffer is larger than input";
            this.f381310g = this.f381306c;
        }
        l("Area");
    }

    private void b() {
        b bVar = new b(this.f381304a, this.f381305b, this.f381306c);
        if (!bVar.i()) {
            this.f381307d = false;
            this.f381308e = bVar.g();
            this.f381309f = bVar.f();
            this.f381310g = bVar.e();
        }
        l("Distance");
    }

    private void c() {
        double d10 = this.f381305b;
        if (d10 < 0.0d) {
            return;
        }
        double d11 = d10 * f381303i;
        if (d11 == 0.0d) {
            d11 = 0.001d;
        }
        m mVar = new m(this.f381304a.f0());
        mVar.t(this.f381305b);
        m mVar2 = new m(this.f381306c.f0());
        mVar2.t(d11);
        if (!mVar2.o(mVar)) {
            this.f381307d = false;
            this.f381308e = "Buffer envelope is incorrect";
            this.f381310g = this.f381304a.g0().H(mVar2);
        }
        l("Envelope");
    }

    private void d() {
        if (this.f381304a.Rg() < 2 && this.f381305b <= 0.0d) {
            if (!this.f381306c.v0()) {
                this.f381307d = false;
                this.f381308e = "Result is non-empty";
                this.f381310g = this.f381306c;
            }
            l("ExpectedEmpty");
        }
    }

    private void e() {
        n nVar = this.f381306c;
        if (!(nVar instanceof e0) && !(nVar instanceof b0)) {
            this.f381307d = false;
        }
        this.f381308e = "Result is not polygonal";
        this.f381310g = nVar;
        l("Polygonal");
    }

    public static boolean j(n nVar, double d10, n nVar2) {
        return new c(nVar, d10, nVar2).i();
    }

    public static String k(n nVar, double d10, n nVar2) {
        c cVar = new c(nVar, d10, nVar2);
        if (cVar.i()) {
            return null;
        }
        return cVar.h();
    }

    private void l(String str) {
        if (f381302h) {
            PrintStream printStream = System.out;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Check ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(this.f381307d ? "passed" : "FAILED");
            printStream.println(sb2.toString());
        }
    }

    public n f() {
        return this.f381310g;
    }

    public org.locationtech.jts.geom.a g() {
        return this.f381309f;
    }

    public String h() {
        return this.f381308e;
    }

    public boolean i() {
        e();
        boolean z10 = this.f381307d;
        if (!z10) {
            return z10;
        }
        d();
        boolean z11 = this.f381307d;
        if (!z11) {
            return z11;
        }
        c();
        boolean z12 = this.f381307d;
        if (!z12) {
            return z12;
        }
        a();
        boolean z13 = this.f381307d;
        if (!z13) {
            return z13;
        }
        b();
        return this.f381307d;
    }
}
