package org.locationtech.jts.noding;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes14.dex */
public class u implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f338657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final org.locationtech.jts.geom.a f338658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f338659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f338660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f338661e;

    public u(m mVar, org.locationtech.jts.geom.a aVar, int i10, int i11) {
        this.f338657a = mVar;
        this.f338658b = new org.locationtech.jts.geom.a(aVar);
        this.f338659c = i10;
        this.f338660d = i11;
        this.f338661e = !aVar.p(mVar.w4(i10));
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        u uVar = (u) obj;
        int i10 = this.f338659c;
        int i11 = uVar.f338659c;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        if (this.f338658b.p(uVar.f338658b)) {
            return 0;
        }
        return w.a(this.f338660d, this.f338658b, uVar.f338658b);
    }

    public org.locationtech.jts.geom.a k() {
        return this.f338658b;
    }

    public boolean l(int i10) {
        int i11 = this.f338659c;
        return (i11 == 0 && !this.f338661e) || i11 == i10;
    }

    public boolean n() {
        return this.f338661e;
    }

    public void o(PrintStream printStream) {
        printStream.print(this.f338658b);
        printStream.print(" seg # = " + this.f338659c);
    }
}
