package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y1 extends m1 implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.a
    private transient r1 f109442b;

    y1() {
    }

    static int r(int i10) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static y1 v(int i10, Object... objArr) {
        if (i10 == 0) {
            return u2.f109345i;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new x2(obj);
        }
        int iR = r(i10);
        Object[] objArr2 = new Object[iR];
        int i11 = iR - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            h2.a(obj2, i14);
            int iHashCode = obj2.hashCode();
            int iA = j1.a(iHashCode);
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
            Objects.requireNonNull(obj4);
            return new x2(obj4);
        }
        if (r(i13) < iR / 2) {
            return v(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new u2(objArr, i12, objArr2, i11, i13);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@fj.a Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof y1) && u() && ((y1) obj).u() && hashCode() != obj.hashCode()) {
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
        return w2.a(this);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public r1 l() {
        r1 r1Var = this.f109442b;
        if (r1Var != null) {
            return r1Var;
        }
        r1 r1VarS = s();
        this.f109442b = r1VarS;
        return r1VarS;
    }

    @Override // com.google.android.gms.internal.play_billing.m1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public abstract a3 iterator();

    r1 s() {
        Object[] array = toArray();
        int i10 = r1.f109296c;
        return r1.t(array, array.length);
    }

    boolean u() {
        return false;
    }
}
