package org.locationtech.jts.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes14.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.geom.r f338003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.locationtech.jts.geom.a[] f338004b;

    private static class a implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private org.locationtech.jts.geom.a f338005a;

        public a(org.locationtech.jts.geom.a aVar) {
            this.f338005a = aVar;
        }

        private static int a(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
            double d10 = aVar2.f338092a;
            double d11 = aVar.f338092a;
            double d12 = d10 - d11;
            double d13 = aVar2.f338093b;
            double d14 = aVar.f338093b;
            double d15 = d13 - d14;
            double d16 = aVar3.f338092a - d11;
            double d17 = aVar3.f338093b - d14;
            int iA = s.a(aVar, aVar2, aVar3);
            if (iA == 1) {
                return 1;
            }
            if (iA == -1) {
                return -1;
            }
            double d18 = (d12 * d12) + (d15 * d15);
            double d19 = (d16 * d16) + (d17 * d17);
            if (d18 < d19) {
                return -1;
            }
            return d18 > d19 ? 1 : 0;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return a(this.f338005a, (org.locationtech.jts.geom.a) obj, (org.locationtech.jts.geom.a) obj2);
        }
    }

    public h(org.locationtech.jts.geom.n nVar) {
        this(d(nVar), nVar.g0());
    }

    private org.locationtech.jts.geom.a[] a(org.locationtech.jts.geom.a[] aVarArr) {
        int i10 = 0;
        org.locationtech.jts.util.a.a(aVarArr[0], aVarArr[aVarArr.length - 1]);
        ArrayList arrayList = new ArrayList();
        org.locationtech.jts.geom.a aVar = null;
        while (i10 <= aVarArr.length - 2) {
            org.locationtech.jts.geom.a aVar2 = aVarArr[i10];
            i10++;
            org.locationtech.jts.geom.a aVar3 = aVarArr[i10];
            if (!aVar2.equals(aVar3) && (aVar == null || !g(aVar, aVar2, aVar3))) {
                arrayList.add(aVar2);
                aVar = aVar2;
            }
        }
        arrayList.add(aVarArr[aVarArr.length - 1]);
        return (org.locationtech.jts.geom.a[]) arrayList.toArray(new org.locationtech.jts.geom.a[arrayList.size()]);
    }

    private org.locationtech.jts.geom.a[] b(org.locationtech.jts.geom.a[] aVarArr) {
        org.locationtech.jts.geom.a[] aVarArr2 = new org.locationtech.jts.geom.a[8];
        for (int i10 = 0; i10 < 8; i10++) {
            aVarArr2[i10] = aVarArr[0];
        }
        for (int i11 = 1; i11 < aVarArr.length; i11++) {
            org.locationtech.jts.geom.a aVar = aVarArr[i11];
            if (aVar.f338092a < aVarArr2[0].f338092a) {
                aVarArr2[0] = aVar;
            }
            org.locationtech.jts.geom.a aVar2 = aVarArr[i11];
            double d10 = aVar2.f338092a - aVar2.f338093b;
            org.locationtech.jts.geom.a aVar3 = aVarArr2[1];
            if (d10 < aVar3.f338092a - aVar3.f338093b) {
                aVarArr2[1] = aVar2;
            }
            org.locationtech.jts.geom.a aVar4 = aVarArr[i11];
            if (aVar4.f338093b > aVarArr2[2].f338093b) {
                aVarArr2[2] = aVar4;
            }
            org.locationtech.jts.geom.a aVar5 = aVarArr[i11];
            double d11 = aVar5.f338092a + aVar5.f338093b;
            org.locationtech.jts.geom.a aVar6 = aVarArr2[3];
            if (d11 > aVar6.f338092a + aVar6.f338093b) {
                aVarArr2[3] = aVar5;
            }
            org.locationtech.jts.geom.a aVar7 = aVarArr[i11];
            if (aVar7.f338092a > aVarArr2[4].f338092a) {
                aVarArr2[4] = aVar7;
            }
            org.locationtech.jts.geom.a aVar8 = aVarArr[i11];
            double d12 = aVar8.f338092a - aVar8.f338093b;
            org.locationtech.jts.geom.a aVar9 = aVarArr2[5];
            if (d12 > aVar9.f338092a - aVar9.f338093b) {
                aVarArr2[5] = aVar8;
            }
            org.locationtech.jts.geom.a aVar10 = aVarArr[i11];
            if (aVar10.f338093b < aVarArr2[6].f338093b) {
                aVarArr2[6] = aVar10;
            }
            org.locationtech.jts.geom.a aVar11 = aVarArr[i11];
            double d13 = aVar11.f338092a + aVar11.f338093b;
            org.locationtech.jts.geom.a aVar12 = aVarArr2[7];
            if (d13 < aVar12.f338092a + aVar12.f338093b) {
                aVarArr2[7] = aVar11;
            }
        }
        return aVarArr2;
    }

    private org.locationtech.jts.geom.a[] c(org.locationtech.jts.geom.a[] aVarArr) {
        org.locationtech.jts.geom.a[] aVarArrB = b(aVarArr);
        org.locationtech.jts.geom.d dVar = new org.locationtech.jts.geom.d();
        dVar.l(aVarArrB, false);
        if (dVar.size() < 3) {
            return null;
        }
        dVar.s();
        return dVar.Uf();
    }

    private static org.locationtech.jts.geom.a[] d(org.locationtech.jts.geom.n nVar) {
        org.locationtech.jts.util.n nVar2 = new org.locationtech.jts.util.n();
        nVar.b(nVar2);
        return nVar2.c();
    }

    private Stack f(org.locationtech.jts.geom.a[] aVarArr) {
        org.locationtech.jts.geom.a aVar;
        Stack stack = new Stack();
        stack.push(aVarArr[0]);
        stack.push(aVarArr[1]);
        stack.push(aVarArr[2]);
        for (int i10 = 3; i10 < aVarArr.length; i10++) {
            Object objPop = stack.pop();
            while (true) {
                aVar = (org.locationtech.jts.geom.a) objPop;
                if (stack.empty() || s.a((org.locationtech.jts.geom.a) stack.peek(), aVar, aVarArr[i10]) <= 0) {
                    break;
                }
                objPop = stack.pop();
            }
            stack.push(aVar);
            stack.push(aVarArr[i10]);
        }
        stack.push(aVarArr[0]);
        return stack;
    }

    private boolean g(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        if (s.a(aVar, aVar2, aVar3) != 0) {
            return false;
        }
        double d10 = aVar.f338092a;
        double d11 = aVar3.f338092a;
        if (d10 != d11) {
            double d12 = aVar2.f338092a;
            if (d10 <= d12 && d12 <= d11) {
                return true;
            }
            if (d11 <= d12 && d12 <= d10) {
                return true;
            }
        }
        double d13 = aVar.f338093b;
        double d14 = aVar3.f338093b;
        if (d13 != d14) {
            double d15 = aVar2.f338093b;
            if (d13 <= d15 && d15 <= d14) {
                return true;
            }
            if (d14 <= d15 && d15 <= d13) {
                return true;
            }
        }
        return false;
    }

    private org.locationtech.jts.geom.n h(org.locationtech.jts.geom.a[] aVarArr) {
        org.locationtech.jts.geom.a[] aVarArrA = a(aVarArr);
        if (aVarArrA.length == 3) {
            return this.f338003a.h(new org.locationtech.jts.geom.a[]{aVarArrA[0], aVarArrA[1]});
        }
        return this.f338003a.A(this.f338003a.k(aVarArrA));
    }

    private org.locationtech.jts.geom.a[] i(org.locationtech.jts.geom.a[] aVarArr) {
        org.locationtech.jts.geom.a[] aVarArr2 = new org.locationtech.jts.geom.a[3];
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 < aVarArr.length) {
                aVarArr2[i10] = aVarArr[i10];
            } else {
                aVarArr2[i10] = aVarArr[0];
            }
        }
        return aVarArr2;
    }

    private org.locationtech.jts.geom.a[] j(org.locationtech.jts.geom.a[] aVarArr) {
        for (int i10 = 1; i10 < aVarArr.length; i10++) {
            org.locationtech.jts.geom.a aVar = aVarArr[i10];
            double d10 = aVar.f338093b;
            org.locationtech.jts.geom.a aVar2 = aVarArr[0];
            double d11 = aVar2.f338093b;
            if (d10 < d11 || (d10 == d11 && aVar.f338092a < aVar2.f338092a)) {
                aVarArr[0] = aVar;
                aVarArr[i10] = aVar2;
            }
        }
        Arrays.sort(aVarArr, 1, aVarArr.length, new a(aVarArr[0]));
        return aVarArr;
    }

    private org.locationtech.jts.geom.a[] k(org.locationtech.jts.geom.a[] aVarArr) {
        org.locationtech.jts.geom.a[] aVarArrC = c(aVarArr);
        if (aVarArrC == null) {
            return aVarArr;
        }
        TreeSet treeSet = new TreeSet();
        for (org.locationtech.jts.geom.a aVar : aVarArrC) {
            treeSet.add(aVar);
        }
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            if (!t.a(aVarArr[i10], aVarArrC)) {
                treeSet.add(aVarArr[i10]);
            }
        }
        org.locationtech.jts.geom.a[] aVarArrV = org.locationtech.jts.geom.b.v(treeSet);
        return aVarArrV.length < 3 ? i(aVarArrV) : aVarArrV;
    }

    public org.locationtech.jts.geom.n e() {
        org.locationtech.jts.geom.a[] aVarArrK = this.f338004b;
        if (aVarArrK.length == 0) {
            return this.f338003a.d();
        }
        if (aVarArrK.length == 1) {
            return this.f338003a.v(aVarArrK[0]);
        }
        if (aVarArrK.length == 2) {
            return this.f338003a.h(aVarArrK);
        }
        if (aVarArrK.length > 50) {
            aVarArrK = k(aVarArrK);
        }
        return h(l(f(j(aVarArrK))));
    }

    protected org.locationtech.jts.geom.a[] l(Stack stack) {
        org.locationtech.jts.geom.a[] aVarArr = new org.locationtech.jts.geom.a[stack.size()];
        for (int i10 = 0; i10 < stack.size(); i10++) {
            aVarArr[i10] = (org.locationtech.jts.geom.a) stack.get(i10);
        }
        return aVarArr;
    }

    public h(org.locationtech.jts.geom.a[] aVarArr, org.locationtech.jts.geom.r rVar) {
        this.f338004b = org.locationtech.jts.util.n.b(aVarArr);
        this.f338003a = rVar;
    }
}
