package org.locationtech.jts.geomgraph.index;

/* JADX INFO: loaded from: classes14.dex */
public class i implements Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f338327g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f338328h = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f338329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f338330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f338331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i f338332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f338333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f338334f;

    public i(Object obj, double d10, Object obj2) {
        this.f338332d = null;
        this.f338331c = 1;
        this.f338329a = obj;
        this.f338330b = d10;
        this.f338334f = obj2;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        i iVar = (i) obj;
        double d10 = this.f338330b;
        double d11 = iVar.f338330b;
        if (d10 < d11) {
            return -1;
        }
        if (d10 > d11) {
            return 1;
        }
        int i10 = this.f338331c;
        int i11 = iVar.f338331c;
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public int k() {
        return this.f338333e;
    }

    public i l() {
        return this.f338332d;
    }

    public Object n() {
        return this.f338334f;
    }

    public boolean o() {
        return this.f338331c == 2;
    }

    public boolean p() {
        return this.f338331c == 1;
    }

    public boolean q(i iVar) {
        Object obj = this.f338329a;
        return obj != null && obj == iVar.f338329a;
    }

    public void r(int i10) {
        this.f338333e = i10;
    }

    public i(double d10, i iVar) {
        this.f338331c = 2;
        this.f338330b = d10;
        this.f338332d = iVar;
    }
}
