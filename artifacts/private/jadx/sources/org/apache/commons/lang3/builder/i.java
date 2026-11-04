package org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.c0;

/* JADX INFO: loaded from: classes14.dex */
public class i implements a<Integer> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f336978c = 17;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f336979d = 37;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ThreadLocal<Set<k>> f336980e = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f336981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f336982b;

    public i() {
        this.f336981a = 37;
        this.f336982b = 17;
    }

    public static <T> int A(int i10, int i11, T t10, boolean z10, Class<? super T> cls, String... strArr) {
        c0.v(t10 != null, "The object to build a hash code for must not be null", new Object[0]);
        i iVar = new i(i10, i11);
        Class<?> superclass = t10.getClass();
        x(t10, superclass, iVar, z10, strArr);
        while (superclass.getSuperclass() != null && superclass != cls) {
            superclass = superclass.getSuperclass();
            x(t10, superclass, iVar, z10, strArr);
        }
        return iVar.F();
    }

    public static int B(Object obj, Collection<String> collection) {
        return D(obj, o.w0(collection));
    }

    public static int C(Object obj, boolean z10) {
        return A(17, 37, obj, z10, null, new String[0]);
    }

    public static int D(Object obj, String... strArr) {
        return A(17, 37, obj, false, null, strArr);
    }

    private static void E(Object obj) {
        Set<k> setV = v();
        if (setV == null) {
            setV = new HashSet<>();
            f336980e.set(setV);
        }
        setV.add(new k(obj));
    }

    private static void G(Object obj) {
        Set<k> setV = v();
        if (setV != null) {
            setV.remove(new k(obj));
            if (setV.isEmpty()) {
                f336980e.remove();
            }
        }
    }

    private void s(Object obj) {
        if (obj instanceof long[]) {
            o((long[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            n((int[]) obj);
            return;
        }
        if (obj instanceof short[]) {
            q((short[]) obj);
            return;
        }
        if (obj instanceof char[]) {
            k((char[]) obj);
            return;
        }
        if (obj instanceof byte[]) {
            j((byte[]) obj);
            return;
        }
        if (obj instanceof double[]) {
            l((double[]) obj);
            return;
        }
        if (obj instanceof float[]) {
            m((float[]) obj);
        } else if (obj instanceof boolean[]) {
            r((boolean[]) obj);
        } else {
            p((Object[]) obj);
        }
    }

    static Set<k> v() {
        return f336980e.get();
    }

    static boolean w(Object obj) {
        Set<k> setV = v();
        return setV != null && setV.contains(new k(obj));
    }

    private static void x(Object obj, Class<?> cls, i iVar, boolean z10, String[] strArr) {
        if (w(obj)) {
            return;
        }
        try {
            E(obj);
            Field[] declaredFields = cls.getDeclaredFields();
            AccessibleObject.setAccessible(declaredFields, true);
            for (Field field : declaredFields) {
                if (!org.apache.commons.lang3.c.S(strArr, field.getName()) && !field.getName().contains("$") && (z10 || !Modifier.isTransient(field.getModifiers()))) {
                    if (!Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(j.class)) {
                        try {
                            iVar.g(field.get(obj));
                        } catch (IllegalAccessException unused) {
                            throw new InternalError("Unexpected IllegalAccessException");
                        }
                    }
                }
            }
            G(obj);
        } catch (Throwable th2) {
            G(obj);
            throw th2;
        }
    }

    public static int y(int i10, int i11, Object obj) {
        return A(i10, i11, obj, false, null, new String[0]);
    }

    public static int z(int i10, int i11, Object obj, boolean z10) {
        int i12 = 2 >> 0;
        return A(i10, i11, obj, z10, null, new String[0]);
    }

    public int F() {
        return this.f336982b;
    }

    public i a(byte b10) {
        this.f336982b = (this.f336982b * this.f336981a) + b10;
        return this;
    }

    public i b(char c10) {
        this.f336982b = (this.f336982b * this.f336981a) + c10;
        return this;
    }

    public i c(double d10) {
        return f(Double.doubleToLongBits(d10));
    }

    public i d(float f10) {
        this.f336982b = (this.f336982b * this.f336981a) + Float.floatToIntBits(f10);
        return this;
    }

    public i e(int i10) {
        this.f336982b = (this.f336982b * this.f336981a) + i10;
        return this;
    }

    public i f(long j10) {
        this.f336982b = (this.f336982b * this.f336981a) + ((int) (j10 ^ (j10 >> 32)));
        return this;
    }

    public i g(Object obj) {
        if (obj == null) {
            this.f336982b *= this.f336981a;
            return this;
        }
        if (obj.getClass().isArray()) {
            s(obj);
            return this;
        }
        this.f336982b = (this.f336982b * this.f336981a) + obj.hashCode();
        return this;
    }

    public i h(short s10) {
        this.f336982b = (this.f336982b * this.f336981a) + s10;
        return this;
    }

    public int hashCode() {
        return F();
    }

    public i i(boolean z10) {
        this.f336982b = (this.f336982b * this.f336981a) + (!z10 ? 1 : 0);
        return this;
    }

    public i j(byte[] bArr) {
        if (bArr == null) {
            this.f336982b *= this.f336981a;
            return this;
        }
        for (byte b10 : bArr) {
            a(b10);
        }
        return this;
    }

    public i k(char[] cArr) {
        if (cArr == null) {
            this.f336982b *= this.f336981a;
            return this;
        }
        for (char c10 : cArr) {
            b(c10);
        }
        return this;
    }

    public i l(double[] dArr) {
        if (dArr == null) {
            this.f336982b *= this.f336981a;
            return this;
        }
        for (double d10 : dArr) {
            c(d10);
        }
        return this;
    }

    public i m(float[] fArr) {
        if (fArr == null) {
            this.f336982b *= this.f336981a;
            return this;
        }
        for (float f10 : fArr) {
            d(f10);
        }
        return this;
    }

    public i n(int[] iArr) {
        if (iArr == null) {
            this.f336982b *= this.f336981a;
            return this;
        }
        for (int i10 : iArr) {
            e(i10);
        }
        return this;
    }

    public i o(long[] jArr) {
        if (jArr == null) {
            this.f336982b *= this.f336981a;
            return this;
        }
        for (long j10 : jArr) {
            f(j10);
        }
        return this;
    }

    public i p(Object[] objArr) {
        if (objArr == null) {
            this.f336982b *= this.f336981a;
            return this;
        }
        for (Object obj : objArr) {
            g(obj);
        }
        return this;
    }

    public i q(short[] sArr) {
        if (sArr == null) {
            this.f336982b *= this.f336981a;
            return this;
        }
        for (short s10 : sArr) {
            h(s10);
        }
        return this;
    }

    public i r(boolean[] zArr) {
        if (zArr == null) {
            this.f336982b *= this.f336981a;
            return this;
        }
        for (boolean z10 : zArr) {
            i(z10);
        }
        return this;
    }

    public i t(int i10) {
        this.f336982b = (this.f336982b * this.f336981a) + i10;
        return this;
    }

    @Override // org.apache.commons.lang3.builder.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Integer build() {
        return Integer.valueOf(F());
    }

    public i(int i10, int i11) {
        this.f336982b = 0;
        c0.v(i10 % 2 != 0, "HashCodeBuilder requires an odd initial value", new Object[0]);
        c0.v(i11 % 2 != 0, "HashCodeBuilder requires an odd multiplier", new Object[0]);
        this.f336981a = i11;
        this.f336982b = i10;
    }
}
