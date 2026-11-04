package org.locationtech.jts.index.sweepline;

/* JADX INFO: loaded from: classes14.dex */
public class a implements Comparable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f338470f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f338471g = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f338472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f338473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f338474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f338475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    c f338476e;

    public a(double d10, a aVar, c cVar) {
        this.f338472a = d10;
        this.f338474c = aVar;
        this.f338473b = 1;
        if (aVar != null) {
            this.f338473b = 2;
        }
        this.f338476e = cVar;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        a aVar = (a) obj;
        double d10 = this.f338472a;
        double d11 = aVar.f338472a;
        if (d10 < d11) {
            return -1;
        }
        if (d10 > d11) {
            return 1;
        }
        int i10 = this.f338473b;
        int i11 = aVar.f338473b;
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public int k() {
        return this.f338475d;
    }

    public a l() {
        return this.f338474c;
    }

    c n() {
        return this.f338476e;
    }

    public boolean o() {
        return this.f338474c != null;
    }

    public boolean p() {
        return this.f338474c == null;
    }

    public void q(int i10) {
        this.f338475d = i10;
    }
}
