package org.locationtech.jts.index.intervalrtree;

import java.util.Comparator;
import rm.o;

/* JADX INFO: loaded from: classes14.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected double f338405a = Double.POSITIVE_INFINITY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected double f338406b = Double.NEGATIVE_INFINITY;

    public static class a implements Comparator {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            c cVar = (c) obj;
            c cVar2 = (c) obj2;
            double d10 = (cVar.f338405a + cVar.f338406b) / 2.0d;
            double d11 = (cVar2.f338405a + cVar2.f338406b) / 2.0d;
            if (d10 < d11) {
                return -1;
            }
            return d10 > d11 ? 1 : 0;
        }
    }

    public double a() {
        return this.f338406b;
    }

    public double b() {
        return this.f338405a;
    }

    protected boolean c(double d10, double d11) {
        return this.f338405a <= d11 && this.f338406b >= d10;
    }

    public abstract void d(double d10, double d11, qm.b bVar);

    public String toString() {
        return o.A(new org.locationtech.jts.geom.a(this.f338405a, 0.0d), new org.locationtech.jts.geom.a(this.f338406b, 0.0d));
    }
}
