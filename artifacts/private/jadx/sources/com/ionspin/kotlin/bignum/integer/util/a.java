package com.ionspin.kotlin.bignum.integer.util;

import com.ionspin.kotlin.bignum.integer.l;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.collections.UCollectionsKt;
import kotlin.collections.unsigned.UArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.q1;
import kotlin.r1;
import kotlin.ranges.r;
import kotlin.u1;
import kotlin.v1;
import kotlin.y1;
import kotlin.z1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nConversionUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversionUtils.kt\ncom/ionspin/kotlin/bignum/integer/util/ConversionUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,202:1\n1#2:203\n1639#3,6:204\n1639#3,6:210\n*S KotlinDebug\n*F\n+ 1 ConversionUtils.kt\ncom/ionspin/kotlin/bignum/integer/util/ConversionUtilsKt\n*L\n167#1:204,6\n186#1:210,6\n*E\n"})
public final class a {
    public static final long a(@NotNull byte[] fromBigEndianArrayToULong) {
        Intrinsics.checkNotNullParameter(fromBigEndianArrayToULong, "$this$fromBigEndianArrayToULong");
        if (r1.v(fromBigEndianArrayToULong) > 8) {
            throw new RuntimeException("ore than 8 bytes in input, potential overflow");
        }
        int iV = r1.v(fromBigEndianArrayToULong);
        int i10 = 0;
        long jN = 0;
        int i11 = 0;
        while (i10 < iV) {
            jN = y1.n(jN | y1.n(y1.n(((long) r1.t(fromBigEndianArrayToULong, i10)) & 255) << (56 - (i11 * 8))));
            i10++;
            i11++;
        }
        return jN;
    }

    public static final long b(@NotNull byte[] fromLittleEndianArrayToULong) {
        Intrinsics.checkNotNullParameter(fromLittleEndianArrayToULong, "$this$fromLittleEndianArrayToULong");
        if (r1.v(fromLittleEndianArrayToULong) > 8) {
            throw new RuntimeException("More than 8 bytes in input, potential overflow");
        }
        int iV = r1.v(fromLittleEndianArrayToULong);
        int i10 = 0;
        long jN = 0;
        int i11 = 0;
        while (i10 < iV) {
            jN = y1.n(jN | y1.n(y1.n(((long) r1.t(fromLittleEndianArrayToULong, i10)) & 255) << (i11 * 8)));
            i10++;
            i11++;
        }
        return jN;
    }

    @NotNull
    public static final com.ionspin.kotlin.bignum.integer.a c(@NotNull com.ionspin.kotlin.bignum.integer.a.c cVar, @NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (source.length == 0) {
            return cVar.h();
        }
        if (source[0] >= 0) {
            return cVar.a(source, l.POSITIVE);
        }
        return com.ionspin.kotlin.bignum.integer.a.f131059e.l(e(h(r1.k(source))), l.NEGATIVE);
    }

