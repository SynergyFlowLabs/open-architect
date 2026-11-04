package com.google.common.primitives;

import com.google.common.base.j0;
import com.google.common.base.r0;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
@f
@com.google.common.annotations.b(emulated = true)
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f119707a = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.google.common.annotations.c
    static final Pattern f119708b = j();

    @com.google.common.annotations.b
    private static class a extends AbstractList<Double> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f119709d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final double[] f119710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f119711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f119712c;

        a(double[] array) {
            this(array, 0, array.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Double get(int index) {
            j0.C(index, size());
            return Double.valueOf(this.f119710a[this.f119711b + index]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@fj.a Object target) {
            return (target instanceof Double) && d.m(this.f119710a, ((Double) target).doubleValue(), this.f119711b, this.f119712c) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Double set(int index, Double element) {
            j0.C(index, size());
            double[] dArr = this.f119710a;
            int i10 = this.f119711b;
            double d10 = dArr[i10 + index];
            dArr[i10 + index] = ((Double) j0.E(element)).doubleValue();
            return Double.valueOf(d10);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@fj.a Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof a)) {
                return super.equals(object);
            }
            a aVar = (a) object;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f119710a[this.f119711b + i10] != aVar.f119710a[aVar.f119711b + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iK = 1;
            for (int i10 = this.f119711b; i10 < this.f119712c; i10++) {
                iK = (iK * 31) + d.k(this.f119710a[i10]);
            }
            return iK;
        }

        double[] i() {
            return Arrays.copyOfRange(this.f119710a, this.f119711b, this.f119712c);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@fj.a Object target) {
            int iM;
            if (!(target instanceof Double) || (iM = d.m(this.f119710a, ((Double) target).doubleValue(), this.f119711b, this.f119712c)) < 0) {
                return -1;
            }
            return iM - this.f119711b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@fj.a Object target) {
            int iR;
            if (!(target instanceof Double) || (iR = d.r(this.f119710a, ((Double) target).doubleValue(), this.f119711b, this.f119712c)) < 0) {
                return -1;
            }
            return iR - this.f119711b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f119712c - this.f119711b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int fromIndex, int toIndex) {
            j0.f0(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.EMPTY_LIST;
            }
            double[] dArr = this.f119710a;
            int i10 = this.f119711b;
            return new a(dArr, fromIndex + i10, i10 + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 12);
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb2.append(this.f119710a[this.f119711b]);
            int i10 = this.f119711b;
            while (true) {
                i10++;
                if (i10 >= this.f119712c) {
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f119710a[i10]);
            }
        }

        a(double[] array, int start, int end) {
            this.f119710a = array;
            this.f119711b = start;
            this.f119712c = end;
        }
    }

    private static final class b extends com.google.common.base.i<String, Double> implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final com.google.common.base.i<String, Double> f119713c = new b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f119714d = 1;

        private b() {
        }

        private Object readResolve() {
            return f119713c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.i
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public String g(Double value) {
            return value.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.i
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Double h(String value) {
            return Double.valueOf(value);
        }

        public String toString() {
            return "Doubles.stringConverter()";
        }
    }

    private enum c implements Comparator<double[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compare(double[] left, double[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iCompare = Double.compare(left[i10], right[i10]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Doubles.lexicographicalComparator()";
        }
    }

    private d() {
    }

    public static void A(double[] array, int fromIndex, int toIndex) {
        j0.E(array);
        j0.f0(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        w(array, fromIndex, toIndex);
    }

    public static com.google.common.base.i<String, Double> B() {
        return b.f119713c;
    }

    public static double[] C(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).i();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        double[] dArr = new double[length];
        for (int i10 = 0; i10 < length; i10++) {
            dArr[i10] = ((Number) j0.E(array[i10])).doubleValue();
        }
        return dArr;
    }

    @com.google.common.annotations.c
    @fj.a
    public static Double D(String string) {
        if (f119708b.matcher(string).matches()) {
            try {
                return Double.valueOf(Double.parseDouble(string));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static List<Double> c(double... backingArray) {
        return backingArray.length == 0 ? Collections.EMPTY_LIST : new a(backingArray);
    }

    private static int d(long result) {
        int i10 = (int) result;
        j0.p(result == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", result);
        return i10;
    }

    @z7.m(replacement = "Double.compare(a, b)")
    public static int e(double a10, double b10) {
        return Double.compare(a10, b10);
    }

    public static double[] f(double[]... arrays) {
        long length = 0;
        for (double[] dArr : arrays) {
            length += (long) dArr.length;
        }
        double[] dArr2 = new double[d(length)];
        int length2 = 0;
        for (double[] dArr3 : arrays) {
            System.arraycopy(dArr3, 0, dArr2, length2, dArr3.length);
            length2 += dArr3.length;
        }
        return dArr2;
    }

    public static double g(double value, double min, double max) {
        if (min <= max) {
            return Math.min(Math.max(value, min), max);
        }
        throw new IllegalArgumentException(r0.e("min (%s) must be less than or equal to max (%s)", Double.valueOf(min), Double.valueOf(max)));
    }

    public static boolean h(double[] array, double target) {
        for (double d10 : array) {
            if (d10 == target) {
                return true;
            }
        }
        return false;
    }

    public static double[] i(double[] array, int minLength, int padding) {
        j0.k(minLength >= 0, "Invalid minLength: %s", minLength);
        j0.k(padding >= 0, "Invalid padding: %s", padding);
        if (array.length < minLength) {
            array = Arrays.copyOf(array, minLength + padding);
        }
        return array;
    }

    @com.google.common.annotations.c
    private static Pattern j() {
        return Pattern.compile(("[+-]?(?:NaN|Infinity|" + ("(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?") + "|" + ("0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?") + ")").replace("#", org.slf4j.h.f339615a3));
    }

    public static int k(double value) {
        return Double.valueOf(value).hashCode();
    }

    public static int l(double[] array, double target) {
        return m(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(double[] array, double target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public static int n(double[] array, double[] target) {
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

    public static boolean o(double value) {
        return Double.NEGATIVE_INFINITY < value && value < Double.POSITIVE_INFINITY;
    }

    public static String p(String separator, double... array) {
        j0.E(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(array.length * 12);
        sb2.append(array[0]);
        for (int i10 = 1; i10 < array.length; i10++) {
            sb2.append(separator);
            sb2.append(array[i10]);
        }
        return sb2.toString();
    }

    public static int q(double[] array, double target) {
        return r(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(double[] array, double target, int start, int end) {
        for (int i10 = end - 1; i10 >= start; i10--) {
            if (array[i10] == target) {
                return i10;
            }
        }
        return -1;
    }

    public static Comparator<double[]> s() {
        return c.INSTANCE;
    }

    @com.google.common.annotations.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double t(double... array) {
        j0.d(array.length > 0);
        double dMax = array[0];
        for (int i10 = 1; i10 < array.length; i10++) {
            dMax = Math.max(dMax, array[i10]);
        }
        return dMax;
    }

    @com.google.common.annotations.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double u(double... array) {
        j0.d(array.length > 0);
        double dMin = array[0];
        for (int i10 = 1; i10 < array.length; i10++) {
            dMin = Math.min(dMin, array[i10]);
        }
        return dMin;
    }

    public static void v(double[] array) {
        j0.E(array);
        w(array, 0, array.length);
    }

    public static void w(double[] array, int fromIndex, int toIndex) {
        j0.E(array);
        j0.f0(fromIndex, toIndex, array.length);
        for (int i10 = toIndex - 1; fromIndex < i10; i10--) {
            double d10 = array[fromIndex];
            array[fromIndex] = array[i10];
            array[i10] = d10;
            fromIndex++;
        }
    }

    public static void x(double[] array, int distance) {
        y(array, distance, 0, array.length);
    }

    public static void y(double[] array, int distance, int fromIndex, int toIndex) {
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
        w(array, fromIndex, i12);
        w(array, i12, toIndex);
        w(array, fromIndex, toIndex);
    }

    public static void z(double[] array) {
        j0.E(array);
        A(array, 0, array.length);
    }
}
