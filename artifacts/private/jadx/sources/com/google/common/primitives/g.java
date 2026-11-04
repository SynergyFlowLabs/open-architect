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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
@f
@com.google.common.annotations.b(emulated = true)
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f119717a = 4;

    @com.google.common.annotations.b
    private static class a extends AbstractList<Float> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f119718d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float[] f119719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f119720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f119721c;

        a(float[] array) {
            this(array, 0, array.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Float get(int index) {
            j0.C(index, size());
            return Float.valueOf(this.f119719a[this.f119720b + index]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@fj.a Object target) {
            return (target instanceof Float) && g.l(this.f119719a, ((Float) target).floatValue(), this.f119720b, this.f119721c) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Float set(int index, Float element) {
            j0.C(index, size());
            float[] fArr = this.f119719a;
            int i10 = this.f119720b;
            float f10 = fArr[i10 + index];
            fArr[i10 + index] = ((Float) j0.E(element)).floatValue();
            return Float.valueOf(f10);
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
                if (this.f119719a[this.f119720b + i10] != aVar.f119719a[aVar.f119720b + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iJ = 1;
            for (int i10 = this.f119720b; i10 < this.f119721c; i10++) {
                iJ = (iJ * 31) + g.j(this.f119719a[i10]);
            }
            return iJ;
        }

        float[] i() {
            return Arrays.copyOfRange(this.f119719a, this.f119720b, this.f119721c);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@fj.a Object target) {
            int iL;
            if (!(target instanceof Float) || (iL = g.l(this.f119719a, ((Float) target).floatValue(), this.f119720b, this.f119721c)) < 0) {
                return -1;
            }
            return iL - this.f119720b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@fj.a Object target) {
            int iQ;
            if (!(target instanceof Float) || (iQ = g.q(this.f119719a, ((Float) target).floatValue(), this.f119720b, this.f119721c)) < 0) {
                return -1;
            }
            return iQ - this.f119720b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f119721c - this.f119720b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Float> subList(int fromIndex, int toIndex) {
            j0.f0(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.EMPTY_LIST;
            }
            float[] fArr = this.f119719a;
            int i10 = this.f119720b;
            return new a(fArr, fromIndex + i10, i10 + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 12);
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb2.append(this.f119719a[this.f119720b]);
            int i10 = this.f119720b;
            while (true) {
                i10++;
                if (i10 >= this.f119721c) {
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f119719a[i10]);
            }
        }

        a(float[] array, int start, int end) {
            this.f119719a = array;
            this.f119720b = start;
            this.f119721c = end;
        }
    }

    private static final class b extends com.google.common.base.i<String, Float> implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final com.google.common.base.i<String, Float> f119722c = new b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f119723d = 1;

        private b() {
        }

        private Object readResolve() {
            return f119722c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.i
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public String g(Float value) {
            return value.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.i
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Float h(String value) {
            return Float.valueOf(value);
        }

        public String toString() {
            return "Floats.stringConverter()";
        }
    }

    private enum c implements Comparator<float[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compare(float[] left, float[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iCompare = Float.compare(left[i10], right[i10]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Floats.lexicographicalComparator()";
        }
    }

    private g() {
    }

    public static com.google.common.base.i<String, Float> A() {
        return b.f119722c;
    }

    public static float[] B(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).i();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i10 = 0; i10 < length; i10++) {
            fArr[i10] = ((Number) j0.E(array[i10])).floatValue();
        }
        return fArr;
    }

    @com.google.common.annotations.c
    @fj.a
    public static Float C(String string) {
        if (d.f119708b.matcher(string).matches()) {
            try {
                return Float.valueOf(Float.parseFloat(string));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static List<Float> c(float... backingArray) {
        return backingArray.length == 0 ? Collections.EMPTY_LIST : new a(backingArray);
    }

    private static int d(long result) {
        int i10 = (int) result;
        j0.p(result == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", result);
        return i10;
    }

    @z7.m(replacement = "Float.compare(a, b)")
    public static int e(float a10, float b10) {
        return Float.compare(a10, b10);
    }

    public static float[] f(float[]... arrays) {
        long length = 0;
        for (float[] fArr : arrays) {
            length += (long) fArr.length;
        }
        float[] fArr2 = new float[d(length)];
        int length2 = 0;
        for (float[] fArr3 : arrays) {
            System.arraycopy(fArr3, 0, fArr2, length2, fArr3.length);
            length2 += fArr3.length;
        }
        return fArr2;
    }

    public static float g(float value, float min, float max) {
        if (min <= max) {
            return Math.min(Math.max(value, min), max);
        }
        throw new IllegalArgumentException(r0.e("min (%s) must be less than or equal to max (%s)", Float.valueOf(min), Float.valueOf(max)));
    }

    public static boolean h(float[] array, float target) {
        for (float f10 : array) {
            if (f10 == target) {
                return true;
            }
        }
        return false;
    }

    public static float[] i(float[] array, int minLength, int padding) {
        j0.k(minLength >= 0, "Invalid minLength: %s", minLength);
        j0.k(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    public static int j(float value) {
        return Float.valueOf(value).hashCode();
    }

    public static int k(float[] array, float target) {
        return l(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(float[] array, float target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public static int m(float[] array, float[] target) {
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

    public static boolean n(float value) {
        return Float.NEGATIVE_INFINITY < value && value < Float.POSITIVE_INFINITY;
    }

    public static String o(String separator, float... array) {
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

    public static int p(float[] array, float target) {
        return q(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int q(float[] array, float target, int start, int end) {
        for (int i10 = end - 1; i10 >= start; i10--) {
            if (array[i10] == target) {
                return i10;
            }
        }
        return -1;
    }

    public static Comparator<float[]> r() {
        return c.INSTANCE;
    }

    @com.google.common.annotations.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static float s(float... array) {
        j0.d(array.length > 0);
        float fMax = array[0];
        for (int i10 = 1; i10 < array.length; i10++) {
            fMax = Math.max(fMax, array[i10]);
        }
        return fMax;
    }

    @com.google.common.annotations.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static float t(float... array) {
        j0.d(array.length > 0);
        float fMin = array[0];
        for (int i10 = 1; i10 < array.length; i10++) {
            fMin = Math.min(fMin, array[i10]);
        }
        return fMin;
    }

    public static void u(float[] array) {
        j0.E(array);
        v(array, 0, array.length);
    }

    public static void v(float[] array, int fromIndex, int toIndex) {
        j0.E(array);
        j0.f0(fromIndex, toIndex, array.length);
        for (int i10 = toIndex - 1; fromIndex < i10; i10--) {
            float f10 = array[fromIndex];
            array[fromIndex] = array[i10];
            array[i10] = f10;
            fromIndex++;
        }
    }

    public static void w(float[] array, int distance) {
        x(array, distance, 0, array.length);
    }

    public static void x(float[] array, int distance, int fromIndex, int toIndex) {
        j0.E(array);
        j0.f0(fromIndex, toIndex, array.length);
        if (array.length > 1) {
            int i10 = toIndex - fromIndex;
            int i11 = (-distance) % i10;
            if (i11 < 0) {
                i11 += i10;
            }
            int i12 = i11 + fromIndex;
            if (i12 != fromIndex) {
                v(array, fromIndex, i12);
                v(array, i12, toIndex);
                v(array, fromIndex, toIndex);
            }
        }
    }

    public static void y(float[] array) {
        j0.E(array);
        z(array, 0, array.length);
    }

    public static void z(float[] array, int fromIndex, int toIndex) {
        j0.E(array);
        j0.f0(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        v(array, fromIndex, toIndex);
    }
}
