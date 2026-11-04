package org.locationtech.jts.geomgraph;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.geom.i0;

/* JADX INFO: loaded from: classes14.dex */
public class c extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f338274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private n f338275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f338276f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f338277g = 2;

    private int p(int i10, int i11, int i12) {
        while (i10 < i11) {
            b bVar = (b) this.f338295b.get(i10);
            bVar.q();
            bVar.X(2, i12);
            i12 = bVar.D(1);
            i10++;
        }
        return i12;
    }

    private List v() {
        List list = this.f338274d;
        if (list != null) {
            return list;
        }
        this.f338274d = new ArrayList();
        Iterator itM = m();
        while (itM.hasNext()) {
            b bVar = (b) itM.next();
            if (bVar.R() || bVar.N().R()) {
                this.f338274d.add(bVar);
            }
        }
        return this.f338274d;
    }

    public void A() {
        Iterator itM = m();
        while (itM.hasNext()) {
            b bVar = (b) itM.next();
            bVar.q().l(bVar.N().q());
        }
    }

    public void B(n nVar) {
        Iterator itM = m();
        while (itM.hasNext()) {
            n nVarQ = ((b) itM.next()).q();
            nVarQ.o(0, nVar.d(0));
            nVarQ.o(1, nVar.d(1));
        }
    }

    @Override // org.locationtech.jts.geomgraph.f
    public void c(l[] lVarArr) {
        super.c(lVarArr);
        this.f338275e = new n(-1);
        Iterator itM = m();
        while (itM.hasNext()) {
            n nVarC = ((e) itM.next()).p().c();
            for (int i10 = 0; i10 < 2; i10++) {
                int iD = nVarC.d(i10);
                if (iD == 0 || iD == 1) {
                    this.f338275e.p(i10, 0);
                }
            }
        }
    }

    @Override // org.locationtech.jts.geomgraph.f
    public void j(e eVar) {
        b bVar = (b) eVar;
        k(bVar, bVar);
    }

    @Override // org.locationtech.jts.geomgraph.f
    public void n(PrintStream printStream) {
        System.out.println("DirectedEdgeStar: " + e());
        Iterator itM = m();
        while (itM.hasNext()) {
            b bVar = (b) itM.next();
            printStream.print("out ");
            bVar.v(printStream);
            printStream.println();
            printStream.print("in ");
            bVar.N().v(printStream);
            printStream.println();
        }
    }

    public void q(b bVar) {
        int iD = d(bVar);
        bVar.q();
        if (p(0, iD, p(iD + 1, this.f338295b.size(), bVar.D(1))) == bVar.D(2)) {
            return;
        }
        throw new i0("depth mismatch at " + bVar.k());
    }

    public void r() {
        byte b10;
        Iterator itM = m();
        while (true) {
            int i10 = 2 ^ 0;
            if (!itM.hasNext()) {
                b10 = -1;
                break;
            }
            b bVar = (b) itM.next();
            b bVarN = bVar.N();
            if (!bVar.T()) {
                if (bVar.R()) {
                    b10 = 0;
                    break;
                } else if (bVarN.R()) {
                    b10 = 2;
                    break;
                }
            }
        }
        if (b10 == -1) {
            return;
        }
        Iterator itM2 = m();
        while (itM2.hasNext()) {
            b bVar2 = (b) itM2.next();
            b bVarN2 = bVar2.N();
            if (bVar2.T()) {
                bVar2.p().i(b10 == 0);
            } else {
                if (bVar2.R()) {
                    b10 = 2;
                }
                if (bVarN2.R()) {
                    b10 = 0;
                }
            }
        }
    }

    public n s() {
        return this.f338275e;
    }

    public int t() {
        Iterator itM = m();
        int i10 = 0;
        while (itM.hasNext()) {
            if (((b) itM.next()).R()) {
                i10++;
            }
        }
        return i10;
    }

    public int u(k kVar) {
        Iterator itM = m();
        int i10 = 0;
        while (itM.hasNext()) {
            if (((b) itM.next()).H() == kVar) {
                i10++;
            }
        }
        return i10;
    }

    public b w() {
        List listG = g();
        int size = listG.size();
        if (size < 1) {
            return null;
        }
        b bVar = (b) listG.get(0);
        if (size == 1) {
            return bVar;
        }
        b bVar2 = (b) listG.get(size - 1);
        int iS = bVar.s();
        int iS2 = bVar2.s();
        if (!t.c(iS) || !t.c(iS2)) {
            if (t.c(iS) || t.c(iS2)) {
                if (bVar.o() == 0.0d) {
                    if (bVar2.o() == 0.0d) {
                        org.locationtech.jts.util.a.f("found two horizontal edges incident on node");
                        return null;
                    }
                }
            }
            return bVar2;
        }
        return bVar;
    }

    public void x() {
        g();
        int size = this.f338295b.size() - 1;
        b bVar = null;
        b bVar2 = null;
        while (size >= 0) {
            b bVar3 = (b) this.f338295b.get(size);
            b bVarN = bVar3.N();
            if (bVar == null) {
                bVar = bVarN;
            }
            if (bVar2 != null) {
                bVarN.c0(bVar2);
            }
            size--;
            bVar2 = bVar3;
        }
        bVar.c0(bVar2);
    }

    public void y(k kVar) {
        boolean z10 = true;
        b bVar = null;
        char c10 = 1;
        b bVar2 = null;
        for (int size = this.f338274d.size() - 1; size >= 0; size--) {
            b bVar3 = (b) this.f338274d.get(size);
            b bVarN = bVar3.N();
            if (bVar == null && bVar3.H() == kVar) {
                bVar = bVar3;
            }
            if (c10 != 1) {
                if (c10 == 2 && bVar3.H() == kVar) {
                    bVar2.d0(bVar3);
                    c10 = 1;
                }
            } else if (bVarN.H() == kVar) {
                c10 = 2;
                bVar2 = bVarN;
            }
        }
        if (c10 == 2) {
            org.locationtech.jts.util.a.d(bVar != null, "found null for first outgoing dirEdge");
            if (bVar.H() != kVar) {
                z10 = false;
            }
            org.locationtech.jts.util.a.d(z10, "unable to link last incoming dirEdge");
            bVar2.d0(bVar);
        }
    }

    public void z() {
        v();
        b bVar = null;
        char c10 = 1;
        b bVar2 = null;
        for (int i10 = 0; i10 < this.f338274d.size(); i10++) {
            b bVar3 = (b) this.f338274d.get(i10);
            b bVarN = bVar3.N();
            if (bVar3.q().g()) {
                if (bVar == null && bVar3.R()) {
                    bVar = bVar3;
                }
                if (c10 != 1) {
                    if (c10 == 2 && bVar3.R()) {
                        bVar2.c0(bVar3);
                        c10 = 1;
                    }
                } else if (bVarN.R()) {
                    c10 = 2;
                    bVar2 = bVarN;
                }
            }
        }
        if (c10 == 2) {
            if (bVar == null) {
                throw new i0("no outgoing dirEdge found", e());
            }
            org.locationtech.jts.util.a.d(bVar.R(), "unable to link last incoming dirEdge");
            bVar2.c0(bVar);
        }
    }
}
