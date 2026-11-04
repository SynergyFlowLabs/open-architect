package org.locationtech.jts.geom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public class d extends ArrayList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a[] f338109a = new a[0];

    public d() {
    }

    public a[] Uf() {
        return (a[]) toArray(f338109a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(int i10, a aVar, boolean z10) {
        int size;
        if (!z10 && (size = size()) > 0) {
            if (i10 > 0 && ((a) get(i10 - 1)).p(aVar)) {
                return;
            }
            if (i10 < size && ((a) get(i10)).p(aVar)) {
                return;
            }
        }
        super.add(i10, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList
    public Object clone() {
        d dVar = (d) super.clone();
        for (int i10 = 0; i10 < size(); i10++) {
            dVar.add(i10, ((a) get(i10)).clone());
        }
        return dVar;
    }

    public void d(a aVar) {
        super.add(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i(a aVar, boolean z10) {
        if (z10 || size() < 1 || !((a) get(size() - 1)).p(aVar)) {
            super.add(aVar);
        }
    }

    public boolean k(Object obj, boolean z10) {
        i((a) obj, z10);
        return true;
    }

    public boolean l(a[] aVarArr, boolean z10) {
        p(aVarArr, z10, true);
        return true;
    }

    public boolean n(a[] aVarArr, boolean z10, int i10, int i11) {
        int i12 = i10 > i11 ? -1 : 1;
        while (i10 != i11) {
            i(aVarArr[i10], z10);
            i10 += i12;
        }
        return true;
    }

    public boolean p(a[] aVarArr, boolean z10, boolean z11) {
        if (z11) {
            for (a aVar : aVarArr) {
                i(aVar, z10);
            }
        } else {
            for (int length = aVarArr.length - 1; length >= 0; length--) {
                i(aVarArr[length], z10);
            }
        }
        return true;
    }

    public boolean r(Collection collection, boolean z10) {
        Iterator it = collection.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            i((a) it.next(), z10);
            z11 = true;
        }
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void s() {
        if (size() > 0) {
            i(new a((a) get(0)), false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a w4(int i10) {
        return (a) get(i10);
    }

    public d(a[] aVarArr) {
        ensureCapacity(aVarArr.length);
        l(aVarArr, true);
    }

    public d(a[] aVarArr, boolean z10) {
        ensureCapacity(aVarArr.length);
        l(aVarArr, z10);
    }
}
