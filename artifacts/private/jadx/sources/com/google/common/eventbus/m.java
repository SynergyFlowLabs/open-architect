package com.google.common.eventbus;

import com.google.common.base.b0;
import com.google.common.base.d0;
import com.google.common.base.j0;
import com.google.common.base.v0;
import com.google.common.collect.b8;
import com.google.common.collect.k8;
import com.google.common.collect.l6;
import com.google.common.collect.nb;
import com.google.common.collect.p7;
import com.google.common.collect.x7;
import com.google.common.collect.z5;
import com.google.common.collect.z6;
import com.google.common.reflect.q;
import com.google.common.util.concurrent.d3;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes5.dex */
@e
final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.common.cache.m<Class<?>, l6<Method>> f118548c = com.google.common.cache.d.F().Q().b(new a());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.common.cache.m<Class<?>, z6<Class<?>>> f118549d = com.google.common.cache.d.F().Q().b(new b());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, CopyOnWriteArraySet<j>> f118550a = b8.V();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @r9.m
    private final f f118551b;

    class a extends com.google.common.cache.g<Class<?>, l6<Method>> {
        a() {
        }

        @Override // com.google.common.cache.g
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public l6<Method> d(Class<?> concreteClass) throws Exception {
            return m.e(concreteClass);
        }
    }

    class b extends com.google.common.cache.g<Class<?>, z6<Class<?>>> {
        b() {
        }

        @Override // com.google.common.cache.g
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public z6<Class<?>> d(Class<?> concreteClass) {
            return z6.A(q.S(concreteClass).D().r1());
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f118552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<Class<?>> f118553b;

        c(Method method) {
            this.f118552a = method.getName();
            this.f118553b = Arrays.asList(method.getParameterTypes());
        }

        public boolean equals(@fj.a Object o10) {
            if (o10 instanceof c) {
                c cVar = (c) o10;
                if (this.f118552a.equals(cVar.f118552a) && this.f118553b.equals(cVar.f118553b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return d0.b(this.f118552a, this.f118553b);
        }
    }

    m(f bus) {
        this.f118551b = (f) j0.E(bus);
    }

    private k8<Class<?>, j> b(Object listener) {
        z5 z5VarJ = z5.J();
        nb<Method> it = d(listener.getClass()).iterator();
        while (it.hasNext()) {
            Method next = it.next();
            boolean z10 = true & false;
            z5VarJ.put(next.getParameterTypes()[0], j.c(this.f118551b, listener, next));
        }
        return z5VarJ;
    }

    @com.google.common.annotations.e
    static z6<Class<?>> c(Class<?> concreteClass) {
        try {
            return f118549d.v0(concreteClass);
        } catch (d3 e10) {
            throw v0.q(e10.getCause());
        }
    }

    private static l6<Method> d(Class<?> clazz) {
        try {
            return f118548c.v0(clazz);
        } catch (d3 e10) {
            v0.w(e10.getCause());
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static l6<Method> e(Class<?> clazz) {
        Set setR1 = q.S(clazz).D().r1();
        HashMap mapY = b8.Y();
        Iterator it = setR1.iterator();
        while (it.hasNext()) {
            for (Method method : ((Class) it.next()).getDeclaredMethods()) {
                if (method.isAnnotationPresent(h.class) && !method.isSynthetic()) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    j0.w(parameterTypes.length == 1, "Method %s has @Subscribe annotation but has %s parameters. Subscriber methods must have exactly 1 parameter.", method, parameterTypes.length);
                    j0.z(!parameterTypes[0].isPrimitive(), "@Subscribe method %s's parameter is %s. Subscriber methods cannot accept primitives. Consider changing the parameter to %s.", method, parameterTypes[0].getName(), com.google.common.primitives.q.f(parameterTypes[0]).getSimpleName());
                    c cVar = new c(method);
                    if (!mapY.containsKey(cVar)) {
                        mapY.put(cVar, method);
                    }
                }
            }
        }
        return l6.w(mapY.values());
    }

    Iterator<j> f(Object event) {
        z6<Class<?>> z6VarC = c(event.getClass());
        ArrayList arrayListU = x7.u(z6VarC.size());
        nb<Class<?>> it = z6VarC.iterator();
        while (it.hasNext()) {
            CopyOnWriteArraySet<j> copyOnWriteArraySet = this.f118550a.get(it.next());
            if (copyOnWriteArraySet != null) {
                arrayListU.add(copyOnWriteArraySet.iterator());
            }
        }
        return p7.h(arrayListU.iterator());
    }

    @com.google.common.annotations.e
    Set<j> g(Class<?> eventType) {
        return (Set) b0.a(this.f118550a.get(eventType), z6.G());
    }

    void h(Object listener) {
        for (Map.Entry<Class<?>, Collection<j>> entry : b(listener).l().entrySet()) {
            Class<?> key = entry.getKey();
            Collection<j> value = entry.getValue();
            CopyOnWriteArraySet<j> copyOnWriteArraySet = this.f118550a.get(key);
            if (copyOnWriteArraySet == null) {
                CopyOnWriteArraySet<j> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
                copyOnWriteArraySet = (CopyOnWriteArraySet) b0.a(this.f118550a.putIfAbsent(key, copyOnWriteArraySet2), copyOnWriteArraySet2);
            }
            copyOnWriteArraySet.addAll(value);
        }
    }

    void i(Object listener) {
        for (Map.Entry<Class<?>, Collection<j>> entry : b(listener).l().entrySet()) {
            Class<?> key = entry.getKey();
            Collection<j> value = entry.getValue();
            CopyOnWriteArraySet<j> copyOnWriteArraySet = this.f118550a.get(key);
            if (copyOnWriteArraySet == null || !copyOnWriteArraySet.removeAll(value)) {
                throw new IllegalArgumentException("missing event subscriber for an annotated method. Is " + listener + " registered?");
            }
        }
    }
}
