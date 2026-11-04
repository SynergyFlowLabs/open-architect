package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class v2 extends z1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final v2 f109361f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient r1 f109362e;

    static {
        int i10 = r1.f109296c;
        f109361f = new v2(o2.f109239f, g2.f109126a);
    }

    v2(r1 r1Var, Comparator comparator) {
        super(comparator);
        this.f109362e = r1Var;
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    final z1 A(Object obj, boolean z10) {
        return L(0, J(obj, z10));
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    final z1 C(Object obj, boolean z10, Object obj2, boolean z11) {
        return D(obj, z10).A(obj2, z11);
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    final z1 D(Object obj, boolean z10) {
        return L(K(obj, z10), this.f109362e.size());
    }

    @Override // com.google.android.gms.internal.play_billing.z1, java.util.NavigableSet
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final a3 descendingIterator() {
        return this.f109362e.r().listIterator(0);
    }

    final int J(Object obj, boolean z10) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f109362e, obj, this.f109455c);
        if (iBinarySearch >= 0) {
            return z10 ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    final int K(Object obj, boolean z10) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f109362e, obj, this.f109455c);
        if (iBinarySearch >= 0) {
            return z10 ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    final v2 L(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == this.f109362e.size()) {
                return this;
            }
            i10 = 0;
        }
        if (i10 >= i11) {
            return z1.F(this.f109455c);
        }
        r1 r1Var = this.f109362e;
        return new v2(r1Var.subList(i10, i11), this.f109455c);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    final int c(Object[] objArr, int i10) {
        return this.f109362e.c(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.z1, java.util.NavigableSet
    @fj.a
    public final Object ceiling(Object obj) {
        r1 r1Var = this.f109362e;
        int iK = K(obj, true);
        if (iK == r1Var.size()) {
            return null;
        }
        return this.f109362e.get(iK);
    }

    @Override // com.google.android.gms.internal.play_billing.m1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@fj.a Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f109362e, obj, this.f109455c) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof f2) {
            collection = ((f2) collection).a();
        }
        if (!z2.a(this.f109455c, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        b3 b3VarListIterator = this.f109362e.listIterator(0);
        Iterator it = collection.iterator();
        if (!b3VarListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        E next2 = b3VarListIterator.next();
        while (true) {
            try {
                int iCompare = this.f109455c.compare(next2, next);
                if (iCompare < 0) {
                    if (!b3VarListIterator.hasNext()) {
                        return false;
                    }
                    next2 = b3VarListIterator.next();
                } else {
                    if (iCompare != 0) {
                        return false;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.y1, java.util.Collection, java.util.Set
    public final boolean equals(@fj.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.f109362e.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!z2.a(this.f109455c, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            b3 b3VarListIterator = this.f109362e.listIterator(0);
            while (b3VarListIterator.hasNext()) {
                E next = b3VarListIterator.next();
                Object next2 = it.next();
                if (next2 == null || this.f109455c.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.z1, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f109362e.get(0);
    }

    @Override // com.google.android.gms.internal.play_billing.z1, java.util.NavigableSet
    @fj.a
    public final Object floor(Object obj) {
        int iJ = J(obj, true) - 1;
        if (iJ == -1) {
            return null;
        }
        return this.f109362e.get(iJ);
    }

    @Override // com.google.android.gms.internal.play_billing.z1, java.util.NavigableSet
    @fj.a
    public final Object higher(Object obj) {
        r1 r1Var = this.f109362e;
        int iK = K(obj, false);
        if (iK == r1Var.size()) {
            return null;
        }
        return this.f109362e.get(iK);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    final int i() {
        return this.f109362e.i();
    }

    @Override // com.google.android.gms.internal.play_billing.z1, com.google.android.gms.internal.play_billing.y1, com.google.android.gms.internal.play_billing.m1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.f109362e.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    final int k() {
        return this.f109362e.k();
    }

    @Override // com.google.android.gms.internal.play_billing.y1, com.google.android.gms.internal.play_billing.m1
    public final r1 l() {
        return this.f109362e;
    }

    @Override // com.google.android.gms.internal.play_billing.z1, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        r1 r1Var = this.f109362e;
        return r1Var.get(r1Var.size() - 1);
    }

    @Override // com.google.android.gms.internal.play_billing.z1, java.util.NavigableSet
    @fj.a
    public final Object lower(Object obj) {
        int iJ = J(obj, false) - 1;
        if (iJ == -1) {
            return null;
        }
        return this.f109362e.get(iJ);
    }

    @Override // com.google.android.gms.internal.play_billing.z1, com.google.android.gms.internal.play_billing.y1, com.google.android.gms.internal.play_billing.m1
    /* JADX INFO: renamed from: m */
    public final a3 iterator() {
        return this.f109362e.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    final boolean n() {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    @fj.a
    final Object[] p() {
        return this.f109362e.p();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f109362e.size();
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    final z1 w() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f109455c);
        return isEmpty() ? z1.F(comparatorReverseOrder) : new v2(this.f109362e.r(), comparatorReverseOrder);
    }
}
