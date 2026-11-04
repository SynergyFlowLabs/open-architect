package org.locationtech.jts.geomgraph;

import java.io.PrintStream;
import org.locationtech.jts.geom.i0;

/* JADX INFO: loaded from: classes14.dex */
public class b extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f338265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f338266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f338267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f338268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b f338269m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b f338270n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private k f338271o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private k f338272s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int[] f338273t;

    public b(d dVar, boolean z10) {
        super(dVar);
        this.f338266j = false;
        this.f338267k = false;
        this.f338273t = new int[]{0, -999, -999};
        this.f338265i = z10;
        if (z10) {
            t(dVar.q(0), dVar.q(1));
        } else {
            int iY = dVar.y();
            t(dVar.q(iY - 1), dVar.q(iY - 2));
        }
        x();
    }

    private void x() {
        n nVar = new n(this.f338286a.c());
        this.f338287b = nVar;
        if (this.f338265i) {
            return;
        }
        nVar.b();
    }

    public static int z(int i10, int i11) {
        if (i10 == 2 && i11 == 0) {
            return 1;
        }
        return (i10 == 0 && i11 == 2) ? -1 : 0;
    }

    public int D(int i10) {
        return this.f338273t[i10];
    }

    public int E() {
        int iT = this.f338286a.t();
        return !this.f338265i ? -iT : iT;
    }

    public k H() {
        return this.f338271o;
    }

    public k I() {
        return this.f338272s;
    }

    public b L() {
        return this.f338269m;
    }

    public b M() {
        return this.f338270n;
    }

    public b N() {
        return this.f338268l;
    }

    public boolean O() {
        return this.f338265i;
    }

    public boolean R() {
        return this.f338266j;
    }

    public boolean S() {
        boolean z10 = true;
        for (int i10 = 0; i10 < 2; i10++) {
            if (!this.f338287b.h(i10) || this.f338287b.e(i10, 1) != 0 || this.f338287b.e(i10, 2) != 0) {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean T() {
        return (this.f338287b.j(0) || this.f338287b.j(1)) && (!this.f338287b.h(0) || this.f338287b.a(0, 2)) && (!this.f338287b.h(1) || this.f338287b.a(1, 2));
    }

    public boolean U() {
        return this.f338267k;
    }

    public void V(PrintStream printStream) {
        v(printStream);
        printStream.print(" ");
        if (this.f338265i) {
            this.f338286a.C(printStream);
        } else {
            this.f338286a.D(printStream);
        }
    }

    public void W(int i10, int i11) {
        int[] iArr = this.f338273t;
        int i12 = iArr[i10];
        if (i12 != -999 && i12 != i11) {
            throw new i0("assigned depths do not match", k());
        }
        iArr[i10] = i11;
    }

    public void X(int i10, int i11) {
        int iT = p().t();
        if (!this.f338265i) {
            iT = -iT;
        }
        int i12 = i10 == 1 ? -1 : 1;
        W(i10, i11);
        W(s.a(i10), (iT * i12) + i11);
    }

    public void Y(k kVar) {
        this.f338271o = kVar;
    }

    public void Z(boolean z10) {
        this.f338266j = z10;
    }

    public void a0(k kVar) {
        this.f338272s = kVar;
    }

    public void c0(b bVar) {
        this.f338269m = bVar;
    }

    public void d0(b bVar) {
        this.f338270n = bVar;
    }

    public void e0(b bVar) {
        this.f338268l = bVar;
    }

    public void f0(boolean z10) {
        this.f338267k = z10;
    }

    public void g0(boolean z10) {
        f0(z10);
        this.f338268l.f0(z10);
    }

    @Override // org.locationtech.jts.geomgraph.e
    public d p() {
        return this.f338286a;
    }

    @Override // org.locationtech.jts.geomgraph.e
    public void v(PrintStream printStream) {
        super.v(printStream);
        printStream.print(" " + this.f338273t[1] + "/" + this.f338273t[2]);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" (");
        sb2.append(E());
        sb2.append(")");
        printStream.print(sb2.toString());
        if (this.f338266j) {
            printStream.print(" inResult");
        }
    }
}
