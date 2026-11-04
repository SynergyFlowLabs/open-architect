package com.google.firebase.components;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
final class l0 implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<j0<?>> f120783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<j0<?>> f120784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<j0<?>> f120785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<j0<?>> f120786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<j0<?>> f120787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<Class<?>> f120788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h f120789g;

    private static class a implements m8.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<Class<?>> f120790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m8.c f120791b;

        public a(Set<Class<?>> set, m8.c cVar) {
            this.f120790a = set;
            this.f120791b = cVar;
        }

        @Override // m8.c
        public void c(m8.a<?> aVar) {
            if (!this.f120790a.contains(aVar.b())) {
                throw new x(String.format("Attempting to publish an undeclared event %s.", aVar));
            }
            this.f120791b.c(aVar);
        }
    }

    l0(g<?> gVar, h hVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (v vVar : gVar.j()) {
            if (vVar.f()) {
                if (vVar.h()) {
                    hashSet4.add(vVar.d());
                } else {
                    hashSet.add(vVar.d());
                }
            } else if (vVar.e()) {
                hashSet3.add(vVar.d());
            } else if (vVar.h()) {
                hashSet5.add(vVar.d());
            } else {
                hashSet2.add(vVar.d());
            }
        }
        if (!gVar.n().isEmpty()) {
            hashSet.add(j0.b(m8.c.class));
        }
        this.f120783a = Collections.unmodifiableSet(hashSet);
        this.f120784b = Collections.unmodifiableSet(hashSet2);
        this.f120785c = Collections.unmodifiableSet(hashSet3);
        this.f120786d = Collections.unmodifiableSet(hashSet4);
        this.f120787e = Collections.unmodifiableSet(hashSet5);
        this.f120788f = gVar.n();
        this.f120789g = hVar;
    }

    @Override // com.google.firebase.components.h
    public <T> T a(Class<T> cls) {
        if (!this.f120783a.contains(j0.b(cls))) {
            throw new x(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t10 = (T) this.f120789g.a(cls);
        return !cls.equals(m8.c.class) ? t10 : (T) new a(this.f120788f, (m8.c) t10);
    }

    @Override // com.google.firebase.components.h
    public <T> z8.b<Set<T>> c(Class<T> cls) {
        return i(j0.b(cls));
    }

    @Override // com.google.firebase.components.h
    public <T> z8.b<T> e(Class<T> cls) {
        return g(j0.b(cls));
    }

    @Override // com.google.firebase.components.h
    public <T> z8.a<T> f(j0<T> j0Var) {
        if (this.f120785c.contains(j0Var)) {
            return this.f120789g.f(j0Var);
        }
        throw new x(String.format("Attempting to request an undeclared dependency Deferred<%s>.", j0Var));
    }

    @Override // com.google.firebase.components.h
    public <T> z8.b<T> g(j0<T> j0Var) {
        if (this.f120784b.contains(j0Var)) {
            return this.f120789g.g(j0Var);
        }
        throw new x(String.format("Attempting to request an undeclared dependency Provider<%s>.", j0Var));
    }

    @Override // com.google.firebase.components.h
    public <T> Set<T> h(j0<T> j0Var) {
        if (this.f120786d.contains(j0Var)) {
            return this.f120789g.h(j0Var);
        }
        throw new x(String.format("Attempting to request an undeclared dependency Set<%s>.", j0Var));
    }

    @Override // com.google.firebase.components.h
    public <T> z8.b<Set<T>> i(j0<T> j0Var) {
        if (this.f120787e.contains(j0Var)) {
            return this.f120789g.i(j0Var);
        }
        throw new x(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", j0Var));
    }

    @Override // com.google.firebase.components.h
    public <T> T j(j0<T> j0Var) {
        if (this.f120783a.contains(j0Var)) {
            return (T) this.f120789g.j(j0Var);
        }
        throw new x(String.format("Attempting to request an undeclared dependency %s.", j0Var));
    }

    @Override // com.google.firebase.components.h
    public <T> z8.a<T> k(Class<T> cls) {
        return f(j0.b(cls));
    }
}
