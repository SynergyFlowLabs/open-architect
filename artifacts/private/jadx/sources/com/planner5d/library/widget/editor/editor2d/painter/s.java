package com.planner5d.library.widget.editor.editor2d.painter;

import com.planner5d.library.model.item.ItemRuler;
import com.planner5d.library.widget.editor.helper.r3;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.planner5d.library.math.k[] f255300a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r3 f255301b = new r3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.math.k f255302c = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.planner5d.library.math.k f255303d = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f255304e = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f255305f = 0.0f;

    s() {
    }

    boolean a(com.planner5d.library.math.k kVar) {
        com.planner5d.library.math.k[] kVarArr;
        if (this.f255300a == null) {
            return false;
        }
        Float fValueOf = null;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            kVarArr = this.f255300a;
            if (i11 >= kVarArr.length) {
                break;
            }
            float fA = com.planner5d.library.math.b.f180462a.a(kVarArr[i11], kVarArr[i11 + 1], kVar);
            if (fA < this.f255304e && (fValueOf == null || fA < fValueOf.floatValue())) {
                fValueOf = Float.valueOf(fA);
                i10 = i11;
            }
            i11 += 2;
        }
        if (i10 < 0) {
            return false;
        }
        int i12 = i10 + 1;
        this.f255303d.V(kVarArr[i12]).c0(this.f255300a[i10]);
        this.f255302c.V(kVar);
        kVar.V(this.f255303d).M().R(com.planner5d.library.math.c.f180466e.f(this.f255302c.c0(this.f255300a[i10]), this.f255303d)).b(this.f255300a[i10]);
        if (this.f255300a[i10].n(kVar.f180480a, kVar.f180481b) < this.f255305f) {
            kVar.V(this.f255300a[i10]);
        } else if (this.f255300a[i12].n(kVar.f180480a, kVar.f180481b) < this.f255305f) {
            kVar.V(this.f255300a[i12]);
        }
        return true;
    }

    void b(com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar, ItemRuler[] itemRulerArr) {
        if (!bVar.f258075f) {
            this.f255300a = null;
            return;
        }
        float f10 = (bVar.f258079j ? bVar.f258080k : 15.0f) * 2.0f;
        this.f255304e = f10;
        this.f255305f = (float) Math.pow(f10, 2.0d);
        ArrayList arrayList = new ArrayList();
        for (ItemRuler itemRuler : itemRulerArr) {
            arrayList.add(itemRuler.getPoint(new com.planner5d.library.math.k(), true, true));
            arrayList.add(itemRuler.getPoint(new com.planner5d.library.math.k(), true, false));
        }
        this.f255300a = arrayList.isEmpty() ? null : (com.planner5d.library.math.k[]) arrayList.toArray(new com.planner5d.library.math.k[0]);
    }

    void c() {
        this.f255300a = null;
    }
}
