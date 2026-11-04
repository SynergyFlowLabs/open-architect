package org.apache.commons.lang3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f337227a = "null elements not permitted";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f337228b = "Cannot store %s %s values in %s bits";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f337229c = "%s does not seem to be an Enum type";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f337230d = "EnumClass must be defined.";

    private static <E extends Enum<E>> Class<E> a(Class<E> cls) {
        c0.P(cls, f337230d, new Object[0]);
        c0.v(cls.isEnum(), f337229c, cls);
        return cls;
    }

    private static <E extends Enum<E>> Class<E> b(Class<E> cls) {
        Enum[] enumArr = (Enum[]) a(cls).getEnumConstants();
        c0.v(enumArr.length <= 64, f337228b, Integer.valueOf(enumArr.length), cls.getSimpleName(), 64);
        return cls;
    }

    public static <E extends Enum<E>> long c(Class<E> cls, Iterable<? extends E> iterable) {
        b(cls);
        c0.O(iterable);
        Iterator<? extends E> it = iterable.iterator();
        long jOrdinal = 0;
        while (it.hasNext()) {
            E next = it.next();
            c0.v(next != null, f337227a, new Object[0]);
            jOrdinal |= 1 << next.ordinal();
        }
        return jOrdinal;
    }

    @SafeVarargs
    public static <E extends Enum<E>> long d(Class<E> cls, E... eArr) {
        c0.A(eArr);
        return c(cls, Arrays.asList(eArr));
    }

    public static <E extends Enum<E>> long[] e(Class<E> cls, Iterable<? extends E> iterable) {
        a(cls);
        c0.O(iterable);
        EnumSet<Enum> enumSetNoneOf = EnumSet.noneOf(cls);
        Iterator<? extends E> it = iterable.iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            E next = it.next();
            if (next == null) {
                z10 = false;
            }
            c0.v(z10, f337227a, new Object[0]);
            enumSetNoneOf.add(next);
        }
        long[] jArr = new long[((cls.getEnumConstants().length - 1) / 64) + 1];
        for (Enum r10 : enumSetNoneOf) {
            int iOrdinal = r10.ordinal() / 64;
            jArr[iOrdinal] = jArr[iOrdinal] | (1 << (r10.ordinal() % 64));
        }
        c.i3(jArr);
        return jArr;
    }

    @SafeVarargs
    public static <E extends Enum<E>> long[] f(Class<E> cls, E... eArr) {
        a(cls);
        c0.A(eArr);
        EnumSet<Enum> enumSetNoneOf = EnumSet.noneOf(cls);
        Collections.addAll(enumSetNoneOf, eArr);
        long[] jArr = new long[((cls.getEnumConstants().length - 1) / 64) + 1];
        for (Enum r10 : enumSetNoneOf) {
            int iOrdinal = r10.ordinal() / 64;
            jArr[iOrdinal] = jArr[iOrdinal] | (1 << (r10.ordinal() % 64));
        }
        c.i3(jArr);
        return jArr;
    }

    public static <E extends Enum<E>> E g(Class<E> cls, String str) {
        if (str == null) {
            return null;
        }
        try {
            return (E) Enum.valueOf(cls, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static <E extends Enum<E>> List<E> h(Class<E> cls) {
        return new ArrayList(Arrays.asList(cls.getEnumConstants()));
    }

    public static <E extends Enum<E>> Map<String, E> i(Class<E> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (E e10 : cls.getEnumConstants()) {
            linkedHashMap.put(e10.name(), e10);
        }
        return linkedHashMap;
    }

    public static <E extends Enum<E>> boolean j(Class<E> cls, String str) {
        if (str == null) {
            return false;
        }
        try {
            Enum.valueOf(cls, str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static <E extends Enum<E>> EnumSet<E> k(Class<E> cls, long j10) {
        b(cls).getEnumConstants();
        return l(cls, j10);
    }

    public static <E extends Enum<E>> EnumSet<E> l(Class<E> cls, long... jArr) {
        EnumSet<E> enumSetNoneOf = EnumSet.noneOf(a(cls));
        long[] jArrH = c.H((long[]) c0.O(jArr));
        c.i3(jArrH);
        for (E e10 : cls.getEnumConstants()) {
            int iOrdinal = e10.ordinal() / 64;
            if (iOrdinal < jArrH.length && (jArrH[iOrdinal] & (1 << (e10.ordinal() % 64))) != 0) {
                enumSetNoneOf.add(e10);
            }
        }
        return enumSetNoneOf;
    }
}
