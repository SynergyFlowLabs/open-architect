package org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.apache.commons.lang3.c0;

/* JADX INFO: loaded from: classes14.dex */
public class o extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f336992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f336993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f336994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected String[] f336995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Class<?> f336996i;

    public o(Object obj) {
        super(j0(obj));
        this.f336992e = false;
        this.f336993f = false;
        this.f336996i = null;
    }

    public static String A0(Object obj, s sVar, boolean z10) {
        return C0(obj, sVar, z10, false, null);
    }

    public static String B0(Object obj, s sVar, boolean z10, boolean z11) {
        return C0(obj, sVar, z10, z11, null);
    }

    public static <T> String C0(T t10, s sVar, boolean z10, boolean z11, Class<? super T> cls) {
        return new o(t10, sVar, null, cls, z10, z11).toString();
    }

    public static <T> String D0(T t10, s sVar, boolean z10, boolean z11, boolean z12, Class<? super T> cls) {
        return new o(t10, sVar, null, cls, z10, z11, z12).toString();
    }

    public static String E0(Object obj, Collection<String> collection) {
        return F0(obj, w0(collection));
    }

    public static String F0(Object obj, String... strArr) {
        return new o(obj).t0(strArr).toString();
    }

    private static Object j0(Object obj) {
        c0.v(obj != null, "The Object passed in should not be null.", new Object[0]);
        return obj;
    }

    static String[] w0(Collection<String> collection) {
        return collection == null ? org.apache.commons.lang3.c.f337037c : x0(collection.toArray());
    }

    static String[] x0(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj.toString());
            }
        }
        return (String[]) arrayList.toArray(org.apache.commons.lang3.c.f337037c);
    }

    public static String y0(Object obj) {
        return C0(obj, null, false, false, null);
    }

    public static String z0(Object obj, s sVar) {
        return C0(obj, sVar, false, false, null);
    }

    protected boolean h0(Field field) {
        if (field.getName().indexOf(36) != -1) {
            return false;
        }
        if (Modifier.isTransient(field.getModifiers()) && !o0()) {
            return false;
        }
        if (Modifier.isStatic(field.getModifiers()) && !n0()) {
            return false;
        }
        String[] strArr = this.f336995h;
        if (strArr == null || Arrays.binarySearch(strArr, field.getName()) < 0) {
            return !field.isAnnotationPresent(r.class);
        }
        return false;
    }

    protected void i0(Class<?> cls) {
        if (cls.isArray()) {
            q0(Z());
            return;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        AccessibleObject.setAccessible(declaredFields, true);
        for (Field field : declaredFields) {
            String name = field.getName();
            if (h0(field)) {
                try {
                    Object objM0 = m0(field);
                    if (!this.f336994g || objM0 != null) {
                        n(name, objM0);
                    }
                } catch (IllegalAccessException e10) {
                    throw new InternalError("Unexpected IllegalAccessException: " + e10.getMessage());
                }
            }
        }
    }

    public String[] k0() {
        return (String[]) this.f336995h.clone();
    }

    public Class<?> l0() {
        return this.f336996i;
    }

    protected Object m0(Field field) throws IllegalAccessException, IllegalArgumentException {
        return field.get(Z());
    }

    public boolean n0() {
        return this.f336992e;
    }

    public boolean o0() {
        return this.f336993f;
    }

    public boolean p0() {
        return this.f336994g;
    }

    public o q0(Object obj) {
        b0().J0(a0(), null, obj);
        return this;
    }

    public void r0(boolean z10) {
        this.f336992e = z10;
    }

    public void s0(boolean z10) {
        this.f336993f = z10;
    }

    public o t0(String... strArr) {
        if (strArr == null) {
            int i10 = 4 >> 0;
            this.f336995h = null;
            return this;
        }
        String[] strArrX0 = x0(strArr);
        this.f336995h = strArrX0;
        Arrays.sort(strArrX0);
        return this;
    }

    @Override // org.apache.commons.lang3.builder.q
    public String toString() {
        if (Z() == null) {
            return b0().s0();
        }
        Class<?> superclass = Z().getClass();
        i0(superclass);
        while (superclass.getSuperclass() != null && superclass != l0()) {
            superclass = superclass.getSuperclass();
            i0(superclass);
        }
        return super.toString();
    }

    public void u0(boolean z10) {
        this.f336994g = z10;
    }

    public void v0(Class<?> cls) {
        Object objZ;
        if (cls != null && (objZ = Z()) != null && !cls.isInstance(objZ)) {
            throw new IllegalArgumentException("Specified class is not a superclass of the object");
        }
        this.f336996i = cls;
    }

    public o(Object obj, s sVar) {
        super(j0(obj), sVar);
        this.f336992e = false;
        this.f336993f = false;
        this.f336996i = null;
    }

    public o(Object obj, s sVar, StringBuffer stringBuffer) {
        super(j0(obj), sVar, stringBuffer);
        this.f336992e = false;
        this.f336993f = false;
        this.f336996i = null;
    }

    public <T> o(T t10, s sVar, StringBuffer stringBuffer, Class<? super T> cls, boolean z10, boolean z11) {
        super(j0(t10), sVar, stringBuffer);
        this.f336992e = false;
        this.f336993f = false;
        this.f336996i = null;
        v0(cls);
        s0(z10);
        r0(z11);
    }

    public <T> o(T t10, s sVar, StringBuffer stringBuffer, Class<? super T> cls, boolean z10, boolean z11, boolean z12) {
        super(j0(t10), sVar, stringBuffer);
        this.f336992e = false;
        this.f336993f = false;
        this.f336996i = null;
        v0(cls);
        s0(z10);
        r0(z11);
        u0(z12);
    }
}
