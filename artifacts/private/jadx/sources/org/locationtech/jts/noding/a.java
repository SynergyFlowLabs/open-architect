package org.locationtech.jts.noding;

/* JADX INFO: loaded from: classes14.dex */
public class a implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.geom.a[] f338548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f338549b;

    public a(org.locationtech.jts.geom.a[] aVarArr, Object obj) {
        this.f338548a = aVarArr;
        this.f338549b = obj;
    }

    @Override // org.locationtech.jts.noding.y
    public void a(Object obj) {
        this.f338549b = obj;
    }

    public int c(int i10) {
        if (i10 == this.f338548a.length - 1) {
            return -1;
        }
        return p.b(w4(i10), w4(i10 + 1));
    }

    @Override // org.locationtech.jts.noding.y
    public Object getData() {
        return this.f338549b;
    }

    @Override // org.locationtech.jts.noding.y
    public boolean isClosed() {
        Object[] objArr = this.f338548a;
        return objArr[0].equals(objArr[objArr.length - 1]);
    }

    @Override // org.locationtech.jts.noding.y
    public org.locationtech.jts.geom.a[] n() {
        return this.f338548a;
    }

    @Override // org.locationtech.jts.noding.y
    public int size() {
        return this.f338548a.length;
    }

    public String toString() {
        return rm.o.B(new org.locationtech.jts.geom.impl.a(this.f338548a));
    }

    @Override // org.locationtech.jts.noding.y
    public org.locationtech.jts.geom.a w4(int i10) {
        return this.f338548a[i10];
    }
}
