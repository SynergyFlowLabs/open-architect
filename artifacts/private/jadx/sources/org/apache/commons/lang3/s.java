package org.apache.commons.lang3;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes14.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f337271a = new a();

    public static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final long f337272a = 7092611880189329093L;

        a() {
        }

        private Object readResolve() {
            return s.f337271a;
        }
    }

    @Deprecated
    public static void A(org.apache.commons.lang3.text.e eVar, Object obj) {
        c0.P(obj, "Cannot get the toString of a null identity", new Object[0]);
        eVar.i(obj.getClass().getName()).append('@').i(Integer.toHexString(System.identityHashCode(obj)));
    }

    @SafeVarargs
    public static <T extends Comparable<? super T>> T B(T... tArr) {
        T t10 = null;
        if (tArr != null) {
            for (T t11 : tArr) {
                if (q(t11, t10, false) > 0) {
                    t10 = t11;
                }
            }
        }
        return t10;
    }

    @SafeVarargs
    public static <T extends Comparable<? super T>> T C(T... tArr) {
        c0.K(tArr);
        c0.A(tArr);
        TreeSet treeSet = new TreeSet();
        Collections.addAll(treeSet, tArr);
        return (T) treeSet.toArray()[(treeSet.size() - 1) / 2];
    }

    @SafeVarargs
    public static <T> T D(Comparator<T> comparator, T... tArr) {
        c0.L(tArr, "null/empty items", new Object[0]);
        c0.A(tArr);
        c0.P(comparator, "null comparator", new Object[0]);
        TreeSet treeSet = new TreeSet(comparator);
        Collections.addAll(treeSet, tArr);
        return (T) treeSet.toArray()[(treeSet.size() - 1) / 2];
    }

    @SafeVarargs
    public static <T extends Comparable<? super T>> T E(T... tArr) {
        T t10 = null;
        if (tArr != null) {
            for (T t11 : tArr) {
                if (q(t11, t10, true) < 0) {
                    t10 = t11;
                }
            }
        }
        return t10;
    }

    @SafeVarargs
    public static <T> T F(T... tArr) {
        if (!c.R0(tArr)) {
            return null;
        }
        HashMap map = new HashMap(tArr.length);
        int i10 = 0;
        for (T t10 : tArr) {
            tk.f fVar = (tk.f) map.get(t10);
            if (fVar == null) {
                map.put(t10, new tk.f(1));
            } else {
                fVar.s();
            }
        }
        while (true) {
            T t11 = null;
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue = ((tk.f) entry.getValue()).intValue();
                if (iIntValue != i10) {
                    if (iIntValue > i10) {
                        t11 = (T) entry.getKey();
                        i10 = iIntValue;
                    }
                }
            }
            return t11;
        }
    }

    public static boolean G(Object obj, Object obj2) {
        return !s(obj, obj2);
    }

    @Deprecated
    public static String H(Object obj) {
        return obj == null ? "" : obj.toString();
    }

    @Deprecated
    public static String I(Object obj, String str) {
        return obj == null ? str : obj.toString();
    }

    public static byte a(byte b10) {
        return b10;
    }

    public static char b(char c10) {
        return c10;
    }

    public static double c(double d10) {
        return d10;
    }

    public static float d(float f10) {
        return f10;
    }

    public static int e(int i10) {
        return i10;
    }

    public static long f(long j10) {
        return j10;
    }

    public static <T> T g(T t10) {
        return t10;
    }

    public static short h(short s10) {
        return s10;
    }

    public static boolean i(boolean z10) {
        return z10;
    }

    public static byte j(int i10) throws IllegalArgumentException {
        if (i10 >= -128 && i10 <= 127) {
            return (byte) i10;
        }
        throw new IllegalArgumentException("Supplied value must be a valid byte literal between -128 and 127: [" + i10 + "]");
    }

    public static short k(int i10) throws IllegalArgumentException {
        if (i10 >= -32768 && i10 <= 32767) {
            return (short) i10;
        }
        throw new IllegalArgumentException("Supplied value must be a valid byte literal between -32768 and 32767: [" + i10 + "]");
    }

    public static boolean l(Object... objArr) {
        if (objArr == null) {
            return false;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                return false;
            }
        }
        return true;
    }

    public static boolean m(Object... objArr) {
        if (t(objArr) == null) {
            return false;
        }
        int i10 = 0 << 1;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T n(T t10) {
        if (!(t10 instanceof Cloneable)) {
            return null;
        }
        if (!t10.getClass().isArray()) {
            try {
                return (T) t10.getClass().getMethod("clone", null).invoke(t10, null);
            } catch (IllegalAccessException e10) {
                throw new org.apache.commons.lang3.exception.a("Cannot clone Cloneable type " + t10.getClass().getName(), e10);
            } catch (NoSuchMethodException e11) {
                throw new org.apache.commons.lang3.exception.a("Cloneable type " + t10.getClass().getName() + " has no clone method", e11);
            } catch (InvocationTargetException e12) {
                throw new org.apache.commons.lang3.exception.a("Exception cloning Cloneable type " + t10.getClass().getName(), e12.getCause());
            }
        }
        Class<?> componentType = t10.getClass().getComponentType();
        if (!componentType.isPrimitive()) {
            return (T) ((Object[]) t10).clone();
        }
        int length = Array.getLength(t10);
        T t11 = (T) Array.newInstance(componentType, length);
        while (true) {
            int i10 = length - 1;
            if (length <= 0) {
                return t11;
            }
            Array.set(t11, i10, Array.get(t10, i10));
            length = i10;
        }
    }

    public static <T> T o(T t10) {
        T t11 = (T) n(t10);
        return t11 == null ? t10 : t11;
    }

    public static <T extends Comparable<? super T>> int p(T t10, T t11) {
        return q(t10, t11, false);
    }

    public static <T extends Comparable<? super T>> int q(T t10, T t11, boolean z10) {
        if (t10 == t11) {
            return 0;
        }
        if (t10 == null) {
            return z10 ? 1 : -1;
        }
        if (t11 == null) {
            return z10 ? -1 : 1;
        }
        return t10.compareTo(t11);
    }

    public static <T> T r(T t10, T t11) {
        return t10 != null ? t10 : t11;
    }

    @Deprecated
    public static boolean s(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    @SafeVarargs
    public static <T> T t(T... tArr) {
        if (tArr == null) {
            return null;
        }
        for (T t10 : tArr) {
            if (t10 != null) {
                return t10;
            }
        }
        return null;
    }

    @Deprecated
    public static int u(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Deprecated
    public static int v(Object... objArr) {
        int iU = 1;
        if (objArr != null) {
            for (Object obj : objArr) {
                iU = (iU * 31) + u(obj);
            }
        }
        return iU;
    }

    public static String w(Object obj) {
        if (obj == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        z(sb2, obj);
        return sb2.toString();
    }

    public static void x(Appendable appendable, Object obj) throws IOException {
        c0.P(obj, "Cannot get the toString of a null identity", new Object[0]);
        appendable.append(obj.getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static void y(StringBuffer stringBuffer, Object obj) {
        c0.P(obj, "Cannot get the toString of a null identity", new Object[0]);
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append('@');
        stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static void z(StringBuilder sb2, Object obj) {
        c0.P(obj, "Cannot get the toString of a null identity", new Object[0]);
        sb2.append(obj.getClass().getName());
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}
