package org.locationtech.jts.index.strtree;

/* JADX INFO: loaded from: classes14.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f338456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f338457b;

    public g(g gVar) {
        this(gVar.f338456a, gVar.f338457b);
    }

    public g a(g gVar) {
        this.f338457b = Math.max(this.f338457b, gVar.f338457b);
        this.f338456a = Math.min(this.f338456a, gVar.f338456a);
        return this;
    }

    public double b() {
        return (this.f338456a + this.f338457b) / 2.0d;
    }

    public boolean c(g gVar) {
        return gVar.f338456a <= this.f338457b && gVar.f338457b >= this.f338456a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f338456a == gVar.f338456a && this.f338457b == gVar.f338457b;
    }

    public g(double d10, double d11) {
        org.locationtech.jts.util.a.c(d10 <= d11);
        this.f338456a = d10;
        this.f338457b = d11;
    }
}
