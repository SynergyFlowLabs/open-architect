package com.google.android.gms.internal.common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m extends h implements List, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final q f107979b = new j(o.f107983f, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f107980c = 0;

    m() {
    }

    public static m A(Object obj) {
        Object[] objArr = {obj};
        n.a(objArr, 1);
        return t(objArr, 1);
    }

    public static m B(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        n.a(objArr, 3);
        return t(objArr, 3);
    }

    public static m C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
        n.a(objArr, 6);
        return t(objArr, 6);
    }

    static m t(Object[] objArr, int i10) {
        return i10 == 0 ? o.f107983f : new o(objArr, i10);
    }

    public static m u(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return v((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return o.f107983f;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return A(next);
        }
        i iVar = new i(4);
        iVar.b(next);
        iVar.c(it);
        return iVar.d();
    }

    public static m v(Collection collection) {
        if (!(collection instanceof h)) {
            Object[] array = collection.toArray();
            int length = array.length;
            n.a(array, length);
            return t(array, length);
        }
        m mVarL = ((h) collection).l();
        if (!mVarL.n()) {
            return mVarL;
        }
        Object[] array2 = mVarL.toArray();
        return t(array2, array2.length);
    }

    public static m w() {
        return o.f107983f;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final q listIterator(int i10) {
        l0.b(i10, size(), FirebaseAnalytics.d.f120644b0);
        return isEmpty() ? f107979b : new j(this, i10);
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

    @Override // com.google.android.gms.internal.common.h
    int c(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = get(i11);
        }
        return size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
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
                if (!k0.a(get(i10), list.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (it2.hasNext() && k0.a(it.next(), it2.next())) {
            }
            return false;
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

    public int indexOf(Object obj) {
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

    @Override // com.google.android.gms.internal.common.h, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.common.h
    @Deprecated
    public final m l() {
        return this;
    }

    public int lastIndexOf(Object obj) {
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

    @Override // com.google.android.gms.internal.common.h
    /* JADX INFO: renamed from: m */
    public final p iterator() {
        return listIterator(0);
    }

    public m r() {
        return size() <= 1 ? this : new k(this);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public m subList(int i10, int i11) {
        l0.c(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? o.f107983f : new l(this, i10, i12);
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }
}
