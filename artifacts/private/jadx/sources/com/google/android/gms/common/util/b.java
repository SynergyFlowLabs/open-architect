package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public final class b {
    private b() {
    }

    @NonNull
    @g6.a
    public static <T> T[] a(@NonNull T[]... tArr) {
        if (tArr.length == 0) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass(), 0));
        }
        int length = 0;
        for (T[] tArr2 : tArr) {
            length += tArr2.length;
        }
        T[] tArr3 = (T[]) Arrays.copyOf(tArr[0], length);
        int length2 = tArr[0].length;
        for (int i10 = 1; i10 < tArr.length; i10++) {
            T[] tArr4 = tArr[i10];
            int length3 = tArr4.length;
            System.arraycopy(tArr4, 0, tArr3, length2, length3);
            length2 += length3;
        }
        return tArr3;
    }

    @NonNull
    @g6.a
    public static byte[] b(@NonNull byte[]... bArr) {
        if (bArr.length == 0) {
            return new byte[0];
        }
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr[0], length);
        int length2 = bArr[0].length;
        for (int i10 = 1; i10 < bArr.length; i10++) {
            byte[] bArr3 = bArr[i10];
            int length3 = bArr3.length;
            System.arraycopy(bArr3, 0, bArrCopyOf, length2, length3);
            length2 += length3;
        }
        return bArrCopyOf;
    }

    @g6.a
    public static boolean c(@p0 int[] iArr, int i10) {
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    @g6.a
    public static <T> boolean d(@NonNull T[] tArr, @p0 T t10) {
        int length = tArr != null ? tArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (com.google.android.gms.common.internal.u.b(tArr[i10], t10)) {
                if (i10 < 0) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    @NonNull
    @g6.a
    public static <T> ArrayList<T> e() {
        return new ArrayList<>();
    }

    @p0
    @g6.a
    public static <T> T[] f(@NonNull T[] tArr, @NonNull T... tArr2) {
        int length;
        int i10;
        if (tArr == null) {
            return null;
        }
        if (tArr2 == null || (length = tArr2.length) == 0) {
            return (T[]) Arrays.copyOf(tArr, tArr.length);
        }
        Class<?> cls = tArr2.getClass();
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(cls.getComponentType(), tArr.length));
        if (length == 1) {
            i10 = 0;
            for (T t10 : tArr) {
                if (!com.google.android.gms.common.internal.u.b(tArr2[0], t10)) {
                    tArr3[i10] = t10;
                    i10++;
                }
            }
        } else {
            int i11 = 0;
            for (T t11 : tArr) {
                if (!d(tArr2, t11)) {
                    tArr3[i11] = t11;
                    i11++;
                }
            }
            i10 = i11;
        }
        if (tArr3 == null) {
            return null;
        }
        return i10 == tArr3.length ? tArr3 : (T[]) Arrays.copyOf(tArr3, i10);
    }

    @NonNull
    @g6.a
    public static <T> ArrayList<T> g(@NonNull T[] tArr) {
        ArrayList<T> arrayList = new ArrayList<>(tArr.length);
        for (T t10 : tArr) {
            arrayList.add(t10);
        }
        return arrayList;
    }

    @NonNull
    @g6.a
    public static int[] h(@p0 Collection<Integer> collection) {
        int i10 = 0;
        if (collection == null || collection.isEmpty()) {
            return new int[0];
        }
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        return iArr;
    }

    @p0
    @g6.a
    public static Integer[] i(@p0 int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i10 = 0; i10 < length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    @g6.a
    public static void j(@NonNull StringBuilder sb2, @NonNull double[] dArr) {
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(dArr[i10]);
        }
    }

    @g6.a
    public static void k(@NonNull StringBuilder sb2, @NonNull float[] fArr) {
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(fArr[i10]);
        }
    }

    @g6.a
    public static void l(@NonNull StringBuilder sb2, @NonNull int[] iArr) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(iArr[i10]);
        }
    }

    @g6.a
    public static void m(@NonNull StringBuilder sb2, @NonNull long[] jArr) {
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(jArr[i10]);
        }
    }

    @g6.a
    public static <T> void n(@NonNull StringBuilder sb2, @NonNull T[] tArr) {
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(tArr[i10]);
        }
    }

    @g6.a
    public static void o(@NonNull StringBuilder sb2, @NonNull boolean[] zArr) {
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(zArr[i10]);
        }
    }

    @g6.a
    public static void p(@NonNull StringBuilder sb2, @NonNull String[] strArr) {
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append("\"");
            sb2.append(strArr[i10]);
            sb2.append("\"");
        }
    }
}
