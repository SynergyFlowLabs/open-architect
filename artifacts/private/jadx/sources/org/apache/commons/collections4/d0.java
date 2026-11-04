package org.apache.commons.collections4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f335648a = org.apache.commons.collections4.multimap.h.d(new org.apache.commons.collections4.multimap.e(0, 0));

    private d0() {
    }

    public static <K, V> g0<K, V> a(g0<K, V> g0Var) {
        return g0Var == null ? f335648a : g0Var;
    }

    public static <K, V> g0<K, V> b() {
        return f335648a;
    }

    public static <K, V> Collection<V> c(g0<K, V> g0Var, K k10) {
        if (g0Var != null) {
            return g0Var.get(k10);
        }
        return null;
    }

    public static <K, V> c<V> d(g0<K, V> g0Var, K k10) {
        if (g0Var == null) {
            return null;
        }
        Collection<V> collection = g0Var.get(k10);
        return collection instanceof c ? (c) collection : new org.apache.commons.collections4.bag.f(collection);
    }

    public static <K, V> List<V> e(g0<K, V> g0Var, K k10) {
        if (g0Var == null) {
            return null;
        }
        Collection<V> collection = g0Var.get(k10);
        return collection instanceof List ? (List) collection : new ArrayList(collection);
    }

    public static <K, V> Set<V> f(g0<K, V> g0Var, K k10) {
        if (g0Var == null) {
            return null;
        }
        Collection<V> collection = g0Var.get(k10);
        return collection instanceof Set ? (Set) collection : new HashSet(collection);
    }

    public static boolean g(g0<?, ?> g0Var) {
        return g0Var == null || g0Var.isEmpty();
    }

    public static <K, V> z<K, V> h() {
        return new org.apache.commons.collections4.multimap.e();
    }

    public static <K, V> s0<K, V> i() {
        return new org.apache.commons.collections4.multimap.f();
    }

    public static <K, V> g0<K, V> j(g0<K, V> g0Var, w0<? super K, ? extends K> w0Var, w0<? super V, ? extends V> w0Var2) {
        return org.apache.commons.collections4.multimap.g.g(g0Var, w0Var, w0Var2);
    }

    public static <K, V> g0<K, V> k(g0<? extends K, ? extends V> g0Var) {
        return org.apache.commons.collections4.multimap.h.d(g0Var);
    }
}
