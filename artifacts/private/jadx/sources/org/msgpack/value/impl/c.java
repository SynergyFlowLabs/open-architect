package org.msgpack.value.impl;

import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.v;
import org.msgpack.value.m;
import org.msgpack.value.n;
import org.msgpack.value.o;
import org.msgpack.value.p;
import org.msgpack.value.x;
import org.msgpack.value.z;

/* JADX INFO: loaded from: classes14.dex */
public class c extends org.msgpack.value.impl.b implements org.msgpack.value.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f339380b = new c(new x[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x[] f339381a;

    private static class a extends AbstractList<x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x[] f339382a;

        public a(x[] xVarArr) {
            this.f339382a = xVarArr;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f339382a.length;
        }

        @Override // java.util.AbstractList, java.util.List
        public x get(int i10) {
            return this.f339382a[i10];
        }
    }

    private static class b implements Iterator<x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x[] f339383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f339384b = 0;

        public b(x[] xVarArr) {
            this.f339383a = xVarArr;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public x next() {
            int i10 = this.f339384b;
            x[] xVarArr = this.f339383a;
            if (i10 >= xVarArr.length) {
                throw new NoSuchElementException();
            }
            this.f339384b = i10 + 1;
            return xVarArr[i10];
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f339384b != this.f339383a.length;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public c(x[] xVarArr) {
        this.f339381a = xVarArr;
    }

    public static org.msgpack.value.f A0() {
        return f339380b;
    }

    private static void z0(StringBuilder sb2, x xVar) {
        if (xVar.b0()) {
            sb2.append(xVar.O());
        } else {
            sb2.append(xVar.toString());
        }
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean A() {
        return super.A();
    }

    @Override // org.msgpack.value.x
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public org.msgpack.value.f M() {
        return this;
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean J() {
        return super.J();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean K() {
        return super.K();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean L() {
        return super.L();
    }

    @Override // org.msgpack.value.x
    public void N(org.msgpack.core.j jVar) throws IOException {
        jVar.g(this.f339381a.length);
        int i10 = 0;
        while (true) {
            x[] xVarArr = this.f339381a;
            if (i10 >= xVarArr.length) {
                return;
            }
            xVarArr[i10].N(jVar);
            i10++;
        }
    }

    @Override // org.msgpack.value.x
    public String O() {
        if (this.f339381a.length == 0) {
            return v.f334777p;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        sb2.append(this.f339381a[0].O());
        for (int i10 = 1; i10 < this.f339381a.length; i10++) {
            sb2.append(",");
            sb2.append(this.f339381a[i10].O());
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean W() {
        return super.W();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean Y() {
        return super.Y();
    }

    @Override // org.msgpack.value.a
    public x Z2(int i10) {
        x[] xVarArr = this.f339381a;
        return (i10 >= xVarArr.length || i10 < 0) ? k.z0() : xVarArr[i10];
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean b0() {
        return super.b0();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean c0() {
        return super.c0();
    }

    @Override // org.msgpack.value.x
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (xVar instanceof c) {
            return Arrays.equals(this.f339381a, ((c) xVar).f339381a);
        }
        if (!xVar.W()) {
            return false;
        }
        org.msgpack.value.a aVarT = xVar.t();
        if (size() != aVarT.size()) {
            return false;
        }
        Iterator<x> it = aVarT.iterator();
        for (int i10 = 0; i10 < this.f339381a.length; i10++) {
            if (!it.hasNext() || !this.f339381a[i10].equals(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // org.msgpack.value.a
    public x get(int i10) {
        return this.f339381a[i10];
    }

    @Override // org.msgpack.value.f, org.msgpack.value.a
    public List<x> h1() {
        return new a(this.f339381a);
    }

    public int hashCode() {
        int iHashCode = 1;
        int i10 = 0;
        while (true) {
            x[] xVarArr = this.f339381a;
            if (i10 >= xVarArr.length) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 31) + xVarArr[i10].hashCode();
            i10++;
        }
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.l i() {
        return super.i();
    }

    @Override // org.msgpack.value.x
    public z i1() {
        return z.ARRAY;
    }

    @Override // org.msgpack.value.f, org.msgpack.value.a, java.lang.Iterable
    public Iterator<x> iterator() {
        return new b(this.f339381a);
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.k l() {
        return super.l();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean m0() {
        return super.m0();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.g n() {
        return super.n();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ m p() {
        return super.p();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean p0() {
        return super.p0();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean q0() {
        return super.q0();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ p r() {
        return super.r();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.h s() {
        return super.s();
    }

    @Override // org.msgpack.value.a
    public int size() {
        return this.f339381a.length;
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public org.msgpack.value.f t() {
        return this;
    }

    public String toString() {
        if (this.f339381a.length == 0) {
            return v.f334777p;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        z0(sb2, this.f339381a[0]);
        for (int i10 = 1; i10 < this.f339381a.length; i10++) {
            sb2.append(",");
            z0(sb2, this.f339381a[i10]);
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // org.msgpack.value.impl.b
    /* JADX INFO: renamed from: u0 */
    public /* bridge */ /* synthetic */ org.msgpack.value.i V() {
        return super.V();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ o v() {
        return super.v();
    }

    @Override // org.msgpack.value.impl.b
    /* JADX INFO: renamed from: v0 */
    public /* bridge */ /* synthetic */ n Z() {
        return super.Z();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.j w() {
        return super.w();
    }
}
