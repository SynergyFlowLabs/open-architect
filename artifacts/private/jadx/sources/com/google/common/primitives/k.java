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
public final class k implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final k f119740d = new k(new long[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f119741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient int f119742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f119743c;

    static class b extends AbstractList<Long> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k f119744a;

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Long get(int index) {
            return Long.valueOf(this.f119744a.k(index));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@fj.a Object target) {
            return indexOf(target) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@fj.a Object object) {
            if (object instanceof b) {
                return this.f119744a.equals(((b) object).f119744a);
            }
            if (!(object instanceof List)) {
                return false;
            }
            List list = (List) object;
            if (size() != list.size()) {
                return false;
            }
            int i10 = this.f119744a.f119742b;
            for (Object obj : list) {
                if (obj instanceof Long) {
                    int i11 = i10 + 1;
                    if (this.f119744a.f119741a[i10] == ((Long) obj).longValue()) {
                        i10 = i11;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.f119744a.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@fj.a Object target) {
            if (target instanceof Long) {
                return this.f119744a.l(((Long) target).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@fj.a Object target) {
            if (target instanceof Long) {
                return this.f119744a.o(((Long) target).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f119744a.p();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int fromIndex, int toIndex) {
            return this.f119744a.y(fromIndex, toIndex).d();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f119744a.toString();
        }

        private b(k parent) {
            this.f119744a = parent;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long[] f119745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f119746b = 0;

        c(int initialCapacity) {
            this.f119745a = new long[initialCapacity];
        }

        private void g(int numberToAdd) {
            int i10 = this.f119746b + numberToAdd;
            long[] jArr = this.f119745a;
            if (i10 > jArr.length) {
                this.f119745a = Arrays.copyOf(jArr, h(jArr.length, i10));
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
        public c a(long value) {
            g(1);
            long[] jArr = this.f119745a;
            int i10 = this.f119746b;
            jArr[i10] = value;
            this.f119746b = i10 + 1;
            return this;
        }

        @z7.a
        public c b(k values) {
            g(values.p());
            System.arraycopy(values.f119741a, values.f119742b, this.f119745a, this.f119746b, values.p());
            this.f119746b += values.p();
            return this;
        }

        @z7.a
        public c c(Iterable<Long> values) {
            if (values instanceof Collection) {
                return d((Collection) values);
            }
            Iterator<Long> it = values.iterator();
            while (it.hasNext()) {
                a(it.next().longValue());
            }
            return this;
        }

        @z7.a
        public c d(Collection<Long> values) {
            g(values.size());
            for (Long l10 : values) {
                long[] jArr = this.f119745a;
                int i10 = this.f119746b;
                this.f119746b = i10 + 1;
                jArr[i10] = l10.longValue();
            }
            return this;
        }

        @z7.a
        public c e(long[] values) {
            g(values.length);
            System.arraycopy(values, 0, this.f119745a, this.f119746b, values.length);
            this.f119746b += values.length;
            return this;
        }

        public k f() {
            if (this.f119746b == 0) {
                return k.f119740d;
            }
            return new k(this.f119745a, 0, this.f119746b);
        }
    }

    public static c e() {
        return new c(10);
    }

    public static c f(int initialCapacity) {
        j0.k(initialCapacity >= 0, "Invalid initialCapacity: %s", initialCapacity);
        return new c(initialCapacity);
    }

    public static k h(Iterable<Long> values) {
        return values instanceof Collection ? i((Collection) values) : e().c(values).f();
    }

    public static k i(Collection<Long> values) {
        return values.isEmpty() ? f119740d : new k(n.C(values));
    }

    public static k j(long[] values) {
        return values.length == 0 ? f119740d : new k(Arrays.copyOf(values, values.length));
    }

    private boolean n() {
        return this.f119742b > 0 || this.f119743c < this.f119741a.length;
    }

    public static k q() {
        return f119740d;
    }

    public static k r(long e10) {
        return new k(new long[]{e10});
    }

    public static k s(long e10, long e11) {
        return new k(new long[]{e10, e11});
    }

    public static k t(long e10, long e11, long e12) {
        return new k(new long[]{e10, e11, e12});
    }

    public static k u(long e10, long e11, long e12, long e13) {
        return new k(new long[]{e10, e11, e12, e13});
    }

    public static k v(long e10, long e11, long e12, long e13, long e14) {
        return new k(new long[]{e10, e11, e12, e13, e14});
    }

    public static k w(long e10, long e11, long e12, long e13, long e14, long e15) {
        return new k(new long[]{e10, e11, e12, e13, e14, e15});
    }

    public static k x(long first, long... rest) {
        j0.e(rest.length <= 2147483646, "the total number of elements must fit in an int");
        long[] jArr = new long[rest.length + 1];
        jArr[0] = first;
        System.arraycopy(rest, 0, jArr, 1, rest.length);
        return new k(jArr);
    }

    public k A() {
        return n() ? new k(z()) : this;
    }

    public List<Long> d() {
        return new b();
    }

    public boolean equals(@fj.a Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof k)) {
            return false;
        }
        k kVar = (k) object;
        if (p() != kVar.p()) {
            return false;
        }
        for (int i10 = 0; i10 < p(); i10++) {
            if (k(i10) != kVar.k(i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean g(long target) {
        return l(target) >= 0;
    }

    public int hashCode() {
        int iL = 1;
        for (int i10 = this.f119742b; i10 < this.f119743c; i10++) {
            iL = (iL * 31) + n.l(this.f119741a[i10]);
        }
        return iL;
    }

    public long k(int index) {
        j0.C(index, p());
        return this.f119741a[this.f119742b + index];
    }

    public int l(long target) {
        for (int i10 = this.f119742b; i10 < this.f119743c; i10++) {
            if (this.f119741a[i10] == target) {
                return i10 - this.f119742b;
            }
        }
        return -1;
    }

    public boolean m() {
        if (this.f119743c != this.f119742b) {
            return false;
        }
        int i10 = 2 | 1;
        return true;
    }

    public int o(long target) {
        int i10;
        int i11 = this.f119743c;
        do {
            i11--;
            i10 = this.f119742b;
            if (i11 < i10) {
                return -1;
            }
        } while (this.f119741a[i11] != target);
        return i11 - i10;
    }

    public int p() {
        return this.f119743c - this.f119742b;
    }

    Object readResolve() {
        return m() ? f119740d : this;
    }

    public String toString() {
        if (m()) {
            return okhttp3.v.f334777p;
        }
        StringBuilder sb2 = new StringBuilder(p() * 5);
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb2.append(this.f119741a[this.f119742b]);
        int i10 = this.f119742b;
        while (true) {
            i10++;
            if (i10 >= this.f119743c) {
                sb2.append(AbstractJsonLexerKt.END_LIST);
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.f119741a[i10]);
        }
    }

    Object writeReplace() {
        return A();
    }

    public k y(int startIndex, int endIndex) {
        j0.f0(startIndex, endIndex, p());
        if (startIndex == endIndex) {
            return f119740d;
        }
        long[] jArr = this.f119741a;
        int i10 = this.f119742b;
        return new k(jArr, startIndex + i10, i10 + endIndex);
    }

    public long[] z() {
        return Arrays.copyOfRange(this.f119741a, this.f119742b, this.f119743c);
    }

    private k(long[] array) {
        this(array, 0, array.length);
    }

    private k(long[] array, int start, int end) {
        this.f119741a = array;
        this.f119742b = start;
        this.f119743c = end;
    }
}
