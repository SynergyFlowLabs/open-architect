package org.locationtech.jts.index.bintree;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f338382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f338383b;

    public b() {
        this.f338382a = 0.0d;
        this.f338383b = 0.0d;
    }

    public boolean a(double d10) {
        return d10 >= this.f338382a && d10 <= this.f338383b;
    }

    public boolean b(double d10, double d11) {
        return d10 >= this.f338382a && d11 <= this.f338383b;
    }

    public boolean c(b bVar) {
        return b(bVar.f338382a, bVar.f338383b);
    }

    public void d(b bVar) {
        double d10 = bVar.f338383b;
        if (d10 > this.f338383b) {
            this.f338383b = d10;
        }
        double d11 = bVar.f338382a;
        if (d11 < this.f338382a) {
            this.f338382a = d11;
        }
    }

    public double e() {
        return this.f338383b;
    }

    public double f() {
        return this.f338382a;
    }

    public double g() {
        return this.f338383b - this.f338382a;
    }

    public void h(double d10, double d11) {
        this.f338382a = d10;
        this.f338383b = d11;
        if (d10 > d11) {
            this.f338382a = d11;
            this.f338383b = d10;
        }
    }

    public boolean i(double d10, double d11) {
        return this.f338382a <= d11 && this.f338383b >= d10;
    }

    public boolean j(b bVar) {
        return i(bVar.f338382a, bVar.f338383b);
    }

    public String toString() {
        return "[" + this.f338382a + ", " + this.f338383b + "]";
    }

    public b(double d10, double d11) {
        h(d10, d11);
    }

    public b(b bVar) {
        h(bVar.f338382a, bVar.f338383b);
    }
}
