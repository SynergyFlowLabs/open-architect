package com.google.common.primitives;

import com.google.common.base.j0;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
@f
@com.google.common.annotations.b
public final class b {

    @com.google.common.annotations.b
    private static class a extends AbstractList<Byte> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f119696d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final byte[] f119697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f119698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f119699c;

        a(byte[] array) {
            this(array, 0, array.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Byte get(int index) {
            j0.C(index, size());
            return Byte.valueOf(this.f119697a[this.f119698b + index]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@fj.a Object target) {
            return (target instanceof Byte) && b.j(this.f119697a, ((Byte) target).byteValue(), this.f119698b, this.f119699c) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Byte set(int index, Byte element) {
            j0.C(index, size());
            byte[] bArr = this.f119697a;
            int i10 = this.f119698b;
            byte b10 = bArr[i10 + index];
            bArr[i10 + index] = ((Byte) j0.E(element)).byteValue();
            return Byte.valueOf(b10);
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
                if (this.f119697a[this.f119698b + i10] != aVar.f119697a[aVar.f119698b + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iH = 1;
            for (int i10 = this.f119698b; i10 < this.f119699c; i10++) {
                iH = (iH * 31) + b.h(this.f119697a[i10]);
            }
            return iH;
        }

        byte[] i() {
            return Arrays.copyOfRange(this.f119697a, this.f119698b, this.f119699c);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@fj.a Object target) {
            int iJ;
            if (!(target instanceof Byte) || (iJ = b.j(this.f119697a, ((Byte) target).byteValue(), this.f119698b, this.f119699c)) < 0) {
                return -1;
            }
            return iJ - this.f119698b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@fj.a Object target) {
            int iM;
            if (!(target instanceof Byte) || (iM = b.m(this.f119697a, ((Byte) target).byteValue(), this.f119698b, this.f119699c)) < 0) {
                return -1;
            }
            return iM - this.f119698b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f119699c - this.f119698b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Byte> subList(int fromIndex, int toIndex) {
            j0.f0(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.EMPTY_LIST;
            }
            byte[] bArr = this.f119697a;
            int i10 = this.f119698b;
            return new a(bArr, fromIndex + i10, i10 + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb2.append((int) this.f119697a[this.f119698b]);
            int i10 = this.f119698b;
            while (true) {
                i10++;
                if (i10 >= this.f119699c) {
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append((int) this.f119697a[i10]);
            }
        }

        a(byte[] array, int start, int end) {
            this.f119697a = array;
            this.f119698b = start;
            this.f119699c = end;
        }
    }

    private b() {
    }

    public static List<Byte> c(byte... backingArray) {
        return backingArray.length == 0 ? Collections.EMPTY_LIST : new a(backingArray);
    }

    private static int d(long result) {
        int i10 = (int) result;
        j0.p(result == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", result);
        return i10;
    }

    public static byte[] e(byte[]... arrays) {
        long length = 0;
        for (byte[] bArr : arrays) {
            length += (long) bArr.length;
        }
        byte[] bArr2 = new byte[d(length)];
        int length2 = 0;
        for (byte[] bArr3 : arrays) {
            System.arraycopy(bArr3, 0, bArr2, length2, bArr3.length);
            length2 += bArr3.length;
        }
        return bArr2;
    }

    public static boolean f(byte[] array, byte target) {
        for (byte b10 : array) {
            if (b10 == target) {
                return true;
            }
        }
        return false;
    }

    public static byte[] g(byte[] array, int minLength, int padding) {
        j0.k(minLength >= 0, "Invalid minLength: %s", minLength);
        j0.k(padding >= 0, "Invalid padding: %s", padding);
        if (array.length < minLength) {
            array = Arrays.copyOf(array, minLength + padding);
        }
        return array;
    }

    public static int h(byte value) {
        return value;
    }

    public static int i(byte[] array, byte target) {
        return j(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(byte[] array, byte target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public static int k(byte[] array, byte[] target) {
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

    public static int l(byte[] array, byte target) {
        return m(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(byte[] array, byte target, int start, int end) {
        for (int i10 = end - 1; i10 >= start; i10--) {
            if (array[i10] == target) {
                return i10;
            }
        }
        return -1;
    }

    public static void n(byte[] array) {
        j0.E(array);
        o(array, 0, array.length);
    }

    public static void o(byte[] array, int fromIndex, int toIndex) {
        j0.E(array);
        j0.f0(fromIndex, toIndex, array.length);
        while (true) {
            toIndex--;
            if (fromIndex >= toIndex) {
                return;
            }
            byte b10 = array[fromIndex];
            array[fromIndex] = array[toIndex];
            array[toIndex] = b10;
            fromIndex++;
        }
    }

    public static void p(byte[] array, int distance) {
        q(array, distance, 0, array.length);
    }

    public static void q(byte[] array, int distance, int fromIndex, int toIndex) {
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
                o(array, fromIndex, i12);
                o(array, i12, toIndex);
                o(array, fromIndex, toIndex);
            }
        }
    }

    public static byte[] r(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).i();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = ((Number) j0.E(array[i10])).byteValue();
        }
        return bArr;
    }
}
