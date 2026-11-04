package com.google.firebase.components;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
class z implements m8.d, m8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private final Map<Class<?>, ConcurrentHashMap<m8.b<Object>, Executor>> f120825a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private Queue<m8.a<?>> f120826b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f120827c;

    z(Executor executor) {
        this.f120827c = executor;
    }

    private synchronized Set<Map.Entry<m8.b<Object>, Executor>> g(m8.a<?> aVar) {
        ConcurrentHashMap<m8.b<Object>, Executor> concurrentHashMap;
        try {
            concurrentHashMap = this.f120825a.get(aVar.b());
        } catch (Throwable th2) {
            throw th2;
        }
        return concurrentHashMap == null ? Collections.EMPTY_SET : concurrentHashMap.entrySet();
    }

    @Override // m8.d
    public synchronized <T> void a(Class<T> cls, m8.b<? super T> bVar) {
        try {
            i0.b(cls);
            i0.b(bVar);
            if (this.f120825a.containsKey(cls)) {
                ConcurrentHashMap<m8.b<Object>, Executor> concurrentHashMap = this.f120825a.get(cls);
                concurrentHashMap.remove(bVar);
                if (concurrentHashMap.isEmpty()) {
                    this.f120825a.remove(cls);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // m8.d
    public synchronized <T> void b(Class<T> cls, Executor executor, m8.b<? super T> bVar) {
        try {
            i0.b(cls);
            i0.b(bVar);
            i0.b(executor);
            if (!this.f120825a.containsKey(cls)) {
                this.f120825a.put(cls, new ConcurrentHashMap<>());
            }
            this.f120825a.get(cls).put(bVar, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // m8.c
    public void c(final m8.a<?> aVar) {
        i0.b(aVar);
        synchronized (this) {
            try {
                Queue<m8.a<?>> queue = this.f120826b;
                if (queue != null) {
                    queue.add(aVar);
                    return;
                }
                for (final Map.Entry<m8.b<Object>, Executor> entry : g(aVar)) {
                    entry.getValue().execute(new Runnable() { // from class: com.google.firebase.components.y
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((m8.b) entry.getKey()).a(aVar);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m8.d
    public <T> void d(Class<T> cls, m8.b<? super T> bVar) {
        b(cls, this.f120827c, bVar);
    }

    void f() {
        Queue<m8.a<?>> queue;
        synchronized (this) {
            try {
                queue = this.f120826b;
                if (queue != null) {
                    this.f120826b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (queue != null) {
            Iterator<m8.a<?>> it = queue.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
        }
    }
}
