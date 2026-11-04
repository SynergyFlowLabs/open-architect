package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes4.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s6 f112174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s6 f112175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s6 f112176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s6 f112177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s6 f112178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s6 f112179f;

    private f(int i10, boolean z10) {
        l lVarB = l.b(i10);
        double d10 = lVarB.d();
        double dC = lVarB.c();
        if (z10) {
            this.f112174a = s6.c(d10, dC);
            this.f112175b = s6.c(d10, dC / 3.0d);
            this.f112176c = s6.c(60.0d + d10, dC / 2.0d);
            this.f112177d = s6.c(d10, Math.min(dC / 12.0d, 4.0d));
            this.f112178e = s6.c(d10, Math.min(dC / 6.0d, 8.0d));
        } else {
            this.f112174a = s6.c(d10, Math.max(48.0d, dC));
            this.f112175b = s6.c(d10, 16.0d);
            this.f112176c = s6.c(60.0d + d10, 24.0d);
            this.f112177d = s6.c(d10, 4.0d);
            this.f112178e = s6.c(d10, 8.0d);
        }
        this.f112179f = s6.c(25.0d, 84.0d);
    }

    public static f a(int i10) {
        return new f(i10, true);
    }

    public static f b(int i10) {
        return new f(i10, false);
    }
}
