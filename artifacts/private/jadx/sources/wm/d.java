package wm;

import java.util.ArrayList;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geom.util.f;

/* JADX INFO: loaded from: classes14.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f390599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n f390600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n f390601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean[] f390602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean[] f390603e;

    public d(n nVar, n nVar2) {
        this.f390600b = nVar;
        this.f390601c = nVar2;
        this.f390599a = nVar.g0();
        this.f390602d = new boolean[nVar.l0()];
        this.f390603e = new boolean[nVar2.l0()];
    }

    private n a(n nVar, n nVar2) {
        return nVar.g0().e(new n[]{nVar, nVar2}).f(0.0d);
    }

    private void b() {
        for (int i10 = 0; i10 < this.f390600b.l0(); i10++) {
            this.f390602d[i10] = c(this.f390600b.h0(i10));
        }
    }

    private boolean c(n nVar) {
        boolean z10 = false;
        for (int i10 = 0; i10 < this.f390601c.l0(); i10++) {
            boolean zC0 = this.f390601c.h0(i10).f0().c0(nVar.f0());
            if (zC0) {
                this.f390603e[i10] = true;
            }
            if (zC0) {
                z10 = true;
            }
        }
        return z10;
    }

    private n d(n nVar, boolean[] zArr, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < nVar.l0(); i10++) {
            n nVarH0 = nVar.h0(i10);
            if (zArr[i10] == z10) {
                arrayList.add(nVarH0);
            }
        }
        return this.f390599a.b(arrayList);
    }

    public static n f(n nVar, n nVar2) {
        return new d(nVar, nVar2).e();
    }

    public n e() {
        b();
        n nVarD = d(this.f390600b, this.f390602d, true);
        n nVarD2 = d(this.f390601c, this.f390603e, true);
        if (nVarD.v0() || nVarD2.v0()) {
            System.out.println("found empty!");
        }
        return f.d(nVarD.O0(nVarD2), d(this.f390600b, this.f390602d, false), d(this.f390601c, this.f390603e, false));
    }
}
