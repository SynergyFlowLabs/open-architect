package org.locationtech.jts.operation.valid;

/* JADX INFO: loaded from: classes14.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f338928c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f338929d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f338930e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f338931f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f338932g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f338933h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f338934i = 6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f338935j = 7;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f338936k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f338937l = 9;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f338938m = 10;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f338939n = 11;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String[] f338940o = {"Topology Validation Error", "Repeated Point", "Hole lies outside shell", "Holes are nested", "Interior is disconnected", "Self-intersection", "Ring Self-intersection", "Nested shells", "Duplicate Rings", "Too few distinct points in geometry component", "Invalid Coordinate", "Ring is not closed"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f338941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338942b;

    public f(int i10, org.locationtech.jts.geom.a aVar) {
        this.f338941a = i10;
        if (aVar != null) {
            this.f338942b = aVar.k();
        }
    }

    public org.locationtech.jts.geom.a a() {
        return this.f338942b;
    }

    public int b() {
        return this.f338941a;
    }

    public String c() {
        return f338940o[this.f338941a];
    }

    public String toString() {
        String str;
        if (this.f338942b != null) {
            str = " at or near point " + this.f338942b;
        } else {
            str = "";
        }
        return c() + str;
    }

    public f(int i10) {
        this(i10, null);
    }
}
