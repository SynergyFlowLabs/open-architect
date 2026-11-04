package com.google.common.primitives;

import com.google.common.base.j0;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
@f
@com.google.common.annotations.b
public final class a {

    /* JADX INFO: renamed from: com.google.common.primitives.a$a, reason: collision with other inner class name */
    @com.google.common.annotations.b
    private static class C1109a extends AbstractList<Boolean> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f119685d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean[] f119686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f119687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f119688c;

        C1109a(boolean[] array) {
            this(array, 0, array.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean get(int index) {
            j0.C(index, size());
            return Boolean.valueOf(this.f119686a[this.f119687b + index]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@fj.a Object target) {
            return (target instanceof Boolean) && a.m(this.f119686a, ((Boolean) target).booleanValue(), this.f119687b, this.f119688c) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean set(int index, Boolean element) {
            j0.C(index, size());
            boolean[] zArr = this.f119686a;
            int i10 = this.f119687b;
            boolean z10 = zArr[i10 + index];
            zArr[i10 + index] = ((Boolean) j0.E(element)).booleanValue();
            return Boolean.valueOf(z10);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@fj.a Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof C1109a)) {
                return super.equals(object);
            }
            C1109a c1109a = (C1109a) object;
            int size = size();
            if (c1109a.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f119686a[this.f119687b + i10] != c1109a.f119686a[c1109a.f119687b + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iK = 1;
            for (int i10 = this.f119687b; i10 < this.f119688c; i10++) {
                iK = (iK * 31) + a.k(this.f119686a[i10]);
            }
            return iK;
        }

        boolean[] i() {
            return Arrays.copyOfRange(this.f119686a, this.f119687b, this.f119688c);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@fj.a Object target) {
            int iM;
            if (!(target instanceof Boolean) || (iM = a.m(this.f119686a, ((Boolean) target).booleanValue(), this.f119687b, this.f119688c)) < 0) {
                return -1;
            }
            return iM - this.f119687b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@fj.a Object target) {
            int iQ;
            if (!(target instanceof Boolean) || (iQ = a.q(this.f119686a, ((Boolean) target).booleanValue(), this.f119687b, this.f119688c)) < 0) {
                return -1;
            }
            return iQ - this.f119687b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f119688c - this.f119687b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Boolean> subList(int fromIndex, int toIndex) {
            j0.f0(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.EMPTY_LIST;
            }
            boolean[] zArr = this.f119686a;
            int i10 = this.f119687b;
            return new C1109a(zArr, fromIndex + i10, i10 + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 7);
            sb2.append(this.f119686a[this.f119687b] ? "[true" : "[false");
            int i10 = this.f119687b;
            while (true) {
                i10++;
                if (i10 >= this.f119688c) {
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                    return sb2.toString();
                }
                sb2.append(this.f119686a[i10] ? ", true" : ", false");
            }
        }

        C1109a(boolean[] array, int start, int end) {
            this.f119686a = array;
            this.f119687b = start;
            this.f119688c = end;
        }
    }

    private enum b implements Comparator<Boolean> {
        TRUE_FIRST(1, "Booleans.trueFirst()"),
        FALSE_FIRST(-1, "Booleans.falseFirst()");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f119692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f119693b;

        b(int trueValue, String toString) {
            this.f119692a = trueValue;
            this.f119693b = toString;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compare(Boolean a10, Boolean b10) {
            return (b10.booleanValue() ? this.f119692a : 0) - (a10.booleanValue() ? this.f119692a : 0);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f119693b;
        }
    }

    private enum c implements Comparator<boolean[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compare(boolean[] left, boolean[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iCompare = Boolean.compare(left[i10], right[i10]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Booleans.lexicographicalComparator()";
        }
    }

    private a() {
    }

    public static List<Boolean> c(boolean... backingArray) {
        return backingArray.length == 0 ? Collections.EMPTY_LIST : new C1109a(backingArray);
    }

    private static int d(long result) {
        int i10 = (int) result;
        j0.p(result == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", result);
        return i10;
    }

    @z7.m(replacement = "Boolean.compare(a, b)")
    public static int e(boolean a10, boolean b10) {
        return Boolean.compare(a10, b10);
    }

    public static boolean[] f(boolean[]... arrays) {
        long length = 0;
        for (boolean[] zArr : arrays) {
            length += (long) zArr.length;
        }
        boolean[] zArr2 = new boolean[d(length)];
        int length2 = 0;
        for (boolean[] zArr3 : arrays) {
            System.arraycopy(zArr3, 0, zArr2, length2, zArr3.length);
            length2 += zArr3.length;
        }
        return zArr2;
    }

    public static boolean g(boolean[] array, boolean target) {
        for (boolean z10 : array) {
            if (z10 == target) {
                return true;
            }
        }
        return false;
    }

    public static int h(boolean... values) {
        int i10 = 0;
        for (boolean z10 : values) {
            if (z10) {
                i10++;
            }
        }
        return i10;
    }

    public static boolean[] i(boolean[] array, int minLength, int padding) {
        j0.k(minLength >= 0, "Invalid minLength: %s", minLength);
        j0.k(padding >= 0, "Invalid padding: %s", padding);
        if (array.length < minLength) {
            array = Arrays.copyOf(array, minLength + padding);
        }
        return array;
    }

    public static Comparator<Boolean> j() {
        return b.FALSE_FIRST;
    }

    public static int k(boolean value) {
        return value ? 1231 : 1237;
    }

    public static int l(boolean[] array, boolean target) {
        return m(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(boolean[] array, boolean target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public static int n(boolean[] array, boolean[] target) {
        j0.F(array, "array");
        j0.F(target, androidx.constraintlayout.core.motion.utils.v.a.M);
        if (target.length == 0) {
            return 0;
        }
        for (int i10 = 0; i10 < (array.length - target.length) + 1; i10++) {
            for (int i11 = 0; i11 < target.length; i11++) {
                if (array[i10 + i11] != target[i11]) {
                }
            }
            return i10;
        }
        return -1;
    }

    public static String o(String separator, boolean... array) {
        j0.E(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(array.length * 7);
        sb2.append(array[0]);
        for (int i10 = 1; i10 < array.length; i10++) {
            sb2.append(separator);
            sb2.append(array[i10]);
        }
        return sb2.toString();
    }

    public static int p(boolean[] array, boolean target) {
        return q(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int q(boolean[] array, boolean target, int start, int end) {
        for (int i10 = end - 1; i10 >= start; i10--) {
            if (array[i10] == target) {
                return i10;
            }
        }
        return -1;
    }

    public static Comparator<boolean[]> r() {
        return c.INSTANCE;
    }

    public static void s(boolean[] array) {
        j0.E(array);
        t(array, 0, array.length);
    }

    public static void t(boolean[] array, int fromIndex, int toIndex) {
        j0.E(array);
        j0.f0(fromIndex, toIndex, array.length);
        for (int i10 = toIndex - 1; fromIndex < i10; i10--) {
            boolean z10 = array[fromIndex];
            array[fromIndex] = array[i10];
            array[i10] = z10;
            fromIndex++;
        }
    }

    public static void u(boolean[] array, int distance) {
        v(array, distance, 0, array.length);
    }

    public static void v(boolean[] array, int distance, int fromIndex, int toIndex) {
        j0.E(array);
        j0.f0(fromIndex, toIndex, array.length);
        if (array.length <= 1) {
            return;
        }
        int i10 = toIndex - fromIndex;
        int i11 = (-distance) % i10;
        if (i11 < 0) {
            i11 += i10;
        }
        int i12 = i11 + fromIndex;
        if (i12 == fromIndex) {
            return;
        }
        t(array, fromIndex, i12);
        t(array, i12, toIndex);
        t(array, fromIndex, toIndex);
    }

    public static boolean[] w(Collection<Boolean> collection) {
        if (collection instanceof C1109a) {
            return ((C1109a) collection).i();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = ((Boolean) j0.E(array[i10])).booleanValue();
        }
        return zArr;
    }

    public static Comparator<Boolean> x() {
        return b.TRUE_FIRST;
    }
}
