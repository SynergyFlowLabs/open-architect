package com.google.common.primitives;

import com.google.common.base.j0;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
@f
@z7.j
@com.google.common.annotations.b
public final class j implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final j f119733d = new j(new int[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f119734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient int f119735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f119736c;

    static class b extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j f119737a;

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer get(int index) {
            return Integer.valueOf(this.f119737a.k(index));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@fj.a Object target) {
            return indexOf(target) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@fj.a Object object) {
            if (object instanceof b) {
                return this.f119737a.equals(((b) object).f119737a);
            }
            if (!(object instanceof List)) {
                return false;
            }
            List list = (List) object;
            if (size() != list.size()) {
                return false;
            }
            int i10 = this.f119737a.f119735b;
            for (Object obj : list) {
                if (obj instanceof Integer) {
                    int i11 = i10 + 1;
                    if (this.f119737a.f119734a[i10] == ((Integer) obj).intValue()) {
                        i10 = i11;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.f119737a.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@fj.a Object target) {
            if (target instanceof Integer) {
                return this.f119737a.l(((Integer) target).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@fj.a Object target) {
            if (target instanceof Integer) {
                return this.f119737a.o(((Integer) target).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f119737a.p();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int fromIndex, int toIndex) {
            return this.f119737a.y(fromIndex, toIndex).d();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f119737a.toString();
        }

        private b(j parent) {
            this.f119737a = parent;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int[] f119738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f119739b = 0;

        c(int initialCapacity) {
            this.f119738a = new int[initialCapacity];
        }

        private void g(int numberToAdd) {
            int i10 = this.f119739b + numberToAdd;
            int[] iArr = this.f119738a;
            if (i10 > iArr.length) {
                this.f119738a = Arrays.copyOf(iArr, h(iArr.length, i10));
            }
        }

        private static int h(int oldCapacity, int minCapacity) {
            if (minCapacity < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = oldCapacity + (oldCapacity >> 1) + 1;
            if (iHighestOneBit < minCapacity) {
                iHighestOneBit = Integer.highestOneBit(minCapacity - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        @z7.a
        public c a(int value) {
            g(1);
            int[] iArr = this.f119738a;
            int i10 = this.f119739b;
            iArr[i10] = value;
            this.f119739b = i10 + 1;
            return this;
        }

        @z7.a
        public c b(j values) {
            g(values.p());
            System.arraycopy(values.f119734a, values.f119735b, this.f119738a, this.f119739b, values.p());
            this.f119739b += values.p();
            return this;
        }

        @z7.a
        public c c(Iterable<Integer> values) {
            if (values instanceof Collection) {
                return d((Collection) values);
            }
            Iterator<Integer> it = values.iterator();
            while (it.hasNext()) {
                a(it.next().intValue());
            }
            return this;
        }

        @z7.a
        public c d(Collection<Integer> values) {
            g(values.size());
            for (Integer num : values) {
                int[] iArr = this.f119738a;
                int i10 = this.f119739b;
                this.f119739b = i10 + 1;
                iArr[i10] = num.intValue();
            }
            return this;
        }

        @z7.a
        public c e(int[] values) {
            g(values.length);
            System.arraycopy(values, 0, this.f119738a, this.f119739b, values.length);
            this.f119739b += values.length;
            return this;
        }

        public j f() {
            if (this.f119739b == 0) {
                return j.f119733d;
            }
            return new j(this.f119738a, 0, this.f119739b);
        }
    }

    public static c e() {
        return new c(10);
    }

    public static c f(int initialCapacity) {
        j0.k(initialCapacity >= 0, "Invalid initialCapacity: %s", initialCapacity);
        return new c(initialCapacity);
    }

    public static j h(Iterable<Integer> values) {
        return values instanceof Collection ? i((Collection) values) : e().c(values).f();
    }

    public static j i(Collection<Integer> values) {
        return values.isEmpty() ? f119733d : new j(l.E(values));
    }

    public static j j(int[] values) {
        return values.length == 0 ? f119733d : new j(Arrays.copyOf(values, values.length));
    }

    private boolean n() {
        return this.f119735b > 0 || this.f119736c < this.f119734a.length;
    }

    public static j q() {
        return f119733d;
    }

    public static j r(int e10) {
        return new j(new int[]{e10});
    }

    public static j s(int e10, int e11) {
        return new j(new int[]{e10, e11});
    }

    public static j t(int e10, int e11, int e12) {
        return new j(new int[]{e10, e11, e12});
    }

    public static j u(int e10, int e11, int e12, int e13) {
        return new j(new int[]{e10, e11, e12, e13});
    }

    public static j v(int e10, int e11, int e12, int e13, int e14) {
        return new j(new int[]{e10, e11, e12, e13, e14});
    }

    public static j w(int e10, int e11, int e12, int e13, int e14, int e15) {
        return new j(new int[]{e10, e11, e12, e13, e14, e15});
    }

    public static j x(int first, int... rest) {
        j0.e(rest.length <= 2147483646, "the total number of elements must fit in an int");
        int[] iArr = new int[rest.length + 1];
        iArr[0] = first;
        System.arraycopy(rest, 0, iArr, 1, rest.length);
        return new j(iArr);
    }

    public j A() {
        return n() ? new j(z()) : this;
    }

    public List<Integer> d() {
        return new b();
    }

    public boolean equals(@fj.a Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof j)) {
            return false;
        }
        j jVar = (j) object;
        if (p() != jVar.p()) {
            return false;
        }
        for (int i10 = 0; i10 < p(); i10++) {
            if (k(i10) != jVar.k(i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean g(int target) {
        return l(target) >= 0;
    }

    public int hashCode() {
        int iM = 1;
        for (int i10 = this.f119735b; i10 < this.f119736c; i10++) {
            iM = (iM * 31) + l.m(this.f119734a[i10]);
        }
        return iM;
    }

    public int k(int index) {
        j0.C(index, p());
        return this.f119734a[this.f119735b + index];
    }

    public int l(int target) {
        for (int i10 = this.f119735b; i10 < this.f119736c; i10++) {
            if (this.f119734a[i10] == target) {
                return i10 - this.f119735b;
            }
        }
        return -1;
    }

    public boolean m() {
        return this.f119736c == this.f119735b;
    }

    public int o(int target) {
        int i10;
        int i11 = this.f119736c;
        do {
            i11--;
            i10 = this.f119735b;
            if (i11 < i10) {
                return -1;
            }
        } while (this.f119734a[i11] != target);
        return i11 - i10;
    }

    public int p() {
        return this.f119736c - this.f119735b;
    }

    Object readResolve() {
        return m() ? f119733d : this;
    }

    public String toString() {
        if (m()) {
            return okhttp3.v.f334777p;
        }
        StringBuilder sb2 = new StringBuilder(p() * 5);
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb2.append(this.f119734a[this.f119735b]);
        int i10 = this.f119735b;
        while (true) {
            i10++;
            if (i10 >= this.f119736c) {
                sb2.append(AbstractJsonLexerKt.END_LIST);
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.f119734a[i10]);
        }
    }

    Object writeReplace() {
        return A();
    }

    public j y(int startIndex, int endIndex) {
        j0.f0(startIndex, endIndex, p());
        if (startIndex == endIndex) {
            return f119733d;
        }
        int[] iArr = this.f119734a;
        int i10 = this.f119735b;
        return new j(iArr, startIndex + i10, i10 + endIndex);
    }

    public int[] z() {
        return Arrays.copyOfRange(this.f119734a, this.f119735b, this.f119736c);
    }

    private j(int[] array) {
        this(array, 0, array.length);
    }

    private j(int[] array, int start, int end) {
        this.f119734a = array;
        this.f119735b = start;
        this.f119736c = end;
    }
}
