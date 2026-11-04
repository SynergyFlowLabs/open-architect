package org.locationtech.jts.operation.overlay.validate;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.y;
import org.locationtech.jts.operation.overlay.g;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final double f338853g = 1.0E-6d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n[] f338854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a[] f338855b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f338858e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f338856c = new int[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338857d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f338859f = new ArrayList();

    public c(n nVar, n nVar2, n nVar3) {
        this.f338858e = f338853g;
        double d10 = d(nVar, nVar2);
        this.f338858e = d10;
        n[] nVarArr = {nVar, nVar2, nVar3};
        this.f338854a = nVarArr;
        this.f338855b = new a[]{new a(nVarArr[0], d10), new a(this.f338854a[1], this.f338858e), new a(this.f338854a[2], this.f338858e)};
    }

    private void a(n nVar) {
        this.f338859f.addAll(new b(nVar).c(this.f338858e * 5.0d));
    }

    private boolean b(int i10) {
        for (int i11 = 0; i11 < this.f338859f.size(); i11++) {
            org.locationtech.jts.geom.a aVar = (org.locationtech.jts.geom.a) this.f338859f.get(i11);
            if (!c(i10, aVar)) {
                this.f338857d = aVar;
                return false;
            }
        }
        return true;
    }

    private boolean c(int i10, org.locationtech.jts.geom.a aVar) {
        this.f338856c[0] = this.f338855b[0].b(aVar);
        this.f338856c[1] = this.f338855b[1].b(aVar);
        this.f338856c[2] = this.f338855b[2].b(aVar);
        if (f(this.f338856c, 1)) {
            return true;
        }
        return i(i10, this.f338856c);
    }

    private static double d(n nVar, n nVar2) {
        return Math.min(org.locationtech.jts.operation.overlay.snap.a.d(nVar), org.locationtech.jts.operation.overlay.snap.a.d(nVar2));
    }

    private static boolean f(int[] iArr, int i10) {
        for (int i11 = 0; i11 < 3; i11++) {
            if (iArr[i11] == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(n nVar, n nVar2, int i10, n nVar3) {
        return new c(nVar, nVar2, nVar3).g(i10);
    }

    private boolean i(int i10, int[] iArr) {
        boolean zR = g.r(iArr[0], iArr[1], i10);
        boolean z10 = (iArr[2] == 0) ^ zR;
        boolean z11 = !z10;
        if (z10) {
            j(i10, iArr, zR);
        }
        return z11;
    }

    private void j(int i10, int[] iArr, boolean z10) {
        PrintStream printStream = System.out;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Overlay result invalid - A:");
        sb2.append(y.a(iArr[0]));
        sb2.append(" B:");
        sb2.append(y.a(iArr[1]));
        sb2.append(" expected:");
        sb2.append(z10 ? 'i' : 'e');
        sb2.append(" actual:");
        sb2.append(y.a(iArr[2]));
        printStream.println(sb2.toString());
    }

    public org.locationtech.jts.geom.a e() {
        return this.f338857d;
    }

    public boolean g(int i10) {
        a(this.f338854a[0]);
        a(this.f338854a[1]);
        return b(i10);
    }
}
