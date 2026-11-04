package org.locationtech.jts.geomgraph;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes14.dex */
public class g implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public org.locationtech.jts.geom.a f338297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f338298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f338299c;

    public g(org.locationtech.jts.geom.a aVar, int i10, double d10) {
        this.f338297a = new org.locationtech.jts.geom.a(aVar);
        this.f338298b = i10;
        this.f338299c = d10;
    }

    public int b(int i10, double d10) {
        int i11 = this.f338298b;
        if (i11 < i10) {
            return -1;
        }
        if (i11 > i10) {
            return 1;
        }
        double d11 = this.f338299c;
        if (d11 < d10) {
            return -1;
        }
        return d11 > d10 ? 1 : 0;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        g gVar = (g) obj;
        return b(gVar.f338298b, gVar.f338299c);
    }

    public org.locationtech.jts.geom.a k() {
        return this.f338297a;
    }

    public double l() {
        return this.f338299c;
    }

    public int n() {
        return this.f338298b;
    }

    public boolean o(int i10) {
        int i11 = this.f338298b;
        if ((i11 != 0 || this.f338299c != 0.0d) && i11 != i10) {
            return false;
        }
        return true;
    }

    public void p(PrintStream printStream) {
        printStream.print(this.f338297a);
        printStream.print(" seg # = " + this.f338298b);
        printStream.println(" dist = " + this.f338299c);
    }

    public String toString() {
        return this.f338297a + " seg # = " + this.f338298b + " dist = " + this.f338299c;
    }
}