    @NotNull
    public static final int[] d(@NotNull int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length - 1;
        if (length < 0) {
            length = -1;
            break;
        }
        while (true) {
            int i10 = length - 1;
            if (Integer.compareUnsigned(u1.n(array[length]), -1) < 0) {
                break;
            }
            if (i10 < 0) {
                length = -1;
                break;
            }
            length = i10;
        }
        if (length == -1) {
            return v1.k(ArraysKt.plus(new int[]{1}, array));
        }
        int[] iArrCopyOf = Arrays.copyOf(array, array.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrK = v1.k(iArrCopyOf);
        v1.D(iArrK, length, u1.n(v1.t(iArrK, length) + 1));
        return iArrK;
    }

    @NotNull
    public static final byte[] e(@NotNull byte[] byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        int length = byteString.length - 1;
        if (length < 0) {
            length = -1;
            break;
        }
        while (true) {
            int i10 = length - 1;
            if (Integer.compareUnsigned(u1.n(q1.n(byteString[length]) & 255), 255) < 0) {
                break;
            }
            if (i10 < 0) {
                length = -1;
                break;
            }
            length = i10;
        }
        if (length == -1) {
            return r1.k(ArraysKt.plus(new byte[]{1}, byteString));
        }
        byte[] bArrCopyOf = Arrays.copyOf(byteString, byteString.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrK = r1.k(bArrCopyOf);
        int iV = r1.v(byteString) - 1;
        int i11 = length + 1;
        if (i11 <= iV) {
            while (true) {
                r1.D(bArrK, iV, (byte) 0);
                if (iV == i11) {
                    break;
                }
                iV--;
            }
        }
        r1.D(bArrK, length, q1.n((byte) (r1.t(bArrK, length) + 1)));
        return bArrK;
    }

    @NotNull
    public static final long[] f(@NotNull long[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length - 1;
        if (length < 0) {
            length = -1;
            break;
        }
        while (true) {
            int i10 = length - 1;
            if (Long.compareUnsigned(y1.n(array[length]), -1L) < 0) {
                break;
            }
            if (i10 < 0) {
                length = -1;
                break;
            }
            length = i10;
        }
        if (length == -1) {
            return z1.k(ArraysKt.plus(new long[]{1}, array));
        }
        long[] jArrCopyOf = Arrays.copyOf(array, array.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] jArrK = z1.k(jArrCopyOf);
        z1.D(jArrK, length, y1.n(z1.t(jArrK, length) + 1));
        return jArrK;
    }

    @NotNull
    public static final int[] g(@NotNull int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int iH = ((com.ionspin.kotlin.bignum.integer.base32.a.f131082a.h(v1.t(array, 0)) + 7) / 8) * 8;
        ArrayList arrayList = new ArrayList(v1.v(array));
        int iV = v1.v(array);
        for (int i10 = 0; i10 < iV; i10++) {
            arrayList.add(u1.c(u1.n(~v1.t(array, i10))));
        }
        int[] uIntArray = UCollectionsKt.toUIntArray(arrayList);
        v1.D(uIntArray, 0, u1.n(u1.n(~u1.n((-1) << iH)) & v1.t(uIntArray, 0)));
        return uIntArray;
    }

    @NotNull
    public static final byte[] h(@NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        ArrayList arrayList = new ArrayList(r1.v(array));
        int iV = r1.v(array);
        for (int i10 = 0; i10 < iV; i10++) {
            arrayList.add(q1.c(q1.n((byte) (~r1.t(array, i10)))));
        }
        return UCollectionsKt.toUByteArray(arrayList);
    }

    @NotNull
    public static final long[] i(@NotNull long[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int iA0 = ((ea.a.f274713a.a0(z1.t(array, 0)) + 7) / 8) * 8;
        ArrayList arrayList = new ArrayList(z1.v(array));
        int iV = z1.v(array);
        for (int i10 = 0; i10 < iV; i10++) {
            arrayList.add(y1.c(y1.n(~z1.t(array, i10))));
        }
        long[] uLongArray = UCollectionsKt.toULongArray(arrayList);
        z1.D(uLongArray, 0, y1.n(y1.n(~y1.n((-1) << iA0)) & z1.t(uLongArray, 0)));
        return uLongArray;
    }

    public static final void j(@NotNull byte[] source, int i10, int i11, @NotNull byte[] target, int i12) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        int i13 = i11 - i10;
        for (int i14 = 0; i14 < i13; i14++) {
            r1.D(target, ((i12 + i13) - i14) - 1, r1.t(source, i10 + i14));
        }
    }

    @NotNull
    public static final byte[] k(long j10) {
        byte[] bArr = new byte[8];
        for (int i10 = 0; i10 < 8; i10++) {
            bArr[i10] = q1.n((byte) y1.n(y1.n(j10 >>> (56 - (i10 * 8))) & 255));
        }
        return r1.k(bArr);
    }

    @NotNull
    public static final byte[] l(int i10) {
        byte[] bArr = new byte[4];
        for (int i11 = 0; i11 < 4; i11++) {
            bArr[i11] = q1.n((byte) u1.n(u1.n(i10 >>> (24 - (i11 * 8))) & 255));
        }
        return r1.k(bArr);
    }

    @NotNull
    public static final byte[] m(long j10) {
        byte[] bArr = new byte[8];
        for (int i10 = 0; i10 < 8; i10++) {
            bArr[i10] = q1.n((byte) y1.n(y1.n(j10 >>> (i10 * 8)) & 255));
        }
        return r1.k(bArr);
    }

    @NotNull
    public static final byte[] n(int i10) {
        byte[] bArr = new byte[4];
        for (int i11 = 0; i11 < 4; i11++) {
            bArr[i11] = q1.n((byte) u1.n(u1.n(i10 >>> (i11 * 8)) & 255));
        }
        return r1.k(bArr);
    }

    @NotNull
    public static final byte[] o(@NotNull com.ionspin.kotlin.bignum.integer.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (z1.B(aVar.e1())) {
            return new byte[]{0};
        }
        if (aVar.h1() != l.NEGATIVE) {
            if (UArraysKt.m1003contentEqualslec5QzE(aVar.e1(), ea.a.f274713a.E())) {
                return new byte[]{0};
            }
            byte[] bArrH0 = aVar.H0();
            int length = bArrH0.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                }
                if (u1.n(bArrH0[i10]) != 0) {
                    break;
                }
                i10++;
            }
            if (i10 == -1) {
                i10 = 0;
            }
            return u1.n(u1.n(u1.n(bArrH0[i10]) & 255) >>> 7) != 0 ? ArraysKt.plus(new byte[]{0}, ArraysKt.sliceArray(bArrH0, r.W1(i10, bArrH0.length))) : ArraysKt.sliceArray(bArrH0, r.W1(i10, bArrH0.length));
        }
        if (z1.v(aVar.e1()) == 1 && z1.t(aVar.e1(), 0) == 1) {
            return new byte[]{-1};
        }
        byte[] bArrE = e(h(r1.k(aVar.H0())));
        int length2 = bArrE.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length2) {
                i11 = -1;
                break;
            }
            if (bArrE[i11] != -1) {
                break;
            }
            i11++;
        }
        if (i11 == -1) {
            i11 = 0;
        }
        return u1.n(u1.n(u1.n(bArrE[i11]) & 255) >>> 7) != 1 ? ArraysKt.plus(new byte[]{-1}, ArraysKt.sliceArray(bArrE, r.W1(i11, bArrE.length))) : ArraysKt.sliceArray(bArrE, r.W1(i11, bArrE.length));
    }
}
