package org.locationtech.jts.simplify;

import java.util.ArrayList;
import java.util.List;
import org.locationtech.jts.geom.u;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.geom.x;

/* JADX INFO: loaded from: classes14.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v f339015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e[] f339016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f339017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f339018d;

    public f(v vVar) {
        this(vVar, 2);
    }

    private static org.locationtech.jts.geom.a[] d(List list) {
        int size = list.size();
        org.locationtech.jts.geom.a[] aVarArr = new org.locationtech.jts.geom.a[size + 1];
        u uVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            uVar = (u) list.get(i10);
            aVarArr[i10] = uVar.f338211a;
        }
        aVarArr[size] = uVar.f338212b;
        return aVarArr;
    }

    private void l() {
        org.locationtech.jts.geom.a[] aVarArrD0 = this.f339015a.d0();
        this.f339016b = new e[aVarArrD0.length - 1];
        int i10 = 0;
        while (i10 < aVarArrD0.length - 1) {
            int i11 = i10 + 1;
            this.f339016b[i10] = new e(aVarArrD0[i10], aVarArrD0[i11], this.f339015a, i10);
            i10 = i11;
        }
    }

    public void a(u uVar) {
        this.f339017c.add(uVar);
    }

    public v b() {
        return this.f339015a.g0().h(d(this.f339017c));
    }

    public x c() {
        return this.f339015a.g0().k(d(this.f339017c));
    }

    public int e() {
        return this.f339018d;
    }

    public v f() {
        return this.f339015a;
    }

    public org.locationtech.jts.geom.a[] g() {
        return this.f339015a.d0();
    }

    public org.locationtech.jts.geom.a[] h() {
        return d(this.f339017c);
    }

    public int i() {
        int size = this.f339017c.size();
        if (size == 0) {
            return 0;
        }
        return size + 1;
    }

    public e j(int i10) {
        return this.f339016b[i10];
    }

    public e[] k() {
        return this.f339016b;
    }

    public f(v vVar, int i10) {
        this.f339017c = new ArrayList();
        this.f339015a = vVar;
        this.f339018d = i10;
        l();
    }
}
