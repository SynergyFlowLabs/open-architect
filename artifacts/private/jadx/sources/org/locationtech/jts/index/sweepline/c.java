package org.locationtech.jts.index.sweepline;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f338480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f338481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f338482c;

    public c(double d10, double d11) {
        this(d10, d11, null);
    }

    public Object a() {
        return this.f338482c;
    }

    public double b() {
        return this.f338481b;
    }

    public double c() {
        return this.f338480a;
    }

    public c(double d10, double d11, Object obj) {
        this.f338480a = d10 < d11 ? d10 : d11;
        this.f338481b = d11 > d10 ? d11 : d10;
        this.f338482c = obj;
    }
}
