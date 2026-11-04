package com.google.common.util.concurrent;

import com.google.common.collect.a9;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a9<List<Class<?>>> f120209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a9<Constructor<?>> f120210b;

    @com.google.common.annotations.e
    interface a {
        void b(Class<? extends Exception> exceptionClass);
    }

    @com.google.common.annotations.e
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f120211a = a();

        enum a implements a {
            INSTANCE;


            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final Set<WeakReference<Class<? extends Exception>>> f120213b = new CopyOnWriteArraySet();

            @Override // com.google.common.util.concurrent.l1.a
            public void b(Class<? extends Exception> exceptionClass) {
                Iterator<WeakReference<Class<? extends Exception>>> it = f120213b.iterator();
                while (it.hasNext()) {
                    if (exceptionClass.equals(it.next().get())) {
                        return;
                    }
                }
                l1.e(exceptionClass);
                Set<WeakReference<Class<? extends Exception>>> set = f120213b;
                if (set.size() > 1000) {
                    set.clear();
                }
                set.add(new WeakReference<>(exceptionClass));
            }
        }

        b() {
        }

        static a a() {
            return l1.n();
        }
    }

    static {
        a9<List<Class<?>>> a9VarE = a9.z().D(new com.google.common.base.t() { // from class: com.google.common.util.concurrent.i1
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return Boolean.valueOf(((List) obj).contains(String.class));
            }
        }).e(a9.z().D(new com.google.common.base.t() { // from class: com.google.common.util.concurrent.j1
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return Boolean.valueOf(((List) obj).contains(Throwable.class));
            }
        })).E();
        f120209a = a9VarE;
        f120210b = a9VarE.D(new com.google.common.base.t() { // from class: com.google.common.util.concurrent.k1
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return Arrays.asList(((Constructor) obj).getParameterTypes());
            }
        });
    }

    private l1() {
    }

    private static a d() {
        return b.f120211a;
    }

    @com.google.common.annotations.e
    static void e(Class<? extends Exception> exceptionClass) {
        com.google.common.base.j0.u(j(exceptionClass), "Futures.getChecked exception type (%s) must not be a RuntimeException", exceptionClass);
        com.google.common.base.j0.u(i(exceptionClass), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", exceptionClass);
    }

    @d2
    @z7.a
    @com.google.common.annotations.e
    static <V, X extends Exception> V f(a validator, Future<V> future, Class<X> exceptionClass) throws Exception {
        validator.b(exceptionClass);
        try {
            return future.get();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            throw l(exceptionClass, e10);
        } catch (ExecutionException e11) {
            o(e11.getCause(), exceptionClass);
            throw new AssertionError();
        }
    }

    @d2
    @z7.a
    static <V, X extends Exception> V g(Future<V> future, Class<X> cls) throws Exception {
        return (V) f(d(), future, cls);
    }

    @d2
    @z7.a
    static <V, X extends Exception> V h(Future<V> future, Class<X> exceptionClass, long timeout, TimeUnit unit) throws Exception {
        d().b(exceptionClass);
        try {
            return future.get(timeout, unit);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            throw l(exceptionClass, e10);
        } catch (ExecutionException e11) {
            o(e11.getCause(), exceptionClass);
            throw new AssertionError();
        } catch (TimeoutException e12) {
            throw l(exceptionClass, e12);
        }
    }

    private static boolean i(Class<? extends Exception> exceptionClass) {
        try {
            l(exceptionClass, new Exception());
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @com.google.common.annotations.e
    static boolean j(Class<? extends Exception> type) {
        return !RuntimeException.class.isAssignableFrom(type);
    }

    @fj.a
    private static <X> X k(Constructor<X> constructor, Throwable cause) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            Class<?> cls = parameterTypes[i10];
            if (cls.equals(String.class)) {
                objArr[i10] = cause.toString();
            } else {
                if (!cls.equals(Throwable.class)) {
                    return null;
                }
                objArr[i10] = cause;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static <X extends Exception> X l(Class<X> exceptionClass, Throwable cause) {
        Iterator it = m(Arrays.asList(exceptionClass.getConstructors())).iterator();
        while (it.hasNext()) {
            X x10 = (X) k((Constructor) it.next(), cause);
            if (x10 != null) {
                if (x10.getCause() == null) {
                    x10.initCause(cause);
                }
                return x10;
            }
        }
        throw new IllegalArgumentException("No appropriate constructor for exception of type " + exceptionClass + " in response to chained exception", cause);
    }

    private static <X extends Exception> List<Constructor<X>> m(List<Constructor<X>> list) {
        return (List<Constructor<X>>) f120210b.F(list);
    }

    @com.google.common.annotations.e
    static a n() {
        return b.a.INSTANCE;
    }

    private static <X extends Exception> void o(Throwable cause, Class<X> exceptionClass) throws Exception {
        if (cause instanceof Error) {
            throw new p0((Error) cause);
        }
        if (!(cause instanceof RuntimeException)) {
            throw l(exceptionClass, cause);
        }
        throw new d3(cause);
    }
}
