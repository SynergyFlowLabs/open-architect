package com.google.android.gms.internal.fido;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v extends r implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.a
    private transient u f108065b;

    v() {
    }

    static int n(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static v s(Object obj, Object obj2) {
        return u(2, obj, obj2);
    }

    private static v u(int i10, Object... objArr) {
        if (i10 == 0) {
            return y.f108072i;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new z(obj);
        }
        int iN = n(i10);
        Object[] objArr2 = new Object[iN];
        int i11 = iN - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                throw new NullPointerException("at index " + i14);
            }
            int iHashCode = obj2.hashCode();
            int iA = q.a(iHashCode);
            while (true) {
                int i15 = iA & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iA++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new z(obj4);
        }
        if (n(i13) < iN / 2) {
            return u(i13, objArr);
        }
        if (i13 <= 0) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new y(objArr, i12, objArr2, i11, i13);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@fj.a Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof v) && t() && ((v) obj).t() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.fido.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: l */
    public abstract a0 iterator();

    public final u p() {
        u uVar = this.f108065b;
        if (uVar != null) {
            return uVar;
        }
        u uVarR = r();
        this.f108065b = uVarR;
        return uVarR;
    }

    u r() {
        Object[] array = toArray();
        int i10 = u.f108064c;
        return u.p(array, array.length);
    }

    boolean t() {
        return false;
    }
}
