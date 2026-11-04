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
public final class i implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final i f119726d = new i(new double[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double[] f119727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient int f119728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f119729c;

    static class b extends AbstractList<Double> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f119730a;

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Double get(int index) {
            return Double.valueOf(this.f119730a.m(index));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@fj.a Object target) {
            return indexOf(target) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@fj.a Object object) {
            if (object instanceof b) {
                return this.f119730a.equals(((b) object).f119730a);
            }
            if (!(object instanceof List)) {
                return false;
            }
            List list = (List) object;
            if (size() != list.size()) {
                return false;
            }
            int i10 = this.f119730a.f119728b;
            for (Object obj : list) {
                if (obj instanceof Double) {
                    int i11 = i10 + 1;
                    if (i.e(this.f119730a.f119727a[i10], ((Double) obj).doubleValue())) {
                        i10 = i11;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.f119730a.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@fj.a Object target) {
            if (target instanceof Double) {
                return this.f119730a.n(((Double) target).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@fj.a Object target) {
            if (target instanceof Double) {
                return this.f119730a.q(((Double) target).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f119730a.r();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int fromIndex, int toIndex) {
            return this.f119730a.A(fromIndex, toIndex).f();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f119730a.toString();
        }

        private b(i parent) {
            this.f119730a = parent;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private double[] f119731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f119732b = 0;

        c(int initialCapacity) {
            this.f119731a = new double[initialCapacity];
        }

        private void g(int numberToAdd) {
            int i10 = this.f119732b + numberToAdd;
            double[] dArr = this.f119731a;
            if (i10 > dArr.length) {
                this.f119731a = Arrays.copyOf(dArr, h(dArr.length, i10));
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
                iHighestOneBit = Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        @z7.a
        public c a(double value) {
            g(1);
            double[] dArr = this.f119731a;
            int i10 = this.f119732b;
            dArr[i10] = value;
            this.f119732b = i10 + 1;
            return this;
        }

        @z7.a
        public c b(i values) {
            g(values.r());
            System.arraycopy(values.f119727a, values.f119728b, this.f119731a, this.f119732b, values.r());
            this.f119732b += values.r();
            return this;
        }

        @z7.a
        public c c(Iterable<Double> values) {
            if (values instanceof Collection) {
                return d((Collection) values);
            }
            Iterator<Double> it = values.iterator();
            while (it.hasNext()) {
                a(it.next().doubleValue());
            }
            return this;
        }

        @z7.a
        public c d(Collection<Double> values) {
            g(values.size());
            for (Double d10 : values) {
                double[] dArr = this.f119731a;
                int i10 = this.f119732b;
                this.f119732b = i10 + 1;
                dArr[i10] = d10.doubleValue();
            }
            return this;
        }

        @z7.a
        public c e(double[] values) {
            g(values.length);
            int i10 = 2 | 0;
            System.arraycopy(values, 0, this.f119731a, this.f119732b, values.length);
            this.f119732b += values.length;
            return this;
        }

        public i f() {
            if (this.f119732b == 0) {
                return i.f119726d;
            }
            return new i(this.f119731a, 0, this.f119732b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(double a10, double b10) {
        return Double.doubleToLongBits(a10) == Double.doubleToLongBits(b10);
    }

    public static c g() {
        return new c(10);
    }

    public static c h(int initialCapacity) {
        j0.k(initialCapacity >= 0, "Invalid initialCapacity: %s", initialCapacity);
        return new c(initialCapacity);
    }

    public static i j(Iterable<Double> values) {
        return values instanceof Collection ? k((Collection) values) : g().c(values).f();
    }

    public static i k(Collection<Double> values) {
        return values.isEmpty() ? f119726d : new i(d.C(values));
    }

    public static i l(double[] values) {
        return values.length == 0 ? f119726d : new i(Arrays.copyOf(values, values.length));
    }

    private boolean p() {
        return this.f119728b > 0 || this.f119729c < this.f119727a.length;
    }

    public static i s() {
        return f119726d;
    }

    public static i t(double e10) {
        return new i(new double[]{e10});
    }

    public static i u(double e10, double e11) {
        return new i(new double[]{e10, e11});
    }

    public static i v(double e10, double e11, double e12) {
        return new i(new double[]{e10, e11, e12});
    }

    public static i w(double e10, double e11, double e12, double e13) {
        return new i(new double[]{e10, e11, e12, e13});
    }

    public static i x(double e10, double e11, double e12, double e13, double e14) {
        int i10 = 5 >> 4;
        return new i(new double[]{e10, e11, e12, e13, e14});
    }

    public static i y(double e10, double e11, double e12, double e13, double e14, double e15) {
        return new i(new double[]{e10, e11, e12, e13, e14, e15});
    }

    public static i z(double first, double... rest) {
        j0.e(rest.length <= 2147483646, "the total number of elements must fit in an int");
        double[] dArr = new double[rest.length + 1];
        dArr[0] = first;
        System.arraycopy(rest, 0, dArr, 1, rest.length);
        return new i(dArr);
    }

    public i A(int startIndex, int endIndex) {
        j0.f0(startIndex, endIndex, r());
        if (startIndex == endIndex) {
            return f119726d;
        }
        double[] dArr = this.f119727a;
        int i10 = this.f119728b;
        return new i(dArr, startIndex + i10, i10 + endIndex);
    }

    public double[] B() {
        return Arrays.copyOfRange(this.f119727a, this.f119728b, this.f119729c);
    }

    public i C() {
        return p() ? new i(B()) : this;
    }

    public boolean equals(@fj.a Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof i)) {
            return false;
        }
        i iVar = (i) object;
        if (r() != iVar.r()) {
            return false;
        }
        for (int i10 = 0; i10 < r(); i10++) {
            if (!e(m(i10), iVar.m(i10))) {
                return false;
            }
        }
        return true;
    }

    public List<Double> f() {
        return new b();
    }

    public int hashCode() {
        int iK = 1;
        for (int i10 = this.f119728b; i10 < this.f119729c; i10++) {
            iK = (iK * 31) + d.k(this.f119727a[i10]);
        }
        return iK;
    }

    public boolean i(double target) {
        return n(target) >= 0;
    }

    public double m(int index) {
        j0.C(index, r());
        return this.f119727a[this.f119728b + index];
    }

    public int n(double target) {
        for (int i10 = this.f119728b; i10 < this.f119729c; i10++) {
            if (e(this.f119727a[i10], target)) {
                return i10 - this.f119728b;
            }
        }
        return -1;
    }

    public boolean o() {
        return this.f119729c == this.f119728b;
    }

    public int q(double target) {
        int i10 = this.f119729c;
        do {
            i10--;
            if (i10 < this.f119728b) {
                return -1;
            }
        } while (!e(this.f119727a[i10], target));
        return i10 - this.f119728b;
    }

    public int r() {
        return this.f119729c - this.f119728b;
    }

    Object readResolve() {
        return o() ? f119726d : this;
    }

    public String toString() {
        if (o()) {
            return okhttp3.v.f334777p;
        }
        StringBuilder sb2 = new StringBuilder(r() * 5);
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb2.append(this.f119727a[this.f119728b]);
        int i10 = this.f119728b;
        while (true) {
            i10++;
            if (i10 >= this.f119729c) {
                sb2.append(AbstractJsonLexerKt.END_LIST);
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.f119727a[i10]);
        }
    }

    Object writeReplace() {
        return C();
    }

    private i(double[] array) {
        this(array, 0, array.length);
    }

    private i(double[] array, int start, int end) {
        this.f119727a = array;
        this.f119728b = start;
        this.f119729c = end;
    }
}
