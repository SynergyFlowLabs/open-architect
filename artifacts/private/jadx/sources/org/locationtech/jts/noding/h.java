package org.locationtech.jts.noding;

import java.util.Collection;
import org.locationtech.jts.geom.g0;
import org.locationtech.jts.geom.i0;

/* JADX INFO: loaded from: classes14.dex */
public class h implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f338582e = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g0 f338583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.locationtech.jts.algorithm.o f338584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Collection f338585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f338586d = 5;

    public h(g0 g0Var) {
        org.locationtech.jts.algorithm.y yVar = new org.locationtech.jts.algorithm.y();
        this.f338584b = yVar;
        this.f338583a = g0Var;
        yVar.w(g0Var);
    }

    private void c(Collection collection, int[] iArr) {
        f fVar = new f(this.f338584b);
        i iVar = new i();
        iVar.c(fVar);
        iVar.a(collection);
        this.f338585c = iVar.b();
        iArr[0] = fVar.f338577i;
    }

    @Override // org.locationtech.jts.noding.n
    public void a(Collection collection) throws i0 {
        int[] iArr = new int[1];
        this.f338585c = collection;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            c(this.f338585c, iArr);
            i11++;
            int i12 = iArr[0];
            if (i10 > 0 && i12 >= i10 && i11 > this.f338586d) {
                throw new i0("Iterated noding failed to converge after " + i11 + " iterations");
            }
            if (i12 <= 0) {
                return;
            } else {
                i10 = i12;
            }
        }
    }

    @Override // org.locationtech.jts.noding.n
    public Collection b() {
        return this.f338585c;
    }

    public void d(int i10) {
        this.f338586d = i10;
    }
}
