package androidx.constraintlayout.core.widgets.analyzer;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final boolean f44541j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final boolean f44542k = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.f f44543a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.f f44546d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f44544b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f44545c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<p> f44547e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<m> f44548f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b.InterfaceC0360b f44549g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b.a f44550h = new b.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ArrayList<m> f44551i = new ArrayList<>();

    public e(androidx.constraintlayout.core.widgets.f fVar) {
        this.f44543a = fVar;
        this.f44546d = fVar;
    }

    private void a(f fVar, int i10, int i11, f fVar2, ArrayList<m> arrayList, m mVar) {
        e eVar;
        int i12;
        f fVar3;
        ArrayList<m> arrayList2;
        p pVar = fVar.f44555d;
        if (pVar.f44617c == null) {
            androidx.constraintlayout.core.widgets.f fVar4 = this.f44543a;
            if (pVar == fVar4.f44710e || pVar == fVar4.f44712f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i11);
                arrayList.add(mVar);
            }
            m mVar2 = mVar;
            pVar.f44617c = mVar2;
            mVar2.a(pVar);
            for (d dVar : pVar.f44622h.f44562k) {
                if (dVar instanceof f) {
                    eVar = this;
                    i12 = i10;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                    eVar.a((f) dVar, i12, 0, fVar3, arrayList2, mVar2);
                } else {
                    eVar = this;
                    i12 = i10;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                }
                this = eVar;
                i10 = i12;
                fVar2 = fVar3;
                arrayList = arrayList2;
            }
            e eVar2 = this;
            int i13 = i10;
            f fVar5 = fVar2;
            ArrayList<m> arrayList3 = arrayList;
            for (d dVar2 : pVar.f44623i.f44562k) {
                if (dVar2 instanceof f) {
                    eVar2.a((f) dVar2, i13, 1, fVar5, arrayList3, mVar2);
                }
            }
            if (i13 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f44597k.f44562k) {
                    if (dVar3 instanceof f) {
                        eVar2.a((f) dVar3, i13, 2, fVar5, arrayList3, mVar2);
                    }
                }
            }
            for (f fVar6 : pVar.f44622h.f44563l) {
                if (fVar6 == fVar5) {
                    mVar2.f44590b = true;
                }
                eVar2.a(fVar6, i13, 0, fVar5, arrayList3, mVar2);
            }
            for (f fVar7 : pVar.f44623i.f44563l) {
                if (fVar7 == fVar5) {
                    mVar2.f44590b = true;
                }
                eVar2.a(fVar7, i13, 1, fVar5, arrayList3, mVar2);
            }
            if (i13 == 1 && (pVar instanceof n)) {
                Iterator<f> it = ((n) pVar).f44597k.f44563l.iterator();
                while (it.hasNext()) {
                    eVar2.a(it.next(), i13, 2, fVar5, arrayList3, mVar2);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:169:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x000a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private boolean b(androidx.constraintlayout.core.widgets.f fVar) {
        androidx.constraintlayout.core.widgets.e.b bVar;
        int i10;
        char c10;
        androidx.constraintlayout.core.widgets.e.b bVar2;
        androidx.constraintlayout.core.widgets.e.b bVar3;
        androidx.constraintlayout.core.widgets.e.b bVar4;
        androidx.constraintlayout.core.widgets.e.b bVar5;
        for (androidx.constraintlayout.core.widgets.e eVar : fVar.B1) {
            androidx.constraintlayout.core.widgets.e.b[] bVarArr = eVar.f44705b0;
            androidx.constraintlayout.core.widgets.e.b bVar6 = bVarArr[0];
            androidx.constraintlayout.core.widgets.e.b bVar7 = bVarArr[1];
            if (eVar.l0() == 8) {
                eVar.f44702a = true;
            } else {
                if (eVar.B < 1.0f && bVar6 == androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT) {
                    eVar.f44746w = 2;
                }
                if (eVar.E < 1.0f && bVar7 == androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT) {
                    eVar.f44748x = 2;
                }
                if (eVar.A() > 0.0f) {
                    androidx.constraintlayout.core.widgets.e.b bVar8 = androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT;
                    if (bVar6 == bVar8 && (bVar7 == androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT || bVar7 == androidx.constraintlayout.core.widgets.e.b.FIXED)) {
                        eVar.f44746w = 3;
                    } else if (bVar7 == bVar8 && (bVar6 == androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT || bVar6 == androidx.constraintlayout.core.widgets.e.b.FIXED)) {
                        eVar.f44748x = 3;
                    } else if (bVar6 == bVar8 && bVar7 == bVar8) {
                        if (eVar.f44746w == 0) {
                            eVar.f44746w = 3;
                        }
                        if (eVar.f44748x == 0) {
                            eVar.f44748x = 3;
                        }
                    }
                }
                androidx.constraintlayout.core.widgets.e.b bVar9 = androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT;
                if (bVar6 == bVar9 && eVar.f44746w == 1 && (eVar.Q.f44662f == null || eVar.S.f44662f == null)) {
                    bVar6 = androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT;
                }
                if (bVar7 == bVar9 && eVar.f44748x == 1 && (eVar.R.f44662f == null || eVar.T.f44662f == null)) {
                    bVar7 = androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT;
                }
                l lVar = eVar.f44710e;
                lVar.f44618d = bVar6;
                int i11 = eVar.f44746w;
                lVar.f44615a = i11;
                n nVar = eVar.f44712f;
                nVar.f44618d = bVar7;
                int i12 = eVar.f44748x;
                nVar.f44615a = i12;
                androidx.constraintlayout.core.widgets.e.b bVar10 = androidx.constraintlayout.core.widgets.e.b.MATCH_PARENT;
                if ((bVar6 == bVar10 || bVar6 == androidx.constraintlayout.core.widgets.e.b.FIXED || bVar6 == androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT) && (bVar7 == bVar10 || bVar7 == androidx.constraintlayout.core.widgets.e.b.FIXED || bVar7 == androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT)) {
                    androidx.constraintlayout.core.widgets.e.b bVar11 = bVar7;
                    androidx.constraintlayout.core.widgets.e.b bVar12 = bVar6;
                    int iM0 = eVar.m0();
                    if (bVar12 == bVar10) {
                        iM0 = (fVar.m0() - eVar.Q.f44663g) - eVar.S.f44663g;
                        bVar12 = androidx.constraintlayout.core.widgets.e.b.FIXED;
                    }
                    int i13 = iM0;
                    int iD = eVar.D();
                    if (bVar11 == bVar10) {
                        iD = (fVar.D() - eVar.R.f44663g) - eVar.T.f44663g;
                        bVar11 = androidx.constraintlayout.core.widgets.e.b.FIXED;
                    }
                    r(eVar, bVar12, i13, bVar11, iD);
                    eVar.f44710e.f44619e.e(eVar.m0());
                    eVar.f44712f.f44619e.e(eVar.D());
                    eVar.f44702a = true;
                } else {
                    if (bVar6 == bVar9) {
                        bVar2 = bVar9;
                        androidx.constraintlayout.core.widgets.e.b bVar13 = androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT;
                        c10 = 0;
                        if (bVar7 != bVar13 && bVar7 != androidx.constraintlayout.core.widgets.e.b.FIXED) {
                            bVar = bVar7;
                            i10 = 3;
                        } else if (i11 == 3) {
                            if (bVar7 == bVar13) {
                                r(eVar, bVar13, 0, bVar13, 0);
                            }
                            int iD2 = eVar.D();
                            int i14 = (int) ((iD2 * eVar.f44713f0) + 0.5f);
                            androidx.constraintlayout.core.widgets.e.b bVar14 = androidx.constraintlayout.core.widgets.e.b.FIXED;
                            r(eVar, bVar14, i14, bVar14, iD2);
                            eVar.f44710e.f44619e.e(eVar.m0());
                            eVar.f44712f.f44619e.e(eVar.D());
                            eVar.f44702a = true;
                        } else if (i11 == 1) {
                            r(eVar, bVar13, 0, bVar7, 0);
                            eVar.f44710e.f44619e.f44573m = eVar.m0();
                        } else {
                            bVar = bVar7;
                            i10 = 3;
                            if (i11 == 2) {
                                androidx.constraintlayout.core.widgets.e.b bVar15 = fVar.f44705b0[0];
                                androidx.constraintlayout.core.widgets.e.b bVar16 = androidx.constraintlayout.core.widgets.e.b.FIXED;
                                if (bVar15 == bVar16 || bVar15 == bVar10) {
                                    r(eVar, bVar16, (int) ((eVar.B * fVar.m0()) + 0.5f), bVar, eVar.D());
                                    eVar.f44710e.f44619e.e(eVar.m0());
                                    eVar.f44712f.f44619e.e(eVar.D());
                                    eVar.f44702a = true;
                                }
                            } else {
                                androidx.constraintlayout.core.widgets.d[] dVarArr = eVar.Y;
                                if (dVarArr[0].f44662f == null || dVarArr[1].f44662f == null) {
                                    r(eVar, bVar13, 0, bVar, 0);
                                    eVar.f44710e.f44619e.e(eVar.m0());
                                    eVar.f44712f.f44619e.e(eVar.D());
                                    eVar.f44702a = true;
                                } else if (bVar == bVar2 || !(bVar6 == (bVar4 = androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT) || bVar6 == androidx.constraintlayout.core.widgets.e.b.FIXED)) {
                                    bVar3 = bVar6;
                                    if (bVar3 != bVar2 && bVar == bVar2) {
                                        if (i11 == 1 || i12 == 1) {
                                            androidx.constraintlayout.core.widgets.e.b bVar17 = androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT;
                                            r(eVar, bVar17, 0, bVar17, 0);
                                            eVar.f44710e.f44619e.f44573m = eVar.m0();
                                            eVar.f44712f.f44619e.f44573m = eVar.D();
                                        } else if (i12 == 2 && i11 == 2) {
                                            androidx.constraintlayout.core.widgets.e.b[] bVarArr2 = fVar.f44705b0;
                                            androidx.constraintlayout.core.widgets.e.b bVar18 = bVarArr2[c10];
                                            androidx.constraintlayout.core.widgets.e.b bVar19 = androidx.constraintlayout.core.widgets.e.b.FIXED;
                                            if (bVar18 == bVar19 && bVarArr2[1] == bVar19) {
                                                r(eVar, bVar19, (int) ((eVar.B * fVar.m0()) + 0.5f), bVar19, (int) ((eVar.E * fVar.D()) + 0.5f));
                                                eVar.f44710e.f44619e.e(eVar.m0());
                                                eVar.f44712f.f44619e.e(eVar.D());
                                                eVar.f44702a = true;
                                            }
                                        }
                                    }
                                } else if (i12 == i10) {
                                    if (bVar6 == bVar4) {
                                        r(eVar, bVar4, 0, bVar4, 0);
                                    }
                                    int iM1 = eVar.m0();
                                    float f10 = eVar.f44713f0;
                                    if (eVar.B() == -1) {
                                        f10 = 1.0f / f10;
                                    }
                                    androidx.constraintlayout.core.widgets.e.b bVar20 = androidx.constraintlayout.core.widgets.e.b.FIXED;
                                    r(eVar, bVar20, iM1, bVar20, (int) ((iM1 * f10) + 0.5f));
                                    eVar.f44710e.f44619e.e(eVar.m0());
                                    eVar.f44712f.f44619e.e(eVar.D());
                                    eVar.f44702a = true;
                                } else if (i12 == 1) {
                                    r(eVar, bVar6, 0, bVar4, 0);
                                    eVar.f44712f.f44619e.f44573m = eVar.D();
                                } else {
                                    bVar3 = bVar6;
                                    if (i12 == 2) {
                                        androidx.constraintlayout.core.widgets.e.b bVar21 = fVar.f44705b0[1];
                                        bVar5 = bVar;
                                        androidx.constraintlayout.core.widgets.e.b bVar22 = androidx.constraintlayout.core.widgets.e.b.FIXED;
                                        if (bVar21 == bVar22 || bVar21 == bVar10) {
                                            r(eVar, bVar3, eVar.m0(), bVar22, (int) ((eVar.E * fVar.D()) + 0.5f));
                                            eVar.f44710e.f44619e.e(eVar.m0());
                                            eVar.f44712f.f44619e.e(eVar.D());
                                            eVar.f44702a = true;
                                        } else {
                                            bVar = bVar5;
                                            if (bVar3 != bVar2) {
                                            }
                                        }
                                    } else {
                                        bVar5 = bVar;
                                        androidx.constraintlayout.core.widgets.d[] dVarArr2 = eVar.Y;
                                        if (dVarArr2[2].f44662f == null || dVarArr2[i10].f44662f == null) {
                                            r(eVar, bVar4, 0, bVar5, 0);
                                            eVar.f44710e.f44619e.e(eVar.m0());
                                            eVar.f44712f.f44619e.e(eVar.D());
                                            eVar.f44702a = true;
                                        } else {
                                            bVar = bVar5;
                                            if (bVar3 != bVar2) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        bVar = bVar7;
                        i10 = 3;
                        c10 = 0;
                        bVar2 = bVar9;
                    }
                    if (bVar == bVar2) {
                    }
                    bVar3 = bVar6;
                    if (bVar3 != bVar2) {
                    }
                }
            }
        }
        return false;
    }

    private int e(androidx.constraintlayout.core.widgets.f fVar, int i10) {
        int size = this.f44551i.size();
        long jMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jMax = Math.max(jMax, this.f44551i.get(i11).b(fVar, i10));
        }
        return (int) jMax;
    }

    private void j() {
        Iterator<p> it = this.f44547e.iterator();
        String strM = "digraph {\n";
        while (it.hasNext()) {
            strM = m(it.next(), strM);
        }
        PrintStream printStream = System.out;
        printStream.println("content:<<\n" + (strM + "\n}\n") + "\n>>");
    }

    private void k(p pVar, int i10, ArrayList<m> arrayList) {
        for (d dVar : pVar.f44622h.f44562k) {
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, pVar.f44623i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f44622h, i10, 0, pVar.f44623i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f44623i.f44562k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, pVar.f44622h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f44623i, i10, 1, pVar.f44622h, arrayList, null);
            }
        }
        int i11 = i10;
        if (i11 == 1) {
            for (d dVar3 : ((n) pVar).f44597k.f44562k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i11, 2, null, arrayList, null);
                }
                i11 = i10;
            }
        }
    }

    private String l(c cVar, String str) {
        int i10 = cVar.f44620f;
        StringBuilder sb2 = new StringBuilder("subgraph ");
        sb2.append("cluster_");
        sb2.append(cVar.f44616b.y());
        if (i10 == 0) {
            sb2.append("_h");
        } else {
            sb2.append("_v");
        }
        sb2.append(" {\n");
        String strM = "";
        for (p pVar : cVar.f44539k) {
            sb2.append(pVar.f44616b.y());
            if (i10 == 0) {
                sb2.append("_HORIZONTAL");
            } else {
                sb2.append("_VERTICAL");
            }
            sb2.append(";\n");
            strM = m(pVar, strM);
        }
        sb2.append("}\n");
        return str + strM + ((Object) sb2);
    }

    private String m(p pVar, String str) {
        boolean z10;
        f fVar = pVar.f44622h;
        f fVar2 = pVar.f44623i;
        StringBuilder sb2 = new StringBuilder(str);
        if (!(pVar instanceof k) && fVar.f44562k.isEmpty() && fVar2.f44562k.isEmpty() && fVar.f44563l.isEmpty() && fVar2.f44563l.isEmpty()) {
            return str;
        }
        sb2.append(t(pVar));
        boolean zQ = q(fVar, fVar2);
        String strN = n(fVar2, zQ, n(fVar, zQ, str));
        boolean z11 = pVar instanceof n;
        if (z11) {
            strN = n(((n) pVar).f44597k, zQ, strN);
        }
        if ((pVar instanceof l) || (((z10 = pVar instanceof c)) && ((c) pVar).f44620f == 0)) {
            androidx.constraintlayout.core.widgets.e.b bVarH = pVar.f44616b.H();
            if (bVarH == androidx.constraintlayout.core.widgets.e.b.FIXED || bVarH == androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT) {
                if (!fVar.f44563l.isEmpty() && fVar2.f44563l.isEmpty()) {
                    sb2.append("\n");
                    sb2.append(fVar2.d());
                    sb2.append(" -> ");
                    sb2.append(fVar.d());
                    sb2.append("\n");
                } else if (fVar.f44563l.isEmpty() && !fVar2.f44563l.isEmpty()) {
                    sb2.append("\n");
                    sb2.append(fVar.d());
                    sb2.append(" -> ");
                    sb2.append(fVar2.d());
                    sb2.append("\n");
                }
            } else if (bVarH == androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT && pVar.f44616b.A() > 0.0f) {
                sb2.append("\n");
                sb2.append(pVar.f44616b.y());
                sb2.append("_HORIZONTAL -> ");
                sb2.append(pVar.f44616b.y());
                sb2.append("_VERTICAL;\n");
            }
        } else if (z11 || (z10 && ((c) pVar).f44620f == 1)) {
            androidx.constraintlayout.core.widgets.e.b bVarJ0 = pVar.f44616b.j0();
            if (bVarJ0 == androidx.constraintlayout.core.widgets.e.b.FIXED || bVarJ0 == androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT) {
                if (!fVar.f44563l.isEmpty() && fVar2.f44563l.isEmpty()) {
                    sb2.append("\n");
                    sb2.append(fVar2.d());
                    sb2.append(" -> ");
                    sb2.append(fVar.d());
                    sb2.append("\n");
                } else if (fVar.f44563l.isEmpty() && !fVar2.f44563l.isEmpty()) {
                    sb2.append("\n");
                    sb2.append(fVar.d());
                    sb2.append(" -> ");
                    sb2.append(fVar2.d());
                    sb2.append("\n");
                }
            } else if (bVarJ0 == androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT && pVar.f44616b.A() > 0.0f) {
                sb2.append("\n");
                sb2.append(pVar.f44616b.y());
                sb2.append("_VERTICAL -> ");
                sb2.append(pVar.f44616b.y());
                sb2.append("_HORIZONTAL;\n");
            }
        }
        return pVar instanceof c ? l((c) pVar, strN) : sb2.toString();
    }

    private String n(f fVar, boolean z10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        for (f fVar2 : fVar.f44563l) {
            String str2 = ("\n" + fVar.d()) + " -> " + fVar2.d();
            if (fVar.f44557f > 0 || z10 || (fVar.f44555d instanceof k)) {
                String str3 = str2 + "[";
                if (fVar.f44557f > 0) {
                    str3 = str3 + "label=\"" + fVar.f44557f + "\"";
                    if (z10) {
                        str3 = str3 + ",";
                    }
                }
                if (z10) {
                    str3 = str3 + " style=dashed ";
                }
                if (fVar.f44555d instanceof k) {
                    str3 = str3 + " style=bold,color=gray ";
                }
                str2 = str3 + "]";
            }
            sb2.append(str2 + "\n");
        }
        return sb2.toString();
    }

    private boolean q(f fVar, f fVar2) {
        Iterator<f> it = fVar.f44563l.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next() != fVar2) {
                i10++;
            }
        }
        Iterator<f> it2 = fVar2.f44563l.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            if (it2.next() != fVar) {
                i11++;
            }
        }
        return i10 > 0 && i11 > 0;
    }

    private void r(androidx.constraintlayout.core.widgets.e eVar, androidx.constraintlayout.core.widgets.e.b bVar, int i10, androidx.constraintlayout.core.widgets.e.b bVar2, int i11) {
        b.a aVar = this.f44550h;
        aVar.f44529a = bVar;
        aVar.f44530b = bVar2;
        aVar.f44531c = i10;
        aVar.f44532d = i11;
        this.f44549g.b(eVar, aVar);
        eVar.d2(this.f44550h.f44533e);
        eVar.z1(this.f44550h.f44534f);
        eVar.y1(this.f44550h.f44536h);
        eVar.h1(this.f44550h.f44535g);
    }

    private String t(p pVar) {
        boolean z10 = pVar instanceof n;
        String strY = pVar.f44616b.y();
        StringBuilder sb2 = new StringBuilder(strY);
        androidx.constraintlayout.core.widgets.e.b bVarH = !z10 ? pVar.f44616b.H() : pVar.f44616b.j0();
        m mVar = pVar.f44617c;
        if (z10) {
            sb2.append("_VERTICAL");
        } else {
            sb2.append("_HORIZONTAL");
        }
        sb2.append(" [shape=none, label=<");
        sb2.append("<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">");
        sb2.append("  <TR>");
        if (z10) {
            sb2.append("    <TD ");
            if (pVar.f44622h.f44561j) {
                sb2.append(" BGCOLOR=\"green\"");
            }
            sb2.append(" PORT=\"TOP\" BORDER=\"1\">T</TD>");
        } else {
            sb2.append("    <TD ");
            if (pVar.f44622h.f44561j) {
                sb2.append(" BGCOLOR=\"green\"");
            }
            sb2.append(" PORT=\"LEFT\" BORDER=\"1\">L</TD>");
        }
        sb2.append("    <TD BORDER=\"1\" ");
        boolean z11 = pVar.f44619e.f44561j;
        if (z11 && !pVar.f44616b.f44702a) {
            sb2.append(" BGCOLOR=\"green\" ");
        } else if (z11) {
            sb2.append(" BGCOLOR=\"lightgray\" ");
        } else if (pVar.f44616b.f44702a) {
            sb2.append(" BGCOLOR=\"yellow\" ");
        }
        if (bVarH == androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT) {
            sb2.append("style=\"dashed\"");
        }
        sb2.append(">");
        sb2.append(strY);
        if (mVar != null) {
            sb2.append(" [");
            sb2.append(mVar.f44594f + 1);
            sb2.append("/");
            sb2.append(m.f44588k);
            sb2.append("]");
        }
        sb2.append(" </TD>");
        if (z10) {
            sb2.append("    <TD ");
            if (((n) pVar).f44597k.f44561j) {
                sb2.append(" BGCOLOR=\"green\"");
            }
            sb2.append(" PORT=\"BASELINE\" BORDER=\"1\">b</TD>");
            sb2.append("    <TD ");
            if (pVar.f44623i.f44561j) {
                sb2.append(" BGCOLOR=\"green\"");
            }
            sb2.append(" PORT=\"BOTTOM\" BORDER=\"1\">B</TD>");
        } else {
            sb2.append("    <TD ");
            if (pVar.f44623i.f44561j) {
                sb2.append(" BGCOLOR=\"green\"");
            }
            sb2.append(" PORT=\"RIGHT\" BORDER=\"1\">R</TD>");
        }
        sb2.append("  </TR></TABLE>");
        sb2.append(">];\n");
        return sb2.toString();
    }

    public void c() {
        d(this.f44547e);
        this.f44551i.clear();
        m.f44588k = 0;
        k(this.f44543a.f44710e, 0, this.f44551i);
        k(this.f44543a.f44712f, 1, this.f44551i);
        this.f44544b = false;
    }

    public void d(ArrayList<p> arrayList) {
        arrayList.clear();
        this.f44546d.f44710e.f();
        this.f44546d.f44712f.f();
        arrayList.add(this.f44546d.f44710e);
        arrayList.add(this.f44546d.f44712f);
        HashSet hashSet = null;
        int i10 = 2 & 0;
        for (androidx.constraintlayout.core.widgets.e eVar : this.f44546d.B1) {
            if (eVar instanceof androidx.constraintlayout.core.widgets.h) {
                arrayList.add(new j(eVar));
            } else {
                if (eVar.B0()) {
                    if (eVar.f44706c == null) {
                        eVar.f44706c = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f44706c);
                } else {
                    arrayList.add(eVar.f44710e);
                }
                if (eVar.D0()) {
                    if (eVar.f44708d == null) {
                        eVar.f44708d = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f44708d);
                } else {
                    arrayList.add(eVar.f44712f);
                }
                if (eVar instanceof androidx.constraintlayout.core.widgets.j) {
                    arrayList.add(new k(eVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
        for (p pVar : arrayList) {
            if (pVar.f44616b != this.f44546d) {
                pVar.d();
            }
        }
    }

    public void f(androidx.constraintlayout.core.widgets.e.b bVar, androidx.constraintlayout.core.widgets.e.b bVar2) {
        if (this.f44544b) {
            c();
            boolean z10 = false;
            for (androidx.constraintlayout.core.widgets.e eVar : this.f44543a.B1) {
                boolean[] zArr = eVar.f44714g;
                zArr[0] = true;
                zArr[1] = true;
                if (eVar instanceof androidx.constraintlayout.core.widgets.a) {
                    z10 = true;
                }
            }
            if (z10) {
                return;
            }
            for (m mVar : this.f44551i) {
                androidx.constraintlayout.core.widgets.e.b bVar3 = androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT;
                mVar.d(bVar == bVar3, bVar2 == bVar3);
            }
        }
    }

    public boolean g(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (this.f44544b || this.f44545c) {
            for (androidx.constraintlayout.core.widgets.e eVar : this.f44543a.B1) {
                eVar.q();
                eVar.f44702a = false;
                eVar.f44710e.n();
                eVar.f44712f.n();
            }
            this.f44543a.q();
            androidx.constraintlayout.core.widgets.f fVar = this.f44543a;
            fVar.f44702a = false;
            fVar.f44710e.n();
            this.f44543a.f44712f.n();
            this.f44545c = false;
        }
        if (b(this.f44546d)) {
            return false;
        }
        this.f44543a.g2(0);
        this.f44543a.h2(0);
        androidx.constraintlayout.core.widgets.e.b bVarZ = this.f44543a.z(0);
        androidx.constraintlayout.core.widgets.e.b bVarZ2 = this.f44543a.z(1);
        if (this.f44544b) {
            c();
        }
        int iO0 = this.f44543a.o0();
        int iP0 = this.f44543a.p0();
        this.f44543a.f44710e.f44622h.e(iO0);
        this.f44543a.f44712f.f44622h.e(iP0);
        s();
        androidx.constraintlayout.core.widgets.e.b bVar = androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT;
        if (bVarZ == bVar || bVarZ2 == bVar) {
            if (z10) {
                Iterator<p> it = this.f44547e.iterator();
                while (it.hasNext()) {
                    if (!it.next().p()) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10 && bVarZ == androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT) {
                this.f44543a.E1(androidx.constraintlayout.core.widgets.e.b.FIXED);
                androidx.constraintlayout.core.widgets.f fVar2 = this.f44543a;
                fVar2.d2(e(fVar2, 0));
                androidx.constraintlayout.core.widgets.f fVar3 = this.f44543a;
                fVar3.f44710e.f44619e.e(fVar3.m0());
            }
            if (z10 && bVarZ2 == androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT) {
                this.f44543a.Z1(androidx.constraintlayout.core.widgets.e.b.FIXED);
                androidx.constraintlayout.core.widgets.f fVar4 = this.f44543a;
                fVar4.z1(e(fVar4, 1));
                androidx.constraintlayout.core.widgets.f fVar5 = this.f44543a;
                fVar5.f44712f.f44619e.e(fVar5.D());
            }
        }
        androidx.constraintlayout.core.widgets.f fVar6 = this.f44543a;
        androidx.constraintlayout.core.widgets.e.b bVar2 = fVar6.f44705b0[0];
        androidx.constraintlayout.core.widgets.e.b bVar3 = androidx.constraintlayout.core.widgets.e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == androidx.constraintlayout.core.widgets.e.b.MATCH_PARENT) {
            int iM0 = fVar6.m0() + iO0;
            this.f44543a.f44710e.f44623i.e(iM0);
            this.f44543a.f44710e.f44619e.e(iM0 - iO0);
            s();
            androidx.constraintlayout.core.widgets.f fVar7 = this.f44543a;
            androidx.constraintlayout.core.widgets.e.b bVar4 = fVar7.f44705b0[1];
            if (bVar4 == bVar3 || bVar4 == androidx.constraintlayout.core.widgets.e.b.MATCH_PARENT) {
                int iD = fVar7.D() + iP0;
                this.f44543a.f44712f.f44623i.e(iD);
                this.f44543a.f44712f.f44619e.e(iD - iP0);
            }
            s();
            z11 = true;
        } else {
            z11 = false;
        }
        for (p pVar : this.f44547e) {
            if (pVar.f44616b != this.f44543a || pVar.f44621g) {
                pVar.e();
            }
        }
        for (p pVar2 : this.f44547e) {
            if (z11 || pVar2.f44616b != this.f44543a) {
                if (pVar2.f44622h.f44561j && ((pVar2.f44623i.f44561j || (pVar2 instanceof j)) && (pVar2.f44619e.f44561j || (pVar2 instanceof c) || (pVar2 instanceof j)))) {
                }
                this.f44543a.E1(bVarZ);
                this.f44543a.Z1(bVarZ2);
                return z12;
            }
        }
        z12 = true;
        this.f44543a.E1(bVarZ);
        this.f44543a.Z1(bVarZ2);
        return z12;
    }

    public boolean h(boolean z10) {
        if (this.f44544b) {
            for (androidx.constraintlayout.core.widgets.e eVar : this.f44543a.B1) {
                eVar.q();
                eVar.f44702a = false;
                l lVar = eVar.f44710e;
                lVar.f44619e.f44561j = false;
                lVar.f44621g = false;
                lVar.n();
                n nVar = eVar.f44712f;
                nVar.f44619e.f44561j = false;
                nVar.f44621g = false;
                nVar.n();
            }
            this.f44543a.q();
            androidx.constraintlayout.core.widgets.f fVar = this.f44543a;
            fVar.f44702a = false;
            l lVar2 = fVar.f44710e;
            lVar2.f44619e.f44561j = false;
            lVar2.f44621g = false;
            lVar2.n();
            n nVar2 = this.f44543a.f44712f;
            nVar2.f44619e.f44561j = false;
            nVar2.f44621g = false;
            nVar2.n();
            c();
        }
        if (b(this.f44546d)) {
            return false;
        }
        this.f44543a.g2(0);
        this.f44543a.h2(0);
        this.f44543a.f44710e.f44622h.e(0);
        this.f44543a.f44712f.f44622h.e(0);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00e3  */
    public boolean i(boolean z10, int i10) {
        boolean z11;
        androidx.constraintlayout.core.widgets.e.b bVar;
        boolean z12 = false;
        androidx.constraintlayout.core.widgets.e.b bVarZ = this.f44543a.z(0);
        androidx.constraintlayout.core.widgets.e.b bVarZ2 = this.f44543a.z(1);
        int iO0 = this.f44543a.o0();
        int iP0 = this.f44543a.p0();
        if (z10 && (bVarZ == (bVar = androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT) || bVarZ2 == bVar)) {
            for (p pVar : this.f44547e) {
                if (pVar.f44620f == i10 && !pVar.p()) {
                    z10 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z10 && bVarZ == androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT) {
                    this.f44543a.E1(androidx.constraintlayout.core.widgets.e.b.FIXED);
                    androidx.constraintlayout.core.widgets.f fVar = this.f44543a;
                    fVar.d2(e(fVar, 0));
                    androidx.constraintlayout.core.widgets.f fVar2 = this.f44543a;
                    fVar2.f44710e.f44619e.e(fVar2.m0());
                }
            } else if (z10 && bVarZ2 == androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT) {
                this.f44543a.Z1(androidx.constraintlayout.core.widgets.e.b.FIXED);
                androidx.constraintlayout.core.widgets.f fVar3 = this.f44543a;
                fVar3.z1(e(fVar3, 1));
                androidx.constraintlayout.core.widgets.f fVar4 = this.f44543a;
                fVar4.f44712f.f44619e.e(fVar4.D());
            }
        }
        if (i10 == 0) {
            androidx.constraintlayout.core.widgets.f fVar5 = this.f44543a;
            androidx.constraintlayout.core.widgets.e.b bVar2 = fVar5.f44705b0[0];
            if (bVar2 == androidx.constraintlayout.core.widgets.e.b.FIXED || bVar2 == androidx.constraintlayout.core.widgets.e.b.MATCH_PARENT) {
                int iM0 = fVar5.m0() + iO0;
                this.f44543a.f44710e.f44623i.e(iM0);
                this.f44543a.f44710e.f44619e.e(iM0 - iO0);
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            androidx.constraintlayout.core.widgets.f fVar6 = this.f44543a;
            androidx.constraintlayout.core.widgets.e.b bVar3 = fVar6.f44705b0[1];
            if (bVar3 == androidx.constraintlayout.core.widgets.e.b.FIXED || bVar3 == androidx.constraintlayout.core.widgets.e.b.MATCH_PARENT) {
                int iD = fVar6.D() + iP0;
                this.f44543a.f44712f.f44623i.e(iD);
                this.f44543a.f44712f.f44619e.e(iD - iP0);
                z11 = true;
            } else {
                z11 = false;
            }
        }
        s();
        for (p pVar2 : this.f44547e) {
            if (pVar2.f44620f == i10 && (pVar2.f44616b != this.f44543a || pVar2.f44621g)) {
                pVar2.e();
            }
        }
        for (p pVar3 : this.f44547e) {
            if (pVar3.f44620f == i10 && (z11 || pVar3.f44616b != this.f44543a)) {
                if (pVar3.f44622h.f44561j && pVar3.f44623i.f44561j && ((pVar3 instanceof c) || pVar3.f44619e.f44561j)) {
                }
                this.f44543a.E1(bVarZ);
                this.f44543a.Z1(bVarZ2);
                return z12;
            }
        }
        z12 = true;
        this.f44543a.E1(bVarZ);
        this.f44543a.Z1(bVarZ2);
        return z12;
    }

    public void o() {
        this.f44544b = true;
    }

    public void p() {
        this.f44545c = true;
    }

    public void s() {
        e eVar;
        g gVar;
        for (androidx.constraintlayout.core.widgets.e eVar2 : this.f44543a.B1) {
            if (!eVar2.f44702a) {
                androidx.constraintlayout.core.widgets.e.b[] bVarArr = eVar2.f44705b0;
                boolean z10 = false;
                androidx.constraintlayout.core.widgets.e.b bVar = bVarArr[0];
                androidx.constraintlayout.core.widgets.e.b bVar2 = bVarArr[1];
                int i10 = eVar2.f44746w;
                int i11 = eVar2.f44748x;
                androidx.constraintlayout.core.widgets.e.b bVar3 = androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT;
                boolean z11 = bVar == bVar3 || (bVar == androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT && i10 == 1);
                if (bVar2 == bVar3 || (bVar2 == androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                g gVar2 = eVar2.f44710e.f44619e;
                boolean z12 = gVar2.f44561j;
                g gVar3 = eVar2.f44712f.f44619e;
                boolean z13 = gVar3.f44561j;
                if (z12 && z13) {
                    androidx.constraintlayout.core.widgets.e.b bVar4 = androidx.constraintlayout.core.widgets.e.b.FIXED;
                    eVar = this;
                    eVar.r(eVar2, bVar4, gVar2.f44558g, bVar4, gVar3.f44558g);
                    eVar2.f44702a = true;
                } else if (z12 && z10) {
                    eVar = this;
                    eVar.r(eVar2, androidx.constraintlayout.core.widgets.e.b.FIXED, gVar2.f44558g, bVar3, gVar3.f44558g);
                    if (bVar2 == androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT) {
                        eVar2.f44712f.f44619e.f44573m = eVar2.D();
                    } else {
                        eVar2.f44712f.f44619e.e(eVar2.D());
                        eVar2.f44702a = true;
                    }
                } else {
                    eVar = this;
                    if (z13 && z11) {
                        eVar.r(eVar2, bVar3, gVar2.f44558g, androidx.constraintlayout.core.widgets.e.b.FIXED, gVar3.f44558g);
                        if (bVar == androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT) {
                            eVar2.f44710e.f44619e.f44573m = eVar2.m0();
                        } else {
                            eVar2.f44710e.f44619e.e(eVar2.m0());
                            eVar2.f44702a = true;
                        }
                    }
                }
                if (eVar2.f44702a && (gVar = eVar2.f44712f.f44598l) != null) {
                    gVar.e(eVar2.t());
                }
                this = eVar;
            }
        }
    }

    public void u(b.InterfaceC0360b interfaceC0360b) {
        this.f44549g = interfaceC0360b;
    }
}
