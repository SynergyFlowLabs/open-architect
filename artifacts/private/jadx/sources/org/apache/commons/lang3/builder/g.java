package org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public class g implements a<Boolean> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ThreadLocal<Set<uk.e<k, k>>> f336972f = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f336973a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f336974b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f336975c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Class<?> f336976d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String[] f336977e = null;

    public g() {
        int i10 = 2 & 0;
    }

    private void A(Object obj, Object obj2, Class<?> cls) {
        if (y(obj, obj2)) {
            return;
        }
        try {
            G(obj, obj2);
            Field[] declaredFields = cls.getDeclaredFields();
            AccessibleObject.setAccessible(declaredFields, true);
            for (int i10 = 0; i10 < declaredFields.length && this.f336973a; i10++) {
                Field field = declaredFields[i10];
                if (!org.apache.commons.lang3.c.S(this.f336977e, field.getName()) && !field.getName().contains("$") && (this.f336974b || !Modifier.isTransient(field.getModifiers()))) {
                    if (!Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(h.class)) {
                        try {
                            g(field.get(obj), field.get(obj2));
                        } catch (IllegalAccessException unused) {
                            throw new InternalError("Unexpected IllegalAccessException");
                        }
                    }
                }
            }
            N(obj, obj2);
        } catch (Throwable th2) {
            N(obj, obj2);
            throw th2;
        }
    }

    public static boolean B(Object obj, Object obj2, Collection<String> collection) {
        return F(obj, obj2, o.w0(collection));
    }

    public static boolean C(Object obj, Object obj2, boolean z10) {
        return E(obj, obj2, z10, null, new String[0]);
    }

    public static boolean D(Object obj, Object obj2, boolean z10, Class<?> cls, boolean z11, String... strArr) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return new g().J(strArr).K(cls).M(z10).L(z11).z(obj, obj2).x();
    }

    public static boolean E(Object obj, Object obj2, boolean z10, Class<?> cls, String... strArr) {
        return D(obj, obj2, z10, cls, false, strArr);
    }

    public static boolean F(Object obj, Object obj2, String... strArr) {
        return E(obj, obj2, false, null, strArr);
    }

    private static void G(Object obj, Object obj2) {
        Set<uk.e<k, k>> setW = w();
        if (setW == null) {
            setW = new HashSet<>();
            f336972f.set(setW);
        }
        setW.add(v(obj, obj2));
    }

    private static void N(Object obj, Object obj2) {
        Set<uk.e<k, k>> setW = w();
        if (setW != null) {
            setW.remove(v(obj, obj2));
            if (setW.isEmpty()) {
                f336972f.remove();
            }
        }
    }

    private void s(Object obj, Object obj2) {
        if (obj.getClass() != obj2.getClass()) {
            I(false);
            return;
        }
        if (obj instanceof long[]) {
            o((long[]) obj, (long[]) obj2);
            return;
        }
        if (obj instanceof int[]) {
            n((int[]) obj, (int[]) obj2);
            return;
        }
        if (obj instanceof short[]) {
            q((short[]) obj, (short[]) obj2);
            return;
        }
        if (obj instanceof char[]) {
            k((char[]) obj, (char[]) obj2);
            return;
        }
        if (obj instanceof byte[]) {
            j((byte[]) obj, (byte[]) obj2);
            return;
        }
        if (obj instanceof double[]) {
            l((double[]) obj, (double[]) obj2);
            return;
        }
        if (obj instanceof float[]) {
            m((float[]) obj, (float[]) obj2);
        } else if (obj instanceof boolean[]) {
            r((boolean[]) obj, (boolean[]) obj2);
        } else {
            p((Object[]) obj, (Object[]) obj2);
        }
    }

    static uk.e<k, k> v(Object obj, Object obj2) {
        return uk.e.n(new k(obj), new k(obj2));
    }

    static Set<uk.e<k, k>> w() {
        return f336972f.get();
    }

    static boolean y(Object obj, Object obj2) {
        Set<uk.e<k, k>> setW = w();
        uk.e<k, k> eVarV = v(obj, obj2);
        uk.e eVarN = uk.e.n(eVarV.l(), eVarV.k());
        if (setW != null) {
            return setW.contains(eVarV) || setW.contains(eVarN);
        }
        return false;
    }

    public void H() {
        this.f336973a = true;
    }

    protected void I(boolean z10) {
        this.f336973a = z10;
    }

    public g J(String... strArr) {
        this.f336977e = strArr;
        return this;
    }

    public g K(Class<?> cls) {
        this.f336976d = cls;
        return this;
    }

    public g L(boolean z10) {
        this.f336975c = z10;
        return this;
    }

    public g M(boolean z10) {
        this.f336974b = z10;
        return this;
    }

    public g a(byte b10, byte b11) {
        if (!this.f336973a) {
            return this;
        }
        this.f336973a = b10 == b11;
        return this;
    }

    public g b(char c10, char c11) {
        if (!this.f336973a) {
            return this;
        }
        this.f336973a = c10 == c11;
        return this;
    }

    public g c(double d10, double d11) {
        return !this.f336973a ? this : f(Double.doubleToLongBits(d10), Double.doubleToLongBits(d11));
    }

    public g d(float f10, float f11) {
        return !this.f336973a ? this : e(Float.floatToIntBits(f10), Float.floatToIntBits(f11));
    }

    public g e(int i10, int i11) {
        if (!this.f336973a) {
            return this;
        }
        this.f336973a = i10 == i11;
        return this;
    }

    public g f(long j10, long j11) {
        if (!this.f336973a) {
            return this;
        }
        this.f336973a = j10 == j11;
        return this;
    }

    public g g(Object obj, Object obj2) {
        if (!this.f336973a || obj == obj2) {
            return this;
        }
        if (obj == null || obj2 == null) {
            I(false);
            return this;
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            s(obj, obj2);
            return this;
        }
        if (!this.f336975c || org.apache.commons.lang3.m.S(cls)) {
            this.f336973a = obj.equals(obj2);
            return this;
        }
        z(obj, obj2);
        return this;
    }

    public g h(short s10, short s11) {
        if (!this.f336973a) {
            return this;
        }
        this.f336973a = s10 == s11;
        return this;
    }

    public g i(boolean z10, boolean z11) {
        if (!this.f336973a) {
            return this;
        }
        this.f336973a = z10 == z11;
        return this;
    }

    public g j(byte[] bArr, byte[] bArr2) {
        if (this.f336973a && bArr != bArr2) {
            if (bArr == null || bArr2 == null) {
                I(false);
                return this;
            }
            if (bArr.length != bArr2.length) {
                I(false);
                return this;
            }
            for (int i10 = 0; i10 < bArr.length && this.f336973a; i10++) {
                a(bArr[i10], bArr2[i10]);
            }
        }
        return this;
    }

    public g k(char[] cArr, char[] cArr2) {
        if (this.f336973a && cArr != cArr2) {
            if (cArr != null && cArr2 != null) {
                if (cArr.length != cArr2.length) {
                    I(false);
                    return this;
                }
                for (int i10 = 0; i10 < cArr.length && this.f336973a; i10++) {
                    b(cArr[i10], cArr2[i10]);
                }
            }
            I(false);
            return this;
        }
        return this;
    }

    public g l(double[] dArr, double[] dArr2) {
        if (this.f336973a && dArr != dArr2) {
            if (dArr != null && dArr2 != null) {
                if (dArr.length != dArr2.length) {
                    I(false);
                    return this;
                }
                for (int i10 = 0; i10 < dArr.length && this.f336973a; i10++) {
                    c(dArr[i10], dArr2[i10]);
                }
            }
            I(false);
            return this;
        }
        return this;
    }

    public g m(float[] fArr, float[] fArr2) {
        if (this.f336973a && fArr != fArr2) {
            if (fArr != null && fArr2 != null) {
                if (fArr.length != fArr2.length) {
                    I(false);
                    return this;
                }
                for (int i10 = 0; i10 < fArr.length && this.f336973a; i10++) {
                    d(fArr[i10], fArr2[i10]);
                }
            }
            I(false);
            return this;
        }
        return this;
    }

    public g n(int[] iArr, int[] iArr2) {
        if (this.f336973a && iArr != iArr2) {
            if (iArr == null || iArr2 == null) {
                I(false);
                return this;
            }
            if (iArr.length != iArr2.length) {
                I(false);
                return this;
            }
            for (int i10 = 0; i10 < iArr.length && this.f336973a; i10++) {
                e(iArr[i10], iArr2[i10]);
            }
        }
        return this;
    }

    public g o(long[] jArr, long[] jArr2) {
        if (this.f336973a && jArr != jArr2) {
            if (jArr == null || jArr2 == null) {
                I(false);
                return this;
            }
            if (jArr.length != jArr2.length) {
                I(false);
                return this;
            }
            for (int i10 = 0; i10 < jArr.length && this.f336973a; i10++) {
                f(jArr[i10], jArr2[i10]);
            }
        }
        return this;
    }

    public g p(Object[] objArr, Object[] objArr2) {
        if (this.f336973a && objArr != objArr2) {
            if (objArr == null || objArr2 == null) {
                I(false);
                return this;
            }
            if (objArr.length != objArr2.length) {
                I(false);
                return this;
            }
            for (int i10 = 0; i10 < objArr.length && this.f336973a; i10++) {
                g(objArr[i10], objArr2[i10]);
            }
        }
        return this;
    }

    public g q(short[] sArr, short[] sArr2) {
        if (this.f336973a && sArr != sArr2) {
            if (sArr == null || sArr2 == null) {
                I(false);
                return this;
            }
            if (sArr.length != sArr2.length) {
                I(false);
                return this;
            }
            for (int i10 = 0; i10 < sArr.length && this.f336973a; i10++) {
                h(sArr[i10], sArr2[i10]);
            }
        }
        return this;
    }

    public g r(boolean[] zArr, boolean[] zArr2) {
        if (this.f336973a && zArr != zArr2) {
            if (zArr != null && zArr2 != null) {
                if (zArr.length != zArr2.length) {
                    I(false);
                    return this;
                }
                for (int i10 = 0; i10 < zArr.length && this.f336973a; i10++) {
                    i(zArr[i10], zArr2[i10]);
                }
            }
            I(false);
            return this;
        }
        return this;
    }

    public g t(boolean z10) {
        if (!this.f336973a) {
            return this;
        }
        this.f336973a = z10;
        return this;
    }

    @Override // org.apache.commons.lang3.builder.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Boolean build() {
        return Boolean.valueOf(x());
    }

    public boolean x() {
        return this.f336973a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    public g z(Object obj, Object obj2) {
        if (this.f336973a && obj != obj2) {
            if (obj == null || obj2 == null) {
                this.f336973a = false;
                return this;
            }
            Class<?> superclass = obj.getClass();
            Class<?> cls = obj2.getClass();
            if (superclass.isInstance(obj2)) {
                if (!cls.isInstance(obj)) {
                    superclass = cls;
                }
            } else {
                if (!cls.isInstance(obj)) {
                    this.f336973a = false;
                    return this;
                }
                if (superclass.isInstance(obj2)) {
                    superclass = cls;
                }
            }
            try {
                if (superclass.isArray()) {
                    g(obj, obj2);
                    return this;
                }
                A(obj, obj2, superclass);
                while (superclass.getSuperclass() != null && superclass != this.f336976d) {
                    superclass = superclass.getSuperclass();
                    A(obj, obj2, superclass);
                }
            } catch (IllegalArgumentException unused) {
                this.f336973a = false;
                return this;
            }
        }
        return this;
    }
}
