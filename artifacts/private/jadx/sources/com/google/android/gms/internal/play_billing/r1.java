package com.google.android.gms.internal.play_billing;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r1 extends m1 implements List, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b3 f109295b = new o1(o2.f109239f, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f109296c = 0;

    r1() {
    }

    public static Collector B() {
        return x0.a();
    }

    static r1 t(Object[] objArr, int i10) {
        return i10 == 0 ? o2.f109239f : new o2(objArr, i10);
    }

    public static r1 u(Collection collection) {
        if (!(collection instanceof m1)) {
            Object[] array = collection.toArray();
            int length = array.length;
            h2.b(array, length);
            return t(array, length);
        }
        r1 r1VarL = ((m1) collection).l();
        if (!r1VarL.n()) {
            return r1VarL;
        }
        Object[] array2 = r1VarL.toArray();
        return t(array2, array2.length);
    }

    public static r1 v() {
        return o2.f109239f;
    }

    public static r1 w(Object obj) {
        Object[] objArr = {obj};
        h2.b(objArr, 1);
        return t(objArr, 1);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final b3 listIterator(int i10) {
        g0.b(i10, size(), FirebaseAnalytics.d.f120644b0);
        return isEmpty() ? f109295b : new o1(this, i10);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    int c(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = get(i11);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.play_billing.m1, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@fj.a Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@fj.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i10 = 0; i10 < size; i10++) {
                if (!f0.a(get(i10), list.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !f0.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode = (iHashCode * 31) + get(i10).hashCode();
        }
        return iHashCode;
    }

    public int indexOf(@fj.a Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.m1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    @Deprecated
    public final r1 l() {
        return this;
    }

    public int lastIndexOf(@fj.a Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    /* JADX INFO: renamed from: m */
    public final a3 iterator() {
        return listIterator(0);
    }

    public r1 r() {
        return size() <= 1 ? this : new p1(this);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public r1 subList(int i10, int i11) {
        g0.e(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? o2.f109239f : new q1(this, i10, i12);
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }
}
