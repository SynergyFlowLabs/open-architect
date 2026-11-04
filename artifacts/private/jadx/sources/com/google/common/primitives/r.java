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
import kotlin.jvm.internal.n1;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
@f
@com.google.common.annotations.b(emulated = true)
public final class r extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f119772a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final short f119773b = 16384;

    private enum a implements Comparator<short[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compare(short[] left, short[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iCompare = Short.compare(left[i10], right[i10]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Shorts.lexicographicalComparator()";
        }
    }

    @com.google.common.annotations.b
    private static class b extends AbstractList<Short> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f119776d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final short[] f119777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f119778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f119779c;

        b(short[] array) {
            this(array, 0, array.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Short get(int index) {
            j0.C(index, size());
            return Short.valueOf(this.f119777a[this.f119778b + index]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@fj.a Object target) {
            return (target instanceof Short) && r.o(this.f119777a, ((Short) target).shortValue(), this.f119778b, this.f119779c) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Short set(int index, Short element) {
            j0.C(index, size());
            short[] sArr = this.f119777a;
            int i10 = this.f119778b;
            short s10 = sArr[i10 + index];
            sArr[i10 + index] = ((Short) j0.E(element)).shortValue();
            return Short.valueOf(s10);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@fj.a Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof b)) {
                return super.equals(object);
            }
            b bVar = (b) object;
            int size = size();
            if (bVar.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f119777a[this.f119778b + i10] != bVar.f119777a[bVar.f119778b + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iM = 1;
            for (int i10 = this.f119778b; i10 < this.f119779c; i10++) {
                iM = (iM * 31) + r.m(this.f119777a[i10]);
            }
            return iM;
        }

        short[] i() {
            return Arrays.copyOfRange(this.f119777a, this.f119778b, this.f119779c);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@fj.a Object target) {
            int iO;
            if (!(target instanceof Short) || (iO = r.o(this.f119777a, ((Short) target).shortValue(), this.f119778b, this.f119779c)) < 0) {
                return -1;
            }
            return iO - this.f119778b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@fj.a Object target) {
            int iS;
            if (!(target instanceof Short) || (iS = r.s(this.f119777a, ((Short) target).shortValue(), this.f119778b, this.f119779c)) < 0) {
                return -1;
            }
            return iS - this.f119778b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f119779c - this.f119778b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Short> subList(int fromIndex, int toIndex) {
            j0.f0(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.EMPTY_LIST;
            }
            short[] sArr = this.f119777a;
            int i10 = this.f119778b;
            return new b(sArr, fromIndex + i10, i10 + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 6);
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb2.append((int) this.f119777a[this.f119778b]);
            int i10 = this.f119778b;
            while (true) {
                i10++;
                if (i10 >= this.f119779c) {
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append((int) this.f119777a[i10]);
            }
        }

        b(short[] array, int start, int end) {
            this.f119777a = array;
            this.f119778b = start;
            this.f119779c = end;
        }
    }

    private static final class c extends com.google.common.base.i<String, Short> implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final com.google.common.base.i<String, Short> f119780c = new c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f119781d = 1;

        private c() {
        }

        private Object readResolve() {
            return f119780c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.i
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public String g(Short value) {
            return value.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.i
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Short h(String value) {
            return Short.decode(value);
        }

        public String toString() {
            return "Shorts.stringConverter()";
        }
    }

    private r() {
    }

    public static short A(long value) {
        if (value > 32767) {
            return n1.f312766c;
        }
        return value < -32768 ? n1.f312765b : (short) value;
    }

    public static void B(short[] array) {
        j0.E(array);
        C(array, 0, array.length);
    }

    public static void C(short[] array, int fromIndex, int toIndex) {
        j0.E(array);
        j0.f0(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        x(array, fromIndex, toIndex);
    }

    public static com.google.common.base.i<String, Short> D() {
        return c.f119780c;
    }

    public static short[] E(Collection<? extends Number> collection) {
        if (collection instanceof b) {
            return ((b) collection).i();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        short[] sArr = new short[length];
        for (int i10 = 0; i10 < length; i10++) {
            sArr[i10] = ((Number) j0.E(array[i10])).shortValue();
        }
        return sArr;
    }

    @com.google.common.annotations.c
    public static byte[] F(short value) {
        return new byte[]{(byte) (value >> 8), (byte) value};
    }

    public static List<Short> c(short... backingArray) {
        return backingArray.length == 0 ? Collections.EMPTY_LIST : new b(backingArray);
    }

    private static int d(long result) {
        int i10 = (int) result;
        j0.p(result == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", result);
        return i10;
    }

    public static short e(long value) {
        short s10 = (short) value;
        j0.p(((long) s10) == value, "Out of range: %s", value);
        return s10;
    }

    @z7.m(replacement = "Short.compare(a, b)")
    public static int f(short a10, short b10) {
        return Short.compare(a10, b10);
    }

    public static short[] g(short[]... arrays) {
        long length = 0;
        for (short[] sArr : arrays) {
            length += (long) sArr.length;
        }
        short[] sArr2 = new short[d(length)];
        int length2 = 0;
        for (short[] sArr3 : arrays) {
            System.arraycopy(sArr3, 0, sArr2, length2, sArr3.length);
            length2 += sArr3.length;
        }
        return sArr2;
    }

    public static short h(short value, short min, short max) {
        j0.m(min <= max, "min (%s) must be less than or equal to max (%s)", min, max);
        if (value < min) {
            return min;
        }
        return value < max ? value : max;
    }

    public static boolean i(short[] array, short target) {
        for (short s10 : array) {
            if (s10 == target) {
                return true;
            }
        }
        return false;
    }

    public static short[] j(short[] array, int minLength, int padding) {
        j0.k(minLength >= 0, "Invalid minLength: %s", minLength);
        j0.k(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    @com.google.common.annotations.c
    public static short k(byte[] bytes) {
        j0.m(bytes.length >= 2, "array too small: %s < %s", bytes.length, 2);
        return l(bytes[0], bytes[1]);
    }

    @com.google.common.annotations.c
    public static short l(byte b10, byte b11) {
        return (short) ((b10 << 8) | (b11 & 255));
    }

    public static int m(short value) {
        return value;
    }

    public static int n(short[] array, short target) {
        return o(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int o(short[] array, short target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public static int p(short[] array, short[] target) {
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

    public static String q(String separator, short... array) {
        j0.E(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(array.length * 6);
        sb2.append((int) array[0]);
        int i10 = 6 & 1;
        for (int i11 = 1; i11 < array.length; i11++) {
            sb2.append(separator);
            sb2.append((int) array[i11]);
        }
        return sb2.toString();
    }

    public static int r(short[] array, short target) {
        return s(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s(short[] array, short target, int start, int end) {
        for (int i10 = end - 1; i10 >= start; i10--) {
            if (array[i10] == target) {
                return i10;
            }
        }
        return -1;
    }

    public static Comparator<short[]> t() {
        return a.INSTANCE;
    }

    @com.google.common.annotations.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short u(short... array) {
        j0.d(array.length > 0);
        short s10 = array[0];
        for (int i10 = 1; i10 < array.length; i10++) {
            short s11 = array[i10];
            if (s11 > s10) {
                s10 = s11;
            }
        }
        return s10;
    }

    @com.google.common.annotations.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short v(short... array) {
        j0.d(array.length > 0);
        short s10 = array[0];
        for (int i10 = 1; i10 < array.length; i10++) {
            short s11 = array[i10];
            if (s11 < s10) {
                s10 = s11;
            }
        }
        return s10;
    }

    public static void w(short[] array) {
        j0.E(array);
        x(array, 0, array.length);
    }

    public static void x(short[] array, int fromIndex, int toIndex) {
        j0.E(array);
        j0.f0(fromIndex, toIndex, array.length);
        for (int i10 = toIndex - 1; fromIndex < i10; i10--) {
            short s10 = array[fromIndex];
            array[fromIndex] = array[i10];
            array[i10] = s10;
            fromIndex++;
        }
    }

    public static void y(short[] array, int distance) {
        z(array, distance, 0, array.length);
    }

    public static void z(short[] array, int distance, int fromIndex, int toIndex) {
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
        x(array, fromIndex, i12);
        x(array, i12, toIndex);
        x(array, fromIndex, toIndex);
    }
}
