package org.apache.commons.collections4;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes14.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f336409a = org.apache.commons.collections4.iterators.l.f335830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f336410b = org.apache.commons.collections4.iterators.m.f335834a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i0 f336411c = org.apache.commons.collections4.iterators.o.f335839a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f336412d = org.apache.commons.collections4.iterators.n.f335838a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k0 f336413e = org.apache.commons.collections4.iterators.p.f335841a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f336414f = "[";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f336415g = "]";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f336416h = ", ";

    private w() {
    }

    public static <E> p0<E> A() {
        return org.apache.commons.collections4.iterators.l.c();
    }

    public static <E> q0<E> B() {
        return org.apache.commons.collections4.iterators.m.c();
    }

    public static <K, V> a0<K, V> C() {
        return org.apache.commons.collections4.iterators.n.b();
    }

    public static <E> i0<E> D() {
        return org.apache.commons.collections4.iterators.o.b();
    }

    public static <K, V> k0<K, V> E() {
        return org.apache.commons.collections4.iterators.p.b();
    }

    public static <E> Iterator<E> F(Iterator<? extends E> it, l0<? super E> l0Var) {
        if (it == null) {
            throw new NullPointerException("Iterator must not be null");
        }
        if (l0Var != null) {
            return new org.apache.commons.collections4.iterators.s(it, l0Var);
        }
        throw new NullPointerException("Predicate must not be null");
    }

    public static <E> ListIterator<E> G(ListIterator<? extends E> listIterator, l0<? super E> l0Var) {
        if (listIterator == null) {
            throw new NullPointerException("ListIterator must not be null");
        }
        if (l0Var != null) {
            return new org.apache.commons.collections4.iterators.t(listIterator, l0Var);
        }
        throw new NullPointerException("Predicate must not be null");
    }

    public static <E> E H(Iterator<E> it, l0<? super E> l0Var) {
        if (l0Var == null) {
            throw new NullPointerException("Predicate must not be null");
        }
        if (it != null) {
            while (it.hasNext()) {
                E next = it.next();
                if (l0Var.a(next)) {
                    return next;
                }
            }
        }
        return null;
    }

    public static <E> E I(Iterator<E> it) {
        return (E) L(it, 0);
    }

    public static <E> void J(Iterator<E> it, h<? super E> hVar) {
        if (hVar == null) {
            throw new NullPointerException("Closure must not be null");
        }
        if (it != null) {
            while (it.hasNext()) {
                hVar.a(it.next());
            }
        }
    }

    public static <E> E K(Iterator<E> it, h<? super E> hVar) {
        if (hVar == null) {
            throw new NullPointerException("Closure must not be null.");
        }
        if (it != null) {
            while (it.hasNext()) {
                E next = it.next();
                if (!it.hasNext()) {
                    return next;
                }
                hVar.a(next);
            }
        }
        return null;
    }

    public static <E> E L(Iterator<E> it, int i10) {
        j.g(i10);
        while (it.hasNext()) {
            i10--;
            if (i10 == -1) {
                return it.next();
            }
            it.next();
        }
        throw new IndexOutOfBoundsException("Entry does not exist: " + i10);
    }

    public static Iterator<?> M(Object obj) {
        Iterator<?> it;
        if (obj == null) {
            return A();
        }
        if (obj instanceof Iterator) {
            return (Iterator) obj;
        }
        if (obj instanceof Iterable) {
            return ((Iterable) obj).iterator();
        }
        if (obj instanceof Object[]) {
            return new org.apache.commons.collections4.iterators.c0((Object[]) obj);
        }
        if (obj instanceof Enumeration) {
            return new org.apache.commons.collections4.iterators.r((Enumeration) obj);
        }
        if (obj instanceof Map) {
            return ((Map) obj).values().iterator();
        }
        if (obj instanceof NodeList) {
            return new org.apache.commons.collections4.iterators.b0((NodeList) obj);
        }
        if (obj instanceof Node) {
            return new org.apache.commons.collections4.iterators.b0((Node) obj);
        }
        if (obj instanceof Dictionary) {
            return new org.apache.commons.collections4.iterators.r(((Dictionary) obj).elements());
        }
        if (obj.getClass().isArray()) {
            return new org.apache.commons.collections4.iterators.h(obj);
        }
        try {
            Method method = obj.getClass().getMethod("iterator", null);
            if (Iterator.class.isAssignableFrom(method.getReturnType()) && (it = (Iterator) method.invoke(obj, null)) != null) {
                return it;
            }
        } catch (IllegalAccessException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
        return Y(obj);
    }

    public static <E> int N(Iterator<E> it, l0<? super E> l0Var) {
        if (l0Var == null) {
            throw new NullPointerException("Predicate must not be null");
        }
        if (it != null) {
            int i10 = 0;
            while (it.hasNext()) {
                if (l0Var.a(it.next())) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public static boolean O(Iterator<?> it) {
        return it == null || !it.hasNext();
    }

    public static <E> p0<E> P(Collection<? extends E> collection) {
        if (collection != null) {
            return new org.apache.commons.collections4.iterators.z(collection);
        }
        throw new NullPointerException("Collection must not be null");
    }

    public static <E> q0<E> Q(List<E> list) {
        if (list != null) {
            return new org.apache.commons.collections4.iterators.a0(list);
        }
        throw new NullPointerException("List must not be null");
    }

    public static <E> boolean R(Iterator<E> it, l0<? super E> l0Var) {
        if (l0Var == null) {
            throw new NullPointerException("Predicate must not be null");
        }
        if (it != null) {
            while (it.hasNext()) {
                if (!l0Var.a(it.next())) {
                    int i10 = 3 ^ 0;
                    return false;
                }
            }
        }
        return true;
    }

    public static <E> boolean S(Iterator<E> it, l0<? super E> l0Var) {
        return N(it, l0Var) != -1;
    }

    public static org.apache.commons.collections4.iterators.b0 T(Node node) {
        if (node != null) {
            return new org.apache.commons.collections4.iterators.b0(node);
        }
        throw new NullPointerException("Node must not be null");
    }

    public static org.apache.commons.collections4.iterators.b0 U(NodeList nodeList) {
        if (nodeList != null) {
            return new org.apache.commons.collections4.iterators.b0(nodeList);
        }
        throw new NullPointerException("NodeList must not be null");
    }

    public static <E> Iterator<E> V(E e10, w0<? super E, ? extends E> w0Var) {
        return new org.apache.commons.collections4.iterators.e0(e10, w0Var);
    }

    public static <E> Iterator<E> W(Iterator<? extends E> it) {
        return org.apache.commons.collections4.iterators.f0.d(it);
    }

    public static <E> Iterator<E> X(Iterator<? extends E> it) {
        return org.apache.commons.collections4.iterators.h0.c(it);
    }

    public static <E> p0<E> Y(E e10) {
        return new org.apache.commons.collections4.iterators.j0(e10);
    }

    public static <E> ListIterator<E> Z(E e10) {
        return new org.apache.commons.collections4.iterators.k0(e10);
    }

    public static <E> p0<E> a(Object obj) {
        return new org.apache.commons.collections4.iterators.h(obj);
    }

    public static int a0(Iterator<?> it) {
        int i10 = 0;
        if (it != null) {
            while (it.hasNext()) {
                it.next();
                i10++;
            }
        }
        return i10;
    }

    public static <E> p0<E> b(Object obj, int i10) {
        return new org.apache.commons.collections4.iterators.h(obj, i10);
    }

    public static <E> org.apache.commons.collections4.iterators.l0<E> b0(Iterator<E> it, long j10) {
        return new org.apache.commons.collections4.iterators.l0<>(it, j10);
    }

    public static <E> p0<E> c(Object obj, int i10, int i11) {
        return new org.apache.commons.collections4.iterators.h(obj, i10, i11);
    }

    public static Object[] c0(Iterator<?> it) {
        if (it != null) {
            return f0(it, 100).toArray();
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public static <E> p0<E> d(E... eArr) {
        return new org.apache.commons.collections4.iterators.c0(eArr);
    }

    public static <E> E[] d0(Iterator<? extends E> it, Class<E> cls) {
        if (it == null) {
            throw new NullPointerException("Iterator must not be null");
        }
        if (cls == null) {
            throw new NullPointerException("Array class must not be null");
        }
        List listF0 = f0(it, 100);
        return (E[]) listF0.toArray((Object[]) Array.newInstance((Class<?>) cls, listF0.size()));
    }

    public static <E> p0<E> e(E[] eArr, int i10) {
        return new org.apache.commons.collections4.iterators.c0(eArr, i10);
    }

    public static <E> List<E> e0(Iterator<? extends E> it) {
        return f0(it, 10);
    }

    public static <E> p0<E> f(E[] eArr, int i10, int i11) {
        return new org.apache.commons.collections4.iterators.c0(eArr, i10, i11);
    }

    public static <E> List<E> f0(Iterator<? extends E> it, int i10) {
        if (it == null) {
            throw new NullPointerException("Iterator must not be null");
        }
        if (i10 < 1) {
            throw new IllegalArgumentException("Estimated size must be greater than 0");
        }
        ArrayList arrayList = new ArrayList(i10);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static <E> q0<E> g(Object obj) {
        return new org.apache.commons.collections4.iterators.i(obj);
    }

    public static <E> ListIterator<E> g0(Iterator<? extends E> it) {
        if (it != null) {
            return new org.apache.commons.collections4.iterators.y(it);
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public static <E> q0<E> h(Object obj, int i10) {
        return new org.apache.commons.collections4.iterators.i(obj, i10);
    }

    public static <E> String h0(Iterator<E> it) {
        return j0(it, x0.r(), f336416h, f336414f, f336415g);
    }

    public static <E> q0<E> i(Object obj, int i10, int i11) {
        return new org.apache.commons.collections4.iterators.i(obj, i10, i11);
    }

    public static <E> String i0(Iterator<E> it, w0<? super E, String> w0Var) {
        return j0(it, w0Var, f336416h, f336414f, f336415g);
    }

    public static <E> q0<E> j(E... eArr) {
        return new org.apache.commons.collections4.iterators.d0(eArr);
    }

    public static <E> String j0(Iterator<E> it, w0<? super E, String> w0Var, String str, String str2, String str3) {
        if (w0Var == null) {
            throw new NullPointerException("transformer may not be null");
        }
        if (str == null) {
            throw new NullPointerException("delimiter may not be null");
        }
        if (str2 == null) {
            throw new NullPointerException("prefix may not be null");
        }
        if (str3 == null) {
            throw new NullPointerException("suffix may not be null");
        }
        StringBuilder sb2 = new StringBuilder(str2);
        if (it != null) {
            while (it.hasNext()) {
                sb2.append(w0Var.a(it.next()));
                sb2.append(str);
            }
            if (sb2.length() > str2.length()) {
                sb2.setLength(sb2.length() - str.length());
            }
        }
        sb2.append(str3);
        return sb2.toString();
    }

    public static <E> q0<E> k(E[] eArr, int i10) {
        return new org.apache.commons.collections4.iterators.d0(eArr, i10);
    }

    public static <I, O> Iterator<O> k0(Iterator<? extends I> it, w0<? super I, ? extends O> w0Var) {
        if (it == null) {
            throw new NullPointerException("Iterator must not be null");
        }
        if (w0Var != null) {
            return new org.apache.commons.collections4.iterators.m0(it, w0Var);
        }
        throw new NullPointerException("Transformer must not be null");
    }

    public static <E> q0<E> l(E[] eArr, int i10, int i11) {
        return new org.apache.commons.collections4.iterators.d0(eArr, i10, i11);
    }

    public static <E> Iterator<E> l0(Iterator<E> it) {
        return org.apache.commons.collections4.iterators.o0.b(it);
    }

    public static <E> Enumeration<E> m(Iterator<? extends E> it) {
        if (it != null) {
            return new org.apache.commons.collections4.iterators.v(it);
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public static <E> ListIterator<E> m0(ListIterator<E> listIterator) {
        return org.apache.commons.collections4.iterators.p0.b(listIterator);
    }

    public static <E> Iterable<E> n(Iterator<? extends E> it) {
        if (it != null) {
            return new org.apache.commons.collections4.iterators.w(it, false);
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public static <K, V> a0<K, V> n0(a0<K, V> a0Var) {
        return org.apache.commons.collections4.iterators.q0.b(a0Var);
    }

    public static <E> Iterator<E> o(Enumeration<? extends E> enumeration) {
        if (enumeration != null) {
            return new org.apache.commons.collections4.iterators.r(enumeration);
        }
        throw new NullPointerException("Enumeration must not be null");
    }

    public static <E> org.apache.commons.collections4.iterators.s0<E> o0(Iterator<? extends E> it, Iterator<? extends E> it2) {
        return new org.apache.commons.collections4.iterators.s0<>(it, it2);
    }

    public static <E> Iterator<E> p(Enumeration<? extends E> enumeration, Collection<? super E> collection) {
        if (enumeration == null) {
            throw new NullPointerException("Enumeration must not be null");
        }
        if (collection != null) {
            return new org.apache.commons.collections4.iterators.r(enumeration, collection);
        }
        throw new NullPointerException("Collection must not be null");
    }

    public static <E> org.apache.commons.collections4.iterators.s0<E> p0(Iterator<? extends E> it, Iterator<? extends E> it2, Iterator<? extends E> it3) {
        return new org.apache.commons.collections4.iterators.s0<>(it, it2, it3);
    }

    public static <E> Iterable<E> q(Iterator<? extends E> it) {
        if (it != null) {
            return new org.apache.commons.collections4.iterators.w(it, true);
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public static <E> org.apache.commons.collections4.iterators.s0<E> q0(Iterator<? extends E>... itArr) {
        return new org.apache.commons.collections4.iterators.s0<>(itArr);
    }

    public static <E> org.apache.commons.collections4.iterators.j<E> r(Iterator<? extends E> it, long j10) {
        return s(it, 0L, j10);
    }

    public static <E> org.apache.commons.collections4.iterators.j<E> s(Iterator<? extends E> it, long j10, long j11) {
        return new org.apache.commons.collections4.iterators.j<>(it, j10, j11);
    }

    public static <E> Iterator<E> t(Collection<Iterator<? extends E>> collection) {
        return new org.apache.commons.collections4.iterators.u(collection);
    }

    public static <E> Iterator<E> u(Iterator<? extends E> it, Iterator<? extends E> it2) {
        return new org.apache.commons.collections4.iterators.u(it, it2);
    }

    public static <E> Iterator<E> v(Iterator<? extends E>... itArr) {
        return new org.apache.commons.collections4.iterators.u(itArr);
    }

    public static <E> Iterator<E> w(Comparator<? super E> comparator, Collection<Iterator<? extends E>> collection) {
        if (comparator == null) {
            comparator = k.f335897a;
        }
        return new org.apache.commons.collections4.iterators.k(comparator, collection);
    }

    public static <E> Iterator<E> x(Comparator<? super E> comparator, Iterator<? extends E> it, Iterator<? extends E> it2) {
        if (comparator == null) {
            comparator = k.f335897a;
        }
        return new org.apache.commons.collections4.iterators.k(comparator, it, it2);
    }

    public static <E> Iterator<E> y(Comparator<? super E> comparator, Iterator<? extends E>... itArr) {
        if (comparator == null) {
            comparator = k.f335897a;
        }
        return new org.apache.commons.collections4.iterators.k(comparator, itArr);
    }

    public static <E> boolean z(Iterator<E> it, Object obj) {
        return S(it, org.apache.commons.collections4.functors.n.c(obj));
    }
}
