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
@com.google.common.annotations.b(emulated = true)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f119700a = 2;

    @com.google.common.annotations.b
    private static class a extends AbstractList<Character> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f119701d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final char[] f119702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f119703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f119704c;

        a(char[] array) {
            this(array, 0, array.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Character get(int index) {
            j0.C(index, size());
            return Character.valueOf(this.f119702a[this.f119703b + index]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@fj.a Object target) {
            return (target instanceof Character) && c.o(this.f119702a, ((Character) target).charValue(), this.f119703b, this.f119704c) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Character set(int index, Character element) {
            j0.C(index, size());
            char[] cArr = this.f119702a;
            int i10 = this.f119703b;
            char c10 = cArr[i10 + index];
            cArr[i10 + index] = ((Character) j0.E(element)).charValue();
            return Character.valueOf(c10);
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
                if (this.f119702a[this.f119703b + i10] != aVar.f119702a[aVar.f119703b + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iM = 1;
            for (int i10 = this.f119703b; i10 < this.f119704c; i10++) {
                iM = (iM * 31) + c.m(this.f119702a[i10]);
            }
            return iM;
        }

        char[] i() {
            return Arrays.copyOfRange(this.f119702a, this.f119703b, this.f119704c);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@fj.a Object target) {
            int iO;
            if (!(target instanceof Character) || (iO = c.o(this.f119702a, ((Character) target).charValue(), this.f119703b, this.f119704c)) < 0) {
                return -1;
            }
            return iO - this.f119703b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@fj.a Object target) {
            int iS;
            if (!(target instanceof Character) || (iS = c.s(this.f119702a, ((Character) target).charValue(), this.f119703b, this.f119704c)) < 0) {
                return -1;
            }
            return iS - this.f119703b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f119704c - this.f119703b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Character> subList(int fromIndex, int toIndex) {
            j0.f0(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.EMPTY_LIST;
            }
            char[] cArr = this.f119702a;
            int i10 = this.f119703b;
            return new a(cArr, fromIndex + i10, i10 + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 3);
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb2.append(this.f119702a[this.f119703b]);
            int i10 = this.f119703b;
            while (true) {
                i10++;
                if (i10 >= this.f119704c) {
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f119702a[i10]);
            }
        }

        a(char[] array, int start, int end) {
            this.f119702a = array;
            this.f119703b = start;
            this.f119704c = end;
        }
    }

    private enum b implements Comparator<char[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compare(char[] left, char[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iCompare = Character.compare(left[i10], right[i10]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Chars.lexicographicalComparator()";
        }
    }

    private c() {
    }

    public static char A(long value) {
        if (value > okhttp3.internal.ws.g.f334653t) {
            return kotlin.jvm.internal.r.f312787c;
        }
        if (value < 0) {
            return (char) 0;
        }
        return (char) value;
    }

    public static void B(char[] array) {
        j0.E(array);
        C(array, 0, array.length);
    }

    public static void C(char[] array, int fromIndex, int toIndex) {
        j0.E(array);
        j0.f0(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        x(array, fromIndex, toIndex);
    }

    public static char[] D(Collection<Character> collection) {
        if (collection instanceof a) {
            return ((a) collection).i();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = ((Character) j0.E(array[i10])).charValue();
        }
        return cArr;
    }

    @com.google.common.annotations.c
    public static byte[] E(char value) {
        return new byte[]{(byte) (value >> '\b'), (byte) value};
    }

    public static List<Character> c(char... backingArray) {
        return backingArray.length == 0 ? Collections.EMPTY_LIST : new a(backingArray);
    }

    private static int d(long result) {
        int i10 = (int) result;
        j0.p(result == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", result);
        return i10;
    }

    public static char e(long value) {
        char c10 = (char) value;
        j0.p(((long) c10) == value, "Out of range: %s", value);
        return c10;
    }

    @z7.m(replacement = "Character.compare(a, b)")
    public static int f(char a10, char b10) {
        return Character.compare(a10, b10);
    }

    public static char[] g(char[]... arrays) {
        long length = 0;
        for (char[] cArr : arrays) {
            length += (long) cArr.length;
        }
        char[] cArr2 = new char[d(length)];
        int length2 = 0;
        for (char[] cArr3 : arrays) {
            System.arraycopy(cArr3, 0, cArr2, length2, cArr3.length);
            length2 += cArr3.length;
        }
        return cArr2;
    }

    public static char h(char value, char min, char max) {
        j0.g(min <= max, "min (%s) must be less than or equal to max (%s)", min, max);
        if (value < min) {
            return min;
        }
        return value < max ? value : max;
    }

    public static boolean i(char[] array, char target) {
        for (char c10 : array) {
            if (c10 == target) {
                return true;
            }
        }
        return false;
    }

    public static char[] j(char[] array, int minLength, int padding) {
        j0.k(minLength >= 0, "Invalid minLength: %s", minLength);
        j0.k(padding >= 0, "Invalid padding: %s", padding);
        if (array.length < minLength) {
            array = Arrays.copyOf(array, minLength + padding);
        }
        return array;
    }

    @com.google.common.annotations.c
    public static char k(byte[] bytes) {
        j0.m(bytes.length >= 2, "array too small: %s < %s", bytes.length, 2);
        return l(bytes[0], bytes[1]);
    }

    @com.google.common.annotations.c
    public static char l(byte b10, byte b11) {
        return (char) ((b10 << 8) | (b11 & 255));
    }

    public static int m(char value) {
        return value;
    }

    public static int n(char[] array, char target) {
        return o(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int o(char[] array, char target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public static int p(char[] array, char[] target) {
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

    public static String q(String separator, char... array) {
        j0.E(separator);
        int length = array.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder((separator.length() * (length - 1)) + length);
        sb2.append(array[0]);
        for (int i10 = 1; i10 < length; i10++) {
            sb2.append(separator);
            sb2.append(array[i10]);
        }
        return sb2.toString();
    }

    public static int r(char[] array, char target) {
        return s(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s(char[] array, char target, int start, int end) {
        for (int i10 = end - 1; i10 >= start; i10--) {
            if (array[i10] == target) {
                return i10;
            }
        }
        return -1;
    }

    public static Comparator<char[]> t() {
        return b.INSTANCE;
    }

    public static char u(char... array) {
        boolean z10 = !false;
        j0.d(array.length > 0);
        char c10 = array[0];
        for (int i10 = 1; i10 < array.length; i10++) {
            char c11 = array[i10];
            if (c11 > c10) {
                c10 = c11;
            }
        }
        return c10;
    }

    public static char v(char... array) {
        j0.d(array.length > 0);
        char c10 = array[0];
        for (int i10 = 1; i10 < array.length; i10++) {
            char c11 = array[i10];
            if (c11 < c10) {
                c10 = c11;
            }
        }
        return c10;
    }

    public static void w(char[] array) {
        j0.E(array);
        x(array, 0, array.length);
    }

    public static void x(char[] array, int fromIndex, int toIndex) {
        j0.E(array);
        j0.f0(fromIndex, toIndex, array.length);
        for (int i10 = toIndex - 1; fromIndex < i10; i10--) {
            char c10 = array[fromIndex];
            array[fromIndex] = array[i10];
            array[i10] = c10;
            fromIndex++;
        }
    }

    public static void y(char[] array, int distance) {
        z(array, distance, 0, array.length);
    }

    public static void z(char[] array, int distance, int fromIndex, int toIndex) {
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
