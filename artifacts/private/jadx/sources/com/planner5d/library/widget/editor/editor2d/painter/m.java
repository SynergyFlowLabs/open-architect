package com.planner5d.library.widget.editor.editor2d.painter;

import com.planner5d.library.model.item.ItemPoint;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.planner5d.library.math.k f255261a = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.planner5d.library.math.k f255262b = new com.planner5d.library.math.k();

    m() {
    }

    private void b(com.planner5d.library.math.k kVar, List<ItemPoint> list, ItemPoint[] itemPointArr) {
        if (itemPointArr != null && itemPointArr.length >= 1) {
            Float fValueOf = null;
            Float fValueOf2 = null;
            for (ItemPoint itemPoint : itemPointArr) {
                if (!list.contains(itemPoint)) {
                    if (Math.abs(kVar.f180480a - itemPoint.getPoint(this.f255261a, true).f180480a) < 15.0f) {
                        float fN = this.f255261a.n(kVar.f180480a, kVar.f180481b);
                        if (fValueOf == null || this.f255262b.f180480a > fN) {
                            this.f255262b.f180480a = fN;
                            fValueOf = Float.valueOf(this.f255261a.f180480a);
                        }
                    }
                    if (Math.abs(kVar.f180481b - this.f255261a.f180481b) < 15.0f) {
                        float fN2 = this.f255261a.n(kVar.f180480a, kVar.f180481b);
                        if (fValueOf2 == null || this.f255262b.f180481b > fN2) {
                            this.f255262b.f180481b = fN2;
                            fValueOf2 = Float.valueOf(this.f255261a.f180481b);
                        }
                    }
                }
            }
            if (fValueOf != null) {
                kVar.f180480a = fValueOf.floatValue();
            }
            if (fValueOf2 != null) {
                kVar.f180481b = fValueOf2.floatValue();
            }
        }
    }

    void a(com.planner5d.library.math.k kVar, List<ItemPoint> list, ItemPoint[] itemPointArr) {
        b(kVar, list, itemPointArr);
        Iterator<ItemPoint> it = list.iterator();
        while (it.hasNext()) {
            it.next().setPoint(kVar.f180480a, kVar.f180481b, true);
        }
    }
}
