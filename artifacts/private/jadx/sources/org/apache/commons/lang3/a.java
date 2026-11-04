package org.apache.commons.lang3;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final org.apache.commons.lang3.builder.s f336827a = new C2403a();

    /* JADX INFO: renamed from: org.apache.commons.lang3.a$a, reason: collision with other inner class name */
    static class C2403a extends org.apache.commons.lang3.builder.s {

        /* JADX INFO: renamed from: j3, reason: collision with root package name */
        private static final long f336828j3 = 1;

        C2403a() {
            S0(true);
            M0(true);
            c1(true);
            f1(true);
            e1(false);
            R0("(");
            Q0(")");
            U0(", ");
            P0("[");
            N0("]");
        }

        @Override // org.apache.commons.lang3.builder.s
        protected void C(StringBuffer stringBuffer, String str, Object obj) {
            if (obj instanceof Annotation) {
                obj = a.i((Annotation) obj);
            }
            super.C(stringBuffer, str, obj);
        }

        @Override // org.apache.commons.lang3.builder.s
        protected String u0(Class<?> cls) {
            Class<?> next;
            Iterator<Class<?>> it = m.e(cls).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Annotation.class.isAssignableFrom(next));
            return new StringBuilder(next == null ? "" : next.getName()).insert(0, '@').toString();
        }
    }

    private static boolean a(Annotation[] annotationArr, Annotation[] annotationArr2) {
        if (annotationArr.length != annotationArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < annotationArr.length; i10++) {
            if (!d(annotationArr[i10], annotationArr2[i10])) {
                return false;
            }
        }
        return true;
    }

    private static boolean b(Class<?> cls, Object obj, Object obj2) {
        if (cls.isAnnotation()) {
            return a((Annotation[]) obj, (Annotation[]) obj2);
        }
        if (cls.equals(Byte.TYPE)) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if (cls.equals(Short.TYPE)) {
            return Arrays.equals((short[]) obj, (short[]) obj2);
        }
        if (cls.equals(Integer.TYPE)) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if (cls.equals(Character.TYPE)) {
            return Arrays.equals((char[]) obj, (char[]) obj2);
        }
        if (cls.equals(Long.TYPE)) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if (cls.equals(Float.TYPE)) {
            return Arrays.equals((float[]) obj, (float[]) obj2);
        }
        if (cls.equals(Double.TYPE)) {
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        return cls.equals(Boolean.TYPE) ? Arrays.equals((boolean[]) obj, (boolean[]) obj2) : Arrays.equals((Object[]) obj, (Object[]) obj2);
    }

    private static int c(Class<?> cls, Object obj) {
        if (cls.equals(Byte.TYPE)) {
            return Arrays.hashCode((byte[]) obj);
        }
        if (cls.equals(Short.TYPE)) {
            return Arrays.hashCode((short[]) obj);
        }
        if (cls.equals(Integer.TYPE)) {
            return Arrays.hashCode((int[]) obj);
        }
        if (cls.equals(Character.TYPE)) {
            return Arrays.hashCode((char[]) obj);
        }
        if (cls.equals(Long.TYPE)) {
            return Arrays.hashCode((long[]) obj);
        }
        if (cls.equals(Float.TYPE)) {
            return Arrays.hashCode((float[]) obj);
        }
        if (cls.equals(Double.TYPE)) {
            return Arrays.hashCode((double[]) obj);
        }
        return cls.equals(Boolean.TYPE) ? Arrays.hashCode((boolean[]) obj) : Arrays.hashCode((Object[]) obj);
    }

    public static boolean d(Annotation annotation, Annotation annotation2) {
        if (annotation == annotation2) {
            return true;
        }
        if (annotation != null && annotation2 != null) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            Class<? extends Annotation> clsAnnotationType2 = annotation2.annotationType();
            c0.P(clsAnnotationType, "Annotation %s with null annotationType()", annotation);
            c0.P(clsAnnotationType2, "Annotation %s with null annotationType()", annotation2);
            if (!clsAnnotationType.equals(clsAnnotationType2)) {
                return false;
            }
            try {
                for (Method method : clsAnnotationType.getDeclaredMethods()) {
                    if (method.getParameterTypes().length == 0 && g(method.getReturnType())) {
                        if (!h(method.getReturnType(), method.invoke(annotation, null), method.invoke(annotation2, null))) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return false;
    }

    public static int e(Annotation annotation) {
        int iF = 0;
        for (Method method : annotation.annotationType().getDeclaredMethods()) {
            try {
                Object objInvoke = method.invoke(annotation, null);
                if (objInvoke == null) {
                    throw new IllegalStateException(String.format("Annotation method %s returned null", method));
                }
                iF += f(method.getName(), objInvoke);
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        }
        return iF;
    }

    private static int f(String str, Object obj) {
        int iE;
        int iHashCode = str.hashCode() * 127;
        if (obj.getClass().isArray()) {
            iE = c(obj.getClass().getComponentType(), obj);
        } else {
            iE = obj instanceof Annotation ? e((Annotation) obj) : obj.hashCode();
        }
        return iHashCode ^ iE;
    }

    public static boolean g(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        if (cls.isArray()) {
            cls = cls.getComponentType();
        }
        return cls.isPrimitive() || cls.isEnum() || cls.isAnnotation() || String.class.equals(cls) || Class.class.equals(cls);
    }

    private static boolean h(Class<?> cls, Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if (cls.isArray()) {
            return b(cls.getComponentType(), obj, obj2);
        }
        return cls.isAnnotation() ? d((Annotation) obj, (Annotation) obj2) : obj.equals(obj2);
    }

    public static String i(Annotation annotation) {
        org.apache.commons.lang3.builder.q qVar = new org.apache.commons.lang3.builder.q(annotation, f336827a);
        for (Method method : annotation.annotationType().getDeclaredMethods()) {
            if (method.getParameterTypes().length <= 0) {
                try {
                    qVar.n(method.getName(), method.invoke(annotation, null));
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
        }
        return qVar.build();
    }
}
