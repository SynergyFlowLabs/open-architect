package org.locationtech.jts.noding;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class e implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.algorithm.o f338567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f338568b = new ArrayList();

    public e(org.locationtech.jts.algorithm.o oVar) {
        this.f338567a = oVar;
    }

    @Override // org.locationtech.jts.noding.t
    public void a(y yVar, int i10, y yVar2, int i11) {
        if (yVar == yVar2 && i10 == i11) {
            return;
        }
        this.f338567a.f(yVar.n()[i10], yVar.n()[i10 + 1], yVar2.n()[i11], yVar2.n()[i11 + 1]);
        if (this.f338567a.n() && this.f338567a.q()) {
            for (int i12 = 0; i12 < this.f338567a.l(); i12++) {
                this.f338568b.add(this.f338567a.j(i12));
            }
            ((m) yVar).e(this.f338567a, i10, 0);
            ((m) yVar2).e(this.f338567a, i11, 1);
        }
    }

    public List b() {
        return this.f338568b;
    }

    @Override // org.locationtech.jts.noding.t
    public boolean isDone() {
        return false;
    }
}
