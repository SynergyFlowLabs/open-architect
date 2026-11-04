package org.msgpack.value.impl;

import java.io.IOException;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.msgpack.value.m;
import org.msgpack.value.n;
import org.msgpack.value.o;
import org.msgpack.value.p;
import org.msgpack.value.x;
import org.msgpack.value.z;

/* JADX INFO: loaded from: classes14.dex */
public class j extends org.msgpack.value.impl.b implements org.msgpack.value.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final j f339407b = new j(new x[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x[] f339408a;

    private static class a implements Iterator<x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private x[] f339409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f339410b;

        public a(x[] xVarArr, int i10) {
            this.f339409a = xVarArr;
            this.f339410b = i10;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public x next() {
            int i10 = this.f339410b;
            x[] xVarArr = this.f339409a;
            if (i10 >= xVarArr.length) {
                throw new NoSuchElementException();
            }
            this.f339410b = i10 + 2;
            return xVarArr[i10];
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f339410b < this.f339409a.length;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static class b extends AbstractSet<Map.Entry<x, x>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x[] f339411a;

        b(x[] xVarArr) {
            this.f339411a = xVarArr;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<x, x>> iterator() {
            return new c(this.f339411a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f339411a.length / 2;
        }
    }

    private static class c implements Iterator<Map.Entry<x, x>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x[] f339412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f339413b = 0;

        c(x[] xVarArr) {
            this.f339412a = xVarArr;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<x, x> next() {
            int i10 = this.f339413b;
            x[] xVarArr = this.f339412a;
            if (i10 >= xVarArr.length) {
                throw new NoSuchElementException();
            }
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(xVarArr[i10], xVarArr[i10 + 1]);
            this.f339413b += 2;
            return simpleImmutableEntry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f339413b < this.f339412a.length;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static class d extends AbstractMap<x, x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x[] f339414a;

        public d(x[] xVarArr) {
            this.f339414a = xVarArr;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<x, x>> entrySet() {
            return new b(this.f339414a);
        }
    }

    private static class e extends AbstractSet<x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private x[] f339415a;

        e(x[] xVarArr) {
            this.f339415a = xVarArr;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<x> iterator() {
            return new a(this.f339415a, 0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f339415a.length / 2;
        }
    }

    private static class f extends AbstractCollection<x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private x[] f339416a;

        f(x[] xVarArr) {
            this.f339416a = xVarArr;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<x> iterator() {
            return new a(this.f339416a, 1);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f339416a.length / 2;
        }
    }

    public j(x[] xVarArr) {
        this.f339408a = xVarArr;
    }

    private static void A0(StringBuilder sb2, x xVar) {
        if (xVar.b0()) {
            sb2.append(xVar.O());
        } else {
            sb2.append(xVar.toString());
        }
    }

    public static org.msgpack.value.l C0() {
        return f339407b;
    }

    private static void z0(StringBuilder sb2, x xVar) {
        if (xVar.b0()) {
            sb2.append(xVar.O());
        } else {
            org.msgpack.value.impl.a.z0(sb2, xVar.toString());
        }
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean A() {
        return super.A();
    }

    @Override // org.msgpack.value.s
    public x[] B() {
        x[] xVarArr = this.f339408a;
        return (x[]) Arrays.copyOf(xVarArr, xVarArr.length);
    }

    @Override // org.msgpack.value.x
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public org.msgpack.value.l M() {
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
        jVar.y(this.f339408a.length / 2);
        int i10 = 0;
        int i11 = 2 << 0;
        while (true) {
            x[] xVarArr = this.f339408a;
            if (i10 >= xVarArr.length) {
                return;
            }
            xVarArr[i10].N(jVar);
            i10++;
        }
    }

    @Override // org.msgpack.value.x
    public String O() {
        if (this.f339408a.length == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        z0(sb2, this.f339408a[0]);
        sb2.append(":");
        sb2.append(this.f339408a[1].O());
        for (int i10 = 2; i10 < this.f339408a.length; i10 += 2) {
            sb2.append(",");
            z0(sb2, this.f339408a[i10]);
            sb2.append(":");
            sb2.append(this.f339408a[i10 + 1].O());
        }
        sb2.append("}");
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

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean b0() {
        return super.b0();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean c0() {
        return super.c0();
    }

    @Override // org.msgpack.value.s
    public Set<Map.Entry<x, x>> entrySet() {
        return new b(this.f339408a);
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
        if (!xVar.q0()) {
            return false;
        }
        return map().equals(xVar.i().map());
    }

    public int hashCode() {
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            x[] xVarArr = this.f339408a;
            if (i10 >= xVarArr.length) {
                return iHashCode;
            }
            iHashCode += xVarArr[i10].hashCode() ^ this.f339408a[i10 + 1].hashCode();
            i10 += 2;
        }
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public org.msgpack.value.l i() {
        return this;
    }

    @Override // org.msgpack.value.x
    public z i1() {
        return z.MAP;
    }

    @Override // org.msgpack.value.s
    public Set<x> keySet() {
        return new e(this.f339408a);
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.k l() {
        return super.l();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean m0() {
        return super.m0();
    }

    @Override // org.msgpack.value.s
    public Map<x, x> map() {
        return new d(this.f339408a);
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

    @Override // org.msgpack.value.s
    public int size() {
        return this.f339408a.length / 2;
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.f t() {
        return super.t();
    }

    public String toString() {
        if (this.f339408a.length == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        A0(sb2, this.f339408a[0]);
        sb2.append(":");
        A0(sb2, this.f339408a[1]);
        for (int i10 = 2; i10 < this.f339408a.length; i10 += 2) {
            sb2.append(",");
            A0(sb2, this.f339408a[i10]);
            sb2.append(":");
            A0(sb2, this.f339408a[i10 + 1]);
        }
        sb2.append("}");
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

    @Override // org.msgpack.value.s
    public Collection<x> values() {
        return new f(this.f339408a);
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.j w() {
        return super.w();
    }
}
