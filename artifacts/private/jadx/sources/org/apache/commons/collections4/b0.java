package org.apache.commons.collections4;

import java.io.PrintStream;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SortedMap f335491a = org.apache.commons.collections4.map.j0.c(new TreeMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f335492b = "    ";

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    static class a<K, V> extends org.apache.commons.collections4.map.e<K, V> {
        a(Map map) {
            super(map);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    static class b<K, V> extends org.apache.commons.collections4.map.h<K, V> {
        b(SortedMap sortedMap) {
            super(sortedMap);
        }
    }

    private b0() {
    }

    public static <K> long A(Map<? super K, ?> map, K k10) {
        Long lY = y(map, k10);
        if (lY == null) {
            return 0L;
        }
        return lY.longValue();
    }

    public static <K> long B(Map<? super K, ?> map, K k10, long j10) {
        Long lY = y(map, k10);
        return lY == null ? j10 : lY.longValue();
    }

    public static <K> Map<?, ?> C(Map<? super K, ?> map, K k10) {
        Object obj;
        if (map == null || (obj = map.get(k10)) == null || !(obj instanceof Map)) {
            return null;
        }
        return (Map) obj;
    }

    public static <K> Map<?, ?> D(Map<? super K, ?> map, K k10, Map<?, ?> map2) {
        Map<?, ?> mapC = C(map, k10);
        return mapC == null ? map2 : mapC;
    }

    public static <K> Number E(Map<? super K, ?> map, K k10) {
        Object obj;
        if (map != null && (obj = map.get(k10)) != null) {
            if (obj instanceof Number) {
                return (Number) obj;
            }
            if (obj instanceof String) {
                try {
                    return NumberFormat.getInstance().parse((String) obj);
                } catch (ParseException unused) {
                }
            }
        }
        return null;
    }

    public static <K> Number F(Map<? super K, ?> map, K k10, Number number) {
        Number numberE = E(map, k10);
        return numberE == null ? number : numberE;
    }

    public static <K, V> V G(Map<? super K, V> map, K k10) {
        if (map != null) {
            return map.get(k10);
        }
        return null;
    }

    public static <K, V> V H(Map<K, V> map, K k10, V v10) {
        V v11;
        return (map == null || (v11 = map.get(k10)) == null) ? v10 : v11;
    }

    public static <K> Short I(Map<? super K, ?> map, K k10) {
        Number numberE = E(map, k10);
        if (numberE == null) {
            return null;
        }
        return numberE instanceof Short ? (Short) numberE : Short.valueOf(numberE.shortValue());
    }

    public static <K> Short J(Map<? super K, ?> map, K k10, Short sh2) {
        Short shI = I(map, k10);
        return shI == null ? sh2 : shI;
    }

    public static <K> short K(Map<? super K, ?> map, K k10) {
        Short shI = I(map, k10);
        if (shI == null) {
            return (short) 0;
        }
        return shI.shortValue();
    }

    public static <K> short L(Map<? super K, ?> map, K k10, short s10) {
        Short shI = I(map, k10);
        return shI == null ? s10 : shI.shortValue();
    }

    public static <K> String M(Map<? super K, ?> map, K k10) {
        Object obj;
        if (map == null || (obj = map.get(k10)) == null) {
            return null;
        }
        return obj.toString();
    }

    public static <K> String N(Map<? super K, ?> map, K k10, String str) {
        String strM = M(map, k10);
        return strM == null ? str : strM;
    }

    public static <K, V> Map<V, K> O(Map<K, V> map) {
        HashMap map2 = new HashMap(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            map2.put(entry.getValue(), entry.getKey());
        }
        return map2;
    }

    public static boolean P(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean Q(Map<?, ?> map) {
        return !P(map);
    }

    public static <K, V> t<K, V> R(Map<K, V> map) {
        if (map != null) {
            return map instanceof t ? (t) map : new a(map);
        }
        throw new NullPointerException("Map must not be null");
    }

    public static <K, V> u<K, V> S(SortedMap<K, V> sortedMap) {
        if (sortedMap != null) {
            return sortedMap instanceof u ? (u) sortedMap : new b(sortedMap);
        }
        throw new NullPointerException("Map must not be null");
    }

    public static <K, V> t<K, V> T(Map<K, V> map, n<? extends V> nVar) {
        return org.apache.commons.collections4.map.r.b(map, nVar);
    }

    public static <K, V> t<K, V> U(Map<K, V> map, w0<? super K, ? extends V> w0Var) {
        return org.apache.commons.collections4.map.r.c(map, w0Var);
    }

    public static <K, V> SortedMap<K, V> V(SortedMap<K, V> sortedMap, n<? extends V> nVar) {
        return org.apache.commons.collections4.map.s.e(sortedMap, nVar);
    }

    public static <K, V> SortedMap<K, V> W(SortedMap<K, V> sortedMap, w0<? super K, ? extends V> w0Var) {
        return org.apache.commons.collections4.map.s.f(sortedMap, w0Var);
    }

    @Deprecated
    public static <K, V> org.apache.commons.collections4.map.w<K, V> X(Map<K, ? super Collection<V>> map) {
        return org.apache.commons.collections4.map.w.f(map);
    }

    @Deprecated
    public static <K, V, C extends Collection<V>> org.apache.commons.collections4.map.w<K, V> Y(Map<K, C> map, Class<C> cls) {
        return org.apache.commons.collections4.map.w.g(map, cls);
    }

    @Deprecated
    public static <K, V, C extends Collection<V>> org.apache.commons.collections4.map.w<K, V> Z(Map<K, C> map, n<C> nVar) {
        return org.apache.commons.collections4.map.w.h(map, nVar);
    }

    public static void a(PrintStream printStream, Object obj, Map<?, ?> map) {
        u0(printStream, obj, map, new ArrayDeque(), true);
    }

    public static <K, V> j0<K, V> a0(Map<K, V> map) {
        return org.apache.commons.collections4.map.u.h(map);
    }

    public static <K, V> Map<K, V> b(Map<K, V> map) {
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public static <K, V> void b0(Map<K, V> map, Iterable<? extends V> iterable, w0<V, K> w0Var) {
        c0(map, iterable, w0Var, x0.p());
    }

    public static <K, V> t<K, V> c(Map<K, V> map) {
        return org.apache.commons.collections4.map.m.b(map);
    }

    public static <K, V, E> void c0(Map<K, V> map, Iterable<? extends E> iterable, w0<E, K> w0Var, w0<E, V> w0Var2) {
        for (E e10 : iterable) {
            map.put(w0Var.a(e10), w0Var2.a(e10));
        }
    }

    public static <K, V> SortedMap<K, V> d(SortedMap<K, V> sortedMap) {
        return org.apache.commons.collections4.map.n.c(sortedMap);
    }

    public static <K, V> void d0(c0<K, V> c0Var, Iterable<? extends V> iterable, w0<V, K> w0Var) {
        e0(c0Var, iterable, w0Var, x0.p());
    }

    public static <K> Boolean e(Map<? super K, ?> map, K k10) {
        Object obj;
        if (map == null || (obj = map.get(k10)) == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            return Boolean.valueOf((String) obj);
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue() != 0 ? Boolean.TRUE : Boolean.FALSE;
        }
        return null;
    }

    public static <K, V, E> void e0(c0<K, V> c0Var, Iterable<? extends E> iterable, w0<E, K> w0Var, w0<E, V> w0Var2) {
        for (E e10 : iterable) {
            c0Var.put(w0Var.a(e10), w0Var2.a(e10));
        }
    }

    public static <K> Boolean f(Map<? super K, ?> map, K k10, Boolean bool) {
        Boolean boolE = e(map, k10);
        return boolE == null ? bool : boolE;
    }

    public static <K, V> t<K, V> f0(Map<K, V> map, l0<? super K> l0Var, l0<? super V> l0Var2) {
        return org.apache.commons.collections4.map.y.d(map, l0Var, l0Var2);
    }

    public static <K> boolean g(Map<? super K, ?> map, K k10) {
        return Boolean.TRUE.equals(e(map, k10));
    }

    public static <K, V> SortedMap<K, V> g0(SortedMap<K, V> sortedMap, l0<? super K> l0Var, l0<? super V> l0Var2) {
        return org.apache.commons.collections4.map.z.g(sortedMap, l0Var, l0Var2);
    }

    public static <K> boolean h(Map<? super K, ?> map, K k10, boolean z10) {
        Boolean boolE = e(map, k10);
        return boolE == null ? z10 : boolE.booleanValue();
    }

    private static void h0(PrintStream printStream, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            printStream.print(f335492b);
        }
    }

    public static <K> Byte i(Map<? super K, ?> map, K k10) {
        Number numberE = E(map, k10);
        if (numberE == null) {
            return null;
        }
        return numberE instanceof Byte ? (Byte) numberE : Byte.valueOf(numberE.byteValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> Map<K, V> i0(Map<K, V> map, Object[] objArr) {
        if (map == 0) {
            throw new NullPointerException("The map must not be null");
        }
        if (objArr != null && objArr.length != 0) {
            int i10 = 0;
            Object obj = objArr[0];
            if (obj instanceof Map.Entry) {
                int length = objArr.length;
                while (i10 < length) {
                    Map.Entry entry = (Map.Entry) objArr[i10];
                    map.put(entry.getKey(), entry.getValue());
                    i10++;
                }
            } else if (obj instanceof x) {
                int length2 = objArr.length;
                while (i10 < length2) {
                    x xVar = (x) objArr[i10];
                    map.put(xVar.getKey(), xVar.getValue());
                    i10++;
                }
            } else if (obj instanceof Object[]) {
                for (int i11 = 0; i11 < objArr.length; i11++) {
                    Object[] objArr2 = (Object[]) objArr[i11];
                    if (objArr2 == null || objArr2.length < 2) {
                        throw new IllegalArgumentException("Invalid array element: " + i11);
                    }
                    map.put(objArr2[0], objArr2[1]);
                }
            } else {
                while (i10 < objArr.length - 1) {
                    int i12 = i10 + 1;
                    Object obj2 = objArr[i10];
                    i10 += 2;
                    map.put(obj2, objArr[i12]);
                }
            }
        }
        return map;
    }

    public static <K> Byte j(Map<? super K, ?> map, K k10, Byte b10) {
        Byte bI = i(map, k10);
        return bI == null ? b10 : bI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K> void j0(Map<? super K, Object> map, K k10, Object obj) throws NullPointerException {
        if (obj == null) {
            obj = "";
        }
        map.put(k10, obj);
    }

    public static <K> byte k(Map<? super K, ?> map, K k10) {
        Byte bI = i(map, k10);
        if (bI == null) {
            return (byte) 0;
        }
        return bI.byteValue();
    }

    public static int k0(Map<?, ?> map) {
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public static <K> byte l(Map<? super K, ?> map, K k10, byte b10) {
        Byte bI = i(map, k10);
        return bI == null ? b10 : bI.byteValue();
    }

    public static <K, V> Map<K, V> l0(Map<K, V> map) {
        return Collections.synchronizedMap(map);
    }

    public static <K> Double m(Map<? super K, ?> map, K k10) {
        Number numberE = E(map, k10);
        if (numberE == null) {
            return null;
        }
        return numberE instanceof Double ? (Double) numberE : Double.valueOf(numberE.doubleValue());
    }

    public static <K, V> SortedMap<K, V> m0(SortedMap<K, V> sortedMap) {
        return Collections.synchronizedSortedMap(sortedMap);
    }

    public static <K> Double n(Map<? super K, ?> map, K k10, Double d10) {
        Double dM = m(map, k10);
        return dM == null ? d10 : dM;
    }

    public static Map<String, Object> n0(ResourceBundle resourceBundle) {
        Enumeration<String> keys = resourceBundle.getKeys();
        HashMap map = new HashMap();
        while (keys.hasMoreElements()) {
            String strNextElement = keys.nextElement();
            map.put(strNextElement, resourceBundle.getObject(strNextElement));
        }
        return map;
    }

    public static <K> double o(Map<? super K, ?> map, K k10) {
        Double dM = m(map, k10);
        if (dM == null) {
            return 0.0d;
        }
        return dM.doubleValue();
    }

    public static <K, V> Properties o0(Map<K, V> map) {
        Properties properties = new Properties();
        if (map != null) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                properties.put(entry.getKey(), entry.getValue());
            }
        }
        return properties;
    }

    public static <K> double p(Map<? super K, ?> map, K k10, double d10) {
        Double dM = m(map, k10);
        return dM == null ? d10 : dM.doubleValue();
    }

    public static <K, V> t<K, V> p0(Map<K, V> map, w0<? super K, ? extends K> w0Var, w0<? super V, ? extends V> w0Var2) {
        return org.apache.commons.collections4.map.e0.h(map, w0Var, w0Var2);
    }

    public static <K> Float q(Map<? super K, ?> map, K k10) {
        Number numberE = E(map, k10);
        if (numberE == null) {
            return null;
        }
        return numberE instanceof Float ? (Float) numberE : Float.valueOf(numberE.floatValue());
    }

    public static <K, V> SortedMap<K, V> q0(SortedMap<K, V> sortedMap, w0<? super K, ? extends K> w0Var, w0<? super V, ? extends V> w0Var2) {
        return org.apache.commons.collections4.map.f0.k(sortedMap, w0Var, w0Var2);
    }

    public static <K> Float r(Map<? super K, ?> map, K k10, Float f10) {
        Float fQ = q(map, k10);
        return fQ == null ? f10 : fQ;
    }

    public static <K, V> Map<K, V> r0(Map<? extends K, ? extends V> map) {
        return org.apache.commons.collections4.map.h0.b(map);
    }

    public static <K> float s(Map<? super K, ?> map, K k10) {
        Float fQ = q(map, k10);
        if (fQ == null) {
            return 0.0f;
        }
        return fQ.floatValue();
    }

    public static <K, V> SortedMap<K, V> s0(SortedMap<K, ? extends V> sortedMap) {
        return org.apache.commons.collections4.map.j0.c(sortedMap);
    }

    public static <K> float t(Map<? super K, ?> map, K k10, float f10) {
        Float fQ = q(map, k10);
        return fQ == null ? f10 : fQ.floatValue();
    }

    public static void t0(PrintStream printStream, Object obj, Map<?, ?> map) {
        u0(printStream, obj, map, new ArrayDeque(), false);
    }

    public static <K> int u(Map<? super K, ?> map, K k10) {
        Integer numW = w(map, k10);
        if (numW == null) {
            return 0;
        }
        return numW.intValue();
    }

    private static void u0(PrintStream printStream, Object obj, Map<?, ?> map, Deque<Map<?, ?>> deque, boolean z10) {
        h0(printStream, deque.size());
        if (map == null) {
            if (obj != null) {
                printStream.print(obj);
                printStream.print(" = ");
            }
            printStream.println(AbstractJsonLexerKt.NULL);
            return;
        }
        if (obj != null) {
            printStream.print(obj);
            printStream.println(" = ");
        }
        h0(printStream, deque.size());
        printStream.println("{");
        deque.addLast(map);
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (!(value instanceof Map) || deque.contains(value)) {
                h0(printStream, deque.size());
                printStream.print(key);
                printStream.print(" = ");
                int iX = v.x(deque, m0.h(value));
                if (iX == -1) {
                    printStream.print(value);
                } else if (deque.size() - 1 == iX) {
                    printStream.print("(this Map)");
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("(ancestor[");
                    sb2.append(((deque.size() - 1) - iX) - 1);
                    sb2.append("] Map)");
                    printStream.print(sb2.toString());
                }
                if (!z10 || value == null) {
                    printStream.println();
                } else {
                    printStream.print(' ');
                    printStream.println(value.getClass().getName());
                }
            } else {
                if (key == null) {
                    key = AbstractJsonLexerKt.NULL;
                }
                u0(printStream, key, (Map) value, deque, z10);
            }
        }
        deque.removeLast();
        h0(printStream, deque.size());
        printStream.println(z10 ? "} " + map.getClass().getName() : "}");
    }

    public static <K> int v(Map<? super K, ?> map, K k10, int i10) {
        Integer numW = w(map, k10);
        return numW == null ? i10 : numW.intValue();
    }

    public static <K> Integer w(Map<? super K, ?> map, K k10) {
        Number numberE = E(map, k10);
        if (numberE == null) {
            return null;
        }
        return numberE instanceof Integer ? (Integer) numberE : Integer.valueOf(numberE.intValue());
    }

    public static <K> Integer x(Map<? super K, ?> map, K k10, Integer num) {
        Integer numW = w(map, k10);
        return numW == null ? num : numW;
    }

    public static <K> Long y(Map<? super K, ?> map, K k10) {
        Number numberE = E(map, k10);
        if (numberE == null) {
            return null;
        }
        return numberE instanceof Long ? (Long) numberE : Long.valueOf(numberE.longValue());
    }

    public static <K> Long z(Map<? super K, ?> map, K k10, Long l10) {
        Long lY = y(map, k10);
        return lY == null ? l10 : lY;
    }
}
