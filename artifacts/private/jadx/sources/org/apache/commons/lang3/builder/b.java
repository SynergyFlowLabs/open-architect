package org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Comparator;

/* JADX INFO: loaded from: classes14.dex */
public class b implements a<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f336885a = 0;

    public static int A(Object obj, Object obj2, boolean z10) {
        return B(obj, obj2, z10, null, new String[0]);
    }

    public static int B(Object obj, Object obj2, boolean z10, Class<?> cls, String... strArr) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null || obj2 == null) {
            throw null;
        }
        Class<?> cls2 = obj.getClass();
        if (!cls2.isInstance(obj2)) {
            throw new ClassCastException();
        }
        b bVar = new b();
        boolean z11 = z10;
        String[] strArr2 = strArr;
        x(obj, obj2, cls2, bVar, z11, strArr2);
        while (cls2.getSuperclass() != null && cls2 != cls) {
            Class<? super Object> superclass = cls2.getSuperclass();
            b bVar2 = bVar;
            boolean z12 = z11;
            String[] strArr3 = strArr2;
            x(obj, obj2, superclass, bVar2, z12, strArr3);
            cls2 = superclass;
            bVar = bVar2;
            z11 = z12;
            strArr2 = strArr3;
        }
        return bVar.D();
    }

    public static int C(Object obj, Object obj2, String... strArr) {
        return B(obj, obj2, false, null, strArr);
    }

    private void u(Object obj, Object obj2, Comparator<?> comparator) {
        if (obj instanceof long[]) {
            p((long[]) obj, (long[]) obj2);
            return;
        }
        if (obj instanceof int[]) {
            o((int[]) obj, (int[]) obj2);
            return;
        }
        if (obj instanceof short[]) {
            s((short[]) obj, (short[]) obj2);
            return;
        }
        if (obj instanceof char[]) {
            l((char[]) obj, (char[]) obj2);
            return;
        }
        if (obj instanceof byte[]) {
            k((byte[]) obj, (byte[]) obj2);
            return;
        }
        if (obj instanceof double[]) {
            m((double[]) obj, (double[]) obj2);
            return;
        }
        if (obj instanceof float[]) {
            n((float[]) obj, (float[]) obj2);
        } else if (obj instanceof boolean[]) {
            t((boolean[]) obj, (boolean[]) obj2);
        } else {
            r((Object[]) obj, (Object[]) obj2, comparator);
        }
    }

    private static void x(Object obj, Object obj2, Class<?> cls, b bVar, boolean z10, String[] strArr) {
        Field[] declaredFields = cls.getDeclaredFields();
        AccessibleObject.setAccessible(declaredFields, true);
        for (int i10 = 0; i10 < declaredFields.length && bVar.f336885a == 0; i10++) {
            Field field = declaredFields[i10];
            if (!org.apache.commons.lang3.c.S(strArr, field.getName()) && !field.getName().contains("$") && ((z10 || !Modifier.isTransient(field.getModifiers())) && !Modifier.isStatic(field.getModifiers()))) {
                try {
                    bVar.g(field.get(obj), field.get(obj2));
                } catch (IllegalAccessException unused) {
                    throw new InternalError("Unexpected IllegalAccessException");
                }
            }
        }
    }

    public static int y(Object obj, Object obj2) {
        return B(obj, obj2, false, null, new String[0]);
    }

    public static int z(Object obj, Object obj2, Collection<String> collection) {
        return C(obj, obj2, o.w0(collection));
    }

    public int D() {
        return this.f336885a;
    }

    public b a(byte b10, byte b11) {
        int i10;
        if (this.f336885a != 0) {
            return this;
        }
        if (b10 < b11) {
            i10 = -1;
        } else {
            i10 = b10 > b11 ? 1 : 0;
        }
        this.f336885a = i10;
        return this;
    }

    public b b(char c10, char c11) {
        int i10;
        if (this.f336885a != 0) {
            return this;
        }
        if (c10 < c11) {
            i10 = -1;
        } else {
            i10 = c10 > c11 ? 1 : 0;
        }
        this.f336885a = i10;
        return this;
    }

    public b c(double d10, double d11) {
        if (this.f336885a != 0) {
            return this;
        }
        this.f336885a = Double.compare(d10, d11);
        return this;
    }

    public b d(float f10, float f11) {
        if (this.f336885a != 0) {
            return this;
        }
        this.f336885a = Float.compare(f10, f11);
        return this;
    }

    public b e(int i10, int i11) {
        int i12;
        if (this.f336885a != 0) {
            return this;
        }
        if (i10 < i11) {
            i12 = -1;
        } else {
            i12 = i10 > i11 ? 1 : 0;
        }
        this.f336885a = i12;
        return this;
    }

    public b f(long j10, long j11) {
        int i10;
        if (this.f336885a != 0) {
            return this;
        }
        if (j10 < j11) {
            i10 = -1;
        } else {
            i10 = j10 > j11 ? 1 : 0;
        }
        this.f336885a = i10;
        return this;
    }

    public b g(Object obj, Object obj2) {
        return h(obj, obj2, null);
    }

    public b h(Object obj, Object obj2, Comparator<?> comparator) {
        if (this.f336885a != 0 || obj == obj2) {
            return this;
        }
        if (obj == null) {
            this.f336885a = -1;
            return this;
        }
        if (obj2 == null) {
            this.f336885a = 1;
            return this;
        }
        if (obj.getClass().isArray()) {
            u(obj, obj2, comparator);
            return this;
        }
        if (comparator == null) {
            this.f336885a = ((Comparable) obj).compareTo(obj2);
            return this;
        }
        this.f336885a = comparator.compare(obj, obj2);
        return this;
    }

    public b i(short s10, short s11) {
        int i10;
        if (this.f336885a != 0) {
            return this;
        }
        if (s10 < s11) {
            i10 = -1;
        } else {
            i10 = s10 > s11 ? 1 : 0;
        }
        this.f336885a = i10;
        return this;
    }

    public b j(boolean z10, boolean z11) {
        if (this.f336885a != 0 || z10 == z11) {
            return this;
        }
        if (z10) {
            this.f336885a = 1;
            return this;
        }
        this.f336885a = -1;
        return this;
    }

    public b k(byte[] bArr, byte[] bArr2) {
        if (this.f336885a == 0 && bArr != bArr2) {
            int i10 = -1;
            if (bArr == null) {
                this.f336885a = -1;
                return this;
            }
            if (bArr2 == null) {
                this.f336885a = 1;
                return this;
            }
            if (bArr.length != bArr2.length) {
                if (bArr.length >= bArr2.length) {
                    i10 = 1;
                }
                this.f336885a = i10;
                return this;
            }
            for (int i11 = 0; i11 < bArr.length && this.f336885a == 0; i11++) {
                a(bArr[i11], bArr2[i11]);
            }
        }
        return this;
    }

    public b l(char[] cArr, char[] cArr2) {
        if (this.f336885a == 0 && cArr != cArr2) {
            if (cArr == null) {
                this.f336885a = -1;
                return this;
            }
            if (cArr2 == null) {
                this.f336885a = 1;
                return this;
            }
            if (cArr.length != cArr2.length) {
                this.f336885a = cArr.length >= cArr2.length ? 1 : -1;
                return this;
            }
            for (int i10 = 0; i10 < cArr.length && this.f336885a == 0; i10++) {
                b(cArr[i10], cArr2[i10]);
            }
        }
        return this;
    }

    public b m(double[] dArr, double[] dArr2) {
        if (this.f336885a == 0 && dArr != dArr2) {
            int i10 = -1;
            if (dArr == null) {
                this.f336885a = -1;
                return this;
            }
            if (dArr2 == null) {
                this.f336885a = 1;
                return this;
            }
            if (dArr.length != dArr2.length) {
                if (dArr.length >= dArr2.length) {
                    i10 = 1;
                }
                this.f336885a = i10;
                return this;
            }
            for (int i11 = 0; i11 < dArr.length && this.f336885a == 0; i11++) {
                c(dArr[i11], dArr2[i11]);
            }
        }
        return this;
    }

    public b n(float[] fArr, float[] fArr2) {
        if (this.f336885a == 0 && fArr != fArr2) {
            if (fArr == null) {
                this.f336885a = -1;
                return this;
            }
            if (fArr2 == null) {
                this.f336885a = 1;
                return this;
            }
            if (fArr.length != fArr2.length) {
                this.f336885a = fArr.length >= fArr2.length ? 1 : -1;
                return this;
            }
            for (int i10 = 0; i10 < fArr.length && this.f336885a == 0; i10++) {
                d(fArr[i10], fArr2[i10]);
            }
        }
        return this;
    }

    public b o(int[] iArr, int[] iArr2) {
        if (this.f336885a == 0 && iArr != iArr2) {
            if (iArr == null) {
                this.f336885a = -1;
                return this;
            }
            if (iArr2 == null) {
                this.f336885a = 1;
                return this;
            }
            if (iArr.length != iArr2.length) {
                this.f336885a = iArr.length >= iArr2.length ? 1 : -1;
                return this;
            }
            for (int i10 = 0; i10 < iArr.length && this.f336885a == 0; i10++) {
                e(iArr[i10], iArr2[i10]);
            }
        }
        return this;
    }

    public b p(long[] jArr, long[] jArr2) {
        if (this.f336885a == 0 && jArr != jArr2) {
            if (jArr == null) {
                this.f336885a = -1;
                return this;
            }
            if (jArr2 == null) {
                this.f336885a = 1;
                return this;
            }
            if (jArr.length != jArr2.length) {
                this.f336885a = jArr.length >= jArr2.length ? 1 : -1;
                return this;
            }
            for (int i10 = 0; i10 < jArr.length && this.f336885a == 0; i10++) {
                f(jArr[i10], jArr2[i10]);
            }
        }
        return this;
    }

    public b q(Object[] objArr, Object[] objArr2) {
        return r(objArr, objArr2, null);
    }

    public b r(Object[] objArr, Object[] objArr2, Comparator<?> comparator) {
        if (this.f336885a == 0 && objArr != objArr2) {
            if (objArr == null) {
                this.f336885a = -1;
                return this;
            }
            if (objArr2 == null) {
                this.f336885a = 1;
                return this;
            }
            if (objArr.length != objArr2.length) {
                this.f336885a = objArr.length >= objArr2.length ? 1 : -1;
                return this;
            }
            for (int i10 = 0; i10 < objArr.length && this.f336885a == 0; i10++) {
                h(objArr[i10], objArr2[i10], comparator);
            }
        }
        return this;
    }

    public b s(short[] sArr, short[] sArr2) {
        if (this.f336885a == 0 && sArr != sArr2) {
            if (sArr == null) {
                this.f336885a = -1;
                return this;
            }
            if (sArr2 == null) {
                this.f336885a = 1;
                return this;
            }
            if (sArr.length != sArr2.length) {
                this.f336885a = sArr.length >= sArr2.length ? 1 : -1;
                return this;
            }
            for (int i10 = 0; i10 < sArr.length && this.f336885a == 0; i10++) {
                i(sArr[i10], sArr2[i10]);
            }
        }
        return this;
    }

    public b t(boolean[] zArr, boolean[] zArr2) {
        if (this.f336885a == 0 && zArr != zArr2) {
            int i10 = -1;
            if (zArr == null) {
                this.f336885a = -1;
                return this;
            }
            if (zArr2 == null) {
                this.f336885a = 1;
                return this;
            }
            if (zArr.length != zArr2.length) {
                if (zArr.length >= zArr2.length) {
                    i10 = 1;
                }
                this.f336885a = i10;
                return this;
            }
            for (int i11 = 0; i11 < zArr.length && this.f336885a == 0; i11++) {
                j(zArr[i11], zArr2[i11]);
            }
        }
        return this;
    }

    public b v(int i10) {
        if (this.f336885a != 0) {
            return this;
        }
        this.f336885a = i10;
        return this;
    }

    @Override // org.apache.commons.lang3.builder.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Integer build() {
        return Integer.valueOf(D());
    }
}
