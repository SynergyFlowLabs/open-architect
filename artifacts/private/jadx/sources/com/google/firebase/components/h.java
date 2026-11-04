package com.google.firebase.components;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public interface h {
    default <T> T a(Class<T> cls) {
        return (T) j(j0.b(cls));
    }

    default <T> z8.b<Set<T>> c(Class<T> cls) {
        return i(j0.b(cls));
    }

    default <T> Set<T> d(Class<T> cls) {
        return h(j0.b(cls));
    }

    default <T> z8.b<T> e(Class<T> cls) {
        return g(j0.b(cls));
    }

    <T> z8.a<T> f(j0<T> j0Var);

    <T> z8.b<T> g(j0<T> j0Var);

    default <T> Set<T> h(j0<T> j0Var) {
        return i(j0Var).get();
    }

    <T> z8.b<Set<T>> i(j0<T> j0Var);

    default <T> T j(j0<T> j0Var) {
        z8.b<T> bVarG = g(j0Var);
        if (bVarG == null) {
            return null;
        }
        return bVarG.get();
    }

    default <T> z8.a<T> k(Class<T> cls) {
        return f(j0.b(cls));
    }
}
