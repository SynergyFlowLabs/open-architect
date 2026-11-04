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
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f119757a = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f119758b = 4611686018427387904L;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final byte[] f119759a;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i10 = 0; i10 < 10; i10++) {
                bArr[i10 + 48] = (byte) i10;
            }
            for (int i11 = 0; i11 < 26; i11++) {
                byte b10 = (byte) (i11 + 10);
                bArr[i11 + 65] = b10;
                bArr[i11 + 97] = b10;
            }
            f119759a = bArr;
        }

        private a() {
        }

        static int a(char c10) {
            if (c10 < 128) {
                return f119759a[c10];
            }
            return -1;
        }
    }

    private enum b implements Comparator<long[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compare(long[] left, long[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iCompare = Long.compare(left[i10], right[i10]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Longs.lexicographicalComparator()";
        }
    }

    @com.google.common.annotations.b
    private static class c extends AbstractList<Long> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f119762d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long[] f119763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f119764b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f119765c;

        c(long[] array) {
            this(array, 0, array.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Long get(int index) {
            j0.C(index, size());
            return Long.valueOf(this.f119763a[this.f119764b + index]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@fj.a Object target) {
            return (target instanceof Long) && n.n(this.f119763a, ((Long) target).longValue(), this.f119764b, this.f119765c) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Long set(int index, Long element) {
            j0.C(index, size());
            long[] jArr = this.f119763a;
            int i10 = this.f119764b;
            long j10 = jArr[i10 + index];
            jArr[i10 + index] = ((Long) j0.E(element)).longValue();
            return Long.valueOf(j10);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@fj.a Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof c)) {
                return super.equals(object);
            }
            c cVar = (c) object;
            int size = size();
            if (cVar.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f119763a[this.f119764b + i10] != cVar.f119763a[cVar.f119764b + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iL = 1;
            for (int i10 = this.f119764b; i10 < this.f119765c; i10++) {
                iL = (iL * 31) + n.l(this.f119763a[i10]);
            }
            return iL;
        }

        long[] i() {
            return Arrays.copyOfRange(this.f119763a, this.f119764b, this.f119765c);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@fj.a Object target) {
            int iN;
            if (!(target instanceof Long) || (iN = n.n(this.f119763a, ((Long) target).longValue(), this.f119764b, this.f119765c)) < 0) {
                return -1;
            }
            return iN - this.f119764b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@fj.a Object target) {
            int iR;
            if (!(target instanceof Long) || (iR = n.r(this.f119763a, ((Long) target).longValue(), this.f119764b, this.f119765c)) < 0) {
                return -1;
            }
            return iR - this.f119764b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f119765c - this.f119764b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int fromIndex, int toIndex) {
            j0.f0(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.EMPTY_LIST;
            }
            long[] jArr = this.f119763a;
            int i10 = this.f119764b;
            return new c(jArr, fromIndex + i10, i10 + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 10);
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb2.append(this.f119763a[this.f119764b]);
            int i10 = this.f119764b;
            while (true) {
                i10++;
                if (i10 >= this.f119765c) {
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f119763a[i10]);
            }
        }

        c(long[] array, int start, int end) {
            this.f119763a = array;
            this.f119764b = start;
            this.f119765c = end;
        }
    }

    private static final class d extends com.google.common.base.i<String, Long> implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final com.google.common.base.i<String, Long> f119766c = new d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f119767d = 1;

        private d() {
        }

        private Object readResolve() {
            return f119766c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.i
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public String g(Long value) {
            return value.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.i
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Long h(String value) {
            return Long.decode(value);
        }

        public String toString() {
            return "Longs.stringConverter()";
        }
    }

    private n() {
    }

    public static void A(long[] array, int fromIndex, int toIndex) {
        j0.E(array);
        j0.f0(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        w(array, fromIndex, toIndex);
    }

    public static com.google.common.base.i<String, Long> B() {
        return d.f119766c;
    }

    public static long[] C(Collection<? extends Number> collection) {
        if (collection instanceof c) {
            return ((c) collection).i();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = ((Number) j0.E(array[i10])).longValue();
        }
        return jArr;
    }

    public static byte[] D(long value) {
        byte[] bArr = new byte[8];
        for (int i10 = 7; i10 >= 0; i10--) {
            bArr[i10] = (byte) (255 & value);
            value >>= 8;
        }
        return bArr;
    }

    @fj.a
    public static Long E(String string) {
        return F(string, 10);
    }

    @fj.a
    public static Long F(String string, int radix) {
        if (((String) j0.E(string)).isEmpty()) {
            return null;
        }
        if (radix < 2 || radix > 36) {
            throw new IllegalArgumentException("radix must be between MIN_RADIX and MAX_RADIX but was " + radix);
        }
        int i10 = string.charAt(0) == '-' ? 1 : 0;
        if (i10 == string.length()) {
            return null;
        }
        int i11 = i10 + 1;
        int iA = a.a(string.charAt(i10));
        if (iA < 0 || iA >= radix) {
            return null;
        }
        long j10 = -iA;
        long j11 = radix;
        long j12 = Long.MIN_VALUE / j11;
        while (i11 < string.length()) {
            int i12 = i11 + 1;
            int iA2 = a.a(string.charAt(i11));
            if (iA2 < 0 || iA2 >= radix || j10 < j12) {
                return null;
            }
            long j13 = j10 * j11;
            long j14 = iA2;
            if (j13 < j14 - Long.MIN_VALUE) {
                return null;
            }
            j10 = j13 - j14;
            i11 = i12;
        }
        if (i10 != 0) {
            return Long.valueOf(j10);
        }
        if (j10 == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j10);
    }

    public static List<Long> c(long... backingArray) {
        return backingArray.length == 0 ? Collections.EMPTY_LIST : new c(backingArray);
    }

    private static int d(long result) {
        int i10 = (int) result;
        j0.p(result == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", result);
        return i10;
    }

    @z7.m(replacement = "Long.compare(a, b)")
    public static int e(long a10, long b10) {
        return Long.compare(a10, b10);
    }

    public static long[] f(long[]... arrays) {
        long length = 0;
        for (long[] jArr : arrays) {
            length += (long) jArr.length;
        }
        long[] jArr2 = new long[d(length)];
        int length2 = 0;
        for (long[] jArr3 : arrays) {
            System.arraycopy(jArr3, 0, jArr2, length2, jArr3.length);
            length2 += jArr3.length;
        }
        return jArr2;
    }

    public static long g(long value, long min, long max) {
        j0.s(min <= max, "min (%s) must be less than or equal to max (%s)", min, max);
        return Math.min(Math.max(value, min), max);
    }

    public static boolean h(long[] array, long target) {
        for (long j10 : array) {
            if (j10 == target) {
                return true;
            }
        }
        return false;
    }

    public static long[] i(long[] array, int minLength, int padding) {
        j0.k(minLength >= 0, "Invalid minLength: %s", minLength);
        j0.k(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    public static long j(byte[] bytes) {
        j0.m(bytes.length >= 8, "array too small: %s < %s", bytes.length, 8);
        return k(bytes[0], bytes[1], bytes[2], bytes[3], bytes[4], bytes[5], bytes[6], bytes[7]);
    }

    public static long k(byte b10, byte b11, byte b12, byte b13, byte b14, byte b15, byte b16, byte b17) {
        return ((((long) b11) & 255) << 48) | ((((long) b10) & 255) << 56) | ((((long) b12) & 255) << 40) | ((((long) b13) & 255) << 32) | ((((long) b14) & 255) << 24) | ((((long) b15) & 255) << 16) | ((((long) b16) & 255) << 8) | (((long) b17) & 255);
    }

    public static int l(long value) {
        return (int) (value ^ (value >>> 32));
    }

    public static int m(long[] array, long target) {
        return n(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(long[] array, long target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public static int o(long[] array, long[] target) {
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

    public static String p(String separator, long... array) {
        j0.E(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(array.length * 10);
        sb2.append(array[0]);
        for (int i10 = 1; i10 < array.length; i10++) {
            sb2.append(separator);
            sb2.append(array[i10]);
        }
        return sb2.toString();
    }

    public static int q(long[] array, long target) {
        return r(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(long[] array, long target, int start, int end) {
        for (int i10 = end - 1; i10 >= start; i10--) {
            if (array[i10] == target) {
                return i10;
            }
        }
        return -1;
    }

    public static Comparator<long[]> s() {
        return b.INSTANCE;
    }

    public static long t(long... array) {
        j0.d(array.length > 0);
        long j10 = array[0];
        for (int i10 = 1; i10 < array.length; i10++) {
            long j11 = array[i10];
            if (j11 > j10) {
                j10 = j11;
            }
        }
        return j10;
    }

    public static long u(long... array) {
        j0.d(array.length > 0);
        long j10 = array[0];
        for (int i10 = 1; i10 < array.length; i10++) {
            long j11 = array[i10];
            if (j11 < j10) {
                j10 = j11;
            }
        }
        return j10;
    }

    public static void v(long[] array) {
        j0.E(array);
        w(array, 0, array.length);
    }

    public static void w(long[] array, int fromIndex, int toIndex) {
        j0.E(array);
        j0.f0(fromIndex, toIndex, array.length);
        for (int i10 = toIndex - 1; fromIndex < i10; i10--) {
            long j10 = array[fromIndex];
            array[fromIndex] = array[i10];
            array[i10] = j10;
            fromIndex++;
        }
    }

    public static void x(long[] array, int distance) {
        y(array, distance, 0, array.length);
    }

    public static void y(long[] array, int distance, int fromIndex, int toIndex) {
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

    public static void z(long[] array) {
        j0.E(array);
        A(array, 0, array.length);
    }
}
