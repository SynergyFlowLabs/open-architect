package com.google.firebase.components;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
class c0<T> implements z8.b<Set<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Set<T> f120750b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Set<z8.b<T>> f120749a = Collections.newSetFromMap(new ConcurrentHashMap());

    c0(Collection<z8.b<T>> collection) {
        this.f120749a.addAll(collection);
    }

    static c0<?> b(Collection<z8.b<?>> collection) {
        return new c0<>((Set) collection);
    }

    private synchronized void d() {
        try {
            Iterator<z8.b<T>> it = this.f120749a.iterator();
            while (it.hasNext()) {
                this.f120750b.add(it.next().get());
            }
            this.f120749a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized void a(z8.b<T> bVar) {
        try {
            if (this.f120750b == null) {
                this.f120749a.add(bVar);
            } else {
                this.f120750b.add(bVar.get());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // z8.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.f120750b == null) {
            synchronized (this) {
                try {
                    if (this.f120750b == null) {
                        this.f120750b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Collections.unmodifiableSet(this.f120750b);
    }
}
