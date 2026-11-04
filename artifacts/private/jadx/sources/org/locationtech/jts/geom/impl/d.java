package org.locationtech.jts.geom.impl;

import java.io.Serializable;
import org.locationtech.jts.geom.e;
import org.locationtech.jts.geom.g;

/* JADX INFO: loaded from: classes14.dex */
public class d implements g, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f338137c = -3558264771905224525L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f338138d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f338139e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f338140f = new d(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f338141g = new d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f338142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f338143b;

    public d() {
        this(0);
    }

    @Override // org.locationtech.jts.geom.g
    public e a(org.locationtech.jts.geom.a[] aVarArr) {
        return this.f338142a == 0 ? new c.a(aVarArr, this.f338143b) : new c.b(aVarArr, this.f338143b);
    }

    @Override // org.locationtech.jts.geom.g
    public e b(e eVar) {
        return this.f338142a == 0 ? new c.a(eVar.Uf(), this.f338143b) : new c.b(eVar.Uf(), this.f338143b);
    }

    @Override // org.locationtech.jts.geom.g
    public e c(int i10, int i11) {
        return this.f338142a == 0 ? new c.a(i10, i11) : new c.b(i10, i11);
    }

    public e d(double[] dArr, int i10) {
        return this.f338142a == 0 ? new c.a(dArr, i10) : new c.b(dArr, i10);
    }

    public e e(float[] fArr, int i10) {
        return this.f338142a == 0 ? new c.a(fArr, i10) : new c.b(fArr, i10);
    }

    public int f() {
        return this.f338143b;
    }

    public int g() {
        return this.f338142a;
    }

    public void h(int i10) {
        this.f338143b = i10;
    }

    public void i(int i10) {
        if (i10 == 0 || i10 == 1) {
            this.f338142a = i10;
            return;
        }
        throw new IllegalArgumentException("Unknown type " + i10);
    }

    public d(int i10) {
        this(i10, 3);
    }

    public d(int i10, int i11) {
        this.f338142a = 0;
        this.f338143b = 3;
        i(i10);
        h(i11);
    }
}
